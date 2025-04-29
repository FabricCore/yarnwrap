package yarnwrap.world.block;
public class SimpleNeighborUpdater { public net.minecraft.world.block.SimpleNeighborUpdater wrapperContained; public SimpleNeighborUpdater(net.minecraft.world.block.SimpleNeighborUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.world.block.SimpleNeighborUpdater.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.world.block.SimpleNeighborUpdater.world = value.wrapperContained; }

public SimpleNeighborUpdater(yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.world.block.SimpleNeighborUpdater(world.wrapperContained); }

}