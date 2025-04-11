package yarnwrap.world.gen.foliage;
public class BushFoliagePlacer { public net.minecraft.world.gen.foliage.BushFoliagePlacer wrapperContained; public BushFoliagePlacer(net.minecraft.world.gen.foliage.BushFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_28840(Object instance) { return wrapperContained.method_28840(instance); }

}