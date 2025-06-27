package com.shim.secretbygdoors.datagen;

import com.shim.secretbygdoors.SBYGBlocks;
import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;

import java.util.function.Consumer;

public class SBYGRecipes extends RecipeProvider {

    public SBYGRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        woodenDoor(SBYGBlocks.SECRET_ASPEN_PLANK_DOOR.get(), BYGBlocks.ASPEN_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_BAOBAB_PLANK_DOOR.get(), BYGBlocks.BAOBAB_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_BLUE_ENCHANTED_PLANK_DOOR.get(), BYGBlocks.BLUE_ENCHANTED_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_CHERRY_PLANK_DOOR.get(), BYGBlocks.CHERRY_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_CIKA_PLANK_DOOR.get(), BYGBlocks.CIKA_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_CYPRESS_PLANK_DOOR.get(), BYGBlocks.CYPRESS_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_EBONY_PLANK_DOOR.get(), BYGBlocks.EBONY_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_FIR_PLANK_DOOR.get(), BYGBlocks.FIR_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_GREEN_ENCHANTED_PLANK_DOOR.get(), BYGBlocks.GREEN_ENCHANTED_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_HOLLY_PLANK_DOOR.get(), BYGBlocks.HOLLY_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_JACARANDA_PLANK_DOOR.get(), BYGBlocks.JACARANDA_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_MAHOGANY_PLANK_DOOR.get(), BYGBlocks.MAHOGANY_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_MANGROVE_PLANK_DOOR.get(), BYGBlocks.MANGROVE_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_MAPLE_PLANK_DOOR.get(), BYGBlocks.MAPLE_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_PINE_PLANK_DOOR.get(), BYGBlocks.PINE_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_PLANK_DOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_REDWOOD_PLANK_DOOR.get(), BYGBlocks.REDWOOD_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_SKYRIS_PLANK_DOOR.get(), BYGBlocks.SKYRIS_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_WILLOW_PLANK_DOOR.get(), BYGBlocks.WILLOW_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_WITCH_HAZEL_PLANK_DOOR.get(), BYGBlocks.WITCH_HAZEL_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_ZELKOVA_PLANK_DOOR.get(), BYGBlocks.ZELKOVA_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_SYTHIAN_PLANK_DOOR.get(), BYGBlocks.SYTHIAN_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_EMBUR_PLANK_DOOR.get(), BYGBlocks.EMBUR_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_PALM_PLANK_DOOR.get(), BYGBlocks.PALM_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_LAMENT_PLANK_DOOR.get(), BYGBlocks.LAMENT_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_BULBIS_PLANK_DOOR.get(), BYGBlocks.BULBIS_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_NIGHTSHADE_PLANK_DOOR.get(), BYGBlocks.NIGHTSHADE_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_ETHER_PLANK_DOOR.get(), BYGBlocks.ETHER_PLANKS, consumer);
        woodenDoor(SBYGBlocks.SECRET_IMPARIUS_PLANK_DOOR.get(), BYGBlocks.IMPARIUS_PLANKS, consumer);

