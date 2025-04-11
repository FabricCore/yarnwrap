package yarnwrap.world.gen.foliage;
public class PineFoliagePlacer { public net.minecraft.world.gen.foliage.PineFoliagePlacer wrapperContained; public PineFoliagePlacer(net.minecraft.world.gen.foliage.PineFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.height); }
// public void height(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.height = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}