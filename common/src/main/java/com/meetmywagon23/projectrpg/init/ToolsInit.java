package com.meetmywagon23.projectrpg.init;

import com.meetmywagon23.projectrpg.ProjectRPG;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

public class ToolsInit {

    public static final DeferredRegister<Item> PICKAXES = DeferredRegister.create(ProjectRPG.MOD_ID, Registry.ITEM_KEY);
    public static final DeferredRegister<Item> AXES = DeferredRegister.create(ProjectRPG.MOD_ID, Registry.ITEM_KEY);
    public static final DeferredRegister<Item> SHOVELS = DeferredRegister.create(ProjectRPG.MOD_ID, Registry.ITEM_KEY);
    public static final DeferredRegister<Item> HOES = DeferredRegister.create(ProjectRPG.MOD_ID, Registry.ITEM_KEY);
    //Tools are organized using the MOHS Hardness Scale.
    //flesh -REMOVED.
    public static final RegistrySupplier<PickaxeItem> SILVER_PICKAXE = PICKAXES.register("silver_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.SILVER, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> SILVER_AXE = AXES.register("silver_axe",
            () -> new AxeItem(ToolMaterialsInit.SILVER, 6f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> SILVER_SHOVEL = SHOVELS.register("silver_shovel",
            () -> new ShovelItem(ToolMaterialsInit.SILVER, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> SILVER_HOE = HOES.register("silver_hoe",
            () -> new HoeItem(ToolMaterialsInit.SILVER, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> COPPER_PICKAXE = PICKAXES.register("copper_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.COPPER, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> COPPER_AXE = AXES.register("copper_axe",
            () -> new AxeItem(ToolMaterialsInit.COPPER, 6f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> COPPER_SHOVEL = SHOVELS.register("copper_shovel",
            () -> new ShovelItem(ToolMaterialsInit.COPPER, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> COPPER_HOE = HOES.register("copper_hoe",
            () -> new HoeItem(ToolMaterialsInit.COPPER, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> BRONZE_PICKAXE = PICKAXES.register("bronze_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.BRONZE, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> BRONZE_AXE = AXES.register("bronze_axe",
            () -> new AxeItem(ToolMaterialsInit.BRONZE, 6f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> BRONZE_SHOVEL = SHOVELS.register("bronze_shovel",
            () -> new ShovelItem(ToolMaterialsInit.BRONZE, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> BRONZE_HOE = HOES.register("bronze_hoe",
            () -> new HoeItem(ToolMaterialsInit.BRONZE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> PLATINUM_PICKAXE = PICKAXES.register("platinum_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.PLATINUM, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> PLATINUM_AXE = AXES.register("platinum_axe",
            () -> new AxeItem(ToolMaterialsInit.PLATINUM, 6f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> PLATINUM_SHOVEL = SHOVELS.register("platinum_shovel",
            () -> new ShovelItem(ToolMaterialsInit.PLATINUM, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> PLATINUM_HOE = HOES.register("platinum_hoe",
            () -> new HoeItem(ToolMaterialsInit.PLATINUM, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> BONE_PICKAXE = PICKAXES.register("bone_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.BONE, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> BONE_AXE = AXES.register("bone_axe",
            () -> new AxeItem(ToolMaterialsInit.BONE, 7f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> BONE_shovel = SHOVELS.register("bone_shovel",
            () -> new ShovelItem(ToolMaterialsInit.BONE, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> BONE_HOE = HOES.register("bone_hoe",
            () -> new HoeItem(ToolMaterialsInit.BONE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> INFERNAL_IRON_PICKAXE = PICKAXES.register("infernal_iron_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.INFERNAL_IRON, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> INFERNAL_IRON_AXE = AXES.register("infernal_iron_axe",
            () -> new AxeItem(ToolMaterialsInit.INFERNAL_IRON, 7f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> INFERNAL_IRON_SHOVEL = SHOVELS.register("infernal_iron_shovel",
            () -> new ShovelItem(ToolMaterialsInit.INFERNAL_IRON, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> INFERNAL_IRON_HOE = HOES.register("infernal_iron_hoe",
            () -> new HoeItem(ToolMaterialsInit.INFERNAL_IRON, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> COLD_IRON_PICKAXE = PICKAXES.register("cold_iron_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.COLD_IRON, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> COLD_IRON_AXE = AXES.register("cold_iron_axe",
            () -> new AxeItem(ToolMaterialsInit.COLD_IRON, 7f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> COLD_IRON_SHOVEL = SHOVELS.register("cold_iron_shovel",
            () -> new ShovelItem(ToolMaterialsInit.COLD_IRON, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> COLD_IRON_HOE = HOES.register("cold_iron_hoe",
            () -> new HoeItem(ToolMaterialsInit.COLD_IRON, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> STEEL_PICKAXE = PICKAXES.register("steel_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.STEEL, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> STEEL_AXE = AXES.register("steel_axe",
            () -> new AxeItem(ToolMaterialsInit.STEEL, 8f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> STEEL_SHOVEL = SHOVELS.register("steel_shovel",
            () -> new ShovelItem(ToolMaterialsInit.STEEL, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> STEEL_HOE = HOES.register("steel_hoe",
            () -> new HoeItem(ToolMaterialsInit.STEEL, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> ELVEN_PICKAXE = PICKAXES.register("elven_steel_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ELVEN_STEEL, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> ELVEN_STEEL_AXE = AXES.register("elven_steel_axe",
            () -> new AxeItem(ToolMaterialsInit.ELVEN_STEEL, 8f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> ELVEN_STEEL_SHOVEL = SHOVELS.register("elven_steel_shovel",
            () -> new ShovelItem(ToolMaterialsInit.ELVEN_STEEL, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> ELVEN_STEEL_HOE = HOES.register("elven_steel_hoe",
            () -> new HoeItem(ToolMaterialsInit.ELVEN_STEEL, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> DARK_STEEL_PICKAXE = PICKAXES.register("dark_steel_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.DARK_STEEL, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> DARK_STEEL_AXE = AXES.register("dark_steel_axe",
            () -> new AxeItem(ToolMaterialsInit.DARK_STEEL, 8f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> DARK_STEEL_SHOVEL = SHOVELS.register("dark_steel_shovel",
            () -> new ShovelItem(ToolMaterialsInit.DARK_STEEL, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> DARK_STEEL_HOE = HOES.register("dark_steel_hoe",
            () -> new HoeItem(ToolMaterialsInit.DARK_STEEL, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> DRAGON_BONE_PICKAXE = PICKAXES.register("dragon_bone_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.DRAGON_BONE, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> DRAGON_BONE_AXE = AXES.register("dragon_bone_axe",
            () -> new AxeItem(ToolMaterialsInit.DRAGON_BONE, 9f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> DRAGON_BONE_SHOVEL = SHOVELS.register("dragon_bone_shovel",
            () -> new ShovelItem(ToolMaterialsInit.DRAGON_BONE, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> DRAGON_BONE_HOE = HOES.register("dragon_bone_hoe",
            () -> new HoeItem(ToolMaterialsInit.DRAGON_BONE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> PALLADIUM_PICKAXE = PICKAXES.register("palladium_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.PALLADIUM, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> PALLADIUM_AXE = AXES.register("palladium_axe",
            () -> new AxeItem(ToolMaterialsInit.PALLADIUM, 10f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> PALLADIUM_SHOVEL = SHOVELS.register("palladium_shovel",
            () -> new ShovelItem(ToolMaterialsInit.PALLADIUM, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> PALLADIUM_HOE = HOES.register("palladium_hoe",
            () -> new HoeItem(ToolMaterialsInit.PALLADIUM, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> TUNGSTEN_CARBIDE_PICKAXE = PICKAXES.register("tungsten_carbide_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.TUNGSTEN_CARBIDE, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> TUNGSTEN_CARBIDE_AXE = AXES.register("tungsten_carbide_axe",
            () -> new AxeItem(ToolMaterialsInit.TUNGSTEN_CARBIDE, 11f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> TUNGSTEN_CARBIDE_SHOVEL = SHOVELS.register("tungsten_carbide_shovel",
            () -> new ShovelItem(ToolMaterialsInit.TUNGSTEN_CARBIDE, 1f, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> TUNGSTEN_CARBIDE_HOE = HOES.register("tungsten_carbide_hoe",
            () -> new HoeItem(ToolMaterialsInit.TUNGSTEN_CARBIDE, 1, 0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> MITHRIL_PICKAXE = PICKAXES.register("mirthril_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.MITHRIL, 1, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> MITHRIL_AXE = AXES.register("mirthril_axe",
            () -> new AxeItem(ToolMaterialsInit.MITHRIL, 12f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> MITHRIL_SHOVEL = SHOVELS.register("mithril_shovel",
            () -> new ShovelItem(ToolMaterialsInit.MITHRIL, 1f, -3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> MITHRIL_HOE = HOES.register("mithril_hoe",
            () -> new HoeItem(ToolMaterialsInit.MITHRIL, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> ADAMANTINE_PICKAXE = PICKAXES.register("adamantine_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ADAMANTINE, 2, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> ADAMANTINE_AXE = AXES.register("adamantine_axe",
            () -> new AxeItem(ToolMaterialsInit.ADAMANTINE, 8f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> ADAMANTINE_SHOVEL = SHOVELS.register("adamantine_shovel",
            () -> new ShovelItem(ToolMaterialsInit.ADAMANTINE, 13f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> ADAMANTINE_HOE = HOES.register("adamantine_hoe",
            () -> new HoeItem(ToolMaterialsInit.ADAMANTINE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> SHADOW_ADAMANTINE_PICKAXE = PICKAXES.register("shadow_adamantine_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 2, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> SHADOW_ADAMANTINE_AXE = AXES.register("shadow_adamantine_axe",
            () -> new AxeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 8f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> SHADOW_ADAMANTINE_SHOVEL = SHOVELS.register("shadow_adamantine_shovel",
            () -> new ShovelItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 13f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> SHADOW_ADAMANTINE_HOE = HOES.register("shadow_adamantine_hoe",
            () -> new HoeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> ADAMANTINE_DRAGON_BONE_PICKAXE = PICKAXES.register("adamantine_dragon_bone_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ADAMANTINE, 2, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> ADAMANTINE_DRAGON_BONE_AXE = AXES.register("adamantine_dragon_bone_axe",
            () -> new AxeItem(ToolMaterialsInit.ADAMANTINE, 8f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> ADAMANTINE_DRAGON_BONE_SHOVEL = SHOVELS.register("adamantine_dragon_bone_shovel",
            () -> new ShovelItem(ToolMaterialsInit.ADAMANTINE, 14f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> ADAMANTINE_DRAGON_BONE_HOE = HOES.register("adamantine_dragon_bone_hoe",
            () -> new HoeItem(ToolMaterialsInit.ADAMANTINE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> SHADOW_ADAMANTINE_DRAGON_BONE_PICKAXE = PICKAXES.register("shadow_adamantine_dragon_bone_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 2, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> SHADOW_ADAMANTINE_DRAGON_BONE_AXE = AXES.register("shadow_adamantine_dragon_bone_axe",
            () -> new AxeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 14f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> SHADOW_ADAMANTINE_DRAGON_BONE_SHOVEL = SHOVELS.register("shadow_adamantine_dragon_bone_shovel",
            () -> new ShovelItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> SHADOW_ADAMANTINE_DRAGON_BONE_HOE = HOES.register("shadow_adamantine_dragon_bone_hoe",
            () -> new HoeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> ADAMANTINE_COATED_DRAGON_BONE_PICKAXE = PICKAXES.register("adamantine_coated_dragon_bone_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ADAMANTINE, 2, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> ADAMANTINE_COATED_DRAGON_BONE_AXE = AXES.register("adamantine_coated_dragon_bone_axe",
            () -> new AxeItem(ToolMaterialsInit.ADAMANTINE, 14f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> ADAMANTINE_COATED_DRAGON_BONE_SHOVEL = SHOVELS.register("adamantine_coated_dragon_bone_shovel",
            () -> new ShovelItem(ToolMaterialsInit.ADAMANTINE, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> ADAMANTINE_COATED_DRAGON_BONE_HOE = HOES.register("adamantine_coated_dragon_bone_hoe",
            () -> new HoeItem(ToolMaterialsInit.ADAMANTINE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    public static final RegistrySupplier<PickaxeItem> SHADOW_ADAMANTINE_COATED_DRAGON_BONE_PICKAXE = PICKAXES.register("shadow_adamantine_coated_dragon_bone_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 2, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<AxeItem> SHADOW_ADAMANTINE_COATED_DRAGON_BONE_AXE = AXES.register("shadow_adamantine_coated_dragon_bone_axe",
            () -> new AxeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 14f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<ShovelItem> SHADOW_ADAMANTINE_COATED_DRAGON_BONE_SHOVEL = SHOVELS.register("shadow_adamantine_coated_dragon_bone_shovel",
            () -> new ShovelItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
    public static final RegistrySupplier<HoeItem> SHADOW_ADAMANTINE_COATED_DRAGON_BONE_HOE = HOES.register("shadow_adamantine_coated_dragon_bone_hoe",
            () -> new HoeItem(ToolMaterialsInit.SHADOW_ADAMANTINE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));

    //Divine Equipment sets goes here----\/
//    public static final RegistrySupplier<PickaxeItem> NAME = PICKAXES.register("name",
//            () -> new PickaxeItem(ToolMaterialsInit.DIVINE, 2, -2.8f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<AxeItem> NAME = AXES.register("name",
//            () -> new AxeItem(ToolMaterialsInit.DIVINE, 15f, -1.5f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<ShovelItem> NAME = SHOVELS.register("name",
//            () -> new ShovelItem(ToolMaterialsInit.DIVINE, 1f, 3.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));
//    public static final RegistrySupplier<HoeItem> NAME = HOES.register("name",
//            () -> new HoeItem(ToolMaterialsInit.DIVINE, 1, -0.0f, new Item.Settings().group(ProjectRPG.CREATIVE_TAB)));


    public static void init() {
        PICKAXES.register();
        AXES.register();
        SHOVELS.register();
        HOES.register();
    }

}