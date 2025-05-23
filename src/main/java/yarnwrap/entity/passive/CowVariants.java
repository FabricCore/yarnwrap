package yarnwrap.entity.passive;
public class CowVariants { public net.minecraft.entity.passive.CowVariants wrapperContained; public CowVariants(net.minecraft.entity.passive.CowVariants wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.RegistryKey TEMPERATE() { return new yarnwrap.registry.RegistryKey(wrapperContained.TEMPERATE); }
// public void TEMPERATE(yarnwrap.registry.RegistryKey value) { wrapperContained.TEMPERATE = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey TEMPERATE() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.CowVariants.TEMPERATE); }
// public static void TEMPERATE(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.CowVariants.TEMPERATE = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey WARM() { return new yarnwrap.registry.RegistryKey(wrapperContained.WARM); }
// public void WARM(yarnwrap.registry.RegistryKey value) { wrapperContained.WARM = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey WARM() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.CowVariants.WARM); }
// public static void WARM(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.CowVariants.WARM = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey COLD() { return new yarnwrap.registry.RegistryKey(wrapperContained.COLD); }
// public void COLD(yarnwrap.registry.RegistryKey value) { wrapperContained.COLD = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey COLD() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.CowVariants.COLD); }
// public static void COLD(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.CowVariants.COLD = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.registry.RegistryKey value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.registry.RegistryKey DEFAULT() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.CowVariants.DEFAULT); }
// public static void DEFAULT(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.passive.CowVariants.DEFAULT = value.wrapperContained; }

// public yarnwrap.registry.RegistryKey of(yarnwrap.util.Identifier id) { return new yarnwrap.registry.RegistryKey(wrapperContained.of(id.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey of(yarnwrap.util.Identifier id, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.CowVariants.of(id.wrapperContained)); }
// public void bootstrap(yarnwrap.registry.Registerable registry) { wrapperContained.bootstrap(registry.wrapperContained); }
// public static void bootstrap(yarnwrap.registry.Registerable registry, ) { net.minecraft.entity.passive.CowVariants.bootstrap(registry.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,Object model,java.lang.String textureName,yarnwrap.registry.tag.TagKey biomes) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,model,textureName,biomes.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,Object model,java.lang.String textureName,yarnwrap.registry.tag.TagKey biomes, ) { net.minecraft.entity.passive.CowVariants.register(registry.wrapperContained,key.wrapperContained,model,textureName,biomes.wrapperContained); }
// public void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,Object model,java.lang.String textureName,yarnwrap.entity.spawn.SpawnConditionSelectors spawnConditions) { wrapperContained.register(registry.wrapperContained,key.wrapperContained,model,textureName,spawnConditions.wrapperContained); }
// public static void register(yarnwrap.registry.Registerable registry,yarnwrap.registry.RegistryKey key,Object model,java.lang.String textureName,yarnwrap.entity.spawn.SpawnConditionSelectors spawnConditions, ) { net.minecraft.entity.passive.CowVariants.register(registry.wrapperContained,key.wrapperContained,model,textureName,spawnConditions.wrapperContained); }

}