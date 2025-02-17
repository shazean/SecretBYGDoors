package com.shim.secretbygdoors.datagen;

import com.shim.secretbygdoors.SBYGBlocks;
import com.shim.secretbygdoors.SecretBYGDoors;
import com.shim.secretdoors.SecretDoors;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import potionstudios.byg.BYG;

public class BlockStates extends BlockStateProvider {


    public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, SecretBYGDoors.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


        secretDoorBlock(SBYGBlocks.SECRET_ASPEN_PLANK_DOOR.get(), "aspen/planks");
        secretDoorBlock(SBYGBlocks.SECRET_BAOBAB_PLANK_DOOR.get(), "baobab/planks");
        secretDoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_PLANK_DOOR.get(), "blue_enchanted/planks");
        secretDoorBlock(SBYGBlocks.SECRET_CHERRY_PLANK_DOOR.get(), "cherry/planks");
        secretDoorBlock(SBYGBlocks.SECRET_CIKA_PLANK_DOOR.get(), "cika/planks");
        secretDoorBlock(SBYGBlocks.SECRET_CYPRESS_PLANK_DOOR.get(), "cypress/planks");
        secretDoorBlock(SBYGBlocks.SECRET_EBONY_PLANK_DOOR.get(), "ebony/planks");
        secretDoorBlock(SBYGBlocks.SECRET_FIR_PLANK_DOOR.get(), "fir/planks");
        secretDoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_PLANK_DOOR.get(), "green_enchanted/planks");
        secretDoorBlock(SBYGBlocks.SECRET_HOLLY_PLANK_DOOR.get(), "holly/planks");
        secretDoorBlock(SBYGBlocks.SECRET_JACARANDA_PLANK_DOOR.get(), "jacaranda/planks");
        secretDoorBlock(SBYGBlocks.SECRET_MAHOGANY_PLANK_DOOR.get(), "mahogany/planks");
        secretDoorBlock(SBYGBlocks.SECRET_WHITE_MANGROVE_PLANK_DOOR.get(), "white_mangrove/planks");
        secretDoorBlock(SBYGBlocks.SECRET_MAPLE_PLANK_DOOR.get(), "maple/planks");
        secretDoorBlock(SBYGBlocks.SECRET_PINE_PLANK_DOOR.get(), "pine/planks");
        secretDoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_PLANK_DOOR.get(), "rainbow_eucalyptus/planks");
        secretDoorBlock(SBYGBlocks.SECRET_REDWOOD_PLANK_DOOR.get(), "redwood/planks");
        secretDoorBlock(SBYGBlocks.SECRET_SKYRIS_PLANK_DOOR.get(), "skyris/planks");
        secretDoorBlock(SBYGBlocks.SECRET_WILLOW_PLANK_DOOR.get(), "willow/planks");
        secretDoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_PLANK_DOOR.get(), "witch_hazel/planks");
        secretDoorBlock(SBYGBlocks.SECRET_ZELKOVA_PLANK_DOOR.get(), "zelkova/planks");
        secretDoorBlock(SBYGBlocks.SECRET_SYTHIAN_PLANK_DOOR.get(), "sythian/planks");
        secretDoorBlock(SBYGBlocks.SECRET_EMBUR_PLANK_DOOR.get(), "embur/planks");
        secretDoorBlock(SBYGBlocks.SECRET_PALM_PLANK_DOOR.get(), "palm/planks");
        secretDoorBlock(SBYGBlocks.SECRET_LAMENT_PLANK_DOOR.get(), "lament/planks");
        secretDoorBlock(SBYGBlocks.SECRET_BULBIS_PLANK_DOOR.get(), "bulbis/planks");
        secretDoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_PLANK_DOOR.get(), "nightshade/planks");
        secretDoorBlock(SBYGBlocks.SECRET_ETHER_PLANK_DOOR.get(), "ether/planks");
        secretDoorBlock(SBYGBlocks.SECRET_IMPARIUS_PLANK_DOOR.get(), "imparius/planks");

        secretDoorBlock(SBYGBlocks.SECRET_ASPEN_LOG_DOOR.get(), "aspen/log");
        secretDoorBlock(SBYGBlocks.SECRET_BAOBAB_LOG_DOOR.get(), "baobab/log");
        secretDoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_LOG_DOOR.get(), "blue_enchanted/log");
        secretDoorBlock(SBYGBlocks.SECRET_CHERRY_LOG_DOOR.get(), "cherry/log");
        secretDoorBlock(SBYGBlocks.SECRET_CIKA_LOG_DOOR.get(), "cika/log");
        secretDoorBlock(SBYGBlocks.SECRET_CYPRESS_LOG_DOOR.get(), "cypress/log");
        secretDoorBlock(SBYGBlocks.SECRET_EBONY_LOG_DOOR.get(), "ebony/log");
        secretDoorBlock(SBYGBlocks.SECRET_FIR_LOG_DOOR.get(), "fir/log");
        secretDoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_LOG_DOOR.get(), "green_enchanted/log");
        secretDoorBlock(SBYGBlocks.SECRET_HOLLY_LOG_DOOR.get(), "holly/log");
        secretDoorBlock(SBYGBlocks.SECRET_JACARANDA_LOG_DOOR.get(), "jacaranda/log");
        secretDoorBlock(SBYGBlocks.SECRET_MAHOGANY_LOG_DOOR.get(), "mahogany/log");
        secretDoorBlock(SBYGBlocks.SECRET_WHITE_MANGROVE_LOG_DOOR.get(), "white_mangrove/log");
        secretDoorBlock(SBYGBlocks.SECRET_MAPLE_LOG_DOOR.get(), "maple/log");
        secretDoorBlock(SBYGBlocks.SECRET_PINE_LOG_DOOR.get(), "pine/log");
        secretDoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "rainbow_eucalyptus/log");
        secretDoorBlock(SBYGBlocks.SECRET_REDWOOD_LOG_DOOR.get(), "redwood/log");
        secretDoorBlock(SBYGBlocks.SECRET_SKYRIS_LOG_DOOR.get(), "skyris/log");
        secretDoorBlock(SBYGBlocks.SECRET_WILLOW_LOG_DOOR.get(), "willow/log");
        secretDoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_LOG_DOOR.get(), "witch_hazel/log");
        secretDoorBlock(SBYGBlocks.SECRET_ZELKOVA_LOG_DOOR.get(), "zelkova/log");
        secretDoorBlock(SBYGBlocks.SECRET_SYTHIAN_STEM_DOOR.get(), "sythian/log");
        secretDoorBlock(SBYGBlocks.SECRET_EMBUR_PEDU_DOOR.get(), "embur/log");
        secretDoorBlock(SBYGBlocks.SECRET_PALM_LOG_DOOR.get(), "palm/log");
        secretDoorBlock(SBYGBlocks.SECRET_LAMENT_LOG_DOOR.get(), "lament/log");
        secretDoorBlock(SBYGBlocks.SECRET_BULBIS_STEM_DOOR.get(), "bulbis/log");
        secretDoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_LOG_DOOR.get(), "nightshade/log");
        secretDoorBlock(SBYGBlocks.SECRET_ETHER_LOG_DOOR.get(), "ether/log");
        secretDoorBlock(SBYGBlocks.SECRET_IMPARIUS_STEM_DOOR.get(), "imparius/log");
        secretDoorBlock(SBYGBlocks.SECRET_PALO_VERDE_LOG_DOOR.get(), "palo_verde_log");

        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_ASPEN_LOG_DOOR.get(), "aspen/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_BAOBAB_LOG_DOOR.get(), "baobab/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_BLUE_ENCHANTED_LOG_DOOR.get(), "blue_enchanted/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), "cherry/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_CIKA_LOG_DOOR.get(), "cika/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_CYPRESS_LOG_DOOR.get(), "cypress/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_EBONY_LOG_DOOR.get(), "ebony/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get(), "fir/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_GREEN_ENCHANTED_LOG_DOOR.get(), "green_enchanted/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_HOLLY_LOG_DOOR.get(), "holly/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get(), "jacaranda/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get(), "mahogany/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_WHITE_MANGROVE_LOG_DOOR.get(), "white_mangrove/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_MAPLE_LOG_DOOR.get(), "maple/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_PINE_LOG_DOOR.get(), "pine/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "rainbow_eucalyptus/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get(), "redwood/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_SKYRIS_LOG_DOOR.get(), "skyris/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get(), "willow/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_WITCH_HAZEL_LOG_DOOR.get(), "witch_hazel/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_ZELKOVA_LOG_DOOR.get(), "zelkova/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_SYTHIAN_STEM_DOOR.get(), "sythian/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_EMBUR_PEDU_DOOR.get(), "embur/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get(), "palm/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_LAMENT_LOG_DOOR.get(), "lament/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_BULBIS_STEM_DOOR.get(), "bulbis/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_NIGHTSHADE_LOG_DOOR.get(), "nightshade/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_ETHER_LOG_DOOR.get(), "ether/stripped_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_PALO_VERDE_LOG_DOOR.get(), "stripped_palo_verde_log");

        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ASPEN_LOG_DOOR.get(), "aspen/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BAOBAB_LOG_DOOR.get(), "baobab/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR.get(), "blue_enchanted/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), "cherry/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CIKA_LOG_DOOR.get(), "cika/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CYPRESS_LOG_DOOR.get(), "cypress/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_EBONY_LOG_DOOR.get(), "ebony/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get(), "fir/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR.get(), "green_enchanted/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_HOLLY_LOG_DOOR.get(), "holly/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get(), "jacaranda/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), "mahogany/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WHITE_MANGROVE_LOG_DOOR.get(), "white_mangrove/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR.get(), "maple/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR.get(), "pine/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "rainbow_eucalyptus/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get(), "redwood/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_SKYRIS_LOG_DOOR.get(), "skyris/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get(), "willow/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WITCH_HAZEL_LOG_DOOR.get(), "witch_hazel/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ZELKOVA_LOG_DOOR.get(), "zelkova/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_SYTHIAN_STEM_DOOR.get(), "sythian/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_EMBUR_PEDU_DOOR.get(), "embur/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get(), "palm/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_LAMENT_LOG_DOOR.get(), "lament/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BULBIS_STEM_DOOR.get(), "bulbis/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_NIGHTSHADE_LOG_DOOR.get(), "nightshade/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ETHER_LOG_DOOR.get(), "ether/stripped_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PALO_VERDE_LOG_DOOR.get(), "stripped_palo_verde_log");

        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_ASPEN_LOG_DOOR.get(), "aspen/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_BAOBAB_LOG_DOOR.get(), "baobab/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR.get(), "blue_enchanted/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), "cherry/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_CIKA_LOG_DOOR.get(), "cika/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_CYPRESS_LOG_DOOR.get(), "cypress/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_EBONY_LOG_DOOR.get(), "ebony/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get(), "fir/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR.get(), "green_enchanted/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_HOLLY_LOG_DOOR.get(), "holly/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get(), "jacaranda/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), "mahogany/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_WHITE_MANGROVE_LOG_DOOR.get(), "white_mangrove/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_MAPLE_LOG_DOOR.get(), "maple/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_PINE_LOG_DOOR.get(), "pine/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "rainbow_eucalyptus/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get(), "redwood/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_SKYRIS_LOG_DOOR.get(), "skyris/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get(), "willow/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_WITCH_HAZEL_LOG_DOOR.get(), "witch_hazel/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_ZELKOVA_LOG_DOOR.get(), "zelkova/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_SYTHIAN_STEM_DOOR.get(), "sythian/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_EMBUR_PEDU_DOOR.get(), "embur/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get(), "palm/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_LAMENT_LOG_DOOR.get(), "lament/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_BULBIS_STEM_DOOR.get(), "bulbis/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_NIGHTSHADE_LOG_DOOR.get(), "nightshade/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_ETHER_LOG_DOOR.get(), "ether/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_IMPARIUS_STEM_DOOR.get(), "imparius/log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_PALO_VERDE_LOG_DOOR.get(), "palo_verde_log");

        secretDoorBlock(SBYGBlocks.SECRET_ASPEN_BOOKSHELF_DOOR.get(), "aspen/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_BAOBAB_BOOKSHELF_DOOR.get(), "baobab/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_BOOKSHELF_DOOR.get(), "blue_enchanted/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_CHERRY_BOOKSHELF_DOOR.get(), "cherry/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_CIKA_BOOKSHELF_DOOR.get(), "cika/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_CYPRESS_BOOKSHELF_DOOR.get(), "cypress/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_EBONY_BOOKSHELF_DOOR.get(), "ebony/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_FIR_BOOKSHELF_DOOR.get(), "fir/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_BOOKSHELF_DOOR.get(), "green_enchanted/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_HOLLY_BOOKSHELF_DOOR.get(), "holly/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_JACARANDA_BOOKSHELF_DOOR.get(), "jacaranda/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_MAHOGANY_BOOKSHELF_DOOR.get(), "mahogany/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_WHITE_MANGROVE_BOOKSHELF_DOOR.get(), "white_mangrove/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_MAPLE_BOOKSHELF_DOOR.get(), "maple/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_PINE_BOOKSHELF_DOOR.get(), "pine/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR.get(), "rainbow_eucalyptus/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_REDWOOD_BOOKSHELF_DOOR.get(), "redwood/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_SKYRIS_BOOKSHELF_DOOR.get(), "skyris/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_WILLOW_BOOKSHELF_DOOR.get(), "willow/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_BOOKSHELF_DOOR.get(), "witch_hazel/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_ZELKOVA_BOOKSHELF_DOOR.get(), "zelkova/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_SYTHIAN_BOOKSHELF_DOOR.get(), "sythian/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_EMBUR_BOOKSHELF_DOOR.get(), "embur/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_PALM_BOOKSHELF_DOOR.get(), "palm/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_LAMENT_BOOKSHELF_DOOR.get(), "lament/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_BULBIS_BOOKSHELF_DOOR.get(), "bulbis/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_BOOKSHELF_DOOR.get(), "nightshade/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_ETHER_BOOKSHELF_DOOR.get(), "ether/bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_IMPARIUS_BOOKSHELF_DOOR.get(), "imparius/bookshelf");

        secretDoorBlock(SBYGBlocks.SECRET_WHITE_SANDSTONE_DOOR.get(), "white_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get(), "white_cut_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get(), "white_sandstone_top");
        secretDoorBlock(SBYGBlocks.SECRET_BLUE_SANDSTONE_DOOR.get(), "blue_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_CUT_BLUE_SANDSTONE_DOOR.get(), "blue_cut_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_SMOOTH_BLUE_SANDSTONE_DOOR.get(), "blue_sandstone_top");
        secretDoorBlock(SBYGBlocks.SECRET_BLACK_SANDSTONE_DOOR.get(), "black_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get(), "black_cut_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get(), "black_sandstone_top");
        secretDoorBlock(SBYGBlocks.SECRET_PURPLE_SANDSTONE_DOOR.get(), "purple_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_CUT_PURPLE_SANDSTONE_DOOR.get(), "purple_cut_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_SMOOTH_PURPLE_SANDSTONE_DOOR.get(), "purple_sandstone_top");
        secretDoorBlock(SBYGBlocks.SECRET_PINK_SANDSTONE_DOOR.get(), "pink_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_CUT_PINK_SANDSTONE_DOOR.get(), "pink_cut_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_SMOOTH_PINK_SANDSTONE_DOOR.get(), "pink_sandstone_top");
        secretDoorBlock(SBYGBlocks.SECRET_WINDSWEPT_SANDSTONE_DOOR.get(), "windswept_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_CUT_WINDSWEPT_SANDSTONE_DOOR.get(), "cut_windswept_sandstone");
        secretDoorBlock(SBYGBlocks.SECRET_SMOOTH_WINDSWEPT_SANDSTONE_DOOR.get(), "windswept_sandstone_top");

        secretDoorBlock(SBYGBlocks.SECRET_BLUE_NETHERRACK_DOOR.get(), "blue_netherrack");
        secretDoorBlock(SBYGBlocks.SECRET_BLUE_NETHER_BRICK_DOOR.get(), "blue_nether_bricks");
        secretDoorBlock(SBYGBlocks.SECRET_YELLOW_NETHER_BRICK_DOOR.get(), "yellow_nether_bricks");

        secretDoorBlock(SBYGBlocks.SECRET_BRIMSTONE_DOOR.get(), "brimstone");
        secretDoorBlock(SBYGBlocks.SECRET_PURPUR_STONE_DOOR.get(), "purpur_stone");
        secretDoorBlock(SBYGBlocks.SECRET_ETHER_STONE_DOOR.get(), "ether_stone");
        secretDoorBlock(SBYGBlocks.SECRET_COBBLED_ETHER_DOOR.get(), "cobbled_ether_stone");
        secretDoorBlock(SBYGBlocks.SECRET_DACITE_DOOR.get(), "dacite");
        secretDoorBlock(SBYGBlocks.SECRET_DACITE_BRICKS_DOOR.get(), "dacite_bricks");
        secretDoorBlock(SBYGBlocks.SECRET_DACITE_COBBLESTONE_DOOR.get(), "dacite_cobblestone");
        secretDoorBlock(SBYGBlocks.SECRET_DACITE_TILES_DOOR.get(), "dacite_tile");
        secretDoorBlock(SBYGBlocks.SECRET_RED_ROCK_DOOR.get(), "red_rock");
        secretDoorBlock(SBYGBlocks.SECRET_RED_ROCK_BRICKS_DOOR.get(), "red_rock_bricks");
        secretDoorBlock(SBYGBlocks.SECRET_ROCKY_STONE_DOOR.get(), "rocky_stone");
        secretDoorBlock(SBYGBlocks.SECRET_TRAVERTINE_DOOR.get(), "travertine");
        secretDoorBlock(SBYGBlocks.SECRET_POLISHED_TRAVERTINE_DOOR.get(), "polished_travertine");
        secretDoorBlock(SBYGBlocks.SECRET_SCORIA_STONE_DOOR.get(), "scoria_stone");
        secretDoorBlock(SBYGBlocks.SECRET_SCORIA_COBBLESTONE_DOOR.get(), "scoria_cobblestone");
        secretDoorBlock(SBYGBlocks.SECRET_SCORIA_STONE_BRICKS_DOOR.get(), "scoria_stone_bricks");
        secretDoorBlock(SBYGBlocks.SECRET_SOAPSTONE_DOOR.get(), "soapstone");
        secretDoorBlock(SBYGBlocks.SECRET_POLISHED_SOAPSTONE_DOOR.get(), "soapstone_polished");
        secretDoorBlock(SBYGBlocks.SECRET_SOAPSTONE_BRICKS_DOOR.get(), "soapstone_bricks");
        secretDoorBlock(SBYGBlocks.SECRET_SOAPSTONE_TILES_DOOR.get(), "soapstone_tile");
        secretDoorBlock(SBYGBlocks.SECRET_MAGMATIC_STONE_DOOR.get(), "magmatic_stone");
        secretDoorBlock(SBYGBlocks.SECRET_CHISELED_THERIUM_DOOR.get(), "chiseled_therium");
        secretDoorBlock(SBYGBlocks.SECRET_CRYPTIC_STONE_DOOR.get(), "cryptic_stone");


        secretTrapdoorBlock(SBYGBlocks.SECRET_ASPEN_PLANK_TRAPDOOR.get(), "aspen/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BAOBAB_PLANK_TRAPDOOR.get(), "baobab/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_PLANK_TRAPDOOR.get(), "blue_enchanted/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), "cherry/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CIKA_PLANK_TRAPDOOR.get(), "cika/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CYPRESS_PLANK_TRAPDOOR.get(), "cypress/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EBONY_PLANK_TRAPDOOR.get(), "ebony/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_FIR_PLANK_TRAPDOOR.get(), "fir/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_PLANK_TRAPDOOR.get(), "green_enchanted/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_HOLLY_PLANK_TRAPDOOR.get(), "holly/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get(), "jacaranda/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get(), "mahogany/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WHITE_MANGROVE_PLANK_TRAPDOOR.get(), "white_mangrove/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAPLE_PLANK_TRAPDOOR.get(), "maple/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PINE_PLANK_TRAPDOOR.get(), "pine/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR.get(), "rainbow_eucalyptus/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get(), "redwood/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SKYRIS_PLANK_TRAPDOOR.get(), "skyris/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get(), "willow/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_PLANK_TRAPDOOR.get(), "witch_hazel/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ZELKOVA_PLANK_TRAPDOOR.get(), "zelkova/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SYTHIAN_PLANK_TRAPDOOR.get(), "sythian/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EMBUR_PLANK_TRAPDOOR.get(), "embur/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PALM_PLANK_TRAPDOOR.get(), "palm/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_LAMENT_PLANK_TRAPDOOR.get(), "lament/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BULBIS_PLANK_TRAPDOOR.get(), "bulbis/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_PLANK_TRAPDOOR.get(), "nightshade/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ETHER_PLANK_TRAPDOOR.get(), "ether/planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_IMPARIUS_PLANK_TRAPDOOR.get(), "imparius/planks");

        secretTrapdoorBlock(SBYGBlocks.SECRET_ASPEN_LOG_TRAPDOOR.get(), "aspen/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BAOBAB_LOG_TRAPDOOR.get(), "baobab/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), "blue_enchanted/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), "cherry/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CIKA_LOG_TRAPDOOR.get(), "cika/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CYPRESS_LOG_TRAPDOOR.get(), "cypress/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EBONY_LOG_TRAPDOOR.get(), "ebony/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_FIR_LOG_TRAPDOOR.get(), "fir/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), "green_enchanted/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_HOLLY_LOG_TRAPDOOR.get(), "holly/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get(), "jacaranda/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get(), "mahogany/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WHITE_MANGROVE_LOG_TRAPDOOR.get(), "white_mangrove/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAPLE_LOG_TRAPDOOR.get(), "maple/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PINE_LOG_TRAPDOOR.get(), "pine/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), "rainbow_eucalyptus/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get(), "redwood/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SKYRIS_LOG_TRAPDOOR.get(), "skyris/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get(), "willow/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_LOG_TRAPDOOR.get(), "witch_hazel/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ZELKOVA_LOG_TRAPDOOR.get(), "zelkova/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SYTHIAN_STEM_TRAPDOOR.get(), "sythian/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EMBUR_PEDU_TRAPDOOR.get(), "embur/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PALM_LOG_TRAPDOOR.get(), "palm/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_LAMENT_LOG_TRAPDOOR.get(), "lament/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BULBIS_STEM_TRAPDOOR.get(), "bulbis/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_LOG_TRAPDOOR.get(), "nightshade/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ETHER_LOG_TRAPDOOR.get(), "ether/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_IMPARIUS_STEM_TRAPDOOR.get(), "imparius/log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PALO_VERDE_LOG_TRAPDOOR.get(), "palo_verde_log");

        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_ASPEN_LOG_TRAPDOOR.get(), "aspen/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_BAOBAB_LOG_TRAPDOOR.get(), "baobab/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), "blue_enchanted/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), "cherry/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_CIKA_LOG_TRAPDOOR.get(), "cika/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_CYPRESS_LOG_TRAPDOOR.get(), "cypress/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_EBONY_LOG_TRAPDOOR.get(), "ebony/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get(), "fir/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), "green_enchanted/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_HOLLY_LOG_TRAPDOOR.get(), "holly/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get(), "jacaranda/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get(), "mahogany/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_WHITE_MANGROVE_LOG_TRAPDOOR.get(), "white_mangrove/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR.get(), "maple/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_PINE_LOG_TRAPDOOR.get(), "pine/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), "rainbow_eucalyptus/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get(), "redwood/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_SKYRIS_LOG_TRAPDOOR.get(), "skyris/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get(), "willow/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_WITCH_HAZEL_LOG_TRAPDOOR.get(), "witch_hazel/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_ZELKOVA_LOG_TRAPDOOR.get(), "zelkova/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_SYTHIAN_STEM_TRAPDOOR.get(), "sythian/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_EMBUR_PEDU_TRAPDOOR.get(), "embur/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get(), "palm/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_LAMENT_LOG_TRAPDOOR.get(), "lament/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_BULBIS_STEM_TRAPDOOR.get(), "bulbis/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_NIGHTSHADE_LOG_TRAPDOOR.get(), "nightshade/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_ETHER_LOG_TRAPDOOR.get(), "ether/stripped_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_PALO_VERDE_LOG_TRAPDOOR.get(), "stripped_palo_verde_log");

        secretTrapdoorBlock(SBYGBlocks.SECRET_ASPEN_BOOKSHELF_TRAPDOOR.get(), "aspen/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BAOBAB_BOOKSHELF_TRAPDOOR.get(), "baobab/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), "blue_enchanted/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CHERRY_BOOKSHELF_TRAPDOOR.get(), "cherry/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CIKA_BOOKSHELF_TRAPDOOR.get(), "cika/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CYPRESS_BOOKSHELF_TRAPDOOR.get(), "cypress/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EBONY_BOOKSHELF_TRAPDOOR.get(), "ebony/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_FIR_BOOKSHELF_TRAPDOOR.get(), "fir/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), "green_enchanted/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_HOLLY_BOOKSHELF_TRAPDOOR.get(), "holly/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_JACARANDA_BOOKSHELF_TRAPDOOR.get(), "jacaranda/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAHOGANY_BOOKSHELF_TRAPDOOR.get(), "mahogany/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WHITE_MANGROVE_BOOKSHELF_TRAPDOOR.get(), "white_mangrove/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAPLE_BOOKSHELF_TRAPDOOR.get(), "maple/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PINE_BOOKSHELF_TRAPDOOR.get(), "pine/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR.get(), "rainbow_eucalyptus/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_REDWOOD_BOOKSHELF_TRAPDOOR.get(), "redwood/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SKYRIS_BOOKSHELF_TRAPDOOR.get(), "skyris/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WILLOW_BOOKSHELF_TRAPDOOR.get(), "willow/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_BOOKSHELF_TRAPDOOR.get(), "witch_hazel/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ZELKOVA_BOOKSHELF_TRAPDOOR.get(), "zelkova/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SYTHIAN_BOOKSHELF_TRAPDOOR.get(), "sythian/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EMBUR_BOOKSHELF_TRAPDOOR.get(), "embur/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PALM_BOOKSHELF_TRAPDOOR.get(), "palm/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_LAMENT_BOOKSHELF_TRAPDOOR.get(), "lament/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BULBIS_BOOKSHELF_TRAPDOOR.get(), "bulbis/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_BOOKSHELF_TRAPDOOR.get(), "nightshade/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ETHER_BOOKSHELF_TRAPDOOR.get(), "ether/bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_IMPARIUS_BOOKSHELF_TRAPDOOR.get(), "imparius/bookshelf");

        secretTrapdoorBlock(SBYGBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get(), "white_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get(), "white_cut_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get(), "white_sandstone_top");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_SANDSTONE_TRAPDOOR.get(), "blue_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CUT_BLUE_SANDSTONE_TRAPDOOR.get(), "blue_cut_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SMOOTH_BLUE_SANDSTONE_TRAPDOOR.get(), "blue_sandstone_top");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get(), "black_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get(), "black_cut_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get(), "black_sandstone_top");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PURPLE_SANDSTONE_TRAPDOOR.get(), "purple_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CUT_PURPLE_SANDSTONE_TRAPDOOR.get(), "purple_cut_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SMOOTH_PURPLE_SANDSTONE_TRAPDOOR.get(), "purple_sandstone_top");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PINK_SANDSTONE_TRAPDOOR.get(), "pink_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CUT_PINK_SANDSTONE_TRAPDOOR.get(), "pink_cut_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SMOOTH_PINK_SANDSTONE_TRAPDOOR.get(), "pink_sandstone_top");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), "windswept_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CUT_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), "cut_windswept_sandstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SMOOTH_WINDSWEPT_SANDSTONE_TRAPDOOR.get(), "windswept_sandstone_top");

        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_NETHERRACK_TRAPDOOR.get(), "blue_netherrack");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_NETHER_BRICK_TRAPDOOR.get(), "blue_nether_bricks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_YELLOW_NETHER_BRICK_TRAPDOOR.get(), "yellow_nether_bricks");

        secretTrapdoorBlock(SBYGBlocks.SECRET_BRIMSTONE_TRAPDOOR.get(), "brimstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PURPUR_STONE_TRAPDOOR.get(), "purpur_stone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ETHER_STONE_TRAPDOOR.get(), "ether_stone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_COBBLED_ETHER_TRAPDOOR.get(), "cobbled_ether_stone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_DACITE_TRAPDOOR.get(), "dacite");
        secretTrapdoorBlock(SBYGBlocks.SECRET_DACITE_BRICKS_TRAPDOOR.get(), "dacite_bricks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_DACITE_COBBLESTONE_TRAPDOOR.get(), "dacite_cobblestone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_DACITE_TILES_TRAPDOOR.get(), "dacite_tile");
        secretTrapdoorBlock(SBYGBlocks.SECRET_RED_ROCK_TRAPDOOR.get(), "red_rock");
        secretTrapdoorBlock(SBYGBlocks.SECRET_RED_ROCK_BRICKS_TRAPDOOR.get(), "red_rock_bricks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ROCKY_STONE_TRAPDOOR.get(), "rocky_stone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_TRAVERTINE_TRAPDOOR.get(), "travertine");
        secretTrapdoorBlock(SBYGBlocks.SECRET_POLISHED_TRAVERTINE_TRAPDOOR.get(), "polished_travertine");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SCORIA_STONE_TRAPDOOR.get(), "scoria_stone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SCORIA_COBBLESTONE_TRAPDOOR.get(), "scoria_cobblestone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SCORIA_STONE_BRICKS_TRAPDOOR.get(), "scoria_stone_bricks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SOAPSTONE_TRAPDOOR.get(), "soapstone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_POLISHED_SOAPSTONE_TRAPDOOR.get(), "soapstone_polished");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SOAPSTONE_BRICKS_TRAPDOOR.get(), "soapstone_bricks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SOAPSTONE_TILES_TRAPDOOR.get(), "soapstone_tile");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAGMATIC_STONE_TRAPDOOR.get(), "magmatic_stone");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CHISELED_THERIUM_TRAPDOOR.get(), "chiseled_therium");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CRYPTIC_STONE_TRAPDOOR.get(), "cryptic_stone");
    }

    public void secretDoorBlock(DoorBlock block, String texture) {
        doorBlock(block, bygLoc("block/" + texture), bygLoc("block/" + texture));
    }

    public void secretTrapdoorBlock(TrapDoorBlock block, String texture) {
        trapdoorBlock(block, bygLoc("block/" + texture), true);
    }

    public ResourceLocation bygLoc(String name) {
        return new ResourceLocation(BYG.MOD_ID, name);
    }

    public ResourceLocation baseLoc(String name) {
        return new ResourceLocation(SecretDoors.MODID, name);
    }

    protected void horizontalBYGDoorBlock(DoorBlock block, String texture) {
        this.doorBlock(block,
                models().withExistingParent(SecretDoors.name(block) + "bottom_left", baseLoc("horizontal_door_bottom_left")).texture("bottom", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.name(block) + "bottom_left_open", baseLoc("horizontal_door_bottom_left_open")).texture("bottom", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.name(block) + "bottom_right", baseLoc("horizontal_door_bottom_right")).texture("bottom", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.name(block) + "bottom_right_open", baseLoc("horizontal_door_bottom_right_open")).texture("bottom", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.name(block) + "top_left", baseLoc("horizontal_door_top_left")).texture("top", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.name(block) + "top_left_open", baseLoc("horizontal_door_top_left_open")).texture("top", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.name(block) + "top_right", baseLoc("horizontal_door_top_right")).texture("top", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(SecretDoors.name(block) + "top_right_open", baseLoc("horizontal_door_top_right_open")).texture("top", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)));
    }
}