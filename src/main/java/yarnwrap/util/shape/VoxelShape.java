package yarnwrap.util.shape;
public class VoxelShape { public net.minecraft.util.shape.VoxelShape wrapperContained; public VoxelShape(net.minecraft.util.shape.VoxelShape wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelSet voxels() { return new yarnwrap.util.shape.VoxelSet(wrapperContained.voxels); }
// public void voxels(yarnwrap.util.shape.VoxelSet value) { wrapperContained.voxels = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] shapeCache() { return wrapperContained.shapeCache; }
// public void shapeCache(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.shapeCache = value; }
// public VoxelShape(yarnwrap.util.shape.VoxelSet voxels) { this.wrapperContained = new net.minecraft.util.shape.VoxelShape(voxels.wrapperContained); }
// public void forEachBox(Object consumer) { wrapperContained.forEachBox(consumer); }
public java.util.List getBoundingBoxes() { return wrapperContained.getBoundingBoxes(); }
// public double getMin(Object axis) { return wrapperContained.getMin(axis); }
public yarnwrap.util.hit.BlockHitResult raycast(yarnwrap.util.math.Vec3d start,yarnwrap.util.math.Vec3d end,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.raycast(start.wrapperContained,end.wrapperContained,pos.wrapperContained)); }
// public void method_1094(net.minecraft.util.shape.VoxelShape[] minX,double minY,double minZ,double maxX,double maxY,double maxZ) { wrapperContained.method_1094(minX,minY,minZ,maxX,maxY,maxZ); }
public yarnwrap.util.shape.VoxelShape offset(double x,double y,double z) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.offset(x,y,z)); }
public yarnwrap.util.shape.VoxelShape simplify() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.simplify()); }
// public yarnwrap.util.shape.VoxelShape getUncachedFace(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getUncachedFace(direction.wrapperContained)); }
// public double getPointPosition(Object axis,int index) { return wrapperContained.getPointPosition(axis,index); }
// public int getCoordIndex(Object axis,double coord) { return wrapperContained.getCoordIndex(axis,coord); }
// public double getEndingCoord(Object axis,double from,double to) { return wrapperContained.getEndingCoord(axis,from,to); }
// public double calculateMaxDistance(yarnwrap.util.math.AxisCycleDirection axisCycle,yarnwrap.util.math.Box box,double maxDist) { return wrapperContained.calculateMaxDistance(axisCycle.wrapperContained,box.wrapperContained,maxDist); }
// public void forEachEdge(Object consumer) { wrapperContained.forEachEdge(consumer); }
// public double getMax(Object axis) { return wrapperContained.getMax(axis); }
// public void method_1106(Object minX,int minY,int minZ,int maxX,int maxY,int maxZ) { wrapperContained.method_1106(minX,minY,minZ,maxX,maxY,maxZ); }
public yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox()); }
// public double calculateMaxDistance(Object axis,yarnwrap.util.math.Box box,double maxDist) { return wrapperContained.calculateMaxDistance(axis,box.wrapperContained,maxDist); }
// public it.unimi.dsi.fastutil.doubles.DoubleList getPointPositions(Object axis) { return wrapperContained.getPointPositions(axis); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public void method_1111(java.util.List x1,double y1,double z1,double x2,double y2,double z2) { wrapperContained.method_1111(x1,y1,z1,x2,y2,z2); }
// public void method_1112(Object minX,it.unimi.dsi.fastutil.doubles.DoubleList minY,it.unimi.dsi.fastutil.doubles.DoubleList minZ,it.unimi.dsi.fastutil.doubles.DoubleList maxX,int maxY,int maxZ) { wrapperContained.method_1112(minX,minY,minZ,maxX,maxY,maxZ); }
public yarnwrap.util.shape.VoxelShape getFace(yarnwrap.util.math.Direction facing) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getFace(facing.wrapperContained)); }
public java.util.Optional getClosestPointTo(yarnwrap.util.math.Vec3d target) { return wrapperContained.getClosestPointTo(target.wrapperContained); }
// public void method_33662(yarnwrap.util.math.Vec3d minX,net.minecraft.util.math.Vec3d[] minY,double minZ,double maxX,double maxY,double maxZ) { wrapperContained.method_33662(minX.wrapperContained,minY,minZ,maxX,maxY,maxZ); }
// public double getStartingCoord(Object axis,double from,double to) { return wrapperContained.getStartingCoord(axis,from,to); }
public yarnwrap.util.shape.VoxelShape asCuboid() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.asCuboid()); }

}