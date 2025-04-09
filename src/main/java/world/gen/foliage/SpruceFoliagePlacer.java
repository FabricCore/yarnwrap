package yarnwrap.world.gen.foliage;
public class SpruceFoliagePlacer { public net.minecraft.world.gen.foliage.SpruceFoliagePlacer wrapperContained; public SpruceFoliagePlacer(net.minecraft.world.gen.foliage.SpruceFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider trunkHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.trunkHeight); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}