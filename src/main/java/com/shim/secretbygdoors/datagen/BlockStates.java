package com.shim.secretbygdoors.datagen;

import com.shim.secretbygdoors.SBYGBlocks;
import com.shim.secretbygdoors.SecretBYGDoors;
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


        secretDoorBlock(SBYGBlocks.SECRET_ASPEN_PLANK_DOOR.get(), "aspen_planks");
        secretDoorBlock(SBYGBlocks.SECRET_BAOBAB_PLANK_DOOR.get(), "baobab_planks");
        secretDoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_PLANK_DOOR.get(), "blue_enchanted_planks");
        secretDoorBlock(SBYGBlocks.SECRET_CHERRY_PLANK_DOOR.get(), "cherry_planks");
        secretDoorBlock(SBYGBlocks.SECRET_CIKA_PLANK_DOOR.get(), "cika_planks");
        secretDoorBlock(SBYGBlocks.SECRET_CYPRESS_PLANK_DOOR.get(), "cypress_planks");
        secretDoorBlock(SBYGBlocks.SECRET_EBONY_PLANK_DOOR.get(), "ebony_planks");
        secretDoorBlock(SBYGBlocks.SECRET_FIR_PLANK_DOOR.get(), "fir_planks");
        secretDoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_PLANK_DOOR.get(), "green_enchanted_planks");
        secretDoorBlock(SBYGBlocks.SECRET_HOLLY_PLANK_DOOR.get(), "holly_planks");
        secretDoorBlock(SBYGBlocks.SECRET_JACARANDA_PLANK_DOOR.get(), "jacaranda_planks");
        secretDoorBlock(SBYGBlocks.SECRET_MAHOGANY_PLANK_DOOR.get(), "mahogany_planks");
        secretDoorBlock(SBYGBlocks.SECRET_MANGROVE_PLANK_DOOR.get(), "mangrove_planks");
        secretDoorBlock(SBYGBlocks.SECRET_MAPLE_PLANK_DOOR.get(), "maple_planks");
        secretDoorBlock(SBYGBlocks.SECRET_PINE_PLANK_DOOR.get(), "pine_planks");
        secretDoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_PLANK_DOOR.get(), "rainbow_eucalyptus_planks");
        secretDoorBlock(SBYGBlocks.SECRET_REDWOOD_PLANK_DOOR.get(), "redwood_planks");
        secretDoorBlock(SBYGBlocks.SECRET_SKYRIS_PLANK_DOOR.get(), "skyris_planks");
        secretDoorBlock(SBYGBlocks.SECRET_WILLOW_PLANK_DOOR.get(), "willow_planks");
        secretDoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_PLANK_DOOR.get(), "witch_hazel_planks");
        secretDoorBlock(SBYGBlocks.SECRET_ZELKOVA_PLANK_DOOR.get(), "zelkova_planks");
        secretDoorBlock(SBYGBlocks.SECRET_SYTHIAN_PLANK_DOOR.get(), "sythian_planks");
        secretDoorBlock(SBYGBlocks.SECRET_EMBUR_PLANK_DOOR.get(), "embur_planks");
        secretDoorBlock(SBYGBlocks.SECRET_PALM_PLANK_DOOR.get(), "palm_planks");
        secretDoorBlock(SBYGBlocks.SECRET_LAMENT_PLANK_DOOR.get(), "lament_planks");
        secretDoorBlock(SBYGBlocks.SECRET_BULBIS_PLANK_DOOR.get(), "bulbis_planks");
        secretDoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_PLANK_DOOR.get(), "nightshade_planks");
        secretDoorBlock(SBYGBlocks.SECRET_ETHER_PLANK_DOOR.get(), "ether_planks");
        secretDoorBlock(SBYGBlocks.SECRET_IMPARIUS_PLANK_DOOR.get(), "imparius_planks");

        secretDoorBlock(SBYGBlocks.SECRET_ASPEN_LOG_DOOR.get(), "aspen_log");
        secretDoorBlock(SBYGBlocks.SECRET_BAOBAB_LOG_DOOR.get(), "baobab_log");
        secretDoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_LOG_DOOR.get(), "blue_enchanted_log");
        secretDoorBlock(SBYGBlocks.SECRET_CHERRY_LOG_DOOR.get(), "cherry_log");
        secretDoorBlock(SBYGBlocks.SECRET_CIKA_LOG_DOOR.get(), "cika_log");
        secretDoorBlock(SBYGBlocks.SECRET_CYPRESS_LOG_DOOR.get(), "cypress_log");
        secretDoorBlock(SBYGBlocks.SECRET_EBONY_LOG_DOOR.get(), "ebony_log");
        secretDoorBlock(SBYGBlocks.SECRET_FIR_LOG_DOOR.get(), "fir_log");
        secretDoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_LOG_DOOR.get(), "green_enchanted_log");
        secretDoorBlock(SBYGBlocks.SECRET_HOLLY_LOG_DOOR.get(), "holly_log");
        secretDoorBlock(SBYGBlocks.SECRET_JACARANDA_LOG_DOOR.get(), "jacaranda_log");
        secretDoorBlock(SBYGBlocks.SECRET_MAHOGANY_LOG_DOOR.get(), "mahogany_log");
        secretDoorBlock(SBYGBlocks.SECRET_MANGROVE_LOG_DOOR.get(), "mangrove_log");
        secretDoorBlock(SBYGBlocks.SECRET_MAPLE_LOG_DOOR.get(), "maple_log");
        secretDoorBlock(SBYGBlocks.SECRET_PINE_LOG_DOOR.get(), "pine_log");
        secretDoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "rainbow_eucalyptus_log");
        secretDoorBlock(SBYGBlocks.SECRET_REDWOOD_LOG_DOOR.get(), "redwood_log");
        secretDoorBlock(SBYGBlocks.SECRET_SKYRIS_LOG_DOOR.get(), "skyris_log");
        secretDoorBlock(SBYGBlocks.SECRET_WILLOW_LOG_DOOR.get(), "willow_log");
        secretDoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_LOG_DOOR.get(), "witch_hazel_log");
        secretDoorBlock(SBYGBlocks.SECRET_ZELKOVA_LOG_DOOR.get(), "zelkova_log");
        secretDoorBlock(SBYGBlocks.SECRET_SYTHIAN_STEM_DOOR.get(), "sythian_stem");
        secretDoorBlock(SBYGBlocks.SECRET_EMBUR_PEDU_DOOR.get(), "embur_pedu");
        secretDoorBlock(SBYGBlocks.SECRET_PALM_LOG_DOOR.get(), "palm_log");
        secretDoorBlock(SBYGBlocks.SECRET_LAMENT_LOG_DOOR.get(), "lament_log");
        secretDoorBlock(SBYGBlocks.SECRET_BULBIS_STEM_DOOR.get(), "bulbis_stem");
        secretDoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_LOG_DOOR.get(), "nightshade_log");
        secretDoorBlock(SBYGBlocks.SECRET_ETHER_LOG_DOOR.get(), "ether_log");
        secretDoorBlock(SBYGBlocks.SECRET_IMPARIUS_STEM_DOOR.get(), "imparius_stem");
        secretDoorBlock(SBYGBlocks.SECRET_PALO_VERDE_LOG_DOOR.get(), "palo_verde_log");

        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_ASPEN_LOG_DOOR.get(), "stripped_aspen_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_BAOBAB_LOG_DOOR.get(), "stripped_baobab_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_BLUE_ENCHANTED_LOG_DOOR.get(), "stripped_blue_enchanted_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), "stripped_cherry_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_CIKA_LOG_DOOR.get(), "stripped_cika_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_CYPRESS_LOG_DOOR.get(), "stripped_cypress_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_EBONY_LOG_DOOR.get(), "stripped_ebony_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get(), "stripped_fir_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_GREEN_ENCHANTED_LOG_DOOR.get(), "stripped_green_enchanted_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_HOLLY_LOG_DOOR.get(), "stripped_holly_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get(), "stripped_jacaranda_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get(), "stripped_mahogany_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get(), "stripped_mangrove_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_MAPLE_LOG_DOOR.get(), "stripped_maple_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_PINE_LOG_DOOR.get(), "stripped_pine_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "stripped_rainbow_eucalyptus_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get(), "stripped_redwood_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_SKYRIS_LOG_DOOR.get(), "stripped_skyris_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get(), "stripped_willow_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_WITCH_HAZEL_LOG_DOOR.get(), "stripped_witch_hazel_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_ZELKOVA_LOG_DOOR.get(), "stripped_zelkova_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_SYTHIAN_STEM_DOOR.get(), "stripped_sythian_stem");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_EMBUR_PEDU_DOOR.get(), "stripped_embur_pedu");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get(), "stripped_palm_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_LAMENT_LOG_DOOR.get(), "stripped_lament_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_BULBIS_STEM_DOOR.get(), "stripped_bulbis_stem");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_NIGHTSHADE_LOG_DOOR.get(), "stripped_nightshade_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_ETHER_LOG_DOOR.get(), "stripped_ether_log");
        secretDoorBlock(SBYGBlocks.SECRET_STRIPPED_PALO_VERDE_LOG_DOOR.get(), "stripped_palo_verde_log");

        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ASPEN_LOG_DOOR.get(), "stripped_aspen_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BAOBAB_LOG_DOOR.get(), "stripped_baobab_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR.get(), "stripped_blue_enchanted_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), "stripped_cherry_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CIKA_LOG_DOOR.get(), "stripped_cika_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CYPRESS_LOG_DOOR.get(), "stripped_cypress_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_EBONY_LOG_DOOR.get(), "stripped_ebony_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get(), "stripped_fir_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR.get(), "stripped_green_enchanted_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_HOLLY_LOG_DOOR.get(), "stripped_holly_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get(), "stripped_jacaranda_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), "stripped_mahogany_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get(), "stripped_mangrove_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR.get(), "stripped_maple_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR.get(), "stripped_pine_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "stripped_rainbow_eucalyptus_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get(), "stripped_redwood_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_SKYRIS_LOG_DOOR.get(), "stripped_skyris_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get(), "stripped_willow_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WITCH_HAZEL_LOG_DOOR.get(), "stripped_witch_hazel_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ZELKOVA_LOG_DOOR.get(), "stripped_zelkova_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_SYTHIAN_STEM_DOOR.get(), "stripped_sythian_stem");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_EMBUR_PEDU_DOOR.get(), "stripped_embur_pedu");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get(), "stripped_palm_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_LAMENT_LOG_DOOR.get(), "stripped_lament_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BULBIS_STEM_DOOR.get(), "stripped_bulbis_stem");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_NIGHTSHADE_LOG_DOOR.get(), "stripped_nightshade_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ETHER_LOG_DOOR.get(), "stripped_ether_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PALO_VERDE_LOG_DOOR.get(), "stripped_palo_verde_log");

        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_ASPEN_LOG_DOOR.get(), "aspen_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_BAOBAB_LOG_DOOR.get(), "baobab_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR.get(), "blue_enchanted_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), "cherry_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_CIKA_LOG_DOOR.get(), "cika_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_CYPRESS_LOG_DOOR.get(), "cypress_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_EBONY_LOG_DOOR.get(), "ebony_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get(), "fir_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR.get(), "green_enchanted_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_HOLLY_LOG_DOOR.get(), "holly_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get(), "jacaranda_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), "mahogany_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get(), "mangrove_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_MAPLE_LOG_DOOR.get(), "maple_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_PINE_LOG_DOOR.get(), "pine_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), "rainbow_eucalyptus_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get(), "redwood_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_SKYRIS_LOG_DOOR.get(), "skyris_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get(), "willow_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_WITCH_HAZEL_LOG_DOOR.get(), "witch_hazel_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_ZELKOVA_LOG_DOOR.get(), "zelkova_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_SYTHIAN_STEM_DOOR.get(), "sythian_stem");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_EMBUR_PEDU_DOOR.get(), "embur_pedu");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get(), "palm_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_LAMENT_LOG_DOOR.get(), "lament_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_BULBIS_STEM_DOOR.get(), "bulbis_stem");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_NIGHTSHADE_LOG_DOOR.get(), "nightshade_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_ETHER_LOG_DOOR.get(), "ether_log");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_IMPARIUS_STEM_DOOR.get(), "imparius_stem");
        horizontalBYGDoorBlock(SBYGBlocks.SECRET_HORIZONTAL_PALO_VERDE_LOG_DOOR.get(), "palo_verde_log");

        secretDoorBlock(SBYGBlocks.SECRET_ASPEN_BOOKSHELF_DOOR.get(), "aspen_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_BAOBAB_BOOKSHELF_DOOR.get(), "baobab_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_BOOKSHELF_DOOR.get(), "blue_enchanted_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_CHERRY_BOOKSHELF_DOOR.get(), "cherry_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_CIKA_BOOKSHELF_DOOR.get(), "cika_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_CYPRESS_BOOKSHELF_DOOR.get(), "cypress_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_EBONY_BOOKSHELF_DOOR.get(), "ebony_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_FIR_BOOKSHELF_DOOR.get(), "fir_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_BOOKSHELF_DOOR.get(), "green_enchanted_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_HOLLY_BOOKSHELF_DOOR.get(), "holly_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_JACARANDA_BOOKSHELF_DOOR.get(), "jacaranda_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_MAHOGANY_BOOKSHELF_DOOR.get(), "mahogany_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_MANGROVE_BOOKSHELF_DOOR.get(), "mangrove_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_MAPLE_BOOKSHELF_DOOR.get(), "maple_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_PINE_BOOKSHELF_DOOR.get(), "pine_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR.get(), "rainbow_eucalyptus_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_REDWOOD_BOOKSHELF_DOOR.get(), "redwood_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_SKYRIS_BOOKSHELF_DOOR.get(), "skyris_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_WILLOW_BOOKSHELF_DOOR.get(), "willow_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_BOOKSHELF_DOOR.get(), "witch_hazel_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_ZELKOVA_BOOKSHELF_DOOR.get(), "zelkova_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_SYTHIAN_BOOKSHELF_DOOR.get(), "sythian_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_EMBUR_BOOKSHELF_DOOR.get(), "embur_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_PALM_BOOKSHELF_DOOR.get(), "palm_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_LAMENT_BOOKSHELF_DOOR.get(), "lament_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_BULBIS_BOOKSHELF_DOOR.get(), "bulbis_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_BOOKSHELF_DOOR.get(), "nightshade_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_ETHER_BOOKSHELF_DOOR.get(), "ether_bookshelf");
        secretDoorBlock(SBYGBlocks.SECRET_IMPARIUS_BOOKSHELF_DOOR.get(), "imparius_bookshelf");
        
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

        secretDoorBlock(SBYGBlocks.SECRET_MUD_BRICKS_DOOR.get(), "mud_bricks");
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
        secretDoorBlock(SBYGBlocks.SECRET_THERIUM_DOOR.get(), "therium_block");
        secretDoorBlock(SBYGBlocks.SECRET_CRYPTIC_STONE_DOOR.get(), "cryptic_stone");


        secretTrapdoorBlock(SBYGBlocks.SECRET_ASPEN_PLANK_TRAPDOOR.get(), "aspen_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BAOBAB_PLANK_TRAPDOOR.get(), "baobab_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_PLANK_TRAPDOOR.get(), "blue_enchanted_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), "cherry_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CIKA_PLANK_TRAPDOOR.get(), "cika_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CYPRESS_PLANK_TRAPDOOR.get(), "cypress_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EBONY_PLANK_TRAPDOOR.get(), "ebony_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_FIR_PLANK_TRAPDOOR.get(), "fir_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_PLANK_TRAPDOOR.get(), "green_enchanted_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_HOLLY_PLANK_TRAPDOOR.get(), "holly_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get(), "jacaranda_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get(), "mahogany_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get(), "mangrove_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAPLE_PLANK_TRAPDOOR.get(), "maple_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PINE_PLANK_TRAPDOOR.get(), "pine_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR.get(), "rainbow_eucalyptus_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get(), "redwood_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SKYRIS_PLANK_TRAPDOOR.get(), "skyris_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get(), "willow_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_PLANK_TRAPDOOR.get(), "witch_hazel_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ZELKOVA_PLANK_TRAPDOOR.get(), "zelkova_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SYTHIAN_PLANK_TRAPDOOR.get(), "sythian_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EMBUR_PLANK_TRAPDOOR.get(), "embur_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PALM_PLANK_TRAPDOOR.get(), "palm_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_LAMENT_PLANK_TRAPDOOR.get(), "lament_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BULBIS_PLANK_TRAPDOOR.get(), "bulbis_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_PLANK_TRAPDOOR.get(), "nightshade_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ETHER_PLANK_TRAPDOOR.get(), "ether_planks");
        secretTrapdoorBlock(SBYGBlocks.SECRET_IMPARIUS_PLANK_TRAPDOOR.get(), "imparius_planks");

        secretTrapdoorBlock(SBYGBlocks.SECRET_ASPEN_LOG_TRAPDOOR.get(), "aspen_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BAOBAB_LOG_TRAPDOOR.get(), "baobab_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), "blue_enchanted_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), "cherry_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CIKA_LOG_TRAPDOOR.get(), "cika_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CYPRESS_LOG_TRAPDOOR.get(), "cypress_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EBONY_LOG_TRAPDOOR.get(), "ebony_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_FIR_LOG_TRAPDOOR.get(), "fir_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), "green_enchanted_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_HOLLY_LOG_TRAPDOOR.get(), "holly_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get(), "jacaranda_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get(), "mahogany_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get(), "mangrove_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAPLE_LOG_TRAPDOOR.get(), "maple_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PINE_LOG_TRAPDOOR.get(), "pine_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), "rainbow_eucalyptus_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get(), "redwood_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SKYRIS_LOG_TRAPDOOR.get(), "skyris_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get(), "willow_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_LOG_TRAPDOOR.get(), "witch_hazel_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ZELKOVA_LOG_TRAPDOOR.get(), "zelkova_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SYTHIAN_STEM_TRAPDOOR.get(), "sythian_stem");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EMBUR_PEDU_TRAPDOOR.get(), "embur_pedu");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PALM_LOG_TRAPDOOR.get(), "palm_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_LAMENT_LOG_TRAPDOOR.get(), "lament_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BULBIS_STEM_TRAPDOOR.get(), "bulbis_stem");
        secretTrapdoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_LOG_TRAPDOOR.get(), "nightshade_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ETHER_LOG_TRAPDOOR.get(), "ether_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_IMPARIUS_STEM_TRAPDOOR.get(), "imparius_stem");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PALO_VERDE_LOG_TRAPDOOR.get(), "palo_verde_log");

        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_ASPEN_LOG_TRAPDOOR.get(), "stripped_aspen_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_BAOBAB_LOG_TRAPDOOR.get(), "stripped_baobab_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), "stripped_blue_enchanted_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), "stripped_cherry_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_CIKA_LOG_TRAPDOOR.get(), "stripped_cika_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_CYPRESS_LOG_TRAPDOOR.get(), "stripped_cypress_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_EBONY_LOG_TRAPDOOR.get(), "stripped_ebony_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get(), "stripped_fir_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), "stripped_green_enchanted_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_HOLLY_LOG_TRAPDOOR.get(), "stripped_holly_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get(), "stripped_jacaranda_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get(), "stripped_mahogany_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get(), "stripped_mangrove_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR.get(), "stripped_maple_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_PINE_LOG_TRAPDOOR.get(), "stripped_pine_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), "stripped_rainbow_eucalyptus_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get(), "stripped_redwood_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_SKYRIS_LOG_TRAPDOOR.get(), "stripped_skyris_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get(), "stripped_willow_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_WITCH_HAZEL_LOG_TRAPDOOR.get(), "stripped_witch_hazel_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_ZELKOVA_LOG_TRAPDOOR.get(), "stripped_zelkova_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_SYTHIAN_STEM_TRAPDOOR.get(), "stripped_sythian_stem");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_EMBUR_PEDU_TRAPDOOR.get(), "stripped_embur_pedu");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get(), "stripped_palm_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_LAMENT_LOG_TRAPDOOR.get(), "stripped_lament_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_BULBIS_STEM_TRAPDOOR.get(), "stripped_bulbis_stem");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_NIGHTSHADE_LOG_TRAPDOOR.get(), "stripped_nightshade_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_ETHER_LOG_TRAPDOOR.get(), "stripped_ether_log");
        secretTrapdoorBlock(SBYGBlocks.SECRET_STRIPPED_PALO_VERDE_LOG_TRAPDOOR.get(), "stripped_palo_verde_log");

        secretTrapdoorBlock(SBYGBlocks.SECRET_ASPEN_BOOKSHELF_TRAPDOOR.get(), "aspen_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BAOBAB_BOOKSHELF_TRAPDOOR.get(), "baobab_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), "blue_enchanted_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CHERRY_BOOKSHELF_TRAPDOOR.get(), "cherry_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CIKA_BOOKSHELF_TRAPDOOR.get(), "cika_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_CYPRESS_BOOKSHELF_TRAPDOOR.get(), "cypress_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EBONY_BOOKSHELF_TRAPDOOR.get(), "ebony_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_FIR_BOOKSHELF_TRAPDOOR.get(), "fir_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), "green_enchanted_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_HOLLY_BOOKSHELF_TRAPDOOR.get(), "holly_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_JACARANDA_BOOKSHELF_TRAPDOOR.get(), "jacaranda_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAHOGANY_BOOKSHELF_TRAPDOOR.get(), "mahogany_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MANGROVE_BOOKSHELF_TRAPDOOR.get(), "mangrove_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_MAPLE_BOOKSHELF_TRAPDOOR.get(), "maple_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PINE_BOOKSHELF_TRAPDOOR.get(), "pine_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR.get(), "rainbow_eucalyptus_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_REDWOOD_BOOKSHELF_TRAPDOOR.get(), "redwood_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SKYRIS_BOOKSHELF_TRAPDOOR.get(), "skyris_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WILLOW_BOOKSHELF_TRAPDOOR.get(), "willow_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_WITCH_HAZEL_BOOKSHELF_TRAPDOOR.get(), "witch_hazel_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ZELKOVA_BOOKSHELF_TRAPDOOR.get(), "zelkova_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_SYTHIAN_BOOKSHELF_TRAPDOOR.get(), "sythian_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_EMBUR_BOOKSHELF_TRAPDOOR.get(), "embur_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_PALM_BOOKSHELF_TRAPDOOR.get(), "palm_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_LAMENT_BOOKSHELF_TRAPDOOR.get(), "lament_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_BULBIS_BOOKSHELF_TRAPDOOR.get(), "bulbis_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_NIGHTSHADE_BOOKSHELF_TRAPDOOR.get(), "nightshade_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_ETHER_BOOKSHELF_TRAPDOOR.get(), "ether_bookshelf");
        secretTrapdoorBlock(SBYGBlocks.SECRET_IMPARIUS_BOOKSHELF_TRAPDOOR.get(), "imparius_bookshelf");

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

        secretTrapdoorBlock(SBYGBlocks.SECRET_MUD_BRICKS_TRAPDOOR.get(), "mud_bricks");
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
        secretTrapdoorBlock(SBYGBlocks.SECRET_THERIUM_TRAPDOOR.get(), "therium_block");
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
    
    protected void horizontalBYGDoorBlock(DoorBlock block, String texture) {
        this.doorBlock(block, models().withExistingParent(block.getRegistryName().getPath() + "_bottom", modLoc("horizontal_door_bottom")).texture("bottom", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_bottom_hinge", modLoc("horizontal_door_bottom_rh")).texture("bottom", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_top", modLoc("horizontal_door_top")).texture("top", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)),
                models().withExistingParent(block.getRegistryName().getPath() + "_top_hinge", modLoc("horizontal_door_top_rh")).texture("top", bygLoc("block/" + texture)).texture("particle", bygLoc("block/" + texture)));
    }
}