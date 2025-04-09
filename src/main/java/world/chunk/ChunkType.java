package yarnwrap.world.chunk;
public class ChunkType { public net.minecraft.world.chunk.ChunkType wrapperContained; public ChunkType(net.minecraft.world.chunk.ChunkType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.chunk.ChunkType LEVELCHUNK() { return new yarnwrap.world.chunk.ChunkType(wrapperContained.LEVELCHUNK); }
public yarnwrap.world.chunk.ChunkType PROTOCHUNK() { return new yarnwrap.world.chunk.ChunkType(wrapperContained.PROTOCHUNK); }

}