package yarnwrap.world.gen.foliage;
public class PineFoliagePlacer { public net.minecraft.world.gen.foliage.PineFoliagePlacer wrapperContained; public PineFoliagePlacer(net.minecraft.world.gen.foliage.PineFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.height); }
// public void height(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.height = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.foliage.PineFoliagePlacer.height); }
// public static void height(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.foliage.PineFoliagePlacer.height = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.foliage.PineFoliagePlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.foliage.PineFoliagePlacer.CODEC = value; }

public PineFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,yarnwrap.util.math.intprovider.IntProvider height) { this.wrapperContained = new net.minecraft.world.gen.foliage.PineFoliagePlacer(radius.wrapperContained,offset.wrapperContained,height.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_30415(Object instance) { return wrapperContained.method_30415(instance); }
// public static com.mojang.datafixers.kinds.App method_30415(Object instance, ) { return net.minecraft.world.gen.foliage.PineFoliagePlacer.method_30415(instance); }
// public yarnwrap.util.math.intprovider.IntProvider method_30416(yarnwrap.world.gen.foliage.PineFoliagePlacer placer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_30416(placer.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_30416(yarnwrap.world.gen.foliage.PineFoliagePlacer placer, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.foliage.PineFoliagePlacer.method_30416(placer.wrapperContained)); }

}