package com.meetmywagon23.projectrpg;

import com.meetmywagon23.projectrpg.init.ArmorsInit;
import com.meetmywagon23.projectrpg.init.ItemsInit;
import com.meetmywagon23.projectrpg.init.ToolsInit;
import com.meetmywagon23.projectrpg.init.WeaponsInit;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ProjectRPG {
    public static final String MOD_ID = "projectrpg";
    // We can use this if we don't want to use DeferredRegister
    // Registering a new creative tab
    public static final Identifier ITEM_GROUP_IDENTIFIER = new Identifier(MOD_ID, "group");
    public static final ItemGroup CREATIVE_TAB = CreativeTabRegistry.create(ITEM_GROUP_IDENTIFIER, () ->
            new ItemStack(ItemsInit.PLATINUM_COIN.get()));

    public static void init() {
      ItemsInit.ITEMS.register();
      ToolsInit.init();
      WeaponsInit.WEAPONS.register();
      ArmorsInit.ARMOR.register();


        System.out.println(ProjectRPGExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
