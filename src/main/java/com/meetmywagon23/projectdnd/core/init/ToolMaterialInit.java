package com.meetmywagon23.projectdnd.core.init;

import com.meetmywagon23.projectdnd.core.BaseToolMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;

public class ToolMaterialInit {
	private ToolMaterialInit() {
		
	}
	
	protected static final Tier STEEL = new BaseToolMaterial(2f, 25, 8, 10f, 500,
				() -> Ingredient.of(ItemInit.STEEL_INGOT.get()));
	

}
