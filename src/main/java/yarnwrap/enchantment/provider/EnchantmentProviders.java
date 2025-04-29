package yarnwrap.enchantment.provider;
public class EnchantmentProviders { public net.minecraft.enchantment.provider.EnchantmentProviders wrapperContained; public EnchantmentProviders(net.minecraft.enchantment.provider.EnchantmentProviders wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.enchantment.provider.EnchantmentProviders.of(id)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.enchantment.provider.EnchantmentProviders.bootstrap(registry.wrapperContained); }

}