package yarnwrap.world.gen.feature;
public class BasaltColumnsFeatureConfig { public net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig wrapperContained; public BasaltColumnsFeatureConfig(net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.CODEC = value; }

// public yarnwrap.util.math.intprovider.IntProvider reach() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.reach); }
// public void reach(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.reach = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider reach() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.reach); }
// public static void reach(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.reach = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.height); }
// public void height(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.height = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.height); }
// public static void height(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.height = value.wrapperContained; }

public BasaltColumnsFeatureConfig(yarnwrap.util.math.intprovider.IntProvider reach,yarnwrap.util.math.intprovider.IntProvider height) { this.wrapperContained = new net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig(reach.wrapperContained,height.wrapperContained); }
public yarnwrap.util.math.intprovider.IntProvider getReach() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getReach()); }
// public static yarnwrap.util.math.intprovider.IntProvider getReach() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.getReach()); }
// public yarnwrap.util.math.intprovider.IntProvider method_30392(yarnwrap.world.gen.feature.BasaltColumnsFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_30392(config.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_30392(yarnwrap.world.gen.feature.BasaltColumnsFeatureConfig config, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.method_30392(config.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_30393(Object instance) { return wrapperContained.method_30393(instance); }
// public static com.mojang.datafixers.kinds.App method_30393(Object instance, ) { return net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.method_30393(instance); }
public yarnwrap.util.math.intprovider.IntProvider getHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getHeight()); }
// public static yarnwrap.util.math.intprovider.IntProvider getHeight() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.getHeight()); }
// public yarnwrap.util.math.intprovider.IntProvider method_30395(yarnwrap.world.gen.feature.BasaltColumnsFeatureConfig config) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_30395(config.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_30395(yarnwrap.world.gen.feature.BasaltColumnsFeatureConfig config, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.BasaltColumnsFeatureConfig.method_30395(config.wrapperContained)); }

}