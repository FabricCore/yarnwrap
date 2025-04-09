package yarnwrap.util;
public class CuboidBlockIterator { public net.minecraft.util.CuboidBlockIterator wrapperContained; public CuboidBlockIterator(net.minecraft.util.CuboidBlockIterator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int startX() { return wrapperContained.startX; }
// public int startY() { return wrapperContained.startY; }
// public int startZ() { return wrapperContained.startZ; }
// public int sizeX() { return wrapperContained.sizeX; }
// public int sizeY() { return wrapperContained.sizeY; }
// public int sizeZ() { return wrapperContained.sizeZ; }
// public int x() { return wrapperContained.x; }
// public int y() { return wrapperContained.y; }
// public int z() { return wrapperContained.z; }
// public int totalSize() { return wrapperContained.totalSize; }
// public int blocksIterated() { return wrapperContained.blocksIterated; }
public boolean step() { return wrapperContained.step(); }
public int getX() { return wrapperContained.getX(); }
public int getY() { return wrapperContained.getY(); }
public int getZ() { return wrapperContained.getZ(); }
public int getEdgeCoordinatesCount() { return wrapperContained.getEdgeCoordinatesCount(); }

}