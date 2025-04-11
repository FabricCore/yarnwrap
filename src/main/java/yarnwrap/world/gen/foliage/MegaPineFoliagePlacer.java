package yarnwrap.world.gen.foliage;
public class MegaPineFoliagePlacer { public net.minecraft.world.gen.foliage.MegaPineFoliagePlacer wrapperContained; public MegaPineFoliagePlacer(net.minecraft.world.gen.foliage.MegaPineFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider crownHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.crownHeight); }
// public void crownHeight(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.crownHeight = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public MegaPineFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,yarnwrap.util.math.intprovider.IntProvider crownHeight) { this.wrapperContained = new net.minecraft.world.gen.foliage.MegaPineFoliagePlacer(radius.wrapperContained,offset.wrapperContained,crownHeight.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_30413(Object instance) { return wrapperContained.method_30413(instance); }
// public yarnwrap.util.math.intprovider.IntProvider method_30414(yarnwrap.world.gen.foliage.MegaPineFoliagePlacer placer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_30414(placer.wrapperContained)); }

}