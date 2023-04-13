package com.meetmywagon23.projectrpg.forge.events;

import com.meetmywagon23.projectrpg.ProjectRPG;
import com.meetmywagon23.projectrpg.client.ProjectRPGClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ProjectRPG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeClientModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        new ProjectRPGClient().onInitializeClient();
    }
}