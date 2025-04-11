package yarnwrap.world.gen.foliage;
public class RandomSpreadFoliagePlacer { public net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer wrapperContained; public RandomSpreadFoliagePlacer(net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.intprovider.IntProvider foliageHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.foliageHeight); }
// public void foliageHeight(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.foliageHeight = value.wrapperContained; }
// public int leafPlacementAttempts() { return wrapperContained.leafPlacementAttempts; }
// public void leafPlacementAttempts(int value) { wrapperContained.leafPlacementAttempts = value; }
public RandomSpreadFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,yarnwrap.util.math.intprovider.IntProvider foliageHeight,int leafPlacementAttempts) { this.wrapperContained = new net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer(radius.wrapperContained,offset.wrapperContained,foliageHeight.wrapperContained,leafPlacementAttempts); }
// public com.mojang.datafixers.kinds.App method_34360(Object instance) { return wrapperContained.method_34360(instance); }
// public java.lang.Integer method_34361(yarnwrap.world.gen.foliage.RandomSpreadFoliagePlacer placer) { return wrapperContained.method_34361(placer.wrapperContained); }
// public yarnwrap.util.math.intprovider.IntProvider method_34362(yarnwrap.world.gen.foliage.RandomSpreadFoliagePlacer placer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_34362(placer.wrapperContained)); }

}