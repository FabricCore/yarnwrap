package yarnwrap.world.gen.feature.size;
public class TwoLayersFeatureSize { public net.minecraft.world.gen.feature.size.TwoLayersFeatureSize wrapperContained; public TwoLayersFeatureSize(net.minecraft.world.gen.feature.size.TwoLayersFeatureSize wrapperContained) { this.wrapperContained = wrapperContained; }

// public int limit() { return wrapperContained.limit; }
// public int lowerSize() { return wrapperContained.lowerSize; }
// public int upperSize() { return wrapperContained.upperSize; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}