        verticalAndHorizontalDoor(SBYGBlocks.SECRET_ASPEN_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_ASPEN_LOG_DOOR.get(), BYGBlocks.ASPEN_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_BAOBAB_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_BAOBAB_LOG_DOOR.get(), BYGBlocks.BAOBAB_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_BLUE_ENCHANTED_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR.get(), BYGBlocks.BLUE_ENCHANTED_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_CHERRY_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_CHERRY_LOG_DOOR.get(), BYGBlocks.CHERRY_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_CIKA_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_CIKA_LOG_DOOR.get(), BYGBlocks.CIKA_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_CYPRESS_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_CYPRESS_LOG_DOOR.get(), BYGBlocks.CYPRESS_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_EBONY_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_EBONY_LOG_DOOR.get(), BYGBlocks.EBONY_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_FIR_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_FIR_LOG_DOOR.get(), BYGBlocks.FIR_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_GREEN_ENCHANTED_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR.get(), BYGBlocks.GREEN_ENCHANTED_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_HOLLY_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_HOLLY_LOG_DOOR.get(), BYGBlocks.HOLLY_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_JACARANDA_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_JACARANDA_LOG_DOOR.get(), BYGBlocks.JACARANDA_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_MAHOGANY_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), BYGBlocks.MAHOGANY_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_MANGROVE_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_MANGROVE_LOG_DOOR.get(), BYGBlocks.MANGROVE_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_MAPLE_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_MAPLE_LOG_DOOR.get(), BYGBlocks.MAPLE_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_PINE_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_PINE_LOG_DOOR.get(), BYGBlocks.PINE_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_REDWOOD_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_REDWOOD_LOG_DOOR.get(), BYGBlocks.REDWOOD_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_SKYRIS_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_SKYRIS_LOG_DOOR.get(), BYGBlocks.SKYRIS_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_WILLOW_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_WILLOW_LOG_DOOR.get(), BYGBlocks.WILLOW_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_WITCH_HAZEL_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_WITCH_HAZEL_LOG_DOOR.get(), BYGBlocks.WITCH_HAZEL_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_ZELKOVA_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_ZELKOVA_LOG_DOOR.get(), BYGBlocks.ZELKOVA_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_SYTHIAN_STEM_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_SYTHIAN_STEM_DOOR.get(), BYGBlocks.SYTHIAN_STEM, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_EMBUR_PEDU_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_EMBUR_PEDU_DOOR.get(), BYGBlocks.EMBUR_PEDU, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_PALM_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_PALM_LOG_DOOR.get(), BYGBlocks.PALM_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_LAMENT_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_LAMENT_LOG_DOOR.get(), BYGBlocks.LAMENT_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_BULBIS_STEM_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_BULBIS_STEM_DOOR.get(), BYGBlocks.BULBIS_STEM, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_NIGHTSHADE_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_NIGHTSHADE_LOG_DOOR.get(), BYGBlocks.NIGHTSHADE_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_ETHER_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_ETHER_LOG_DOOR.get(), BYGBlocks.ETHER_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_IMPARIUS_STEM_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_IMPARIUS_STEM_DOOR.get(), BYGBlocks.IMPARIUS_STEM, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_PALO_VERDE_LOG_DOOR.get(), SBYGBlocks.SECRET_HORIZONTAL_PALO_VERDE_LOG_DOOR.get(), BYGBlocks.PALO_VERDE_LOG, consumer);

        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_ASPEN_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ASPEN_LOG_DOOR.get(), BYGBlocks.STRIPPED_ASPEN_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_BAOBAB_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BAOBAB_LOG_DOOR.get(), BYGBlocks.STRIPPED_BAOBAB_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_BLUE_ENCHANTED_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR.get(), BYGBlocks.STRIPPED_BLUE_ENCHANTED_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_CHERRY_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR.get(), BYGBlocks.STRIPPED_CHERRY_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_CIKA_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CIKA_LOG_DOOR.get(), BYGBlocks.STRIPPED_CIKA_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_CYPRESS_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_CYPRESS_LOG_DOOR.get(), BYGBlocks.STRIPPED_CYPRESS_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_EBONY_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_EBONY_LOG_DOOR.get(), BYGBlocks.STRIPPED_EBONY_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_FIR_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR.get(), BYGBlocks.STRIPPED_FIR_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_GREEN_ENCHANTED_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR.get(), BYGBlocks.STRIPPED_GREEN_ENCHANTED_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_HOLLY_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_HOLLY_LOG_DOOR.get(), BYGBlocks.STRIPPED_HOLLY_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_JACARANDA_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR.get(), BYGBlocks.STRIPPED_JACARANDA_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_MAHOGANY_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR.get(), BYGBlocks.STRIPPED_MAHOGANY_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_MANGROVE_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR.get(), BYGBlocks.STRIPPED_MANGROVE_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_MAPLE_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR.get(), BYGBlocks.STRIPPED_MAPLE_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_PINE_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR.get(), BYGBlocks.STRIPPED_PINE_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR.get(), BYGBlocks.STRIPPED_RAINBOW_EUCALYPTUS_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_REDWOOD_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR.get(), BYGBlocks.STRIPPED_REDWOOD_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_SKYRIS_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_SKYRIS_LOG_DOOR.get(), BYGBlocks.STRIPPED_SKYRIS_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_WILLOW_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR.get(), BYGBlocks.STRIPPED_WILLOW_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_WITCH_HAZEL_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_WITCH_HAZEL_LOG_DOOR.get(), BYGBlocks.STRIPPED_WITCH_HAZEL_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_ZELKOVA_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ZELKOVA_LOG_DOOR.get(), BYGBlocks.STRIPPED_ZELKOVA_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_SYTHIAN_STEM_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_SYTHIAN_STEM_DOOR.get(), BYGBlocks.STRIPPED_SYTHIAN_STEM, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_EMBUR_PEDU_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_EMBUR_PEDU_DOOR.get(), BYGBlocks.STRIPPED_EMBUR_PEDU, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_PALM_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR.get(), BYGBlocks.STRIPPED_PALM_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_LAMENT_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_LAMENT_LOG_DOOR.get(), BYGBlocks.STRIPPED_LAMENT_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_BULBIS_STEM_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_BULBIS_STEM_DOOR.get(), BYGBlocks.STRIPPED_BULBIS_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_NIGHTSHADE_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_NIGHTSHADE_LOG_DOOR.get(), BYGBlocks.STRIPPED_NIGHTSHADE_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_ETHER_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_ETHER_LOG_DOOR.get(), BYGBlocks.STRIPPED_ETHER_LOG, consumer);
        verticalAndHorizontalDoor(SBYGBlocks.SECRET_STRIPPED_PALO_VERDE_LOG_DOOR.get(), SBYGBlocks.SECRET_STRIPPED_HORIZONTAL_PALO_VERDE_LOG_DOOR.get(), BYGBlocks.STRIPPED_PALO_VERDE_LOG, consumer);


        woodenDoor(SBYGBlocks.SECRET_ASPEN_BOOKSHELF_DOOR.get(), BYGBlocks.ASPEN_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_BAOBAB_BOOKSHELF_DOOR.get(), BYGBlocks.BAOBAB_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_BLUE_ENCHANTED_BOOKSHELF_DOOR.get(), BYGBlocks.BLUE_ENCHANTED_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_CHERRY_BOOKSHELF_DOOR.get(), BYGBlocks.CHERRY_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_CIKA_BOOKSHELF_DOOR.get(), BYGBlocks.CIKA_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_CYPRESS_BOOKSHELF_DOOR.get(), BYGBlocks.CYPRESS_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_EBONY_BOOKSHELF_DOOR.get(), BYGBlocks.EBONY_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_FIR_BOOKSHELF_DOOR.get(), BYGBlocks.FIR_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_GREEN_ENCHANTED_BOOKSHELF_DOOR.get(), BYGBlocks.GREEN_ENCHANTED_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_HOLLY_BOOKSHELF_DOOR.get(), BYGBlocks.HOLLY_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_JACARANDA_BOOKSHELF_DOOR.get(), BYGBlocks.JACARANDA_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_MAHOGANY_BOOKSHELF_DOOR.get(), BYGBlocks.MAHOGANY_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_MANGROVE_BOOKSHELF_DOOR.get(), BYGBlocks.MANGROVE_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_MAPLE_BOOKSHELF_DOOR.get(), BYGBlocks.MAPLE_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_PINE_BOOKSHELF_DOOR.get(), BYGBlocks.PINE_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_REDWOOD_BOOKSHELF_DOOR.get(), BYGBlocks.REDWOOD_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_SKYRIS_BOOKSHELF_DOOR.get(), BYGBlocks.SKYRIS_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_WILLOW_BOOKSHELF_DOOR.get(), BYGBlocks.WILLOW_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_WITCH_HAZEL_BOOKSHELF_DOOR.get(), BYGBlocks.WITCH_HAZEL_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_ZELKOVA_BOOKSHELF_DOOR.get(), BYGBlocks.ZELKOVA_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_SYTHIAN_BOOKSHELF_DOOR.get(), BYGBlocks.SYTHIAN_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_EMBUR_BOOKSHELF_DOOR.get(), BYGBlocks.EMBUR_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_PALM_BOOKSHELF_DOOR.get(), BYGBlocks.PALM_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_LAMENT_BOOKSHELF_DOOR.get(), BYGBlocks.LAMENT_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_BULBIS_BOOKSHELF_DOOR.get(), BYGBlocks.BULBIS_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_NIGHTSHADE_BOOKSHELF_DOOR.get(), BYGBlocks.NIGHTSHADE_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_ETHER_BOOKSHELF_DOOR.get(), BYGBlocks.ETHER_BOOKSHELF, consumer);
        woodenDoor(SBYGBlocks.SECRET_IMPARIUS_BOOKSHELF_DOOR.get(), BYGBlocks.IMPARIUS_BOOKSHELF, consumer);


        door(SBYGBlocks.SECRET_WHITE_SANDSTONE_DOOR.get(), BYGBlocks.WHITE_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_CUT_WHITE_SANDSTONE_DOOR.get(), BYGBlocks.WHITE_CUT_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_DOOR.get(), BYGBlocks.WHITE_SMOOTH_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_BLUE_SANDSTONE_DOOR.get(), BYGBlocks.BLUE_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_CUT_BLUE_SANDSTONE_DOOR.get(), BYGBlocks.BLUE_CUT_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_SMOOTH_BLUE_SANDSTONE_DOOR.get(), BYGBlocks.BLUE_SMOOTH_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_BLACK_SANDSTONE_DOOR.get(), BYGBlocks.BLACK_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_CUT_BLACK_SANDSTONE_DOOR.get(), BYGBlocks.BLACK_CUT_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_DOOR.get(), BYGBlocks.BLACK_SMOOTH_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_PURPLE_SANDSTONE_DOOR.get(), BYGBlocks.PURPLE_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_CUT_PURPLE_SANDSTONE_DOOR.get(), BYGBlocks.PURPLE_CUT_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_SMOOTH_PURPLE_SANDSTONE_DOOR.get(), BYGBlocks.PURPLE_SMOOTH_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_PINK_SANDSTONE_DOOR.get(), BYGBlocks.PINK_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_CUT_PINK_SANDSTONE_DOOR.get(), BYGBlocks.PINK_CUT_SANDSTONE, consumer);
        door(SBYGBlocks.SECRET_SMOOTH_PINK_SANDSTONE_DOOR.get(), BYGBlocks.PINK_SMOOTH_SANDSTONE, consumer);

        door(SBYGBlocks.SECRET_BLUE_NETHERRACK_DOOR.get(), BYGBlocks.BLUE_NETHERRACK, consumer);
        door(SBYGBlocks.SECRET_BLUE_NETHER_BRICK_DOOR.get(), BYGBlocks.BLUE_NETHERRACK_BRICKS, consumer);
        door(SBYGBlocks.SECRET_YELLOW_NETHER_BRICK_DOOR.get(), BYGBlocks.YELLOW_NETHER_BRICKS, consumer);

        door(SBYGBlocks.SECRET_MUD_BRICKS_DOOR.get(), BYGBlocks.MUD_BRICKS, consumer);
        door(SBYGBlocks.SECRET_BRIMSTONE_DOOR.get(), BYGBlocks.BRIMSTONE, consumer);
        door(SBYGBlocks.SECRET_PURPUR_STONE_DOOR.get(), BYGBlocks.PURPUR_STONE, consumer);
        door(SBYGBlocks.SECRET_ETHER_STONE_DOOR.get(), BYGBlocks.ETHER_STONE, consumer);
        door(SBYGBlocks.SECRET_COBBLED_ETHER_DOOR.get(), BYGBlocks.COBBLED_ETHER_STONE, consumer);
        door(SBYGBlocks.SECRET_DACITE_DOOR.get(), BYGBlocks.DACITE, consumer);
        door(SBYGBlocks.SECRET_DACITE_BRICKS_DOOR.get(), BYGBlocks.DACITE_BRICKS, consumer);
        door(SBYGBlocks.SECRET_DACITE_COBBLESTONE_DOOR.get(), BYGBlocks.DACITE_COBBLESTONE, consumer);
        door(SBYGBlocks.SECRET_DACITE_TILES_DOOR.get(), BYGBlocks.DACITE_TILE, consumer);
        door(SBYGBlocks.SECRET_RED_ROCK_DOOR.get(), BYGBlocks.RED_ROCK, consumer);
        door(SBYGBlocks.SECRET_RED_ROCK_BRICKS_DOOR.get(), BYGBlocks.RED_ROCK_BRICKS, consumer);
        door(SBYGBlocks.SECRET_ROCKY_STONE_DOOR.get(), BYGBlocks.ROCKY_STONE, consumer);
        door(SBYGBlocks.SECRET_TRAVERTINE_DOOR.get(), BYGBlocks.TRAVERTINE, consumer);
        door(SBYGBlocks.SECRET_POLISHED_TRAVERTINE_DOOR.get(), BYGBlocks.POLISHED_TRAVERTINE, consumer);
        door(SBYGBlocks.SECRET_SCORIA_STONE_DOOR.get(), BYGBlocks.SCORIA_STONE, consumer);
        door(SBYGBlocks.SECRET_SCORIA_COBBLESTONE_DOOR.get(), BYGBlocks.SCORIA_COBBLESTONE, consumer);
        door(SBYGBlocks.SECRET_SCORIA_STONE_BRICKS_DOOR.get(), BYGBlocks.SCORIA_STONEBRICKS, consumer);
        door(SBYGBlocks.SECRET_SOAPSTONE_DOOR.get(), BYGBlocks.SOAPSTONE, consumer);
        door(SBYGBlocks.SECRET_POLISHED_SOAPSTONE_DOOR.get(), BYGBlocks.POLISHED_SOAPSTONE, consumer);
        door(SBYGBlocks.SECRET_SOAPSTONE_BRICKS_DOOR.get(), BYGBlocks.SOAPSTONE_BRICKS, consumer);
        door(SBYGBlocks.SECRET_SOAPSTONE_TILES_DOOR.get(), BYGBlocks.SOAPSTONE_TILE, consumer);
        door(SBYGBlocks.SECRET_MAGMATIC_STONE_DOOR.get(), BYGBlocks.MAGMATIC_STONE, consumer);
        door(SBYGBlocks.SECRET_THERIUM_DOOR.get(), BYGBlocks.THERIUM_BLOCK, consumer);
        door(SBYGBlocks.SECRET_CRYPTIC_STONE_DOOR.get(), BYGBlocks.CRYPTIC_STONE, consumer);


        woodenTrapdoor(SBYGBlocks.SECRET_ASPEN_PLANK_TRAPDOOR.get(), BYGBlocks.ASPEN_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BAOBAB_PLANK_TRAPDOOR.get(), BYGBlocks.BAOBAB_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BLUE_ENCHANTED_PLANK_TRAPDOOR.get(), BYGBlocks.BLUE_ENCHANTED_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CHERRY_PLANK_TRAPDOOR.get(), BYGBlocks.CHERRY_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CIKA_PLANK_TRAPDOOR.get(), BYGBlocks.CIKA_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CYPRESS_PLANK_TRAPDOOR.get(), BYGBlocks.CYPRESS_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_EBONY_PLANK_TRAPDOOR.get(), BYGBlocks.EBONY_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_FIR_PLANK_TRAPDOOR.get(), BYGBlocks.FIR_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_GREEN_ENCHANTED_PLANK_TRAPDOOR.get(), BYGBlocks.GREEN_ENCHANTED_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_HOLLY_PLANK_TRAPDOOR.get(), BYGBlocks.HOLLY_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_JACARANDA_PLANK_TRAPDOOR.get(), BYGBlocks.JACARANDA_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MAHOGANY_PLANK_TRAPDOOR.get(), BYGBlocks.MAHOGANY_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MANGROVE_PLANK_TRAPDOOR.get(), BYGBlocks.MANGROVE_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MAPLE_PLANK_TRAPDOOR.get(), BYGBlocks.MAPLE_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_PINE_PLANK_TRAPDOOR.get(), BYGBlocks.PINE_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_REDWOOD_PLANK_TRAPDOOR.get(), BYGBlocks.REDWOOD_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_SKYRIS_PLANK_TRAPDOOR.get(), BYGBlocks.SKYRIS_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_WILLOW_PLANK_TRAPDOOR.get(), BYGBlocks.WILLOW_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_WITCH_HAZEL_PLANK_TRAPDOOR.get(), BYGBlocks.WITCH_HAZEL_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_ZELKOVA_PLANK_TRAPDOOR.get(), BYGBlocks.ZELKOVA_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_SYTHIAN_PLANK_TRAPDOOR.get(), BYGBlocks.SYTHIAN_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_EMBUR_PLANK_TRAPDOOR.get(), BYGBlocks.EMBUR_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_PALM_PLANK_TRAPDOOR.get(), BYGBlocks.PALM_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_LAMENT_PLANK_TRAPDOOR.get(), BYGBlocks.LAMENT_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BULBIS_PLANK_TRAPDOOR.get(), BYGBlocks.BULBIS_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_NIGHTSHADE_PLANK_TRAPDOOR.get(), BYGBlocks.NIGHTSHADE_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_ETHER_PLANK_TRAPDOOR.get(), BYGBlocks.ETHER_PLANKS, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_IMPARIUS_PLANK_TRAPDOOR.get(), BYGBlocks.IMPARIUS_PLANKS, consumer);
        
        woodenTrapdoor(SBYGBlocks.SECRET_ASPEN_LOG_TRAPDOOR.get(), BYGBlocks.ASPEN_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BAOBAB_LOG_TRAPDOOR.get(), BYGBlocks.BAOBAB_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), BYGBlocks.BLUE_ENCHANTED_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CHERRY_LOG_TRAPDOOR.get(), BYGBlocks.CHERRY_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CIKA_LOG_TRAPDOOR.get(), BYGBlocks.CIKA_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CYPRESS_LOG_TRAPDOOR.get(), BYGBlocks.CYPRESS_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_EBONY_LOG_TRAPDOOR.get(), BYGBlocks.EBONY_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_FIR_LOG_TRAPDOOR.get(), BYGBlocks.FIR_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), BYGBlocks.GREEN_ENCHANTED_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_HOLLY_LOG_TRAPDOOR.get(), BYGBlocks.HOLLY_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_JACARANDA_LOG_TRAPDOOR.get(), BYGBlocks.JACARANDA_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MAHOGANY_LOG_TRAPDOOR.get(), BYGBlocks.MAHOGANY_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MANGROVE_LOG_TRAPDOOR.get(), BYGBlocks.MANGROVE_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MAPLE_LOG_TRAPDOOR.get(), BYGBlocks.MAPLE_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_PINE_LOG_TRAPDOOR.get(), BYGBlocks.PINE_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_REDWOOD_LOG_TRAPDOOR.get(), BYGBlocks.REDWOOD_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_SKYRIS_LOG_TRAPDOOR.get(), BYGBlocks.SKYRIS_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_WILLOW_LOG_TRAPDOOR.get(), BYGBlocks.WILLOW_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_WITCH_HAZEL_LOG_TRAPDOOR.get(), BYGBlocks.WITCH_HAZEL_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_ZELKOVA_LOG_TRAPDOOR.get(), BYGBlocks.ZELKOVA_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_SYTHIAN_STEM_TRAPDOOR.get(), BYGBlocks.SYTHIAN_STEM, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_EMBUR_PEDU_TRAPDOOR.get(), BYGBlocks.EMBUR_PEDU, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_PALM_LOG_TRAPDOOR.get(), BYGBlocks.PALM_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_LAMENT_LOG_TRAPDOOR.get(), BYGBlocks.LAMENT_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BULBIS_STEM_TRAPDOOR.get(), BYGBlocks.BULBIS_STEM, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_NIGHTSHADE_LOG_TRAPDOOR.get(), BYGBlocks.NIGHTSHADE_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_ETHER_LOG_TRAPDOOR.get(), BYGBlocks.ETHER_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_IMPARIUS_STEM_TRAPDOOR.get(), BYGBlocks.IMPARIUS_STEM, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_PALO_VERDE_LOG_TRAPDOOR.get(), BYGBlocks.PALO_VERDE_LOG, consumer);


        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_ASPEN_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_ASPEN_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_BAOBAB_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_BAOBAB_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_BLUE_ENCHANTED_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_BLUE_ENCHANTED_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_CHERRY_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_CIKA_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_CIKA_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_CYPRESS_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_CYPRESS_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_EBONY_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_EBONY_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_FIR_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_FIR_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_GREEN_ENCHANTED_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_GREEN_ENCHANTED_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_HOLLY_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_HOLLY_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_JACARANDA_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_MAHOGANY_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_MANGROVE_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_MAPLE_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_PINE_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_PINE_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_RAINBOW_EUCALYPTUS_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_REDWOOD_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_SKYRIS_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_SKYRIS_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_WILLOW_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_WITCH_HAZEL_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_WITCH_HAZEL_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_ZELKOVA_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_ZELKOVA_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_SYTHIAN_STEM_TRAPDOOR.get(), BYGBlocks.STRIPPED_SYTHIAN_STEM, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_EMBUR_PEDU_TRAPDOOR.get(), BYGBlocks.STRIPPED_EMBUR_PEDU, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_PALM_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_PALM_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_LAMENT_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_LAMENT_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_BULBIS_STEM_TRAPDOOR.get(), BYGBlocks.STRIPPED_BULBIS_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_NIGHTSHADE_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_NIGHTSHADE_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_ETHER_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_ETHER_LOG, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_STRIPPED_PALO_VERDE_LOG_TRAPDOOR.get(), BYGBlocks.STRIPPED_PALO_VERDE_LOG, consumer);

        woodenTrapdoor(SBYGBlocks.SECRET_ASPEN_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.ASPEN_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BAOBAB_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.BAOBAB_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.BLUE_ENCHANTED_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CHERRY_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.CHERRY_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CIKA_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.CIKA_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_CYPRESS_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.CYPRESS_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_EBONY_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.EBONY_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_FIR_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.FIR_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.GREEN_ENCHANTED_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_HOLLY_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.HOLLY_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_JACARANDA_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.JACARANDA_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MAHOGANY_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.MAHOGANY_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MANGROVE_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.MANGROVE_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_MAPLE_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.MAPLE_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_PINE_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.PINE_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.RAINBOW_EUCALYPTUS_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_REDWOOD_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.REDWOOD_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_SKYRIS_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.SKYRIS_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_WILLOW_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.WILLOW_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_WITCH_HAZEL_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.WITCH_HAZEL_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_ZELKOVA_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.ZELKOVA_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_SYTHIAN_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.SYTHIAN_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_EMBUR_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.EMBUR_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_PALM_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.PALM_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_LAMENT_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.LAMENT_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_BULBIS_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.BULBIS_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_NIGHTSHADE_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.NIGHTSHADE_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_ETHER_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.ETHER_BOOKSHELF, consumer);
        woodenTrapdoor(SBYGBlocks.SECRET_IMPARIUS_BOOKSHELF_TRAPDOOR.get(), BYGBlocks.IMPARIUS_BOOKSHELF, consumer);


        trapdoor(SBYGBlocks.SECRET_WHITE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.WHITE_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.WHITE_CUT_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.WHITE_SMOOTH_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_BLUE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.BLUE_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_CUT_BLUE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.BLUE_CUT_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_SMOOTH_BLUE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.BLUE_SMOOTH_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_BLACK_SANDSTONE_TRAPDOOR.get(), BYGBlocks.BLACK_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR.get(), BYGBlocks.BLACK_CUT_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR.get(), BYGBlocks.BLACK_SMOOTH_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_PURPLE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.PURPLE_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_CUT_PURPLE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.PURPLE_CUT_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_SMOOTH_PURPLE_SANDSTONE_TRAPDOOR.get(), BYGBlocks.PURPLE_SMOOTH_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_PINK_SANDSTONE_TRAPDOOR.get(), BYGBlocks.PINK_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_CUT_PINK_SANDSTONE_TRAPDOOR.get(), BYGBlocks.PINK_CUT_SANDSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_SMOOTH_PINK_SANDSTONE_TRAPDOOR.get(), BYGBlocks.PINK_SMOOTH_SANDSTONE, consumer);

        trapdoor(SBYGBlocks.SECRET_BLUE_NETHERRACK_TRAPDOOR.get(), BYGBlocks.BLUE_NETHERRACK, consumer);
        trapdoor(SBYGBlocks.SECRET_BLUE_NETHER_BRICK_TRAPDOOR.get(), BYGBlocks.BLUE_NETHERRACK_BRICKS, consumer);
        trapdoor(SBYGBlocks.SECRET_YELLOW_NETHER_BRICK_TRAPDOOR.get(), BYGBlocks.YELLOW_NETHER_BRICKS, consumer);

        trapdoor(SBYGBlocks.SECRET_MUD_BRICKS_TRAPDOOR.get(), BYGBlocks.MUD_BRICKS, consumer);
        trapdoor(SBYGBlocks.SECRET_BRIMSTONE_TRAPDOOR.get(), BYGBlocks.BRIMSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_PURPUR_STONE_TRAPDOOR.get(), BYGBlocks.PURPUR_STONE, consumer);
        trapdoor(SBYGBlocks.SECRET_ETHER_STONE_TRAPDOOR.get(), BYGBlocks.ETHER_STONE, consumer);
        trapdoor(SBYGBlocks.SECRET_COBBLED_ETHER_TRAPDOOR.get(), BYGBlocks.COBBLED_ETHER_STONE, consumer);
        trapdoor(SBYGBlocks.SECRET_DACITE_TRAPDOOR.get(), BYGBlocks.DACITE, consumer);
        trapdoor(SBYGBlocks.SECRET_DACITE_BRICKS_TRAPDOOR.get(), BYGBlocks.DACITE_BRICKS, consumer);
        trapdoor(SBYGBlocks.SECRET_DACITE_COBBLESTONE_TRAPDOOR.get(), BYGBlocks.DACITE_COBBLESTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_DACITE_TILES_TRAPDOOR.get(), BYGBlocks.DACITE_TILE, consumer);
        trapdoor(SBYGBlocks.SECRET_RED_ROCK_TRAPDOOR.get(), BYGBlocks.RED_ROCK, consumer);
        trapdoor(SBYGBlocks.SECRET_RED_ROCK_BRICKS_TRAPDOOR.get(), BYGBlocks.RED_ROCK_BRICKS, consumer);
        trapdoor(SBYGBlocks.SECRET_ROCKY_STONE_TRAPDOOR.get(), BYGBlocks.ROCKY_STONE, consumer);
        trapdoor(SBYGBlocks.SECRET_TRAVERTINE_TRAPDOOR.get(), BYGBlocks.TRAVERTINE, consumer);
        trapdoor(SBYGBlocks.SECRET_POLISHED_TRAVERTINE_TRAPDOOR.get(), BYGBlocks.POLISHED_TRAVERTINE, consumer);
        trapdoor(SBYGBlocks.SECRET_SCORIA_STONE_TRAPDOOR.get(), BYGBlocks.SCORIA_STONE, consumer);
        trapdoor(SBYGBlocks.SECRET_SCORIA_COBBLESTONE_TRAPDOOR.get(), BYGBlocks.SCORIA_COBBLESTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_SCORIA_STONE_BRICKS_TRAPDOOR.get(), BYGBlocks.SCORIA_STONEBRICKS, consumer);
        trapdoor(SBYGBlocks.SECRET_SOAPSTONE_TRAPDOOR.get(), BYGBlocks.SOAPSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_POLISHED_SOAPSTONE_TRAPDOOR.get(), BYGBlocks.POLISHED_SOAPSTONE, consumer);
        trapdoor(SBYGBlocks.SECRET_SOAPSTONE_BRICKS_TRAPDOOR.get(), BYGBlocks.SOAPSTONE_BRICKS, consumer);
        trapdoor(SBYGBlocks.SECRET_SOAPSTONE_TILES_TRAPDOOR.get(), BYGBlocks.SOAPSTONE_TILE, consumer);
        trapdoor(SBYGBlocks.SECRET_MAGMATIC_STONE_TRAPDOOR.get(), BYGBlocks.MAGMATIC_STONE, consumer);
        trapdoor(SBYGBlocks.SECRET_THERIUM_TRAPDOOR.get(), BYGBlocks.THERIUM_BLOCK, consumer);
        trapdoor(SBYGBlocks.SECRET_CRYPTIC_STONE_TRAPDOOR.get(), BYGBlocks.CRYPTIC_STONE, consumer);
    }

    public static void woodenDoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem).pattern("X X").pattern(" # ").pattern("X X").define('X', craftItem).define('#', ItemTags.WOODEN_DOORS).unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void door(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void horizontalDoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("XXX").pattern(" # ").pattern("XXX")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void verticalDoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern("X#X").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_DOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void verticalAndHorizontalDoor(Block verticalDoor, Block horizontalDoor, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        verticalDoor(verticalDoor, craftItem, consumer);
        horizontalDoor(horizontalDoor, craftItem, consumer);
    }

    public static void woodenTrapdoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.WOODEN_TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }

    public static void trapdoor(Block doorItem, Block craftItem, Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(doorItem)
                .pattern("X X").pattern(" # ").pattern("X X")
                .define('X', craftItem).define('#', ItemTags.TRAPDOORS)
                .unlockedBy("has_" + craftItem.getRegistryName().getPath(), has(craftItem)).save(consumer);
    }
}