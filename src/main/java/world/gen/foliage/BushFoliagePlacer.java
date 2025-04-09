package yarnwrap.world.gen.foliage;
public class BushFoliagePlacer { public net.minecraft.world.gen.foliage.BushFoliagePlacer wrapperContained; public BushFoliagePlacer(net.minecraft.world.gen.foliage.BushFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}