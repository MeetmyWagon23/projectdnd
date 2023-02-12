package com.meetmywagon23.projectdnd.init;

import com.meetmywagon23.projectdnd.ProjectDnD;
import com.meetmywagon23.projectdnd.armormaterials.ArmorSetMaterials;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

public class ArmorsInit {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);
    public static final ArmorMaterial FLESH = ArmorSetMaterials.FLESH;
    public static final ArmorMaterial LEAD = ArmorSetMaterials.LEAD;
    public static final ArmorMaterial TIN = ArmorSetMaterials.TIN;
    public static final ArmorMaterial ZINC = ArmorSetMaterials.ZINC;
    public static final ArmorMaterial SILVER = ArmorSetMaterials.SILVER;
    public static final ArmorMaterial ALUMINUM = ArmorSetMaterials.ALUMINUM;
    public static final ArmorMaterial ELECTRUM = ArmorSetMaterials.ELECTRUM;
    public static final ArmorMaterial COPPER = ArmorSetMaterials.COPPER;
    public static final ArmorMaterial BRASS = ArmorSetMaterials.BRASS;
    public static final ArmorMaterial BRONZE = ArmorSetMaterials.BRONZE;
    public static final ArmorMaterial NICKEL = ArmorSetMaterials.NICKEL;
    public static final ArmorMaterial PLATINUM = ArmorSetMaterials.PLATINUM;
    public static final ArmorMaterial BONE = ArmorSetMaterials.BONE;
    public static final ArmorMaterial STEEL = ArmorSetMaterials.STEEL;
    public static final ArmorMaterial PALLADIUM = ArmorSetMaterials.PALLADIUM;
    public static final ArmorMaterial TITANIUM = ArmorSetMaterials.TITANIUM;
    public static final ArmorMaterial TUNGSTEN = ArmorSetMaterials.TUNGSTEN;
    public static final ArmorMaterial MITHRIL = ArmorSetMaterials.MITHRIL;
    public static final ArmorMaterial ITANIUM = ArmorSetMaterials.ITANIUM;
    public static final ArmorMaterial ADAMANTINE = ArmorSetMaterials.ADAMANTINE;
    public static final ArmorMaterial LEGENDARY = ArmorSetMaterials.LEGENDARY;


//flesh
    public static final Item FLESH_HELMET = new ArmorItem(FLESH, EquipmentSlot.HEAD, new Item.Settings().group(ProjectDnD.CREATIVE_TAB));
    public static final Item FLESH_CHESTPLATE = new ArmorItem(FLESH, EquipmentSlot.CHEST, new Item.Settings().group(ProjectDnD.CREATIVE_TAB));
    public static final Item FLESH_LEGGINGS = new ArmorItem(FLESH, EquipmentSlot.LEGS, new Item.Settings().group(ProjectDnD.CREATIVE_TAB));
    public static final Item FLESH_BOOTS = new ArmorItem(FLESH, EquipmentSlot.FEET, new Item.Settings().group(ProjectDnD.CREATIVE_TAB));

//lead

//tin

//zinc

//silver

//aluminum

//electrum

//copper

//brass

//bronze

//nickel

//platinum

//bone

//steel

//diamond
//netherite
//palladium

//titanium


//tungsten

//mithril

//itanium

//adamantine

//LEGENDARY CORE-----NOT TO BE USED

}
