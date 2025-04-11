package yarnwrap.util.profiling.jfr.sample;
public class ChunkGenerationSample { public net.minecraft.util.profiling.jfr.sample.ChunkGenerationSample wrapperContained; public ChunkGenerationSample(net.minecraft.util.profiling.jfr.sample.ChunkGenerationSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Duration duration() { return wrapperContained.duration; }
// public void duration(java.time.Duration value) { wrapperContained.duration = value; }
// public yarnwrap.util.math.ChunkPos chunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.chunkPos); }
// public void chunkPos(yarnwrap.util.math.ChunkPos value) { wrapperContained.chunkPos = value.wrapperContained; }
// public yarnwrap.util.math.ColumnPos centerPos() { return new yarnwrap.util.math.ColumnPos(wrapperContained.centerPos); }
// public void centerPos(yarnwrap.util.math.ColumnPos value) { wrapperContained.centerPos = value.wrapperContained; }
// public yarnwrap.world.chunk.ChunkStatus chunkStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.chunkStatus); }
// public void chunkStatus(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.chunkStatus = value.wrapperContained; }
// public java.lang.String worldKey() { return wrapperContained.worldKey; }
// public void worldKey(java.lang.String value) { wrapperContained.worldKey = value; }
// public ChunkGenerationSample(java.time.Duration duration) { this.wrapperContained = new net.minecraft.util.profiling.jfr.sample.ChunkGenerationSample(duration); }
// public yarnwrap.util.math.ChunkPos chunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.chunkPos()); }
// public yarnwrap.util.math.ColumnPos centerPos() { return new yarnwrap.util.math.ColumnPos(wrapperContained.centerPos()); }
// public yarnwrap.world.chunk.ChunkStatus chunkStatus() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.chunkStatus()); }
// public java.lang.String worldKey() { return wrapperContained.worldKey(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.util.profiling.jfr.sample.ChunkGenerationSample fromEvent(jdk.jfr.consumer.RecordedEvent event) { return new yarnwrap.util.profiling.jfr.sample.ChunkGenerationSample(wrapperContained.fromEvent(event)); }

}