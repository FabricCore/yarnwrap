package yarnwrap.world.gen.foliage;
public class BlobFoliagePlacer { public net.minecraft.world.gen.foliage.BlobFoliagePlacer wrapperContained; public BlobFoliagePlacer(net.minecraft.world.gen.foliage.BlobFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public BlobFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,int height) { this.wrapperContained = new net.minecraft.world.gen.foliage.BlobFoliagePlacer(radius.wrapperContained,offset.wrapperContained,height); }
// public java.lang.Integer method_28837(yarnwrap.world.gen.foliage.BlobFoliagePlacer placer) { return wrapperContained.method_28837(placer.wrapperContained); }
// public Object createCodec(Object builder) { return wrapperContained.createCodec(builder); }
// public com.mojang.datafixers.kinds.App method_28839(Object instance) { return wrapperContained.method_28839(instance); }

}