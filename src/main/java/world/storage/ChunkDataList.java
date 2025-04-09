package yarnwrap.world.storage;
public class ChunkDataList { public net.minecraft.world.storage.ChunkDataList wrapperContained; public ChunkDataList(net.minecraft.world.storage.ChunkDataList wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public java.util.List backingList() { return wrapperContained.backingList; }
public yarnwrap.util.math.ChunkPos getChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getChunkPos()); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }

}