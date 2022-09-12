package com.meetmywagon23.projectdnd.init;

import com.meetmywagon23.projectdnd.ProjectDnD;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

public class ToolsInit {

    public static final DeferredRegister<Item> PICKAXES = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);

    public static final RegistrySupplier<PickaxeItem> FLESH_PICKAXE = PICKAXES.register("flesh_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.FLESH, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> BONE_PICKAXE = PICKAXES.register("bone_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.BONE, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> LEAD_PICKAXE = PICKAXES.register("lead_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.LEAD, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> TIN_PICKAXE = PICKAXES.register("tin_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.TIN, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> ZINC_PICKAXE = PICKAXES.register("zinc_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ZINC, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> SILVER_PICKAXE = PICKAXES.register("silver_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.SILVER, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> ALUMINUM_PICKAXE = PICKAXES.register("aluminum_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ALUMINUM, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> ELECTRUM_PICKAXE = PICKAXES.register("electrum_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ELECTRUM, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> COPPER_PICKAXE = PICKAXES.register("copper_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.COPPER, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> BRASS_PICKAXE = PICKAXES.register("brass_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.BRASS, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> BRONZE_PICKAXE = PICKAXES.register("bronze_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.BRONZE, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> NICKEL_PICKAXE = PICKAXES.register("nickel_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.NICKEL, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> PLATINUM_PICKAXE = PICKAXES.register("platinum_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.PLATINUM, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> STEEL_PICKAXE = PICKAXES.register("steel_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.STEEL, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> PALLADIUM_PICKAXE = PICKAXES.register("palladium_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.PALLADIUM, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> TITANIUM_PICKAXE = PICKAXES.register("titanium_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.TITANIUM, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> TUNGSTEN_PICKAXE = PICKAXES.register("tungsten_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.TUNGSTEN, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> MITHRIL_PICKAXE = PICKAXES.register("mirthril_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.MITHRIL, 1, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> ITANIUM_PICKAXE = PICKAXES.register("itanium_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ITANIUM, 2, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<PickaxeItem> ADAMANTINE_PICKAXE = PICKAXES.register("adamantine_pickaxe",
            () -> new PickaxeItem(ToolMaterialsInit.ADAMANTINE, 2, -2.8f,  new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));

    public static void init() {
        PICKAXES.register();
    }
}