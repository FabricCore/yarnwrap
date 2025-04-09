package yarnwrap.client.network;
public class PendingUpdateManager { public net.minecraft.client.network.PendingUpdateManager wrapperContained; public PendingUpdateManager(net.minecraft.client.network.PendingUpdateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap blockPosToPendingUpdate() { return wrapperContained.blockPosToPendingUpdate; }
// public int sequence() { return wrapperContained.sequence; }
// public boolean pendingSequence() { return wrapperContained.pendingSequence; }
public yarnwrap.client.network.PendingUpdateManager incrementSequence() { return new yarnwrap.client.network.PendingUpdateManager(wrapperContained.incrementSequence()); }
public void processPendingUpdates(int maxProcessableSequence,yarnwrap.client.world.ClientWorld world) { wrapperContained.processPendingUpdates(maxProcessableSequence,world.wrapperContained); }
public boolean hasPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.hasPendingUpdate(pos.wrapperContained,state.wrapperContained); }
public void addPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.client.network.ClientPlayerEntity player) { wrapperContained.addPendingUpdate(pos.wrapperContained,state.wrapperContained,player.wrapperContained); }
public int getSequence() { return wrapperContained.getSequence(); }
public boolean hasPendingSequence() { return wrapperContained.hasPendingSequence(); }

}