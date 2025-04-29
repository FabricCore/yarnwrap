package yarnwrap.enchantment;
public class Enchantments { public net.minecraft.enchantment.Enchantments wrapperContained; public Enchantments(net.minecraft.enchantment.Enchantments wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.enchantment.Enchantments.of(id)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.enchantment.Enchantments.bootstrap(registry.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,Object builder) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,builder); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,Object builder, ) { net.minecraft.enchantment.Enchantments.register(registry.wrapperContained,key.wrapperContained,builder); }

}