package yarnwrap.client.network;
public class DebugSampleSubscriber { public net.minecraft.client.network.DebugSampleSubscriber wrapperContained; public DebugSampleSubscriber(net.minecraft.client.network.DebugSampleSubscriber wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TIMEOUT() { return wrapperContained.TIMEOUT; }
// public void TIMEOUT(int value) { wrapperContained.TIMEOUT = value; }
public static int TIMEOUT() { return net.minecraft.client.network.DebugSampleSubscriber.TIMEOUT; }
// public static void TIMEOUT(int value, ) { net.minecraft.client.network.DebugSampleSubscriber.TIMEOUT = value; }

// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(net.minecraft.client.network.DebugSampleSubscriber.networkHandler); }
// public static void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value, ) { net.minecraft.client.network.DebugSampleSubscriber.networkHandler = value.wrapperContained; }

// public yarnwrap.client.gui.hud.DebugHud debugHud() { return new yarnwrap.client.gui.hud.DebugHud(wrapperContained.debugHud); }
// public void debugHud(yarnwrap.client.gui.hud.DebugHud value) { wrapperContained.debugHud = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.DebugHud debugHud() { return new yarnwrap.client.gui.hud.DebugHud(net.minecraft.client.network.DebugSampleSubscriber.debugHud); }
// public static void debugHud(yarnwrap.client.gui.hud.DebugHud value, ) { net.minecraft.client.network.DebugSampleSubscriber.debugHud = value.wrapperContained; }

// public java.util.EnumMap lastTime() { return wrapperContained.lastTime; }
// public void lastTime(java.util.EnumMap value) { wrapperContained.lastTime = value; }
// public static java.util.EnumMap lastTime() { return net.minecraft.client.network.DebugSampleSubscriber.lastTime; }
// public static void lastTime(java.util.EnumMap value, ) { net.minecraft.client.network.DebugSampleSubscriber.lastTime = value; }

public DebugSampleSubscriber(yarnwrap.client.network.ClientPlayNetworkHandler handler,yarnwrap.client.gui.hud.DebugHud hud) { this.wrapperContained = new net.minecraft.client.network.DebugSampleSubscriber(handler.wrapperContained,hud.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.network.DebugSampleSubscriber.tick(); }
// public void subscribe(yarnwrap.util.profiler.log.DebugSampleType type) { wrapperContained.subscribe(type.wrapperContained); }
// public static void subscribe(yarnwrap.util.profiler.log.DebugSampleType type, ) { net.minecraft.client.network.DebugSampleSubscriber.subscribe(type.wrapperContained); }

}