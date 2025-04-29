package yarnwrap.world.gen.foliage;
public class DarkOakFoliagePlacer { public net.minecraft.world.gen.foliage.DarkOakFoliagePlacer wrapperContained; public DarkOakFoliagePlacer(net.minecraft.world.gen.foliage.DarkOakFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.foliage.DarkOakFoliagePlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.foliage.DarkOakFoliagePlacer.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_28841(Object instance) { return wrapperContained.method_28841(instance); }
// public static com.mojang.datafixers.kinds.App method_28841(Object instance, ) { return net.minecraft.world.gen.foliage.DarkOakFoliagePlacer.method_28841(instance); }

}