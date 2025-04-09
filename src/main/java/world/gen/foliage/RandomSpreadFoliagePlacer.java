package yarnwrap.world.gen.foliage;
public class RandomSpreadFoliagePlacer { public net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer wrapperContained; public RandomSpreadFoliagePlacer(net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.intprovider.IntProvider foliageHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.foliageHeight); }
// public int leafPlacementAttempts() { return wrapperContained.leafPlacementAttempts; }

}