package com.meetmywagon23.projectdnd.core.init;

import com.ibm.icu.impl.locale.XCldrStub.ImmutableMultimap;
import com.meetmywagon23.projectdnd.ProjectDnD;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	private ItemInit() {}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectDnD.MODID);
	
	
//REMINDER FOR WAGON------organize the .json files into folders & Textures into folders.

	//Coins (currency)
	public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> PLATINUM_COIN = ITEMS.register("platinum_coin",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> FIVE_COPPER_COINS = ITEMS.register("five_copper_coins",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> FIVE_SILVER_COINS = ITEMS.register("five_silver_coins",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> FIVE_GOLD_COINS = ITEMS.register("five_gold_coins",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> FIVE_PLATINUM_COINS = ITEMS.register("five_platinum_coins",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> TEN_COPPER_COINS = ITEMS.register("ten_copper_coins",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> TEN_SILVER_COINS = ITEMS.register("ten_silver_coins",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> TEN_GOLD_COINS = ITEMS.register("ten_gold_coins",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
	public static final RegistryObject<Item> TEN_PLATINUM_COINS = ITEMS.register("ten_platinum_coins",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(50)));
//Coin Pouches
	

//Sheaths
	public static final RegistryObject<Item> LEATHER_SHEATH = ITEMS.register("leather_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> WHITE_SHEATH = ITEMS.register("white_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> GRAY_SHEATH = ITEMS.register("gray_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> DARK_GRAY_SHEATH = ITEMS.register("dark_gray_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> BLACK_SHEATH = ITEMS.register("black_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> BROWN_SHEATH = ITEMS.register("brown_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> RED_SHEATH = ITEMS.register("red_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> ORANGE_SHEATH = ITEMS.register("orange_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> YELLOW_SHEATH = ITEMS.register("yellow_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> LIME_GREEN_SHEATH = ITEMS.register("lime_green_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> GREEN_SHEATH = ITEMS.register("green_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> CYAN_SHEATH = ITEMS.register("cyan_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> LIGHT_BLUE_SHEATH = ITEMS.register("light_blue_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> BLUE_SHEATH = ITEMS.register("blue_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> PURPLE_SHEATH = ITEMS.register("purple_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> MAGENTA_SHEATH = ITEMS.register("magenta_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> PINK_SHEATH = ITEMS.register("pink_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> CHAIN_SHEATH = ITEMS.register("chain_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> GOLD_SHEATH = ITEMS.register("gold_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> IRON_SHEATH = ITEMS.register("iron_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> STEEL_SHEATH = ITEMS.register("steel_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> DIAMOND_SHEATH = ITEMS.register("diamond_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> NETHERITE_SHEATH = ITEMS.register("netherite_sheath",
			() -> new Item(new Item.Properties().fireResistant().tab(ProjectDnD.DnD).stacksTo(1)));
//ARMOR Steel-> Silver-> Adamantine-> Itanium.

//Dagger Sheaths Please use leather_dagger_sheath.png as a working ground for the colored wool textures.
	public static final RegistryObject<Item> LEATHER_DAGGER_SHEATH = ITEMS.register("leather_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> WHITE_DAGGER_SHEATH = ITEMS.register("white_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> GRAY_DAGGER_SHEATH = ITEMS.register("gray_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> DARK_DAGGER_GRAY_SHEATH = ITEMS.register("dark_gray_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> BLACK_DAGGER_SHEATH = ITEMS.register("black_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> BROWN_DAGGER_SHEATH = ITEMS.register("brown_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> RED_DAGGER_SHEATH = ITEMS.register("red_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> ORANGE_DAGGER_SHEATH = ITEMS.register("orange_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> YELLOW_DAGGER_SHEATH = ITEMS.register("yellow_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> LIME_GREEN_DAGGER_SHEATH = ITEMS.register("lime_green_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> GREEN_DAGGER_SHEATH = ITEMS.register("green_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> CYAN_DAGGER_SHEATH = ITEMS.register("cyan_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> LIGHT_BLUE_DAGGER_SHEATH = ITEMS.register("light_blue_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> BLUE_DAGGER_SHEATH = ITEMS.register("blue_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> PURPLE_DAGGER_SHEATH = ITEMS.register("purple_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> MAGENTA_DAGGER_SHEATH = ITEMS.register("magenta_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> PINK_DAGGER_SHEATH = ITEMS.register("pink_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> CHAIN_DAGGER_SHEATH = ITEMS.register("chain_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> GOLD_DAGGER_SHEATH = ITEMS.register("gold_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> IRON_DAGGER_SHEATH = ITEMS.register("iron_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> STEEL_DAGGER_SHEATH = ITEMS.register("steel_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> DIAMOND_DAGGER_SHEATH = ITEMS.register("diamond_dagger_sheath",
			() -> new Item(new Item.Properties().tab(ProjectDnD.DnD).stacksTo(1)));
	public static final RegistryObject<Item> NETHERITE_DAGGER_SHEATH = ITEMS.register("netherite_dagger_sheath",
			() -> new Item(new Item.Properties().fireResistant().tab(ProjectDnD.DnD).stacksTo(1)));
	
	//Gemstones A-Z
	//                 A
	public static final RegistryObject<Item> AGNI_MANI = ITEMS.register("agni_mani",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ALAMANDINE = ITEMS.register("alamandine",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ALESTONE = ITEMS.register("alestone",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ALGAE = ITEMS.register("algae",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> AMARANTHA = ITEMS.register("amarantha",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ANDAR = ITEMS.register("andar",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ARADITE = ITEMS.register("aradite",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> AUGELITE = ITEMS.register("augelite",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> AVENTURINE = ITEMS.register("aventurine",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	//                 B
	public static final RegistryObject<Item> BANDED_AGATE = ITEMS.register("banded_agate",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BELJURIL = ITEMS.register("beljuril",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BERYL = ITEMS.register("beryl",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BLACK_PEARL = ITEMS.register("black_pearl",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BLACK_SAPPHIRE = ITEMS.register("black_sapphire",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BLOODSTONE = ITEMS.register("bloodstone",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BLUE_QUARTZ = ITEMS.register("blue_quartz",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BLUE_SAPPHIRE = ITEMS.register("blue_sapphire",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BLUE_SPINEL = ITEMS.register("blue_spinel",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BLUESTONE = ITEMS.register("bluestone",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BOAKHAR = ITEMS.register("boakhar",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> BRANDEEN = ITEMS.register("brandeen",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	//                 C
	
	//Gemstone / Jewel Dusts. please refer to the wiki for the list of dusts to include.
	//Raw ores, Ingots, Nuggets
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ADAMANT_INGOT = ITEMS.register("adamant_ingot",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ADAMANT_NUGGET = ITEMS.register("adamant_nugget",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ADAMANTINE_NUGGET = ITEMS.register("adamantine_nugget",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ITANIUM_INGOT = ITEMS.register("itanium_ingot",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> ITANIUM_NUGGET = ITEMS.register("itanium_nugget",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> MYTHRIL_INGOT = ITEMS.register("mythril_ingot",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<Item> MYTHRIL_NUGGET = ITEMS.register("mythril_nugget",
			()-> new Item(new Item.Properties().tab(ProjectDnD.DnD)));
	//Misc Daggers Damage needs to be adjusted, and Speed needs to be adjusted. not sure how to change it. i think a few tool materials will need to be used.
	public static final RegistryObject<TridentItem> WOOD_DAGGER = ITEMS.register("wood_dagger",
			() -> new TridentItem((new Item.Properties()).durability(59).tab(ProjectDnD.DnD)));
	public static final RegistryObject<TridentItem> GOLD_DAGGER = ITEMS.register("gold_dagger",
			() -> new TridentItem((new Item.Properties()).durability(32).tab(ProjectDnD.DnD)));
	public static final RegistryObject<TridentItem> STONE_DAGGER = ITEMS.register("stone_dagger",
			() -> new TridentItem((new Item.Properties()).durability(131).tab(ProjectDnD.DnD)));
	public static final RegistryObject<TridentItem> IRON_DAGGER = ITEMS.register("iron_dagger",
			() -> new TridentItem((new Item.Properties()).durability(250).tab(ProjectDnD.DnD)));
	public static final RegistryObject<TridentItem> STEEL_DAGGER = ITEMS.register("steel_dagger",
			() -> new TridentItem((new Item.Properties()).durability(400).tab(ProjectDnD.DnD)));
	public static final RegistryObject<TridentItem> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
			() -> new TridentItem((new Item.Properties()).durability(1561).tab(ProjectDnD.DnD)));
	public static final RegistryObject<TridentItem> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
			() -> new TridentItem((new Item.Properties().fireResistant()).durability(2031).tab(ProjectDnD.DnD)));
	//longswords ToolMaterials will be changed to their proper materials Might adjust the texutre of these and change these to longswords, i would like longswords to ACTUALLY BE GREAT SWORDS, these are too puny to be great.
	public static final RegistryObject<SwordItem> WOOD_LONGSWORD = ITEMS.register("wood_longsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 4, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> STONE_LONGSWORD = ITEMS.register("stone_longsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 5, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> GOLD_LONGSWORD = ITEMS.register("gold_longsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 4, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> IRON_LONGSWORD = ITEMS.register("iron_longsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 6, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> STEEL_LONGSWORD = ITEMS.register("steel_longsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 7, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> DIAMOND_LONGSWORD = ITEMS.register("diamond_longsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 7, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> NETHERITE_LONGSWORD = ITEMS.register("netherite_longsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 8, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	//GREATSWORDS
	public static final RegistryObject<SwordItem> WOOD_GREATSWORD = ITEMS.register("wood_greatsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 4, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> STONE_GREATSWORD = ITEMS.register("stone_greatsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 5, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> GOLD_GREATSWORD = ITEMS.register("gold_greatsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 4, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> IRON_GREATSWORD = ITEMS.register("iron_greatsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 6, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> STEEL_GREATSWORD = ITEMS.register("steel_greatsword",
					() -> new SwordItem(ToolMaterialInit.STEEL, 7, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 7, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	public static final RegistryObject<SwordItem> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 8, -3.2f, new Item.Properties().tab(ProjectDnD.DnD)));
	//ALL STEEL STUFF-----------------TO BE MOVED TO PROPER CATAGORIES ORGANIZED----------------------------------------These are only temporarily here
	public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 4, -2.4f, new Item.Properties().tab(ProjectDnD.DnD)));

	
	
	
}
