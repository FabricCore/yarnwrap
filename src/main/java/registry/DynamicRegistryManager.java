package yarnwrap.registry;
public class DynamicRegistryManager { public net.minecraft.registry.DynamicRegistryManager wrapperContained; public DynamicRegistryManager(net.minecraft.registry.DynamicRegistryManager wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public Object EMPTY() { return wrapperContained.EMPTY; }
public yarnwrap.registry.Registry get(yarnwrap.registry.RegistryKey key) { return new yarnwrap.registry.Registry(wrapperContained.get(key.wrapperContained)); }
public java.util.Optional getOptional(yarnwrap.registry.RegistryKey key) { return wrapperContained.getOptional(key.wrapperContained); }
// public Object of(yarnwrap.registry.Registry registries) { return wrapperContained.of(registries.wrapperContained); }
public java.util.stream.Stream streamAllRegistries() { return wrapperContained.streamAllRegistries(); }
public Object toImmutable() { return wrapperContained.toImmutable(); }
public com.mojang.serialization.Lifecycle getRegistryLifecycle() { return wrapperContained.getRegistryLifecycle(); }

}