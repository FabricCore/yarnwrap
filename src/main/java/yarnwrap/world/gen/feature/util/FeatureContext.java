package yarnwrap.world.gen.feature.util;
public class FeatureContext { public net.minecraft.world.gen.feature.util.FeatureContext wrapperContained; public FeatureContext(net.minecraft.world.gen.feature.util.FeatureContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.StructureWorldAccess world() { return new yarnwrap.world.StructureWorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.StructureWorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.ChunkGenerator generator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.generator); }
// public void generator(yarnwrap.world.gen.chunk.ChunkGenerator value) { wrapperContained.generator = value.wrapperContained; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos origin() { return new yarnwrap.util.math.BlockPos(wrapperContained.origin); }
// public void origin(yarnwrap.util.math.BlockPos value) { wrapperContained.origin = value.wrapperContained; }
// public yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.feature.FeatureConfig value) { wrapperContained.config = value.wrapperContained; }
// public java.util.Optional feature() { return wrapperContained.feature; }
// public void feature(java.util.Optional value) { wrapperContained.feature = value; }
public yarnwrap.world.StructureWorldAccess getWorld() { return new yarnwrap.world.StructureWorldAccess(wrapperContained.getWorld()); }
public yarnwrap.world.gen.chunk.ChunkGenerator getGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getGenerator()); }
public yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom()); }
public yarnwrap.util.math.BlockPos getOrigin() { return new yarnwrap.util.math.BlockPos(wrapperContained.getOrigin()); }
public yarnwrap.world.gen.feature.FeatureConfig getConfig() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.getConfig()); }
public java.util.Optional getFeature() { return wrapperContained.getFeature(); }

}