package yarnwrap.world.gen.foliage;
public class AcaciaFoliagePlacer { public net.minecraft.world.gen.foliage.AcaciaFoliagePlacer wrapperContained; public AcaciaFoliagePlacer(net.minecraft.world.gen.foliage.AcaciaFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.foliage.AcaciaFoliagePlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.foliage.AcaciaFoliagePlacer.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_28836(Object instance) { return wrapperContained.method_28836(instance); }
// public static com.mojang.datafixers.kinds.App method_28836(Object instance, ) { return net.minecraft.world.gen.foliage.AcaciaFoliagePlacer.method_28836(instance); }

}