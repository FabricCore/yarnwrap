package yarnwrap.world.gen.feature;
public class HugeMushroomFeatureConfig { public net.minecraft.world.gen.feature.HugeMushroomFeatureConfig wrapperContained; public HugeMushroomFeatureConfig(net.minecraft.world.gen.feature.HugeMushroomFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider capProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.capProvider); }
// public void capProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.capProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider capProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.capProvider); }
// public static void capProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.capProvider = value.wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider stemProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.stemProvider); }
// public void stemProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.stemProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider stemProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.stemProvider); }
// public static void stemProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.stemProvider = value.wrapperContained; }

public int foliageRadius() { return wrapperContained.foliageRadius; }
// public void foliageRadius(int value) { wrapperContained.foliageRadius = value; }
// public static int foliageRadius() { return net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.foliageRadius; }
// public static void foliageRadius(int value, ) { net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.foliageRadius = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.CODEC = value; }

public HugeMushroomFeatureConfig(yarnwrap.world.gen.stateprovider.BlockStateProvider capProvider,yarnwrap.world.gen.stateprovider.BlockStateProvider stemProvider,int foliageRadius) { this.wrapperContained = new net.minecraft.world.gen.feature.HugeMushroomFeatureConfig(capProvider.wrapperContained,stemProvider.wrapperContained,foliageRadius); }
// public com.mojang.datafixers.kinds.App method_28721(Object instance) { return wrapperContained.method_28721(instance); }
// public static com.mojang.datafixers.kinds.App method_28721(Object instance, ) { return net.minecraft.world.gen.feature.HugeMushroomFeatureConfig.method_28721(instance); }

}