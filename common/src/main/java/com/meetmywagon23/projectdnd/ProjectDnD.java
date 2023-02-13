package com.meetmywagon23.projectdnd;

import com.meetmywagon23.projectdnd.init.ArmorsInit;
import com.meetmywagon23.projectdnd.init.ItemsInit;
import com.meetmywagon23.projectdnd.init.ToolsInit;
import com.meetmywagon23.projectdnd.init.WeaponsInit;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ProjectDnD {
    public static final String MOD_ID = "projectdnd";
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


        System.out.println(ProjectDnDExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
