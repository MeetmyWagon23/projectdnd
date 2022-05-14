package com.meetmywagon23.projectdnd.core.init;

import com.meetmywagon23.projectdnd.ProjectDnD;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	private ItemInit() {}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectDnD.MODID);
	
	//Coins (Items)
	public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	public static final RegistryObject<Item> PLATINUM_COIN = ITEMS.register("platinum_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(50)));
	
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
	//public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
		//	()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
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
	
	//
	
	
	
	
	
}
