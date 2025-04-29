package yarnwrap.world.gen.foliage;
public class JungleFoliagePlacer { public net.minecraft.world.gen.foliage.JungleFoliagePlacer wrapperContained; public JungleFoliagePlacer(net.minecraft.world.gen.foliage.JungleFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.world.gen.foliage.JungleFoliagePlacer.height; }
// public static void height(int value, ) { net.minecraft.world.gen.foliage.JungleFoliagePlacer.height = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.foliage.JungleFoliagePlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.foliage.JungleFoliagePlacer.CODEC = value; }

public JungleFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,int height) { this.wrapperContained = new net.minecraft.world.gen.foliage.JungleFoliagePlacer(radius.wrapperContained,offset.wrapperContained,height); }
// public java.lang.Integer method_28851(yarnwrap.world.gen.foliage.JungleFoliagePlacer placer) { return wrapperContained.method_28851(placer.wrapperContained); }
// public static java.lang.Integer method_28851(yarnwrap.world.gen.foliage.JungleFoliagePlacer placer, ) { return net.minecraft.world.gen.foliage.JungleFoliagePlacer.method_28851(placer.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28852(Object instance) { return wrapperContained.method_28852(instance); }
// public static com.mojang.datafixers.kinds.App method_28852(Object instance, ) { return net.minecraft.world.gen.foliage.JungleFoliagePlacer.method_28852(instance); }

}