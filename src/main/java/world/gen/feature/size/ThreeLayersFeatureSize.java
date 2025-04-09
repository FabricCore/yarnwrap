package yarnwrap.world.gen.feature.size;
public class ThreeLayersFeatureSize { public net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize wrapperContained; public ThreeLayersFeatureSize(net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize wrapperContained) { this.wrapperContained = wrapperContained; }

// public int limit() { return wrapperContained.limit; }
// public int upperLimit() { return wrapperContained.upperLimit; }
// public int lowerSize() { return wrapperContained.lowerSize; }
// public int middleSize() { return wrapperContained.middleSize; }
// public int upperSize() { return wrapperContained.upperSize; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}