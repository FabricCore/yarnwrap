package yarnwrap.enchantment.provider;
public class EnchantmentProviders { public net.minecraft.enchantment.provider.EnchantmentProviders wrapperContained; public EnchantmentProviders(net.minecraft.enchantment.provider.EnchantmentProviders wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }

}