package yarnwrap.server;
public class SampleSubscriptionTracker { public net.minecraft.server.SampleSubscriptionTracker wrapperContained; public SampleSubscriptionTracker(net.minecraft.server.SampleSubscriptionTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public int STOP_TRACK_TICK() { return wrapperContained.STOP_TRACK_TICK; }
// public void STOP_TRACK_TICK(int value) { wrapperContained.STOP_TRACK_TICK = value; }
public static int STOP_TRACK_TICK() { return net.minecraft.server.SampleSubscriptionTracker.STOP_TRACK_TICK; }
// public static void STOP_TRACK_TICK(int value, ) { net.minecraft.server.SampleSubscriptionTracker.STOP_TRACK_TICK = value; }

// public int STOP_TRACK_MS() { return wrapperContained.STOP_TRACK_MS; }
// public void STOP_TRACK_MS(int value) { wrapperContained.STOP_TRACK_MS = value; }
public static int STOP_TRACK_MS() { return net.minecraft.server.SampleSubscriptionTracker.STOP_TRACK_MS; }
// public static void STOP_TRACK_MS(int value, ) { net.minecraft.server.SampleSubscriptionTracker.STOP_TRACK_MS = value; }

// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public void playerManager(yarnwrap.server.PlayerManager value) { wrapperContained.playerManager = value.wrapperContained; }
// public static yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(net.minecraft.server.SampleSubscriptionTracker.playerManager); }
// public static void playerManager(yarnwrap.server.PlayerManager value, ) { net.minecraft.server.SampleSubscriptionTracker.playerManager = value.wrapperContained; }

// public java.util.Map subscriptionMap() { return wrapperContained.subscriptionMap; }
// public void subscriptionMap(java.util.Map value) { wrapperContained.subscriptionMap = value; }
// public static java.util.Map subscriptionMap() { return net.minecraft.server.SampleSubscriptionTracker.subscriptionMap; }
// public static void subscriptionMap(java.util.Map value, ) { net.minecraft.server.SampleSubscriptionTracker.subscriptionMap = value; }

// public java.util.Queue pendingQueue() { return wrapperContained.pendingQueue; }
// public void pendingQueue(java.util.Queue value) { wrapperContained.pendingQueue = value; }
// public static java.util.Queue pendingQueue() { return net.minecraft.server.SampleSubscriptionTracker.pendingQueue; }
// public static void pendingQueue(java.util.Queue value, ) { net.minecraft.server.SampleSubscriptionTracker.pendingQueue = value; }

public SampleSubscriptionTracker(yarnwrap.server.PlayerManager playerManager) { this.wrapperContained = new net.minecraft.server.SampleSubscriptionTracker(playerManager.wrapperContained); }
public void tick(int tick) { wrapperContained.tick(tick); }
// public static void tick(int tick, ) { net.minecraft.server.SampleSubscriptionTracker.tick(tick); }
// public boolean method_56653(int entry) { return wrapperContained.method_56653(entry); }
// public static boolean method_56653(int entry, ) { return net.minecraft.server.SampleSubscriptionTracker.method_56653(entry); }
// public void onSubscription(long time,int tick) { wrapperContained.onSubscription(time,tick); }
// public static void onSubscription(long time,int tick, ) { net.minecraft.server.SampleSubscriptionTracker.onSubscription(time,tick); }
public void sendPacket(yarnwrap.network.packet.s2c.play.DebugSampleS2CPacket packet) { wrapperContained.sendPacket(packet.wrapperContained); }
// public static void sendPacket(yarnwrap.network.packet.s2c.play.DebugSampleS2CPacket packet, ) { net.minecraft.server.SampleSubscriptionTracker.sendPacket(packet.wrapperContained); }
public void addPlayer(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.profiler.log.DebugSampleType type) { wrapperContained.addPlayer(player.wrapperContained,type.wrapperContained); }
// public static void addPlayer(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.profiler.log.DebugSampleType type, ) { net.minecraft.server.SampleSubscriptionTracker.addPlayer(player.wrapperContained,type.wrapperContained); }
public boolean shouldPush(yarnwrap.util.profiler.log.DebugSampleType type) { return wrapperContained.shouldPush(type.wrapperContained); }
// public static boolean shouldPush(yarnwrap.util.profiler.log.DebugSampleType type, ) { return net.minecraft.server.SampleSubscriptionTracker.shouldPush(type.wrapperContained); }
// public void onUnsubscription(long measuringTimeMs,int tick) { wrapperContained.onUnsubscription(measuringTimeMs,tick); }
// public static void onUnsubscription(long measuringTimeMs,int tick, ) { net.minecraft.server.SampleSubscriptionTracker.onUnsubscription(measuringTimeMs,tick); }
// public java.util.Map method_66206(yarnwrap.util.profiler.log.DebugSampleType type) { return wrapperContained.method_66206(type.wrapperContained); }
// public static java.util.Map method_66206(yarnwrap.util.profiler.log.DebugSampleType type, ) { return net.minecraft.server.SampleSubscriptionTracker.method_66206(type.wrapperContained); }

}