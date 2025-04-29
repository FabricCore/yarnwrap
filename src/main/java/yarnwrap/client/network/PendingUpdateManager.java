package yarnwrap.client.network;
public class PendingUpdateManager { public net.minecraft.client.network.PendingUpdateManager wrapperContained; public PendingUpdateManager(net.minecraft.client.network.PendingUpdateManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap blockPosToPendingUpdate() { return wrapperContained.blockPosToPendingUpdate; }
// public void blockPosToPendingUpdate(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value) { wrapperContained.blockPosToPendingUpdate = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap blockPosToPendingUpdate() { return net.minecraft.client.network.PendingUpdateManager.blockPosToPendingUpdate; }
// public static void blockPosToPendingUpdate(it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap value, ) { net.minecraft.client.network.PendingUpdateManager.blockPosToPendingUpdate = value; }

// public int sequence() { return wrapperContained.sequence; }
// public void sequence(int value) { wrapperContained.sequence = value; }
// public static int sequence() { return net.minecraft.client.network.PendingUpdateManager.sequence; }
// public static void sequence(int value, ) { net.minecraft.client.network.PendingUpdateManager.sequence = value; }

// public boolean pendingSequence() { return wrapperContained.pendingSequence; }
// public void pendingSequence(boolean value) { wrapperContained.pendingSequence = value; }
// public static boolean pendingSequence() { return net.minecraft.client.network.PendingUpdateManager.pendingSequence; }
// public static void pendingSequence(boolean value, ) { net.minecraft.client.network.PendingUpdateManager.pendingSequence = value; }

public yarnwrap.client.network.PendingUpdateManager incrementSequence() { return new yarnwrap.client.network.PendingUpdateManager(wrapperContained.incrementSequence()); }
// public static yarnwrap.client.network.PendingUpdateManager incrementSequence() { return new yarnwrap.client.network.PendingUpdateManager(net.minecraft.client.network.PendingUpdateManager.incrementSequence()); }
public void processPendingUpdates(int maxProcessableSequence,yarnwrap.client.world.ClientWorld world) { wrapperContained.processPendingUpdates(maxProcessableSequence,world.wrapperContained); }
// public static void processPendingUpdates(int maxProcessableSequence,yarnwrap.client.world.ClientWorld world, ) { net.minecraft.client.network.PendingUpdateManager.processPendingUpdates(maxProcessableSequence,world.wrapperContained); }
// public Object method_41939(yarnwrap.block.BlockState posLong,yarnwrap.client.network.ClientPlayerEntity pendingUpdate) { return wrapperContained.method_41939(posLong.wrapperContained,pendingUpdate.wrapperContained); }
// public static Object method_41939(yarnwrap.block.BlockState posLong,yarnwrap.client.network.ClientPlayerEntity pendingUpdate, ) { return net.minecraft.client.network.PendingUpdateManager.method_41939(posLong.wrapperContained,pendingUpdate.wrapperContained); }
public boolean hasPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.hasPendingUpdate(pos.wrapperContained,state.wrapperContained); }
// public static boolean hasPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.client.network.PendingUpdateManager.hasPendingUpdate(pos.wrapperContained,state.wrapperContained); }
public void addPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.client.network.ClientPlayerEntity player) { wrapperContained.addPendingUpdate(pos.wrapperContained,state.wrapperContained,player.wrapperContained); }
// public static void addPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.client.network.ClientPlayerEntity player, ) { net.minecraft.client.network.PendingUpdateManager.addPendingUpdate(pos.wrapperContained,state.wrapperContained,player.wrapperContained); }
public int getSequence() { return wrapperContained.getSequence(); }
// public static int getSequence() { return net.minecraft.client.network.PendingUpdateManager.getSequence(); }
public boolean hasPendingSequence() { return wrapperContained.hasPendingSequence(); }
// public static boolean hasPendingSequence() { return net.minecraft.client.network.PendingUpdateManager.hasPendingSequence(); }

}