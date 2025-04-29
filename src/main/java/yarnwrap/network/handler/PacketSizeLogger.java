package yarnwrap.network.handler;
public class PacketSizeLogger { public net.minecraft.network.handler.PacketSizeLogger wrapperContained; public PacketSizeLogger(net.minecraft.network.handler.PacketSizeLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicInteger packetSizeInBytes() { return wrapperContained.packetSizeInBytes; }
// public void packetSizeInBytes(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.packetSizeInBytes = value; }
// public static java.util.concurrent.atomic.AtomicInteger packetSizeInBytes() { return net.minecraft.network.handler.PacketSizeLogger.packetSizeInBytes; }
// public static void packetSizeInBytes(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.network.handler.PacketSizeLogger.packetSizeInBytes = value; }

// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.log); }
// public void log(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.log = value.wrapperContained; }
// public static yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(net.minecraft.network.handler.PacketSizeLogger.log); }
// public static void log(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value, ) { net.minecraft.network.handler.PacketSizeLogger.log = value.wrapperContained; }

public PacketSizeLogger(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log) { this.wrapperContained = new net.minecraft.network.handler.PacketSizeLogger(log.wrapperContained); }
public void push() { wrapperContained.push(); }
// public static void push() { net.minecraft.network.handler.PacketSizeLogger.push(); }
public void increment(int bytes) { wrapperContained.increment(bytes); }
// public static void increment(int bytes, ) { net.minecraft.network.handler.PacketSizeLogger.increment(bytes); }

}