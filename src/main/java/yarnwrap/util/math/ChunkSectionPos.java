package yarnwrap.util.math;
public class ChunkSectionPos { public net.minecraft.util.math.ChunkSectionPos wrapperContained; public ChunkSectionPos(net.minecraft.util.math.ChunkSectionPos wrapperContained) { this.wrapperContained = wrapperContained; }

public int getSectionX() { return wrapperContained.getSectionX(); }
public int getSectionCoord(int coord) { return wrapperContained.getSectionCoord(coord); }
public yarnwrap.util.math.ChunkSectionPos from(int x,int y,int z) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(x,y,z)); }
public yarnwrap.util.math.ChunkSectionPos from(long packed) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(packed)); }
public long offset(long packed,int x,int y,int z) { return wrapperContained.offset(packed,x,y,z); }
public long offset(long packed,yarnwrap.util.math.Direction direction) { return wrapperContained.offset(packed,direction.wrapperContained); }
public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.Position pos) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(pos.wrapperContained)); }
public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.ChunkPos chunkPos,int y) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(chunkPos.wrapperContained,y)); }
public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(pos.wrapperContained)); }
public int getSectionY() { return wrapperContained.getSectionY(); }
public int getLocalCoord(int coord) { return wrapperContained.getLocalCoord(coord); }
public long asLong(int x,int y,int z) { return wrapperContained.asLong(x,y,z); }
public int unpackX(long packed) { return wrapperContained.unpackX(packed); }
public int getSectionZ() { return wrapperContained.getSectionZ(); }
public int getBlockCoord(int sectionCoord) { return wrapperContained.getBlockCoord(sectionCoord); }
public int unpackY(long packed) { return wrapperContained.unpackY(packed); }
public int unpackZ(long packed) { return wrapperContained.unpackZ(packed); }
public long fromBlockPos(long blockPos) { return wrapperContained.fromBlockPos(blockPos); }
public yarnwrap.util.math.ChunkPos toChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.toChunkPos()); }
public long withZeroY(long pos) { return wrapperContained.withZeroY(pos); }
public long asLong() { return wrapperContained.asLong(); }
public short packLocal(yarnwrap.util.math.BlockPos pos) { return wrapperContained.packLocal(pos.wrapperContained); }
public int getMinX() { return wrapperContained.getMinX(); }
public int getMinY() { return wrapperContained.getMinY(); }
public int getMinZ() { return wrapperContained.getMinZ(); }
public int getMaxX() { return wrapperContained.getMaxX(); }
public int getMaxY() { return wrapperContained.getMaxY(); }
public int getMaxZ() { return wrapperContained.getMaxZ(); }
public java.util.stream.Stream streamBlocks() { return wrapperContained.streamBlocks(); }
public yarnwrap.util.math.BlockPos getMinPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getMinPos()); }
public yarnwrap.util.math.BlockPos getCenterPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getCenterPos()); }
public java.util.stream.Stream stream(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { return wrapperContained.stream(minX,minY,minZ,maxX,maxY,maxZ); }
public java.util.stream.Stream stream(yarnwrap.util.math.ChunkSectionPos center,int radius) { return wrapperContained.stream(center.wrapperContained,radius); }
public java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos center,int radius,int minY,int maxY) { return wrapperContained.stream(center.wrapperContained,radius,minY,maxY); }
public int unpackLocalX(short packedLocalPos) { return wrapperContained.unpackLocalX(packedLocalPos); }
public int unpackLocalY(short packedLocalPos) { return wrapperContained.unpackLocalY(packedLocalPos); }
public int unpackLocalZ(short packedLocalPos) { return wrapperContained.unpackLocalZ(packedLocalPos); }
public int unpackBlockX(short packedLocalPos) { return wrapperContained.unpackBlockX(packedLocalPos); }
public int unpackBlockY(short packedLocalPos) { return wrapperContained.unpackBlockY(packedLocalPos); }
public int unpackBlockZ(short packedLocalPos) { return wrapperContained.unpackBlockZ(packedLocalPos); }
public yarnwrap.util.math.BlockPos unpackBlockPos(short packedLocalPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.unpackBlockPos(packedLocalPos)); }
public int getSectionCoord(double coord) { return wrapperContained.getSectionCoord(coord); }
public int getOffsetPos(int chunkCoord,int offset) { return wrapperContained.getOffsetPos(chunkCoord,offset); }
public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.world.chunk.Chunk chunk) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(chunk.wrapperContained)); }
public long toLong(yarnwrap.util.math.BlockPos pos) { return wrapperContained.toLong(pos.wrapperContained); }
public void forEachChunkSectionAround(int x,int y,int z,it.unimi.dsi.fastutil.longs.LongConsumer consumer) { wrapperContained.forEachChunkSectionAround(x,y,z,consumer); }
public void forEachChunkSectionAround(long pos,it.unimi.dsi.fastutil.longs.LongConsumer consumer) { wrapperContained.forEachChunkSectionAround(pos,consumer); }
public void forEachChunkSectionAround(yarnwrap.util.math.BlockPos pos,it.unimi.dsi.fastutil.longs.LongConsumer consumer) { wrapperContained.forEachChunkSectionAround(pos.wrapperContained,consumer); }
public yarnwrap.util.math.ChunkSectionPos from(yarnwrap.world.entity.EntityLike entity) { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.from(entity.wrapperContained)); }
public int getSectionCoordFloored(double coord) { return wrapperContained.getSectionCoordFloored(coord); }
public long withZeroY(int x,int z) { return wrapperContained.withZeroY(x,z); }

}