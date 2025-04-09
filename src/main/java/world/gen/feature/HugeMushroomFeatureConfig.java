package yarnwrap.world.gen.feature;
public class HugeMushroomFeatureConfig { public net.minecraft.world.gen.feature.HugeMushroomFeatureConfig wrapperContained; public HugeMushroomFeatureConfig(net.minecraft.world.gen.feature.HugeMushroomFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider capProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.capProvider); }
public yarnwrap.world.gen.stateprovider.BlockStateProvider stemProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.stemProvider); }
public int foliageRadius() { return wrapperContained.foliageRadius; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}