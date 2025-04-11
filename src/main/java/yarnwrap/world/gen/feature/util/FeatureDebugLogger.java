package yarnwrap.world.gen.feature.util;
public class FeatureDebugLogger { public net.minecraft.world.gen.feature.util.FeatureDebugLogger wrapperContained; public FeatureDebugLogger(net.minecraft.world.gen.feature.util.FeatureDebugLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.common.cache.LoadingCache FEATURES() { return wrapperContained.FEATURES; }
// public void FEATURES(com.google.common.cache.LoadingCache value) { wrapperContained.FEATURES = value; }
public void clear() { wrapperContained.clear(); }
public void incrementTotalChunksCount(yarnwrap.server.world.ServerWorld world) { wrapperContained.incrementTotalChunksCount(world.wrapperContained); }
public void incrementFeatureCount(yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.feature.ConfiguredFeature configuredFeature,java.util.Optional placedFeature) { wrapperContained.incrementFeatureCount(world.wrapperContained,configuredFeature.wrapperContained,placedFeature); }
// public void method_39600(yarnwrap.server.world.ServerWorld world,Object features) { wrapperContained.method_39600(world.wrapperContained,features); }
// public java.lang.Integer method_39601(Object featureData,java.lang.Integer count) { return wrapperContained.method_39601(featureData,count); }
// public void method_39602(java.lang.String featureData,java.lang.Integer count) { wrapperContained.method_39602(featureData,count); }
public void dump() { wrapperContained.dump(); }

}