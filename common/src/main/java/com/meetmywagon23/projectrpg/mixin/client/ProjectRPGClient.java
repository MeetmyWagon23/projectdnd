package com.meetmywagon23.projectrpg.mixin.client;

import com.meetmywagon23.projectrpg.ProjectRPG;
import com.meetmywagon23.projectrpg.init.ItemsInit;
import com.meetmywagon23.projectrpg.mixin.ModelPredicateProviderRegistryInvoker;
import dev.architectury.platform.Platform;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.Identifier;

public class ProjectRPGClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        if (Platform.isFabric()) {
            ModelPredicateProviderRegistryInvoker.invokeRegister(ItemsInit.COPPER_COIN.get(),
                    new Identifier(ProjectRPG.MOD_ID, "amount"),
                    ((stack, world, entity, seed) -> stack.getCount()));
        }
    }
}
