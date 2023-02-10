package com.meetmywagon23.projectdnd.init;

import com.meetmywagon23.projectdnd.ProjectDnD;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class WeaponsInit {
    public static final DeferredRegister<Item> WEAPONS = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);
    /*
    mohs hardness order
    wood------------------------vanilla
    stone-----------------------vanilla
    bone - placeholder----------
    lead------------------------
    tin-------------------------
    gold------------------------vanilla
    zinc------------------------
    silver----------------------
    aluminum--------------------
    electrum--------------------
    copper----------------------
    brass-----------------------
    bronze----------------------
    nickel----------------------
    platinum--------------------
    iron------------------------vanilla
    steel-----------------------
    diamond---------------------vanilla
    netherite-------------------vanilla
    palladium-------------------
    titanium--------------------
    tungsten--------------------
    mithril---------------------
    itanium---------------------
    adamantine------------------
     */

 /*---------------------------------------------------------------------------------------------------------------------
 ------------------------------------------------------DAGGERS----------------------------------------------------------
 Daggers Damage needs to be adjusted, and Speed needs to be adjusted. not sure how to change it. will probably just make
 my own Dagger Class, using the Trident as a working ground. for now these will be as is.
 ---------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<TridentItem> WOOD_DAGGER = WEAPONS.register("wood_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(59).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> GOLD_DAGGER = WEAPONS.register("gold_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(32).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> STONE_DAGGER = WEAPONS.register("stone_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> IRON_DAGGER = WEAPONS.register("iron_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(250).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> STEEL_DAGGER = WEAPONS.register("steel_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(400).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> DIAMOND_DAGGER = WEAPONS.register("diamond_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(1561).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> NETHERITE_DAGGER = WEAPONS.register("netherite_dagger",
            () -> new TridentItem((new Item.Settings().fireproof().maxDamage(2031).group(ProjectDnD.CREATIVE_TAB))));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SPEARS------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_SPEAR = WEAPONS.register("wood_spear",
            () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_SPEAR = WEAPONS.register("stone_spear",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_SPEAR = WEAPONS.register("bone_spear",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> LEAD_SPEAR = WEAPONS.register("lead_spear",
            () -> new SwordItem(ToolMaterialsInit.LEAD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TIN_SPEAR = WEAPONS.register("tin_spear",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_SPEAR = WEAPONS.register("gold_spear",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ZINC_SPEAR = WEAPONS.register("zinc_spear",
            () -> new SwordItem(ToolMaterialsInit.ZINC, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SPEAR = WEAPONS.register("silver_spear",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ALUMINUM_SPEAR = WEAPONS.register("aluminum_spear",
            () -> new SwordItem(ToolMaterialsInit.ALUMINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELECTRUM_SPEAR = WEAPONS.register("electrum_spear",
            () -> new SwordItem(ToolMaterialsInit.ELECTRUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SPEAR = WEAPONS.register("copper_spear",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRASS_SPEAR = WEAPONS.register("brass_spear",
            () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SPEAR = WEAPONS.register("bronze_spear",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NICKEL_SPEAR = WEAPONS.register("nickel_spear",
            () -> new SwordItem(ToolMaterialsInit.NICKEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SPEAR = WEAPONS.register("platinum_spear",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_SPEAR = WEAPONS.register("iron_spear",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SPEAR = WEAPONS.register("steel_spear",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_SPEAR = WEAPONS.register("diamond_spear",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_SPEAR = WEAPONS.register("netherite_spear",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SPEAR = WEAPONS.register("palladium_spear",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TITANIUM_SPEAR = WEAPONS.register("titanium_spear",
            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_SPEAR = WEAPONS.register("tungsten_spear",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SPEAR = WEAPONS.register("mithril_spear",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ITANIUM_SPEAR = WEAPONS.register("itanium_spear",
            () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SPEAR = WEAPONS.register("adanamtine_spear",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));

/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------RAPIERS-----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_RAPIER = WEAPONS.register("wood_rapier",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_RAPIER = WEAPONS.register("stone_rapier",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_RAPIER = WEAPONS.register("bone_rapier",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> LEAD_RAPIER = WEAPONS.register("lead_rapier",
            () -> new SwordItem(ToolMaterialsInit.LEAD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TIN_RAPIER = WEAPONS.register("tin_rapier",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_RAPIER = WEAPONS.register("gold_rapier",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ZINC_RAPIER = WEAPONS.register("zinc_rapier",
            () -> new SwordItem(ToolMaterialsInit.ZINC, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_RAPIER = WEAPONS.register("silver_rapier",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ALUMINUM_RAPIER = WEAPONS.register("aluminum_rapier",
            () -> new SwordItem(ToolMaterialsInit.ALUMINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELECTRUM_RAPIER = WEAPONS.register("electrum_rapier",
            () -> new SwordItem(ToolMaterialsInit.ELECTRUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_RAPIER = WEAPONS.register("copper_rapier",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRASS_RAPIER = WEAPONS.register("brass_rapier",
            () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_RAPIER = WEAPONS.register("bronze_rapier",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NICKEL_RAPIER = WEAPONS.register("nickel_rapier",
            () -> new SwordItem(ToolMaterialsInit.NICKEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_RAPIER = WEAPONS.register("platinum_rapier",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_RAPIER = WEAPONS.register("iron_rapier",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_RAPIER = WEAPONS.register("steel_rapier",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_RAPIER = WEAPONS.register("diamond_rapier",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_RAPIER = WEAPONS.register("netherite_rapier",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_RAPIER = WEAPONS.register("palladium_rapier",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TITANIUM_RAPIER = WEAPONS.register("titanium_rapier",
            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_RAPIER = WEAPONS.register("tungsten_rapier",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_RAPIER = WEAPONS.register("mithril_rapier",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ITANIUM_RAPIER = WEAPONS.register("itanium_rapier",
            () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_RAPIER = WEAPONS.register("adanamtine_rapier",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------HAND AXES---------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<AxeItem> WOOD_HANDAXE = WEAPONS.register("wood_handaxe",
        () -> new AxeItem(ToolMaterialsInit.FLESH, 1f, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------LONGSWORDS--------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_LONGSWORD = WEAPONS.register("wood_longsword",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_LONGSWORD = WEAPONS.register("stone_longsword",
            () -> new SwordItem(ToolMaterials.STONE, 5, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_LONGSWORD = WEAPONS.register("gold_longsword",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_LONGSWORD = WEAPONS.register("iron_longsword",
            () -> new SwordItem(ToolMaterials.IRON, 6, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_LONGSWORD = WEAPONS.register("steel_longsword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 7, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_LONGSWORD = WEAPONS.register("diamond_longsword",
            () -> new SwordItem(ToolMaterials.DIAMOND, 7, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_LONGSWORD = WEAPONS.register("netherite_longsword",
            () -> new SwordItem(ToolMaterials.NETHERITE, 8, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------GREATSWORDS-------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> WOOD_GREATSWORD = WEAPONS.register("wood_greatsword",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_GREATSWORD = WEAPONS.register("stone_greatsword",
            () -> new SwordItem(ToolMaterials.STONE, 5, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_GREATSWORD = WEAPONS.register("gold_greatsword",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_GREATSWORD = WEAPONS.register("iron_greatsword",
            () -> new SwordItem(ToolMaterials.IRON, 6, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_GREATSWORD = WEAPONS.register("steel_greatsword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 7, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_GREATSWORD = WEAPONS.register("diamond_greatsword",
            () -> new SwordItem(ToolMaterials.DIAMOND, 7, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_GREATSWORD = WEAPONS.register("netherite_greatsword",
            () -> new SwordItem(ToolMaterials.NETHERITE, 8, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------GLAIVES-----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_GLAIVE = WEAPONS.register("steel_glaive",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SCIMITARS---------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> WOOD_SCIMITAR = WEAPONS.register("wood_scimitar",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_SCIMITAR = WEAPONS.register("stone_scimitar",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_SCIMITAR= WEAPONS.register("bone_scimitar",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> LEAD_SCIMITAR = WEAPONS.register("lead_scimitar",
            () -> new SwordItem(ToolMaterialsInit.LEAD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TIN_SCIMITAR = WEAPONS.register("tin_scimitar",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_SCIMITAR = WEAPONS.register("gold_scimitar",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ZINC_SCIMITAR = WEAPONS.register("zinc_scimitar",
            () -> new SwordItem(ToolMaterialsInit.ZINC, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SCIMITAR = WEAPONS.register("silver_scimitar",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ALUMINUM_SCIMITAR = WEAPONS.register("aluminum_scimitar",
            () -> new SwordItem(ToolMaterialsInit.ALUMINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELECTRUM_SCIMITAR = WEAPONS.register("electrum_scimitar",
            () -> new SwordItem(ToolMaterialsInit.ELECTRUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SCIMITAR = WEAPONS.register("copper_scimitar",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRASS_SCIMITAR = WEAPONS.register("brass_scimitar",
            () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SCIMITAR = WEAPONS.register("bronze_scimitar",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NICKEL_SCIMITAR = WEAPONS.register("nickel_scimitar",
            () -> new SwordItem(ToolMaterialsInit.NICKEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SCIMITAR = WEAPONS.register("platinum_scimitar",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_SCIMITAR = WEAPONS.register("iron_scimitar",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SCIMITAR = WEAPONS.register("steel_scimitar",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_SCIMITAR = WEAPONS.register("diamond_scimitar",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_SCIMITAR = WEAPONS.register("netherite_scimitar",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SCIMITAR = WEAPONS.register("palladium_scimitar",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TITANIUM_SCIMITAR = WEAPONS.register("titanium_scimitar",
            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_SCIMITAR = WEAPONS.register("tungsten_scimitar",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SCIMITAR= WEAPONS.register("mithril_scimitar",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ITANIUM_SCIMITAR = WEAPONS.register("itanium_scimitar",
            () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SCIMITAR = WEAPONS.register("adanamtine_scimitar",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------QUARTERSTAFFS-----------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_QUARTERSTAFF = WEAPONS.register("steel_quarterstaff",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------HALBERDS----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_HALBERD = WEAPONS.register("steel_halberd",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------TRIDENTS----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_TRIDENT = WEAPONS.register("steel_trident",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------BATTLEAXES--------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<AxeItem> BONE_BATTLEAXE = WEAPONS.register("bone_battleaxe",
        () -> new AxeItem(ToolMaterialsInit.BONE, 2f, -2.8f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------FLAILS------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_FLAIL = WEAPONS.register("steel_flail",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------WARHAMMERS--------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_WARHAMMER = WEAPONS.register("steel_warhammer",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SICKLES-----------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> WOOD_SICKLE = WEAPONS.register("wood_sickle",
        () -> new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_SICKLE = WEAPONS.register("stone_sickle",
            () -> new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BONE_SICKLE = WEAPONS.register("bone_sickle",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> LEAD_SICKLE = WEAPONS.register("lead_sickle",
            () -> new SwordItem(ToolMaterialsInit.LEAD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TIN_SICKLE = WEAPONS.register("tin_sickle",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_SICKLE = WEAPONS.register("gold_sickle",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ZINC_SICKLE = WEAPONS.register("zinc_sickle",
            () -> new SwordItem(ToolMaterialsInit.ZINC, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SICKLE = WEAPONS.register("silver_sickle",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ALUMINUM_SICKLE = WEAPONS.register("aluminum_sickle",
            () -> new SwordItem(ToolMaterialsInit.ALUMINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELECTRUM_SICKLE = WEAPONS.register("electrum_sickle",
            () -> new SwordItem(ToolMaterialsInit.ELECTRUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SICKLE = WEAPONS.register("copper_sickle",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRASS_SICKLE = WEAPONS.register("brass_sickle",
            () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SICKLE = WEAPONS.register("bronze_sickle",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NICKEL_SICKLE = WEAPONS.register("nickel_sickle",
            () -> new SwordItem(ToolMaterialsInit.NICKEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SICKLE = WEAPONS.register("platinum_sickle",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_SICKLE = WEAPONS.register("iron_sickle",
            () -> new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SICKLE = WEAPONS.register("steel_sickle",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_SICKLE = WEAPONS.register("diamond_sickle",
            () -> new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_SICKLE = WEAPONS.register("netherite_sickle",
            () -> new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SICKLE = WEAPONS.register("palladium_sickle",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TITANIUM_SICKLE = WEAPONS.register("titanium_sickle",
            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_SICKLE = WEAPONS.register("tungsten_sickle",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SICKLE = WEAPONS.register("mithril_sickle",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ITANIUM_SICKLE = WEAPONS.register("itanium_sickle",
            () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SICKLE = WEAPONS.register("adanamtine_sickle",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SWORDS------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> BONE_SWORD = WEAPONS.register("bone_sword",
            () -> new SwordItem(ToolMaterialsInit.BONE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> LEAD_SWORD  = WEAPONS.register("lead_sword",
            () -> new SwordItem(ToolMaterialsInit.LEAD, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TIN_SWORD  = WEAPONS.register("tin_sword",
            () -> new SwordItem(ToolMaterialsInit.TIN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ZINC_SWORD  = WEAPONS.register("zinc_sword",
            () -> new SwordItem(ToolMaterialsInit.ZINC, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> SILVER_SWORD  = WEAPONS.register("silver_sword",
            () -> new SwordItem(ToolMaterialsInit.SILVER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ALUMINUM_SWORD  = WEAPONS.register("aluminum_sword",
            () -> new SwordItem(ToolMaterialsInit.ALUMINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ELECTRUM_SWORD  = WEAPONS.register("electrum_sword",
            () -> new SwordItem(ToolMaterialsInit.ELECTRUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> COPPER_SWORD  = WEAPONS.register("copper_sword",
            () -> new SwordItem(ToolMaterialsInit.COPPER, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRASS_SWORD  = WEAPONS.register("brass_sword",
            () -> new SwordItem(ToolMaterialsInit.BRASS, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> BRONZE_SWORD  = WEAPONS.register("bronze_sword",
            () -> new SwordItem(ToolMaterialsInit.BRONZE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NICKEL_SWORD  = WEAPONS.register("nickel_sword",
            () -> new SwordItem(ToolMaterialsInit.NICKEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PLATINUM_SWORD  = WEAPONS.register("platinum_sword",
            () -> new SwordItem(ToolMaterialsInit.PLATINUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_SWORD  = WEAPONS.register("steel_sword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> PALLADIUM_SWORD  = WEAPONS.register("palladium_sword",
            () -> new SwordItem(ToolMaterialsInit.PALLADIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TITANIUM_SWORD  = WEAPONS.register("titanium_sword",
            () -> new SwordItem(ToolMaterialsInit.TITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> TUNGSTEN_SWORD  = WEAPONS.register("tungsten_sword",
            () -> new SwordItem(ToolMaterialsInit.TUNGSTEN, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> MITHRIL_SWORD = WEAPONS.register("mithril_sword",
            () -> new SwordItem(ToolMaterialsInit.MITHRIL, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ITANIUM_SWORD  = WEAPONS.register("itanium_sword",
            () -> new SwordItem(ToolMaterialsInit.ITANIUM, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> ADAMANTINE_SWORD  = WEAPONS.register("adanamtine_sword",
            () -> new SwordItem(ToolMaterialsInit.ADAMANTINE, 4, -3.0f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------MACES-------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_MACE = WEAPONS.register("steel_mace",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------MAULS-------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_MAUL = WEAPONS.register("steel_maul",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------MORNINGSTARS-----------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_MORNINGSTAR = WEAPONS.register("steel_morningstar",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------SHORTSWORDS-------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_SHORTSWORD = WEAPONS.register("steel_shortsword",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------PIKES-------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_PIKE = WEAPONS.register("steel_pike",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------FALCHIONS---------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_FALCHION = WEAPONS.register("steel_falchion",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------LONGSPEARS--------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
public static final RegistrySupplier<SwordItem> STEEL_LONGSPEAR = WEAPONS.register("steel_longspear",
        () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
/*----------------------------------------------------------------------------------------------------------------------
----------------------------------------------AXES-ARE-FOUND-IN-THE-ToolsInit-------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------------------------
------------------------------------------------------LEGENDARY-WEAPONRY------------------------------------------------
----------------------------------------------------------------------------------------------------------------------*/
    public static final RegistrySupplier<SwordItem> HOLY_AVENGER_GREATSWORD = WEAPONS.register("holy_avenger_greatsword",
            () -> new SwordItem(ToolMaterialsInit.LEGENDARY_CORE, 12, -3.2f, new Item.Settings().rarity(Rarity.EPIC).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> HAZIRAWN_GREATSWORD = WEAPONS.register("hazirawn_greatsword",
            () -> new SwordItem(ToolMaterialsInit.LEGENDARY_CORE, 12, -3.2f, new Item.Settings().rarity(Rarity.EPIC).group(ProjectDnD.CREATIVE_TAB)));
    public static void init() {
        WEAPONS.register();
    }
}
