package com.shim.secretbygdoors.datagen;

import com.shim.secretbygdoors.SecretBYGDoors;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = SecretBYGDoors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new SBYGRecipes(generator));
            generator.addProvider(new LootTables(generator));
            SBYGBlockTags blockTags = new SBYGBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new SBYGItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new BlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new ItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new LangProvider(generator, "en_us"));

        }
    }
}