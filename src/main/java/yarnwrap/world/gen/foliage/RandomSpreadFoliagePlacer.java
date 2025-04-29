package yarnwrap.world.gen.foliage;
public class RandomSpreadFoliagePlacer { public net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer wrapperContained; public RandomSpreadFoliagePlacer(net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.CODEC = value; }

// public yarnwrap.util.math.intprovider.IntProvider foliageHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.foliageHeight); }
// public void foliageHeight(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.foliageHeight = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider foliageHeight() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.foliageHeight); }
// public static void foliageHeight(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.foliageHeight = value.wrapperContained; }

// public int leafPlacementAttempts() { return wrapperContained.leafPlacementAttempts; }
// public void leafPlacementAttempts(int value) { wrapperContained.leafPlacementAttempts = value; }
// public static int leafPlacementAttempts() { return net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.leafPlacementAttempts; }
// public static void leafPlacementAttempts(int value, ) { net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.leafPlacementAttempts = value; }

public RandomSpreadFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,yarnwrap.util.math.intprovider.IntProvider foliageHeight,int leafPlacementAttempts) { this.wrapperContained = new net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer(radius.wrapperContained,offset.wrapperContained,foliageHeight.wrapperContained,leafPlacementAttempts); }
// public com.mojang.datafixers.kinds.App method_34360(Object instance) { return wrapperContained.method_34360(instance); }
// public static com.mojang.datafixers.kinds.App method_34360(Object instance, ) { return net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.method_34360(instance); }
// public java.lang.Integer method_34361(yarnwrap.world.gen.foliage.RandomSpreadFoliagePlacer placer) { return wrapperContained.method_34361(placer.wrapperContained); }
// public static java.lang.Integer method_34361(yarnwrap.world.gen.foliage.RandomSpreadFoliagePlacer placer, ) { return net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.method_34361(placer.wrapperContained); }
// public yarnwrap.util.math.intprovider.IntProvider method_34362(yarnwrap.world.gen.foliage.RandomSpreadFoliagePlacer placer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_34362(placer.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_34362(yarnwrap.world.gen.foliage.RandomSpreadFoliagePlacer placer, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer.method_34362(placer.wrapperContained)); }

}