package yarnwrap.world.gen.foliage;
public class LargeOakFoliagePlacer { public net.minecraft.world.gen.foliage.LargeOakFoliagePlacer wrapperContained; public LargeOakFoliagePlacer(net.minecraft.world.gen.foliage.LargeOakFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_28842(Object instance) { return wrapperContained.method_28842(instance); }

}