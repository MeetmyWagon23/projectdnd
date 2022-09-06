package com.meetmywagon23.projectdnd.init;

import com.meetmywagon23.projectdnd.toolmaterials.BaseToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialsInit {

    protected static final ToolMaterial FLESH =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
    			() -> Ingredient.ofItems(Items.ROTTEN_FLESH));
    protected static final ToolMaterial BONE =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
    		() -> Ingredient.ofItems(Items.BONE));
    protected static final ToolMaterial LEAD =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.LEAD_INGOT.get()));
    protected static final ToolMaterial TIN =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.TIN_INGOT.get()));
    protected static final ToolMaterial ZINC =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.ZINC_INGOT.get()));
    protected static final ToolMaterial SILVER =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.SILVER_INGOT.get()));
    protected static final ToolMaterial ALUMINUM =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.ALUMINUM_INGOT.get()));
    protected static final ToolMaterial ELECTRUM =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.ELECTRUM_INGOT.get()));
    protected static final ToolMaterial COPPER =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
    		() -> Ingredient.ofItems(Items.COPPER_INGOT));
    protected static final ToolMaterial BRASS =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.BRASS_INGOT.get()));
    protected static final ToolMaterial BRONZE =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.BRONZE_INGOT.get()));
    protected static final ToolMaterial NICKEL =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.NICKEL_INGOT.get()));
    protected static final ToolMaterial PLATINUM =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.PLATINUM_INGOT.get()));
    protected static final ToolMaterial STEEL =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.STEEL_INGOT.get()));
    protected static final ToolMaterial PALLADIUM =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.PALLADIUM_INGOT.get()));
    protected static final ToolMaterial TITANIUM =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.TITANIUM_INGOT.get()));
    protected static final ToolMaterial TUNGSTEN =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.TUNGSTEN_INGOT.get()));
    protected static final ToolMaterial MYTHRIL =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.MITHRIL_INGOT.get()));
    protected static final ToolMaterial ITANIUM =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.ITANIUM_INGOT.get()));
    protected static final ToolMaterial ADAMANTINE =
            new BaseToolMaterial(2f, 25, 8, 10f, 500,
            () -> Ingredient.ofItems(ItemsInit.ADAMANTINE_INGOT.get()));
}
