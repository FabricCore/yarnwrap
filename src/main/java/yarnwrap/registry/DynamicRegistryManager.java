package yarnwrap.registry;
public class DynamicRegistryManager { public net.minecraft.registry.DynamicRegistryManager wrapperContained; public DynamicRegistryManager(net.minecraft.registry.DynamicRegistryManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.registry.DynamicRegistryManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.registry.DynamicRegistryManager.LOGGER = value; }

// public Object EMPTY() { return wrapperContained.EMPTY; }
// // public void EMPTY(Object value) { wrapperContained.EMPTY = value; }
// public static Object EMPTY() { return net.minecraft.registry.DynamicRegistryManager.EMPTY; }
// // public static void EMPTY(Object value, ) { net.minecraft.registry.DynamicRegistryManager.EMPTY = value; }

// public yarnwrap.registry.Registry get(yarnwrap.registry.RegistryKey key) { return new yarnwrap.registry.Registry(wrapperContained.get(key.wrapperContained)); }
// public static yarnwrap.registry.Registry get(yarnwrap.registry.RegistryKey key, ) { return new yarnwrap.registry.Registry(net.minecraft.registry.DynamicRegistryManager.get(key.wrapperContained)); }
// public Object of(yarnwrap.registry.Registry registries) { return wrapperContained.of(registries.wrapperContained); }
// public static Object of(yarnwrap.registry.Registry registries, ) { return net.minecraft.registry.DynamicRegistryManager.of(registries.wrapperContained); }
public java.util.stream.Stream streamAllRegistries() { return wrapperContained.streamAllRegistries(); }
// public static java.util.stream.Stream streamAllRegistries() { return net.minecraft.registry.DynamicRegistryManager.streamAllRegistries(); }
public Object toImmutable() { return wrapperContained.toImmutable(); }
// public static Object toImmutable() { return net.minecraft.registry.DynamicRegistryManager.toImmutable(); }
// public yarnwrap.registry.RegistryKey method_62703(Object registry) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_62703(registry)); }
// public static yarnwrap.registry.RegistryKey method_62703(Object registry, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.registry.DynamicRegistryManager.method_62703(registry)); }

}