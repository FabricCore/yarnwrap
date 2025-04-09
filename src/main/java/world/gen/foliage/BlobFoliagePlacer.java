package yarnwrap.world.gen.foliage;
public class BlobFoliagePlacer { public net.minecraft.world.gen.foliage.BlobFoliagePlacer wrapperContained; public BlobFoliagePlacer(net.minecraft.world.gen.foliage.BlobFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object createCodec(Object builder) { return wrapperContained.createCodec(builder); }

}