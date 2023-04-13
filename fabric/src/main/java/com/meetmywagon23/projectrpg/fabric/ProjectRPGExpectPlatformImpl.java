package com.meetmywagon23.projectrpg.fabric;

import com.meetmywagon23.projectrpg.ProjectRPGExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ProjectRPGExpectPlatformImpl {
    /**
     * This is our actual method to {@link ProjectRPGExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
