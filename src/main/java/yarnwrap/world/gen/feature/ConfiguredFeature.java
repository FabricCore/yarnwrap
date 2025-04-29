package yarnwrap.world.gen.feature;
public class ConfiguredFeature { public net.minecraft.world.gen.feature.ConfiguredFeature wrapperContained; public ConfiguredFeature(net.minecraft.world.gen.feature.ConfiguredFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.feature.Feature feature() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.feature); }
// public void feature(yarnwrap.world.gen.feature.Feature value) { wrapperContained.feature = value.wrapperContained; }
// public static yarnwrap.world.gen.feature.Feature feature() { return new yarnwrap.world.gen.feature.Feature(net.minecraft.world.gen.feature.ConfiguredFeature.feature); }
// public static void feature(yarnwrap.world.gen.feature.Feature value, ) { net.minecraft.world.gen.feature.ConfiguredFeature.feature = value.wrapperContained; }

// public yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.feature.FeatureConfig value) { wrapperContained.config = value.wrapperContained; }
// public static yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(net.minecraft.world.gen.feature.ConfiguredFeature.config); }
// public static void config(yarnwrap.world.gen.feature.FeatureConfig value, ) { net.minecraft.world.gen.feature.ConfiguredFeature.config = value.wrapperContained; }

// public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public static com.mojang.serialization.Codec REGISTRY_CODEC() { return net.minecraft.world.gen.feature.ConfiguredFeature.REGISTRY_CODEC; }
// public static void REGISTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.ConfiguredFeature.REGISTRY_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.ConfiguredFeature.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.ConfiguredFeature.CODEC = value; }

// public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public void LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIST_CODEC = value; }
public static com.mojang.serialization.Codec LIST_CODEC() { return net.minecraft.world.gen.feature.ConfiguredFeature.LIST_CODEC; }
// public static void LIST_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.ConfiguredFeature.LIST_CODEC = value; }

public ConfiguredFeature(yarnwrap.world.gen.feature.Feature feature,yarnwrap.world.gen.feature.FeatureConfig config) { this.wrapperContained = new net.minecraft.world.gen.feature.ConfiguredFeature(feature.wrapperContained,config.wrapperContained); }
// public yarnwrap.world.gen.feature.Feature feature() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.feature()); }
// // public static yarnwrap.world.gen.feature.Feature feature() { return new yarnwrap.world.gen.feature.Feature(net.minecraft.world.gen.feature.ConfiguredFeature.feature()); }
// public yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.config()); }
// // public static yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(net.minecraft.world.gen.feature.ConfiguredFeature.config()); }
public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos origin) { return wrapperContained.generate(world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,origin.wrapperContained); }
// public static boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos origin, ) { return net.minecraft.world.gen.feature.ConfiguredFeature.generate(world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,origin.wrapperContained); }
// public yarnwrap.world.gen.feature.Feature method_28621(yarnwrap.world.gen.feature.ConfiguredFeature configuredFeature) { return new yarnwrap.world.gen.feature.Feature(wrapperContained.method_28621(configuredFeature.wrapperContained)); }
// public static yarnwrap.world.gen.feature.Feature method_28621(yarnwrap.world.gen.feature.ConfiguredFeature configuredFeature, ) { return new yarnwrap.world.gen.feature.Feature(net.minecraft.world.gen.feature.ConfiguredFeature.method_28621(configuredFeature.wrapperContained)); }
public java.util.stream.Stream getDecoratedFeatures() { return wrapperContained.getDecoratedFeatures(); }
// public static java.util.stream.Stream getDecoratedFeatures() { return net.minecraft.world.gen.feature.ConfiguredFeature.getDecoratedFeatures(); }

}