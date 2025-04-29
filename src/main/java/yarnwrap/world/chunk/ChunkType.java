package yarnwrap.world.chunk;
public class ChunkType { public net.minecraft.world.chunk.ChunkType wrapperContained; public ChunkType(net.minecraft.world.chunk.ChunkType wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.ChunkType LEVELCHUNK() { return new yarnwrap.world.chunk.ChunkType(wrapperContained.LEVELCHUNK); }
// public void LEVELCHUNK(yarnwrap.world.chunk.ChunkType value) { wrapperContained.LEVELCHUNK = value.wrapperContained; }
public static yarnwrap.world.chunk.ChunkType LEVELCHUNK() { return new yarnwrap.world.chunk.ChunkType(net.minecraft.world.chunk.ChunkType.LEVELCHUNK); }
// public static void LEVELCHUNK(yarnwrap.world.chunk.ChunkType value, ) { net.minecraft.world.chunk.ChunkType.LEVELCHUNK = value.wrapperContained; }

// public yarnwrap.world.chunk.ChunkType PROTOCHUNK() { return new yarnwrap.world.chunk.ChunkType(wrapperContained.PROTOCHUNK); }
// public void PROTOCHUNK(yarnwrap.world.chunk.ChunkType value) { wrapperContained.PROTOCHUNK = value.wrapperContained; }
public static yarnwrap.world.chunk.ChunkType PROTOCHUNK() { return new yarnwrap.world.chunk.ChunkType(net.minecraft.world.chunk.ChunkType.PROTOCHUNK); }
// public static void PROTOCHUNK(yarnwrap.world.chunk.ChunkType value, ) { net.minecraft.world.chunk.ChunkType.PROTOCHUNK = value.wrapperContained; }


}