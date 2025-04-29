package yarnwrap.util.profiling.jfr.sample;
public class ChunkRegionSample { public net.minecraft.util.profiling.jfr.sample.ChunkRegionSample wrapperContained; public ChunkRegionSample(net.minecraft.util.profiling.jfr.sample.ChunkRegionSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiling.jfr.sample.ChunkRegionSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.ChunkRegionSample(wrapperContained.fromEvent(event)); }
// public static yarnwrap.util.profiling.jfr.sample.ChunkRegionSample fromEvent(jdk.jfr.consumer.RecordedEvent event, ) { return new yarnwrap.util.profiling.jfr.sample.ChunkRegionSample(net.minecraft.util.profiling.jfr.sample.ChunkRegionSample.fromEvent(event)); }

}