package yarnwrap.util.math;
public class Box { public net.minecraft.util.math.Box wrapperContained; public Box(net.minecraft.util.math.Box wrapperContained) { this.wrapperContained = wrapperContained; }

public double maxX() { return wrapperContained.maxX; }
public double minZ() { return wrapperContained.minZ; }
public double minY() { return wrapperContained.minY; }
public double minX() { return wrapperContained.minX; }
public double maxZ() { return wrapperContained.maxZ; }
public double maxY() { return wrapperContained.maxY; }
// public double EPSILON() { return wrapperContained.EPSILON; }
// public double getMin(Object axis) { return wrapperContained.getMin(axis); }
public yarnwrap.util.math.Box shrink(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.shrink(x,y,z)); }
public boolean intersects(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return wrapperContained.intersects(minX,minY,minZ,maxX,maxY,maxZ); }
public yarnwrap.util.math.Vec3d getCenter() { return new yarnwrap.util.math.Vec3d(wrapperContained.getCenter()); }
public boolean contains(yarnwrap.util.math.Vec3d pos) { return wrapperContained.contains(pos.wrapperContained); }
// public yarnwrap.util.math.Direction traceCollisionSide(yarnwrap.util.math.Box box,yarnwrap.util.math.Vec3d intersectingVector,double traceDistanceResult,net.minecraft.util.math.Direction[] approachDirection,double deltaX,double deltaY,double deltaZ) { return new yarnwrap.util.math.Direction(wrapperContained.traceCollisionSide(box.wrapperContained,intersectingVector.wrapperContained,traceDistanceResult,approachDirection,deltaX,deltaY,deltaZ)); }
public boolean contains(double x,double y,double z) { return wrapperContained.contains(x,y,z); }
public yarnwrap.util.math.Box expand(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.expand(x,y,z)); }
public yarnwrap.util.hit.BlockHitResult raycast(java.lang.Iterable boxes,yarnwrap.util.math.Vec3d from,yarnwrap.util.math.Vec3d to,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.raycast(boxes,from.wrapperContained,to.wrapperContained,pos.wrapperContained)); }
public yarnwrap.util.math.Box contract(double value) { return new yarnwrap.util.math.Box(wrapperContained.contract(value)); }
public yarnwrap.util.math.Box stretch(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.stretch(x,y,z)); }
public boolean isNaN() { return wrapperContained.isNaN(); }
public yarnwrap.util.math.Box expand(double value) { return new yarnwrap.util.math.Box(wrapperContained.expand(value)); }
public double getLengthX() { return wrapperContained.getLengthX(); }
public double getLengthY() { return wrapperContained.getLengthY(); }
public double getLengthZ() { return wrapperContained.getLengthZ(); }
public yarnwrap.util.math.Box stretch(yarnwrap.util.math.Vec3d scale) { return new yarnwrap.util.math.Box(wrapperContained.stretch(scale.wrapperContained)); }
public yarnwrap.util.math.Box from(yarnwrap.util.math.BlockBox mutable) { return new yarnwrap.util.math.Box(wrapperContained.from(mutable.wrapperContained)); }
public yarnwrap.util.math.Box from(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Box(wrapperContained.from(pos.wrapperContained)); }
public yarnwrap.util.math.Box of(yarnwrap.util.math.Vec3d center,double dx,double dy,double dz) { return new yarnwrap.util.math.Box(wrapperContained.of(center.wrapperContained,dx,dy,dz)); }
public yarnwrap.util.math.Box withMinX(double minX) { return new yarnwrap.util.math.Box(wrapperContained.withMinX(minX)); }
public yarnwrap.util.math.Box withMinY(double minY) { return new yarnwrap.util.math.Box(wrapperContained.withMinY(minY)); }
public yarnwrap.util.math.Box withMinZ(double minZ) { return new yarnwrap.util.math.Box(wrapperContained.withMinZ(minZ)); }
public yarnwrap.util.math.Box withMaxX(double maxX) { return new yarnwrap.util.math.Box(wrapperContained.withMaxX(maxX)); }
public yarnwrap.util.math.Box withMaxY(double maxY) { return new yarnwrap.util.math.Box(wrapperContained.withMaxY(maxY)); }
public yarnwrap.util.math.Box withMaxZ(double maxZ) { return new yarnwrap.util.math.Box(wrapperContained.withMaxZ(maxZ)); }
public yarnwrap.util.math.Box contract(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.contract(x,y,z)); }
public double squaredMagnitude(yarnwrap.util.math.Vec3d pos) { return wrapperContained.squaredMagnitude(pos.wrapperContained); }
public yarnwrap.util.math.Box enclosing(yarnwrap.util.math.BlockPos pos1,yarnwrap.util.math.BlockPos pos2) { return new yarnwrap.util.math.Box(wrapperContained.enclosing(pos1.wrapperContained,pos2.wrapperContained)); }
public yarnwrap.util.math.Box offset(org.joml.Vector3f offset) { return new yarnwrap.util.math.Box(wrapperContained.offset(offset)); }
public yarnwrap.util.math.Vec3d getBottomCenter() { return new yarnwrap.util.math.Vec3d(wrapperContained.getBottomCenter()); }
public yarnwrap.util.math.Vec3d getMinPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getMinPos()); }
public yarnwrap.util.math.Vec3d getMaxPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getMaxPos()); }
public yarnwrap.util.math.Box offset(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.offset(x,y,z)); }
// public double getMax(Object axis) { return wrapperContained.getMax(axis); }
public yarnwrap.util.math.Box union(yarnwrap.util.math.Box box) { return new yarnwrap.util.math.Box(wrapperContained.union(box.wrapperContained)); }
public java.util.Optional raycast(yarnwrap.util.math.Vec3d min,yarnwrap.util.math.Vec3d max) { return wrapperContained.raycast(min.wrapperContained,max.wrapperContained); }
public boolean intersects(yarnwrap.util.math.Vec3d pos1,yarnwrap.util.math.Vec3d pos2) { return wrapperContained.intersects(pos1.wrapperContained,pos2.wrapperContained); }
public boolean intersects(yarnwrap.util.math.Box box) { return wrapperContained.intersects(box.wrapperContained); }
public double getAverageSideLength() { return wrapperContained.getAverageSideLength(); }
public yarnwrap.util.math.Box offset(yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.util.math.Box(wrapperContained.offset(blockPos.wrapperContained)); }
public yarnwrap.util.math.Box offset(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Box(wrapperContained.offset(vec.wrapperContained)); }
// public yarnwrap.util.math.Direction traceCollisionSide(double traceDistanceResult,net.minecraft.util.math.Direction[] approachDirection,double deltaX,double deltaY,double deltaZ,double begin,double minX,double maxX,double minZ,double maxZ,yarnwrap.util.math.Direction resultDirection,double startX,double startY,double startZ) { return new yarnwrap.util.math.Direction(wrapperContained.traceCollisionSide(traceDistanceResult,approachDirection,deltaX,deltaY,deltaZ,begin,minX,maxX,minZ,maxZ,resultDirection.wrapperContained,startX,startY,startZ)); }
public yarnwrap.util.math.Box intersection(yarnwrap.util.math.Box box) { return new yarnwrap.util.math.Box(wrapperContained.intersection(box.wrapperContained)); }

}