package com.meetmywagon23.projectdnd;
import com.meetmywagon23.projectdnd.core.init.ItemInit;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ProjectDnD.MODID)
public class ProjectDnD {
	public static final String MODID = "projectdnd";
	
	public ProjectDnD() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		
		ItemInit.ITEMS.register(bus);
		
		
		
		bus.addListener(this::clientSetup);
	}
	
	private void clientSetup(final FMLClientSetupEvent event)
	{
		
	  event.enqueueWork(() ->
	  {
		    ItemProperties.register(ItemInit.COPPER_COIN.get(), 
		  	      new ResourceLocation(ProjectDnD.MODID, "amount"), (stack, level, living, id) -> {
		  	    	  return stack.getCount();
		  	      });
		    ItemProperties.register(ItemInit.SILVER_COIN.get(), 
		  	      new ResourceLocation(ProjectDnD.MODID, "amount"), (stack, level, living, id) -> {
		  	    	  return stack.getCount();
		  	      });
		    ItemProperties.register(ItemInit.GOLD_COIN.get(), 
		  	      new ResourceLocation(ProjectDnD.MODID, "amount"), (stack, level, living, id) -> {
		  	    	  return stack.getCount();
		  	      });
		    ItemProperties.register(ItemInit.PLATINUM_COIN.get(), 
		  	      new ResourceLocation(ProjectDnD.MODID, "amount"), (stack, level, living, id) -> {
		  	    	  return stack.getCount();
		  	      });
	  });
	}
}
