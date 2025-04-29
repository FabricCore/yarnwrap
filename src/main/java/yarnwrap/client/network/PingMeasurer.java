package yarnwrap.client.network;
public class PingMeasurer { public net.minecraft.client.network.PingMeasurer wrapperContained; public PingMeasurer(net.minecraft.client.network.PingMeasurer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayNetworkHandler handler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.handler); }
// public void handler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.handler = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayNetworkHandler handler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(net.minecraft.client.network.PingMeasurer.handler); }
// public static void handler(yarnwrap.client.network.ClientPlayNetworkHandler value, ) { net.minecraft.client.network.PingMeasurer.handler = value.wrapperContained; }

// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.log); }
// public void log(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.log = value.wrapperContained; }
// public static yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(net.minecraft.client.network.PingMeasurer.log); }
// public static void log(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value, ) { net.minecraft.client.network.PingMeasurer.log = value.wrapperContained; }

public PingMeasurer(yarnwrap.client.network.ClientPlayNetworkHandler handler,yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log) { this.wrapperContained = new net.minecraft.client.network.PingMeasurer(handler.wrapperContained,log.wrapperContained); }
public void ping() { wrapperContained.ping(); }
// public static void ping() { net.minecraft.client.network.PingMeasurer.ping(); }
public void onPingResult(yarnwrap.network.packet.s2c.query.PingResultS2CPacket packet) { wrapperContained.onPingResult(packet.wrapperContained); }
// public static void onPingResult(yarnwrap.network.packet.s2c.query.PingResultS2CPacket packet, ) { net.minecraft.client.network.PingMeasurer.onPingResult(packet.wrapperContained); }

}