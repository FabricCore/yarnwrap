package yarnwrap.world.gen.feature;
public class FossilFeatureConfig { public net.minecraft.world.gen.feature.FossilFeatureConfig wrapperContained; public FossilFeatureConfig(net.minecraft.world.gen.feature.FossilFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.FossilFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.FossilFeatureConfig.CODEC = value; }

public java.util.List fossilStructures() { return wrapperContained.fossilStructures; }
// public void fossilStructures(java.util.List value) { wrapperContained.fossilStructures = value; }
// public static java.util.List fossilStructures() { return net.minecraft.world.gen.feature.FossilFeatureConfig.fossilStructures; }
// public static void fossilStructures(java.util.List value, ) { net.minecraft.world.gen.feature.FossilFeatureConfig.fossilStructures = value; }

public java.util.List overlayStructures() { return wrapperContained.overlayStructures; }
// public void overlayStructures(java.util.List value) { wrapperContained.overlayStructures = value; }
// public static java.util.List overlayStructures() { return net.minecraft.world.gen.feature.FossilFeatureConfig.overlayStructures; }
// public static void overlayStructures(java.util.List value, ) { net.minecraft.world.gen.feature.FossilFeatureConfig.overlayStructures = value; }

public yarnwrap.registry.entry.RegistryEntry fossilProcessors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.fossilProcessors); }
// public void fossilProcessors(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.fossilProcessors = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry fossilProcessors() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.FossilFeatureConfig.fossilProcessors); }
// public static void fossilProcessors(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.gen.feature.FossilFeatureConfig.fossilProcessors = value.wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry overlayProcessors() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.overlayProcessors); }
// public void overlayProcessors(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.overlayProcessors = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry overlayProcessors() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.FossilFeatureConfig.overlayProcessors); }
// public static void overlayProcessors(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.gen.feature.FossilFeatureConfig.overlayProcessors = value.wrapperContained; }

public int maxEmptyCorners() { return wrapperContained.maxEmptyCorners; }
// public void maxEmptyCorners(int value) { wrapperContained.maxEmptyCorners = value; }
// public static int maxEmptyCorners() { return net.minecraft.world.gen.feature.FossilFeatureConfig.maxEmptyCorners; }
// public static void maxEmptyCorners(int value, ) { net.minecraft.world.gen.feature.FossilFeatureConfig.maxEmptyCorners = value; }

public FossilFeatureConfig(java.util.List fossilStructures,java.util.List overlayStructures,yarnwrap.registry.entry.RegistryEntry fossilProcessors,yarnwrap.registry.entry.RegistryEntry overlayProcessors,int maxEmptyCorners) { this.wrapperContained = new net.minecraft.world.gen.feature.FossilFeatureConfig(fossilStructures,overlayStructures,fossilProcessors.wrapperContained,overlayProcessors.wrapperContained,maxEmptyCorners); }
// public com.mojang.datafixers.kinds.App method_34299(Object instance) { return wrapperContained.method_34299(instance); }
// public static com.mojang.datafixers.kinds.App method_34299(Object instance, ) { return net.minecraft.world.gen.feature.FossilFeatureConfig.method_34299(instance); }
// public java.lang.Integer method_34300(yarnwrap.world.gen.feature.FossilFeatureConfig config) { return wrapperContained.method_34300(config.wrapperContained); }
// public static java.lang.Integer method_34300(yarnwrap.world.gen.feature.FossilFeatureConfig config, ) { return net.minecraft.world.gen.feature.FossilFeatureConfig.method_34300(config.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_34302(yarnwrap.world.gen.feature.FossilFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_34302(config.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_34302(yarnwrap.world.gen.feature.FossilFeatureConfig config, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.FossilFeatureConfig.method_34302(config.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry method_34304(yarnwrap.world.gen.feature.FossilFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_34304(config.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_34304(yarnwrap.world.gen.feature.FossilFeatureConfig config, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.FossilFeatureConfig.method_34304(config.wrapperContained)); }
// public java.util.List method_34305(yarnwrap.world.gen.feature.FossilFeatureConfig config) { return wrapperContained.method_34305(config.wrapperContained); }
// public static java.util.List method_34305(yarnwrap.world.gen.feature.FossilFeatureConfig config, ) { return net.minecraft.world.gen.feature.FossilFeatureConfig.method_34305(config.wrapperContained); }
// public java.util.List method_34306(yarnwrap.world.gen.feature.FossilFeatureConfig config) { return wrapperContained.method_34306(config.wrapperContained); }
// public static java.util.List method_34306(yarnwrap.world.gen.feature.FossilFeatureConfig config, ) { return net.minecraft.world.gen.feature.FossilFeatureConfig.method_34306(config.wrapperContained); }

}