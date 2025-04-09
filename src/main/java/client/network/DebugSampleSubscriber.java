package yarnwrap.client.network;
public class DebugSampleSubscriber { public net.minecraft.client.network.DebugSampleSubscriber wrapperContained; public DebugSampleSubscriber(net.minecraft.client.network.DebugSampleSubscriber wrapperContained) { this.wrapperContained = wrapperContained; }

public int TIMEOUT() { return wrapperContained.TIMEOUT; }
// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public yarnwrap.client.gui.hud.DebugHud debugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.debugHud); }
// public java.util.EnumMap lastTime() { return wrapperContained.lastTime; }
public void tick() { wrapperContained.tick(); }
// public void subscribe(yarnwrap.util.profiler.log.DebugSampleType type) { wrapperContained.subscribe(type.wrapperContained); }

}