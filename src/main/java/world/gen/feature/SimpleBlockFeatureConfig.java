package yarnwrap.world.gen.feature;
public class SimpleBlockFeatureConfig { public net.minecraft.world.gen.feature.SimpleBlockFeatureConfig wrapperContained; public SimpleBlockFeatureConfig(net.minecraft.world.gen.feature.SimpleBlockFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.toPlace); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.toPlace()); }

}