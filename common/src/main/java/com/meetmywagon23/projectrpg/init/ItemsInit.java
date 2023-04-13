package com.meetmywagon23.projectrpg.init;

import com.meetmywagon23.projectrpg.ProjectRPG;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ProjectRPG.MOD_ID, Registry.ITEM_KEY);

    /*

    Coins (currency) in the future i would like to reach out to the team who made the stackable and puchable coins to improve our system. for now this will have to suffice.

    */
    public static final RegistrySupplier<Item> COPPER_COIN = ITEMS.register("copper_coin",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> SILVER_COIN = ITEMS.register("silver_coin",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> GOLD_COIN = ITEMS.register("gold_coin",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> PLATINUM_COIN = ITEMS.register("platinum_coin",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> FIVE_COPPER_COINS = ITEMS.register("five_copper_coins",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> FIVE_SILVER_COINS = ITEMS.register("five_silver_coins",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> FIVE_GOLD_COINS = ITEMS.register("five_gold_coins",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> FIVE_PLATINUM_COINS = ITEMS.register("five_platinum_coins",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> TEN_COPPER_COINS = ITEMS.register("ten_copper_coins",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> TEN_SILVER_COINS = ITEMS.register("ten_silver_coins",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> TEN_GOLD_COINS = ITEMS.register("ten_gold_coins",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
    public static final RegistrySupplier<Item> TEN_PLATINUM_COINS = ITEMS.register("ten_platinum_coins",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(50)));
/*
LEGENDARY REPAIRING
 */
public static final RegistrySupplier<Item> LEGENDARY_CORE = ITEMS.register("legendary_core",
        () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1).rarity(Rarity.EPIC)));
    /*--------------------------

        Coin Pouches registry

    ----------------------------
    ----------------------------

        Sheath Registry

    --------------------------*/
    public static final RegistrySupplier<Item> LEATHER_SHEATH = ITEMS.register("leather_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> WHITE_SHEATH = ITEMS.register("white_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GRAY_SHEATH = ITEMS.register("gray_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DARK_GRAY_SHEATH = ITEMS.register("dark_gray_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BLACK_SHEATH = ITEMS.register("black_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BROWN_SHEATH = ITEMS.register("brown_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> RED_SHEATH = ITEMS.register("red_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> ORANGE_SHEATH = ITEMS.register("orange_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> YELLOW_SHEATH = ITEMS.register("yellow_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> LIME_GREEN_SHEATH = ITEMS.register("lime_green_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GREEN_SHEATH = ITEMS.register("green_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> CYAN_SHEATH = ITEMS.register("cyan_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> LIGHT_BLUE_SHEATH = ITEMS.register("light_blue_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BLUE_SHEATH = ITEMS.register("blue_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PURPLE_SHEATH = ITEMS.register("purple_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> MAGENTA_SHEATH = ITEMS.register("magenta_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PINK_SHEATH = ITEMS.register("pink_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> CHAIN_SHEATH = ITEMS.register("chain_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GOLD_SHEATH = ITEMS.register("gold_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> SILVER_SHEATH = ITEMS.register("silver_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> COPPER_SHEATH = ITEMS.register("copper_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BRASS_SHEATH = ITEMS.register("brass_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BRONZE_SHEATH = ITEMS.register("bronze_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PLATINUM_SHEATH = ITEMS.register("platinum_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BONE_SHEATH = ITEMS.register("bone_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> IRON_SHEATH = ITEMS.register("iron_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> INFERNAL_IRON_SHEATH = ITEMS.register("infernal_iron_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> COLD_IRON_SHEATH = ITEMS.register("cold_iron_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> STEEL_SHEATH = ITEMS.register("steel_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DIAMOND_SHEATH = ITEMS.register("diamond_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> ELVEN_STEEL_SHEATH = ITEMS.register("elven_steel_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DARK_STEEL_SHEATH = ITEMS.register("dark_steel_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> NETHERITE_SHEATH = ITEMS.register("netherite_sheath",
            () -> new Item(new Item.Settings().fireproof().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DRAGON_SCALE_SHEATH = ITEMS.register("dragon_scale_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PALLADIUM_SHEATH = ITEMS.register("palladium_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> TITANIUM_SHEATH = ITEMS.register("titanium_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> TUNGSTEN_SHEATH = ITEMS.register("tungsten_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> MITHRIL_SHEATH = ITEMS.register("mithril_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> ADAMANTINE_SHEATH = ITEMS.register("adamantine_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));

    //Dagger Sheaths Please use leather_dagger_sheath.png as a working ground for the colored wool textures.
    public static final RegistrySupplier<Item> LEATHER_DAGGER_SHEATH = ITEMS.register("leather_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> WHITE_DAGGER_SHEATH = ITEMS.register("white_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GRAY_DAGGER_SHEATH = ITEMS.register("gray_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DARK_DAGGER_GRAY_SHEATH = ITEMS.register("dark_gray_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BLACK_DAGGER_SHEATH = ITEMS.register("black_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BROWN_DAGGER_SHEATH = ITEMS.register("brown_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> RED_DAGGER_SHEATH = ITEMS.register("red_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> ORANGE_DAGGER_SHEATH = ITEMS.register("orange_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> YELLOW_DAGGER_SHEATH = ITEMS.register("yellow_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> LIME_GREEN_DAGGER_SHEATH = ITEMS.register("lime_green_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GREEN_DAGGER_SHEATH = ITEMS.register("green_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> CYAN_DAGGER_SHEATH = ITEMS.register("cyan_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> LIGHT_BLUE_DAGGER_SHEATH = ITEMS.register("light_blue_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BLUE_DAGGER_SHEATH = ITEMS.register("blue_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PURPLE_DAGGER_SHEATH = ITEMS.register("purple_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> MAGENTA_DAGGER_SHEATH = ITEMS.register("magenta_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PINK_DAGGER_SHEATH = ITEMS.register("pink_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> CHAIN_DAGGER_SHEATH = ITEMS.register("chain_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> GOLD_DAGGER_SHEATH = ITEMS.register("gold_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> SILVER_DAGGER_SHEATH = ITEMS.register("silver_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> COPPER_DAGGER_SHEATH = ITEMS.register("copper_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BRASS_DAGGER_SHEATH = ITEMS.register("brass_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BRONZE_DAGGER_SHEATH = ITEMS.register("bronze_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PLATINUM_DAGGER_SHEATH = ITEMS.register("platinum_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> BONE_DAGGER_SHEATH = ITEMS.register("bone_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> IRON_DAGGER_SHEATH = ITEMS.register("iron_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> INFERNAL_IRON_DAGGER_SHEATH = ITEMS.register("infernal_iron_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> COLD_IRON_DAGGER_SHEATH = ITEMS.register("cold_iron_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> STEEL_DAGGER_SHEATH = ITEMS.register("steel_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DIAMOND_DAGGER_SHEATH = ITEMS.register("diamond_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> ELVEN_STEEL_DAGGER_SHEATH = ITEMS.register("elven_steel_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DARK_STEEL_DAGGER_SHEATH = ITEMS.register("dark_steel_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> NETHERITE_DAGGER_SHEATH = ITEMS.register("netherite_dagger_sheath",
            () -> new Item(new Item.Settings().fireproof().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> DRAGON_SCALE_DAGGER_SHEATH = ITEMS.register("dragon_scale_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> PALLADIUM_DAGGER_SHEATH = ITEMS.register("palladium_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> TITANIUM_DAGGER_SHEATH = ITEMS.register("titanium_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> TUNGSTEN_DAGGER_SHEATH = ITEMS.register("tungsten_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> MITHRIL_DAGGER_SHEATH = ITEMS.register("mithril_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    public static final RegistrySupplier<Item> ADAMANTINE_DAGGER_SHEATH = ITEMS.register("adamantine_dagger_sheath",
            () -> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).maxCount(1)));
    //Gemstones A-Z
    // A
    public static final RegistrySupplier<Item> AGNI_MANI = ITEMS.register("agni_mani",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALAMANDINE = ITEMS.register("alamandine",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALESTONE = ITEMS.register("alestone",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALGAE = ITEMS.register("algae",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMARANTHA = ITEMS.register("amarantha",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AMBER = ITEMS.register("amber",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ANDAR = ITEMS.register("andar",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AQUAMARINE = ITEMS.register("aquamarine",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ARADITE = ITEMS.register("aradite",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AUGELITE = ITEMS.register("augelite",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AVENTURINE = ITEMS.register("aventurine",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> AZURITE = ITEMS.register("azurite",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    // B
    public static final RegistrySupplier<Item> BANDED_AGATE = ITEMS.register("banded_agate",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BELJURIL = ITEMS.register("beljuril",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BERYL = ITEMS.register("beryl",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLACK_OPAL = ITEMS.register("black_opal",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLACK_PEARL = ITEMS.register("black_pearl",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLACK_SAPPHIRE = ITEMS.register("black_sapphire",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLOODSTONE = ITEMS.register("bloodstone",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLUE_QUARTZ = ITEMS.register("blue_quartz",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLUE_SAPPHIRE = ITEMS.register("blue_sapphire",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLUE_SPINEL = ITEMS.register("blue_spinel",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BLUESTONE = ITEMS.register("bluestone",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BOAKHAR = ITEMS.register("boakhar",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRANDEEN = ITEMS.register("brandeen",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    /* C

    Gemstone / Jewel Dusts. please refer to the wiki for the list of dusts to include.
    Ores are organized using the MOHS Hardness Scale, I wanted to keep things realistic as much as possible.

    Raw ores, Ingots, Nuggets

     */
    public static final RegistrySupplier<Item> RAW_LEAD = ITEMS.register("raw_lead",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_TIN = ITEMS.register("raw_tin",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    //Gold
    public static final RegistrySupplier<Item> RAW_SILVER = ITEMS.register("raw_silver",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_ELECTRUM = ITEMS.register("raw_electrum",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    //Copper
    public static final RegistrySupplier<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_BRASS = ITEMS.register("raw_brass",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_BRONZE = ITEMS.register("raw_bronze",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    //Iron
    public static final RegistrySupplier<Item> RAW_INFERNAL_IRON = ITEMS.register("raw_infernal_iron",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> RAW_INFERNAL_SLIVER = ITEMS.register("raw_infernal_sliver",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> INFERNAL_IRON_INGOT = ITEMS.register("infernal_iron_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> INFERNAL_IRON_NUGGET = ITEMS.register("infernal_iron_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> RAW_COLD_IRON = ITEMS.register("raw_cold_iron",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> COLD_IRON_INGOT = ITEMS.register("cold_iron_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> COLD_IRON_NUGGET = ITEMS.register("cold_iron_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> RAW_STEEL = ITEMS.register("raw_steel",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_ELVEN_STEEL = ITEMS.register("raw_elven_steel",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> ELVEN_STEEL_INGOT = ITEMS.register("elven_steel_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON))); //elven steel is half the weight of steel
    public static final RegistrySupplier<Item> ELVEN_STEEL_NUGGET = ITEMS.register("elven_steel_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> RAW_DARK_STEEL = ITEMS.register("raw_dark_steel",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> DARK_STEEL_INGOT = ITEMS.register("dark_steel_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON))); //elven steel is half the weight of steel
    public static final RegistrySupplier<Item> DARK_STEEL_NUGGET = ITEMS.register("dark_steel_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    //Diamond
    //Netherite
    public static final RegistrySupplier<Item> DRAGON_SCALE = ITEMS.register("dragon_scale",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> DRAGON_BONE = ITEMS.register("dragon_bone",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    //adamant is used only to craft Adamantine. there is lore relation to this reasoning in the D&D world.
    public static final RegistrySupplier<Item> RAW_ADAMANT_FRAGMENT = ITEMS.register("adamant_fragment",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    //Itanium needs to go, will be removed later.
    public static final RegistrySupplier<Item> RAW_ITANIUM = ITEMS.register("raw_itanium",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ITANIUM_INGOT = ITEMS.register("itanium_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ITANIUM_NUGGET = ITEMS.register("itanium_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> RAW_ADAMANTINE = ITEMS.register("raw_adamantine",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> ADAMANTINE_NUGGET = ITEMS.register("adamantine_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> RAW_SHADOW_ADAMANTINE = ITEMS.register("raw_shadow_adamantine",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> SHADOW_ADAMANTINE_INGOT = ITEMS.register("shadow_adamantine_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> SHADOW_ADAMANTINE_NUGGET = ITEMS.register("shadow_adamantine_nugget",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> RAW_STARFALL_ORE = ITEMS.register("raw_starfall_ore",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> STARFALL_INGOT = ITEMS.register("starfall_ingot",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB).rarity(Rarity.EPIC)));
    //Ore Dusts
    public static final RegistrySupplier<Item> COAL_DUST = ITEMS.register("coal_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> LEAD_DUST = ITEMS.register("lead_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TIN_DUST = ITEMS.register("tin_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> GOLD_DUST = ITEMS.register("gold_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> SILVER_DUST = ITEMS.register("silver_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COPPER_DUST = ITEMS.register("copper_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRASS_DUST = ITEMS.register("brass_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> BRONZE_DUST = ITEMS.register("bronze_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> IRON_DUST = ITEMS.register("iron_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> INFERNAL_IRON_DUST = ITEMS.register("infernal_iron_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> COLD_IRON_DUST = ITEMS.register("cold_iron_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> STEEL_DUST = ITEMS.register("steel_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ELVEN_STEEL_DUST = ITEMS.register("elven_steel_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> DARK_STEEL_DUST = ITEMS.register("dark_steel_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> NETHERITE_DUST = ITEMS.register("netherite_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> PALLADIUM_DUST = ITEMS.register("palladium_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TITANIUM_DUST = ITEMS.register("titanium_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> MITHRIL_DUST = ITEMS.register("mithril_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ADAMANT_DUST = ITEMS.register("adamant_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ADAMANTINE_DUST = ITEMS.register("adamantine_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> ARANDUR_DUST = ITEMS.register("arandur_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<Item> STARFALL_DUST = ITEMS.register("stallfall_dust",
            ()-> new Item(new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

}