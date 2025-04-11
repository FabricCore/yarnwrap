package yarnwrap.world.gen.feature.size;
public class TwoLayersFeatureSize { public net.minecraft.world.gen.feature.size.TwoLayersFeatureSize wrapperContained; public TwoLayersFeatureSize(net.minecraft.world.gen.feature.size.TwoLayersFeatureSize wrapperContained) { this.wrapperContained = wrapperContained; }

// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
// public int lowerSize() { return wrapperContained.lowerSize; }
// public void lowerSize(int value) { wrapperContained.lowerSize = value; }
// public int upperSize() { return wrapperContained.upperSize; }
// public void upperSize(int value) { wrapperContained.upperSize = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}