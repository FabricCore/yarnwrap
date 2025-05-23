package yarnwrap.util.math;
public class ChunkSectionPos { public net.minecraft.util.math.ChunkSectionPos wrapperContained; public ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos wrapperContained) { this.wrapperContained = wrapperContained; }

public int getSectionX() { return wrapperContained.getSectionX(); }
// public static int getSectionX() { return net.minecraft.util.math.ChunkSectionPos.getSectionX(); }
// public int getSectionCoord(int coord) { return wrapperContained.getSectionCoord(coord); }
// public static int getSectionCoord(int coord, ) { return net.minecraft.util.math.ChunkSectionPos.getSectionCoord(coord); }
// public yarnwrap.util.math.ChunkSectionPos from(int x,int y,int z) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(x,y,z)); }
// public static yarnwrap.util.math.ChunkSectionPos from(int x,int y,int z, ) { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos.from(x,y,z)); }
// public yarnwrap.util.math.ChunkSectionPos from(long packed) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(packed)); }
// public static yarnwrap.util.math.ChunkSectionPos from(long packed, ) { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos.from(packed)); }
// public long offset(long packed,int x,int y,int z) { return wrapperContained.offset(packed,x,y,z); }
// public static long offset(long packed,int x,int y,int z, ) { return net.minecraft.util.math.ChunkSectionPos.offset(packed,x,y,z); }
// public long offset(long packed,yarnwrap.util.math.Direction direction) { return wrapperContained.offset(packed,direction.wrapperContained); }
// public static long offset(long packed,yarnwrap.util.math.Direction direction, ) { return net.minecraft.util.math.ChunkSectionPos.offset(packed,direction.wrapperContained); }
// public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.Position pos) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(pos.wrapperContained)); }
// public static yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.Position pos, ) { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos.from(pos.wrapperContained)); }
// public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.ChunkPos chunkPos,int y) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(chunkPos.wrapperContained,y)); }
// public static yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.ChunkPos chunkPos,int y, ) { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos.from(chunkPos.wrapperContained,y)); }
// public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(pos.wrapperContained)); }
// public static yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos.from(pos.wrapperContained)); }
public int getSectionY() { return wrapperContained.getSectionY(); }
// public static int getSectionY() { return net.minecraft.util.math.ChunkSectionPos.getSectionY(); }
// public int getLocalCoord(int coord) { return wrapperContained.getLocalCoord(coord); }
// public static int getLocalCoord(int coord, ) { return net.minecraft.util.math.ChunkSectionPos.getLocalCoord(coord); }
// public long asLong(int x,int y,int z) { return wrapperContained.asLong(x,y,z); }
// public static long asLong(int x,int y,int z, ) { return net.minecraft.util.math.ChunkSectionPos.asLong(x,y,z); }
// public int unpackX(long packed) { return wrapperContained.unpackX(packed); }
// public static int unpackX(long packed, ) { return net.minecraft.util.math.ChunkSectionPos.unpackX(packed); }
public int getSectionZ() { return wrapperContained.getSectionZ(); }
// public static int getSectionZ() { return net.minecraft.util.math.ChunkSectionPos.getSectionZ(); }
// public int getBlockCoord(int sectionCoord) { return wrapperContained.getBlockCoord(sectionCoord); }
// public static int getBlockCoord(int sectionCoord, ) { return net.minecraft.util.math.ChunkSectionPos.getBlockCoord(sectionCoord); }
// public int unpackY(long packed) { return wrapperContained.unpackY(packed); }
// public static int unpackY(long packed, ) { return net.minecraft.util.math.ChunkSectionPos.unpackY(packed); }
// public int unpackZ(long packed) { return wrapperContained.unpackZ(packed); }
// public static int unpackZ(long packed, ) { return net.minecraft.util.math.ChunkSectionPos.unpackZ(packed); }
// public long fromBlockPos(long blockPos) { return wrapperContained.fromBlockPos(blockPos); }
// public static long fromBlockPos(long blockPos, ) { return net.minecraft.util.math.ChunkSectionPos.fromBlockPos(blockPos); }
public yarnwrap.util.math.ChunkPos toChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.toChunkPos()); }
// public static yarnwrap.util.math.ChunkPos toChunkPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.util.math.ChunkSectionPos.toChunkPos()); }
// public long withZeroY(long pos) { return wrapperContained.withZeroY(pos); }
// public static long withZeroY(long pos, ) { return net.minecraft.util.math.ChunkSectionPos.withZeroY(pos); }
public long asLong() { return wrapperContained.asLong(); }
// public static long asLong() { return net.minecraft.util.math.ChunkSectionPos.asLong(); }
// public short packLocal(yarnwrap.util.math.BlockPos pos) { return wrapperContained.packLocal(pos.wrapperContained); }
// public static short packLocal(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.util.math.ChunkSectionPos.packLocal(pos.wrapperContained); }
public int getMinX() { return wrapperContained.getMinX(); }
// public static int getMinX() { return net.minecraft.util.math.ChunkSectionPos.getMinX(); }
public int getMinY() { return wrapperContained.getMinY(); }
// public static int getMinY() { return net.minecraft.util.math.ChunkSectionPos.getMinY(); }
public int getMinZ() { return wrapperContained.getMinZ(); }
// public static int getMinZ() { return net.minecraft.util.math.ChunkSectionPos.getMinZ(); }
public int getMaxX() { return wrapperContained.getMaxX(); }
// public static int getMaxX() { return net.minecraft.util.math.ChunkSectionPos.getMaxX(); }
public int getMaxY() { return wrapperContained.getMaxY(); }
// public static int getMaxY() { return net.minecraft.util.math.ChunkSectionPos.getMaxY(); }
public int getMaxZ() { return wrapperContained.getMaxZ(); }
// public static int getMaxZ() { return net.minecraft.util.math.ChunkSectionPos.getMaxZ(); }
public java.util.stream.Stream streamBlocks() { return wrapperContained.streamBlocks(); }
// public static java.util.stream.Stream streamBlocks() { return net.minecraft.util.math.ChunkSectionPos.streamBlocks(); }
public yarnwrap.util.math.BlockPos getMinPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getMinPos()); }
// public static yarnwrap.util.math.BlockPos getMinPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.util.math.ChunkSectionPos.getMinPos()); }
public yarnwrap.util.math.BlockPos getCenterPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getCenterPos()); }
// public static yarnwrap.util.math.BlockPos getCenterPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.util.math.ChunkSectionPos.getCenterPos()); }
// public java.util.stream.Stream stream(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { return wrapperContained.stream(minX,minY,minZ,maxX,maxY,maxZ); }
// public static java.util.stream.Stream stream(int minX,int minY,int minZ,int maxX,int maxY,int maxZ, ) { return net.minecraft.util.math.ChunkSectionPos.stream(minX,minY,minZ,maxX,maxY,maxZ); }
// public java.util.stream.Stream stream(yarnwrap.util.math.ChunkSectionPos center,int radius) { return wrapperContained.stream(center.wrapperContained,radius); }
// public static java.util.stream.Stream stream(yarnwrap.util.math.ChunkSectionPos center,int radius, ) { return net.minecraft.util.math.ChunkSectionPos.stream(center.wrapperContained,radius); }
// public java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos center,int radius,int minY,int maxY) { return wrapperContained.stream(center.wrapperContained,radius,minY,maxY); }
// public static java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos center,int radius,int minY,int maxY, ) { return net.minecraft.util.math.ChunkSectionPos.stream(center.wrapperContained,radius,minY,maxY); }
// public int unpackLocalX(short packedLocalPos) { return wrapperContained.unpackLocalX(packedLocalPos); }
// public static int unpackLocalX(short packedLocalPos, ) { return net.minecraft.util.math.ChunkSectionPos.unpackLocalX(packedLocalPos); }
// public int unpackLocalY(short packedLocalPos) { return wrapperContained.unpackLocalY(packedLocalPos); }
// public static int unpackLocalY(short packedLocalPos, ) { return net.minecraft.util.math.ChunkSectionPos.unpackLocalY(packedLocalPos); }
// public int unpackLocalZ(short packedLocalPos) { return wrapperContained.unpackLocalZ(packedLocalPos); }
// public static int unpackLocalZ(short packedLocalPos, ) { return net.minecraft.util.math.ChunkSectionPos.unpackLocalZ(packedLocalPos); }
public int unpackBlockX(short packedLocalPos) { return wrapperContained.unpackBlockX(packedLocalPos); }
// public static int unpackBlockX(short packedLocalPos, ) { return net.minecraft.util.math.ChunkSectionPos.unpackBlockX(packedLocalPos); }
public int unpackBlockY(short packedLocalPos) { return wrapperContained.unpackBlockY(packedLocalPos); }
// public static int unpackBlockY(short packedLocalPos, ) { return net.minecraft.util.math.ChunkSectionPos.unpackBlockY(packedLocalPos); }
public int unpackBlockZ(short packedLocalPos) { return wrapperContained.unpackBlockZ(packedLocalPos); }
// public static int unpackBlockZ(short packedLocalPos, ) { return net.minecraft.util.math.ChunkSectionPos.unpackBlockZ(packedLocalPos); }
public yarnwrap.util.math.BlockPos unpackBlockPos(short packedLocalPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.unpackBlockPos(packedLocalPos)); }
// public static yarnwrap.util.math.BlockPos unpackBlockPos(short packedLocalPos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.util.math.ChunkSectionPos.unpackBlockPos(packedLocalPos)); }
// public int getSectionCoord(double coord) { return wrapperContained.getSectionCoord(coord); }
// public static int getSectionCoord(double coord, ) { return net.minecraft.util.math.ChunkSectionPos.getSectionCoord(coord); }
// public int getOffsetPos(int chunkCoord,int offset) { return wrapperContained.getOffsetPos(chunkCoord,offset); }
// public static int getOffsetPos(int chunkCoord,int offset, ) { return net.minecraft.util.math.ChunkSectionPos.getOffsetPos(chunkCoord,offset); }
// public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.world.chunk.Chunk chunk) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(chunk.wrapperContained)); }
// public static yarnwrap.util.math.ChunkSectionPos from(yarnwrap.world.chunk.Chunk chunk, ) { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos.from(chunk.wrapperContained)); }
// public long toLong(yarnwrap.util.math.BlockPos pos) { return wrapperContained.toLong(pos.wrapperContained); }
// public static long toLong(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.util.math.ChunkSectionPos.toLong(pos.wrapperContained); }
// public void forEachChunkSectionAround(int x,int y,int z,it.unimi.dsi.fastutil.longs.LongConsumer consumer) { wrapperContained.forEachChunkSectionAround(x,y,z,consumer); }
// public static void forEachChunkSectionAround(int x,int y,int z,it.unimi.dsi.fastutil.longs.LongConsumer consumer, ) { net.minecraft.util.math.ChunkSectionPos.forEachChunkSectionAround(x,y,z,consumer); }
// public void forEachChunkSectionAround(long pos,it.unimi.dsi.fastutil.longs.LongConsumer consumer) { wrapperContained.forEachChunkSectionAround(pos,consumer); }
// public static void forEachChunkSectionAround(long pos,it.unimi.dsi.fastutil.longs.LongConsumer consumer, ) { net.minecraft.util.math.ChunkSectionPos.forEachChunkSectionAround(pos,consumer); }
// public void forEachChunkSectionAround(yarnwrap.util.math.BlockPos pos,it.unimi.dsi.fastutil.longs.LongConsumer consumer) { wrapperContained.forEachChunkSectionAround(pos.wrapperContained,consumer); }
// public static void forEachChunkSectionAround(yarnwrap.util.math.BlockPos pos,it.unimi.dsi.fastutil.longs.LongConsumer consumer, ) { net.minecraft.util.math.ChunkSectionPos.forEachChunkSectionAround(pos.wrapperContained,consumer); }
// public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.world.entity.EntityLike entity) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(entity.wrapperContained)); }
// public static yarnwrap.util.math.ChunkSectionPos from(yarnwrap.world.entity.EntityLike entity, ) { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos.from(entity.wrapperContained)); }
// public int getSectionCoordFloored(double coord) { return wrapperContained.getSectionCoordFloored(coord); }
// public static int getSectionCoordFloored(double coord, ) { return net.minecraft.util.math.ChunkSectionPos.getSectionCoordFloored(coord); }
// public long withZeroY(int x,int z) { return wrapperContained.withZeroY(x,z); }
// public static long withZeroY(int x,int z, ) { return net.minecraft.util.math.ChunkSectionPos.withZeroY(x,z); }
// public long toChunkPos(long sectionPos) { return wrapperContained.toChunkPos(sectionPos); }
// public static long toChunkPos(long sectionPos, ) { return net.minecraft.util.math.ChunkSectionPos.toChunkPos(sectionPos); }

}