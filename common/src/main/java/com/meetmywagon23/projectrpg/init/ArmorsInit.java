package com.meetmywagon23.projectrpg.init;

import com.meetmywagon23.projectrpg.ProjectRPG;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

import static com.meetmywagon23.projectrpg.armormaterials.ArmorSetMaterials.*;
import static net.minecraft.entity.EquipmentSlot.*;

public class ArmorsInit {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ProjectRPG.MOD_ID, Registry.ITEM_KEY);
        /*
    mohs hardness order
    flesh-----------------------
    wood------------------------vanilla
    stone-----------------------vanilla
    ------lead------------------------NO TOOLS/ARMOR                                                                    REMOVED
    ------tin-------------------------NO TOOLS/ARMOR                                                                    REMOVED
    gold------------------------vanilla
    ------zinc------------------------NO TOOLS/ARMOR                                                                    REMOVED
    silver----------------------
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
    shadow adamantine------------------


    Metal Working Metals.
    Arandur--------------------- not to be used for armors or weapons, only alloy work                                  | *NEW*
    Lead
    Tin
    Zinc
    Aluminum
    Electrum
    Nickel
     */

//flesh
    public static final RegistrySupplier<Item> FLESH_HELMET     = registerArmor(FLESH, HEAD);
    public static final RegistrySupplier<Item> FLESH_CHESTPLATE = registerArmor(FLESH, CHEST);
    public static final RegistrySupplier<Item> FLESH_LEGGINGS   = registerArmor(FLESH, LEGS);
    public static final RegistrySupplier<Item> FLESH_BOOTS      = registerArmor(FLESH, FEET);
//Lead
// public static final RegistrySupplier<Item> LEAD_HELMET     = registerArmor(LEAD, HEAD);
// public static final RegistrySupplier<Item> LEAD_CHESTPLATE = registerArmor(LEAD, CHEST);
// public static final RegistrySupplier<Item> LEAD_LEGGINGS   = registerArmor(LEAD, LEGS);
// public static final RegistrySupplier<Item> LEAD_BOOTS      = registerArmor(LEAD, FEET);
//Tin
//  public static final RegistrySupplier<Item> TIN_HELMET     = registerArmor(TIN, HEAD);
//  public static final RegistrySupplier<Item> TIN_CHESTPLATE = registerArmor(TIN, CHEST);
//  public static final RegistrySupplier<Item> TIN_LEGGINGS   = registerArmor(TIN, LEGS);
//  public static final RegistrySupplier<Item> TIN_BOOTS      = registerArmor(TIN, FEET);
//Zinc
//  public static final RegistrySupplier<Item> ZINC_HELMET     = registerArmor(ZINC, HEAD);
//  public static final RegistrySupplier<Item> ZINC_CHESTPLATE = registerArmor(ZINC, CHEST);
//  public static final RegistrySupplier<Item> ZINC_LEGGINGS   = registerArmor(ZINC, LEGS);
//  public static final RegistrySupplier<Item> ZINC_BOOTS      = registerArmor(ZINC, FEET);
//Silver
   public static final RegistrySupplier<Item> SILVER_HELMET     = registerArmor(SILVER, HEAD);
   public static final RegistrySupplier<Item> SILVER_CHESTPLATE = registerArmor(SILVER, CHEST);
   public static final RegistrySupplier<Item> SILVER_LEGGINGS   = registerArmor(SILVER, LEGS);
   public static final RegistrySupplier<Item> SILVER_BOOTS      = registerArmor(SILVER, FEET);
