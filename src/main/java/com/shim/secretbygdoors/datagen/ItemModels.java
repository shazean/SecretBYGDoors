package com.shim.secretbygdoors.datagen;

import com.shim.secretbygdoors.SBYGBlocks;
import com.shim.secretbygdoors.SecretBYGDoors;
import corgiaoc.byg.BYG;
import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SecretBYGDoors.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        doorModel(SBYGBlocks.SECRET_ASPEN_PLANK_DOOR.get(), BYGBlocks.ASPEN_PLANKS);
        doorModel(SBYGBlocks.SECRET_BAOBAB_PLANK_DOOR.get(), BYGBlocks.BAOBAB_PLANKS);
        doorModel(SBYGBlocks.SECRET_BLUE_ENCHANTED_PLANK_DOOR.get(), BYGBlocks.BLUE_ENCHANTED_PLANKS);
        doorModel(SBYGBlocks.SECRET_CHERRY_PLANK_DOOR.get(), BYGBlocks.CHERRY_PLANKS);
        doorModel(SBYGBlocks.SECRET_CIKA_PLANK_DOOR.get(), BYGBlocks.CIKA_PLANKS);
        doorModel(SBYGBlocks.SECRET_CYPRESS_PLANK_DOOR.get(), BYGBlocks.CYPRESS_PLANKS);
        doorModel(SBYGBlocks.SECRET_EBONY_PLANK_DOOR.get(), BYGBlocks.EBONY_PLANKS);
        doorModel(SBYGBlocks.SECRET_FIR_PLANK_DOOR.get(), BYGBlocks.FIR_PLANKS);
        doorModel(SBYGBlocks.SECRET_GREEN_ENCHANTED_PLANK_DOOR.get(), BYGBlocks.GREEN_ENCHANTED_PLANKS);
        doorModel(SBYGBlocks.SECRET_HOLLY_PLANK_DOOR.get(), BYGBlocks.HOLLY_PLANKS);
        doorModel(SBYGBlocks.SECRET_JACARANDA_PLANK_DOOR.get(), BYGBlocks.JACARANDA_PLANKS);
        doorModel(SBYGBlocks.SECRET_MAHOGANY_PLANK_DOOR.get(), BYGBlocks.MAHOGANY_PLANKS);
        doorModel(SBYGBlocks.SECRET_MANGROVE_PLANK_DOOR.get(), BYGBlocks.MANGROVE_PLANKS);
        doorModel(SBYGBlocks.SECRET_MAPLE_PLANK_DOOR.get(), BYGBlocks.MAPLE_PLANKS);
        doorModel(SBYGBlocks.SECRET_PINE_PLANK_DOOR.get(), BYGBlocks.PINE_PLANKS);
        doorModel(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_PLANK_DOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_PLANKS);
        doorModel(SBYGBlocks.SECRET_REDWOOD_PLANK_DOOR.get(), BYGBlocks.REDWOOD_PLANKS);
        doorModel(SBYGBlocks.SECRET_SKYRIS_PLANK_DOOR.get(), BYGBlocks.SKYRIS_PLANKS);
        doorModel(SBYGBlocks.SECRET_WILLOW_PLANK_DOOR.get(), BYGBlocks.WILLOW_PLANKS);
        doorModel(SBYGBlocks.SECRET_WITCH_HAZEL_PLANK_DOOR.get(), BYGBlocks.WITCH_HAZEL_PLANKS);
        doorModel(SBYGBlocks.SECRET_ZELKOVA_PLANK_DOOR.get(), BYGBlocks.ZELKOVA_PLANKS);
        doorModel(SBYGBlocks.SECRET_SYTHIAN_PLANK_DOOR.get(), BYGBlocks.SYTHIAN_PLANKS);
        doorModel(SBYGBlocks.SECRET_EMBUR_PLANK_DOOR.get(), BYGBlocks.EMBUR_PLANKS);
        doorModel(SBYGBlocks.SECRET_PALM_PLANK_DOOR.get(), BYGBlocks.PALM_PLANKS);
        doorModel(SBYGBlocks.SECRET_LAMENT_PLANK_DOOR.get(), BYGBlocks.LAMENT_PLANKS);
        doorModel(SBYGBlocks.SECRET_BULBIS_PLANK_DOOR.get(), BYGBlocks.BULBIS_PLANKS);
        doorModel(SBYGBlocks.SECRET_NIGHTSHADE_PLANK_DOOR.get(), BYGBlocks.NIGHTSHADE_PLANKS);
        doorModel(SBYGBlocks.SECRET_ETHER_PLANK_DOOR.get(), BYGBlocks.ETHER_PLANKS);
        doorModel(SBYGBlocks.SECRET_IMPARIUS_PLANK_DOOR.get(), BYGBlocks.IMPARIUS_PLANKS);

        doorModel(SBYGBlocks.SECRET_ASPEN_LOG_DOOR.get(), BYGBlocks.ASPEN_LOG);
        doorModel(SBYGBlocks.SECRET_BAOBAB_LOG_DOOR.get(), BYGBlocks.BAOBAB_LOG);
        doorModel(SBYGBlocks.SECRET_BLUE_ENCHANTED_LOG_DOOR.get(), BYGBlocks.BLUE_ENCHANTED_LOG);
        doorModel(SBYGBlocks.SECRET_CHERRY_LOG_DOOR.get(), BYGBlocks.CHERRY_LOG);
        doorModel(SBYGBlocks.SECRET_CIKA_LOG_DOOR.get(), BYGBlocks.CIKA_LOG);
        doorModel(SBYGBlocks.SECRET_CYPRESS_LOG_DOOR.get(), BYGBlocks.CYPRESS_LOG);
        doorModel(SBYGBlocks.SECRET_EBONY_LOG_DOOR.get(), BYGBlocks.EBONY_LOG);
        doorModel(SBYGBlocks.SECRET_FIR_LOG_DOOR.get(), BYGBlocks.FIR_LOG);
        doorModel(SBYGBlocks.SECRET_GREEN_ENCHANTED_LOG_DOOR.get(), BYGBlocks.GREEN_ENCHANTED_LOG);
        doorModel(SBYGBlocks.SECRET_HOLLY_LOG_DOOR.get(), BYGBlocks.HOLLY_LOG);
        doorModel(SBYGBlocks.SECRET_JACARANDA_LOG_DOOR.get(), BYGBlocks.JACARANDA_LOG);
        doorModel(SBYGBlocks.SECRET_MAHOGANY_LOG_DOOR.get(), BYGBlocks.MAHOGANY_LOG);
        doorModel(SBYGBlocks.SECRET_MANGROVE_LOG_DOOR.get(), BYGBlocks.MANGROVE_LOG);
        doorModel(SBYGBlocks.SECRET_MAPLE_LOG_DOOR.get(), BYGBlocks.MAPLE_LOG);
        doorModel(SBYGBlocks.SECRET_PINE_LOG_DOOR.get(), BYGBlocks.PINE_LOG);
        doorModel(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_LOG);
        doorModel(SBYGBlocks.SECRET_REDWOOD_LOG_DOOR.get(), BYGBlocks.REDWOOD_LOG);
        doorModel(SBYGBlocks.SECRET_SKYRIS_LOG_DOOR.get(), BYGBlocks.SKYRIS_LOG);
        doorModel(SBYGBlocks.SECRET_WILLOW_LOG_DOOR.get(), BYGBlocks.WILLOW_LOG);
        doorModel(SBYGBlocks.SECRET_WITCH_HAZEL_LOG_DOOR.get(), BYGBlocks.WITCH_HAZEL_LOG);
        doorModel(SBYGBlocks.SECRET_ZELKOVA_LOG_DOOR.get(), BYGBlocks.ZELKOVA_LOG);
        doorModel(SBYGBlocks.SECRET_SYTHIAN_STEM_DOOR.get(), BYGBlocks.SYTHIAN_STEM);
        doorModel(SBYGBlocks.SECRET_EMBUR_PEDU_DOOR.get(), BYGBlocks.EMBUR_PEDU);
        doorModel(SBYGBlocks.SECRET_PALM_LOG_DOOR.get(), BYGBlocks.PALM_LOG);
        doorModel(SBYGBlocks.SECRET_LAMENT_LOG_DOOR.get(), BYGBlocks.LAMENT_LOG);
        doorModel(SBYGBlocks.SECRET_BULBIS_STEM_DOOR.get(), BYGBlocks.BULBIS_STEM);
        doorModel(SBYGBlocks.SECRET_NIGHTSHADE_LOG_DOOR.get(), BYGBlocks.NIGHTSHADE_LOG);
        doorModel(SBYGBlocks.SECRET_ETHER_LOG_DOOR.get(), BYGBlocks.ETHER_LOG);
        doorModel(SBYGBlocks.SECRET_IMPARIUS_STEM_DOOR.get(), BYGBlocks.IMPARIUS_STEM);
        doorModel(SBYGBlocks.SECRET_PALO_VERDE_LOG_DOOR.get(), BYGBlocks.PALO_VERDE_LOG);

        doorModel(SBYGBlocks.SECRET_STRIPPED_ASPEN_LOG_DOOR.get(), BYGBlocks.STRIPPED_ASPEN_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_BAOBAB_LOG_DOOR.get(), BYGBlocks.STRIPPED_BAOBAB_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_BLUE_ENCHANTED_LOG_DOOR.get(), BYGBlocks.STRIPPED_BLUE_ENCHANTED_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), BYGBlocks.STRIPPED_CHERRY_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_CIKA_LOG_DOOR.get(), BYGBlocks.STRIPPED_CIKA_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_CYPRESS_LOG_DOOR.get(), BYGBlocks.STRIPPED_CYPRESS_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_EBONY_LOG_DOOR.get(), BYGBlocks.STRIPPED_EBONY_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get(), BYGBlocks.STRIPPED_FIR_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_GREEN_ENCHANTED_LOG_DOOR.get(), BYGBlocks.STRIPPED_GREEN_ENCHANTED_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_HOLLY_LOG_DOOR.get(), BYGBlocks.STRIPPED_HOLLY_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get(), BYGBlocks.STRIPPED_JACARANDA_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get(), BYGBlocks.STRIPPED_MAHOGANY_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get(), BYGBlocks.STRIPPED_MANGROVE_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_MAPLE_LOG_DOOR.get(), BYGBlocks.STRIPPED_MAPLE_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_PINE_LOG_DOOR.get(), BYGBlocks.STRIPPED_PINE_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), BYGBlocks.STRIPPED_RAINBOW_EUCALYPTUS_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get(), BYGBlocks.STRIPPED_REDWOOD_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_SKYRIS_LOG_DOOR.get(), BYGBlocks.STRIPPED_SKYRIS_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get(), BYGBlocks.STRIPPED_WILLOW_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_WITCH_HAZEL_LOG_DOOR.get(), BYGBlocks.STRIPPED_WITCH_HAZEL_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_ZELKOVA_LOG_DOOR.get(), BYGBlocks.STRIPPED_ZELKOVA_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_SYTHIAN_STEM_DOOR.get(), BYGBlocks.STRIPPED_SYTHIAN_STEM);
        doorModel(SBYGBlocks.SECRET_STRIPPED_EMBUR_PEDU_DOOR.get(), BYGBlocks.STRIPPED_EMBUR_PEDU);
        doorModel(SBYGBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get(), BYGBlocks.STRIPPED_PALM_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_LAMENT_LOG_DOOR.get(), BYGBlocks.STRIPPED_LAMENT_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_BULBIS_STEM_DOOR.get(), BYGBlocks.STRIPPED_BULBIS_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_NIGHTSHADE_LOG_DOOR.get(), BYGBlocks.STRIPPED_NIGHTSHADE_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_ETHER_LOG_DOOR.get(), BYGBlocks.STRIPPED_ETHER_LOG);
        doorModel(SBYGBlocks.SECRET_STRIPPED_PALO_VERDE_LOG_DOOR.get(), BYGBlocks.STRIPPED_PALO_VERDE_LOG);

        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ASPEN_LOG_DOOR.get(), BYGBlocks.STRIPPED_ASPEN_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BAOBAB_LOG_DOOR.get(), BYGBlocks.STRIPPED_BAOBAB_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR.get(), BYGBlocks.STRIPPED_BLUE_ENCHANTED_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), BYGBlocks.STRIPPED_CHERRY_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CIKA_LOG_DOOR.get(), BYGBlocks.STRIPPED_CIKA_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CYPRESS_LOG_DOOR.get(), BYGBlocks.STRIPPED_CYPRESS_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_EBONY_LOG_DOOR.get(), BYGBlocks.STRIPPED_EBONY_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get(), BYGBlocks.STRIPPED_FIR_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR.get(), BYGBlocks.STRIPPED_GREEN_ENCHANTED_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_HOLLY_LOG_DOOR.get(), BYGBlocks.STRIPPED_HOLLY_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get(), BYGBlocks.STRIPPED_JACARANDA_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), BYGBlocks.STRIPPED_MAHOGANY_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get(), BYGBlocks.STRIPPED_MANGROVE_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR.get(), BYGBlocks.STRIPPED_MAPLE_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR.get(), BYGBlocks.STRIPPED_PINE_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), BYGBlocks.STRIPPED_RAINBOW_EUCALYPTUS_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get(), BYGBlocks.REDWOOD_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_SKYRIS_LOG_DOOR.get(), BYGBlocks.STRIPPED_SKYRIS_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get(), BYGBlocks.STRIPPED_WILLOW_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WITCH_HAZEL_LOG_DOOR.get(), BYGBlocks.STRIPPED_WITCH_HAZEL_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ZELKOVA_LOG_DOOR.get(), BYGBlocks.STRIPPED_ZELKOVA_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_SYTHIAN_STEM_DOOR.get(), BYGBlocks.STRIPPED_SYTHIAN_STEM);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_EMBUR_PEDU_DOOR.get(), BYGBlocks.STRIPPED_EMBUR_PEDU);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get(), BYGBlocks.STRIPPED_PALM_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_LAMENT_LOG_DOOR.get(), BYGBlocks.STRIPPED_LAMENT_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BULBIS_STEM_DOOR.get(), BYGBlocks.STRIPPED_BULBIS_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_NIGHTSHADE_LOG_DOOR.get(), BYGBlocks.STRIPPED_NIGHTSHADE_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ETHER_LOG_DOOR.get(), BYGBlocks.STRIPPED_ETHER_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PALO_VERDE_LOG_DOOR.get(), BYGBlocks.PALO_VERDE_LOG);

        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_ASPEN_LOG_DOOR.get(), BYGBlocks.ASPEN_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_BAOBAB_LOG_DOOR.get(), BYGBlocks.BAOBAB_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR.get(), BYGBlocks.BLUE_ENCHANTED_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), BYGBlocks.CHERRY_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_CIKA_LOG_DOOR.get(), BYGBlocks.CIKA_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_CYPRESS_LOG_DOOR.get(), BYGBlocks.CYPRESS_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_EBONY_LOG_DOOR.get(), BYGBlocks.EBONY_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get(), BYGBlocks.FIR_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR.get(), BYGBlocks.GREEN_ENCHANTED_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_HOLLY_LOG_DOOR.get(), BYGBlocks.HOLLY_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get(), BYGBlocks.JACARANDA_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), BYGBlocks.MAHOGANY_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get(), BYGBlocks.MANGROVE_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_MAPLE_LOG_DOOR.get(), BYGBlocks.MAPLE_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_PINE_LOG_DOOR.get(), BYGBlocks.PINE_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get(), BYGBlocks.REDWOOD_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_SKYRIS_LOG_DOOR.get(), BYGBlocks.SKYRIS_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get(), BYGBlocks.WILLOW_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_WITCH_HAZEL_LOG_DOOR.get(), BYGBlocks.WITCH_HAZEL_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_ZELKOVA_LOG_DOOR.get(), BYGBlocks.ZELKOVA_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_SYTHIAN_STEM_DOOR.get(), BYGBlocks.SYTHIAN_STEM);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_EMBUR_PEDU_DOOR.get(), BYGBlocks.EMBUR_PEDU);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get(), BYGBlocks.PALM_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_LAMENT_LOG_DOOR.get(), BYGBlocks.LAMENT_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_BULBIS_STEM_DOOR.get(), BYGBlocks.BULBIS_STEM);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_NIGHTSHADE_LOG_DOOR.get(), BYGBlocks.NIGHTSHADE_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_ETHER_LOG_DOOR.get(), BYGBlocks.ETHER_LOG);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_IMPARIUS_STEM_DOOR.get(), BYGBlocks.IMPARIUS_STEM);
        horizontalDoorModel(SBYGBlocks.SECRET_HORIZONTAL_PALO_VERDE_LOG_DOOR.get(), BYGBlocks.PALO_VERDE_LOG);


        doorModel(SBYGBlocks.SECRET_ASPEN_BOOKSHELF_DOOR.get(), BYGBlocks.ASPEN_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_BAOBAB_BOOKSHELF_DOOR.get(), BYGBlocks.BAOBAB_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_BLUE_ENCHANTED_BOOKSHELF_DOOR.get(), BYGBlocks.BLUE_ENCHANTED_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_CHERRY_BOOKSHELF_DOOR.get(), BYGBlocks.CHERRY_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_CIKA_BOOKSHELF_DOOR.get(), BYGBlocks.CIKA_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_CYPRESS_BOOKSHELF_DOOR.get(), BYGBlocks.CYPRESS_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_EBONY_BOOKSHELF_DOOR.get(), BYGBlocks.EBONY_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_FIR_BOOKSHELF_DOOR.get(), BYGBlocks.FIR_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_GREEN_ENCHANTED_BOOKSHELF_DOOR.get(), BYGBlocks.GREEN_ENCHANTED_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_HOLLY_BOOKSHELF_DOOR.get(), BYGBlocks.HOLLY_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_JACARANDA_BOOKSHELF_DOOR.get(), BYGBlocks.JACARANDA_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_MAHOGANY_BOOKSHELF_DOOR.get(), BYGBlocks.MAHOGANY_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_MANGROVE_BOOKSHELF_DOOR.get(), BYGBlocks.MANGROVE_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_MAPLE_BOOKSHELF_DOOR.get(), BYGBlocks.MAPLE_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_PINE_BOOKSHELF_DOOR.get(), BYGBlocks.PINE_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_REDWOOD_BOOKSHELF_DOOR.get(), BYGBlocks.REDWOOD_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_SKYRIS_BOOKSHELF_DOOR.get(), BYGBlocks.SKYRIS_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_WILLOW_BOOKSHELF_DOOR.get(), BYGBlocks.WILLOW_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_WITCH_HAZEL_BOOKSHELF_DOOR.get(), BYGBlocks.WITCH_HAZEL_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_ZELKOVA_BOOKSHELF_DOOR.get(), BYGBlocks.ZELKOVA_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_SYTHIAN_BOOKSHELF_DOOR.get(), BYGBlocks.SYTHIAN_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_EMBUR_BOOKSHELF_DOOR.get(), BYGBlocks.EMBUR_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_PALM_BOOKSHELF_DOOR.get(), BYGBlocks.PALM_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_LAMENT_BOOKSHELF_DOOR.get(), BYGBlocks.LAMENT_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_BULBIS_BOOKSHELF_DOOR.get(), BYGBlocks.BULBIS_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_NIGHTSHADE_BOOKSHELF_DOOR.get(), BYGBlocks.NIGHTSHADE_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_ETHER_BOOKSHELF_DOOR.get(), BYGBlocks.ETHER_BOOKSHELF);
        doorModel(SBYGBlocks.SECRET_IMPARIUS_BOOKSHELF_DOOR.get(), BYGBlocks.IMPARIUS_BOOKSHELF);

        doorModel(SBYGBlocks.SECRET_WHITE_SANDSTONE_DOOR.get(), BYGBlocks.WHITE_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get(), BYGBlocks.WHITE_CUT_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get(), "white_sandstone_top");
        doorModel(SBYGBlocks.SECRET_BLUE_SANDSTONE_DOOR.get(), BYGBlocks.BLUE_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_CUT_BLUE_SANDSTONE_DOOR.get(), BYGBlocks.BLUE_CUT_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_SMOOTH_BLUE_SANDSTONE_DOOR.get(), "blue_sandstone_top");
        doorModel(SBYGBlocks.SECRET_BLACK_SANDSTONE_DOOR.get(), BYGBlocks.BLACK_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get(), BYGBlocks.BLACK_CUT_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get(), "black_sandstone_top");
        doorModel(SBYGBlocks.SECRET_PURPLE_SANDSTONE_DOOR.get(), BYGBlocks.PURPLE_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_CUT_PURPLE_SANDSTONE_DOOR.get(), BYGBlocks.PURPLE_CUT_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_SMOOTH_PURPLE_SANDSTONE_DOOR.get(), "purple_sandstone_top");
        doorModel(SBYGBlocks.SECRET_PINK_SANDSTONE_DOOR.get(), BYGBlocks.PINK_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_CUT_PINK_SANDSTONE_DOOR.get(), BYGBlocks.PINK_CUT_SANDSTONE);
        doorModel(SBYGBlocks.SECRET_SMOOTH_PINK_SANDSTONE_DOOR.get(), "pink_sandstone_top");

        doorModel(SBYGBlocks.SECRET_BLUE_NETHERRACK_DOOR.get(), BYGBlocks.BLUE_NETHERRACK);
        doorModel(SBYGBlocks.SECRET_BLUE_NETHER_BRICK_DOOR.get(), BYGBlocks.BLUE_NETHERRACK_BRICKS);
        doorModel(SBYGBlocks.SECRET_YELLOW_NETHER_BRICK_DOOR.get(), BYGBlocks.YELLOW_NETHER_BRICKS);

        doorModel(SBYGBlocks.SECRET_MUD_BRICKS_DOOR.get(), BYGBlocks.MUD_BRICKS);
        doorModel(SBYGBlocks.SECRET_BRIMSTONE_DOOR.get(), BYGBlocks.BRIMSTONE);
        doorModel(SBYGBlocks.SECRET_PURPUR_STONE_DOOR.get(), BYGBlocks.PURPUR_STONE);
        doorModel(SBYGBlocks.SECRET_ETHER_STONE_DOOR.get(), BYGBlocks.ETHER_STONE);
        doorModel(SBYGBlocks.SECRET_COBBLED_ETHER_DOOR.get(), BYGBlocks.COBBLED_ETHER_STONE);
        doorModel(SBYGBlocks.SECRET_DACITE_DOOR.get(), BYGBlocks.DACITE);
        doorModel(SBYGBlocks.SECRET_DACITE_BRICKS_DOOR.get(), BYGBlocks.DACITE_BRICKS);
        doorModel(SBYGBlocks.SECRET_DACITE_COBBLESTONE_DOOR.get(), BYGBlocks.DACITE_COBBLESTONE);
        doorModel(SBYGBlocks.SECRET_DACITE_TILES_DOOR.get(), BYGBlocks.DACITE_TILE);
        doorModel(SBYGBlocks.SECRET_RED_ROCK_DOOR.get(), BYGBlocks.RED_ROCK);
        doorModel(SBYGBlocks.SECRET_RED_ROCK_BRICKS_DOOR.get(), BYGBlocks.RED_ROCK_BRICKS);
        doorModel(SBYGBlocks.SECRET_ROCKY_STONE_DOOR.get(), BYGBlocks.ROCKY_STONE);
        doorModel(SBYGBlocks.SECRET_TRAVERTINE_DOOR.get(), BYGBlocks.TRAVERTINE);
        doorModel(SBYGBlocks.SECRET_POLISHED_TRAVERTINE_DOOR.get(), BYGBlocks.POLISHED_TRAVERTINE);
        doorModel(SBYGBlocks.SECRET_SCORIA_STONE_DOOR.get(), BYGBlocks.SCORIA_STONE);
        doorModel(SBYGBlocks.SECRET_SCORIA_COBBLESTONE_DOOR.get(), BYGBlocks.SCORIA_COBBLESTONE);
        doorModel(SBYGBlocks.SECRET_SCORIA_STONE_BRICKS_DOOR.get(), "scoria_stone_bricks");
        doorModel(SBYGBlocks.SECRET_SOAPSTONE_DOOR.get(), BYGBlocks.SOAPSTONE);
        doorModel(SBYGBlocks.SECRET_POLISHED_SOAPSTONE_DOOR.get(), "soapstone_polished");
        doorModel(SBYGBlocks.SECRET_SOAPSTONE_BRICKS_DOOR.get(), BYGBlocks.SOAPSTONE_BRICKS);
        doorModel(SBYGBlocks.SECRET_SOAPSTONE_TILES_DOOR.get(), BYGBlocks.SOAPSTONE_TILE);
        doorModel(SBYGBlocks.SECRET_MAGMATIC_STONE_DOOR.get(), BYGBlocks.MAGMATIC_STONE);
        doorModel(SBYGBlocks.SECRET_THERIUM_DOOR.get(), BYGBlocks.THERIUM_BLOCK);
        doorModel(SBYGBlocks.SECRET_CRYPTIC_STONE_DOOR.get(), BYGBlocks.CRYPTIC_STONE);


        trapdoorModel(SBYGBlocks.SECRET_ASPEN_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BAOBAB_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BLUE_ENCHANTED_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CIKA_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CYPRESS_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_EBONY_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_FIR_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_GREEN_ENCHANTED_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_HOLLY_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MAPLE_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PINE_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SKYRIS_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_WITCH_HAZEL_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_ZELKOVA_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SYTHIAN_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_EMBUR_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PALM_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_LAMENT_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BULBIS_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_NIGHTSHADE_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_ETHER_PLANK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_IMPARIUS_PLANK_TRAPDOOR.get());

        trapdoorModel(SBYGBlocks.SECRET_ASPEN_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BAOBAB_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BLUE_ENCHANTED_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CIKA_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CYPRESS_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_EBONY_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_GREEN_ENCHANTED_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_HOLLY_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MAPLE_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PINE_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SKYRIS_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_WITCH_HAZEL_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_ZELKOVA_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SYTHIAN_STEM_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_EMBUR_PEDU_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_LAMENT_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BULBIS_STEM_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_NIGHTSHADE_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_ETHER_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_IMPARIUS_STEM_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PALO_VERDE_LOG_TRAPDOOR.get());

        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_ASPEN_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_BAOBAB_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_BLUE_ENCHANTED_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_CIKA_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_CYPRESS_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_EBONY_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_GREEN_ENCHANTED_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_HOLLY_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_PINE_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_SKYRIS_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_WITCH_HAZEL_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_ZELKOVA_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_SYTHIAN_STEM_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_EMBUR_PEDU_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_LAMENT_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_BULBIS_STEM_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_NIGHTSHADE_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_ETHER_LOG_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_STRIPPED_PALO_VERDE_LOG_TRAPDOOR.get());

        trapdoorModel(SBYGBlocks.SECRET_ASPEN_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BAOBAB_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CHERRY_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CIKA_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CYPRESS_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_EBONY_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_FIR_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_HOLLY_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_JACARANDA_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MAHOGANY_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MANGROVE_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MAPLE_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PINE_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_REDWOOD_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SKYRIS_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_WILLOW_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_WITCH_HAZEL_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_ZELKOVA_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SYTHIAN_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_EMBUR_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PALM_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_LAMENT_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BULBIS_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_NIGHTSHADE_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_ETHER_BOOKSHELF_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_IMPARIUS_BOOKSHELF_TRAPDOOR.get());

        trapdoorModel(SBYGBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BLUE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CUT_BLUE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SMOOTH_BLUE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PURPLE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CUT_PURPLE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SMOOTH_PURPLE_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PINK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CUT_PINK_SANDSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SMOOTH_PINK_SANDSTONE_TRAPDOOR.get());

        trapdoorModel(SBYGBlocks.SECRET_BLUE_NETHERRACK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BLUE_NETHER_BRICK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_YELLOW_NETHER_BRICK_TRAPDOOR.get());

        trapdoorModel(SBYGBlocks.SECRET_MUD_BRICKS_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_BRIMSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_PURPUR_STONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_ETHER_STONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_COBBLED_ETHER_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_DACITE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_DACITE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_DACITE_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_DACITE_TILES_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_RED_ROCK_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_RED_ROCK_BRICKS_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_ROCKY_STONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_TRAVERTINE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_POLISHED_TRAVERTINE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SCORIA_STONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SCORIA_COBBLESTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SCORIA_STONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SOAPSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_POLISHED_SOAPSTONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SOAPSTONE_BRICKS_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_SOAPSTONE_TILES_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_MAGMATIC_STONE_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_THERIUM_TRAPDOOR.get());
        trapdoorModel(SBYGBlocks.SECRET_CRYPTIC_STONE_TRAPDOOR.get());


    }

    public void generatedModel(Block item) {
        singleTexture(item.getRegistryName().getPath(), new ResourceLocation("item/generated"), "layer0", new ResourceLocation(SecretBYGDoors.MODID, "item/" + item.getRegistryName().getPath()));
    }

    public void doorModel(Block item, String texture) {
        doorModel(item, new ResourceLocation(BYG.MOD_ID, "block/" + texture));
    }

    public void doorModel(Block item, ResourceLocation texture) {
        singleTexture(item.getRegistryName().getPath(), modLoc("item/door_item"), "texture", texture);
    }

    public void doorModel(Block item, Block texture) {
        singleTexture(item.getRegistryName().getPath(), modLoc("item/door_item"), "texture", new ResourceLocation(texture.getRegistryName().getNamespace(), "block/" + texture.getRegistryName().getPath()));
    }

    public void horizontalDoorModel(Block item, Block texture) {
        singleTexture(item.getRegistryName().getPath(), modLoc("item/horizontal_door_item"), "texture", new ResourceLocation(texture.getRegistryName().getNamespace(), "block/" + texture.getRegistryName().getPath()));
    }

    public void trapdoorModel(Block item) {
        withExistingParent(item.getRegistryName().getPath(), modLoc("block/" + item.getRegistryName().getPath() + "_bottom"));
    }

}