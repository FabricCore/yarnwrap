package yarnwrap.world.storage;
public class ChunkDataList { public net.minecraft.world.storage.ChunkDataList wrapperContained; public ChunkDataList(net.minecraft.world.storage.ChunkDataList wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.ChunkPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkPos pos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.world.storage.ChunkDataList.pos); }
// public static void pos(yarnwrap.util.math.ChunkPos value, ) { net.minecraft.world.storage.ChunkDataList.pos = value.wrapperContained; }

// public java.util.List backingList() { return wrapperContained.backingList; }
// public void backingList(java.util.List value) { wrapperContained.backingList = value; }
// public static java.util.List backingList() { return net.minecraft.world.storage.ChunkDataList.backingList; }
// public static void backingList(java.util.List value, ) { net.minecraft.world.storage.ChunkDataList.backingList = value; }

public ChunkDataList(yarnwrap.util.math.ChunkPos pos,java.util.List list) { this.wrapperContained = new net.minecraft.world.storage.ChunkDataList(pos.wrapperContained,list); }
public yarnwrap.util.math.ChunkPos getChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.getChunkPos()); }
// public static yarnwrap.util.math.ChunkPos getChunkPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.world.storage.ChunkDataList.getChunkPos()); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.world.storage.ChunkDataList.stream(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.world.storage.ChunkDataList.isEmpty(); }

}