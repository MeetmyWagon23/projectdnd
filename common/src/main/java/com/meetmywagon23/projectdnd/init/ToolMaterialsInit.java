package com.meetmywagon23.projectdnd.init;

import com.meetmywagon23.projectdnd.toolmaterials.BaseToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialsInit {

    protected static final ToolMaterial FLESH =
            new BaseToolMaterial(0f, 1, 0, 0.5f, 11,
    			() -> Ingredient.ofItems(Items.ROTTEN_FLESH));
    protected static final ToolMaterial BONE =
            new BaseToolMaterial(0f, 10, 1, 1f, 69,
    		() -> Ingredient.ofItems(Items.BONE));
    //stone
    protected static final ToolMaterial LEAD =
            new BaseToolMaterial(0.5f, 5, 1, 1.1f, 33,
            () -> Ingredient.ofItems(ItemsInit.LEAD_INGOT.get()));
    protected static final ToolMaterial TIN =
            new BaseToolMaterial(0.5f, 8, 1, 1.2f, 69,
            () -> Ingredient.ofItems(ItemsInit.TIN_INGOT.get()));
    protected static final ToolMaterial ZINC =
            new BaseToolMaterial(0.5f, 8, 1, 2f, 101,
            () -> Ingredient.ofItems(ItemsInit.ZINC_INGOT.get()));
    protected static final ToolMaterial SILVER =
            new BaseToolMaterial(1f, 20, 1, 2f, 121,
            () -> Ingredient.ofItems(ItemsInit.SILVER_INGOT.get()));
    protected static final ToolMaterial ALUMINUM =
            new BaseToolMaterial(1f, 10, 1, 1.5f, 141,
            () -> Ingredient.ofItems(ItemsInit.ALUMINUM_INGOT.get()));
    protected static final ToolMaterial ELECTRUM =
            new BaseToolMaterial(1f, 15, 1, 3f, 161,
            () -> Ingredient.ofItems(ItemsInit.ELECTRUM_INGOT.get()));
    protected static final ToolMaterial COPPER =
            new BaseToolMaterial(2f, 8, 1, 3.5f, 181,
    		() -> Ingredient.ofItems(Items.COPPER_INGOT));
    protected static final ToolMaterial BRASS =
            new BaseToolMaterial(2f, 8, 1, 4f, 201,
            () -> Ingredient.ofItems(ItemsInit.BRASS_INGOT.get()));
    protected static final ToolMaterial BRONZE =
            new BaseToolMaterial(2f, 10, 2, 4.5f, 221,
            () -> Ingredient.ofItems(ItemsInit.BRONZE_INGOT.get()));
    protected static final ToolMaterial NICKEL =
            new BaseToolMaterial(2f, 10, 1, 5f, 231,
            () -> Ingredient.ofItems(ItemsInit.NICKEL_INGOT.get()));
    protected static final ToolMaterial PLATINUM =
            new BaseToolMaterial(2f, 22, 2, 5.5f, 241,
            () -> Ingredient.ofItems(ItemsInit.PLATINUM_INGOT.get()));
    //iron
    protected static final ToolMaterial STEEL =
            new BaseToolMaterial(2f, 16, 3, 7f, 500,
            () -> Ingredient.ofItems(ItemsInit.STEEL_INGOT.get()));
    protected static final ToolMaterial PALLADIUM =
            new BaseToolMaterial(2f, 18, 3, 7.5f, 799,
            () -> Ingredient.ofItems(ItemsInit.PALLADIUM_INGOT.get()));
    protected static final ToolMaterial TITANIUM =
            new BaseToolMaterial(2f, 20, 3, 8f, 1201,
            () -> Ingredient.ofItems(ItemsInit.TITANIUM_INGOT.get()));
    //diamond
    //netherite
    protected static final ToolMaterial TUNGSTEN =
            new BaseToolMaterial(2f, 24, 4, 12f, 3901,
            () -> Ingredient.ofItems(ItemsInit.TUNGSTEN_INGOT.get()));
    protected static final ToolMaterial MITHRIL =
            new BaseToolMaterial(2f, 30, 4, 13f, 4201,
            () -> Ingredient.ofItems(ItemsInit.MITHRIL_INGOT.get()));
    //adamant
    protected static final ToolMaterial ITANIUM =
            new BaseToolMaterial(3f, 35, 4, 14f, 6901,
            () -> Ingredient.ofItems(ItemsInit.ITANIUM_INGOT.get()));
    protected static final ToolMaterial ADAMANTINE =
            new BaseToolMaterial(3f, 35, 4, 14f, 6901,
            () -> Ingredient.ofItems(ItemsInit.ADAMANTINE_INGOT.get()));
}
