package yarnwrap.world.gen.feature.size;
public class TwoLayersFeatureSize { public net.minecraft.world.gen.feature.size.TwoLayersFeatureSize wrapperContained; public TwoLayersFeatureSize(net.minecraft.world.gen.feature.size.TwoLayersFeatureSize wrapperContained) { this.wrapperContained = wrapperContained; }

// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
// public static int limit() { return net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.limit; }
// public static void limit(int value, ) { net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.limit = value; }

// public int lowerSize() { return wrapperContained.lowerSize; }
// public void lowerSize(int value) { wrapperContained.lowerSize = value; }
// public static int lowerSize() { return net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.lowerSize; }
// public static void lowerSize(int value, ) { net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.lowerSize = value; }

// public int upperSize() { return wrapperContained.upperSize; }
// public void upperSize(int value) { wrapperContained.upperSize = value; }
// public static int upperSize() { return net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.upperSize; }
// public static void upperSize(int value, ) { net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.upperSize = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.CODEC = value; }

public TwoLayersFeatureSize(int limit,int lowerSize,int upperSize) { this.wrapperContained = new net.minecraft.world.gen.feature.size.TwoLayersFeatureSize(limit,lowerSize,upperSize); }
public TwoLayersFeatureSize(int limit,int lowerSize,int upperSize,java.util.OptionalInt minClippedHeight) { this.wrapperContained = new net.minecraft.world.gen.feature.size.TwoLayersFeatureSize(limit,lowerSize,upperSize,minClippedHeight); }
// public com.mojang.datafixers.kinds.App method_28833(Object instance) { return wrapperContained.method_28833(instance); }
// public static com.mojang.datafixers.kinds.App method_28833(Object instance, ) { return net.minecraft.world.gen.feature.size.TwoLayersFeatureSize.method_28833(instance); }

}