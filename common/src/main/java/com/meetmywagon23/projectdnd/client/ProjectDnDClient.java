package com.meetmywagon23.projectdnd.client;

import com.meetmywagon23.projectdnd.ProjectDnD;
import com.meetmywagon23.projectdnd.init.ItemsInit;
import com.meetmywagon23.projectdnd.mixin.ModelPredicateProviderRegistryInvoker;
import dev.architectury.platform.Platform;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.Identifier;

public class ProjectDnDClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        if (Platform.isFabric()) {
            ModelPredicateProviderRegistryInvoker.invokeRegister(ItemsInit.COPPER_COIN.get(),
                    new Identifier(ProjectDnD.MOD_ID, "amount"),
                    ((stack, world, entity, seed) -> stack.getCount()));
        }
    }
}
