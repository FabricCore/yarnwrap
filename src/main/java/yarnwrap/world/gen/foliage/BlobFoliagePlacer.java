package yarnwrap.world.gen.foliage;
public class BlobFoliagePlacer { public net.minecraft.world.gen.foliage.BlobFoliagePlacer wrapperContained; public BlobFoliagePlacer(net.minecraft.world.gen.foliage.BlobFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.world.gen.foliage.BlobFoliagePlacer.height; }
// public static void height(int value, ) { net.minecraft.world.gen.foliage.BlobFoliagePlacer.height = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.foliage.BlobFoliagePlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.foliage.BlobFoliagePlacer.CODEC = value; }

public BlobFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,int height) { this.wrapperContained = new net.minecraft.world.gen.foliage.BlobFoliagePlacer(radius.wrapperContained,offset.wrapperContained,height); }
// public java.lang.Integer method_28837(yarnwrap.world.gen.foliage.BlobFoliagePlacer placer) { return wrapperContained.method_28837(placer.wrapperContained); }
// public static java.lang.Integer method_28837(yarnwrap.world.gen.foliage.BlobFoliagePlacer placer, ) { return net.minecraft.world.gen.foliage.BlobFoliagePlacer.method_28837(placer.wrapperContained); }
// public Object createCodec(Object builder) { return wrapperContained.createCodec(builder); }
// public static Object createCodec(Object builder, ) { return net.minecraft.world.gen.foliage.BlobFoliagePlacer.createCodec(builder); }
// public com.mojang.datafixers.kinds.App method_28839(Object instance) { return wrapperContained.method_28839(instance); }
// public static com.mojang.datafixers.kinds.App method_28839(Object instance, ) { return net.minecraft.world.gen.foliage.BlobFoliagePlacer.method_28839(instance); }

}