package yarnwrap.world.gen.trunk;
public class BendingTrunkPlacer { public net.minecraft.world.gen.trunk.BendingTrunkPlacer wrapperContained; public BendingTrunkPlacer(net.minecraft.world.gen.trunk.BendingTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int minHeightForLeaves() { return wrapperContained.minHeightForLeaves; }
// public void minHeightForLeaves(int value) { wrapperContained.minHeightForLeaves = value; }
// public yarnwrap.util.math.intprovider.IntProvider bendLength() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.bendLength); }
// public void bendLength(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.bendLength = value.wrapperContained; }

}