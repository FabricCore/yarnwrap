package yarnwrap.util.math;
public class ChunkPos { public net.minecraft.util.math.ChunkPos wrapperContained; public ChunkPos(net.minecraft.util.math.ChunkPos wrapperContained) { this.wrapperContained = wrapperContained; }

// public long MARKER() { return wrapperContained.MARKER; }
// public void MARKER(long value) { wrapperContained.MARKER = value; }
public static long MARKER() { return net.minecraft.util.math.ChunkPos.MARKER; }
// public static void MARKER(long value, ) { net.minecraft.util.math.ChunkPos.MARKER = value; }

// public yarnwrap.util.math.ChunkPos ORIGIN() { return new yarnwrap.util.math.ChunkPos(wrapperContained.ORIGIN); }
// public void ORIGIN(yarnwrap.util.math.ChunkPos value) { wrapperContained.ORIGIN = value.wrapperContained; }
public static yarnwrap.util.math.ChunkPos ORIGIN() { return new yarnwrap.util.math.ChunkPos(net.minecraft.util.math.ChunkPos.ORIGIN); }
// public static void ORIGIN(yarnwrap.util.math.ChunkPos value, ) { net.minecraft.util.math.ChunkPos.ORIGIN = value.wrapperContained; }

public int z() { return wrapperContained.z; }
// public void z(int value) { wrapperContained.z = value; }
// public static int z() { return net.minecraft.util.math.ChunkPos.z; }
// public static void z(int value, ) { net.minecraft.util.math.ChunkPos.z = value; }

public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.util.math.ChunkPos.x; }
// public static void x(int value, ) { net.minecraft.util.math.ChunkPos.x = value; }

