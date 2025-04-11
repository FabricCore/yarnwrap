package yarnwrap.world.gen.foliage;
public class SpruceFoliagePlacer { public net.minecraft.world.gen.foliage.SpruceFoliagePlacer wrapperContained; public SpruceFoliagePlacer(net.minecraft.world.gen.foliage.SpruceFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider trunkHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.trunkHeight); }
// public void trunkHeight(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.trunkHeight = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}