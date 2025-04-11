package yarnwrap.world.gen.trunk;
public class ForkingTrunkPlacer { public net.minecraft.world.gen.trunk.ForkingTrunkPlacer wrapperContained; public ForkingTrunkPlacer(net.minecraft.world.gen.trunk.ForkingTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_28899(Object instance) { return wrapperContained.method_28899(instance); }

}