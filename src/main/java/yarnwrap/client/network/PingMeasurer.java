package yarnwrap.client.network;
public class PingMeasurer { public net.minecraft.client.network.PingMeasurer wrapperContained; public PingMeasurer(net.minecraft.client.network.PingMeasurer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayNetworkHandler handler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.handler); }
// public void handler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.handler = value.wrapperContained; }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.log); }
// public void log(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.log = value.wrapperContained; }
public void ping() { wrapperContained.ping(); }
public void onPingResult(yarnwrap.network.packet.s2c.query.PingResultS2CPacket packet) { wrapperContained.onPingResult(packet.wrapperContained); }

}