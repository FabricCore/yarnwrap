package yarnwrap.util.profiling.jfr.sample;
public class PacketSample { public net.minecraft.util.profiling.jfr.sample.PacketSample wrapperContained; public PacketSample(net.minecraft.util.profiling.jfr.sample.PacketSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String side() { return wrapperContained.side; }
// public void side(java.lang.String value) { wrapperContained.side = value; }
// public java.lang.String side() { return wrapperContained.side(); }
public yarnwrap.util.profiling.jfr.sample.PacketSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.PacketSample(wrapperContained.fromEvent(event)); }

}