package com.shim.secretbygdoors.datagen;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.shim.secretbygdoors.SBYGBlocks;
import com.shim.secretbygdoors.SecretBYGDoors;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SBYGLootTables extends LootTableProvider {
    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> subProviders = ImmutableList.of(Pair.of(BlockLoot::new, LootParameterSets.BLOCK));

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        final Set<ResourceLocation> modLootTableIds =
                LootTables.all().stream().filter(lootTable -> lootTable.getNamespace().equals(SecretBYGDoors.MODID))
                        .collect(Collectors.toSet());

        for (ResourceLocation id : Sets.difference(modLootTableIds, map.keySet()))
            validationtracker.reportProblem("Missing loot table: " + id);

        map.forEach((id, lootTable) ->
                LootTableManager.validate(validationtracker, id, lootTable));
    }

    public SBYGLootTables(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return subProviders;
    }

    public static class BlockLoot extends BlockLootTables {
        private final Map<ResourceLocation, LootTable.Builder> map = Maps.newHashMap();

        protected void addTables() {
            for (RegistryObject<? extends Block> block : SBYGBlocks.DOOR_LOOT_TABLE)
                this.add(block.get(), BlockLootTables.createDoorTable(block.get()));
            for (RegistryObject<? extends Block> block : SBYGBlocks.TRAPDOOR_LOOT_TABLE)
                this.dropSelf(block.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return SBYGBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.get()).collect(Collectors.toList());
        }
    }
}