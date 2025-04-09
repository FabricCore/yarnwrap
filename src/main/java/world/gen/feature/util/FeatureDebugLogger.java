package yarnwrap.world.gen.feature.util;
public class FeatureDebugLogger { public net.minecraft.world.gen.feature.util.FeatureDebugLogger wrapperContained; public FeatureDebugLogger(net.minecraft.world.gen.feature.util.FeatureDebugLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.common.cache.LoadingCache FEATURES() { return wrapperContained.FEATURES; }
public void clear() { wrapperContained.clear(); }
public void incrementTotalChunksCount(yarnwrap.server.world.ServerWorld world) { wrapperContained.incrementTotalChunksCount(world.wrapperContained); }
public void incrementFeatureCount(yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.feature.ConfiguredFeature configuredFeature,java.util.Optional placedFeature) { wrapperContained.incrementFeatureCount(world.wrapperContained,configuredFeature.wrapperContained,placedFeature); }
public void dump() { wrapperContained.dump(); }

}