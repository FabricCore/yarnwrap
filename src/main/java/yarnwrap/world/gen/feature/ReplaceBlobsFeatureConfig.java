package yarnwrap.world.gen.feature;
public class ReplaceBlobsFeatureConfig { public net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig wrapperContained; public ReplaceBlobsFeatureConfig(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.CODEC = value; }

public yarnwrap.block.BlockState target() { return new yarnwrap.block.BlockState(wrapperContained.target); }
// public void target(yarnwrap.block.BlockState value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.block.BlockState target() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.target); }
// public static void target(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.target = value.wrapperContained; }

public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.state); }
// public static void state(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.state = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.radius); }
// public void radius(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.radius = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider radius() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.radius); }
// public static void radius(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.radius = value.wrapperContained; }

public ReplaceBlobsFeatureConfig(yarnwrap.block.BlockState target,yarnwrap.block.BlockState state,yarnwrap.util.math.intprovider.IntProvider radius) { this.wrapperContained = new net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig(target.wrapperContained,state.wrapperContained,radius.wrapperContained); }
public yarnwrap.util.math.intprovider.IntProvider getRadius() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getRadius()); }
// public static yarnwrap.util.math.intprovider.IntProvider getRadius() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.getRadius()); }
// public com.mojang.datafixers.kinds.App method_30406(Object instance) { return wrapperContained.method_30406(instance); }
// public static com.mojang.datafixers.kinds.App method_30406(Object instance, ) { return net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.method_30406(instance); }
// public yarnwrap.util.math.intprovider.IntProvider method_30407(yarnwrap.world.gen.feature.ReplaceBlobsFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_30407(config.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_30407(yarnwrap.world.gen.feature.ReplaceBlobsFeatureConfig config, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.method_30407(config.wrapperContained)); }
// public yarnwrap.block.BlockState method_30408(yarnwrap.world.gen.feature.ReplaceBlobsFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_30408(config.wrapperContained)); }
// public static yarnwrap.block.BlockState method_30408(yarnwrap.world.gen.feature.ReplaceBlobsFeatureConfig config, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.method_30408(config.wrapperContained)); }
// public yarnwrap.block.BlockState method_30409(yarnwrap.world.gen.feature.ReplaceBlobsFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_30409(config.wrapperContained)); }
// public static yarnwrap.block.BlockState method_30409(yarnwrap.world.gen.feature.ReplaceBlobsFeatureConfig config, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.ReplaceBlobsFeatureConfig.method_30409(config.wrapperContained)); }

}