//Aluminum
//  public static final RegistrySupplier<Item> ALUMINUM_HELMET     = registerArmor(ALUMINUM, HEAD);
//  public static final RegistrySupplier<Item> ALUMINUM_CHESTPLATE = registerArmor(ALUMINUM, CHEST);
//  public static final RegistrySupplier<Item> ALUMINUM_LEGGINGS   = registerArmor(ALUMINUM, LEGS);
//  public static final RegistrySupplier<Item> ALUMINUM_BOOTS      = registerArmor(ALUMINUM, FEET);
//Electrum
//  public static final RegistrySupplier<Item> ELECTRUM_HELMET     = registerArmor(ELECTRUM, HEAD);
//  public static final RegistrySupplier<Item> ELECTRUM_CHESTPLATE = registerArmor(ELECTRUM, CHEST);
//  public static final RegistrySupplier<Item> ELECTRUM_LEGGINGS   = registerArmor(ELECTRUM, LEGS);
//  public static final RegistrySupplier<Item> ELECTRUM_BOOTS      = registerArmor(ELECTRUM, FEET);
//Copper
    public static final RegistrySupplier<Item> COPPER_HELMET     = registerArmor(COPPER, HEAD);
    public static final RegistrySupplier<Item> COPPER_CHESTPLATE = registerArmor(COPPER, CHEST);
    public static final RegistrySupplier<Item> COPPER_LEGGINGS   = registerArmor(COPPER, LEGS);
    public static final RegistrySupplier<Item> COPPER_BOOTS      = registerArmor(COPPER, FEET);
//Brass
    public static final RegistrySupplier<Item> BRASS_HELMET     = registerArmor(BRASS, HEAD);
    public static final RegistrySupplier<Item> BRASS_CHESTPLATE = registerArmor(BRASS, CHEST);
    public static final RegistrySupplier<Item> BRASS_LEGGINGS   = registerArmor(BRASS, LEGS);
    public static final RegistrySupplier<Item> BRASS_BOOTS      = registerArmor(BRASS, FEET);
//Bronze
    public static final RegistrySupplier<Item> BRONZE_HELMET     = registerArmor(BRONZE, HEAD);
    public static final RegistrySupplier<Item> BRONZE_CHESTPLATE = registerArmor(BRONZE, CHEST);
    public static final RegistrySupplier<Item> BRONZE_LEGGINGS   = registerArmor(BRONZE, LEGS);
    public static final RegistrySupplier<Item> BRONZE_BOOTS      = registerArmor(BRONZE, FEET);
//Nickel
// public static final RegistrySupplier<Item> NICKEL_HELMET     = registerArmor(NICKEL, HEAD);
// public static final RegistrySupplier<Item> NICKEL_CHESTPLATE = registerArmor(NICKEL, CHEST);
// public static final RegistrySupplier<Item> NICKEL_LEGGINGS   = registerArmor(NICKEL, LEGS);
// public static final RegistrySupplier<Item> NICKEL_BOOTS      = registerArmor(NICKEL, FEET);
//Platinum
    public static final RegistrySupplier<Item> PLATINUM_HELMET     = registerArmor(PLATINUM, HEAD);
    public static final RegistrySupplier<Item> PLATINUM_CHESTPLATE = registerArmor(PLATINUM, CHEST);
    public static final RegistrySupplier<Item> PLATINUM_LEGGINGS   = registerArmor(PLATINUM, LEGS);
    public static final RegistrySupplier<Item> PLATINUM_BOOTS      = registerArmor(PLATINUM, FEET);
//Bone
    public static final RegistrySupplier<Item> BONE_HELMET     = registerArmor(BONE, HEAD);
    public static final RegistrySupplier<Item> BONE_CHESTPLATE = registerArmor(BONE, CHEST);
    public static final RegistrySupplier<Item> BONE_LEGGINGS   = registerArmor(BONE, LEGS);
    public static final RegistrySupplier<Item> BONE_BOOTS      = registerArmor(BONE, FEET);
//Infernal Iron
    public static final RegistrySupplier<Item> INFERNAL_IRON_HELMET     = registerArmor(INFERNAL_IRON, HEAD);
    public static final RegistrySupplier<Item> INFERNAL_IRON_CHESTPLATE = registerArmor(INFERNAL_IRON, CHEST);
    public static final RegistrySupplier<Item> INFERNAL_IRON_LEGGINGS   = registerArmor(INFERNAL_IRON, LEGS);
    public static final RegistrySupplier<Item> INFERNAL_IRON_BOOTS      = registerArmor(INFERNAL_IRON, FEET);
