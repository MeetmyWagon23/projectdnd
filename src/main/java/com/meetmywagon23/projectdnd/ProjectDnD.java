package com.meetmywagon23.projectdnd;
import com.meetmywagon23.projectdnd.core.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ProjectDnD.MODID)
public class ProjectDnD {
	public static final String MODID = "projectdnd";
	
	public ProjectDnD() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
	//BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
	}
	
	public static final CreativeModeTab DnD = new CreativeModeTab(MODID) {
		
		@Override
		public ItemStack makeIcon() {
			return ItemInit.PLATINUM_COIN.get().getDefaultInstance();
		}
	};
}