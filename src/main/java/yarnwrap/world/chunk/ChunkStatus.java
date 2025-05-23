package yarnwrap.world.chunk;
public class ChunkStatus { public net.minecraft.world.chunk.ChunkStatus wrapperContained; public ChunkStatus(net.minecraft.world.chunk.ChunkStatus wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.ChunkType chunkType() { return new yarnwrap.world.chunk.ChunkType(wrapperContained.chunkType); }
// public void chunkType(yarnwrap.world.chunk.ChunkType value) { wrapperContained.chunkType = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkType chunkType() { return new yarnwrap.world.chunk.ChunkType(net.minecraft.world.chunk.ChunkStatus.chunkType); }
// public static void chunkType(yarnwrap.world.chunk.ChunkType value, ) { net.minecraft.world.chunk.ChunkStatus.chunkType = value.wrapperContained; }

// public java.util.EnumSet heightMapTypes() { return wrapperContained.heightMapTypes; }
// public void heightMapTypes(java.util.EnumSet value) { wrapperContained.heightMapTypes = value; }
// public static java.util.EnumSet heightMapTypes() { return net.minecraft.world.chunk.ChunkStatus.heightMapTypes; }
// public static void heightMapTypes(java.util.EnumSet value, ) { net.minecraft.world.chunk.ChunkStatus.heightMapTypes = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.world.chunk.ChunkStatus.index; }
// public static void index(int value, ) { net.minecraft.world.chunk.ChunkStatus.index = value; }

// public yarnwrap.world.chunk.ChunkStatus previous() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.previous); }
// public void previous(yarnwrap.world.chunk.ChunkStatus value) { wrapperContained.previous = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkStatus previous() { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.ChunkStatus.previous); }
// public static void previous(yarnwrap.world.chunk.ChunkStatus value, ) { net.minecraft.world.chunk.ChunkStatus.previous = value.wrapperContained; }

// public java.util.EnumSet NORMAL_HEIGHTMAP_TYPES() { return wrapperContained.NORMAL_HEIGHTMAP_TYPES; }
// public void NORMAL_HEIGHTMAP_TYPES(java.util.EnumSet value) { wrapperContained.NORMAL_HEIGHTMAP_TYPES = value; }
public static java.util.EnumSet NORMAL_HEIGHTMAP_TYPES() { return net.minecraft.world.chunk.ChunkStatus.NORMAL_HEIGHTMAP_TYPES; }
// public static void NORMAL_HEIGHTMAP_TYPES(java.util.EnumSet value, ) { net.minecraft.world.chunk.ChunkStatus.NORMAL_HEIGHTMAP_TYPES = value; }

// public java.util.EnumSet WORLD_GEN_HEIGHTMAP_TYPES() { return wrapperContained.WORLD_GEN_HEIGHTMAP_TYPES; }
// public void WORLD_GEN_HEIGHTMAP_TYPES(java.util.EnumSet value) { wrapperContained.WORLD_GEN_HEIGHTMAP_TYPES = value; }
// public static java.util.EnumSet WORLD_GEN_HEIGHTMAP_TYPES() { return net.minecraft.world.chunk.ChunkStatus.WORLD_GEN_HEIGHTMAP_TYPES; }
// public static void WORLD_GEN_HEIGHTMAP_TYPES(java.util.EnumSet value, ) { net.minecraft.world.chunk.ChunkStatus.WORLD_GEN_HEIGHTMAP_TYPES = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.chunk.ChunkStatus.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.chunk.ChunkStatus.CODEC = value; }

// public ChunkStatus(yarnwrap.world.chunk.ChunkStatus previous,java.util.EnumSet heightMapTypes,yarnwrap.world.chunk.ChunkType chunkType) { this.wrapperContained = new net.minecraft.world.chunk.ChunkStatus(previous.wrapperContained,heightMapTypes,chunkType.wrapperContained); }
public java.util.EnumSet getHeightmapTypes() { return wrapperContained.getHeightmapTypes(); }
// public static java.util.EnumSet getHeightmapTypes() { return net.minecraft.world.chunk.ChunkStatus.getHeightmapTypes(); }
public yarnwrap.world.chunk.ChunkType getChunkType() { return new yarnwrap.world.chunk.ChunkType(wrapperContained.getChunkType()); }
// public static yarnwrap.world.chunk.ChunkType getChunkType() { return new yarnwrap.world.chunk.ChunkType(net.minecraft.world.chunk.ChunkStatus.getChunkType()); }
public boolean isAtLeast(yarnwrap.world.chunk.ChunkStatus other) { return wrapperContained.isAtLeast(other.wrapperContained); }
// public static boolean isAtLeast(yarnwrap.world.chunk.ChunkStatus other, ) { return net.minecraft.world.chunk.ChunkStatus.isAtLeast(other.wrapperContained); }
// public yarnwrap.world.chunk.ChunkStatus byId(java.lang.String id) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.byId(id)); }
// public static yarnwrap.world.chunk.ChunkStatus byId(java.lang.String id, ) { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.ChunkStatus.byId(id)); }
// public java.util.List createOrderedList() { return wrapperContained.createOrderedList(); }
public static java.util.List createOrderedList() { return net.minecraft.world.chunk.ChunkStatus.createOrderedList(); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.world.chunk.ChunkStatus.getIndex(); }
public yarnwrap.world.chunk.ChunkStatus getPrevious() { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.getPrevious()); }
// public static yarnwrap.world.chunk.ChunkStatus getPrevious() { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.ChunkStatus.getPrevious()); }
// public yarnwrap.world.chunk.ChunkStatus max(yarnwrap.world.chunk.ChunkStatus a,yarnwrap.world.chunk.ChunkStatus b) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.max(a.wrapperContained,b.wrapperContained)); }
// public static yarnwrap.world.chunk.ChunkStatus max(yarnwrap.world.chunk.ChunkStatus a,yarnwrap.world.chunk.ChunkStatus b, ) { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.ChunkStatus.max(a.wrapperContained,b.wrapperContained)); }
// public yarnwrap.world.chunk.ChunkStatus register(java.lang.String id,yarnwrap.world.chunk.ChunkStatus previous,java.util.EnumSet heightMapTypes,yarnwrap.world.chunk.ChunkType chunkType) { return new yarnwrap.world.chunk.ChunkStatus(wrapperContained.register(id,previous.wrapperContained,heightMapTypes,chunkType.wrapperContained)); }
// public static yarnwrap.world.chunk.ChunkStatus register(java.lang.String id,yarnwrap.world.chunk.ChunkStatus previous,java.util.EnumSet heightMapTypes,yarnwrap.world.chunk.ChunkType chunkType, ) { return new yarnwrap.world.chunk.ChunkStatus(net.minecraft.world.chunk.ChunkStatus.register(id,previous.wrapperContained,heightMapTypes,chunkType.wrapperContained)); }
public boolean isLaterThan(yarnwrap.world.chunk.ChunkStatus other) { return wrapperContained.isLaterThan(other.wrapperContained); }
// public static boolean isLaterThan(yarnwrap.world.chunk.ChunkStatus other, ) { return net.minecraft.world.chunk.ChunkStatus.isLaterThan(other.wrapperContained); }
public boolean isAtMost(yarnwrap.world.chunk.ChunkStatus other) { return wrapperContained.isAtMost(other.wrapperContained); }
// public static boolean isAtMost(yarnwrap.world.chunk.ChunkStatus other, ) { return net.minecraft.world.chunk.ChunkStatus.isAtMost(other.wrapperContained); }
public boolean isEarlierThan(yarnwrap.world.chunk.ChunkStatus other) { return wrapperContained.isEarlierThan(other.wrapperContained); }
// public static boolean isEarlierThan(yarnwrap.world.chunk.ChunkStatus other, ) { return net.minecraft.world.chunk.ChunkStatus.isEarlierThan(other.wrapperContained); }
public java.lang.String getId() { return wrapperContained.getId(); }
// public static java.lang.String getId() { return net.minecraft.world.chunk.ChunkStatus.getId(); }

}