package yarnwrap.world.gen.foliage;
public class RandomSpreadFoliagePlacer { public net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer wrapperContained; public RandomSpreadFoliagePlacer(net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.intprovider.IntProvider foliageHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.foliageHeight); }
// public void foliageHeight(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.foliageHeight = value.wrapperContained; }
// public int leafPlacementAttempts() { return wrapperContained.leafPlacementAttempts; }
// public void leafPlacementAttempts(int value) { wrapperContained.leafPlacementAttempts = value; }

}