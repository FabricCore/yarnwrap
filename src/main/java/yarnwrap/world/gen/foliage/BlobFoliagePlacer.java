package yarnwrap.world.gen.foliage;
public class BlobFoliagePlacer { public net.minecraft.world.gen.foliage.BlobFoliagePlacer wrapperContained; public BlobFoliagePlacer(net.minecraft.world.gen.foliage.BlobFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object createCodec(Object builder) { return wrapperContained.createCodec(builder); }

}