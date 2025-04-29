package yarnwrap.world.gen.feature;
public class SimpleBlockFeatureConfig { public net.minecraft.world.gen.feature.SimpleBlockFeatureConfig wrapperContained; public SimpleBlockFeatureConfig(net.minecraft.world.gen.feature.SimpleBlockFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.toPlace); }
// public void toPlace(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.toPlace = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.SimpleBlockFeatureConfig.toPlace); }
// public static void toPlace(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.feature.SimpleBlockFeatureConfig.toPlace = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.SimpleBlockFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.SimpleBlockFeatureConfig.CODEC = value; }

public SimpleBlockFeatureConfig(yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace) { this.wrapperContained = new net.minecraft.world.gen.feature.SimpleBlockFeatureConfig(toPlace.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.toPlace()); }
// // public static yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.SimpleBlockFeatureConfig.toPlace()); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_28787(yarnwrap.world.gen.feature.SimpleBlockFeatureConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_28787(config.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_28787(yarnwrap.world.gen.feature.SimpleBlockFeatureConfig config, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.SimpleBlockFeatureConfig.method_28787(config.wrapperContained)); }

}