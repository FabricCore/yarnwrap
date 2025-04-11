package yarnwrap.item.trim;
public class ArmorTrimPatterns { public net.minecraft.item.trim.ArmorTrimPatterns wrapperContained; public ArmorTrimPatterns(net.minecraft.item.trim.ArmorTrimPatterns wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_48447(yarnwrap.item.ItemStack pattern) { return wrapperContained.method_48447(pattern.wrapperContained); }
// public java.util.Optional get(Object registriesLookup,yarnwrap.item.ItemStack stack) { return wrapperContained.get(registriesLookup,stack.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
public void register(yarnwrap.registry.Registerable registry,yarnwrap.item.Item template,yarnwrap.registry.RegistryKey key) { wrapperContained.register(registry.wrapperContained,template.wrapperContained,key.wrapperContained); }

}