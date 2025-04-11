package yarnwrap.client.network;
public class DebugSampleSubscriber { public net.minecraft.client.network.DebugSampleSubscriber wrapperContained; public DebugSampleSubscriber(net.minecraft.client.network.DebugSampleSubscriber wrapperContained) { this.wrapperContained = wrapperContained; }

public int TIMEOUT() { return wrapperContained.TIMEOUT; }
// public void TIMEOUT(int value) { wrapperContained.TIMEOUT = value; }
// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public yarnwrap.client.gui.hud.DebugHud debugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.debugHud); }
// public void debugHud(yarnwrap.client.gui.hud.DebugHud value) { wrapperContained.debugHud = value.wrapperContained; }
// public java.util.EnumMap lastTime() { return wrapperContained.lastTime; }
// public void lastTime(java.util.EnumMap value) { wrapperContained.lastTime = value; }
public void tick() { wrapperContained.tick(); }
// public void subscribe(yarnwrap.util.profiler.log.DebugSampleType type) { wrapperContained.subscribe(type.wrapperContained); }

}