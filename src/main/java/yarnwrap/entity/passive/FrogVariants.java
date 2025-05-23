package yarnwrap.entity.passive;
public class FrogVariants { public net.minecraft.entity.passive.FrogVariants wrapperContained; public FrogVariants(net.minecraft.entity.passive.FrogVariants wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey TEMPERATE() { return new yarnwrap.registry.RegistryKey(wrapperContained.TEMPERATE); }
// public void TEMPERATE(yarnwrap.registry.RegistryKey value) { wrapperContained.TEMPERATE = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey TEMPERATE() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.FrogVariants.TEMPERATE); }
// public static void TEMPERATE(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.FrogVariants.TEMPERATE = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey WARM() { return new yarnwrap.registry.RegistryKey(wrapperContained.WARM); }
// public void WARM(yarnwrap.registry.RegistryKey value) { wrapperContained.WARM = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey WARM() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.FrogVariants.WARM); }
// public static void WARM(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.FrogVariants.WARM = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey COLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.COLD); }
// public void COLD(yarnwrap.registry.RegistryKey value) { wrapperContained.COLD = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey COLD() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.FrogVariants.COLD); }
// public static void COLD(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.FrogVariants.COLD = value.wrapperContained; }

// // public yarnwrap.registry.RegistryKey of(yarnwrap.util.Identifier id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey of(yarnwrap.util.Identifier id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.FrogVariants.of(id.wrapperContained)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.entity.passive.FrogVariants.bootstrap(registry.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String assetId,yarnwrap.registry.tag.TagKey requiredBiomes) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,assetId,requiredBiomes.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String assetId,yarnwrap.registry.tag.TagKey requiredBiomes, ) { net.minecraft.entity.passive.FrogVariants.register(registry.wrapperContained,key.wrapperContained,assetId,requiredBiomes.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String assetId,yarnwrap.entity.spawn.SpawnConditionSelectors spawnConditions) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,assetId,spawnConditions.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,java.lang.String assetId,yarnwrap.entity.spawn.SpawnConditionSelectors spawnConditions, ) { net.minecraft.entity.passive.FrogVariants.register(registry.wrapperContained,key.wrapperContained,assetId,spawnConditions.wrapperContained); }

}