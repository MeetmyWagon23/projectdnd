package com.meetmywagon23.projectdnd.core.init;
import com.meetmywagon23.projectdnd.ProjectDnD;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ProjectDnD.MOD_ID);

	//SHEATHS
	
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
	
	//DAGGERS
	
	
	
	public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger",
			() -> new TridentItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> GOLD_DAGGER = ITEMS.register("gold_dagger",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
			() -> new TridentItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	//DAGGER SHEATHS
	
	
	
	//WAGONIUM MISC
	
	public static final RegistryObject<Item> WAGONIUM_SHEATH = ITEMS.register("wagonium_sheath",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> WAGONIUM_INGOT = ITEMS.register("wagonium_ingot",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	//WAGONIUM TOOLS
	
	public static final RegistryObject<SwordItem> WAGONIUM_SWORD = ITEMS.register("wagonium_sword",
			() -> new SwordItem(ToolMaterialInit.WAGONIUM, 6, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<PickaxeItem> WAGONIUM_PICKAXE = ITEMS.register("wagonium_pickaxe",
			() -> new PickaxeItem(ToolMaterialInit.WAGONIUM, 4, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<AxeItem> WAGONIUM_AXE = ITEMS.register("wagonium_axe",
			() -> new AxeItem(ToolMaterialInit.WAGONIUM, 8, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<ShovelItem> WAGONIUM_SHOVEL = ITEMS.register("wagonium_shovel",
			() -> new ShovelItem(ToolMaterialInit.WAGONIUM, 4.5f, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<HoeItem> WAGONIUM_HOE = ITEMS.register("wagonium_hoe",
			() -> new HoeItem(ToolMaterialInit.WAGONIUM, -1, 0f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<SwordItem> WAGONIUM_DAGGER = ITEMS.register("wagonium_dagger",
			() -> new SwordItem(ToolMaterialInit.WAGONIUM, 5, -2f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	//WAGONIUM ARMOR
	
	public static final RegistryObject<ArmorItem> WAGONIUM_HELMET = ITEMS.register("wagonium_helmet",
			() -> new ArmorItem(ArmorMaterialInit.WAGONIUM, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));	
	
	public static final RegistryObject<ArmorItem> WAGONIUM_CHESTPLATE = ITEMS.register("wagonium_chestplate",
			() -> new ArmorItem(ArmorMaterialInit.WAGONIUM, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<ArmorItem> WAGONIUM_LEGGINGS = ITEMS.register("wagonium_leggings",
			() -> new ArmorItem(ArmorMaterialInit.WAGONIUM, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<ArmorItem> WAGONIUM_BOOTS = ITEMS.register("wagonium_boots",
			() -> new ArmorItem(ArmorMaterialInit.WAGONIUM, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	//BLOCK ITEMS STUFFS

	public static final RegistryObject<BlockItem> WAGONIUM_BLOCK_ITEM = ITEMS.register("wagonium_block",
			() -> new BlockItem(BlockInit.WAGONIUM_BLOCK.get(),
					new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}