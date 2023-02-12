package com.meetmywagon23.projectdnd.armormaterials;

import com.google.common.base.Suppliers;
import com.meetmywagon23.projectdnd.init.ItemsInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ArmorSetMaterials implements ArmorMaterial {
    FLESH("flesh", 2, new int[]{1, 2, 3, 1}, 1, SoundEvents.ENTITY_ZOMBIE_INFECT, 0.0F, 0.0F, Items.ROTTEN_FLESH),//<---I NEED TO BE A COMMA TO WORK
    //wood
    //stone  //ItemsInit.LEAD_INGOT.get()
    LEAD("lead", 2, new int[]{1,2,3,1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, Items.BONE),
    TIN("tin", 2, new int[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.TIN_NUGGET.get()),
    ZINC("zinc", 2, new int[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ZINC_INGOT.get()),
    SILVER("silver", 2, new int[]{1,2,3,1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.SILVER_INGOT.get()),
    ALUMINUM("aluminum", 2, new int[]{1,2,3,1},8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ALUMINUM_INGOT.get()),
    ELECTRUM("electrum", 2, new int[]{1,2,3,1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ELECTRUM_INGOT.get()),
    COPPER("copper", 2, new int[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, Items.COPPER_INGOT),
    BRASS("brass", 2, new int[]{1,2,3,1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.BRASS_INGOT.get()),
    BRONZE("bronze", 2, new int[]{1,2,3,1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.BRONZE_INGOT.get()),
    NICKEL("nickel", 2, new int[]{1,2,3,1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.NICKEL_INGOT.get()),
    PLATINUM("platinum", 2, new int[]{1,2,3,1}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.PLATINUM_INGOT.get()),
    BONE("bone", 2, new int[]{1,2,3,1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, Items.BONE),
    //iron
    STEEL("steel", 2, new int[]{1,2,3,1}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.STEEL_INGOT.get()),
    //diamond
    //netherite
    PALLADIUM("palladium", 2, new int[]{1,2,3,1}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.PALLADIUM_INGOT.get()),
    TITANIUM("titanium", 2, new int[]{1,2,3,1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.TITANIUM_INGOT.get()),
    TUNGSTEN("tungsten", 2, new int[]{1,2,3,1}, 24, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.TUNGSTEN_INGOT.get()),
    MITHRIL("mithril", 2, new int[]{1,2,3,1}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.MITHRIL_INGOT.get()),
    ITANIUM("itanium", 2, new int[]{1,2,3,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.ITANIUM_INGOT.get()),
    ADAMANTINE("adamantine", 2, new int[]{1,2,3,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 6.0f, ItemsInit.ADAMANTINE_INGOT.get()),
    LEGENDARY("legendary", 2, new int[]{1,2,3,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 6.0f, ItemsInit.LEGENDARY_CORE.get());




   /* EXAMPLE
   BONE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    });                                  Alternate sound.event for flesh could be Turtle armor sound.
                                                                                                         \/ due to how we set this up, we can mave as many repair
                                                                                                            ingredients as we want for any armor.
    FLESH("flesh", 2, new int[]{1, 2, 3, 1}, 1, SoundEvents.ENTITY_ZOMBIE_INFECT, 0.0F, 0.0F, Items.ROTTEN_FLESH, Items.BONE)

    */
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private ArmorSetMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Item... items) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Suppliers.memoize(() -> Ingredient.ofItems(items));
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}