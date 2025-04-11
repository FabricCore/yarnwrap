package yarnwrap.world.gen.feature.size;
public class ThreeLayersFeatureSize { public net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize wrapperContained; public ThreeLayersFeatureSize(net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize wrapperContained) { this.wrapperContained = wrapperContained; }

// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
// public int upperLimit() { return wrapperContained.upperLimit; }
// public void upperLimit(int value) { wrapperContained.upperLimit = value; }
// public int lowerSize() { return wrapperContained.lowerSize; }
// public void lowerSize(int value) { wrapperContained.lowerSize = value; }
// public int middleSize() { return wrapperContained.middleSize; }
// public void middleSize(int value) { wrapperContained.middleSize = value; }
// public int upperSize() { return wrapperContained.upperSize; }
// public void upperSize(int value) { wrapperContained.upperSize = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public ThreeLayersFeatureSize(int limit,int upperLimit,int lowerSize,int middleSize,int upperSize,java.util.OptionalInt minClippedHeight) { this.wrapperContained = new net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize(limit,upperLimit,lowerSize,middleSize,upperSize,minClippedHeight); }
// public com.mojang.datafixers.kinds.App method_28827(Object instance) { return wrapperContained.method_28827(instance); }

}