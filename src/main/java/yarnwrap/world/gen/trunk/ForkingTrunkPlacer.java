package yarnwrap.world.gen.trunk;
public class ForkingTrunkPlacer { public net.minecraft.world.gen.trunk.ForkingTrunkPlacer wrapperContained; public ForkingTrunkPlacer(net.minecraft.world.gen.trunk.ForkingTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.trunk.ForkingTrunkPlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.trunk.ForkingTrunkPlacer.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_28899(Object instance) { return wrapperContained.method_28899(instance); }
// public static com.mojang.datafixers.kinds.App method_28899(Object instance, ) { return net.minecraft.world.gen.trunk.ForkingTrunkPlacer.method_28899(instance); }

}