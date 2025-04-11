package yarnwrap.world.gen.foliage;
public class AcaciaFoliagePlacer { public net.minecraft.world.gen.foliage.AcaciaFoliagePlacer wrapperContained; public AcaciaFoliagePlacer(net.minecraft.world.gen.foliage.AcaciaFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}