public ChunkPos(int x,int z) { this.wrapperContained = new net.minecraft.util.math.ChunkPos(x,z); }
public ChunkPos(long pos) { this.wrapperContained = new net.minecraft.util.math.ChunkPos(pos); }
public ChunkPos(yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.util.math.ChunkPos(pos.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.math.ChunkPos.equals(o); }
public int getRegionX() { return wrapperContained.getRegionX(); }
// public static int getRegionX() { return net.minecraft.util.math.ChunkPos.getRegionX(); }
public int getRegionZ() { return wrapperContained.getRegionZ(); }
// public static int getRegionZ() { return net.minecraft.util.math.ChunkPos.getRegionZ(); }
public int getRegionRelativeX() { return wrapperContained.getRegionRelativeX(); }
// public static int getRegionRelativeX() { return net.minecraft.util.math.ChunkPos.getRegionRelativeX(); }
public int getRegionRelativeZ() { return wrapperContained.getRegionRelativeZ(); }
// public static int getRegionRelativeZ() { return net.minecraft.util.math.ChunkPos.getRegionRelativeZ(); }
// public java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos center,int radius) { return wrapperContained.stream(center.wrapperContained,radius); }
// public static java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos center,int radius, ) { return net.minecraft.util.math.ChunkPos.stream(center.wrapperContained,radius); }
// public java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos pos1,yarnwrap.util.math.ChunkPos pos2) { return wrapperContained.stream(pos1.wrapperContained,pos2.wrapperContained); }
// public static java.util.stream.Stream stream(yarnwrap.util.math.ChunkPos pos1,yarnwrap.util.math.ChunkPos pos2, ) { return net.minecraft.util.math.ChunkPos.stream(pos1.wrapperContained,pos2.wrapperContained); }
public int getChebyshevDistance(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getChebyshevDistance(pos.wrapperContained); }
// public static int getChebyshevDistance(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.util.math.ChunkPos.getChebyshevDistance(pos.wrapperContained); }
public int getOffsetX(int offset) { return wrapperContained.getOffsetX(offset); }
// public static int getOffsetX(int offset, ) { return net.minecraft.util.math.ChunkPos.getOffsetX(offset); }
public int getCenterX() { return wrapperContained.getCenterX(); }
// public static int getCenterX() { return net.minecraft.util.math.ChunkPos.getCenterX(); }
public int getOffsetZ(int offset) { return wrapperContained.getOffsetZ(offset); }
// public static int getOffsetZ(int offset, ) { return net.minecraft.util.math.ChunkPos.getOffsetZ(offset); }
public int getCenterZ() { return wrapperContained.getCenterZ(); }
// public static int getCenterZ() { return net.minecraft.util.math.ChunkPos.getCenterZ(); }
public yarnwrap.util.math.BlockPos getCenterAtY(int y) { return new yarnwrap.util.math.BlockPos(wrapperContained.getCenterAtY(y)); }
// public static yarnwrap.util.math.BlockPos getCenterAtY(int y, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.util.math.ChunkPos.getCenterAtY(y)); }
public yarnwrap.util.math.BlockPos getBlockPos(int offsetX,int y,int offsetZ) { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos(offsetX,y,offsetZ)); }
// public static yarnwrap.util.math.BlockPos getBlockPos(int offsetX,int y,int offsetZ, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.util.math.ChunkPos.getBlockPos(offsetX,y,offsetZ)); }
// public long toLong(yarnwrap.util.math.BlockPos pos) { return wrapperContained.toLong(pos.wrapperContained); }
// public static long toLong(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.util.math.ChunkPos.toLong(pos.wrapperContained); }
// public yarnwrap.util.math.ChunkPos fromRegion(int x,int z) { return new yarnwrap.util.math.ChunkPos(wrapperContained.fromRegion(x,z)); }
// public static yarnwrap.util.math.ChunkPos fromRegion(int x,int z, ) { return new yarnwrap.util.math.ChunkPos(net.minecraft.util.math.ChunkPos.fromRegion(x,z)); }
// public yarnwrap.util.math.ChunkPos fromRegionCenter(int x,int z) { return new yarnwrap.util.math.ChunkPos(wrapperContained.fromRegionCenter(x,z)); }
// public static yarnwrap.util.math.ChunkPos fromRegionCenter(int x,int z, ) { return new yarnwrap.util.math.ChunkPos(net.minecraft.util.math.ChunkPos.fromRegionCenter(x,z)); }
// public int hashCode(int x,int z) { return wrapperContained.hashCode(x,z); }
// public static int hashCode(int x,int z, ) { return net.minecraft.util.math.ChunkPos.hashCode(x,z); }
public int getSquaredDistance(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.getSquaredDistance(pos.wrapperContained); }
// public static int getSquaredDistance(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.util.math.ChunkPos.getSquaredDistance(pos.wrapperContained); }
public int getSquaredDistance(long pos) { return wrapperContained.getSquaredDistance(pos); }
// public static int getSquaredDistance(long pos, ) { return net.minecraft.util.math.ChunkPos.getSquaredDistance(pos); }
// public int getSquaredDistance(int x,int z) { return wrapperContained.getSquaredDistance(x,z); }
// public static int getSquaredDistance(int x,int z, ) { return net.minecraft.util.math.ChunkPos.getSquaredDistance(x,z); }
public int getChebyshevDistance(int x,int z) { return wrapperContained.getChebyshevDistance(x,z); }
// public static int getChebyshevDistance(int x,int z, ) { return net.minecraft.util.math.ChunkPos.getChebyshevDistance(x,z); }
public yarnwrap.util.math.BlockPos getStartPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getStartPos()); }
// public static yarnwrap.util.math.BlockPos getStartPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.util.math.ChunkPos.getStartPos()); }
public long toLong() { return wrapperContained.toLong(); }
// public static long toLong() { return net.minecraft.util.math.ChunkPos.toLong(); }
// public int getPackedX(long pos) { return wrapperContained.getPackedX(pos); }
// public static int getPackedX(long pos, ) { return net.minecraft.util.math.ChunkPos.getPackedX(pos); }
public int getStartX() { return wrapperContained.getStartX(); }
// public static int getStartX() { return net.minecraft.util.math.ChunkPos.getStartX(); }
public int getEndX() { return wrapperContained.getEndX(); }
// public static int getEndX() { return net.minecraft.util.math.ChunkPos.getEndX(); }
public int getStartZ() { return wrapperContained.getStartZ(); }
// public static int getStartZ() { return net.minecraft.util.math.ChunkPos.getStartZ(); }
public int getEndZ() { return wrapperContained.getEndZ(); }
// public static int getEndZ() { return net.minecraft.util.math.ChunkPos.getEndZ(); }
// public long toLong(int chunkX,int chunkZ) { return wrapperContained.toLong(chunkX,chunkZ); }
// public static long toLong(int chunkX,int chunkZ, ) { return net.minecraft.util.math.ChunkPos.toLong(chunkX,chunkZ); }
// public int getPackedZ(long pos) { return wrapperContained.getPackedZ(pos); }
// public static int getPackedZ(long pos, ) { return net.minecraft.util.math.ChunkPos.getPackedZ(pos); }

}