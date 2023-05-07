package com.meetmywagon23.projectrpg.init;

import com.meetmywagon23.projectrpg.ProjectRPG;
import com.meetmywagon23.projectrpg.armormaterials.WagonsArmorMaterial;
import com.meetmywagon23.projectrpg.items.WagonsArmorItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

import static com.meetmywagon23.projectrpg.armormaterials.ArmorSetMaterials.*;
import static net.minecraft.entity.EquipmentSlot.*;

public class ArmorsInit {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ProjectRPG.MOD_ID, Registry.ITEM_KEY);
        /* notes to keep track of stuff, why the hell are you in here anyway?
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
   public static final RegistrySupplier<Item> LIGHT_SILVER_HELMET     = registerArmor(LIGHT_SILVER, HEAD);
   public static final RegistrySupplier<Item> LIGHT_SILVER_CHESTPLATE = registerArmor(LIGHT_SILVER, CHEST);
   public static final RegistrySupplier<Item> LIGHT_SILVER_LEGGINGS   = registerArmor(LIGHT_SILVER, LEGS);
   public static final RegistrySupplier<Item> LIGHT_SILVER_BOOTS      = registerArmor(LIGHT_SILVER, FEET);
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
    public static final RegistrySupplier<Item> LIGHT_COPPER_HELMET     = registerArmor(LIGHT_COPPER, HEAD);
    public static final RegistrySupplier<Item> LIGHT_COPPER_CHESTPLATE = registerArmor(LIGHT_COPPER, CHEST);
    public static final RegistrySupplier<Item> LIGHT_COPPER_LEGGINGS   = registerArmor(LIGHT_COPPER, LEGS);
    public static final RegistrySupplier<Item> LIGHT_COPPER_BOOTS      = registerArmor(LIGHT_COPPER, FEET);
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
    public static final RegistrySupplier<Item> LIGHT_PLATINUM_HELMET     = registerArmor(LIGHT_PLATINUM, HEAD);
    public static final RegistrySupplier<Item> LIGHT_PLATINUM_CHESTPLATE = registerArmor(LIGHT_PLATINUM, CHEST);
    public static final RegistrySupplier<Item> LIGHT_PLATINUM_LEGGINGS   = registerArmor(LIGHT_PLATINUM, LEGS);
    public static final RegistrySupplier<Item> LIGHT_PLATINUM_BOOTS      = registerArmor(LIGHT_PLATINUM, FEET);
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
    public static final RegistrySupplier<Item> LIGHT_COLD_IRON_HELMET     = registerArmor(COLD_IRON_MAIL, HEAD);
    public static final RegistrySupplier<Item> LIGHT_COLD_IRON_CHESTPLATE = registerArmor(COLD_IRON_MAIL, CHEST);
    public static final RegistrySupplier<Item> LIGHT_COLD_IRON_LEGGINGS   = registerArmor(COLD_IRON_MAIL, LEGS);
    public static final RegistrySupplier<Item> LIGHT_COLD_IRON_BOOTS      = registerArmor(COLD_IRON_MAIL, FEET);
//Wither Bone
    public static final RegistrySupplier<Item> WITHER_BONE_HELMET = registerArmor(WITHER_BONE, HEAD);
    public static final RegistrySupplier<Item> WITHER_BONE_CHESTPLATE = registerArmor(WITHER_BONE, CHEST);
    public static final RegistrySupplier<Item> WITHER_BONE_LEGGINGS = registerArmor(WITHER_BONE, LEGS);
    public static final RegistrySupplier<Item> WITHER_BONE_BOOTS = registerArmor(WITHER_BONE, FEET);
//Steel
    public static final RegistrySupplier<Item> STEEL_HELMET     = registerArmor(STEEL, HEAD);
    public static final RegistrySupplier<Item> STEEL_CHESTPLATE = registerArmor(STEEL, CHEST);
    public static final RegistrySupplier<Item> STEEL_LEGGINGS   = registerArmor(STEEL, LEGS);
    public static final RegistrySupplier<Item> STEEL_BOOTS      = registerArmor(STEEL, FEET);
    public static final RegistrySupplier<Item> LIGHT_STEEL_HELMET     = registerArmor(LIGHT_STEEL, HEAD);
    public static final RegistrySupplier<Item> LIGHT_STEEL_CHESTPLATE = registerArmor(LIGHT_STEEL, CHEST);
    public static final RegistrySupplier<Item> LIGHT_STEEL_LEGGINGS   = registerArmor(LIGHT_STEEL, LEGS);
    public static final RegistrySupplier<Item> LIGHT_STEEL_BOOTS      = registerArmor(LIGHT_STEEL, FEET);
//Diamond
//Elven Steel
    public static final RegistrySupplier<Item> ELVEN_STEEL_HELMET     = registerArmor(ELVEN_STEEL, HEAD);
    public static final RegistrySupplier<Item> ELVEN_STEEL_CHESTPLATE = registerArmor(ELVEN_STEEL, CHEST);
    public static final RegistrySupplier<Item> ELVEN_STEEL_LEGGINGS   = registerArmor(ELVEN_STEEL, LEGS);
    public static final RegistrySupplier<Item> ELVEN_STEEL_BOOTS      = registerArmor(ELVEN_STEEL, FEET);
    public static final RegistrySupplier<Item> ELVEN_STEEL_MAIL_HELMET     = registerArmor(ELVEN_STEEL_MAIL, HEAD);
    public static final RegistrySupplier<Item> ELVEN_STEEL_MAIL_CHESTPLATE = registerArmor(ELVEN_STEEL_MAIL, CHEST);
    public static final RegistrySupplier<Item> ELVEN_STEEL_MAIL_LEGGINGS   = registerArmor(ELVEN_STEEL_MAIL, LEGS);
    public static final RegistrySupplier<Item> ELVEN_STEEL_MAIL_BOOTS      = registerArmor(ELVEN_STEEL_MAIL, FEET);
    //Dark Steel
    public static final RegistrySupplier<Item> DARK_STEEL_HELMET     = registerArmor(DARK_STEEL, HEAD);
    public static final RegistrySupplier<Item> DARK_STEEL_CHESTPLATE = registerArmor(DARK_STEEL, CHEST);
    public static final RegistrySupplier<Item> DARK_STEEL_LEGGINGS   = registerArmor(DARK_STEEL, LEGS);
    public static final RegistrySupplier<Item> DARK_STEEL_BOOTS      = registerArmor(DARK_STEEL, FEET);
    public static final RegistrySupplier<Item> DARK_STEEL_MAIL_HELMET     = registerArmor(DARK_STEEL_MAIL, HEAD);
    public static final RegistrySupplier<Item> DARK_STEEL_MAIL_CHESTPLATE = registerArmor(DARK_STEEL_MAIL, CHEST);
    public static final RegistrySupplier<Item> DARK_STEEL_MAIL_LEGGINGS   = registerArmor(DARK_STEEL_MAIL, LEGS);
    public static final RegistrySupplier<Item> DARK_STEEL_MAIL_BOOTS      = registerArmor(DARK_STEEL_MAIL, FEET);
//Netherite
//DRAGON_SCALE
    public static final RegistrySupplier<Item> LIGHT_DRAGON_SCALE_HELMET     = registerArmor(DRAGON_SCALE_MAIL, HEAD);
    public static final RegistrySupplier<Item> LIGHT_DRAGON_SCALE_CHESTPLATE = registerArmor(DRAGON_SCALE_MAIL, CHEST);
    public static final RegistrySupplier<Item> LIGHT_DRAGON_SCALE_LEGGINGS   = registerArmor(DRAGON_SCALE_MAIL, LEGS);
    public static final RegistrySupplier<Item> LIGHT_DRAGON_SCALE_BOOTS      = registerArmor(DRAGON_SCALE_MAIL, FEET);
//Palladium
    public static final RegistrySupplier<Item> PALLADIUM_HELMET     = registerArmor(PALLADIUM, HEAD);
    public static final RegistrySupplier<Item> PALLADIUM_CHESTPLATE = registerArmor(PALLADIUM, CHEST);
    public static final RegistrySupplier<Item> PALLADIUM_LEGGINGS   = registerArmor(PALLADIUM, LEGS);
    public static final RegistrySupplier<Item> PALLADIUM_BOOTS      = registerArmor(PALLADIUM, FEET);
    public static final RegistrySupplier<Item> LIGHT_PALLADIUM_HELMET     = registerArmor(LIGHT_PALLADIUM, HEAD);
    public static final RegistrySupplier<Item> LIGHT_PALLADIUM_CHESTPLATE = registerArmor(LIGHT_PALLADIUM, CHEST);
    public static final RegistrySupplier<Item> LIGHT_PALLADIUM_LEGGINGS   = registerArmor(LIGHT_PALLADIUM, LEGS);
    public static final RegistrySupplier<Item> LIGHT_PALLADIUM_BOOTS      = registerArmor(LIGHT_PALLADIUM, FEET);
//Titanium
    public static final RegistrySupplier<Item> TITANIUM_HELMET     = registerArmor(TITANIUM, HEAD);
    public static final RegistrySupplier<Item> TITANIUM_CHESTPLATE = registerArmor(TITANIUM, CHEST);
    public static final RegistrySupplier<Item> TITANIUM_LEGGINGS   = registerArmor(TITANIUM, LEGS);
    public static final RegistrySupplier<Item> TITANIUM_BOOTS      = registerArmor(TITANIUM, FEET);
    public static final RegistrySupplier<Item> LIGHT_TITANIUM_HELMET     = registerArmor(LIGHT_TITANIUM, HEAD);
    public static final RegistrySupplier<Item> LIGHT_TITANIUM_CHESTPLATE = registerArmor(LIGHT_TITANIUM, CHEST);
    public static final RegistrySupplier<Item> LIGHT_TITANIUM_LEGGINGS   = registerArmor(LIGHT_TITANIUM, LEGS);
    public static final RegistrySupplier<Item> LIGHT_TITANIUM_BOOTS      = registerArmor(LIGHT_TITANIUM, FEET);
//Tungsten
    public static final RegistrySupplier<Item> TUNGSTEN_HELMET     = registerArmor(TUNGSTEN, HEAD);
    public static final RegistrySupplier<Item> TUNGSTEN_CHESTPLATE = registerArmor(TUNGSTEN, CHEST);
    public static final RegistrySupplier<Item> TUNGSTEN_LEGGINGS   = registerArmor(TUNGSTEN, LEGS);
    public static final RegistrySupplier<Item> TUNGSTEN_BOOTS      = registerArmor(TUNGSTEN, FEET);
//Mithril
    public static final RegistrySupplier<Item> LIGHT_MITHRIL_HELMET     = registerArmor(MITHRIL_MAIL, HEAD);
    public static final RegistrySupplier<Item> LIGHT_MITHRIL_CHESTPLATE = registerArmor(MITHRIL_MAIL, CHEST);
    public static final RegistrySupplier<Item> LIGHT_MITHRIL_LEGGINGS   = registerArmor(MITHRIL_MAIL, LEGS);
    public static final RegistrySupplier<Item> LIGHT_MITHRIL_BOOTS      = registerArmor(MITHRIL_MAIL, FEET);
//Itanium_MAIL
    public static final RegistrySupplier<Item> LIGHT_ITANIUM_HELMET     = registerArmor(ITANIUM_MAIL, HEAD);
    public static final RegistrySupplier<Item> LIGHT_ITANIUM_CHESTPLATE = registerArmor(ITANIUM_MAIL, CHEST);
    public static final RegistrySupplier<Item> LIGHT_ITANIUM_LEGGINGS   = registerArmor(ITANIUM_MAIL, LEGS);
    public static final RegistrySupplier<Item> LIGHT_ITANIUM_BOOTS      = registerArmor(ITANIUM_MAIL, FEET);
//Adamantine
    public static final RegistrySupplier<Item> ADAMANTIUM_HELMET     = registerArmor(ADAMANTINE, HEAD);
    public static final RegistrySupplier<Item> ADAMANTIUM_CHESTPLATE = registerArmor(ADAMANTINE, CHEST);
    public static final RegistrySupplier<Item> ADAMANTIUM_LEGGINGS   = registerArmor(ADAMANTINE, LEGS);
    public static final RegistrySupplier<Item> ADAMANTIUM_BOOTS      = registerArmor(ADAMANTINE, FEET);
    public static final RegistrySupplier<Item> LIGHT_ADAMANTIUM_HELMET     = registerArmor(LIGHT_ADAMANTINE, HEAD);
    public static final RegistrySupplier<Item> LIGHT_ADAMANTIUM_CHESTPLATE = registerArmor(LIGHT_ADAMANTINE, CHEST);
    public static final RegistrySupplier<Item> LIGHT_ADAMANTIUM_LEGGINGS   = registerArmor(LIGHT_ADAMANTINE, LEGS);
    public static final RegistrySupplier<Item> LIGHT_ADAMANTIUM_BOOTS      = registerArmor(LIGHT_ADAMANTINE, FEET);
//Shadow Adamantine
    public static final RegistrySupplier<Item> SHADOW_ADAMANTIUM_HELMET     = registerArmor(SHADOW_ADAMANTINE, HEAD);
    public static final RegistrySupplier<Item> SHADOW_ADAMANTIUM_CHESTPLATE = registerArmor(SHADOW_ADAMANTINE, CHEST);
    public static final RegistrySupplier<Item> SHADOW_ADAMANTIUM_LEGGINGS   = registerArmor(SHADOW_ADAMANTINE, LEGS);
    public static final RegistrySupplier<Item> SHADOW_ADAMANTIUM_BOOTS      = registerArmor(SHADOW_ADAMANTINE, FEET);
    public static final RegistrySupplier<Item> LIGHT_SHADOW_ADAMANTIUM_HELMET     = registerArmor(LIGHT_SHADOW_ADAMANTINE, HEAD);
    public static final RegistrySupplier<Item> LIGHT_SHADOW_ADAMANTIUM_CHESTPLATE = registerArmor(LIGHT_SHADOW_ADAMANTINE, CHEST);
    public static final RegistrySupplier<Item> LIGHT_SHADOW_ADAMANTIUM_LEGGINGS   = registerArmor(LIGHT_SHADOW_ADAMANTINE, LEGS);
    public static final RegistrySupplier<Item> LIGHT_SHADOW_ADAMANTIUM_BOOTS      = registerArmor(LIGHT_SHADOW_ADAMANTINE, FEET);
//LEGENDARY
    public static final RegistrySupplier<Item> LEGENDARY_HELMET     = registerArmor(LEGENDARY, HEAD);
    public static final RegistrySupplier<Item> LEGENDARY_CHESTPLATE = registerArmor(LEGENDARY, CHEST);
    public static final RegistrySupplier<Item> LEGENDARY_LEGGINGS   = registerArmor(LEGENDARY, LEGS);
    public static final RegistrySupplier<Item> LEGENDARY_BOOTS      = registerArmor(LEGENDARY, FEET);
    public static final RegistrySupplier<Item> LIGHT_LEGENDARY_HELMET     = registerArmor(LIGHT_LEGENDARY, HEAD);
    public static final RegistrySupplier<Item> LIGHT_LEGENDARY_CHESTPLATE = registerArmor(LIGHT_LEGENDARY, CHEST);
    public static final RegistrySupplier<Item> LIGHT_LEGENDARY_LEGGINGS   = registerArmor(LIGHT_LEGENDARY, LEGS);
    public static final RegistrySupplier<Item> LIGHT_LEGENDARY_BOOTS      = registerArmor(LIGHT_LEGENDARY, FEET);
    private static RegistrySupplier<Item> registerArmor(String id, WagonsArmorMaterial wagonsArmorMaterial, EquipmentSlot slot) {
        return ARMOR.register(id, () ->  new WagonsArmorItem(wagonsArmorMaterial, slot, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    }
    private static RegistrySupplier<Item> registerArmor(WagonsArmorMaterial wagonsArmorMaterial, EquipmentSlot slot){
        return registerArmor(wagonsArmorMaterial.toString().toLowerCase(Locale.ROOT) + "_" + slotName(slot), wagonsArmorMaterial, slot);
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