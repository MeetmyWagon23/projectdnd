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
    FLESH("flesh", 2, new int[]{1, 1, 2, 1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, Items.ROTTEN_FLESH),
    //leather                           5, new int[]{1, 2, 3, 1}
    LEAD("lead", 4, new int[]{1,1,2,1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,1.5f, 0.2f, ItemsInit.LEAD_INGOT.get()), //unused
    TIN("tin", 5, new int[]{1,1,2,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.TIN_NUGGET.get()), //unused
    ZINC("zinc", 6, new int[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ZINC_INGOT.get()), //unused
    SILVER("silver", 7, new int[]{1,2,3,1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.5f, 0.0f, ItemsInit.SILVER_INGOT.get()),
    ALUMINUM("aluminum", 8, new int[]{1,2,2,1},8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ALUMINUM_INGOT.get()), //unused
    ELECTRUM("electrum", 9, new int[]{2,2,3,2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ELECTRUM_INGOT.get()), //unused
    COPPER("copper", 10, new int[]{2,2,3,2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, Items.COPPER_INGOT),
    BRASS("brass", 11, new int[]{2,2,3,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.4f, ItemsInit.BRASS_INGOT.get()),
    BRONZE("bronze", 12, new int[]{2,2,3,2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.BRONZE_INGOT.get()),
    NICKEL("nickel", 13, new int[]{2,3,4,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.NICKEL_INGOT.get()),
    PLATINUM("platinum", 14, new int[]{2,4,5,2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.PLATINUM_INGOT.get()),
    BONE("bone", 4, new int[]{2,5,6,2}, 1, SoundEvents.ENTITY_SKELETON_AMBIENT,1.5f, 0.0f, Items.BONE),
    //iron                             15, new int[]{2, 5, 6, 2}
    STEEL("steel", 21, new int[]{2,5,6,2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0f, 0.1f, ItemsInit.STEEL_INGOT.get()),
    //diamond                                   25, new int[]{2, 5, 6, 2}
    //netherite                                 37, new int[]{3, 6, 8, 3}
    PALLADIUM("palladium", 64, new int[]{4,7,9,4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0f, 0.3f, ItemsInit.PALLADIUM_INGOT.get()),
    TITANIUM("titanium", 84, new int[]{7,9,10,7}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,3.0f, 0.3f, ItemsInit.TITANIUM_INGOT.get()),
    TUNGSTEN("tungsten", 92, new int[]{9,11,12,9}, 24, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,4.0f, 0.4f, ItemsInit.TUNGSTEN_INGOT.get()),
    MITHRIL("mithril", 107, new int[]{11,13,14,11}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,5.0f, 0.4f, ItemsInit.MITHRIL_INGOT.get()),
    ITANIUM("itanium", 107, new int[]{13,15,16,13}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,6.0f, 0.5f, ItemsInit.ITANIUM_INGOT.get()),
    ADAMANTINE("adamantine", 123, new int[]{13,15,16,14}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0f, 0.5f, ItemsInit.ADAMANTINE_INGOT.get()),
//-------------------------------------------------------------------------Legendary Armors Below Here---------------------------------------------------------------------------------------------
    BLACK_ADAMANTINE("black_adamantine", 123, new int[]{13,15,16,14}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0f, 0.5f, ItemsInit.BLACK_ADAMANTINE_INGOT.get()),
    LEGENDARY("legendary", 153, new int[]{15,17,18,15}, 50, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,7.0f, 0.6f, ItemsInit.LEGENDARY_CORE.get()),
    DRAGONHIDE("dragonhide", 123, new int[]{13,15,16,14}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 6.0f, 0.2f, ItemsInit.ADAMANTINE_INGOT.get());

    //more legendary equipment to be added, mostly will be used for Legendary Boss Armors - Legendary Crafted Items from bosses.
    //Legendary is a placeholder name. meant to be replaced & duplicated with different set names.



   /* EXAMPLE
   BONE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    });
                                                                                                         \/ due to how we set this up, we can have as many repair
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