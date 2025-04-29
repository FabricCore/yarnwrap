package yarnwrap.util.math;
public class BlockBox { public net.minecraft.util.math.BlockBox wrapperContained; public BlockBox(net.minecraft.util.math.BlockBox wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxY() { return wrapperContained.maxY; }
// public void maxY(int value) { wrapperContained.maxY = value; }
// public static int maxY() { return net.minecraft.util.math.BlockBox.maxY; }
// public static void maxY(int value, ) { net.minecraft.util.math.BlockBox.maxY = value; }

// public int maxX() { return wrapperContained.maxX; }
// public void maxX(int value) { wrapperContained.maxX = value; }
// public static int maxX() { return net.minecraft.util.math.BlockBox.maxX; }
// public static void maxX(int value, ) { net.minecraft.util.math.BlockBox.maxX = value; }

// public int minZ() { return wrapperContained.minZ; }
// public void minZ(int value) { wrapperContained.minZ = value; }
// public static int minZ() { return net.minecraft.util.math.BlockBox.minZ; }
// public static void minZ(int value, ) { net.minecraft.util.math.BlockBox.minZ = value; }

// public int minY() { return wrapperContained.minY; }
// public void minY(int value) { wrapperContained.minY = value; }
// public static int minY() { return net.minecraft.util.math.BlockBox.minY; }
// public static void minY(int value, ) { net.minecraft.util.math.BlockBox.minY = value; }

// public int minX() { return wrapperContained.minX; }
// public void minX(int value) { wrapperContained.minX = value; }
// public static int minX() { return net.minecraft.util.math.BlockBox.minX; }
// public static void minX(int value, ) { net.minecraft.util.math.BlockBox.minX = value; }

// public int maxZ() { return wrapperContained.maxZ; }
// public void maxZ(int value) { wrapperContained.maxZ = value; }
// public static int maxZ() { return net.minecraft.util.math.BlockBox.maxZ; }
// public static void maxZ(int value, ) { net.minecraft.util.math.BlockBox.maxZ = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.math.BlockBox.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.BlockBox.CODEC = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.math.BlockBox.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.math.BlockBox.LOGGER = value; }

public BlockBox(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { this.wrapperContained = new net.minecraft.util.math.BlockBox(minX,minY,minZ,maxX,maxY,maxZ); }
public BlockBox(yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.util.math.BlockBox(pos.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.math.BlockBox.equals(o); }
public boolean intersects(yarnwrap.util.math.BlockBox other) { return wrapperContained.intersects(other.wrapperContained); }
// public static boolean intersects(yarnwrap.util.math.BlockBox other, ) { return net.minecraft.util.math.BlockBox.intersects(other.wrapperContained); }
public yarnwrap.util.math.Vec3i getDimensions() { return new yarnwrap.util.math.Vec3i(wrapperContained.getDimensions()); }
// public static yarnwrap.util.math.Vec3i getDimensions() { return new yarnwrap.util.math.Vec3i(net.minecraft.util.math.BlockBox.getDimensions()); }
public int getBlockCountY() { return wrapperContained.getBlockCountY(); }
// public static int getBlockCountY() { return net.minecraft.util.math.BlockBox.getBlockCountY(); }
public yarnwrap.util.math.BlockBox move(int dx,int dy,int dz) { return new yarnwrap.util.math.BlockBox(wrapperContained.move(dx,dy,dz)); }
// public static yarnwrap.util.math.BlockBox move(int dx,int dy,int dz, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.move(dx,dy,dz)); }
public boolean contains(yarnwrap.util.math.Vec3i pos) { return wrapperContained.contains(pos.wrapperContained); }
// public static boolean contains(yarnwrap.util.math.Vec3i pos, ) { return net.minecraft.util.math.BlockBox.contains(pos.wrapperContained); }
public int getBlockCountZ() { return wrapperContained.getBlockCountZ(); }
// public static int getBlockCountZ() { return net.minecraft.util.math.BlockBox.getBlockCountZ(); }
// public yarnwrap.util.math.BlockBox infinite() { return new yarnwrap.util.math.BlockBox(wrapperContained.infinite()); }
public static yarnwrap.util.math.BlockBox infinite() { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.infinite()); }
// public yarnwrap.util.math.BlockBox rotated(int x,int y,int z,int offsetX,int offsetY,int offsetZ,int sizeX,int sizeY,int sizeZ,yarnwrap.util.math.Direction facing) { return new yarnwrap.util.math.BlockBox(wrapperContained.rotated(x,y,z,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,facing.wrapperContained)); }
// public static yarnwrap.util.math.BlockBox rotated(int x,int y,int z,int offsetX,int offsetY,int offsetZ,int sizeX,int sizeY,int sizeZ,yarnwrap.util.math.Direction facing, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.rotated(x,y,z,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,facing.wrapperContained)); }
public boolean intersectsXZ(int minX,int minZ,int maxX,int maxZ) { return wrapperContained.intersectsXZ(minX,minZ,maxX,maxZ); }
// public static boolean intersectsXZ(int minX,int minZ,int maxX,int maxZ, ) { return net.minecraft.util.math.BlockBox.intersectsXZ(minX,minZ,maxX,maxZ); }
public yarnwrap.util.math.BlockBox offset(int x,int y,int z) { return new yarnwrap.util.math.BlockBox(wrapperContained.offset(x,y,z)); }
// public static yarnwrap.util.math.BlockBox offset(int x,int y,int z, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.offset(x,y,z)); }
public yarnwrap.util.math.BlockPos getCenter() { return new yarnwrap.util.math.BlockPos(wrapperContained.getCenter()); }
// public static yarnwrap.util.math.BlockPos getCenter() { return new yarnwrap.util.math.BlockPos(net.minecraft.util.math.BlockBox.getCenter()); }
public yarnwrap.util.math.BlockBox move(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.BlockBox(wrapperContained.move(vec.wrapperContained)); }
// public static yarnwrap.util.math.BlockBox move(yarnwrap.util.math.Vec3i vec, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.move(vec.wrapperContained)); }
public yarnwrap.util.math.BlockBox encompass(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockBox(wrapperContained.encompass(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockBox encompass(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.encompass(pos.wrapperContained)); }
// public yarnwrap.util.math.BlockBox create(yarnwrap.util.math.Vec3i first,yarnwrap.util.math.Vec3i second) { return new yarnwrap.util.math.BlockBox(wrapperContained.create(first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.util.math.BlockBox create(yarnwrap.util.math.Vec3i first,yarnwrap.util.math.Vec3i second, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.create(first.wrapperContained,second.wrapperContained)); }
public void forEachVertex(java.util.function.Consumer consumer) { wrapperContained.forEachVertex(consumer); }
// public static void forEachVertex(java.util.function.Consumer consumer, ) { net.minecraft.util.math.BlockBox.forEachVertex(consumer); }
// public com.mojang.serialization.DataResult method_34392(java.util.stream.IntStream values) { return wrapperContained.method_34392(values); }
// public static com.mojang.serialization.DataResult method_34392(java.util.stream.IntStream values, ) { return net.minecraft.util.math.BlockBox.method_34392(values); }
// public yarnwrap.util.math.BlockBox method_34393(int array) { return new yarnwrap.util.math.BlockBox(wrapperContained.method_34393(array)); }
// public static yarnwrap.util.math.BlockBox method_34393(int array, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.method_34393(array)); }
// public java.util.stream.IntStream method_34394(yarnwrap.util.math.BlockBox box) { return wrapperContained.method_34394(box.wrapperContained); }
// public static java.util.stream.IntStream method_34394(yarnwrap.util.math.BlockBox box, ) { return net.minecraft.util.math.BlockBox.method_34394(box.wrapperContained); }
public yarnwrap.util.math.BlockBox expand(int offset) { return new yarnwrap.util.math.BlockBox(wrapperContained.expand(offset)); }
// public static yarnwrap.util.math.BlockBox expand(int offset, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.expand(offset)); }
// public java.util.Optional encompassPositions(java.lang.Iterable positions) { return wrapperContained.encompassPositions(positions); }
// public static java.util.Optional encompassPositions(java.lang.Iterable positions, ) { return net.minecraft.util.math.BlockBox.encompassPositions(positions); }
public yarnwrap.util.math.BlockBox encompass(yarnwrap.util.math.BlockBox box) { return new yarnwrap.util.math.BlockBox(wrapperContained.encompass(box.wrapperContained)); }
// public static yarnwrap.util.math.BlockBox encompass(yarnwrap.util.math.BlockBox box, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.encompass(box.wrapperContained)); }
// public java.util.Optional encompass(java.lang.Iterable boxes) { return wrapperContained.encompass(boxes); }
// public static java.util.Optional encompass(java.lang.Iterable boxes, ) { return net.minecraft.util.math.BlockBox.encompass(boxes); }
public int getBlockCountX() { return wrapperContained.getBlockCountX(); }
// public static int getBlockCountX() { return net.minecraft.util.math.BlockBox.getBlockCountX(); }
public int getMinX() { return wrapperContained.getMinX(); }
// public static int getMinX() { return net.minecraft.util.math.BlockBox.getMinX(); }
public int getMinY() { return wrapperContained.getMinY(); }
// public static int getMinY() { return net.minecraft.util.math.BlockBox.getMinY(); }
public int getMinZ() { return wrapperContained.getMinZ(); }
// public static int getMinZ() { return net.minecraft.util.math.BlockBox.getMinZ(); }
public int getMaxX() { return wrapperContained.getMaxX(); }
// public static int getMaxX() { return net.minecraft.util.math.BlockBox.getMaxX(); }
public int getMaxY() { return wrapperContained.getMaxY(); }
// public static int getMaxY() { return net.minecraft.util.math.BlockBox.getMaxY(); }
public int getMaxZ() { return wrapperContained.getMaxZ(); }
// public static int getMaxZ() { return net.minecraft.util.math.BlockBox.getMaxZ(); }
public boolean contains(int x,int y,int z) { return wrapperContained.contains(x,y,z); }
// public static boolean contains(int x,int y,int z, ) { return net.minecraft.util.math.BlockBox.contains(x,y,z); }
public java.util.stream.Stream streamChunkPos() { return wrapperContained.streamChunkPos(); }
// public static java.util.stream.Stream streamChunkPos() { return net.minecraft.util.math.BlockBox.streamChunkPos(); }
public yarnwrap.util.math.BlockBox expand(int x,int y,int z) { return new yarnwrap.util.math.BlockBox(wrapperContained.expand(x,y,z)); }
// public static yarnwrap.util.math.BlockBox expand(int x,int y,int z, ) { return new yarnwrap.util.math.BlockBox(net.minecraft.util.math.BlockBox.expand(x,y,z)); }

}