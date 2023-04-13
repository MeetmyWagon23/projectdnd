package com.meetmywagon23.projectrpg.toolmaterials;

import com.google.common.base.Supplier;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BaseToolMaterial implements ToolMaterial {

    private final float attackDamage, miningSpeedMultiplier;
    private final int enchantability, miningLevel, durability;
    private final Supplier<Ingredient> repairMaterial;

    public BaseToolMaterial(float attackDamage, int enchantability, int miningLevel, float miningSpeedMultiplier, int durability, Supplier<Ingredient> repairMaterial) {
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.miningLevel = miningLevel;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.durability = durability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
