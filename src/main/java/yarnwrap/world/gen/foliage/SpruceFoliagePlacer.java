package yarnwrap.world.gen.foliage;
public class SpruceFoliagePlacer { public net.minecraft.world.gen.foliage.SpruceFoliagePlacer wrapperContained; public SpruceFoliagePlacer(net.minecraft.world.gen.foliage.SpruceFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider trunkHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.trunkHeight); }
// public void trunkHeight(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.trunkHeight = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public SpruceFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,yarnwrap.util.math.intprovider.IntProvider trunkHeight) { this.wrapperContained = new net.minecraft.world.gen.foliage.SpruceFoliagePlacer(radius.wrapperContained,offset.wrapperContained,trunkHeight.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_30417(Object instance) { return wrapperContained.method_30417(instance); }
// public yarnwrap.util.math.intprovider.IntProvider method_30418(yarnwrap.world.gen.foliage.SpruceFoliagePlacer placer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_30418(placer.wrapperContained)); }

}