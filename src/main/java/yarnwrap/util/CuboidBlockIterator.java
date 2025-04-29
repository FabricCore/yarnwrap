package yarnwrap.util;
public class CuboidBlockIterator { public net.minecraft.util.CuboidBlockIterator wrapperContained; public CuboidBlockIterator(net.minecraft.util.CuboidBlockIterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int startX() { return wrapperContained.startX; }
// public void startX(int value) { wrapperContained.startX = value; }
// public static int startX() { return net.minecraft.util.CuboidBlockIterator.startX; }
// public static void startX(int value, ) { net.minecraft.util.CuboidBlockIterator.startX = value; }

// public int startY() { return wrapperContained.startY; }
// public void startY(int value) { wrapperContained.startY = value; }
// public static int startY() { return net.minecraft.util.CuboidBlockIterator.startY; }
// public static void startY(int value, ) { net.minecraft.util.CuboidBlockIterator.startY = value; }

// public int startZ() { return wrapperContained.startZ; }
// public void startZ(int value) { wrapperContained.startZ = value; }
// public static int startZ() { return net.minecraft.util.CuboidBlockIterator.startZ; }
// public static void startZ(int value, ) { net.minecraft.util.CuboidBlockIterator.startZ = value; }

// public int sizeX() { return wrapperContained.sizeX; }
// public void sizeX(int value) { wrapperContained.sizeX = value; }
// public static int sizeX() { return net.minecraft.util.CuboidBlockIterator.sizeX; }
// public static void sizeX(int value, ) { net.minecraft.util.CuboidBlockIterator.sizeX = value; }

// public int sizeY() { return wrapperContained.sizeY; }
// public void sizeY(int value) { wrapperContained.sizeY = value; }
// public static int sizeY() { return net.minecraft.util.CuboidBlockIterator.sizeY; }
// public static void sizeY(int value, ) { net.minecraft.util.CuboidBlockIterator.sizeY = value; }

// public int sizeZ() { return wrapperContained.sizeZ; }
// public void sizeZ(int value) { wrapperContained.sizeZ = value; }
// public static int sizeZ() { return net.minecraft.util.CuboidBlockIterator.sizeZ; }
// public static void sizeZ(int value, ) { net.minecraft.util.CuboidBlockIterator.sizeZ = value; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.util.CuboidBlockIterator.x; }
// public static void x(int value, ) { net.minecraft.util.CuboidBlockIterator.x = value; }

// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.util.CuboidBlockIterator.y; }
// public static void y(int value, ) { net.minecraft.util.CuboidBlockIterator.y = value; }

// public int z() { return wrapperContained.z; }
// public void z(int value) { wrapperContained.z = value; }
// public static int z() { return net.minecraft.util.CuboidBlockIterator.z; }
// public static void z(int value, ) { net.minecraft.util.CuboidBlockIterator.z = value; }

// public int totalSize() { return wrapperContained.totalSize; }
// public void totalSize(int value) { wrapperContained.totalSize = value; }
// public static int totalSize() { return net.minecraft.util.CuboidBlockIterator.totalSize; }
// public static void totalSize(int value, ) { net.minecraft.util.CuboidBlockIterator.totalSize = value; }

// public int blocksIterated() { return wrapperContained.blocksIterated; }
// public void blocksIterated(int value) { wrapperContained.blocksIterated = value; }
// public static int blocksIterated() { return net.minecraft.util.CuboidBlockIterator.blocksIterated; }
// public static void blocksIterated(int value, ) { net.minecraft.util.CuboidBlockIterator.blocksIterated = value; }

public CuboidBlockIterator(int startX,int startY,int startZ,int endX,int endY,int endZ) { this.wrapperContained = new net.minecraft.util.CuboidBlockIterator(startX,startY,startZ,endX,endY,endZ); }
public boolean step() { return wrapperContained.step(); }
// public static boolean step() { return net.minecraft.util.CuboidBlockIterator.step(); }
public int getX() { return wrapperContained.getX(); }
// public static int getX() { return net.minecraft.util.CuboidBlockIterator.getX(); }
public int getY() { return wrapperContained.getY(); }
// public static int getY() { return net.minecraft.util.CuboidBlockIterator.getY(); }
public int getZ() { return wrapperContained.getZ(); }
// public static int getZ() { return net.minecraft.util.CuboidBlockIterator.getZ(); }
public int getEdgeCoordinatesCount() { return wrapperContained.getEdgeCoordinatesCount(); }
// public static int getEdgeCoordinatesCount() { return net.minecraft.util.CuboidBlockIterator.getEdgeCoordinatesCount(); }

}