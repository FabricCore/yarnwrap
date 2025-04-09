package yarnwrap.world.gen.feature;
public class ConfiguredFeature { public net.minecraft.world.gen.feature.ConfiguredFeature wrapperContained; public ConfiguredFeature(net.minecraft.world.gen.feature.ConfiguredFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.feature.Feature feature() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.feature); }
// public yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.config); }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public yarnwrap.world.gen.feature.Feature feature() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.feature()); }
// public yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.config()); }
public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos origin) { return wrapperContained.generate(world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,origin.wrapperContained); }
public java.util.stream.Stream getDecoratedFeatures() { return wrapperContained.getDecoratedFeatures(); }

}