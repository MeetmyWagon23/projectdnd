package com.meetmywagon23.projectdnd.forge;

import com.meetmywagon23.projectdnd.ProjectDnDExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ProjectDnDExpectPlatformImpl {
    /**
     * This is our actual method to {@link ProjectDnDExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
