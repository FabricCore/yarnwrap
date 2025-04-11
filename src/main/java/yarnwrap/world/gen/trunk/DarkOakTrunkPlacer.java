package yarnwrap.world.gen.trunk;
public class DarkOakTrunkPlacer { public net.minecraft.world.gen.trunk.DarkOakTrunkPlacer wrapperContained; public DarkOakTrunkPlacer(net.minecraft.world.gen.trunk.DarkOakTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}