package com.meetmywagon23.projectrpg.forge;

import com.meetmywagon23.projectrpg.ProjectRPGExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ProjectRPGExpectPlatformImpl {
    /**
     * This is our actual method to {@link ProjectRPGExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
