package yarnwrap.world.gen.feature;
public class FallenTreeFeatureConfig { public net.minecraft.world.gen.feature.FallenTreeFeatureConfig wrapperContained; public FallenTreeFeatureConfig(net.minecraft.world.gen.feature.FallenTreeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.FallenTreeFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.FallenTreeFeatureConfig.CODEC = value; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider trunkProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.trunkProvider); }
// public void trunkProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.trunkProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider trunkProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.FallenTreeFeatureConfig.trunkProvider); }
// public static void trunkProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.feature.FallenTreeFeatureConfig.trunkProvider = value.wrapperContained; }

public yarnwrap.util.math.intprovider.IntProvider logLength() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.logLength); }
// public void logLength(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.logLength = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider logLength() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.FallenTreeFeatureConfig.logLength); }
// public static void logLength(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.feature.FallenTreeFeatureConfig.logLength = value.wrapperContained; }

public java.util.List stumpDecorators() { return wrapperContained.stumpDecorators; }
// public void stumpDecorators(java.util.List value) { wrapperContained.stumpDecorators = value; }
// public static java.util.List stumpDecorators() { return net.minecraft.world.gen.feature.FallenTreeFeatureConfig.stumpDecorators; }
// public static void stumpDecorators(java.util.List value, ) { net.minecraft.world.gen.feature.FallenTreeFeatureConfig.stumpDecorators = value; }

public java.util.List logDecorators() { return wrapperContained.logDecorators; }
// public void logDecorators(java.util.List value) { wrapperContained.logDecorators = value; }
// public static java.util.List logDecorators() { return net.minecraft.world.gen.feature.FallenTreeFeatureConfig.logDecorators; }
// public static void logDecorators(java.util.List value, ) { net.minecraft.world.gen.feature.FallenTreeFeatureConfig.logDecorators = value; }

// public FallenTreeFeatureConfig(yarnwrap.world.gen.stateprovider.BlockStateProvider trunkProvider,yarnwrap.util.math.intprovider.IntProvider logLength,java.util.List stumpDecorators,java.util.List logDecorators) { this.wrapperContained = new net.minecraft.world.gen.feature.FallenTreeFeatureConfig(trunkProvider.wrapperContained,logLength.wrapperContained,stumpDecorators,logDecorators); }
// public com.mojang.datafixers.kinds.App method_68314(Object instance) { return wrapperContained.method_68314(instance); }
// public static com.mojang.datafixers.kinds.App method_68314(Object instance, ) { return net.minecraft.world.gen.feature.FallenTreeFeatureConfig.method_68314(instance); }
// public java.util.List method_68315(yarnwrap.world.gen.feature.FallenTreeFeatureConfig featureConfig) { return wrapperContained.method_68315(featureConfig.wrapperContained); }
// public static java.util.List method_68315(yarnwrap.world.gen.feature.FallenTreeFeatureConfig featureConfig, ) { return net.minecraft.world.gen.feature.FallenTreeFeatureConfig.method_68315(featureConfig.wrapperContained); }
// public java.util.List method_68316(yarnwrap.world.gen.feature.FallenTreeFeatureConfig featureConfig) { return wrapperContained.method_68316(featureConfig.wrapperContained); }
// public static java.util.List method_68316(yarnwrap.world.gen.feature.FallenTreeFeatureConfig featureConfig, ) { return net.minecraft.world.gen.feature.FallenTreeFeatureConfig.method_68316(featureConfig.wrapperContained); }
// public yarnwrap.util.math.intprovider.IntProvider method_68317(yarnwrap.world.gen.feature.FallenTreeFeatureConfig featureConfig) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_68317(featureConfig.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_68317(yarnwrap.world.gen.feature.FallenTreeFeatureConfig featureConfig, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.feature.FallenTreeFeatureConfig.method_68317(featureConfig.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_68318(yarnwrap.world.gen.feature.FallenTreeFeatureConfig featureConfig) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_68318(featureConfig.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_68318(yarnwrap.world.gen.feature.FallenTreeFeatureConfig featureConfig, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.FallenTreeFeatureConfig.method_68318(featureConfig.wrapperContained)); }

}