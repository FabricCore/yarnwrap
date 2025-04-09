package yarnwrap.world.gen.foliage;
public class MegaPineFoliagePlacer { public net.minecraft.world.gen.foliage.MegaPineFoliagePlacer wrapperContained; public MegaPineFoliagePlacer(net.minecraft.world.gen.foliage.MegaPineFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider crownHeight() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.crownHeight); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}