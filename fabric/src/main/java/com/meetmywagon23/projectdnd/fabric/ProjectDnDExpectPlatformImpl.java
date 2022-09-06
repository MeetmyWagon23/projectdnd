package com.meetmywagon23.projectdnd.fabric;

import com.meetmywagon23.projectdnd.ProjectDnDExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ProjectDnDExpectPlatformImpl {
    /**
     * This is our actual method to {@link ProjectDnDExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