//Cold Iron
    public static final RegistrySupplier<Item> COLD_IRON_HELMET     = registerArmor(COLD_IRON, HEAD);
    public static final RegistrySupplier<Item> COLD_IRON_CHESTPLATE = registerArmor(COLD_IRON, CHEST);
    public static final RegistrySupplier<Item> COLD_IRON_LEGGINGS   = registerArmor(COLD_IRON, LEGS);
    public static final RegistrySupplier<Item> COLD_IRON_BOOTS      = registerArmor(COLD_IRON, FEET);
//Steel
    public static final RegistrySupplier<Item> STEEL_HELMET     = registerArmor(STEEL, HEAD);
    public static final RegistrySupplier<Item> STEEL_CHESTPLATE = registerArmor(STEEL, CHEST);
    public static final RegistrySupplier<Item> STEEL_LEGGINGS   = registerArmor(STEEL, LEGS);
    public static final RegistrySupplier<Item> STEEL_BOOTS      = registerArmor(STEEL, FEET);
//Diamond
//Elven Steel
    public static final RegistrySupplier<Item> ELVEN_STEEL_HELMET     = registerArmor(ELVEN_STEEL, HEAD);
    public static final RegistrySupplier<Item> ELVEN_STEEL_CHESTPLATE = registerArmor(ELVEN_STEEL, CHEST);
    public static final RegistrySupplier<Item> ELVEN_STEEL_LEGGINGS   = registerArmor(ELVEN_STEEL, LEGS);
    public static final RegistrySupplier<Item> ELVEN_STEEL_BOOTS      = registerArmor(ELVEN_STEEL, FEET);
    //Dark Steel
    public static final RegistrySupplier<Item> DARK_STEEL_HELMET     = registerArmor(DARK_STEEL, HEAD);
    public static final RegistrySupplier<Item> DARK_STEEL_CHESTPLATE = registerArmor(DARK_STEEL, CHEST);
    public static final RegistrySupplier<Item> DARK_STEEL_LEGGINGS   = registerArmor(DARK_STEEL, LEGS);
    public static final RegistrySupplier<Item> DARK_STEEL_BOOTS      = registerArmor(DARK_STEEL, FEET);
//Netherite
//DRAGON_SCALE
    public static final RegistrySupplier<Item> DRAGON_SCALE_HELMET     = registerArmor(DRAGON_SCALE, HEAD);
    public static final RegistrySupplier<Item> DRAGON_SCALE_CHESTPLATE = registerArmor(DRAGON_SCALE, CHEST);
    public static final RegistrySupplier<Item> DRAGON_SCALE_LEGGINGS   = registerArmor(DRAGON_SCALE, LEGS);
    public static final RegistrySupplier<Item> DRAGON_SCALE_BOOTS      = registerArmor(DRAGON_SCALE, FEET);
//Palladium
    public static final RegistrySupplier<Item> PALLADIUM_HELMET     = registerArmor(PALLADIUM, HEAD);
    public static final RegistrySupplier<Item> PALLADIUM_CHESTPLATE = registerArmor(PALLADIUM, CHEST);
    public static final RegistrySupplier<Item> PALLADIUM_LEGGINGS   = registerArmor(PALLADIUM, LEGS);
    public static final RegistrySupplier<Item> PALLADIUM_BOOTS      = registerArmor(PALLADIUM, FEET);
//Titanium
    public static final RegistrySupplier<Item> TITANIUM_HELMET     = registerArmor(TITANIUM, HEAD);
    public static final RegistrySupplier<Item> TITANIUM_CHESTPLATE = registerArmor(TITANIUM, CHEST);
    public static final RegistrySupplier<Item> TITANIUM_LEGGINGS   = registerArmor(TITANIUM, LEGS);
    public static final RegistrySupplier<Item> TITANIUM_BOOTS      = registerArmor(TITANIUM, FEET);
//Tungsten
    public static final RegistrySupplier<Item> TUNGSTEN_HELMET     = registerArmor(TUNGSTEN, HEAD);
    public static final RegistrySupplier<Item> TUNGSTEN_CHESTPLATE = registerArmor(TUNGSTEN, CHEST);
    public static final RegistrySupplier<Item> TUNGSTEN_LEGGINGS   = registerArmor(TUNGSTEN, LEGS);
    public static final RegistrySupplier<Item> TUNGSTEN_BOOTS      = registerArmor(TUNGSTEN, FEET);
