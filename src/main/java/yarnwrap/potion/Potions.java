package yarnwrap.potion;
public class Potions { public net.minecraft.potion.Potions wrapperContained; public Potions(net.minecraft.potion.Potions wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String name,yarnwrap.potion.Potion potion) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(name,potion.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry register(java.lang.String name,yarnwrap.potion.Potion potion, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.potion.Potions.register(name,potion.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.potion.Potions.registerAndGetDefault(registry.wrapperContained)); }

}