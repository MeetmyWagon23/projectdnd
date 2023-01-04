package com.meetmywagon23.projectdnd.init;

import com.meetmywagon23.projectdnd.ProjectDnD;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ArmorsInit {

    public static final DeferredRegister<Item> HELMETS = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);
    public static final DeferredRegister<Item> CHESTPLATES = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);
    public static final DeferredRegister<Item> LEGGINGS = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);
    public static final DeferredRegister<Item> BOOTS = DeferredRegister.create(ProjectDnD.MOD_ID, Registry.ITEM_KEY);





    public static void init() {
        HELMETS.register();
        CHESTPLATES.register();
        LEGGINGS.register();
        BOOTS.register();
    }
}
