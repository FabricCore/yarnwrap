package yarnwrap.world.gen.trunk;
public class StraightTrunkPlacer { public net.minecraft.world.gen.trunk.StraightTrunkPlacer wrapperContained; public StraightTrunkPlacer(net.minecraft.world.gen.trunk.StraightTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}