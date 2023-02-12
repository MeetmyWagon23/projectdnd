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
    FLESH("flesh", 1, new int[]{1, 1, 2, 1}, 1, SoundEvents.ENTITY_ZOMBIE_INFECT, 0.0F, 0.0F, Items.ROTTEN_FLESH),//<---I NEED TO BE A COMMA TO WORK
    //wood
    //stone
    LEAD("lead", 1, new int[]{1,2,3,1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.LEAD_INGOT.get()),
    TIN("tin", 1, new int[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.TIN_NUGGET.get()),
    ZINC("zinc", 1, new int[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ZINC_INGOT.get()),
    SILVER("silver", 1, new int[]{1,2,3,1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.SILVER_INGOT.get()),
    ALUMINUM("aluminum", 1, new int[]{1,2,3,1},8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ALUMINUM_INGOT.get()),
    ELECTRUM("electrum", 1, new int[]{1,2,3,1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ELECTRUM_INGOT.get()),
    COPPER("copper", 1, new int[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, Items.COPPER_INGOT),
    BRASS("brass", 1, new int[]{1,2,3,1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 2.0f, ItemsInit.BRASS_INGOT.get()),
    BRONZE("bronze", 1, new int[]{1,2,3,1}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.BRONZE_INGOT.get()),
    NICKEL("nickel", 1, new int[]{1,2,3,1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.NICKEL_INGOT.get()),
    PLATINUM("platinum", 1, new int[]{1,2,3,1}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.PLATINUM_INGOT.get()),
    BONE("bone", 1, new int[]{1,2,3,1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,2.0f, 0.0f, Items.BONE),
    //iron
    STEEL("steel", 1, new int[]{1,2,3,1}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.STEEL_INGOT.get()),
    //diamond
    //netherite
    PALLADIUM("palladium", 1, new int[]{1,2,3,1}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.PALLADIUM_INGOT.get()),
    TITANIUM("titanium", 1, new int[]{1,2,3,1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.TITANIUM_INGOT.get()),
    TUNGSTEN("tungsten", 1, new int[]{1,2,3,1}, 24, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.TUNGSTEN_INGOT.get()),
    MITHRIL("mithril", 1, new int[]{1,2,3,1}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.MITHRIL_INGOT.get()),
    ITANIUM("itanium", 1, new int[]{14,16,17,3}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON,6.0f, 0.6f, ItemsInit.ITANIUM_INGOT.get()),
    ADAMANTINE("adamantine", 123, new int[]{14,16,17,13}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON,6.0f, 0.6f, ItemsInit.ADAMANTINE_INGOT.get()),
    LEGENDARY("legendary", 153, new int[]{15,17,18,14}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,7.0f, 0.7f, ItemsInit.LEGENDARY_CORE.get());
//more legendary equipment to be added, mostly will be used for Legendary Boss Armors - Legendary Crafted Items from bosses.
    //Legendary is a placeholder name.



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