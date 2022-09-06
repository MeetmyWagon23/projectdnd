package com.meetmywagon23.projectdnd.forge;

import dev.architectury.platform.forge.EventBuses;
import com.meetmywagon23.projectdnd.ProjectDnD;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ProjectDnD.MOD_ID)
public class ProjectDnDForge {
    public ProjectDnDForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ProjectDnD.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ProjectDnD.init();
    }
}
