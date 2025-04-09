package yarnwrap.world.block;
public class SimpleNeighborUpdater { public net.minecraft.world.block.SimpleNeighborUpdater wrapperContained; public SimpleNeighborUpdater(net.minecraft.world.block.SimpleNeighborUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }

}