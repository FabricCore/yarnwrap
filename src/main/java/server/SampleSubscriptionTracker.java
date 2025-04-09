package yarnwrap.server;
public class SampleSubscriptionTracker { public net.minecraft.server.SampleSubscriptionTracker wrapperContained; public SampleSubscriptionTracker(net.minecraft.server.SampleSubscriptionTracker wrapperContained) { this.wrapperContained = wrapperContained; }

public int STOP_TRACK_TICK() { return wrapperContained.STOP_TRACK_TICK; }
public int STOP_TRACK_MS() { return wrapperContained.STOP_TRACK_MS; }
// public yarnwrap.server.PlayerManager playerManager() { return new yarnwrap.server.PlayerManager(wrapperContained.playerManager); }
// public java.util.EnumMap subscriptionMap() { return wrapperContained.subscriptionMap; }
// public java.util.Queue pendingQueue() { return wrapperContained.pendingQueue; }
public void tick(int tick) { wrapperContained.tick(tick); }
// public void onSubscription(long time,int tick) { wrapperContained.onSubscription(time,tick); }
public void sendPacket(yarnwrap.network.packet.s2c.play.DebugSampleS2CPacket packet) { wrapperContained.sendPacket(packet.wrapperContained); }
public void addPlayer(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.profiler.log.DebugSampleType type) { wrapperContained.addPlayer(player.wrapperContained,type.wrapperContained); }
public boolean shouldPush(yarnwrap.util.profiler.log.DebugSampleType type) { return wrapperContained.shouldPush(type.wrapperContained); }
// public void onUnsubscription(long measuringTimeMs,int tick) { wrapperContained.onUnsubscription(measuringTimeMs,tick); }

}