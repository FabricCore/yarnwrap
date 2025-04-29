package yarnwrap.util.shape;
public class VoxelSet { public net.minecraft.util.shape.VoxelSet wrapperContained; public VoxelSet(net.minecraft.util.shape.VoxelSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public int sizeZ() { return wrapperContained.sizeZ; }
// public void sizeZ(int value) { wrapperContained.sizeZ = value; }
// public static int sizeZ() { return net.minecraft.util.shape.VoxelSet.sizeZ; }
// public static void sizeZ(int value, ) { net.minecraft.util.shape.VoxelSet.sizeZ = value; }

// public int sizeY() { return wrapperContained.sizeY; }
// public void sizeY(int value) { wrapperContained.sizeY = value; }
// public static int sizeY() { return net.minecraft.util.shape.VoxelSet.sizeY; }
// public static void sizeY(int value, ) { net.minecraft.util.shape.VoxelSet.sizeY = value; }

// public int sizeX() { return wrapperContained.sizeX; }
// public void sizeX(int value) { wrapperContained.sizeX = value; }
// public static int sizeX() { return net.minecraft.util.shape.VoxelSet.sizeX; }
// public static void sizeX(int value, ) { net.minecraft.util.shape.VoxelSet.sizeX = value; }

// public Object AXES() { return wrapperContained.AXES; }
// // public void AXES(Object value) { wrapperContained.AXES = value; }
// // public static Object AXES() { return net.minecraft.util.shape.VoxelSet.AXES; }
// // public static void AXES(Object value, ) { net.minecraft.util.shape.VoxelSet.AXES = value; }

// public VoxelSet(int sizeX,int sizeY,int sizeZ) { this.wrapperContained = new net.minecraft.util.shape.VoxelSet(sizeX,sizeY,sizeZ); }
public boolean inBoundsAndContains(int x,int y,int z) { return wrapperContained.inBoundsAndContains(x,y,z); }
// public static boolean inBoundsAndContains(int x,int y,int z, ) { return net.minecraft.util.shape.VoxelSet.inBoundsAndContains(x,y,z); }
// public int getMax(Object axis) { return wrapperContained.getMax(axis); }
// public static int getMax(Object axis, ) { return net.minecraft.util.shape.VoxelSet.getMax(axis); }
// public void forEachDirection(Object consumer) { wrapperContained.forEachDirection(consumer); }
// public static void forEachDirection(Object consumer, ) { net.minecraft.util.shape.VoxelSet.forEachDirection(consumer); }
public int getYSize() { return wrapperContained.getYSize(); }
// public static int getYSize() { return net.minecraft.util.shape.VoxelSet.getYSize(); }
public int getZSize() { return wrapperContained.getZSize(); }
// public static int getZSize() { return net.minecraft.util.shape.VoxelSet.getZSize(); }
public void set(int x,int y,int z) { wrapperContained.set(x,y,z); }
// public static void set(int x,int y,int z, ) { net.minecraft.util.shape.VoxelSet.set(x,y,z); }
public int getXSize() { return wrapperContained.getXSize(); }
// public static int getXSize() { return net.minecraft.util.shape.VoxelSet.getXSize(); }
// public int getSize(Object axis) { return wrapperContained.getSize(axis); }
// public static int getSize(Object axis, ) { return net.minecraft.util.shape.VoxelSet.getSize(axis); }
// public void forEachEdge(Object callback,yarnwrap.util.math.AxisCycleDirection direction,boolean coalesce) { wrapperContained.forEachEdge(callback,direction.wrapperContained,coalesce); }
// public static void forEachEdge(Object callback,yarnwrap.util.math.AxisCycleDirection direction,boolean coalesce, ) { net.minecraft.util.shape.VoxelSet.forEachEdge(callback,direction.wrapperContained,coalesce); }
// public void forEachBox(Object consumer,boolean coalesce) { wrapperContained.forEachBox(consumer,coalesce); }
// public static void forEachBox(Object consumer,boolean coalesce, ) { net.minecraft.util.shape.VoxelSet.forEachBox(consumer,coalesce); }
// public int getMin(Object axis) { return wrapperContained.getMin(axis); }
// public static int getMin(Object axis, ) { return net.minecraft.util.shape.VoxelSet.getMin(axis); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.util.shape.VoxelSet.isEmpty(); }
public boolean contains(yarnwrap.util.math.AxisCycleDirection cycle,int x,int y,int z) { return wrapperContained.contains(cycle.wrapperContained,x,y,z); }
// public static boolean contains(yarnwrap.util.math.AxisCycleDirection cycle,int x,int y,int z, ) { return net.minecraft.util.shape.VoxelSet.contains(cycle.wrapperContained,x,y,z); }
// public int getEndingAxisCoord(Object axis,int from,int to) { return wrapperContained.getEndingAxisCoord(axis,from,to); }
// public static int getEndingAxisCoord(Object axis,int from,int to, ) { return net.minecraft.util.shape.VoxelSet.getEndingAxisCoord(axis,from,to); }
// public void forEachDirection(Object consumer,yarnwrap.util.math.AxisCycleDirection direction) { wrapperContained.forEachDirection(consumer,direction.wrapperContained); }
// public static void forEachDirection(Object consumer,yarnwrap.util.math.AxisCycleDirection direction, ) { net.minecraft.util.shape.VoxelSet.forEachDirection(consumer,direction.wrapperContained); }
public boolean inBoundsAndContains(yarnwrap.util.math.AxisCycleDirection cycle,int x,int y,int z) { return wrapperContained.inBoundsAndContains(cycle.wrapperContained,x,y,z); }
// public static boolean inBoundsAndContains(yarnwrap.util.math.AxisCycleDirection cycle,int x,int y,int z, ) { return net.minecraft.util.shape.VoxelSet.inBoundsAndContains(cycle.wrapperContained,x,y,z); }
public boolean contains(int x,int y,int z) { return wrapperContained.contains(x,y,z); }
// public static boolean contains(int x,int y,int z, ) { return net.minecraft.util.shape.VoxelSet.contains(x,y,z); }
// public void forEachEdge(Object callback,boolean coalesce) { wrapperContained.forEachEdge(callback,coalesce); }
// public static void forEachEdge(Object callback,boolean coalesce, ) { net.minecraft.util.shape.VoxelSet.forEachEdge(callback,coalesce); }
// public int getStartingAxisCoord(Object axis,int from,int to) { return wrapperContained.getStartingAxisCoord(axis,from,to); }
// public static int getStartingAxisCoord(Object axis,int from,int to, ) { return net.minecraft.util.shape.VoxelSet.getStartingAxisCoord(axis,from,to); }

}