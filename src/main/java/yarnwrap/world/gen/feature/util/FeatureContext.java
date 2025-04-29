package yarnwrap.world.gen.feature.util;
public class FeatureContext { public net.minecraft.world.gen.feature.util.FeatureContext wrapperContained; public FeatureContext(net.minecraft.world.gen.feature.util.FeatureContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.StructureWorldAccess world() { return new yarnwrap.world.StructureWorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.StructureWorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.StructureWorldAccess world() { return new yarnwrap.world.StructureWorldAccess(net.minecraft.world.gen.feature.util.FeatureContext.world); }
// public static void world(yarnwrap.world.StructureWorldAccess value, ) { net.minecraft.world.gen.feature.util.FeatureContext.world = value.wrapperContained; }

// public yarnwrap.world.gen.chunk.ChunkGenerator generator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.generator); }
// public void generator(yarnwrap.world.gen.chunk.ChunkGenerator value) { wrapperContained.generator = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.ChunkGenerator generator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.world.gen.feature.util.FeatureContext.generator); }
// public static void generator(yarnwrap.world.gen.chunk.ChunkGenerator value, ) { net.minecraft.world.gen.feature.util.FeatureContext.generator = value.wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.world.gen.feature.util.FeatureContext.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.world.gen.feature.util.FeatureContext.random = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos origin() { return new yarnwrap.util.math.BlockPos(wrapperContained.origin); }
// public void origin(yarnwrap.util.math.BlockPos value) { wrapperContained.origin = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos origin() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.feature.util.FeatureContext.origin); }
// public static void origin(yarnwrap.util.math.BlockPos value, ) { net.minecraft.world.gen.feature.util.FeatureContext.origin = value.wrapperContained; }

// public yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.feature.FeatureConfig value) { wrapperContained.config = value.wrapperContained; }
// public static yarnwrap.world.gen.feature.FeatureConfig config() { return new yarnwrap.world.gen.feature.FeatureConfig(net.minecraft.world.gen.feature.util.FeatureContext.config); }
// public static void config(yarnwrap.world.gen.feature.FeatureConfig value, ) { net.minecraft.world.gen.feature.util.FeatureContext.config = value.wrapperContained; }

// public java.util.Optional feature() { return wrapperContained.feature; }
// public void feature(java.util.Optional value) { wrapperContained.feature = value; }
// public static java.util.Optional feature() { return net.minecraft.world.gen.feature.util.FeatureContext.feature; }
// public static void feature(java.util.Optional value, ) { net.minecraft.world.gen.feature.util.FeatureContext.feature = value; }

public FeatureContext(java.util.Optional feature,yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator generator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos origin,yarnwrap.world.gen.feature.FeatureConfig config) { this.wrapperContained = new net.minecraft.world.gen.feature.util.FeatureContext(feature,world.wrapperContained,generator.wrapperContained,random.wrapperContained,origin.wrapperContained,config.wrapperContained); }
public yarnwrap.world.StructureWorldAccess getWorld() { return new yarnwrap.world.StructureWorldAccess(wrapperContained.getWorld()); }
// public static yarnwrap.world.StructureWorldAccess getWorld() { return new yarnwrap.world.StructureWorldAccess(net.minecraft.world.gen.feature.util.FeatureContext.getWorld()); }
public yarnwrap.world.gen.chunk.ChunkGenerator getGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(wrapperContained.getGenerator()); }
// public static yarnwrap.world.gen.chunk.ChunkGenerator getGenerator() { return new yarnwrap.world.gen.chunk.ChunkGenerator(net.minecraft.world.gen.feature.util.FeatureContext.getGenerator()); }
public yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.getRandom()); }
// public static yarnwrap.util.math.random.Random getRandom() { return new yarnwrap.util.math.random.Random(net.minecraft.world.gen.feature.util.FeatureContext.getRandom()); }
public yarnwrap.util.math.BlockPos getOrigin() { return new yarnwrap.util.math.BlockPos(wrapperContained.getOrigin()); }
// public static yarnwrap.util.math.BlockPos getOrigin() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.gen.feature.util.FeatureContext.getOrigin()); }
public yarnwrap.world.gen.feature.FeatureConfig getConfig() { return new yarnwrap.world.gen.feature.FeatureConfig(wrapperContained.getConfig()); }
// public static yarnwrap.world.gen.feature.FeatureConfig getConfig() { return new yarnwrap.world.gen.feature.FeatureConfig(net.minecraft.world.gen.feature.util.FeatureContext.getConfig()); }
public java.util.Optional getFeature() { return wrapperContained.getFeature(); }
// public static java.util.Optional getFeature() { return net.minecraft.world.gen.feature.util.FeatureContext.getFeature(); }

}