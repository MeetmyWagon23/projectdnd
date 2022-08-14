package com.meetmywagon23.projectdnd.core.init;

import com.meetmywagon23.projectdnd.ProjectDnD;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	private ItemInit() {}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectDnD.MODID);
	
	//Coins (currency)
	public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> PLATINUM_COIN = ITEMS.register("platinum_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> FIVE_COPPER_COINS = ITEMS.register("five_copper_coins",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> FIVE_SILVER_COINS = ITEMS.register("five_silver_coins",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> FIVE_GOLD_COINS = ITEMS.register("five_gold_coins",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> FIVE_PLATINUM_COINS = ITEMS.register("five_platinum_coins",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> TEN_COPPER_COINS = ITEMS.register("ten_copper_coins",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> TEN_SILVER_COINS = ITEMS.register("ten_silver_coins",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> TEN_GOLD_COINS = ITEMS.register("ten_gold_coins",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> TEN_PLATINUM_COINS = ITEMS.register("ten_platinum_coins",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));

//Sheaths
	public static final RegistryObject<Item> LEATHER_SHEATH = ITEMS.register("leather_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> WHITE_SHEATH = ITEMS.register("white_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> GRAY_SHEATH = ITEMS.register("gray_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> DARK_GRAY_SHEATH = ITEMS.register("dark_gray_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> BLACK_SHEATH = ITEMS.register("black_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> BROWN_SHEATH = ITEMS.register("brown_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> RED_SHEATH = ITEMS.register("red_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> ORANGE_SHEATH = ITEMS.register("orange_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> YELLOW_SHEATH = ITEMS.register("yellow_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> LIME_GREEN_SHEATH = ITEMS.register("lime_green_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> GREEN_SHEATH = ITEMS.register("green_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> CYAN_SHEATH = ITEMS.register("cyan_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> LIGHT_BLUE_SHEATH = ITEMS.register("light_blue_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> BLUE_SHEATH = ITEMS.register("blue_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> PURPLE_SHEATH = ITEMS.register("purple_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> MAGENTA_SHEATH = ITEMS.register("magenta_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> PINK_SHEATH = ITEMS.register("pink_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> CHAIN_SHEATH = ITEMS.register("chain_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> GOLD_SHEATH = ITEMS.register("gold_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> IRON_SHEATH = ITEMS.register("iron_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> DIAMOND_SHEATH = ITEMS.register("diamond_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<Item> NETHERITE_SHEATH = ITEMS.register("netherite_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	//Gemstones A-Z
	//                 A
	public static final RegistryObject<Item> AGNI_MANI = ITEMS.register("agni_mani",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> ALAMANDINE = ITEMS.register("alamandine",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> ALESTONE = ITEMS.register("alestone",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> ALGAE = ITEMS.register("algae",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> AMARANTHA = ITEMS.register("amarantha",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> ANDAR = ITEMS.register("andar",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> ARADITE = ITEMS.register("aradite",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> AUGELITE = ITEMS.register("augelite",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> AVENTURINE = ITEMS.register("aventurine",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	//                 B
	public static final RegistryObject<Item> BANDED_AGATE = ITEMS.register("banded_agate",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BELJURIL = ITEMS.register("beljuril",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BERYL = ITEMS.register("beryl",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BLACK_PEARL = ITEMS.register("black_pearl",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BLACK_SAPPHIRE = ITEMS.register("black_sapphire",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BLOODSTONE = ITEMS.register("bloodstone",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BLUE_QUARTZ = ITEMS.register("blue_quartz",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BLUE_SAPPHIRE = ITEMS.register("blue_sapphire",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BLUE_SPINEL = ITEMS.register("blue_spinel",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BLUESTONE = ITEMS.register("bluestone",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BOAKHAR = ITEMS.register("boakhar",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> BRANDEEN = ITEMS.register("brandeen",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	//                 C
	
	
	
	
	//Gemstone / Jewel Dusts
	
	//Misc Daggers
	public static final RegistryObject<TridentItem> WOOD_DAGGER = ITEMS.register("wood_dagger",
			() -> new TridentItem((new Item.Properties()).durability(59).tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<TridentItem> GOLD_DAGGER = ITEMS.register("gold_dagger",
			() -> new TridentItem((new Item.Properties()).durability(32).tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<TridentItem> STONE_DAGGER = ITEMS.register("stone_dagger",
			() -> new TridentItem((new Item.Properties()).durability(131).tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<TridentItem> IRON_DAGGER = ITEMS.register("iron_dagger",
			() -> new TridentItem((new Item.Properties()).durability(250).tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<TridentItem> diamond_DAGGER = ITEMS.register("diamond_dagger",
			() -> new TridentItem((new Item.Properties()).durability(1561).tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<TridentItem> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
			() -> new TridentItem((new Item.Properties()).durability(2031).tab(CreativeModeTab.TAB_COMBAT)));

	//ALL STEEL STUFF
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword",
			() -> new SwordItem(ToolMaterialInit.STEEL, 6, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	public static final RegistryObject<TridentItem> STEEL_DAGGER = ITEMS.register("steel_dagger",
			() -> new TridentItem((new Item.Properties()).durability(400).tab(CreativeModeTab.TAB_COMBAT)));
	
	
	
}
