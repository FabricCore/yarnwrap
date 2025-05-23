package yarnwrap.registry;
public class RegistryKeyedValue { public net.minecraft.registry.RegistryKeyedValue wrapperContained; public RegistryKeyedValue(net.minecraft.registry.RegistryKeyedValue wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKeyedValue fixed(java.lang.Object value) { return new yarnwrap.registry.RegistryKeyedValue(wrapperContained.fixed(value)); }
// public static yarnwrap.registry.RegistryKeyedValue fixed(java.lang.Object value, ) { return new yarnwrap.registry.RegistryKeyedValue(net.minecraft.registry.RegistryKeyedValue.fixed(value)); }
public java.lang.Object get(yarnwrap.registry.RegistryKey registryKey) { return wrapperContained.get(registryKey.wrapperContained); }
// public static java.lang.Object get(yarnwrap.registry.RegistryKey registryKey, ) { return net.minecraft.registry.RegistryKeyedValue.get(registryKey.wrapperContained); }
// public java.lang.Object method_62992(java.lang.Object registryKey) { return wrapperContained.method_62992(registryKey); }
// public static java.lang.Object method_62992(java.lang.Object registryKey, ) { return net.minecraft.registry.RegistryKeyedValue.method_62992(registryKey); }

}