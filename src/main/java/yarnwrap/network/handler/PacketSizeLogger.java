package yarnwrap.network.handler;
public class PacketSizeLogger { public net.minecraft.network.handler.PacketSizeLogger wrapperContained; public PacketSizeLogger(net.minecraft.network.handler.PacketSizeLogger wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicInteger packetSizeInBytes() { return wrapperContained.packetSizeInBytes; }
// public void packetSizeInBytes(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.packetSizeInBytes = value; }
// public yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log() { return new yarnwrap.util.profiler.MultiValueDebugSampleLogImpl(wrapperContained.log); }
// public void log(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl value) { wrapperContained.log = value.wrapperContained; }
public void push() { wrapperContained.push(); }
public void increment(int bytes) { wrapperContained.increment(bytes); }

}