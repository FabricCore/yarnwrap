package yarnwrap.world.gen.feature;
public class HugeMushroomFeatureConfig { public net.minecraft.world.gen.feature.HugeMushroomFeatureConfig wrapperContained; public HugeMushroomFeatureConfig(net.minecraft.world.gen.feature.HugeMushroomFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider capProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.capProvider); }
// public void capProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.capProvider = value.wrapperContained; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider stemProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.stemProvider); }
// public void stemProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.stemProvider = value.wrapperContained; }
public int foliageRadius() { return wrapperContained.foliageRadius; }
// public void foliageRadius(int value) { wrapperContained.foliageRadius = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}