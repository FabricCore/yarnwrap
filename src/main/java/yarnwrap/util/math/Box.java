package yarnwrap.util.math;
public class Box { public net.minecraft.util.math.Box wrapperContained; public Box(net.minecraft.util.math.Box wrapperContained) { this.wrapperContained = wrapperContained; }

public double maxX() { return wrapperContained.maxX; }
// public void maxX(double value) { wrapperContained.maxX = value; }
// public static double maxX() { return net.minecraft.util.math.Box.maxX; }
// public static void maxX(double value, ) { net.minecraft.util.math.Box.maxX = value; }

public double minZ() { return wrapperContained.minZ; }
// public void minZ(double value) { wrapperContained.minZ = value; }
// public static double minZ() { return net.minecraft.util.math.Box.minZ; }
// public static void minZ(double value, ) { net.minecraft.util.math.Box.minZ = value; }

public double minY() { return wrapperContained.minY; }
// public void minY(double value) { wrapperContained.minY = value; }
// public static double minY() { return net.minecraft.util.math.Box.minY; }
// public static void minY(double value, ) { net.minecraft.util.math.Box.minY = value; }

public double minX() { return wrapperContained.minX; }
// public void minX(double value) { wrapperContained.minX = value; }
// public static double minX() { return net.minecraft.util.math.Box.minX; }
// public static void minX(double value, ) { net.minecraft.util.math.Box.minX = value; }

public double maxZ() { return wrapperContained.maxZ; }
// public void maxZ(double value) { wrapperContained.maxZ = value; }
// public static double maxZ() { return net.minecraft.util.math.Box.maxZ; }
// public static void maxZ(double value, ) { net.minecraft.util.math.Box.maxZ = value; }

public double maxY() { return wrapperContained.maxY; }
// public void maxY(double value) { wrapperContained.maxY = value; }
// public static double maxY() { return net.minecraft.util.math.Box.maxY; }
// public static void maxY(double value, ) { net.minecraft.util.math.Box.maxY = value; }

// public double EPSILON() { return wrapperContained.EPSILON; }
// public void EPSILON(double value) { wrapperContained.EPSILON = value; }
// public static double EPSILON() { return net.minecraft.util.math.Box.EPSILON; }
// public static void EPSILON(double value, ) { net.minecraft.util.math.Box.EPSILON = value; }

public Box(double x1,double y1,double z1,double x2,double y2,double z2) { this.wrapperContained = new net.minecraft.util.math.Box(x1,y1,z1,x2,y2,z2); }
public Box(yarnwrap.util.math.Vec3d pos1,yarnwrap.util.math.Vec3d pos2) { this.wrapperContained = new net.minecraft.util.math.Box(pos1.wrapperContained,pos2.wrapperContained); }
public Box(yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.util.math.Box(pos.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.math.Box.equals(o); }
public yarnwrap.util.math.Box offset(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.offset(x,y,z)); }
// public static yarnwrap.util.math.Box offset(double x,double y,double z, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.offset(x,y,z)); }
// public double getMax(Object axis) { return wrapperContained.getMax(axis); }
// public static double getMax(Object axis, ) { return net.minecraft.util.math.Box.getMax(axis); }
public yarnwrap.util.math.Box union(yarnwrap.util.math.Box box) { return new yarnwrap.util.math.Box(wrapperContained.union(box.wrapperContained)); }
// public static yarnwrap.util.math.Box union(yarnwrap.util.math.Box box, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.union(box.wrapperContained)); }
public java.util.Optional raycast(yarnwrap.util.math.Vec3d from,yarnwrap.util.math.Vec3d to) { return wrapperContained.raycast(from.wrapperContained,to.wrapperContained); }
// public static java.util.Optional raycast(yarnwrap.util.math.Vec3d from,yarnwrap.util.math.Vec3d to, ) { return net.minecraft.util.math.Box.raycast(from.wrapperContained,to.wrapperContained); }
public boolean intersects(yarnwrap.util.math.Vec3d pos1,yarnwrap.util.math.Vec3d pos2) { return wrapperContained.intersects(pos1.wrapperContained,pos2.wrapperContained); }
// public static boolean intersects(yarnwrap.util.math.Vec3d pos1,yarnwrap.util.math.Vec3d pos2, ) { return net.minecraft.util.math.Box.intersects(pos1.wrapperContained,pos2.wrapperContained); }
public boolean intersects(yarnwrap.util.math.Box box) { return wrapperContained.intersects(box.wrapperContained); }
// public static boolean intersects(yarnwrap.util.math.Box box, ) { return net.minecraft.util.math.Box.intersects(box.wrapperContained); }
public double getAverageSideLength() { return wrapperContained.getAverageSideLength(); }
// public static double getAverageSideLength() { return net.minecraft.util.math.Box.getAverageSideLength(); }
public yarnwrap.util.math.Box offset(yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.util.math.Box(wrapperContained.offset(blockPos.wrapperContained)); }
// public static yarnwrap.util.math.Box offset(yarnwrap.util.math.BlockPos blockPos, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.offset(blockPos.wrapperContained)); }
public yarnwrap.util.math.Box offset(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Box(wrapperContained.offset(vec.wrapperContained)); }
// public static yarnwrap.util.math.Box offset(yarnwrap.util.math.Vec3d vec, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.offset(vec.wrapperContained)); }
// public yarnwrap.util.math.Direction traceCollisionSide(double traceDistanceResult,net.minecraft.util.math.Direction[] approachDirection,double deltaX,double deltaY,double deltaZ,double begin,double minX,double maxX,double minZ,double maxZ,yarnwrap.util.math.Direction resultDirection,double startX,double startY,double startZ) { return new yarnwrap.util.math.Direction(wrapperContained.traceCollisionSide(traceDistanceResult,approachDirection,deltaX,deltaY,deltaZ,begin,minX,maxX,minZ,maxZ,resultDirection.wrapperContained,startX,startY,startZ)); }
// public static yarnwrap.util.math.Direction traceCollisionSide(double traceDistanceResult,net.minecraft.util.math.Direction[] approachDirection,double deltaX,double deltaY,double deltaZ,double begin,double minX,double maxX,double minZ,double maxZ,yarnwrap.util.math.Direction resultDirection,double startX,double startY,double startZ, ) { return new yarnwrap.util.math.Direction(net.minecraft.util.math.Box.traceCollisionSide(traceDistanceResult,approachDirection,deltaX,deltaY,deltaZ,begin,minX,maxX,minZ,maxZ,resultDirection.wrapperContained,startX,startY,startZ)); }
public yarnwrap.util.math.Box intersection(yarnwrap.util.math.Box box) { return new yarnwrap.util.math.Box(wrapperContained.intersection(box.wrapperContained)); }
// public static yarnwrap.util.math.Box intersection(yarnwrap.util.math.Box box, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.intersection(box.wrapperContained)); }
// public double getMin(Object axis) { return wrapperContained.getMin(axis); }
// public static double getMin(Object axis, ) { return net.minecraft.util.math.Box.getMin(axis); }
public yarnwrap.util.math.Box shrink(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.shrink(x,y,z)); }
// public static yarnwrap.util.math.Box shrink(double x,double y,double z, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.shrink(x,y,z)); }
public boolean intersects(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return wrapperContained.intersects(minX,minY,minZ,maxX,maxY,maxZ); }
// public static boolean intersects(double minX,double minY,double minZ,double maxX,double maxY,double maxZ, ) { return net.minecraft.util.math.Box.intersects(minX,minY,minZ,maxX,maxY,maxZ); }
public yarnwrap.util.math.Vec3d getCenter() { return new yarnwrap.util.math.Vec3d(wrapperContained.getCenter()); }
// public static yarnwrap.util.math.Vec3d getCenter() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Box.getCenter()); }
public boolean contains(yarnwrap.util.math.Vec3d pos) { return wrapperContained.contains(pos.wrapperContained); }
// public static boolean contains(yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.util.math.Box.contains(pos.wrapperContained); }
// public yarnwrap.util.math.Direction traceCollisionSide(yarnwrap.util.math.Box box,yarnwrap.util.math.Vec3d intersectingVector,double traceDistanceResult,net.minecraft.util.math.Direction[] approachDirection,double deltaX,double deltaY,double deltaZ) { return new yarnwrap.util.math.Direction(wrapperContained.traceCollisionSide(box.wrapperContained,intersectingVector.wrapperContained,traceDistanceResult,approachDirection,deltaX,deltaY,deltaZ)); }
// public static yarnwrap.util.math.Direction traceCollisionSide(yarnwrap.util.math.Box box,yarnwrap.util.math.Vec3d intersectingVector,double traceDistanceResult,net.minecraft.util.math.Direction[] approachDirection,double deltaX,double deltaY,double deltaZ, ) { return new yarnwrap.util.math.Direction(net.minecraft.util.math.Box.traceCollisionSide(box.wrapperContained,intersectingVector.wrapperContained,traceDistanceResult,approachDirection,deltaX,deltaY,deltaZ)); }
public boolean contains(double x,double y,double z) { return wrapperContained.contains(x,y,z); }
// public static boolean contains(double x,double y,double z, ) { return net.minecraft.util.math.Box.contains(x,y,z); }
public yarnwrap.util.math.Box expand(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.expand(x,y,z)); }
// public static yarnwrap.util.math.Box expand(double x,double y,double z, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.expand(x,y,z)); }
// public yarnwrap.util.hit.BlockHitResult raycast(java.lang.Iterable boxes,yarnwrap.util.math.Vec3d from,yarnwrap.util.math.Vec3d to,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.raycast(boxes,from.wrapperContained,to.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.hit.BlockHitResult raycast(java.lang.Iterable boxes,yarnwrap.util.math.Vec3d from,yarnwrap.util.math.Vec3d to,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.hit.BlockHitResult(net.minecraft.util.math.Box.raycast(boxes,from.wrapperContained,to.wrapperContained,pos.wrapperContained)); }
public yarnwrap.util.math.Box contract(double value) { return new yarnwrap.util.math.Box(wrapperContained.contract(value)); }
// public static yarnwrap.util.math.Box contract(double value, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.contract(value)); }
public yarnwrap.util.math.Box stretch(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.stretch(x,y,z)); }
// public static yarnwrap.util.math.Box stretch(double x,double y,double z, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.stretch(x,y,z)); }
public boolean isNaN() { return wrapperContained.isNaN(); }
// public static boolean isNaN() { return net.minecraft.util.math.Box.isNaN(); }
public yarnwrap.util.math.Box expand(double value) { return new yarnwrap.util.math.Box(wrapperContained.expand(value)); }
// public static yarnwrap.util.math.Box expand(double value, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.expand(value)); }
public double getLengthX() { return wrapperContained.getLengthX(); }
// public static double getLengthX() { return net.minecraft.util.math.Box.getLengthX(); }
public double getLengthY() { return wrapperContained.getLengthY(); }
// public static double getLengthY() { return net.minecraft.util.math.Box.getLengthY(); }
public double getLengthZ() { return wrapperContained.getLengthZ(); }
// public static double getLengthZ() { return net.minecraft.util.math.Box.getLengthZ(); }
public yarnwrap.util.math.Box stretch(yarnwrap.util.math.Vec3d scale) { return new yarnwrap.util.math.Box(wrapperContained.stretch(scale.wrapperContained)); }
// public static yarnwrap.util.math.Box stretch(yarnwrap.util.math.Vec3d scale, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.stretch(scale.wrapperContained)); }
// public yarnwrap.util.math.Box from(yarnwrap.util.math.BlockBox mutable) { return new yarnwrap.util.math.Box(wrapperContained.from(mutable.wrapperContained)); }
// public static yarnwrap.util.math.Box from(yarnwrap.util.math.BlockBox mutable, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.from(mutable.wrapperContained)); }
// public yarnwrap.util.math.Box from(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Box(wrapperContained.from(pos.wrapperContained)); }
// public static yarnwrap.util.math.Box from(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.from(pos.wrapperContained)); }
// public yarnwrap.util.math.Box of(yarnwrap.util.math.Vec3d center,double dx,double dy,double dz) { return new yarnwrap.util.math.Box(wrapperContained.of(center.wrapperContained,dx,dy,dz)); }
// public static yarnwrap.util.math.Box of(yarnwrap.util.math.Vec3d center,double dx,double dy,double dz, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.of(center.wrapperContained,dx,dy,dz)); }
public yarnwrap.util.math.Box withMinX(double minX) { return new yarnwrap.util.math.Box(wrapperContained.withMinX(minX)); }
// public static yarnwrap.util.math.Box withMinX(double minX, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.withMinX(minX)); }
public yarnwrap.util.math.Box withMinY(double minY) { return new yarnwrap.util.math.Box(wrapperContained.withMinY(minY)); }
// public static yarnwrap.util.math.Box withMinY(double minY, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.withMinY(minY)); }
public yarnwrap.util.math.Box withMinZ(double minZ) { return new yarnwrap.util.math.Box(wrapperContained.withMinZ(minZ)); }
// public static yarnwrap.util.math.Box withMinZ(double minZ, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.withMinZ(minZ)); }
public yarnwrap.util.math.Box withMaxX(double maxX) { return new yarnwrap.util.math.Box(wrapperContained.withMaxX(maxX)); }
// public static yarnwrap.util.math.Box withMaxX(double maxX, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.withMaxX(maxX)); }
public yarnwrap.util.math.Box withMaxY(double maxY) { return new yarnwrap.util.math.Box(wrapperContained.withMaxY(maxY)); }
// public static yarnwrap.util.math.Box withMaxY(double maxY, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.withMaxY(maxY)); }
public yarnwrap.util.math.Box withMaxZ(double maxZ) { return new yarnwrap.util.math.Box(wrapperContained.withMaxZ(maxZ)); }
// public static yarnwrap.util.math.Box withMaxZ(double maxZ, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.withMaxZ(maxZ)); }
public yarnwrap.util.math.Box contract(double x,double y,double z) { return new yarnwrap.util.math.Box(wrapperContained.contract(x,y,z)); }
// public static yarnwrap.util.math.Box contract(double x,double y,double z, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.contract(x,y,z)); }
public double squaredMagnitude(yarnwrap.util.math.Vec3d pos) { return wrapperContained.squaredMagnitude(pos.wrapperContained); }
// public static double squaredMagnitude(yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.util.math.Box.squaredMagnitude(pos.wrapperContained); }
// public yarnwrap.util.math.Box enclosing(yarnwrap.util.math.BlockPos pos1,yarnwrap.util.math.BlockPos pos2) { return new yarnwrap.util.math.Box(wrapperContained.enclosing(pos1.wrapperContained,pos2.wrapperContained)); }
// public static yarnwrap.util.math.Box enclosing(yarnwrap.util.math.BlockPos pos1,yarnwrap.util.math.BlockPos pos2, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.enclosing(pos1.wrapperContained,pos2.wrapperContained)); }
public yarnwrap.util.math.Box offset(org.joml.Vector3f offset) { return new yarnwrap.util.math.Box(wrapperContained.offset(offset)); }
// public static yarnwrap.util.math.Box offset(org.joml.Vector3f offset, ) { return new yarnwrap.util.math.Box(net.minecraft.util.math.Box.offset(offset)); }
public yarnwrap.util.math.Vec3d getMinPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getMinPos()); }
// public static yarnwrap.util.math.Vec3d getMinPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Box.getMinPos()); }
public yarnwrap.util.math.Vec3d getMaxPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getMaxPos()); }
// public static yarnwrap.util.math.Vec3d getMaxPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Box.getMaxPos()); }
// public java.util.Optional raycast(double minX,double minY,double minZ,double maxX,double maxY,double maxZ,yarnwrap.util.math.Vec3d from,yarnwrap.util.math.Vec3d to) { return wrapperContained.raycast(minX,minY,minZ,maxX,maxY,maxZ,from.wrapperContained,to.wrapperContained); }
// public static java.util.Optional raycast(double minX,double minY,double minZ,double maxX,double maxY,double maxZ,yarnwrap.util.math.Vec3d from,yarnwrap.util.math.Vec3d to, ) { return net.minecraft.util.math.Box.raycast(minX,minY,minZ,maxX,maxY,maxZ,from.wrapperContained,to.wrapperContained); }
// public yarnwrap.util.math.Direction traceCollisionSide(double minX,double minY,double minZ,double maxX,double maxY,double maxZ,yarnwrap.util.math.Vec3d intersectingVector,double traceDistanceResult,net.minecraft.util.math.Direction[] approachDirection,double deltaX,double deltaY,double deltaZ) { return new yarnwrap.util.math.Direction(wrapperContained.traceCollisionSide(minX,minY,minZ,maxX,maxY,maxZ,intersectingVector.wrapperContained,traceDistanceResult,approachDirection,deltaX,deltaY,deltaZ)); }
// public static yarnwrap.util.math.Direction traceCollisionSide(double minX,double minY,double minZ,double maxX,double maxY,double maxZ,yarnwrap.util.math.Vec3d intersectingVector,double traceDistanceResult,net.minecraft.util.math.Direction[] approachDirection,double deltaX,double deltaY,double deltaZ, ) { return new yarnwrap.util.math.Direction(net.minecraft.util.math.Box.traceCollisionSide(minX,minY,minZ,maxX,maxY,maxZ,intersectingVector.wrapperContained,traceDistanceResult,approachDirection,deltaX,deltaY,deltaZ)); }
public boolean collides(yarnwrap.util.math.Vec3d pos,java.util.List boundingBoxes) { return wrapperContained.collides(pos.wrapperContained,boundingBoxes); }
// public static boolean collides(yarnwrap.util.math.Vec3d pos,java.util.List boundingBoxes, ) { return net.minecraft.util.math.Box.collides(pos.wrapperContained,boundingBoxes); }
public yarnwrap.util.math.Vec3d getHorizontalCenter() { return new yarnwrap.util.math.Vec3d(wrapperContained.getHorizontalCenter()); }
// public static yarnwrap.util.math.Vec3d getHorizontalCenter() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Box.getHorizontalCenter()); }
// public boolean contains(yarnwrap.util.math.BlockPos pos) { return wrapperContained.contains(pos.wrapperContained); }
// public static boolean contains(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.util.math.Box.contains(pos.wrapperContained); }
// public double squaredMagnitude(yarnwrap.util.math.Box other) { return wrapperContained.squaredMagnitude(other.wrapperContained); }
// public static double squaredMagnitude(yarnwrap.util.math.Box other, ) { return net.minecraft.util.math.Box.squaredMagnitude(other.wrapperContained); }

}