package yarnwrap.registry;
public class TradeRebalanceBuiltinRegistries { public net.minecraft.registry.TradeRebalanceBuiltinRegistries wrapperContained; public TradeRebalanceBuiltinRegistries(net.minecraft.registry.TradeRebalanceBuiltinRegistries wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryBuilder REGISTRY_BUILDER() { return new yarnwrap.registry.RegistryBuilder(wrapperContained.REGISTRY_BUILDER); }
public java.util.concurrent.CompletableFuture validate(java.util.concurrent.CompletableFuture registryLookupFuture) { return wrapperContained.validate(registryLookupFuture); }

}