package yarnwrap.entity.passive;
public class WolfVariants { public net.minecraft.entity.passive.WolfVariants wrapperContained; public WolfVariants(net.minecraft.entity.passive.WolfVariants wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.registry.RegistryKey value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.WolfVariants.DEFAULT); }
// public static void DEFAULT(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.WolfVariants.DEFAULT = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey of(java.lang.String id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id)); }
// public static yarnwrap.registry.RegistryKey of(java.lang.String id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.WolfVariants.of(id)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.entity.passive.WolfVariants.bootstrap(registry.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.RegistryKey biome) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,textureName,biome.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.RegistryKey biome, ) { net.minecraft.entity.passive.WolfVariants.register(registry.wrapperContained,key.wrapperContained,textureName,biome.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.tag.TagKey biomeTag) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,textureName,biomeTag.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.registry.tag.TagKey biomeTag, ) { net.minecraft.entity.passive.WolfVariants.register(registry.wrapperContained,key.wrapperContained,textureName,biomeTag.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.entity.spawn.SpawnConditionSelectors spawnConditions) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,textureName,spawnConditions.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String textureName,yarnwrap.entity.spawn.SpawnConditionSelectors spawnConditions, ) { net.minecraft.entity.passive.WolfVariants.register(registry.wrapperContained,key.wrapperContained,textureName,spawnConditions.wrapperContained); }
// public yarnwrap.entity.spawn.SpawnConditionSelectors createSpawnConditions(yarnwrap.registry.entry.RegistryEntryList requiredBiomes) { return new yarnwrap.entity.spawn.SpawnConditionSelectors(wrapperContained.createSpawnConditions(requiredBiomes.wrapperContained)); }
// public static yarnwrap.entity.spawn.SpawnConditionSelectors createSpawnConditions(yarnwrap.registry.entry.RegistryEntryList requiredBiomes, ) { return new yarnwrap.entity.spawn.SpawnConditionSelectors(net.minecraft.entity.passive.WolfVariants.createSpawnConditions(requiredBiomes.wrapperContained)); }

}