package yarnwrap.util.math;
public class ChunkPos { public net.minecraft.util.math.ChunkPos wrapperContained; public ChunkPos(net.minecraft.util.math.ChunkPos wrapperContained) { this.wrapperContained = wrapperContained; }

public long MARKER() { return wrapperContained.MARKER; }
// public void MARKER(long value) { wrapperContained.MARKER = value; }
public yarnwrap.util.math.ChunkPos ORIGIN() { return new yarnwrap.util.math.ChunkPos(wrapperContained.ORIGIN); }
// public void ORIGIN(yarnwrap.util.math.ChunkPos value) { wrapperContained.ORIGIN = value.wrapperContained; }
public int z() { return wrapperContained.z; }
// public void z(int value) { wrapperContained.z = value; }
public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
public ChunkPos(int x,int z) { this.wrapperContained = new net.minecraft.util.math.ChunkPos(x,z); }
public ChunkPos(long pos) { this.wrapperContained = new net.minecraft.util.math.ChunkPos(pos); }
public ChunkPos(yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.util.math.ChunkPos(pos.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public int getRegionX() { return wrapperContained.getRegionX(); }
public int getRegionZ() { return wrapperContained.getRegionZ(); }
public int getRegionRelativeX() { return wrapperContained.getRegionRelativeX(); }
public int getRegionRelativeZ() { return wrapperContained.getRegionRelativeZ(); }
public java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos center,int radius) { return wrapperContained.stream(center.wrapperContained,radius); }
public java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos pos1,yarnwrap.util.math.ChunkPos pos2) { return wrapperContained.stream(pos1.wrapperContained,pos2.wrapperContained); }
public int getChebyshevDistance(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getChebyshevDistance(pos.wrapperContained); }
public int getOffsetX(int offset) { return wrapperContained.getOffsetX(offset); }
public int getCenterX() { return wrapperContained.getCenterX(); }
public int getOffsetZ(int offset) { return wrapperContained.getOffsetZ(offset); }
public int getCenterZ() { return wrapperContained.getCenterZ(); }
public yarnwrap.util.math.BlockPos getCenterAtY(int y) { return new yarnwrap.util.math.BlockPos(wrapperContained.getCenterAtY(y)); }
public yarnwrap.util.math.BlockPos getBlockPos(int offsetX,int y,int offsetZ) { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos(offsetX,y,offsetZ)); }
public long toLong(yarnwrap.util.math.BlockPos pos) { return wrapperContained.toLong(pos.wrapperContained); }
public yarnwrap.util.math.ChunkPos fromRegion(int x,int z) { return new yarnwrap.util.math.ChunkPos(wrapperContained.fromRegion(x,z)); }
public yarnwrap.util.math.ChunkPos fromRegionCenter(int x,int z) { return new yarnwrap.util.math.ChunkPos(wrapperContained.fromRegionCenter(x,z)); }
public int hashCode(int x,int z) { return wrapperContained.hashCode(x,z); }
public int getSquaredDistance(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getSquaredDistance(pos.wrapperContained); }
public int getSquaredDistance(long pos) { return wrapperContained.getSquaredDistance(pos); }
// public int getSquaredDistance(int x,int z) { return wrapperContained.getSquaredDistance(x,z); }
public int getChebyshevDistance(int x,int z) { return wrapperContained.getChebyshevDistance(x,z); }
public yarnwrap.util.math.BlockPos getStartPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getStartPos()); }
public long toLong() { return wrapperContained.toLong(); }
public int getPackedX(long pos) { return wrapperContained.getPackedX(pos); }
public int getStartX() { return wrapperContained.getStartX(); }
public int getEndX() { return wrapperContained.getEndX(); }
public int getStartZ() { return wrapperContained.getStartZ(); }
public int getEndZ() { return wrapperContained.getEndZ(); }
public long toLong(int chunkX,int chunkZ) { return wrapperContained.toLong(chunkX,chunkZ); }
public int getPackedZ(long pos) { return wrapperContained.getPackedZ(pos); }

}