package com.shim.secretbygdoors.datagen;

import com.shim.secretbygdoors.SBYGBlocks;
import com.shim.secretbygdoors.SecretBYGDoors;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class LangProvider extends LanguageProvider {
    public LangProvider(DataGenerator gen, String locale) {
        super(gen, SecretBYGDoors.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        for (RegistryObject<? extends Block> block : SBYGBlocks.BLOCK_LANG_EN_US.keySet()) this.add(block.get(), SBYGBlocks.BLOCK_LANG_EN_US.get(block));

    }
}
