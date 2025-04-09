package yarnwrap.world.gen.foliage;
public class JungleFoliagePlacer { public net.minecraft.world.gen.foliage.JungleFoliagePlacer wrapperContained; public JungleFoliagePlacer(net.minecraft.world.gen.foliage.JungleFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}