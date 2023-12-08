package com.meetmywagon23.projectrpg.armormaterials;

import com.google.common.base.Suppliers;
import com.meetmywagon23.projectrpg.init.ItemsInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ArmorSetMaterials implements WagonsArmorMaterial {
    /* notes to keep track of stuff, why the hell are you in here anyway?
    mohs hardness order
    wood------------------------vanilla
    stone-----------------------vanilla
    ------lead------------------------NO TOOLS/ARMOR                                                                    REMOVED
    ------tin-------------------------NO TOOLS/ARMOR                                                                    REMOVED
    gold--gold------------------------vanilla
    ------zinc------------------------NO TOOLS/ARMOR                                                                    REMOVED
    silversilver----------------------
    ------aluminum--------------------NO TOOLS/ARMOR                                                                    REMOVED
    ------electrum--------------------NO TOOLS/ARMOR                                                                    REMOVED
    copper----------------------
    brass-----------------------
    bronze----------------------
    ------nickel----------------------NO TOOLS/ARMOR                                                                    REMOVED
    platinum--------------------
    bone------------------------
    iron------------------------vanilla
    Infernal Iron---------------Nether Equivalent of Iron, Natural Fire Aspect                                          | *NEW*
    Cold Iron------------------- Cooked at a lower Temp than Iron,
    steel-----------------------
    elven steel-----------------               LIGHTWEIGHT                                                              | *NEW*
    Dark Steel------------------ Dwarvan steel Alloy using Star Metal, lightweight, magic resistant | Very Enchantable  | *NEW*
    diamond---------------------vanilla
    netherite-------------------vanilla
    dragon scale----------------
    palladium-------------------
    titanium--------------------
    tungsten--------------------
    mithril---------------------
    itanium---------------------to be renamed/removed
    adamantine------------------
    Starfall = Starmetal, Flavored for... reasons.

    Metal Working Metals.
    Arandur--------------------- not to be used for armors or weapons, only alloy work                                  | *NEW*
    Lead
   NO TIN Tin
    Zinc
    Aluminum
    Electrum
    Nickel
     */
    FLESH("flesh", 4, new double[]{0.4,0.6,0.8,0.5}, 1, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, Items.ROTTEN_FLESH),
    //leather                           5, new double[]{1, 2, 3, 1}
    //LEAD("lead", 4, new double[]{1,1,2,1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,1.5f, 0.2f, ItemsInit.LEAD_INGOT.get()), //unused
    //TIN("tin", 5, new double[]{1,1,2,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.TIN_NUGGET.get()), //unused
    //ZINC("zinc", 6, new double[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ZINC_INGOT.get()), //unused
    SILVER("silver", 7, new double[]{1.2,1.5,2,1.3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.4f, 0.0f, ItemsInit.SILVER_INGOT.get()),
    LIGHT_SILVER("light_silver", 6, new double[]{.8,1,1.4,.9}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.2f, 0.0f, ItemsInit.SILVER_INGOT.get()),
    //ALUMINUM("aluminum", 8, new double[]{1,2,2,1},8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ALUMINUM_INGOT.get()), //unused
    //ELECTRUM("electrum", 9, new double[]{2,2,3,2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.ELECTRUM_INGOT.get()), //unused
    COPPER("copper", 10, new double[]{1.4,1.7,2.3,1.6}, 3, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, Items.COPPER_INGOT),
    LIGHT_COPPER("light_copper", 8, new double[]{.9,1.1,1.6,1.2}, 3, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, Items.COPPER_INGOT),
//    BRASS("brass", 11, new double[]{1.6,1.9,2.3,1.5}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f, 0.4f, ItemsInit.BRASS_INGOT.get()),
    BRONZE("bronze", 12, new double[]{1.6,3.6,3.9,1.7}, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.8f, 0.0f, ItemsInit.BRONZE_INGOT.get()),
   //NICKEL("nickel", 13, new double[]{2,3,4,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.NICKEL_INGOT.get()),
   //LIGHT_NICKEL("light_nickel", 13, new double[]{1,2,3,1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsInit.NICKEL_INGOT.get()),
    PLATINUM("platinum", 14, new double[]{1.8,4.4,5.2,1.8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.PLATINUM_INGOT.get()),
    LIGHT_PLATINUM("light_platinum", 11, new double[]{2,3,4,1}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsInit.PLATINUM_INGOT.get()),
    GLACIAL("glacial", 9, new double[]{1.6,4.2,5,1.6}, 6, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0f, 0.1f, Items.PACKED_ICE),
    BONE("bone", 4, new double[]{1.8,4.6,5.3,1.8}, 2, SoundEvents.ENTITY_SKELETON_AMBIENT,1.0f, 0.0f, Items.BONE),
    //iron                             15, new double[]{2, 5, 6, 2}
    LIGHT_IRON("light_iron", 12, new double[]{1.4,3.5,4.2,1.4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.5f, 0.f, Items.IRON_INGOT),
    INFERNAL_IRON("infernal_iron", 15, new double[]{2.2,5.2,6.2,2.2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f, 0.1f, ItemsInit.INFERNAL_IRON_INGOT.get()),
    COLD_IRON_MAIL("cold_iron_mail", 12, new double[]{1.6,3.7,4.4,1.6}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f, 0.1f, ItemsInit.COLD_IRON_INGOT.get()),
    WITHER_BONE("wither_bone", 12, new double[]{2.4,5.4,6.4,2.4}, 2, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0f, 0.1f, ItemsInit.WITHER_BONE.get()),
    STEEL("steel", 21, new double[]{2.6,5.6,6.6,2.6}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0f, 0.1f, ItemsInit.STEEL_INGOT.get()),
    STEEL_CHAIN("steel_chain", 17, new double[]{1.8,3.9,4.6,1.8}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.0f, 0.0f, ItemsInit.STEEL_INGOT.get()),
    ELVEN_STEEL("elven_steel", 26, new double[]{2.8,5.8,6.8,2.8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f, 0.0f, ItemsInit.ELVEN_STEEL_INGOT.get()),
    ELVEN_STEEL_MAIL("elven_steel_mail", 21, new double[]{1.9,4,4.7,1.9}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.7f, 0.0f, ItemsInit.ELVEN_STEEL_INGOT.get()),
    DARK_STEEL("dark_steel", 26, new double[]{2.8,5.8,6.8,2.8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0f, 0.2f, ItemsInit.DARK_STEEL_INGOT.get()),//half the weight of steel
    DARK_STEEL_MAIL("dark_steel_mail", 21, new double[]{1.9,4,4.7,1.9}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.0f, 0.1f, ItemsInit.DARK_STEEL_INGOT.get()),//half the weight of steel

    //diamond                                   25, new double[]{3, 6, 8, 3}
    //netherite                                 37, new double[]{3, 6, 8, 3}

    //Dragon scale male is a LIGHT ARMOR!!!!
    DRAGON_SCALE_MAIL("dragon_scale_mail", 46, new double[]{3.5,6.5,8.5,3.5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0f, 0.0f, ItemsInit.DRAGON_SCALE.get()),
    PALLADIUM("palladium", 41, new double[]{4,7,9,4}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0f, 0.1f, ItemsInit.PALLADIUM_INGOT.get()),
    LIGHT_PALLADIUM("light_palladium", 32, new double[]{2.8,4.9,6.3,2.8}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,1.0f, 0.0f, ItemsInit.PALLADIUM_INGOT.get()),
                    //Be sure to adjust the Armor values PAST TITANIUM (armor values go up in a pattern based on the previous armor values.)
                    //    TITANIUM("titanium", 48, new double[]{4.5,7.5,9.5,4.5}, 11, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,2.5f, 0.2f, ItemsInit.TITANIUM_INGOT.get()),
                    //    LIGHT_TITANIUM("light_titanium", 39, new double[]{3.1,5.2,6.6,3.1}, 14, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,0.7f, 0.1f, ItemsInit.TITANIUM_INGOT.get()),
    TUNGSTEN_CARBIDE("tungsten_carbide", 55, new double[]{5,8,10,5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,3.0f, 0.3f, ItemsInit.TUNGSTEN_CARBIDE_INGOT.get()),
    MITHRIL_MAIL("mithril_mail", 49, new double[]{3.5,5.6,7,3.5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,1.7f, 0.1f, ItemsInit.MITHRIL_INGOT.get()),
    ADAMANTINE("adamantine", 62, new double[]{6,10,12,6}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f, 0.4f, ItemsInit.ADAMANTINE_INGOT.get()),
    LIGHT_ADAMANTINE("light_adamantine", 50, new double[]{4.2,7,8.2,4.2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.2f, ItemsInit.ADAMANTINE_INGOT.get()),
    SHADOW_ADAMANTINE("shadow_adamantine", 62, new double[]{6,10,12,6}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f, 0.4f, ItemsInit.SHADOW_ADAMANTINE_INGOT.get()),
    LIGHT_SHADOW_ADAMANTINE("light_shadow_adamantine", 50, new double[]{4.2,7,8.2,4.2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.2f, ItemsInit.SHADOW_ADAMANTINE_INGOT.get()),
    ADAMANTINE_COATED_DRAGON_SCALE("adamantine_dragon_scale", 67, new double[]{6.5,10.5,12.5,6.5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 5f, 0.4f, ItemsInit.ADAMANTINE_COATED_DRAGON_SCALE.get()),
    LIGHT_ADAMANTINE_COATED_DRAGON_SCALE("light_shadow_adamantine", 55, new double[]{4.7,7.5,8.7,4.7}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.2f, ItemsInit.ADAMANTINE_COATED_DRAGON_SCALE.get()),
    SHADOW_ADAMANTINE_COATED_DRAGON_SCALE("shadow_adamantine_coated_dragon_scale", 67, new double[]{6.5,10.5,12.5,6.5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5f, 0.4f, ItemsInit.SHADOW_ADAMANTINE_COATED_DRAGON_SCALE.get()),
    LIGHT_SHADOW_ADAMANTINE_COATED_DRAGON_SCALE("shadow_adamantine_coated_dragon_scale", 55, new double[]{4.7,7.5,8.7,4.7}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.2f, ItemsInit.SHADOW_ADAMANTINE_COATED_DRAGON_SCALE.get()),
    //-------------------------------------------------------------------------Legendary Armors Below Here----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    LEGENDARY("legendary", 69, new double[]{7,11,13,7}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,6.0f, 0.4f, ItemsInit.DIVINE_CATALYST.get()),
    LIGHT_LEGENDARY("light_legendary", 69, new double[]{4.9,7.7,9.1,4.9}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,3.0f, 0.2f, ItemsInit.DIVINE_CATALYST.get()),
    STARFALL("starfall", 69, new double[]{7,11,13,7}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,6.0f, 0.4f, ItemsInit.DIVINE_CATALYST.get());

    //more legendary equipment to be added, mostly will be used for Legendary Boss Armors - Legendary Crafted Items from bosses.
    //Legendary is a placeholder name. meant to be replaced & duplicated with different set names, and keeping the BASE legendary armor stats.

   /* EXAMPLE
   BONE("netherite", 37, new double[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    });
                                                                                                         \/ due to how we set this up, we can have as many repair
                                                                                                            ingredients as we want for any armor.
    FLESH("flesh", 2, new double[]{1, 2, 3, 1}, 1, SoundEvents.ENTITY_ZOMBIE_INFECT, 0.0F, 0.0F, Items.ROTTEN_FLESH, Items.BONE)

    */
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final double[] wagonsProtectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ArmorSetMaterials(String name, int durabilityMultiplier, double[] wagonsProtectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Item... items) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = new int[]{1, 1, 2, 1};
        this.wagonsProtectionAmounts = wagonsProtectionAmounts;
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
    public double getWagonsProtectionAmount(EquipmentSlot slot) {
        return this.wagonsProtectionAmounts[slot.getEntitySlotId()];
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