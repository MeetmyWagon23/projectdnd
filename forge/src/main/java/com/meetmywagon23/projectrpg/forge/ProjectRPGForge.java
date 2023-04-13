package com.meetmywagon23.projectrpg.forge;

import dev.architectury.platform.forge.EventBuses;
import com.meetmywagon23.projectrpg.ProjectRPG;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ProjectRPG.MOD_ID)
public class ProjectRPGForge {
    public ProjectRPGForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ProjectRPG.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ProjectRPG.init();
    }
}
