package yarnwrap.world.gen.foliage;
public class AcaciaFoliagePlacer { public net.minecraft.world.gen.foliage.AcaciaFoliagePlacer wrapperContained; public AcaciaFoliagePlacer(net.minecraft.world.gen.foliage.AcaciaFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_28836(Object instance) { return wrapperContained.method_28836(instance); }

}