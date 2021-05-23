package com.lightmare.ultimatemod.core.init;

import com.lightmare.ultimatemod.UltimateMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ArmorMaterialInit implements IArmorMaterial {
    COPPER("copper_crown", 3, 1, SoundEvents.ARMOR_EQUIP_IRON, 1000, 0, Ingredient.of(Items.IRON_INGOT)),
    IRON("iron_crown", 2, 1, SoundEvents.ARMOR_EQUIP_IRON, 1, 0, Ingredient.of(Items.IRON_INGOT)),
    GOLD("gold_crown", 2, 1, SoundEvents.ARMOR_EQUIP_GOLD, 1, 0, Ingredient.of(Items.GOLD_INGOT));

    private final String name;
    private final int maxDamageFactor;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final int toughness;
    private final float knockbackResistance;
    private final Ingredient repairMaterial;

    private ArmorMaterialInit(String nameIn, int maxDamageFactorIn,  int enchantabilityIn, SoundEvent soundEventIn, int toughnessIn, float knockbackResistanceIn, Ingredient repairMaterial) {
        this.name = UltimateMod.MOD_ID + ":" + nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.knockbackResistance = knockbackResistanceIn;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return this.toughness;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.maxDamageFactor;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial;
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
