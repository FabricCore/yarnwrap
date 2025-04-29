package yarnwrap.entity.passive;
public class WolfVariants { public net.minecraft.entity.passive.WolfVariants wrapperContained; public WolfVariants(net.minecraft.entity.passive.WolfVariants wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.registry.RegistryKey value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.WolfVariants.DEFAULT); }
// public static void DEFAULT(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.WolfVariants.DEFAULT = value.wrapperContained; }

// public boolean method_58065(yarnwrap.registry.entry.RegistryEntry entry) { return wrapperContained.method_58065(entry.wrapperContained); }
// public static boolean method_58065(yarnwrap.registry.entry.RegistryEntry entry, ) { return net.minecraft.entity.passive.WolfVariants.method_58065(entry.wrapperContained); }
// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.WolfVariants.of(id)); }
// public yarnwrap.registry.entry.RegistryEntry fromBiome(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.registry.entry.RegistryEntry biome) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.fromBiome(dynamicRegistryManager.wrapperContained,biome.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry fromBiome(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.registry.entry.RegistryEntry biome, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.passive.WolfVariants.fromBiome(dynamicRegistryManager.wrapperContained,biome.wrapperContained)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.entity.passive.WolfVariants.bootstrap(registry.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.RegistryKey biome) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,textureName,biome.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.RegistryKey biome, ) { net.minecraft.entity.passive.WolfVariants.register(registry.wrapperContained,key.wrapperContained,textureName,biome.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.tag.TagKey biomeTag) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,textureName,biomeTag.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.tag.TagKey biomeTag, ) { net.minecraft.entity.passive.WolfVariants.register(registry.wrapperContained,key.wrapperContained,textureName,biomeTag.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.entry.RegistryEntryList biomes) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,textureName,biomes.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.entry.RegistryEntryList biomes, ) { net.minecraft.entity.passive.WolfVariants.register(registry.wrapperContained,key.wrapperContained,textureName,biomes.wrapperContained); }

}