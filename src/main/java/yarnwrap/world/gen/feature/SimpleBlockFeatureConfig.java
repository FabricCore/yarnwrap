package yarnwrap.world.gen.feature;
public class SimpleBlockFeatureConfig { public net.minecraft.world.gen.feature.SimpleBlockFeatureConfig wrapperContained; public SimpleBlockFeatureConfig(net.minecraft.world.gen.feature.SimpleBlockFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.toPlace); }
// public void toPlace(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.toPlace = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider toPlace() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.toPlace()); }

}