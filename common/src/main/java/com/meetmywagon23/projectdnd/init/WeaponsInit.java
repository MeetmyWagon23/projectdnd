package com.meetmywagon23.projectdnd.init;

import com.meetmywagon23.projectdnd.ProjectDnD;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.TridentItem;
import net.minecraft.util.registry.Registry;

public class WeaponsInit {
    public static final DeferredRegister<Item> WEAPONS = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);

    //Misc Daggers Damage needs to be adjusted, and Speed needs to be adjusted. not sure how to change it. i think a few tool materials will need to be used.
    public static final RegistrySupplier<TridentItem> WOOD_DAGGER = WEAPONS.register("wood_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(59).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> GOLD_DAGGER = WEAPONS.register("gold_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(32).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> STONE_DAGGER = WEAPONS.register("stone_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(131).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> IRON_DAGGER = WEAPONS.register("iron_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(250).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> STEEL_DAGGER = WEAPONS.register("steel_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(400).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> DIAMOND_DAGGER = WEAPONS.register("diamond_dagger",
            () -> new TridentItem((new Item.Settings()).maxDamage(1561).group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<TridentItem> NETHERITE_DAGGER = WEAPONS.register("netherite_dagger",
            () -> new TridentItem((new Item.Settings().fireproof().maxDamage(2031).group(ProjectDnD.CREATIVE_TAB))));
    //longswords ToolMaterials will be changed to their proper materials Might adjust the texture of these and change these to longswords, i would like longswords to ACTUALLY BE GREAT SWORDS, these are too puny to be great.
    public static final RegistrySupplier<SwordItem> WOOD_LONGSWORD = WEAPONS.register("wood_longsword",
            () -> new SwordItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_LONGSWORD = WEAPONS.register("stone_longsword",
            () -> new SwordItem(ToolMaterials.STONE, 5, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_LONGSWORD = WEAPONS.register("gold_longsword",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_LONGSWORD = WEAPONS.register("iron_longsword",
            () -> new SwordItem(ToolMaterials.IRON, 6, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_LONGSWORD = WEAPONS.register("steel_longsword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 7, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_LONGSWORD = WEAPONS.register("diamond_longsword",
            () -> new SwordItem(ToolMaterials.DIAMOND, 7, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_LONGSWORD = WEAPONS.register("netherite_longsword",
            () -> new SwordItem(ToolMaterials.NETHERITE, 8, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    //GREATSWORDS
    public static final RegistrySupplier<SwordItem> WOOD_GREATSWORD = WEAPONS.register("wood_greatsword",
            () -> new SwordItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STONE_GREATSWORD = WEAPONS.register("stone_greatsword",
            () -> new SwordItem(ToolMaterials.STONE, 5, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> GOLD_GREATSWORD = WEAPONS.register("gold_greatsword",
            () -> new SwordItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> IRON_GREATSWORD = WEAPONS.register("iron_greatsword",
            () -> new SwordItem(ToolMaterials.IRON, 6, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> STEEL_GREATSWORD = WEAPONS.register("steel_greatsword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 7, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> DIAMOND_GREATSWORD = WEAPONS.register("diamond_greatsword",
            () -> new SwordItem(ToolMaterials.DIAMOND, 7, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> NETHERITE_GREATSWORD = WEAPONS.register("netherite_greatsword",
            () -> new SwordItem(ToolMaterials.NETHERITE, 8, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));

    //Legendary Greatswords
    public static final RegistrySupplier<SwordItem> HOLY_AVENGER_GREATSWORD = WEAPONS.register("holy_avenger_greatsword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 8, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    public static final RegistrySupplier<SwordItem> HAZIRAWN_GREATSWORD = WEAPONS.register("hazirawn_greatsword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 9, -3.2f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));
    //Hazirawn Greatsword uses a geckolib model at the moment, so it wont load just yet.
    //ALL STEEL STUFF-----------------TO BE MOVED TO PROPER CATAGORIES ORGANIZED----------------------------------------These are only temporarily here
    public static final RegistrySupplier<SwordItem> STEEL_SWORD = WEAPONS.register("steel_sword",
            () -> new SwordItem(ToolMaterialsInit.STEEL, 4, -2.4f, new Item.Settings().group(ProjectDnD.CREATIVE_TAB)));


    public static void init() {
        WEAPONS.register();
    }
}
