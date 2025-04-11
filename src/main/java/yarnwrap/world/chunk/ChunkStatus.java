package yarnwrap.world.chunk;
public class ChunkStatus { public net.minecraft.world.chunk.ChunkStatus wrapperContained; public ChunkStatus(net.minecraft.world.chunk.ChunkStatus wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.ChunkType chunkType() { return new yarnwrap.world.chunk.ChunkType(wrapperContained.chunkType); }
// public void chunkType(yarnwrap.world.chunk.ChunkType value) { wrapperContained.chunkType = value.wrapperContained; }
// public java.util.EnumSet heightMapTypes() { return wrapperContained.heightMapTypes; }
// public void heightMapTypes(java.util.EnumSet value) { wrapperContained.heightMapTypes = value; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public yarnwrap.world.chunk.ChunkStatus previous() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.previous); }
// public void previous(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.previous = value.wrapperContained; }
public java.util.EnumSet NORMAL_HEIGHTMAP_TYPES() { return wrapperContained.NORMAL_HEIGHTMAP_TYPES; }
// public void NORMAL_HEIGHTMAP_TYPES(java.util.EnumSet value) { wrapperContained.NORMAL_HEIGHTMAP_TYPES = value; }
// public java.util.EnumSet WORLD_GEN_HEIGHTMAP_TYPES() { return wrapperContained.WORLD_GEN_HEIGHTMAP_TYPES; }
// public void WORLD_GEN_HEIGHTMAP_TYPES(java.util.EnumSet value) { wrapperContained.WORLD_GEN_HEIGHTMAP_TYPES = value; }
// public ChunkStatus(yarnwrap.world.chunk.ChunkStatus previous,java.util.EnumSet heightMapTypes,yarnwrap.world.chunk.ChunkType chunkType) { this.wrapperContained = new net.minecraft.world.chunk.ChunkStatus(previous.wrapperContained,heightMapTypes,chunkType.wrapperContained); }
public java.util.EnumSet getHeightmapTypes() { return wrapperContained.getHeightmapTypes(); }
public yarnwrap.world.chunk.ChunkType getChunkType() { return new yarnwrap.world.chunk.ChunkType(wrapperContained.getChunkType()); }
public boolean isAtLeast(yarnwrap.world.chunk.ChunkStatus other) { return wrapperContained.isAtLeast(other.wrapperContained); }
public yarnwrap.world.chunk.ChunkStatus byId(java.lang.String id) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.byId(id)); }
public java.util.List createOrderedList() { return wrapperContained.createOrderedList(); }
public int getIndex() { return wrapperContained.getIndex(); }
public yarnwrap.world.chunk.ChunkStatus getPrevious() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getPrevious()); }
public yarnwrap.world.chunk.ChunkStatus max(yarnwrap.world.chunk.ChunkStatus a,yarnwrap.world.chunk.ChunkStatus b) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.max(a.wrapperContained,b.wrapperContained)); }
// public yarnwrap.world.chunk.ChunkStatus register(java.lang.String id,yarnwrap.world.chunk.ChunkStatus previous,java.util.EnumSet heightMapTypes,yarnwrap.world.chunk.ChunkType chunkType) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.register(id,previous.wrapperContained,heightMapTypes,chunkType.wrapperContained)); }
public boolean isLaterThan(yarnwrap.world.chunk.ChunkStatus other) { return wrapperContained.isLaterThan(other.wrapperContained); }
public boolean isAtMost(yarnwrap.world.chunk.ChunkStatus other) { return wrapperContained.isAtMost(other.wrapperContained); }
public boolean isEarlierThan(yarnwrap.world.chunk.ChunkStatus other) { return wrapperContained.isEarlierThan(other.wrapperContained); }
public java.lang.String getId() { return wrapperContained.getId(); }

}