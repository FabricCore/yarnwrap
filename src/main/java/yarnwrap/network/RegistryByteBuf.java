package yarnwrap.network;
public class RegistryByteBuf { public net.minecraft.network.RegistryByteBuf wrapperContained; public RegistryByteBuf(net.minecraft.network.RegistryByteBuf wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
public java.util.function.Function makeFactory(yarnwrap.registry.DynamicRegistryManager registryManager) { return wrapperContained.makeFactory(registryManager.wrapperContained); }

}