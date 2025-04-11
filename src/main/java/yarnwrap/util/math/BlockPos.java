package yarnwrap.util.math;
public class BlockPos { public net.minecraft.util.math.BlockPos wrapperContained; public BlockPos(net.minecraft.util.math.BlockPos wrapperContained) { this.wrapperContained = wrapperContained; }

// public long BITS_Z() { return wrapperContained.BITS_Z; }
// public void BITS_Z(long value) { wrapperContained.BITS_Z = value; }
// public long BITS_Y() { return wrapperContained.BITS_Y; }
// public void BITS_Y(long value) { wrapperContained.BITS_Y = value; }
public int SIZE_BITS_Y() { return wrapperContained.SIZE_BITS_Y; }
// public void SIZE_BITS_Y(int value) { wrapperContained.SIZE_BITS_Y = value; }
// public long BITS_X() { return wrapperContained.BITS_X; }
// public void BITS_X(long value) { wrapperContained.BITS_X = value; }
// public int SIZE_BITS_Z() { return wrapperContained.SIZE_BITS_Z; }
// public void SIZE_BITS_Z(int value) { wrapperContained.SIZE_BITS_Z = value; }
// public int SIZE_BITS_X() { return wrapperContained.SIZE_BITS_X; }
// public void SIZE_BITS_X(int value) { wrapperContained.SIZE_BITS_X = value; }
public yarnwrap.util.math.BlockPos ORIGIN() { return new yarnwrap.util.math.BlockPos(wrapperContained.ORIGIN); }
// public void ORIGIN(yarnwrap.util.math.BlockPos value) { wrapperContained.ORIGIN = value.wrapperContained; }
// public int BIT_SHIFT_X() { return wrapperContained.BIT_SHIFT_X; }
// public void BIT_SHIFT_X(int value) { wrapperContained.BIT_SHIFT_X = value; }
// public int BIT_SHIFT_Z() { return wrapperContained.BIT_SHIFT_Z; }
// public void BIT_SHIFT_Z(int value) { wrapperContained.BIT_SHIFT_Z = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public BlockPos(yarnwrap.util.math.Vec3i pos) { this.wrapperContained = new net.minecraft.util.math.BlockPos(pos.wrapperContained); }
public long offset(long value,yarnwrap.util.math.Direction direction) { return wrapperContained.offset(value,direction.wrapperContained); }
public int unpackLongX(long packedPos) { return wrapperContained.unpackLongX(packedPos); }
public yarnwrap.util.math.BlockPos toImmutable() { return new yarnwrap.util.math.BlockPos(wrapperContained.toImmutable()); }
public long asLong() { return wrapperContained.asLong(); }
public long asLong(int x,int y,int z) { return wrapperContained.asLong(x,y,z); }
public yarnwrap.util.math.BlockPos west() { return new yarnwrap.util.math.BlockPos(wrapperContained.west()); }
public yarnwrap.util.math.BlockPos rotate(yarnwrap.util.BlockRotation rotation) { return new yarnwrap.util.math.BlockPos(wrapperContained.rotate(rotation.wrapperContained)); }
public int unpackLongY(long packedPos) { return wrapperContained.unpackLongY(packedPos); }
public yarnwrap.util.math.BlockPos south() { return new yarnwrap.util.math.BlockPos(wrapperContained.south()); }
public yarnwrap.util.math.BlockPos crossProduct(yarnwrap.util.math.Vec3i pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.crossProduct(pos.wrapperContained)); }
public yarnwrap.util.math.BlockPos north(int distance) { return new yarnwrap.util.math.BlockPos(wrapperContained.north(distance)); }
public yarnwrap.util.math.BlockPos south(int distance) { return new yarnwrap.util.math.BlockPos(wrapperContained.south(distance)); }
public yarnwrap.util.math.BlockPos east() { return new yarnwrap.util.math.BlockPos(wrapperContained.east()); }
public int unpackLongZ(long packedPos) { return wrapperContained.unpackLongZ(packedPos); }
public yarnwrap.util.math.BlockPos up() { return new yarnwrap.util.math.BlockPos(wrapperContained.up()); }
public yarnwrap.util.math.BlockPos up(int distance) { return new yarnwrap.util.math.BlockPos(wrapperContained.up(distance)); }
public yarnwrap.util.math.BlockPos west(int distance) { return new yarnwrap.util.math.BlockPos(wrapperContained.west(distance)); }
public yarnwrap.util.math.BlockPos east(int distance) { return new yarnwrap.util.math.BlockPos(wrapperContained.east(distance)); }
public long removeChunkSectionLocalY(long y) { return wrapperContained.removeChunkSectionLocalY(y); }
public yarnwrap.util.math.BlockPos fromLong(long packedPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.fromLong(packedPos)); }
public java.lang.Iterable iterate(int startX,int startY,int startZ,int endX,int endY,int endZ) { return wrapperContained.iterate(startX,startY,startZ,endX,endY,endZ); }
public yarnwrap.util.math.BlockPos north() { return new yarnwrap.util.math.BlockPos(wrapperContained.north()); }
public long add(long value,int x,int y,int z) { return wrapperContained.add(value,x,y,z); }
public java.lang.Iterable iterate(yarnwrap.util.math.BlockPos start,yarnwrap.util.math.BlockPos end) { return wrapperContained.iterate(start.wrapperContained,end.wrapperContained); }
public java.util.stream.Stream stream(int startX,int startY,int startZ,int endX,int endY,int endZ) { return wrapperContained.stream(startX,startY,startZ,endX,endY,endZ); }
public java.util.stream.Stream stream(yarnwrap.util.math.BlockPos start,yarnwrap.util.math.BlockPos end) { return wrapperContained.stream(start.wrapperContained,end.wrapperContained); }
public java.util.stream.Stream stream(yarnwrap.util.math.BlockBox box) { return wrapperContained.stream(box.wrapperContained); }
public Object mutableCopy() { return wrapperContained.mutableCopy(); }
public java.lang.Iterable iterateOutwards(yarnwrap.util.math.BlockPos center,int rangeX,int rangeY,int rangeZ) { return wrapperContained.iterateOutwards(center.wrapperContained,rangeX,rangeY,rangeZ); }
public java.util.Optional findClosest(yarnwrap.util.math.BlockPos pos,int horizontalRange,int verticalRange,java.util.function.Predicate condition) { return wrapperContained.findClosest(pos.wrapperContained,horizontalRange,verticalRange,condition); }
public java.util.stream.Stream streamOutwards(yarnwrap.util.math.BlockPos center,int maxX,int maxY,int maxZ) { return wrapperContained.streamOutwards(center.wrapperContained,maxX,maxY,maxZ); }
public java.lang.Iterable iterateRandomly(yarnwrap.util.math.random.Random random,int count,int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { return wrapperContained.iterateRandomly(random.wrapperContained,count,minX,minY,minZ,maxX,maxY,maxZ); }
// public java.util.stream.IntStream method_29093(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_29093(pos.wrapperContained); }
// public com.mojang.serialization.DataResult method_29094(java.util.stream.IntStream stream) { return wrapperContained.method_29094(stream); }
// public yarnwrap.util.math.BlockPos method_29095(int values) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_29095(values)); }
public java.util.stream.Stream stream(yarnwrap.util.math.Box box) { return wrapperContained.stream(box.wrapperContained); }
public java.lang.Iterable iterateInSquare(yarnwrap.util.math.BlockPos center,int radius,yarnwrap.util.math.Direction firstDirection,yarnwrap.util.math.Direction secondDirection) { return wrapperContained.iterateInSquare(center.wrapperContained,radius,firstDirection.wrapperContained,secondDirection.wrapperContained); }
public yarnwrap.util.math.BlockPos withY(int y) { return new yarnwrap.util.math.BlockPos(wrapperContained.withY(y)); }
public java.lang.Iterable iterateRandomly(yarnwrap.util.math.random.Random random,int count,yarnwrap.util.math.BlockPos around,int range) { return wrapperContained.iterateRandomly(random.wrapperContained,count,around.wrapperContained,range); }
public yarnwrap.util.math.Vec3d toCenterPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.toCenterPos()); }
public yarnwrap.util.math.BlockPos ofFloored(double x,double y,double z) { return new yarnwrap.util.math.BlockPos(wrapperContained.ofFloored(x,y,z)); }
public yarnwrap.util.math.BlockPos ofFloored(yarnwrap.util.math.Position pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.ofFloored(pos.wrapperContained)); }
public int iterateRecursively(yarnwrap.util.math.BlockPos pos,int maxDepth,int maxIterations,java.util.function.BiConsumer nextQueuer,java.util.function.Predicate callback) { return wrapperContained.iterateRecursively(pos.wrapperContained,maxDepth,maxIterations,nextQueuer,callback); }
// public void method_49926(java.util.Queue queuedPos) { wrapperContained.method_49926(queuedPos); }
public java.util.stream.Stream streamSouthEastSquare(yarnwrap.util.math.BlockPos pos) { return wrapperContained.streamSouthEastSquare(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos min(yarnwrap.util.math.BlockPos a,yarnwrap.util.math.BlockPos b) { return new yarnwrap.util.math.BlockPos(wrapperContained.min(a.wrapperContained,b.wrapperContained)); }
public yarnwrap.util.math.BlockPos max(yarnwrap.util.math.BlockPos a,yarnwrap.util.math.BlockPos b) { return new yarnwrap.util.math.BlockPos(wrapperContained.max(a.wrapperContained,b.wrapperContained)); }
public yarnwrap.util.math.Vec3d clampToWithin(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.clampToWithin(pos.wrapperContained)); }
public yarnwrap.util.math.Vec3d toBottomCenterPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.toBottomCenterPos()); }

}