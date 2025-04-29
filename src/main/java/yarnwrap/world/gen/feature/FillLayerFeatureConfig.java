package yarnwrap.world.gen.feature;
public class FillLayerFeatureConfig { public net.minecraft.world.gen.feature.FillLayerFeatureConfig wrapperContained; public FillLayerFeatureConfig(net.minecraft.world.gen.feature.FillLayerFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.world.gen.feature.FillLayerFeatureConfig.height; }
// public static void height(int value, ) { net.minecraft.world.gen.feature.FillLayerFeatureConfig.height = value; }

public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.FillLayerFeatureConfig.state); }
// public static void state(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.FillLayerFeatureConfig.state = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.FillLayerFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.FillLayerFeatureConfig.CODEC = value; }

public FillLayerFeatureConfig(int height,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.world.gen.feature.FillLayerFeatureConfig(height,state.wrapperContained); }
// public yarnwrap.block.BlockState method_28725(yarnwrap.world.gen.feature.FillLayerFeatureConfig config) { return new yarnwrap.block.BlockState(wrapperContained.method_28725(config.wrapperContained)); }
// public static yarnwrap.block.BlockState method_28725(yarnwrap.world.gen.feature.FillLayerFeatureConfig config, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.FillLayerFeatureConfig.method_28725(config.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_28726(Object instance) { return wrapperContained.method_28726(instance); }
// public static com.mojang.datafixers.kinds.App method_28726(Object instance, ) { return net.minecraft.world.gen.feature.FillLayerFeatureConfig.method_28726(instance); }
// public java.lang.Integer method_28727(yarnwrap.world.gen.feature.FillLayerFeatureConfig config) { return wrapperContained.method_28727(config.wrapperContained); }
// public static java.lang.Integer method_28727(yarnwrap.world.gen.feature.FillLayerFeatureConfig config, ) { return net.minecraft.world.gen.feature.FillLayerFeatureConfig.method_28727(config.wrapperContained); }

}