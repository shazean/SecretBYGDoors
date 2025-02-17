package com.shim.secretbygdoors;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Supplier;

public class SBYGBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SecretBYGDoors.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SecretBYGDoors.MODID);

    public static final Map<RegistryObject<? extends Block>, String> BLOCK_LANG_EN_US = new HashMap<>();
    public static final LinkedList<RegistryObject<? extends Block>> DOOR_LOOT_TABLE = new LinkedList<>();
    public static final LinkedList<RegistryObject<? extends Block>> TRAPDOOR_LOOT_TABLE = new LinkedList<>();

    protected static Block.Properties WOOD_PROPERTIES = Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion();
    protected static Block.Properties STONE_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.STONE).noOcclusion();
    protected static Block.Properties NETHERRACK_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHERRACK).noOcclusion();
    protected static Block.Properties NETHERBRICK_PROPERTIES = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.NETHER_BRICKS).noOcclusion();

    private static <T extends DoorBlock> RegistryObject<T> registerDoorBlockBase(String nameIn, String localizationIn, Supplier<T> blockIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        DOOR_LOOT_TABLE.add(block);
        return block;
    }

    public static <T extends DoorBlock> RegistryObject<T> registerDoorBlock(String doorNameIn, String doorLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlockBase("secret_" + doorNameIn + "_door", "Secret " + doorLocalizationIn + " Door", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerPlankDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock(woodTypeIn + "_plank", woodLocalizationIn + " Plank", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerLogDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock(woodTypeIn + "_log", woodLocalizationIn + " Log", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStemDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock(woodTypeIn + "_stem", woodLocalizationIn + " Stem", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStrippedLogDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_" + woodTypeIn + "_log", "Stripped " + woodLocalizationIn + " Log", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStrippedStemDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_" + woodTypeIn + "_stem", "Stripped " + woodLocalizationIn + " Stem", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStrippedHorizontalLogDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_horizontal_" + woodTypeIn + "_log", "Stripped Horizontal " + woodLocalizationIn + " Log", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerStrippedHorizontalStemDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock("stripped_horizontal_" + woodTypeIn + "_stem", "Stripped Horizontal " + woodLocalizationIn + " Stem", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerHorizontalLogDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock("horizontal_" + woodTypeIn + "_log", "Horizontal " + woodLocalizationIn + " Log", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerHorizontalStemDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock("horizontal_" + woodTypeIn + "_stem", "Horizontal " + woodLocalizationIn + " Stem", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerBookshelfDoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerDoorBlock(woodTypeIn + "_bookshelf", woodLocalizationIn + " Bookshelf", blockIn);
    }

    public static <T extends DoorBlock> RegistryObject<T> registerSandstoneDoorBlock(String nameIn, String localizationIn, Supplier<T> blockIn) {
        return registerDoorBlock(nameIn + "_sandstone", localizationIn + " Sandstone", blockIn);
    }

    private static <T extends Block> RegistryObject<T> registerTrapdoorBlockBase(String nameIn, String localizationIn, Supplier<T> blockIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        TRAPDOOR_LOOT_TABLE.add(block);
        return block;
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerTrapdoorBlock(String doorNameIn, String doorLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlockBase("secret_" + doorNameIn + "_trapdoor", "Secret " + doorLocalizationIn + " Trapdoor", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerPlankTrapdoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlock(woodTypeIn + "_plank", woodLocalizationIn + " Plank", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerLogTrapdoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlock(woodTypeIn + "_log", woodLocalizationIn + " Log", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerStemTrapdoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlock(woodTypeIn + "_stem", woodLocalizationIn + " Stem", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerStrippedLogTrapdoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlock("stripped_" + woodTypeIn + "_log", "Stripped " + woodLocalizationIn + " Log", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerStrippedStemTrapdoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlock("stripped_" + woodTypeIn + "_stem", "Stripped " + woodLocalizationIn + " Stem", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerBookshelfTrapdoorBlock(String woodTypeIn, String woodLocalizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlock(woodTypeIn + "_bookshelf", woodLocalizationIn + " Bookshelf", blockIn);
    }

    public static <T extends TrapDoorBlock> RegistryObject<T> registerSandstoneTrapdoorBlock(String nameIn, String localizationIn, Supplier<T> blockIn) {
        return registerTrapdoorBlock(nameIn + "_sandstone", localizationIn + " Sandstone", blockIn);
    }
    

    public static RegistryObject<DoorBlock> SECRET_ASPEN_PLANK_DOOR = registerPlankDoorBlock("aspen", "Aspen", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BAOBAB_PLANK_DOOR = registerPlankDoorBlock("baobab", "Baobab", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BLUE_ENCHANTED_PLANK_DOOR = registerPlankDoorBlock("blue_enchanted", "Blue Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CHERRY_PLANK_DOOR = registerPlankDoorBlock("cherry", "Cherry", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CIKA_PLANK_DOOR = registerPlankDoorBlock("cika", "Cika", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CYPRESS_PLANK_DOOR = registerPlankDoorBlock("cypress", "Cypress", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_EBONY_PLANK_DOOR = registerPlankDoorBlock("ebony", "Ebony", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_FIR_PLANK_DOOR = registerPlankDoorBlock("fir", "Fir", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_GREEN_ENCHANTED_PLANK_DOOR = registerPlankDoorBlock("green_enchanted", "Green Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HOLLY_PLANK_DOOR = registerPlankDoorBlock("holly", "Holly", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_JACARANDA_PLANK_DOOR = registerPlankDoorBlock("jacaranda", "Jacaranda", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MAHOGANY_PLANK_DOOR = registerPlankDoorBlock("mahogany", "Mahogany", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MANGROVE_PLANK_DOOR = registerPlankDoorBlock("mangrove", "Mangrove", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MAPLE_PLANK_DOOR = registerPlankDoorBlock("maple", "Maple", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PINE_PLANK_DOOR = registerPlankDoorBlock("pine", "Pine", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_RAINBOW_EUCALYPTUS_PLANK_DOOR = registerPlankDoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_REDWOOD_PLANK_DOOR = registerPlankDoorBlock("redwood", "Redwood", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SKYRIS_PLANK_DOOR = registerPlankDoorBlock("skyris", "Skyris", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_WILLOW_PLANK_DOOR = registerPlankDoorBlock("willow", "Willow", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_WITCH_HAZEL_PLANK_DOOR = registerPlankDoorBlock("witch_hazel", "Witch Hazel", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_ZELKOVA_PLANK_DOOR = registerPlankDoorBlock("zelkova", "Zelkova", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SYTHIAN_PLANK_DOOR = registerPlankDoorBlock("sythian", "Sythian", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_EMBUR_PLANK_DOOR = registerPlankDoorBlock("embur", "Embur", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PALM_PLANK_DOOR = registerPlankDoorBlock("palm", "Palm", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_LAMENT_PLANK_DOOR = registerPlankDoorBlock("lament", "Lament", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BULBIS_PLANK_DOOR = registerPlankDoorBlock("bulbis", "Bulbis", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_NIGHTSHADE_PLANK_DOOR = registerPlankDoorBlock("nightshade", "Nightshade", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_ETHER_PLANK_DOOR = registerPlankDoorBlock("ether", "Ether", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_IMPARIUS_PLANK_DOOR = registerPlankDoorBlock("imparius", "Imparius", () -> new DoorBlock(WOOD_PROPERTIES));

    public static RegistryObject<DoorBlock> SECRET_ASPEN_LOG_DOOR = registerLogDoorBlock("aspen", "Aspen", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BAOBAB_LOG_DOOR = registerLogDoorBlock("baobab", "Baobab", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BLUE_ENCHANTED_LOG_DOOR = registerLogDoorBlock("blue_enchanted", "Blue Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CHERRY_LOG_DOOR = registerLogDoorBlock("cherry", "Cherry", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CIKA_LOG_DOOR = registerLogDoorBlock("cika", "Cika", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CYPRESS_LOG_DOOR = registerLogDoorBlock("cypress", "Cypress", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_EBONY_LOG_DOOR = registerLogDoorBlock("ebony", "Ebony", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_FIR_LOG_DOOR = registerLogDoorBlock("fir", "Fir", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_GREEN_ENCHANTED_LOG_DOOR = registerLogDoorBlock("green_enchanted", "Green Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HOLLY_LOG_DOOR = registerLogDoorBlock("holly", "Holly", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_JACARANDA_LOG_DOOR = registerLogDoorBlock("jacaranda", "Jacaranda", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MAHOGANY_LOG_DOOR = registerLogDoorBlock("mahogany", "Mahogany", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MANGROVE_LOG_DOOR = registerLogDoorBlock("mangrove", "Mangrove", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MAPLE_LOG_DOOR = registerLogDoorBlock("maple", "Maple", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PINE_LOG_DOOR = registerLogDoorBlock("pine", "Pine", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_RAINBOW_EUCALYPTUS_LOG_DOOR = registerLogDoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_REDWOOD_LOG_DOOR = registerLogDoorBlock("redwood", "Redwood", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SKYRIS_LOG_DOOR = registerLogDoorBlock("skyris", "Skyris", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_WILLOW_LOG_DOOR = registerLogDoorBlock("willow", "Willow", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_WITCH_HAZEL_LOG_DOOR = registerLogDoorBlock("witch_hazel", "Witch Hazel", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_ZELKOVA_LOG_DOOR = registerLogDoorBlock("zelkova", "Zelkova", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SYTHIAN_STEM_DOOR = registerStemDoorBlock("sythian", "Sythian", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_EMBUR_PEDU_DOOR = registerDoorBlock("embur_pedu", "Embur Pedu", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PALM_LOG_DOOR = registerLogDoorBlock("palm", "Palm", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_LAMENT_LOG_DOOR = registerLogDoorBlock("lament", "Lament", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BULBIS_STEM_DOOR = registerStemDoorBlock("bulbis", "Bulbis", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_NIGHTSHADE_LOG_DOOR = registerLogDoorBlock("nightshade", "Nightshade", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_ETHER_LOG_DOOR = registerLogDoorBlock("ether", "Ether", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_IMPARIUS_STEM_DOOR = registerStemDoorBlock("imparius", "Imparius", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PALO_VERDE_LOG_DOOR = registerLogDoorBlock("palo_verde", "Palo Verde", () -> new DoorBlock(WOOD_PROPERTIES));

    public static RegistryObject<DoorBlock> SECRET_STRIPPED_ASPEN_LOG_DOOR = registerStrippedLogDoorBlock("aspen", "Aspen", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BAOBAB_LOG_DOOR = registerStrippedLogDoorBlock("baobab", "Baobab", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BLUE_ENCHANTED_LOG_DOOR = registerStrippedLogDoorBlock("blue_enchanted", "Blue Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_CHERRY_LOG_DOOR = registerStrippedLogDoorBlock("cherry", "Cherry", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_CIKA_LOG_DOOR = registerStrippedLogDoorBlock("cika", "Cika", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_CYPRESS_LOG_DOOR = registerStrippedLogDoorBlock("cypress", "Cypress", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_EBONY_LOG_DOOR = registerStrippedLogDoorBlock("ebony", "Ebony", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_FIR_LOG_DOOR = registerStrippedLogDoorBlock("fir", "Fir", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_GREEN_ENCHANTED_LOG_DOOR = registerStrippedLogDoorBlock("green_enchanted", "Green Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HOLLY_LOG_DOOR = registerStrippedLogDoorBlock("holly", "Holly", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_JACARANDA_LOG_DOOR = registerStrippedLogDoorBlock("jacaranda", "Jacaranda", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_MAHOGANY_LOG_DOOR = registerStrippedLogDoorBlock("mahogany", "Mahogany", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_MANGROVE_LOG_DOOR = registerStrippedLogDoorBlock("mangrove", "Mangrove", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_MAPLE_LOG_DOOR = registerStrippedLogDoorBlock("maple", "Maple", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_PINE_LOG_DOOR = registerStrippedLogDoorBlock("pine", "Pine", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_DOOR = registerStrippedLogDoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_REDWOOD_LOG_DOOR = registerStrippedLogDoorBlock("redwood", "Redwood", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_SKYRIS_LOG_DOOR = registerStrippedLogDoorBlock("skyris", "Skyris", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_WILLOW_LOG_DOOR = registerStrippedLogDoorBlock("willow", "Willow", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_WITCH_HAZEL_LOG_DOOR = registerStrippedLogDoorBlock("witch_hazel", "Witch Hazel", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_ZELKOVA_LOG_DOOR = registerStrippedLogDoorBlock("zelkova", "Zelkova", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_SYTHIAN_STEM_DOOR = registerStrippedStemDoorBlock("sythian", "Sythian", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_EMBUR_PEDU_DOOR = registerDoorBlock("stripped_embur_pedu", "Stripped Embur Pedu", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_PALM_LOG_DOOR = registerStrippedLogDoorBlock("palm", "Palm", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_LAMENT_LOG_DOOR = registerStrippedLogDoorBlock("lament", "Lament", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_BULBIS_STEM_DOOR = registerStrippedStemDoorBlock("bulbis", "Bulbis", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_NIGHTSHADE_LOG_DOOR = registerStrippedLogDoorBlock("nightshade", "Nightshade", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_ETHER_LOG_DOOR = registerStrippedStemDoorBlock("ether", "Ether", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_PALO_VERDE_LOG_DOOR = registerStrippedLogDoorBlock("palo_verde", "Palo Verde", () -> new DoorBlock(WOOD_PROPERTIES));

    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_ASPEN_LOG_DOOR = registerHorizontalLogDoorBlock("aspen", "Aspen", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BAOBAB_LOG_DOOR = registerHorizontalLogDoorBlock("baobab", "Baobab", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR = registerHorizontalLogDoorBlock("blue_enchanted", "Blue Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_CHERRY_LOG_DOOR = registerHorizontalLogDoorBlock("cherry", "Cherry", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_CIKA_LOG_DOOR = registerHorizontalLogDoorBlock("cika", "Cika", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_CYPRESS_LOG_DOOR = registerHorizontalLogDoorBlock("cypress", "Cypress", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_EBONY_LOG_DOOR = registerHorizontalLogDoorBlock("ebony", "Ebony", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_FIR_LOG_DOOR = registerHorizontalLogDoorBlock("fir", "Fir", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR = registerHorizontalLogDoorBlock("green_enchanted", "Green Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_HOLLY_LOG_DOOR = registerHorizontalLogDoorBlock("holly", "Holly", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_JACARANDA_LOG_DOOR = registerHorizontalLogDoorBlock("jacaranda", "Jacaranda", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_MAHOGANY_LOG_DOOR = registerHorizontalLogDoorBlock("mahogany", "Mahogany", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_MANGROVE_LOG_DOOR = registerHorizontalLogDoorBlock("mangrove", "Mangrove", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_MAPLE_LOG_DOOR = registerHorizontalLogDoorBlock("maple", "Maple", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_PINE_LOG_DOOR = registerHorizontalLogDoorBlock("pine", "Pine", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR = registerHorizontalLogDoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_REDWOOD_LOG_DOOR = registerHorizontalLogDoorBlock("redwood", "Redwood", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_SKYRIS_LOG_DOOR = registerHorizontalLogDoorBlock("skyris", "Skyris", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_WILLOW_LOG_DOOR = registerHorizontalLogDoorBlock("willow", "Willow", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_WITCH_HAZEL_LOG_DOOR = registerHorizontalLogDoorBlock("witch_hazel", "Witch Hazel", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_ZELKOVA_LOG_DOOR = registerHorizontalLogDoorBlock("zelkova", "Zelkova", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_SYTHIAN_STEM_DOOR = registerHorizontalStemDoorBlock("sythian", "Sythian", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_EMBUR_PEDU_DOOR = registerDoorBlock("horizontal_embur_pedu", "Horizontal Embur Pedu", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_PALM_LOG_DOOR = registerHorizontalLogDoorBlock("palm", "Palm", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_LAMENT_LOG_DOOR = registerHorizontalLogDoorBlock("lament", "Lament", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_BULBIS_STEM_DOOR = registerHorizontalStemDoorBlock("bulbis", "Bulbis", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_NIGHTSHADE_LOG_DOOR = registerHorizontalLogDoorBlock("nightshade", "Nightshade", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_ETHER_LOG_DOOR = registerHorizontalLogDoorBlock("ether", "Ether", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_IMPARIUS_STEM_DOOR = registerHorizontalStemDoorBlock("imparius", "Imparius", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HORIZONTAL_PALO_VERDE_LOG_DOOR = registerHorizontalLogDoorBlock("palo_verde", "Palo Verde", () -> new DoorBlock(WOOD_PROPERTIES));

    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ASPEN_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("aspen", "Aspen", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BAOBAB_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("baobab", "Baobab", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BLUE_ENCHANTED_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("blue_enchanted", "Blue Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CHERRY_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("cherry", "Cherry", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CIKA_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("cika", "Cika", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_CYPRESS_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("cypress", "Cypress", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_EBONY_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("ebony", "Ebony", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_FIR_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("fir", "Fir", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_GREEN_ENCHANTED_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("green_enchanted", "Green Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_HOLLY_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("holly", "Holly", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_JACARANDA_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("jacaranda", "Jacaranda", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MAHOGANY_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("mahogany", "Mahogany", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MANGROVE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("mangrove", "Mangrove", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_MAPLE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("maple", "Maple", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_PINE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("pine", "Pine", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_RAINBOW_EUCALYPTUS_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_REDWOOD_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("redwood", "Redwood", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_SKYRIS_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("skyris", "Skyris", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WILLOW_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("willow", "Willow", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_WITCH_HAZEL_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("witch_hazel", "Witch Hazel", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ZELKOVA_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("zelkova", "Zelkova", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_SYTHIAN_STEM_DOOR = registerStrippedHorizontalStemDoorBlock("sythian", "Sythian", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_EMBUR_PEDU_DOOR = registerDoorBlock("stripped_horizontal_embur_pedu", "Stripped Horizontal Embur Pedu", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_PALM_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("palm", "Palm", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_LAMENT_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("lament", "Lament", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_BULBIS_STEM_DOOR = registerStrippedHorizontalStemDoorBlock("bulbis", "Bulbis", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_NIGHTSHADE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("nightshade", "Nightshade", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_ETHER_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("ether", "Ether", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_STRIPPED_HORIZONTAL_PALO_VERDE_LOG_DOOR = registerStrippedHorizontalLogDoorBlock("palo_verde", "Palo Verde", () -> new DoorBlock(WOOD_PROPERTIES));

    public static RegistryObject<DoorBlock> SECRET_ASPEN_BOOKSHELF_DOOR = registerBookshelfDoorBlock("aspen", "Aspen", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BAOBAB_BOOKSHELF_DOOR = registerBookshelfDoorBlock("baobab", "Baobab", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BLUE_ENCHANTED_BOOKSHELF_DOOR = registerBookshelfDoorBlock("blue_enchanted", "Blue Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CHERRY_BOOKSHELF_DOOR = registerBookshelfDoorBlock("cherry", "Cherry", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CIKA_BOOKSHELF_DOOR = registerBookshelfDoorBlock("cika", "Cika", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CYPRESS_BOOKSHELF_DOOR = registerBookshelfDoorBlock("cypress", "Cypress", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_EBONY_BOOKSHELF_DOOR = registerBookshelfDoorBlock("ebony", "Ebony", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_FIR_BOOKSHELF_DOOR = registerBookshelfDoorBlock("fir", "Fir", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_GREEN_ENCHANTED_BOOKSHELF_DOOR = registerBookshelfDoorBlock("green_enchanted", "Green Enchanted", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_HOLLY_BOOKSHELF_DOOR = registerBookshelfDoorBlock("holly", "Holly", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_JACARANDA_BOOKSHELF_DOOR = registerBookshelfDoorBlock("jacaranda", "Jacaranda", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MAHOGANY_BOOKSHELF_DOOR = registerBookshelfDoorBlock("mahogany", "Mahogany", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MANGROVE_BOOKSHELF_DOOR = registerBookshelfDoorBlock("mangrove", "Mangrove", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MAPLE_BOOKSHELF_DOOR = registerBookshelfDoorBlock("maple", "Maple", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PINE_BOOKSHELF_DOOR = registerBookshelfDoorBlock("pine", "Pine", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_DOOR = registerBookshelfDoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_REDWOOD_BOOKSHELF_DOOR = registerBookshelfDoorBlock("redwood", "Redwood", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SKYRIS_BOOKSHELF_DOOR = registerBookshelfDoorBlock("skyris", "Skyris", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_WILLOW_BOOKSHELF_DOOR = registerBookshelfDoorBlock("willow", "Willow", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_WITCH_HAZEL_BOOKSHELF_DOOR = registerBookshelfDoorBlock("witch_hazel", "Witch Hazel", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_ZELKOVA_BOOKSHELF_DOOR = registerBookshelfDoorBlock("zelkova", "Zelkova", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SYTHIAN_BOOKSHELF_DOOR = registerBookshelfDoorBlock("sythian", "Sythian", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_EMBUR_BOOKSHELF_DOOR = registerBookshelfDoorBlock("embur", "Embur", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PALM_BOOKSHELF_DOOR = registerBookshelfDoorBlock("palm", "Palm", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_LAMENT_BOOKSHELF_DOOR = registerBookshelfDoorBlock("lament", "Lament", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BULBIS_BOOKSHELF_DOOR = registerBookshelfDoorBlock("bulbis", "Bulbis", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_NIGHTSHADE_BOOKSHELF_DOOR = registerBookshelfDoorBlock("nightshade", "Nightshade", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_ETHER_BOOKSHELF_DOOR = registerBookshelfDoorBlock("ether", "Ether", () -> new DoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_IMPARIUS_BOOKSHELF_DOOR = registerBookshelfDoorBlock("imparius", "Imparius", () -> new DoorBlock(WOOD_PROPERTIES));

    public static RegistryObject<DoorBlock> SECRET_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("white", "White", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CUT_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_white", "Cut White", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_WHITE_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_white", "Smooth White", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BLUE_SANDSTONE_DOOR = registerSandstoneDoorBlock("blue", "Blue", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CUT_BLUE_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_blue", "Cut Blue", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BLUE_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_blue", "Smooth Blue", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("black", "Black", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CUT_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_black", "Cut Black", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_BLACK_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_black", "Smooth Black", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PURPLE_SANDSTONE_DOOR = registerSandstoneDoorBlock("purple", "Purple", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CUT_PURPLE_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_purple", "Cut Purple", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_PURPLE_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_purple", "Smooth Purple", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PINK_SANDSTONE_DOOR = registerSandstoneDoorBlock("pink", "Pink", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CUT_PINK_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_pink", "Cut Pink", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_PINK_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_pink", "Smooth Pink", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_WINDSWEPT_SANDSTONE_DOOR = registerSandstoneDoorBlock("windswept", "Windswept", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CUT_WINDSWEPT_SANDSTONE_DOOR = registerSandstoneDoorBlock("cut_windswept", "Cut Windswept", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SMOOTH_WINDSWEPT_SANDSTONE_DOOR = registerSandstoneDoorBlock("smooth_windswept", "Smooth Windswept", () -> new DoorBlock(STONE_PROPERTIES));

    public static RegistryObject<DoorBlock> SECRET_BLUE_NETHERRACK_DOOR = registerDoorBlock("blue_netherrack", "Blue Netherrack", () -> new DoorBlock(NETHERRACK_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BLUE_NETHER_BRICK_DOOR = registerDoorBlock("blue_nether_bricks", "Blue Nether Bricks", () -> new DoorBlock(NETHERBRICK_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_YELLOW_NETHER_BRICK_DOOR = registerDoorBlock("yellow_nether_bricks", "Yellow Nether Bricks", () -> new DoorBlock(NETHERBRICK_PROPERTIES));

    public static RegistryObject<DoorBlock> SECRET_MUD_BRICKS_DOOR = registerDoorBlock("mud_bricks", "Mud Bricks", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_BRIMSTONE_DOOR = registerDoorBlock("brimstone", "Brimstone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_PURPUR_STONE_DOOR = registerDoorBlock("purpur_stone", "Purpur Stone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_ETHER_STONE_DOOR = registerDoorBlock("ether_stone", "Ether Stone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_COBBLED_ETHER_DOOR = registerDoorBlock("cobbled_ether", "Cobbled Ether", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_DACITE_DOOR = registerDoorBlock("dacite", "Dacite", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_DACITE_BRICKS_DOOR = registerDoorBlock("dacite_bricks", "Dacite Bricks", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_DACITE_COBBLESTONE_DOOR = registerDoorBlock("dacite_cobblestone", "Dacite Cobblestone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_DACITE_TILES_DOOR = registerDoorBlock("dacite_tiles", "Dacite Tiles", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_RED_ROCK_DOOR = registerDoorBlock("red_rock", "Red Rock", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_RED_ROCK_BRICKS_DOOR = registerDoorBlock("red_rock_bricks", "Red Rock Bricks", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_ROCKY_STONE_DOOR = registerDoorBlock("rocky_stone", "Rocky Stone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_TRAVERTINE_DOOR = registerDoorBlock("travertine", "Travertine", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_POLISHED_TRAVERTINE_DOOR = registerDoorBlock("polished_travertine", "Polished Travertine", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SCORIA_STONE_DOOR = registerDoorBlock("scoria_stone", "Scoria Stone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SCORIA_COBBLESTONE_DOOR = registerDoorBlock("scoria_cobblestone", "Scoria Cobblestone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SCORIA_STONE_BRICKS_DOOR = registerDoorBlock("scoria_stone_bricks", "Scoria Stone Bricks", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SOAPSTONE_DOOR = registerDoorBlock("soapstone", "Soapstone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_POLISHED_SOAPSTONE_DOOR = registerDoorBlock("polished_soapstone", "Polished Soapstone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SOAPSTONE_BRICKS_DOOR = registerDoorBlock("soapstone_bricks", "Soapstone Bricks", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_SOAPSTONE_TILES_DOOR = registerDoorBlock("soapstone_tiles", "Soapstone Tiles", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_MAGMATIC_STONE_DOOR = registerDoorBlock("magmatic_stone", "Magmatic Stone", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_THERIUM_DOOR = registerDoorBlock("therium", "Therium", () -> new DoorBlock(STONE_PROPERTIES));
    public static RegistryObject<DoorBlock> SECRET_CRYPTIC_STONE_DOOR = registerDoorBlock("cryptic_stone", "Cryptic Stone", () -> new DoorBlock(STONE_PROPERTIES));


    public static RegistryObject<TrapDoorBlock> SECRET_ASPEN_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("aspen", "Aspen", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BAOBAB_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("baobab", "Baobab", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BLUE_ENCHANTED_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("blue_enchanted", "Blue Enchanted", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CHERRY_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("cherry", "Cherry", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CIKA_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("cika", "Cika", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CYPRESS_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("cypress", "Cypress", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_EBONY_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("ebony", "Ebony", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_FIR_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("fir", "Fir", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_GREEN_ENCHANTED_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("green_enchanted", "Green Enchanted", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_HOLLY_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("holly", "Holly", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_JACARANDA_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("jacaranda", "Jacaranda", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MAHOGANY_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("mahogany", "Mahogany", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MANGROVE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("mangrove", "Mangrove", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MAPLE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("maple", "Maple", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PINE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("pine", "Pine", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_RAINBOW_EUCALYPTUS_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_REDWOOD_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("redwood", "Redwood", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SKYRIS_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("skyris", "Skyris", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_WILLOW_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("willow", "Willow", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_WITCH_HAZEL_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("witch_hazel", "Witch Hazel", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_ZELKOVA_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("zelkova", "Zelkova", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SYTHIAN_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("sythian", "Sythian", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_EMBUR_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("embur", "Embur", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PALM_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("palm", "Palm", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_LAMENT_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("lament", "Lament", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BULBIS_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("bulbis", "Bulbis", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_NIGHTSHADE_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("nightshade", "Nightshade", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_ETHER_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("ether", "Ether", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_IMPARIUS_PLANK_TRAPDOOR = registerPlankTrapdoorBlock("imparius", "Imparius", () -> new TrapDoorBlock(WOOD_PROPERTIES));

    public static RegistryObject<TrapDoorBlock> SECRET_ASPEN_LOG_TRAPDOOR = registerLogTrapdoorBlock("aspen", "Aspen", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BAOBAB_LOG_TRAPDOOR = registerLogTrapdoorBlock("baobab", "Baobab", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BLUE_ENCHANTED_LOG_TRAPDOOR = registerLogTrapdoorBlock("blue_enchanted", "Blue Enchanted", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CHERRY_LOG_TRAPDOOR = registerLogTrapdoorBlock("cherry", "Cherry", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CIKA_LOG_TRAPDOOR = registerLogTrapdoorBlock("cika", "Cika", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CYPRESS_LOG_TRAPDOOR = registerLogTrapdoorBlock("cypress", "Cypress", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_EBONY_LOG_TRAPDOOR = registerLogTrapdoorBlock("ebony", "Ebony", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_FIR_LOG_TRAPDOOR = registerLogTrapdoorBlock("fir", "Fir", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_GREEN_ENCHANTED_LOG_TRAPDOOR = registerLogTrapdoorBlock("green_enchanted", "Green Enchanted", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_HOLLY_LOG_TRAPDOOR = registerLogTrapdoorBlock("holly", "Holly", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_JACARANDA_LOG_TRAPDOOR = registerLogTrapdoorBlock("jacaranda", "Jacaranda", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MAHOGANY_LOG_TRAPDOOR = registerLogTrapdoorBlock("mahogany", "Mahogany", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MANGROVE_LOG_TRAPDOOR = registerLogTrapdoorBlock("mangrove", "Mangrove", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MAPLE_LOG_TRAPDOOR = registerLogTrapdoorBlock("maple", "Maple", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PINE_LOG_TRAPDOOR = registerLogTrapdoorBlock("pine", "Pine", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR = registerLogTrapdoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_REDWOOD_LOG_TRAPDOOR = registerLogTrapdoorBlock("redwood", "Redwood", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SKYRIS_LOG_TRAPDOOR = registerLogTrapdoorBlock("skyris", "Skyris", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_WILLOW_LOG_TRAPDOOR = registerLogTrapdoorBlock("willow", "Willow", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_WITCH_HAZEL_LOG_TRAPDOOR = registerLogTrapdoorBlock("witch_hazel", "Witch Hazel", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_ZELKOVA_LOG_TRAPDOOR = registerLogTrapdoorBlock("zelkova", "Zelkova", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SYTHIAN_STEM_TRAPDOOR = registerStemTrapdoorBlock("sythian", "Sythian", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_EMBUR_PEDU_TRAPDOOR = registerTrapdoorBlock("embur_pedu", "Embur Pedu", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PALM_LOG_TRAPDOOR = registerLogTrapdoorBlock("palm", "Palm", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_LAMENT_LOG_TRAPDOOR = registerLogTrapdoorBlock("lament", "Lament", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BULBIS_STEM_TRAPDOOR = registerStemTrapdoorBlock("bulbis", "Bulbis", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_NIGHTSHADE_LOG_TRAPDOOR = registerLogTrapdoorBlock("nightshade", "Nightshade", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_ETHER_LOG_TRAPDOOR = registerLogTrapdoorBlock("ether", "Ether", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_IMPARIUS_STEM_TRAPDOOR = registerStemTrapdoorBlock("imparius", "Imparius", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PALO_VERDE_LOG_TRAPDOOR = registerLogTrapdoorBlock("palo_verde", "Palo Verde", () -> new TrapDoorBlock(WOOD_PROPERTIES));


    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_ASPEN_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("aspen", "Aspen", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BAOBAB_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("baobab", "Baobab", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BLUE_ENCHANTED_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("blue_enchanted", "Blue Enchanted", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CHERRY_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("cherry", "Cherry", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CIKA_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("cika", "Cika", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_CYPRESS_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("cypress", "Cypress", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_EBONY_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("ebony", "Ebony", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_FIR_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("fir", "Fir", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_GREEN_ENCHANTED_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("green_enchanted", "Green Enchanted", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_HOLLY_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("holly", "Holly", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_JACARANDA_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("jacaranda", "Jacaranda", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_MAHOGANY_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("mahogany", "Mahogany", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_MANGROVE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("mangrove", "Mangrove", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_MAPLE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("maple", "Maple", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_PINE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("pine", "Pine", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_RAINBOW_EUCALYPTUS_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_REDWOOD_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("redwood", "Redwood", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_SKYRIS_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("skyris", "Skyris", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_WILLOW_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("willow", "Willow", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_WITCH_HAZEL_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("witch_hazel", "Witch Hazel", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_ZELKOVA_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("zelkova", "Zelkova", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_SYTHIAN_STEM_TRAPDOOR = registerStrippedStemTrapdoorBlock("sythian", "Sythian", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_EMBUR_PEDU_TRAPDOOR = registerTrapdoorBlock("stripped_embur_pedu", "Stripped Embur Pedu", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_PALM_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("palm", "Palm", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_LAMENT_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("lament", "Lament", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_BULBIS_STEM_TRAPDOOR = registerStrippedStemTrapdoorBlock("bulbis", "Bulbis", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_NIGHTSHADE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("nightshade", "Nightshade", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_ETHER_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("ether", "Ether", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_STRIPPED_PALO_VERDE_LOG_TRAPDOOR = registerStrippedLogTrapdoorBlock("palo_verde", "Palo Verde", () -> new TrapDoorBlock(WOOD_PROPERTIES));

    public static RegistryObject<TrapDoorBlock> SECRET_ASPEN_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("aspen", "Aspen", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BAOBAB_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("baobab", "Baobab", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BLUE_ENCHANTED_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("blue_enchanted", "Blue Enchanted", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CHERRY_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("cherry", "Cherry", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CIKA_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("cika", "Cika", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CYPRESS_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("cypress", "Cypress", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_EBONY_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("ebony", "Ebony", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_FIR_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("fir", "Fir", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_GREEN_ENCHANTED_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("green_enchanted", "Green Enchanted", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_HOLLY_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("holly", "Holly", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_JACARANDA_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("jacaranda", "Jacaranda", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MAHOGANY_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("mahogany", "Mahogany", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MANGROVE_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("mangrove", "Mangrove", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MAPLE_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("maple", "Maple", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PINE_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("pine", "Pine", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_RAINBOW_EUCALYPTUS_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("rainbow_eucalyptus", "Rainbow Eucalyptus", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_REDWOOD_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("redwood", "Redwood", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SKYRIS_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("skyris", "Skyris", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_WILLOW_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("willow", "Willow", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_WITCH_HAZEL_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("witch_hazel", "Witch Hazel", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_ZELKOVA_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("zelkova", "Zelkova", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SYTHIAN_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("sythian", "Sythian", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_EMBUR_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("embur", "Embur", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PALM_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("palm", "Palm", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_LAMENT_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("lament", "Lament", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BULBIS_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("bulbis", "Bulbis", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_NIGHTSHADE_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("nightshade", "Nightshade", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_ETHER_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("ether", "Ether", () -> new TrapDoorBlock(WOOD_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_IMPARIUS_BOOKSHELF_TRAPDOOR = registerBookshelfTrapdoorBlock("imparius", "Imparius", () -> new TrapDoorBlock(WOOD_PROPERTIES));


    public static RegistryObject<TrapDoorBlock> SECRET_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("white", "White", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_white", "Cut White", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_WHITE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_white", "Smooth White", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BLUE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("blue", "Blue", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BLUE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_blue", "Cut Blue", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_BLUE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_blue", "Smooth Blue", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("black", "Black", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_black", "Cut Black", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock>  SECRET_SMOOTH_BLACK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_black", "Smooth Black", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock>  SECRET_PURPLE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("purple", "Purple", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock>  SECRET_CUT_PURPLE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_purple", "Cut Purple", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock>  SECRET_SMOOTH_PURPLE_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_purple", "Smooth Purple", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PINK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("pink", "Pink", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_PINK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_pink", "Cut Pink", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_PINK_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_pink", "Smooth Pink", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_WINDSWEPT_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("windswept", "Windswept", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CUT_WINDSWEPT_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("cut_windswept", "Cut Windswept", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SMOOTH_WINDSWEPT_SANDSTONE_TRAPDOOR = registerSandstoneTrapdoorBlock("smooth_windswept", "Smooth Windswept", () -> new TrapDoorBlock(STONE_PROPERTIES));

    public static RegistryObject<TrapDoorBlock> SECRET_BLUE_NETHERRACK_TRAPDOOR = registerTrapdoorBlock("blue_netherrack", "Blue Netherrack", () -> new TrapDoorBlock(NETHERRACK_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BLUE_NETHER_BRICK_TRAPDOOR = registerTrapdoorBlock("blue_nether_bricks", "Blue Nether Bricks", () -> new TrapDoorBlock(NETHERBRICK_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_YELLOW_NETHER_BRICK_TRAPDOOR = registerTrapdoorBlock("yellow_nether_bricks", "Yellow Nether Bricks", () -> new TrapDoorBlock(NETHERBRICK_PROPERTIES));

    public static RegistryObject<TrapDoorBlock> SECRET_MUD_BRICKS_TRAPDOOR = registerTrapdoorBlock("mud_bricks", "Mud Bricks", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_BRIMSTONE_TRAPDOOR = registerTrapdoorBlock("brimstone", "Brimstone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_PURPUR_STONE_TRAPDOOR = registerTrapdoorBlock("purpur_stone", "Purpur Stone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_ETHER_STONE_TRAPDOOR = registerTrapdoorBlock("ether_stone", "Ether Stone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_COBBLED_ETHER_TRAPDOOR = registerTrapdoorBlock("cobbled_ether", "Cobbled Ether", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_DACITE_TRAPDOOR = registerTrapdoorBlock("dacite", "Dacite", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_DACITE_BRICKS_TRAPDOOR = registerTrapdoorBlock("dacite_bricks", "Dacite Bricks", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_DACITE_COBBLESTONE_TRAPDOOR = registerTrapdoorBlock("dacite_cobblestone", "Dacite Cobblestone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_DACITE_TILES_TRAPDOOR = registerTrapdoorBlock("dacite_tiles", "Dacite Tiles", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_RED_ROCK_TRAPDOOR = registerTrapdoorBlock("red_rock", "Red Rock", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_RED_ROCK_BRICKS_TRAPDOOR = registerTrapdoorBlock("red_rock_bricks", "Red Rock Bricks", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_ROCKY_STONE_TRAPDOOR = registerTrapdoorBlock("rocky_stone", "Rocky Stone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_TRAVERTINE_TRAPDOOR = registerTrapdoorBlock("travertine", "Travertine", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_POLISHED_TRAVERTINE_TRAPDOOR = registerTrapdoorBlock("polished_travertine", "Polished Travertine", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SCORIA_STONE_TRAPDOOR = registerTrapdoorBlock("scoria_stone", "Scoria Stone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SCORIA_COBBLESTONE_TRAPDOOR = registerTrapdoorBlock("scoria_cobblestone", "Scoria Cobblestone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SCORIA_STONE_BRICKS_TRAPDOOR = registerTrapdoorBlock("scoria_stone_bricks", "Scora Stone Bricks", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SOAPSTONE_TRAPDOOR = registerTrapdoorBlock("soapstone", "Soapstone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_POLISHED_SOAPSTONE_TRAPDOOR = registerTrapdoorBlock("polished_soapstone", "Polished Soapstone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SOAPSTONE_BRICKS_TRAPDOOR = registerTrapdoorBlock("soapstone_bricks", "Soapstone Bricks", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_SOAPSTONE_TILES_TRAPDOOR = registerTrapdoorBlock("soapstone_tiles", "Soapstone Tiles", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_MAGMATIC_STONE_TRAPDOOR = registerTrapdoorBlock("magmatic_stone", "Magmatic Stone", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_THERIUM_TRAPDOOR = registerTrapdoorBlock("therium", "Therium", () -> new TrapDoorBlock(STONE_PROPERTIES));
    public static RegistryObject<TrapDoorBlock> SECRET_CRYPTIC_STONE_TRAPDOOR = registerTrapdoorBlock("cryptic_stone", "Cryptic Stone", () -> new TrapDoorBlock(STONE_PROPERTIES));
}