package yarnwrap.world.gen.trunk;
public class MegaJungleTrunkPlacer { public net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer wrapperContained; public MegaJungleTrunkPlacer(net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_28901(Object instance) { return wrapperContained.method_28901(instance); }

}