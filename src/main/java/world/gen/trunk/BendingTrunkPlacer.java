package yarnwrap.world.gen.trunk;
public class BendingTrunkPlacer { public net.minecraft.world.gen.trunk.BendingTrunkPlacer wrapperContained; public BendingTrunkPlacer(net.minecraft.world.gen.trunk.BendingTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public int minHeightForLeaves() { return wrapperContained.minHeightForLeaves; }
// public yarnwrap.util.math.intprovider.IntProvider bendLength() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.bendLength); }

}