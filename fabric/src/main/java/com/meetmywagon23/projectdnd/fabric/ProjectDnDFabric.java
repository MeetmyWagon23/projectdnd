package com.meetmywagon23.projectdnd.fabric;

import com.meetmywagon23.projectdnd.ProjectDnD;
import net.fabricmc.api.ModInitializer;

public class ProjectDnDFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ProjectDnD.init();
    }
}
