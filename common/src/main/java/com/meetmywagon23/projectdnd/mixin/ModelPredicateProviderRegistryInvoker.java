package com.meetmywagon23.projectdnd.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.item.UnclampedModelPredicateProvider;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin(ModelPredicateProviderRegistry.class)
public interface ModelPredicateProviderRegistryInvoker {
    @Invoker("register")
    public static void invokeRegister(Item item, Identifier id, UnclampedModelPredicateProvider provider) {
        throw new AssertionError();
    }
}
