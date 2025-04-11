package yarnwrap.world.gen.foliage;
public class DarkOakFoliagePlacer { public net.minecraft.world.gen.foliage.DarkOakFoliagePlacer wrapperContained; public DarkOakFoliagePlacer(net.minecraft.world.gen.foliage.DarkOakFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}