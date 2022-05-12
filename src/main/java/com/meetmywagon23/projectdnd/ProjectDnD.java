package com.meetmywagon23.projectdnd;

import com.meetmywagon23.projectdnd.core.init.iteminit;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ProjectDnD.MODID)
public class ProjectDnD {
	public static final String MODID = "projectdnd";
	
	public ProjectDnD() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		iteminit.ITEMS.register(bus);
	}
}
