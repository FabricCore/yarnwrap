package yarnwrap.world.gen.trunk;
public class MegaJungleTrunkPlacer { public net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer wrapperContained; public MegaJungleTrunkPlacer(net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}