package yarnwrap.world.gen.trunk;
public class MegaJungleTrunkPlacer { public net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer wrapperContained; public MegaJungleTrunkPlacer(net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_28901(Object instance) { return wrapperContained.method_28901(instance); }
// public static com.mojang.datafixers.kinds.App method_28901(Object instance, ) { return net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer.method_28901(instance); }

}