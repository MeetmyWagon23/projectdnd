package com.meetmywagon23.projectrpg.fabric;

import com.meetmywagon23.projectrpg.ProjectRPG;
import net.fabricmc.api.ModInitializer;

public class ProjectRPGFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ProjectRPG.init();
    }
}
