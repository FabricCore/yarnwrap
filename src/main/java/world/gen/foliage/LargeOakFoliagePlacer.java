package yarnwrap.world.gen.foliage;
public class LargeOakFoliagePlacer { public net.minecraft.world.gen.foliage.LargeOakFoliagePlacer wrapperContained; public LargeOakFoliagePlacer(net.minecraft.world.gen.foliage.LargeOakFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}