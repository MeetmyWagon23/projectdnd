package com.meetmywagon23.projectdnd.forge.events;

import com.meetmywagon23.projectdnd.ProjectDnD;
import com.meetmywagon23.projectdnd.client.ProjectDnDClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ProjectDnD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeClientModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        new ProjectDnDClient().onInitializeClient();
    }
}