//Mithril
    public static final RegistrySupplier<Item> MITHRIL_HELMET     = registerArmor(MITHRIL, HEAD);
    public static final RegistrySupplier<Item> MITHRIL_CHESTPLATE = registerArmor(MITHRIL, CHEST);
    public static final RegistrySupplier<Item> MITHRIL_LEGGINGS   = registerArmor(MITHRIL, LEGS);
    public static final RegistrySupplier<Item> MITHRIL_BOOTS      = registerArmor(MITHRIL, FEET);
//Itanium
    public static final RegistrySupplier<Item> ITANIUM_HELMET     = registerArmor(ITANIUM, HEAD);
    public static final RegistrySupplier<Item> ITANIUM_CHESTPLATE = registerArmor(ITANIUM, CHEST);
    public static final RegistrySupplier<Item> ITANIUM_LEGGINGS   = registerArmor(ITANIUM, LEGS);
    public static final RegistrySupplier<Item> ITANIUM_BOOTS      = registerArmor(ITANIUM, FEET);
//Adamantine
    public static final RegistrySupplier<Item> ADAMANTIUM_HELMET     = registerArmor(ADAMANTINE, HEAD);
    public static final RegistrySupplier<Item> ADAMANTIUM_CHESTPLATE = registerArmor(ADAMANTINE, CHEST);
    public static final RegistrySupplier<Item> ADAMANTIUM_LEGGINGS   = registerArmor(ADAMANTINE, LEGS);
    public static final RegistrySupplier<Item> ADAMANTIUM_BOOTS      = registerArmor(ADAMANTINE, FEET);
//Black Adamantine
    public static final RegistrySupplier<Item> SHADOW_ADAMANTIUM_HELMET     = registerArmor(SHADOW_ADAMANTINE, HEAD);
    public static final RegistrySupplier<Item> SHADOW_ADAMANTIUM_CHESTPLATE = registerArmor(SHADOW_ADAMANTINE, CHEST);
    public static final RegistrySupplier<Item> SHADOW_ADAMANTIUM_LEGGINGS   = registerArmor(SHADOW_ADAMANTINE, LEGS);
    public static final RegistrySupplier<Item> SHADOW_ADAMANTIUM_BOOTS      = registerArmor(SHADOW_ADAMANTINE, FEET);
//LEGENDARY
    public static final RegistrySupplier<Item> LEGENDARY_HELMET     = registerArmor(LEGENDARY, HEAD);
    public static final RegistrySupplier<Item> LEGENDARY_CHESTPLATE = registerArmor(LEGENDARY, CHEST);
    public static final RegistrySupplier<Item> LEGENDARY_LEGGINGS   = registerArmor(LEGENDARY, LEGS);
    public static final RegistrySupplier<Item> LEGENDARY_BOOTS      = registerArmor(LEGENDARY, FEET);
    private static RegistrySupplier<Item> registerArmor(String id, ArmorMaterial armorMaterial, EquipmentSlot slot) {
        return ARMOR.register(id, () ->  new ArmorItem(armorMaterial, slot, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    }
    private static RegistrySupplier<Item> registerArmor(ArmorMaterial armorMaterial, EquipmentSlot slot){
        return registerArmor(armorMaterial.toString().toLowerCase(Locale.ROOT) + "_" + slotName(slot), armorMaterial, slot);
    }
/*private static void registerArmorCollection(ArmorMaterial armorMaterial) {
    for (EquipmentSlot slot : List.of(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET)) {
        registerArmor(armorMaterial.toString().toLowerCase(Locale.ROOT) + "_" + slotName(slot), armorMaterial, slot);
    }
}*/
    private static String slotName(EquipmentSlot slot) {
    return switch (slot) {
        case HEAD -> "helmet";
        case CHEST -> "chestplate";
        case LEGS -> "leggings";
        case FEET -> "boots";
        case OFFHAND -> "offhand";
        case MAINHAND -> "mainhand";
    };
    }
}
