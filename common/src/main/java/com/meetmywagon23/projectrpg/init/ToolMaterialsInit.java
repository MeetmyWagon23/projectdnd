package com.meetmywagon23.projectrpg.init;

import com.meetmywagon23.projectrpg.toolmaterials.BaseToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialsInit {

    /*
    The MOHS Hardness Scale is used to define how these items are organized & how they will be treated in game
    I have tried to organize them based on this to keep things consistant & Easy to follow.

     mining levels
     WOOD = 0;
     STONE = 1;
     IRON = 2;
     DIAMOND = 3;
     NETHERITE = 4;

    */
    protected static final ToolMaterial FLESH =
            new BaseToolMaterial(0f, 1, 0, 0.5f, 11,
    			() -> Ingredient.ofItems(Items.ROTTEN_FLESH));
    //wood     WOOD                 (attackdmg 0.0f, enchant 15, mininglvl 0, miningspeed 2.0f, durability 59)
    //        return Ingredient.fromTag(ItemTags.PLANKS)
    //stone    STONE              (attackdamag 1.0f, enchant 5, mininglvl 1, miningspeed 4.0f, durability 131)
    //        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
    //Gold     GOLD              (attackdamag 0.0f, enchant 22, mininglvl 1, miningspeed 12.0f, durability 32)
    protected static final ToolMaterial SILVER =
            new BaseToolMaterial(0f, 15, 1, 4f, 161,
            () -> Ingredient.ofItems(ItemsInit.SILVER_INGOT.get()));
    protected static final ToolMaterial COPPER =
            new BaseToolMaterial(0f, 3, 1, 4.5f, 181,
    		() -> Ingredient.ofItems(Items.COPPER_INGOT));
    protected static final ToolMaterial BRASS =
            new BaseToolMaterial(0f, 5, 1, 4.5f, 201,
            () -> Ingredient.ofItems(ItemsInit.BRASS_INGOT.get()));
    protected static final ToolMaterial BRONZE =
            new BaseToolMaterial(0f, 4, 1, 4.5f, 221,
            () -> Ingredient.ofItems(ItemsInit.BRONZE_INGOT.get()));
    protected static final ToolMaterial PLATINUM =
            new BaseToolMaterial(0f, 18, 1, 5.5f, 241,
            () -> Ingredient.ofItems(ItemsInit.PLATINUM_INGOT.get()));
    protected static final ToolMaterial BONE =
            new BaseToolMaterial(0f, 2, 2, 7f, 32,
                    () -> Ingredient.ofItems(Items.BONE));
    //iron    IRON               (attackdamag 2.0f, enchant 14, mininglvl 2, miningspeed 6.0f, durability 250)
    protected static final ToolMaterial INFERNAL_IRON =
            new BaseToolMaterial(0f, 14, 2, 7f, 250,
                    () -> Ingredient.ofItems(ItemsInit.INFERNAL_IRON_INGOT.get()));
    protected static final ToolMaterial COLD_IRON =
            new BaseToolMaterial(0f, 14, 2, 7f, 250,
                    () -> Ingredient.ofItems(ItemsInit.COLD_IRON_INGOT.get()));
    protected static final ToolMaterial STEEL =
            new BaseToolMaterial(0f, 16, 3, 7f, 670,
            () -> Ingredient.ofItems(ItemsInit.STEEL_INGOT.get()));
    //diamond    DIAMOND         (attackdamag 3.0f, enchant 10, mininglvl 3, miningspeed 8.0f, durability 1561)
    protected static final ToolMaterial ELVEN_STEEL =
            new BaseToolMaterial(0f, 18, 3, 8f, 1791,
                    () -> Ingredient.ofItems(ItemsInit.ELVEN_STEEL_INGOT.get()));
    protected static final ToolMaterial DARK_STEEL =
            new BaseToolMaterial(0f, 18, 3, 8f, 1791,
                    () -> Ingredient.ofItems(ItemsInit.DARK_STEEL_INGOT.get()));
    //netherite    NETHERITE     (attackdamag 4.0f, enchant 15, mininglvl 4, miningspeed 9.0f, durability 2031)
    protected static final ToolMaterial DRAGON_BONE =
            new BaseToolMaterial(0f, 18, 3, 9f, 2341,
                    () -> Ingredient.ofItems(ItemsInit.DRAGON_BONE.get()));
    protected static final ToolMaterial PALLADIUM =
            new BaseToolMaterial(0f, 22, 4, 10f, 2651,
            () -> Ingredient.ofItems(ItemsInit.PALLADIUM_INGOT.get()));
    protected static final ToolMaterial TITANIUM =
            new BaseToolMaterial(0f, 24, 4, 10f, 2961,
            () -> Ingredient.ofItems(ItemsInit.TITANIUM_INGOT.get()));
    protected static final ToolMaterial TUNGSTEN =
            new BaseToolMaterial(0f, 15, 4, 11f, 3271,
            () -> Ingredient.ofItems(ItemsInit.TUNGSTEN_INGOT.get()));
    protected static final ToolMaterial MITHRIL =
            new BaseToolMaterial(0f, 15, 4, 11f, 3581,
            () -> Ingredient.ofItems(ItemsInit.MITHRIL_INGOT.get()));
    protected static final ToolMaterial ITANIUM =
            new BaseToolMaterial(0f, 16, 4, 12f, 3891,
            () -> Ingredient.ofItems(ItemsInit.ITANIUM_INGOT.get()));
    protected static final ToolMaterial ADAMANTINE =
            new BaseToolMaterial(0f, 18, 4, 12f, 4101,
            () -> Ingredient.ofItems(ItemsInit.ADAMANTINE_INGOT.get()));
    protected static final ToolMaterial SHADOW_ADAMANTINE =
            new BaseToolMaterial(0f, 18, 4, 12f, 4101,
                    () -> Ingredient.ofItems(ItemsInit.SHADOW_ADAMANTINE_INGOT.get()));
    protected static final ToolMaterial LEGENDARY =
            new BaseToolMaterial(0f, 18, 4, 12f, 4421,
                    () -> Ingredient.ofItems(ItemsInit.LEGENDARY_CORE.get()));
}
