package yarnwrap.network;
public class RegistryByteBuf { public net.minecraft.network.RegistryByteBuf wrapperContained; public RegistryByteBuf(net.minecraft.network.RegistryByteBuf wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.registryManager); }
// public void registryManager(yarnwrap.registry.DynamicRegistryManager value) { wrapperContained.registryManager = value.wrapperContained; }
// public static yarnwrap.registry.DynamicRegistryManager registryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.network.RegistryByteBuf.registryManager); }
// public static void registryManager(yarnwrap.registry.DynamicRegistryManager value, ) { net.minecraft.network.RegistryByteBuf.registryManager = value.wrapperContained; }

public RegistryByteBuf(io.netty.buffer.ByteBuf buf,yarnwrap.registry.DynamicRegistryManager registryManager) { this.wrapperContained = new net.minecraft.network.RegistryByteBuf(buf,registryManager.wrapperContained); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
// public static yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.network.RegistryByteBuf.getRegistryManager()); }
// public java.util.function.Function makeFactory(yarnwrap.registry.DynamicRegistryManager registryManager) { return wrapperContained.makeFactory(registryManager.wrapperContained); }
// public static java.util.function.Function makeFactory(yarnwrap.registry.DynamicRegistryManager registryManager, ) { return net.minecraft.network.RegistryByteBuf.makeFactory(registryManager.wrapperContained); }
// public yarnwrap.network.RegistryByteBuf method_56351(yarnwrap.registry.DynamicRegistryManager buf) { return new yarnwrap.network.RegistryByteBuf(wrapperContained.method_56351(buf.wrapperContained)); }
// public static yarnwrap.network.RegistryByteBuf method_56351(yarnwrap.registry.DynamicRegistryManager buf, ) { return new yarnwrap.network.RegistryByteBuf(net.minecraft.network.RegistryByteBuf.method_56351(buf.wrapperContained)); }

}