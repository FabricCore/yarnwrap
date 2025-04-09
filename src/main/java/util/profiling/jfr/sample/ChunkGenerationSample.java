package yarnwrap.util.profiling.jfr.sample;
public class ChunkGenerationSample { public net.minecraft.util.profiling.jfr.sample.ChunkGenerationSample wrapperContained; public ChunkGenerationSample(net.minecraft.util.profiling.jfr.sample.ChunkGenerationSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration duration() { return wrapperContained.duration; }
// public yarnwrap.util.math.ChunkPos chunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.chunkPos); }
// public yarnwrap.util.math.ColumnPos centerPos() { return new yarnwrap.util.math.ColumnPos(wrapperContained.centerPos); }
// public yarnwrap.world.chunk.ChunkStatus chunkStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.chunkStatus); }
// public java.lang.String worldKey() { return wrapperContained.worldKey; }
// public yarnwrap.util.math.ChunkPos chunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.chunkPos()); }
// public yarnwrap.util.math.ColumnPos centerPos() { return new yarnwrap.util.math.ColumnPos(wrapperContained.centerPos()); }
// public yarnwrap.world.chunk.ChunkStatus chunkStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.chunkStatus()); }
// public java.lang.String worldKey() { return wrapperContained.worldKey(); }
public yarnwrap.util.profiling.jfr.sample.ChunkGenerationSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.ChunkGenerationSample(wrapperContained.fromEvent(event)); }

}