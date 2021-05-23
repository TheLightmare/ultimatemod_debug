package com.lightmare.ultimatemod.core.init;

import com.lightmare.ultimatemod.UltimateMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UltimateMod.MOD_ID);

    public static final RegistryObject<Block> CHICKEN_BLOCK = BLOCKS.register("chicken_block", () ->
            new Block(AbstractBlock.Properties.of(Material.WOOL)
                    .sound(SoundType.HONEY_BLOCK)
                    .strength(3f)));
}
