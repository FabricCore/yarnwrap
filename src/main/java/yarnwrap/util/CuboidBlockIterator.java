package yarnwrap.util;
public class CuboidBlockIterator { public net.minecraft.util.CuboidBlockIterator wrapperContained; public CuboidBlockIterator(net.minecraft.util.CuboidBlockIterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int startX() { return wrapperContained.startX; }
// public void startX(int value) { wrapperContained.startX = value; }
// public int startY() { return wrapperContained.startY; }
// public void startY(int value) { wrapperContained.startY = value; }
// public int startZ() { return wrapperContained.startZ; }
// public void startZ(int value) { wrapperContained.startZ = value; }
// public int sizeX() { return wrapperContained.sizeX; }
// public void sizeX(int value) { wrapperContained.sizeX = value; }
// public int sizeY() { return wrapperContained.sizeY; }
// public void sizeY(int value) { wrapperContained.sizeY = value; }
// public int sizeZ() { return wrapperContained.sizeZ; }
// public void sizeZ(int value) { wrapperContained.sizeZ = value; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public int z() { return wrapperContained.z; }
// public void z(int value) { wrapperContained.z = value; }
// public int totalSize() { return wrapperContained.totalSize; }
// public void totalSize(int value) { wrapperContained.totalSize = value; }
// public int blocksIterated() { return wrapperContained.blocksIterated; }
// public void blocksIterated(int value) { wrapperContained.blocksIterated = value; }
public boolean step() { return wrapperContained.step(); }
public int getX() { return wrapperContained.getX(); }
public int getY() { return wrapperContained.getY(); }
public int getZ() { return wrapperContained.getZ(); }
public int getEdgeCoordinatesCount() { return wrapperContained.getEdgeCoordinatesCount(); }

}