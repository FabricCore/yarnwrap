package yarnwrap.world.gen.trunk;
public class ForkingTrunkPlacer { public net.minecraft.world.gen.trunk.ForkingTrunkPlacer wrapperContained; public ForkingTrunkPlacer(net.minecraft.world.gen.trunk.ForkingTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}