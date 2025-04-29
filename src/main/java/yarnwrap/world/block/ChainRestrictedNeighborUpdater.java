package yarnwrap.world.block;
public class ChainRestrictedNeighborUpdater { public net.minecraft.world.block.ChainRestrictedNeighborUpdater wrapperContained; public ChainRestrictedNeighborUpdater(net.minecraft.world.block.ChainRestrictedNeighborUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.block.ChainRestrictedNeighborUpdater.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.block.ChainRestrictedNeighborUpdater.LOGGER = value; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.world.block.ChainRestrictedNeighborUpdater.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.world.block.ChainRestrictedNeighborUpdater.world = value.wrapperContained; }

// public java.util.ArrayDeque queue() { return wrapperContained.queue; }
// public void queue(java.util.ArrayDeque value) { wrapperContained.queue = value; }
// public static java.util.ArrayDeque queue() { return net.minecraft.world.block.ChainRestrictedNeighborUpdater.queue; }
// public static void queue(java.util.ArrayDeque value, ) { net.minecraft.world.block.ChainRestrictedNeighborUpdater.queue = value; }

// public java.util.List pending() { return wrapperContained.pending; }
// public void pending(java.util.List value) { wrapperContained.pending = value; }
// public static java.util.List pending() { return net.minecraft.world.block.ChainRestrictedNeighborUpdater.pending; }
// public static void pending(java.util.List value, ) { net.minecraft.world.block.ChainRestrictedNeighborUpdater.pending = value; }

// public int depth() { return wrapperContained.depth; }
// public void depth(int value) { wrapperContained.depth = value; }
// public static int depth() { return net.minecraft.world.block.ChainRestrictedNeighborUpdater.depth; }
// public static void depth(int value, ) { net.minecraft.world.block.ChainRestrictedNeighborUpdater.depth = value; }

// public int maxChainDepth() { return wrapperContained.maxChainDepth; }
// public void maxChainDepth(int value) { wrapperContained.maxChainDepth = value; }
// public static int maxChainDepth() { return net.minecraft.world.block.ChainRestrictedNeighborUpdater.maxChainDepth; }
// public static void maxChainDepth(int value, ) { net.minecraft.world.block.ChainRestrictedNeighborUpdater.maxChainDepth = value; }

public ChainRestrictedNeighborUpdater(yarnwrap.world.World world,int maxChainDepth) { this.wrapperContained = new net.minecraft.world.block.ChainRestrictedNeighborUpdater(world.wrapperContained,maxChainDepth); }
// public void runQueuedUpdates() { wrapperContained.runQueuedUpdates(); }
// public static void runQueuedUpdates() { net.minecraft.world.block.ChainRestrictedNeighborUpdater.runQueuedUpdates(); }
// public void enqueue(yarnwrap.util.math.BlockPos pos,Object entry) { wrapperContained.enqueue(pos.wrapperContained,entry); }
// public static void enqueue(yarnwrap.util.math.BlockPos pos,Object entry, ) { net.minecraft.world.block.ChainRestrictedNeighborUpdater.enqueue(pos.wrapperContained,entry); }

}