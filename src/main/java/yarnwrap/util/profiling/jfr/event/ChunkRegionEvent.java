package yarnwrap.util.profiling.jfr.event;
public class ChunkRegionEvent { public net.minecraft.util.profiling.jfr.event.ChunkRegionEvent wrapperContained; public ChunkRegionEvent(net.minecraft.util.profiling.jfr.event.ChunkRegionEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String worldId() { return wrapperContained.worldId; }
// public void worldId(java.lang.String value) { wrapperContained.worldId = value; }
// public static java.lang.String worldId() { return net.minecraft.util.profiling.jfr.event.ChunkRegionEvent.worldId; }
// public static void worldId(java.lang.String value, ) { net.minecraft.util.profiling.jfr.event.ChunkRegionEvent.worldId = value; }

// public ChunkRegionEvent(yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.storage.ChunkCompressionFormat format,int bytes) { this.wrapperContained = new net.minecraft.util.profiling.jfr.event.ChunkRegionEvent(key.wrapperContained,chunkPos.wrapperContained,format.wrapperContained,bytes); }

}