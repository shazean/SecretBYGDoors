package com.shim.secretbygdoors.datagen;

import com.shim.secretbygdoors.SecretBYGDoors;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SecretBYGDoors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        generator.addProvider(event.includeServer(), new SBYGRecipes(generator));
        generator.addProvider(event.includeServer(), new LootTables(generator));
        SBYGBlockTags blockTags = new SBYGBlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new SBYGItemTags(generator, blockTags, event.getExistingFileHelper()));

        generator.addProvider(event.includeClient(), new BlockStates(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ItemModels(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new LangProvider(generator, "en_us"));
    }
}