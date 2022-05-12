package com.meetmywagon23.projectdnd.core.init;

import com.meetmywagon23.projectdnd.ProjectDnD;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class iteminit {
	private iteminit() {}
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectDnD.MODID);
	
	//Coins
	public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(10000)));
	public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(10000)));
	public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
			()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(10000)));
	public static final RegistryObject<Item> PLATINUM_COIN = ITEMS.register("platinum_coin",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(10000)));
	
	
	
	
	
	
	
	
}
