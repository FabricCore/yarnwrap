package yarnwrap.world.gen.trunk;
public class StraightTrunkPlacer { public net.minecraft.world.gen.trunk.StraightTrunkPlacer wrapperContained; public StraightTrunkPlacer(net.minecraft.world.gen.trunk.StraightTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_28902(Object instance) { return wrapperContained.method_28902(instance); }

}