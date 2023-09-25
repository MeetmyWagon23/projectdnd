package com.meetmywagon23.projectrpg.init;

import com.meetmywagon23.projectrpg.ProjectRPG;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class WeaponsInit {
    public static final DeferredRegister<Item> WEAPONS = DeferredRegister.create(ProjectRPG.MOD_ID, Registry.ITEM_KEY);
    /*
    ---------------------------Ponderosa Pine tree -> planks -> sticks -> strongest stick material---(also used for ALL Bo Staffs)-----------------------
    mohs hardness order
    wood------------------------vanilla
    Ponderosa Wood-------------------------------did not check hardness vs stone.
    stone-----------------------vanilla

    ------lead------------------------NO TOOLS/ARMOR                                                                    REMOVED
   NMONONONONONONONONONNONONONONONONONONONONON ------tin-------------------------NO TOOLS/ARMOR                                                                    REMOVED
    gold------------------------------vanilla
    ------zinc------------------------NO TOOLS/ARMOR                                                                    REMOVED
    silver----------------------------
    ------aluminum--------------------NO TOOLS/ARMOR                                                                    REMOVED
    ------electrum--------------------NO TOOLS/ARMOR                                                                    REMOVED
    copper----------------------
   noononononoonnononoononononononononononoonononnno brass-----------------------
    bronze----------------------
    ------nickel----------------------NO TOOLS/ARMOR                                                                    REMOVED
    platinum--------------------
    bone------------------------
    iron------------------------vanilla
    Infernal Iron---------------Nether Equivalent of Iron, Natural Fire Aspect
    Cold Iron------------------- Cooked at a lower Temp than Iron
    steel-----------------------
    diamond---------------------vanilla
    elven steel-----------------               LIGHTWEIGHT
    Dark Steel------------------ Dwarvan steel Alloy using Star Metal, lightweight, magic resistant | Very Enchantable
    netherite-------------------vanilla
    dragon scale----------------
    palladium-------------------
  nonononoonononononononononononononononononononono  titanium--------------------
    tungsten--------------------
    mithril---------------------
   nononononononononononononononoonononononononononono itanium---------------------to be renamed/removed
    adamantine------------------
    shadow adamantine
    Celestial Mithril
    dragon bone adamantine
    dragon bone shadow adamantine

    Alloy Forging/Metal Working Materials.
    Arandur--------------------- not to be used for armors or weapons, only alloy work
    Lead
    nonononononoTin
    Zinc Nickel Alloy
    Aluminum
    Electrum
    Starfall (otherwise known as Star Metal)
     */
 /*---------------------------------------------------------------------------------------------------------------------
 ------------------------------------------------------DAGGERS----------------------------------------------------------
 Daggers Damage needs to be adjusted, and Speed needs to be adjusted. not sure how to change it. will probably just make
 my own Dagger Class, using the Trident as a working ground. for now these will be as is.
 ---------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<TridentItem> WOOD_DAGGER = WEAPONS.register("wood_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(59).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> STONE_DAGGER = WEAPONS.register("stone_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> GOLD_DAGGER = WEAPONS.register("gold_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(32).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> SILVER_DAGGER = WEAPONS.register("silver_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(161).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> COPPER_DAGGER = WEAPONS.register("copper_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(181).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> BRASS_DAGGER = WEAPONS.register("brass_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(201).group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<TridentItem> BRONZE_DAGGER = WEAPONS.register("bronze_dagger",
//            () -> new TridentItem((new Item.Settings()).maxDamage(221).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> PLATINUM_DAGGER = WEAPONS.register("platinum_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(241).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> GLACIAL_DAGGER = WEAPONS.register("glacial_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(241).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> BONE_DAGGER = WEAPONS.register("bone_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(32).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> IRON_DAGGER = WEAPONS.register("iron_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(250).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> INFERNAL_IRON_DAGGER = WEAPONS.register("infernal_iron_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(250).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> COLD_IRON_DAGGER = WEAPONS.register("cold_iron_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(250).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> STEEL_DAGGER = WEAPONS.register("steel_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(670).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> DIAMOND_DAGGER = WEAPONS.register("diamond_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(1561).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> ELVEN_STEEL_DAGGER = WEAPONS.register("elven_steel_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(670).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> DARK_STEEL_DAGGER = WEAPONS.register("dark_steel_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(670).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> NETHERITE_DAGGER = WEAPONS.register("netherite_dagger",
            () -> new TridentItem((new Item.Settings().fireproof().maxDamage(2031).group(ProjectRPG.CREATIVE_TAB))));
    public static final RegistrySupplier<TridentItem> DRAGON_BONE_DAGGER = WEAPONS.register("dragon_bone_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(2341).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> PALLADIUM_DAGGER = WEAPONS.register("palladium_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(2651).group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<TridentItem> TITANIUM_DAGGER = WEAPONS.register("titanium_dagger",
 //          () -> new TridentItem((new Item.Settings()).maxDamage(2961).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> TUNGSTEN_DAGGER = WEAPONS.register("tungsten_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(3271).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> MITHRIL_DAGGER = WEAPONS.register("mithril_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(3581).group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<TridentItem> ITANIUM_DAGGER = WEAPONS.register("itanium_dagger",
 //           () -> new TridentItem((new Item.Settings()).maxDamage(3891).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> ADAMANTINE_DAGGER = WEAPONS.register("adamantine_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(4101).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> SHADOW_ADAMANTINE_DAGGER = WEAPONS.register("shadow_adamantine_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(4101).group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SPEARS------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_SPEAR = WEAPONS.register("wood_spear",
            () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_SPEAR = WEAPONS.register("stone_spear",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_SPEAR = WEAPONS.register("gold_spear",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SPEAR = WEAPONS.register("silver_spear",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SPEAR = WEAPONS.register("copper_spear",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> BRASS_SPEAR = WEAPONS.register("brass_spear",
//            () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SPEAR = WEAPONS.register("bronze_spear",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SPEAR = WEAPONS.register("platinum_spear",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_SPEAR = WEAPONS.register("glacial_spear",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_SPEAR = WEAPONS.register("bone_spear",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_SPEAR = WEAPONS.register("iron_spear",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_SPEAR = WEAPONS.register("infernal_iron_spear",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_SPEAR = WEAPONS.register("cold_iron_spear",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SPEAR = WEAPONS.register("steel_spear",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_SPEAR = WEAPONS.register("diamond_spear",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_SPEAR = WEAPONS.register("elven_steel_spear",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_SPEAR = WEAPONS.register("dark_steel_spear",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_SPEAR = WEAPONS.register("netherite_spear",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_SPEAR = WEAPONS.register("dragon_bone_spear",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SPEAR = WEAPONS.register("palladium_spear",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
  //  public static final RegistrySupplier<SwordItem> TITANIUM_SPEAR = WEAPONS.register("titanium_spear",
  //          () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_SPEAR = WEAPONS.register("tungsten_spear",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SPEAR = WEAPONS.register("mithril_spear",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> ITANIUM_SPEAR = WEAPONS.register("itanium_spear",
 //           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SPEAR = WEAPONS.register("adanamtine_spear",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_SPEAR = WEAPONS.register("shadow_adanamtine_spear",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------RAPIERS-----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_RAPIER = WEAPONS.register("wood_rapier",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_RAPIER = WEAPONS.register("stone_rapier",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_RAPIER = WEAPONS.register("gold_rapier",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_RAPIER = WEAPONS.register("silver_rapier",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_RAPIER = WEAPONS.register("copper_rapier",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> BRASS_RAPIER = WEAPONS.register("brass_rapier",
 //           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_RAPIER = WEAPONS.register("bronze_rapier",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_RAPIER = WEAPONS.register("platinum_rapier",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_RAPIER= WEAPONS.register("glacial_rapier",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_RAPIER = WEAPONS.register("bone_rapier",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_RAPIER = WEAPONS.register("iron_rapier",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_RAPIER = WEAPONS.register("infernal_iron_rapier",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_RAPIER = WEAPONS.register("cold_iron_rapier",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_RAPIER = WEAPONS.register("steel_rapier",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_RAPIER = WEAPONS.register("diamond_rapier",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_RAPIER = WEAPONS.register("elven_steel_rapier",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_RAPIER = WEAPONS.register("dark_steel_rapier",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_RAPIER = WEAPONS.register("netherite_rapier",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_RAPIER = WEAPONS.register("dragon_bone_rapier",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_RAPIER = WEAPONS.register("palladium_rapier",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TITANIUM_RAPIER = WEAPONS.register("titanium_rapier",
            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> TUNGSTEN_RAPIER = WEAPONS.register("tungsten_rapier",
 //           () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_RAPIER = WEAPONS.register("mithril_rapier",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> ITANIUM_RAPIER = WEAPONS.register("itanium_rapier",
 //          () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_RAPIER = WEAPONS.register("adanamtine_rapier",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_RAPIER = WEAPONS.register("shadow_adanamtine_rapier",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------HAND AXES---------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
 //  public static final RegistrySupplier<AxeItem> WOOD_HANDAXE = WEAPONS.register("wood_handaxe",
 //          () -> new AxeItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> STONE_HANDAXE = WEAPONS.register("stone_handaxe",
 //          () -> new AxeItem(ToolMaterials.STONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> GOLD_HANDAXE = WEAPONS.register("gold_handaxe",
 //          () -> new AxeItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> SILVER_HANDAXE = WEAPONS.register("silver_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.SILVER, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> COPPER_HANDAXE = WEAPONS.register("copper_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.COPPER, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> BRASS_HANDAXE = WEAPONS.register("brass_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.BRASS, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> BRONZE_HANDAXE = WEAPONS.register("bronze_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.BRONZE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> PLATINUM_HANDAXE = WEAPONS.register("platinum_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.PLATINUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> GLACIAL_HANDAXE = WEAPONS.register("glacial_handaxe",
 //          () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> BONE_HANDAXE = WEAPONS.register("bone_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.BONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> IRON_HANDAXE = WEAPONS.register("iron_handaxe",
 //          () -> new AxeItem(ToolMaterials.IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> INFERNAL_IRON_HANDAXE = WEAPONS.register("infernal_iron_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> COLD_IRON_HANDAXE = WEAPONS.register("cold_iron_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.COLD_IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> STEEL_HANDAXE = WEAPONS.register("steel_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> DIAMOND_HANDAXE = WEAPONS.register("diamond_handaxe",
 //          () -> new AxeItem(ToolMaterials.DIAMOND, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> ELVEN_STEEL_HANDAXE = WEAPONS.register("elven_steel_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> DARK_STEEL_HANDAXE = WEAPONS.register("dark_steel_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.DARK_STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> NETHERITE_HANDAXE = WEAPONS.register("netherite_handaxe",
 //          () -> new AxeItem(ToolMaterials.NETHERITE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> DRAGON_BONE_HANDAXE = WEAPONS.register("dragon_bone_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> PALLADIUM_HANDAXE = WEAPONS.register("palladium_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.PALLADIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> TITANIUM_HANDAXE = WEAPONS.register("titanium_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.TITANIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> TUNGSTEN_HANDAXE = WEAPONS.register("tungsten_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.TUNGSTEN, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> MITHRIL_HANDAXE = WEAPONS.register("mithril_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.MITHRIL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> ITANIUM_HANDAXE = WEAPONS.register("itanium_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.ITANIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> ADAMANTINE_HANDAXE = WEAPONS.register("adanamtine_handaxe",
 //          () -> new AxeItem(ToolMaterialsInit.ADAMANTINE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<AxeItem> SHADOW_ADAMANTINE_HANDAXE = WEAPONS.register("shadow_adanamtine_handaxe",
//          () -> new AxeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------LONGSWORDS--------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
//   public static final RegistrySupplier<SwordItem> WOOD_LONGSWORD = WEAPONS.register("wood_longsword",
//       () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> STONE_LONGSWORD = WEAPONS.register("stone_longsword",
//           () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> GOLD_LONGSWORD = WEAPONS.register("gold_longsword",
//           () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> SILVER_LONGSWORD = WEAPONS.register("silver_longsword",
//           () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> COPPER_LONGSWORD = WEAPONS.register("copper_longsword",
//           () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> BRASS_LONGSWORD = WEAPONS.register("brass_longsword",
//           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> BRONZE_LONGSWORD = WEAPONS.register("bronze_longsword",
//           () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> PLATINUM_LONGSWORD = WEAPONS.register("platinum_longsword",
//           () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> GLACIAL_LONGSWORD = WEAPONS.register("glacial_longsword",
//           () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> BONE_LONGSWORD = WEAPONS.register("bone_longsword",
//           () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> IRON_LONGSWORD = WEAPONS.register("iron_longsword",
//           () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> INFERNAL_IRON_LONGSWORD = WEAPONS.register("infernal_iron_longsword",
//           () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> COLD_IRON_LONGSWORD = WEAPONS.register("cold_iron_longsword",
//           () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> STEEL_LONGSWORD = WEAPONS.register("steel_longsword",
//           () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> DIAMOND_LONGSWORD = WEAPONS.register("diamond_longsword",
//           () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> ELVEN_STEEL_LONGSWORD = WEAPONS.register("elven_steel_longsword",
//           () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> DARK_STEEL_LONGSWORD = WEAPONS.register("dark_steel_longsword",
//           () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> NETHERITE_LONGSWORD = WEAPONS.register("netherite_longsword",
//           () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> DRAGON_BONE_LONGSWORD = WEAPONS.register("dragon_bone_longsword",
//           () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> PALLADIUM_LONGSWORD = WEAPONS.register("palladium_longsword",
//           () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> TITANIUM_LONGSWORD = WEAPONS.register("titanium_longsword",
//           () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> TUNGSTEN_LONGSWORD = WEAPONS.register("tungsten_longsword",
//           () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> MITHRIL_LONGSWORD = WEAPONS.register("mithril_longsword",
//           () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> ITANIUM_LONGSWORD = WEAPONS.register("itanium_longsword",
//           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> ADAMANTINE_LONGSWORD = WEAPONS.register("adanamtine_longsword",
//           () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_LONGSWORD = WEAPONS.register("shadow_adanamtine_longsword",
//           () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------GREATSWORDS-------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_GREATSWORD = WEAPONS.register("wood_greatsword",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_GREATSWORD = WEAPONS.register("stone_greatsword",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_GREATSWORD = WEAPONS.register("gold_greatsword",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_GREATSWORD = WEAPONS.register("silver_greatsword",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_GREATSWORD = WEAPONS.register("copper_greatsword",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> BRASS_GREATSWORD = WEAPONS.register("brass_greatsword",
 //           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_GREATSWORD = WEAPONS.register("bronze_greatsword",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_GREATSWORD = WEAPONS.register("platinum_greatsword",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_GREATSWORD = WEAPONS.register("glacial_greatsword",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_GREATSWORD = WEAPONS.register("bone_greatsword",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_GREATSWORD = WEAPONS.register("iron_greatsword",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_GREATSWORD = WEAPONS.register("infernal_iron_greatsword",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_GREATSWORD = WEAPONS.register("cold_iron_greatsword",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_GREATSWORD = WEAPONS.register("steel_greatsword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_GREATSWORD = WEAPONS.register("diamond_greatsword",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_GREATSWORD = WEAPONS.register("elven_steel_greatsword",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_GREATSWORD = WEAPONS.register("dark_steel_greatsword",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_GREATSWORD = WEAPONS.register("netherite_greatsword",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_GREATSWORD = WEAPONS.register("dragon_bone_greatsword",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_GREATSWORD = WEAPONS.register("palladium_greatsword",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
  //  public static final RegistrySupplier<SwordItem> TITANIUM_GREATSWORD = WEAPONS.register("titanium_greatsword",
  //          () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_GREATSWORD = WEAPONS.register("tungsten_greatsword",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_GREATSWORD = WEAPONS.register("mithril_greatsword",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> ITANIUM_GREATSWORD = WEAPONS.register("itanium_greatsword",
 //           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_GREATSWORD = WEAPONS.register("adanamtine_greatsword",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_GREATSWORD = WEAPONS.register("shadow_adanamtine_greatsword",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------CLAYMORES----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
//   public static final RegistrySupplier<SwordItem> WOOD_CLAYMORE = WEAPONS.register("wood_claymore",
//       () -> new SwordItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> STONE_CLAYMORE = WEAPONS.register("stone_claymore",
//           () -> new SwordItem(ToolMaterials.STONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> GOLD_CLAYMORE = WEAPONS.register("gold_claymore",
//           () -> new SwordItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> SILVER_CLAYMORE = WEAPONS.register("silver_claymore",
//           () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> COPPER_CLAYMORE = WEAPONS.register("copper_claymore",
//           () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> BRASS_CLAYMORE = WEAPONS.register("brass_claymore",
//           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> BRONZE_CLAYMORE = WEAPONS.register("bronze_claymore",
//           () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> PLATINUM_CLAYMORE = WEAPONS.register("platinum_claymore",
//           () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> GLACIAL_CLAYMORE = WEAPONS.register("glacial_claymore",
//           () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> BONE_CLAYMORE = WEAPONS.register("bone_claymore",
//           () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> IRON_CLAYMORE = WEAPONS.register("iron_claymore",
//           () -> new SwordItem(ToolMaterials.IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> INFERNAL_IRON_CLAYMORE = WEAPONS.register("infernal_iron_claymore",
//           () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> COLD_IRON_CLAYMORE = WEAPONS.register("cold_iron_claymore",
//           () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> STEEL_CLAYMORE = WEAPONS.register("steel_claymore",
//           () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> DIAMOND_CLAYMORE = WEAPONS.register("diamond_claymore",
//           () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> ELVEN_STEEL_CLAYMORE = WEAPONS.register("elven_steel_claymore",
//           () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> DARK_STEEL_CLAYMORE = WEAPONS.register("dark_steel_claymore",
//           () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> NETHERITE_CLAYMORE = WEAPONS.register("netherite_claymore",
//           () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> DRAGON_BONE_CLAYMORE = WEAPONS.register("dragon_bone_claymore",
//           () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> PALLADIUM_CLAYMORE = WEAPONS.register("palladium_claymore",
//           () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> TITANIUM_CLAYMORE = WEAPONS.register("titanium_claymore",
//           () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> TUNGSTEN_CLAYMORE = WEAPONS.register("tungsten_claymore",
//           () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> MITHRIL_CLAYMORE = WEAPONS.register("mithril_claymore",
//           () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> ITANIUM_CLAYMORE = WEAPONS.register("itanium_claymore",
//           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> ADAMANTINE_CLAYMORE = WEAPONS.register("adanamtine_claymore",
//           () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_CLAYMORE = WEAPONS.register("shadow_adanamtine_claymore",
//           () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------GLAIVES-----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_GLAIVED = WEAPONS.register("wood_glaive",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_GLAIVE = WEAPONS.register("stone_glaive",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_GLAIVE = WEAPONS.register("gold_glaive",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_GLAIVE = WEAPONS.register("silver_glaive",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_GLAIVE = WEAPONS.register("copper_glaive",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> BRASS_GLAIVE = WEAPONS.register("brass_glaive",
 //           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_GLAIVE = WEAPONS.register("bronze_glaive",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_GLAIVE = WEAPONS.register("platinum_glaive",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_GLAIVE = WEAPONS.register("glacial_",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_GLAIVE = WEAPONS.register("bone_glaive",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_GLAIVE = WEAPONS.register("iron_glaive",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_GLAIVE = WEAPONS.register("infernal_iron_glaive",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_GLAIVE = WEAPONS.register("cold_iron_glaive",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_GLAIVE = WEAPONS.register("steel_glaive",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_GLAIVE = WEAPONS.register("diamond_glaive",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_GLAIVE = WEAPONS.register("elven_steel_glaive",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_GLAIVE = WEAPONS.register("dark_steel_glaive",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_GLAIVE = WEAPONS.register("netherite_glaive",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_GLAIVE = WEAPONS.register("dragon_bone_glaive",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_GLAIVE = WEAPONS.register("palladium_glaive",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TITANIUM_GLAIVE = WEAPONS.register("titanium_glaive",
            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
  //  public static final RegistrySupplier<SwordItem> TUNGSTEN_GLAIVE = WEAPONS.register("tungsten_glaive",
  //          () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_GLAIVE = WEAPONS.register("mithril_glaive",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> ITANIUM_GLAIVE = WEAPONS.register("itanium_glaive",
 //           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_GLAIVE = WEAPONS.register("adanamtine_glaive",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_GLAIVE = WEAPONS.register("shadow_adanamtine_glaive",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SCIMITARS---------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_SCIMITAR = WEAPONS.register("wood_scimitar",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_SCIMITAR = WEAPONS.register("stone_scimitar",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_SCIMITAR = WEAPONS.register("gold_scimitar",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SCIMITAR = WEAPONS.register("silver_scimitar",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SCIMITAR = WEAPONS.register("copper_scimitar",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> BRASS_SCIMITAR = WEAPONS.register("brass_scimitar",
 //           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SCIMITAR = WEAPONS.register("bronze_scimitar",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SCIMITAR = WEAPONS.register("platinum_scimitar",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_SCIMITAR = WEAPONS.register("glacial_scimitar",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_SCIMITAR = WEAPONS.register("bone_scimitar",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_SCIMITAR = WEAPONS.register("iron_scimitar",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_SCIMITAR = WEAPONS.register("infernal_iron_scimitar",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_SCIMITAR = WEAPONS.register("cold_iron_scimitar",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SCIMITAR = WEAPONS.register("steel_scimitar",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_SCIMITAR = WEAPONS.register("diamond_scimitar",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_SCIMITAR = WEAPONS.register("elven_steel_scimitar",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_SCIMITAR = WEAPONS.register("dark_steel_scimitar",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_SCIMITAR = WEAPONS.register("netherite_scimitar",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_SCIMITAR = WEAPONS.register("dragon_bone_scimitar",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SCIMITAR = WEAPONS.register("palladium_scimitar",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> TITANIUM_SCIMITAR = WEAPONS.register("titanium_scimitar",
 //          () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> TUNGSTEN_SCIMITAR = WEAPONS.register("tungsten_scimitar",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SCIMITAR = WEAPONS.register("mithril_scimitar",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> ITANIUM_SCIMITAR = WEAPONS.register("itanium_scimitar",
 //           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SCIMITAR = WEAPONS.register("adanamtine_scimitar",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_SCIMITAR = WEAPONS.register("shadow_adanamtine_scimitar",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------QUARTERSTAFFS-----------------------------------------------------
---------------------------Ponderosa Pine tree -> planks -> sticks -> strongest stick material--------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_QUARTERSTAFF = WEAPONS.register("wood_quarterstaff",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_QUARTERSTAFF = WEAPONS.register("stone_quarterstaff",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_QUARTERSTAFF = WEAPONS.register("gold_quarterstaff",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_QUARTERSTAFF = WEAPONS.register("silver_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_QUARTERSTAFF = WEAPONS.register("copper_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> BRASS_QUARTERSTAFF = WEAPONS.register("brass_quarterstaff",
 //           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_QUARTERSTAFF = WEAPONS.register("bronze_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_QUARTERSTAFF = WEAPONS.register("platinum_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_QUARTERSTAFF = WEAPONS.register("glacial_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_QUARTERSTAFF = WEAPONS.register("bone_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_QUARTERSTAFF = WEAPONS.register("iron_quarterstaff",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_QUARTERSTAFF = WEAPONS.register("infernal_iron_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_QUARTERSTAFF = WEAPONS.register("cold_iron_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_QUARTERSTAFF = WEAPONS.register("steel_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_QUARTERSTAFF = WEAPONS.register("diamond_quarterstaff",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_QUARTERSTAFF = WEAPONS.register("elven_steel_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_QUARTERSTAFF = WEAPONS.register("dark_steel_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_QUARTERSTAFF = WEAPONS.register("netherite_quarterstaff",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_QUARTERSTAFF = WEAPONS.register("dragon_bone_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_QUARTERSTAFF = WEAPONS.register("palladium_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TITANIUM_QUARTERSTAFF = WEAPONS.register("titanium_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> TUNGSTEN_QUARTERSTAFF = WEAPONS.register("tungsten_quarterstaff",
 //          () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_QUARTERSTAFF = WEAPONS.register("mithril_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> ITANIUM_QUARTERSTAFF = WEAPONS.register("itanium_quarterstaff",
 //           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_QUARTERSTAFF = WEAPONS.register("adanamtine_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_QUARTERSTAFF = WEAPONS.register("shadow_adanamtine_quarterstaff",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------HALBERDS----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
 //  public static final RegistrySupplier<SwordItem> WOOD_HALBERD = WEAPONS.register("wood_halberd",
 //      () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> STONE_HALBERD = WEAPONS.register("stone_halberd",
 //          () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> GOLD_HALBERD = WEAPONS.register("gold_halberd",
 //          () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> SILVER_HALBERD = WEAPONS.register("silver_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> COPPER_HALBERD = WEAPONS.register("copper_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> BRASS_HALBERD = WEAPONS.register("brass_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> BRONZE_HALBERD = WEAPONS.register("bronze_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> PLATINUM_HALBERD = WEAPONS.register("platinum_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> GLACIAL_HALBERD = WEAPONS.register("glacial_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> BONE_HALBERD = WEAPONS.register("bone_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> IRON_HALBERD = WEAPONS.register("iron_halberd",
 //          () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> INFERNAL_IRON_HALBERD = WEAPONS.register("infernal_iron_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> COLD_IRON_HALBERD = WEAPONS.register("cold_iron_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> STEEL_HALBERD = WEAPONS.register("steel_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> DIAMOND_HALBERD = WEAPONS.register("diamond_halberd",
 //          () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> ELVEN_STEEL_HALBERD = WEAPONS.register("elven_steel_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> DARK_STEEL_HALBERD = WEAPONS.register("dark_steel_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> NETHERITE_HALBERD = WEAPONS.register("netherite_halberd",
 //          () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> DRAGON_BONE_HALBERD = WEAPONS.register("dragon_bone_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> PALLADIUM_HALBERD = WEAPONS.register("palladium_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> TITANIUM_HALBERD = WEAPONS.register("titanium_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> TUNGSTEN_HALBERD = WEAPONS.register("tungsten_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> MITHRIL_HALBERD = WEAPONS.register("mithril_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> ITANIUM_HALBERD = WEAPONS.register("itanium_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> ADAMANTINE_HALBERD = WEAPONS.register("adanamtine_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_HALBERD = WEAPONS.register("shadow_adanamtine_halberd",
 //          () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------TRIDENTS----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<TridentItem> WOOD_TRIDENT = WEAPONS.register("wood_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(59).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> STONE_TRIDENT = WEAPONS.register("stone_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> GOLD_TRIDENT = WEAPONS.register("gold_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(32).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> SILVER_TRIDENT = WEAPONS.register("silver_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> COPPER_TRIDENT = WEAPONS.register("copper_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<TridentItem> BRASS_TRIDENT = WEAPONS.register("brass_trident",
 //           () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> BRONZE_TRIDENT = WEAPONS.register("bronze_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> PLATINUM_TRIDENT = WEAPONS.register("platinum_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> GLACIAL_TRIDENT = WEAPONS.register("glacial_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> BONE_TRIDENT = WEAPONS.register("bone_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> IRON_TRIDENT = WEAPONS.register("iron_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(250).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> INFERNAL_IRON_TRIDENT = WEAPONS.register("infernal_iron_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> COLD_IRON_TRIDENT = WEAPONS.register("cold_iron_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> STEEL_TRIDENT = WEAPONS.register("steel_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(400).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> DIAMOND_TRIDENT = WEAPONS.register("diamond_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(1561).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> ELVEN_STEEL_TRIDENT = WEAPONS.register("elven_steel_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> DARK_STEEL_TRIDENT = WEAPONS.register("dark_steel_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> NETHERITE_TRIDENT = WEAPONS.register("netherite_trident",
            () -> new TridentItem((new Item.Settings().fireproof().maxDamage(2341).group(ProjectRPG.CREATIVE_TAB))));
    public static final RegistrySupplier<TridentItem> DRAGON_BONE_TRIDENT = WEAPONS.register("dragon_bone_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(2341).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> PALLADIUM_TRIDENT = WEAPONS.register("palladium_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(2651).group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<TridentItem> TITANIUM_TRIDENT = WEAPONS.register("titanium_trident",
 //           () -> new TridentItem((new Item.Settings()).maxDamage(2961).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> TUNGSTEN_TRIDENT = WEAPONS.register("tungsten_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(3271).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> MITHRIL_TRIDENT = WEAPONS.register("mithril_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(3581).group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<TridentItem> ITANIUM_TRIDENT = WEAPONS.register("itanuim_trident",
 //           () -> new TridentItem((new Item.Settings()).maxDamage(3891).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> ADAMANTINE_TRIDENT = WEAPONS.register("adamantine_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(4101).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> SHADOW_ADAMANTINE_TRIDENT = WEAPONS.register("shadow_adamantine_trident",
            () -> new TridentItem((new Item.Settings()).maxDamage(4101).group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------BATTLEAXES--------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<AxeItem> WOOD_BATTLEAXE = WEAPONS.register("wood_battleaxe",
        () -> new AxeItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> STONE_BATTLEAXE = WEAPONS.register("stone_battleaxe",
            () -> new AxeItem(ToolMaterials.STONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> GOLD_BATTLEAXE = WEAPONS.register("gold_battleaxe",
            () -> new AxeItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> SILVER_BATTLEAXE = WEAPONS.register("silver_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.SILVER, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> COPPER_BATTLEAXE = WEAPONS.register("copper_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.COPPER, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<AxeItem> BRASS_BATTLEAXE = WEAPONS.register("brass_battleaxe",
 //           () -> new AxeItem(ToolMaterialsInit.BRASS, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> BRONZE_BATTLEAXE = WEAPONS.register("bronze_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.BRONZE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> PLATINUM_BATTLEAXE = WEAPONS.register("platinum_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.PLATINUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_BATTLEAXE = WEAPONS.register("glacial_batleaxe",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> BONE_BATTLEAXE = WEAPONS.register("bone_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.BONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> IRON_BATTLEAXE = WEAPONS.register("iron_battleaxe",
            () -> new AxeItem(ToolMaterials.IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> INFERNAL_IRON_BATTLEAXE = WEAPONS.register("infernal_iron_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> COLD_IRON_BATTLEAXE = WEAPONS.register("cold_iron_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.COLD_IRON, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> STEEL_BATTLEAXE = WEAPONS.register("steel_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> DIAMOND_BATTLEAXE = WEAPONS.register("diamond_battleaxe",
            () -> new AxeItem(ToolMaterials.DIAMOND, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> ELVEN_STEEL_BATTLEAXE = WEAPONS.register("elven_steel_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> DARK_STEEL_BATTLEAXE = WEAPONS.register("dark_steel_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.DARK_STEEL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> NETHERITE_BATTLEAXE = WEAPONS.register("netherite_battleaxe",
            () -> new AxeItem(ToolMaterials.NETHERITE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> DRAGON_BONE_BATTLEAXE = WEAPONS.register("dragon_bone_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> PALLADIUM_BATTLEAXE = WEAPONS.register("palladium_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.PALLADIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<AxeItem> TITANIUM_BATTLEAXE = WEAPONS.register("titanium_battleaxe",
 //           () -> new AxeItem(ToolMaterialsInit.TITANIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> TUNGSTEN_BATTLEAXE = WEAPONS.register("tungsten_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.TUNGSTEN, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> MITHRIL_BATTLEAXE = WEAPONS.register("mithril_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.MITHRIL, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<AxeItem> ITANIUM_BATTLEAXE = WEAPONS.register("itanium_battleaxe",
//           () -> new AxeItem(ToolMaterialsInit.ITANIUM, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> ADAMANTINE_BATTLEAXE = WEAPONS.register("adanamtine_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.ADAMANTINE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> SHADOW_ADAMANTINE_BATTLEAXE = WEAPONS.register("shadow_adanamtine_battleaxe",
            () -> new AxeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.2f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------FLAILS------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
//public static final RegistrySupplier<SwordItem> STEEL_FLAIL = WEAPONS.register("steel_flail",
//        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------WARHAMMERS--------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_WARHAMMER = WEAPONS.register("wood_warhammer",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_WARHAMMER = WEAPONS.register("stone_warhammer",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_WARHAMMER = WEAPONS.register("gold_warhammer",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_WARHAMMER = WEAPONS.register("silver_warhammer",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_WARHAMMER = WEAPONS.register("copper_warhammer",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> BRASS_WARHAMMER = WEAPONS.register("brass_warhammer",
 //           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_WARHAMMER = WEAPONS.register("bronze_warhammer",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_WARHAMMER = WEAPONS.register("platinum_warhammer",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_WARHAMMER = WEAPONS.register("glacial_warhammer",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_WARHAMMER = WEAPONS.register("bone_warhammer",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_WARHAMMER = WEAPONS.register("iron_warhammer",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_WARHAMMER = WEAPONS.register("infernal_iron_warhammer",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_WARHAMMER = WEAPONS.register("cold_iron_warhammer",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_WARHAMMER = WEAPONS.register("steel_warhammer",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_WARHAMMER = WEAPONS.register("diamond_warhammer",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_WARHAMMER = WEAPONS.register("elven_steel_warhammer",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_WARHAMMER = WEAPONS.register("dark_steel_warhammer",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_WARHAMMER = WEAPONS.register("netherite_warhammer",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_WARHAMMER = WEAPONS.register("dragon_bone_warhammer",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_WARHAMMER = WEAPONS.register("palladium_warhammer",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> TITANIUM_WARHAMMER = WEAPONS.register("titanium_warhammer",
 //           () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_WARHAMMER = WEAPONS.register("tungsten_warhammer",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_WARHAMMER = WEAPONS.register("mithril_warhammer",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> ITANIUM_WARHAMMER = WEAPONS.register("itanium_warhammer",
 //           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_WARHAMMER = WEAPONS.register("adanamtine_warhammer",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_WARHAMMER = WEAPONS.register("shadow_adanamtine_warhammer",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SICKLES-----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_SICKLE = WEAPONS.register("wood_sickle",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_SICKLE = WEAPONS.register("stone_sickle",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_SICKLE = WEAPONS.register("gold_sickle",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SICKLE = WEAPONS.register("silver_sickle",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SICKLE = WEAPONS.register("copper_sickle",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> BRASS_SICKLE = WEAPONS.register("brass_sickle",
 //          () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SICKLE = WEAPONS.register("bronze_sickle",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SICKLE = WEAPONS.register("platinum_sickle",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_SICKlE = WEAPONS.register("glacial_sickle",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_SICKLE = WEAPONS.register("bone_sickle",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_SICKLE = WEAPONS.register("iron_sickle",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_SICKLE = WEAPONS.register("infernal_iron_sickle",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_SICKLE = WEAPONS.register("cold_iron_sickle",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SICKLE = WEAPONS.register("steel_sickle",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_SICKLE = WEAPONS.register("diamond_sickle",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_SICKLE = WEAPONS.register("elven_steel_sickle",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_SICKLE = WEAPONS.register("dark_steel_sickle",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_SICKLE = WEAPONS.register("netherite_sickle",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_SICKLE = WEAPONS.register("dragon_bone_sickle",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SICKLE = WEAPONS.register("palladium_sickle",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> TITANIUM_SICKLE = WEAPONS.register("titanium_sickle",
 //          () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_SICKLE = WEAPONS.register("tungsten_sickle",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SICKLE = WEAPONS.register("mithril_sickle",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> ITANIUM_SICKLE = WEAPONS.register("itanium_sickle",
//           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SICKLE = WEAPONS.register("adanamtine_sickle",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_SICKLE = WEAPONS.register("shadow_adanamtine_sickle",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SCYTHES-----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_SCYTHE = WEAPONS.register("wood_scythe",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_SCYTHE = WEAPONS.register("stone_scythe",
            () -> new SwordItem(ToolMaterials.STONE, 4, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_SCYTHE = WEAPONS.register("gold_scythe",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SCYTHE = WEAPONS.register("silver_scythe",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 5, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SCYTHE = WEAPONS.register("copper_scythe",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 5, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> BRASS_SCYTHE = WEAPONS.register("brass_scythe",
 //           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -1.1f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SCYTHE = WEAPONS.register("bronze_scythe",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 5, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SCYTHE = WEAPONS.register("platinum_scythe",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 6, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_SCYTHE = WEAPONS.register("glacial_scythe",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 7, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_SCYTHE = WEAPONS.register("bone_scythe",
            () -> new SwordItem(ToolMaterialsInit.BONE, 7, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_SCYTHE = WEAPONS.register("iron_scythe",
            () -> new SwordItem(ToolMaterials.IRON, 5, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_SCYTHE = WEAPONS.register("infernal_iron_scythe",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 7, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_SCYTHE = WEAPONS.register("cold_iron_scythe",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 7, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SCYTHE = WEAPONS.register("steel_scythe",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 8, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_SCYTHE = WEAPONS.register("diamond_scythe",
            () -> new SwordItem(ToolMaterials.DIAMOND, 5, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_SCYTHE = WEAPONS.register("elven_steel_scythe",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 8, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_SCYTHE = WEAPONS.register("dark_steel_scythe",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 8, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_SCYTHE = WEAPONS.register("netherite_scythe",
            () -> new SwordItem(ToolMaterials.NETHERITE, 5, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_SCYTHE = WEAPONS.register("dragon_bone_scythe",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 9, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SCYTHE = WEAPONS.register("palladium_scythe",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 10, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_SCYTHE = WEAPONS.register("tungsten_scythe",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 10, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SCYTHE = WEAPONS.register("mithril_scythe",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 10, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SCYTHE = WEAPONS.register("adanamtine_scythe",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 10, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_SCYTHE = WEAPONS.register("shadow_adanamtine_scythe",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 10, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_DRAGON_BONE_SCYTHE = WEAPONS.register("adanamtine_dragon_bone_scythe",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 11, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_DRAGON_BONE_SCYTHE = WEAPONS.register("shadow_adanamtine_dragon_bone_scythe",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 11, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    /*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------WarScythes------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_WARSCYTHE = WEAPONS.register("wood_warscythe",
            () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_WARSCYTHE = WEAPONS.register("stone_warscythe",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_WARSCYTHE = WEAPONS.register("gold_warscythe",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_WARSCYTHE = WEAPONS.register("silver_warscythe",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_WARSCYTHE = WEAPONS.register("copper_warscythe",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> BRASS_WARSCYTHE = WEAPONS.register("brass_warscythe",
 //           () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -1.1f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_WARSCYTHE = WEAPONS.register("bronze_warscythe",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_WARSCYTHE = WEAPONS.register("platinum_warscythe",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_WARSCYTHE = WEAPONS.register("glacial_warscythe",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_WARSCYTHE = WEAPONS.register("bone_warscythe",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_WARSCYTHE = WEAPONS.register("iron_warscythe",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_WARSCYTHE = WEAPONS.register("infernal_iron_warscythe",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_WARSCYTHE = WEAPONS.register("cold_iron_warscythe",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_WARSCYTHE = WEAPONS.register("steel_warscythe",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_WARSCYTHE = WEAPONS.register("diamond_warscythe",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_WARSCYTHE = WEAPONS.register("elven_steel_swarcythe",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_WARSCYTHE = WEAPONS.register("dark_steel_warscythe",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_WARSCYTHE = WEAPONS.register("netherite_warscythe",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_WARSCYTHE = WEAPONS.register("dragon_bone_warscythe",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_WARSCYTHE = WEAPONS.register("palladium_warscythe",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
  //  public static final RegistrySupplier<SwordItem> TITANIUM_WARSCYTHE = WEAPONS.register("titanium_warscythe",
  //          () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -1.1f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_WARSCYTHE = WEAPONS.register("tungsten_warscythe",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_WARSCYTHE = WEAPONS.register("mithril_warscythe",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //   public static final RegistrySupplier<SwordItem> ITANIUM_WARSCYTHE = WEAPONS.register("itanium_warscythe",
 //           () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -1.1f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_WARSCYTHE = WEAPONS.register("adanamtine_warscythe",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_WARSCYTHE = WEAPONS.register("shadow_adanamtine_warscythe",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SWORDS------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
//    public static final RegistrySupplier<SwordItem> WOOD_SWORD = WEAPONS.register("wood_sword",
//        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> GOLD_SWORD = WEAPONS.register("gold_sword",
//            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> STONE_SWORD = WEAPONS.register("stone_sword",
//            () -> new SwordItem(ToolMaterials.STONE, 5, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SWORD = WEAPONS.register("silver_sword",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SWORD = WEAPONS.register("copper_sword",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SWORD = WEAPONS.register("bronze_sword",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SWORD = WEAPONS.register("platinum_sword",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_SWORD = WEAPONS.register("glacial_sword",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 5, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_SWORD = WEAPONS.register("bone_sword",
            () -> new SwordItem(ToolMaterialsInit.BONE, 5, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> IRON_SWORD = WEAPONS.register("iron_sword",
//            () -> new SwordItem(ToolMaterials.IRON, 6, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_SWORD = WEAPONS.register("infernal_iron_sword",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 5, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_SWORD = WEAPONS.register("cold_iron_sword",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 5, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SWORD = WEAPONS.register("steel_sword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 6, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> DIAMOND_SWORD = WEAPONS.register("diamond_sword",
//            () -> new SwordItem(ToolMaterials.DIAMOND, 7, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_SWORD = WEAPONS.register("elven_steel_sword",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 6, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_SWORD = WEAPONS.register("dark_steel_sword",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 6, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//   public static final RegistrySupplier<SwordItem> NETHERITE_SWORD = WEAPONS.register("netherite_sword",
//           () -> new SwordItem(ToolMaterials.NETHERITE, 8, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_SWORD = WEAPONS.register("dragon_bone_sword",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 7, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SWORD = WEAPONS.register("palladium_sword",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 8, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_SWORD = WEAPONS.register("tungsten_sword",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 9, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SWORD = WEAPONS.register("mithril_sword",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 10, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SWORD = WEAPONS.register("adanamtine_sword",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 11, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_SWORD = WEAPONS.register("shadow_adanamtine_sword",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 11, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_DRAGON_BONE_SWORD = WEAPONS.register("adanamtine_dragon_bone_sword",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 12, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_DRAGON_BONE_SWORD = WEAPONS.register("shadow_adanamtine_dragon_bone_sword",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 12, -2.4f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------MACES-------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_MACE = WEAPONS.register("wood_mace",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_MACE = WEAPONS.register("stone_mace",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_MACE = WEAPONS.register("gold_mace",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_MACE = WEAPONS.register("silver_mace",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_MACE = WEAPONS.register("copper_mace",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_MACE = WEAPONS.register("bronze_mace",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_MACE = WEAPONS.register("platinum_mace",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_MACE = WEAPONS.register("glacial_mace",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_MACE = WEAPONS.register("bone_mace",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_MACE = WEAPONS.register("iron_mace",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_MACE = WEAPONS.register("infernal_iron_mace",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_MACE = WEAPONS.register("cold_iron_mace",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_MACE = WEAPONS.register("steel_mace",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_MACE = WEAPONS.register("diamond_mace",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_MACE = WEAPONS.register("elven_steel_mace",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_MACE = WEAPONS.register("dark_steel_mace",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_MACE = WEAPONS.register("netherite_mace",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_MACE = WEAPONS.register("dragon_bone_mace",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_MACE = WEAPONS.register("palladium_mace",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_MACE = WEAPONS.register("tungsten_mace",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_MACE = WEAPONS.register("mithril_mace",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_MACE = WEAPONS.register("adanamtine_mace",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_MACE = WEAPONS.register("shadow_adanamtine_mace",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------PIKES-------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_PIKE = WEAPONS.register("wood_pike",
            () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_PIKE = WEAPONS.register("stone_pike",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_PIKE = WEAPONS.register("gold_pike",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_PIKE = WEAPONS.register("silver_pike",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_PIKE = WEAPONS.register("copper_pike",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_PIKE = WEAPONS.register("bronze_pike",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_PIKE = WEAPONS.register("platinum_pike",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GLACIAL_PIKE = WEAPONS.register("glacial_pike",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_PIKE = WEAPONS.register("bone_pike",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_PIKE = WEAPONS.register("iron_pike",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_PIKE = WEAPONS.register("infernal_iron_pike",
            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COLD_IRON_PIKE = WEAPONS.register("cold_iron_pike",
            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_PIKE = WEAPONS.register("steel_pike",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_PIKE = WEAPONS.register("diamond_pike",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_PIKE = WEAPONS.register("elven_steel_pike",
            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DARK_STEEL_PIKE = WEAPONS.register("dark_steel_pike",
            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_PIKE = WEAPONS.register("netherite_pike",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_BONE_PIKE = WEAPONS.register("dragon_bone_pike",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_PIKE = WEAPONS.register("palladium_pike",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_PIKE = WEAPONS.register("tungsten_pike",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_PIKE = WEAPONS.register("mithril_pike",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_PIKE = WEAPONS.register("adanamtine_pike",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_PIKE = WEAPONS.register("shadow_adanamtine_pike",
            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------FALCHIONS---------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
   public static final RegistrySupplier<SwordItem> WOOD_FALCHION = WEAPONS.register("wood_falchion",
           () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> STONE_FALCHION = WEAPONS.register("stone_falchion",
           () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> GOLD_FALCHION = WEAPONS.register("gold_falchion",
           () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> SILVER_FALCHION = WEAPONS.register("silver_falchion",
           () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> COPPER_FALCHION = WEAPONS.register("copper_falchion",
           () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> BRASS_FALCHION = WEAPONS.register("brass_falchion",
 //          () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> BRONZE_FALCHION = WEAPONS.register("bronze_falchion",
           () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> PLATINUM_FALCHION = WEAPONS.register("platinum_falchion",
           () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> GLACIAL_FALCHION = WEAPONS.register("glacial_falchion",
           () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> BONE_FALCHION = WEAPONS.register("bone_falchion",
           () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> IRON_FALCHION = WEAPONS.register("iron_falchion",
           () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> INFERNAL_IRON_FALCHION = WEAPONS.register("infernal_iron_falchion",
           () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> COLD_IRON_FALCHION = WEAPONS.register("cold_iron_falchion",
           () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> STEEL_FALCHION = WEAPONS.register("steel_falchion",
           () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> DIAMOND_FALCHION = WEAPONS.register("diamond_falchion",
           () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> ELVEN_STEEL_FALCHION = WEAPONS.register("elven_steel_falchion",
           () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> DARK_STEEL_FALCHION = WEAPONS.register("dark_steel_falchion",
           () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> NETHERITE_FALCHION = WEAPONS.register("netherite_falchion",
           () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> DRAGON_BONE_FALCHION = WEAPONS.register("dragon_bone_falchion",
           () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> PALLADIUM_FALCHION = WEAPONS.register("palladium_falchion",
           () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> TITANIUM_FALCHION = WEAPONS.register("titanium_falchion",
 //          () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> TUNGSTEN_FALCHION = WEAPONS.register("tungsten_falchion",
           () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> MITHRIL_FALCHION = WEAPONS.register("mithril_falchion",
           () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 // public static final RegistrySupplier<SwordItem> ITANIUM_FALCHION = WEAPONS.register("itanium_falchion",
 //         () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> ADAMANTINE_FALCHION = WEAPONS.register("adanamtine_falchion",
           () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_FALCHION = WEAPONS.register("shadow_adanamtine_falchion",
           () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------LONGSPEARS--------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
//    public static final RegistrySupplier<SwordItem> WOOD_LONGSPEAR = WEAPONS.register("wood_longspear",
//            () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> STONE_LONGSPEAR = WEAPONS.register("stone_longspear",
//            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> GOLD_LONGSPEAR = WEAPONS.register("gold_longspear",
//            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> SILVER_LONGSPEAR = WEAPONS.register("silver_longspear",
//            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> COPPER_LONGSPEAR = WEAPONS.register("copper_longspear",
//            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> BRASS_LONGSPEAR = WEAPONS.register("brass_longspear",
//            () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> BRONZE_LONGSPEAR = WEAPONS.register("bronze_longspear",
//            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> PLATINUM_LONGSPEAR = WEAPONS.register("platinum_longspear",
//            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> GLACIAL_LONGSPEAR = WEAPONS.register("glacial_longspear",
//            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> BONE_LONGSPEAR = WEAPONS.register("bone_longspear",
//            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> IRON_LONGSPEAR = WEAPONS.register("iron_longspear",
//            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> INFERNAL_IRON_LONGSPEAR = WEAPONS.register("infernal_iron_longspear",
//            () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> COLD_IRON_LONGSPEAR = WEAPONS.register("cold_iron_longspear",
//            () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> STEEL_LONGSPEAR = WEAPONS.register("steel_longspear",
//            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> DIAMOND_LONGSPEAR = WEAPONS.register("diamond_longspear",
//            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> ELVEN_STEEL_LONGSPEAR = WEAPONS.register("elven_steel_longspear",
//            () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> DARK_STEEL_LONGSPEAR = WEAPONS.register("dark_steel_longspear",
//            () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> NETHERITE_LONGSPEAR = WEAPONS.register("netherite_longspear",
//            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> DRAGON_BONE_LONGSPEAR = WEAPONS.register("dragon_bone_longspear",
//            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> PALLADIUM_LONGSPEAR = WEAPONS.register("palladium_longspear",
//            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> TITANIUM_LONGSPEAR = WEAPONS.register("titanium_longspear",
//            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> TUNGSTEN_LONGSPEAR = WEAPONS.register("tungsten_longspear",
//            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> MITHRIL_LONGSPEAR = WEAPONS.register("mithril_longspear",
//            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> ITANIUM_LONGSPEAR = WEAPONS.register("itanium_longspear",
//            () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> ADAMANTINE_LONGSPEAR = WEAPONS.register("adanamtine_longspear",
//            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_LONGSPEAR = WEAPONS.register("shadow_adanamtine_longspear",
//            () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------BOW---------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
----------------------------------------------------SHORTBOW------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
---------------------------------------------------Ceastus--------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> LEATHER_CEASTUS = WEAPONS.register("leather_ceastus",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_SCALE_CEASTUS = WEAPONS.register("dragon_scale_ceastus",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
---------------------------------------------------Gauntlets-------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
   public static final RegistrySupplier<SwordItem> GOLD_GAUNTLET = WEAPONS.register("gold_gauntlet",
           () -> new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> SILVER_GAUNTLET = WEAPONS.register("silver_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> COPPER_GAUNTLET = WEAPONS.register("copper_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//  public static final RegistrySupplier<SwordItem> BRASS_GAUNTLET = WEAPONS.register("brass_gauntlet",
//          () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> BRONZE_GAUNTLET = WEAPONS.register("bronze_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> PLATINUM_GAUNTLET = WEAPONS.register("platinum_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> IRON_GAUNTLET = WEAPONS.register("iron_gauntlet",
           () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> INFERNAL_IRON_GAUNTLET = WEAPONS.register("infernal_iron_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.INFERNAL_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> COLD_IRON_GAUNTLET = WEAPONS.register("cold_iron_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.COLD_IRON, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> STEEL_GAUNTLET = WEAPONS.register("steel_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> DIAMOND_GAUNTLET = WEAPONS.register("diamond_gauntlet",
           () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> ELVEN_STEEL_GAUNTLET = WEAPONS.register("elven_steel_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.ELVEN_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> DARK_STEEL_GAUNTLET = WEAPONS.register("dark_steel_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.DARK_STEEL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> NETHERITE_GAUNTLET = WEAPONS.register("netherite_gauntlet",
           () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> PALLADIUM_GAUNTLET = WEAPONS.register("palladium_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> TITANIUM_GAUNTLET = WEAPONS.register("titanium_gauntlet",
 //          () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> TUNGSTEN_GAUNTLET = WEAPONS.register("tungsten_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> MITHRIL_GAUNTLET = WEAPONS.register("mithril_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
 //  public static final RegistrySupplier<SwordItem> ITANIUM_GAUNTLET = WEAPONS.register("itanium_gauntlet",
 //          () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> ADAMANTINE_GAUNTLET = WEAPONS.register("adanamtine_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
   public static final RegistrySupplier<SwordItem> SHADOW_ADAMANTINE_GAUNTLET = WEAPONS.register("shadow_adanamtine_gauntlet",
           () -> new SwordItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
---------------------------------------------------CLAWS----------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> GLACIAL_CLAW = WEAPONS.register("glacial_claw",
            () -> new SwordItem(ToolMaterialsInit.GLACIAL, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DRAGON_CLAW = WEAPONS.register("dragon_claw",
            () -> new SwordItem(ToolMaterialsInit.DRAGON_BONE, 4, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

/*----------------------------------------------------------------------------------------------------------------------
---------------------------------------------------Crossbow-------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------Light_Crossbow----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
 //   public static final RegistrySupplier<CrossbowItem> SHADOW_ADAMANTINE_CROSSBOW = WEAPONS.register("shadow_adamantine_crossbow",
 //       ()-> new CrossbowItem(ToolMaterialsInit.SHADOW_ADAMANTINE,));
/*----------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------Heavy_Crossbow------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/




    //shortsword
    //Morningstar
    //Mauls
    //Lance (maybe)
    //Dart
    //war crossbow -very heavy bolt Very long reload, high damage.
    //longbow
    //blowgun
    //warpick   *
    //javelin   *
    //qatar gauntlets
    //xiphos
    //pila
    //falcata
    //boarspear
    //Waraxe
    //khopesh
    //handgonne

/*----------------------------------------------------------------------------------------------------------------------
----------------------------------------------AXES-ARE-FOUND-IN-THE-ToolsInit-------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
--------------------------------------------------LEGENDARY/MISC-WEAPONRY-----------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    //Homebrew content is NOT ALLOWED (Unless owned by YOU), though inspiration can be drawn from it, need to check existing and future weapons below.
    public static final RegistrySupplier<SwordItem> HOLY_AVENGER_GREATSWORD = WEAPONS.register("holy_avenger_greatsword",
            () -> new SwordItem(ToolMaterialsInit.LEGENDARY, 12, -3.2f, new Item.Settings().rarity(Rarity.EPIC).group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> HAZIRAWN_GREATSWORD = WEAPONS.register("hazirawn_greatsword",
            () -> new SwordItem(ToolMaterialsInit.LEGENDARY, 12, -3.2f, new Item.Settings().rarity(Rarity.EPIC).group(ProjectRPG.CREATIVE_TAB)));
    //Ravens Wing- Glaive, google it.
}