package com.lightmare.ultimatemod.core.init;

import com.lightmare.ultimatemod.UltimateMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UltimateMod.MOD_ID);

    public static final RegistryObject<Item> SOMETHING = ITEMS.register("something", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));


    public static final RegistryObject<ArmorItem> COPPER_CROWN = ITEMS.register("copper_crown", () ->
            new ArmorItem(ArmorMaterialInit.COPPER, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> GOLD_CROWN = ITEMS.register("gold_crown", () ->
            new ArmorItem(ArmorMaterialInit.GOLD, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

    // Block Items

    public static final RegistryObject<BlockItem> CHICKEN_BLOCK = ITEMS.register("chicken_block", () ->
            new BlockItem(BlockInit.CHICKEN_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
