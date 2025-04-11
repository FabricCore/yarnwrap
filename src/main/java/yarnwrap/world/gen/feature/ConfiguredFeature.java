package yarnwrap.world.gen.feature;
public class ConfiguredFeature { public net.minecraft.world.gen.feature.ConfiguredFeature wrapperContained; public ConfiguredFeature(net.minecraft.world.gen.feature.ConfiguredFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.feature.Feature feature() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.feature); }
// public void feature(yarnwrap.world.gen.feature.Feature value) { wrapperContained.feature = value.wrapperContained; }
// public yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.feature.FeatureConfig value) { wrapperContained.config = value.wrapperContained; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public void LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIST_CODEC = value; }
// public yarnwrap.world.gen.feature.Feature feature() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.feature()); }
// public yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.config()); }
public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos origin) { return wrapperContained.generate(world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,origin.wrapperContained); }
public java.util.stream.Stream getDecoratedFeatures() { return wrapperContained.getDecoratedFeatures(); }

}