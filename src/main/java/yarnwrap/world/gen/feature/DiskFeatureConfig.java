package yarnwrap.world.gen.feature;
public class DiskFeatureConfig { public net.minecraft.world.gen.feature.DiskFeatureConfig wrapperContained; public DiskFeatureConfig(net.minecraft.world.gen.feature.DiskFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius); }
// public void radius(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.radius = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.DiskFeatureConfig.radius); }
// public static void radius(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.feature.DiskFeatureConfig.radius = value.wrapperContained; }

// public int halfHeight() { return wrapperContained.halfHeight; }
// public void halfHeight(int value) { wrapperContained.halfHeight = value; }
// public static int halfHeight() { return net.minecraft.world.gen.feature.DiskFeatureConfig.halfHeight; }
// public static void halfHeight(int value, ) { net.minecraft.world.gen.feature.DiskFeatureConfig.halfHeight = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.DiskFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.DiskFeatureConfig.CODEC = value; }

// public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius()); }
// // public static yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.DiskFeatureConfig.radius()); }
// public int halfHeight() { return wrapperContained.halfHeight(); }
// // public static int halfHeight() { return net.minecraft.world.gen.feature.DiskFeatureConfig.halfHeight(); }

}