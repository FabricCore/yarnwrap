package yarnwrap.util.shape;
public class VoxelSet { public net.minecraft.util.shape.VoxelSet wrapperContained; public VoxelSet(net.minecraft.util.shape.VoxelSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public int sizeZ() { return wrapperContained.sizeZ; }
// public int sizeY() { return wrapperContained.sizeY; }
// public int sizeX() { return wrapperContained.sizeX; }
// public Object AXES() { return wrapperContained.AXES; }
public boolean inBoundsAndContains(int x,int y,int z) { return wrapperContained.inBoundsAndContains(x,y,z); }
// public int getMax(Object axis) { return wrapperContained.getMax(axis); }
// public void forEachDirection(Object consumer) { wrapperContained.forEachDirection(consumer); }
public int getYSize() { return wrapperContained.getYSize(); }
public int getZSize() { return wrapperContained.getZSize(); }
public void set(int x,int y,int z) { wrapperContained.set(x,y,z); }
public int getXSize() { return wrapperContained.getXSize(); }
// public int getSize(Object axis) { return wrapperContained.getSize(axis); }
// public void forEachEdge(Object callback,yarnwrap.util.math.AxisCycleDirection direction,boolean coalesce) { wrapperContained.forEachEdge(callback,direction.wrapperContained,coalesce); }
// public void forEachBox(Object consumer,boolean coalesce) { wrapperContained.forEachBox(consumer,coalesce); }
// public int getMin(Object axis) { return wrapperContained.getMin(axis); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public boolean contains(yarnwrap.util.math.AxisCycleDirection cycle,int x,int y,int z) { return wrapperContained.contains(cycle.wrapperContained,x,y,z); }
// public int getEndingAxisCoord(Object axis,int from,int to) { return wrapperContained.getEndingAxisCoord(axis,from,to); }
// public void forEachDirection(Object consumer,yarnwrap.util.math.AxisCycleDirection direction) { wrapperContained.forEachDirection(consumer,direction.wrapperContained); }
public boolean inBoundsAndContains(yarnwrap.util.math.AxisCycleDirection cycle,int x,int y,int z) { return wrapperContained.inBoundsAndContains(cycle.wrapperContained,x,y,z); }
public boolean contains(int x,int y,int z) { return wrapperContained.contains(x,y,z); }
// public void forEachEdge(Object callback,boolean coalesce) { wrapperContained.forEachEdge(callback,coalesce); }
// public int getStartingAxisCoord(Object axis,int from,int to) { return wrapperContained.getStartingAxisCoord(axis,from,to); }

}