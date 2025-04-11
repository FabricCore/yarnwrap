package yarnwrap.world.gen.foliage;
public class JungleFoliagePlacer { public net.minecraft.world.gen.foliage.JungleFoliagePlacer wrapperContained; public JungleFoliagePlacer(net.minecraft.world.gen.foliage.JungleFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}