package yarnwrap.util.math;
public class Vec3d { public net.minecraft.util.math.Vec3d wrapperContained; public Vec3d(net.minecraft.util.math.Vec3d wrapperContained) { this.wrapperContained = wrapperContained; }

public double z() { return wrapperContained.z; }
public double y() { return wrapperContained.y; }
public double x() { return wrapperContained.x; }
public yarnwrap.util.math.Vec3d ZERO() { return new yarnwrap.util.math.Vec3d(wrapperContained.ZERO); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.util.math.Vec3d add(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.add(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d subtract(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.subtract(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d multiply(double value) { return new yarnwrap.util.math.Vec3d(wrapperContained.multiply(value)); }
public double distanceTo(yarnwrap.util.math.Vec3d vec) { return wrapperContained.distanceTo(vec.wrapperContained); }
public yarnwrap.util.math.Vec3d subtract(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.subtract(x,y,z)); }
public yarnwrap.util.math.Vec3d rotateY(float angle) { return new yarnwrap.util.math.Vec3d(wrapperContained.rotateY(angle)); }
public double squaredDistanceTo(yarnwrap.util.math.Vec3d vec) { return wrapperContained.squaredDistanceTo(vec.wrapperContained); }
public double dotProduct(yarnwrap.util.math.Vec3d vec) { return wrapperContained.dotProduct(vec.wrapperContained); }
public double lengthSquared() { return wrapperContained.lengthSquared(); }
public double squaredDistanceTo(double x,double y,double z) { return wrapperContained.squaredDistanceTo(x,y,z); }
public yarnwrap.util.math.Vec3d normalize() { return new yarnwrap.util.math.Vec3d(wrapperContained.normalize()); }
public yarnwrap.util.math.Vec3d fromPolar(float pitch,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.fromPolar(pitch,yaw)); }
public yarnwrap.util.math.Vec3d add(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.add(x,y,z)); }
public yarnwrap.util.math.Vec3d floorAlongAxes(java.util.EnumSet axes) { return new yarnwrap.util.math.Vec3d(wrapperContained.floorAlongAxes(axes)); }
public double length() { return wrapperContained.length(); }
public yarnwrap.util.math.Vec3d fromPolar(yarnwrap.util.math.Vec2f polar) { return new yarnwrap.util.math.Vec3d(wrapperContained.fromPolar(polar.wrapperContained)); }
public yarnwrap.util.math.Vec3d relativize(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.relativize(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d crossProduct(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.crossProduct(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d rotateX(float angle) { return new yarnwrap.util.math.Vec3d(wrapperContained.rotateX(angle)); }
// public double getComponentAlongAxis(Object axis) { return wrapperContained.getComponentAlongAxis(axis); }
public yarnwrap.util.math.Vec3d multiply(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.multiply(x,y,z)); }
public yarnwrap.util.math.Vec3d multiply(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.multiply(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d negate() { return new yarnwrap.util.math.Vec3d(wrapperContained.negate()); }
public yarnwrap.util.math.Vec3d unpackRgb(int rgb) { return new yarnwrap.util.math.Vec3d(wrapperContained.unpackRgb(rgb)); }
public boolean isInRange(yarnwrap.util.math.Position pos,double radius) { return wrapperContained.isInRange(pos.wrapperContained,radius); }
public yarnwrap.util.math.Vec3d ofCenter(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.ofCenter(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d of(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.of(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d ofBottomCenter(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.ofBottomCenter(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d ofCenter(yarnwrap.util.math.Vec3i vec,double deltaY) { return new yarnwrap.util.math.Vec3d(wrapperContained.ofCenter(vec.wrapperContained,deltaY)); }
public yarnwrap.util.math.Vec3d rotateZ(float angle) { return new yarnwrap.util.math.Vec3d(wrapperContained.rotateZ(angle)); }
public yarnwrap.util.math.Vec3d lerp(yarnwrap.util.math.Vec3d to,double delta) { return new yarnwrap.util.math.Vec3d(wrapperContained.lerp(to.wrapperContained,delta)); }
public double horizontalLength() { return wrapperContained.horizontalLength(); }
public double horizontalLengthSquared() { return wrapperContained.horizontalLengthSquared(); }
// public yarnwrap.util.math.Vec3d withAxis(Object axis,double value) { return new yarnwrap.util.math.Vec3d(wrapperContained.withAxis(axis,value)); }
public yarnwrap.util.math.Vec3d offset(yarnwrap.util.math.Direction direction,double value) { return new yarnwrap.util.math.Vec3d(wrapperContained.offset(direction.wrapperContained,value)); }
public org.joml.Vector3f toVector3f() { return wrapperContained.toVector3f(); }
public yarnwrap.util.math.Vec3d addRandom(yarnwrap.util.math.random.Random random,float multiplier) { return new yarnwrap.util.math.Vec3d(wrapperContained.addRandom(random.wrapperContained,multiplier)); }
public yarnwrap.util.math.Vec3d add(yarnwrap.util.math.Vec3i vec,double deltaX,double deltaY,double deltaZ) { return new yarnwrap.util.math.Vec3d(wrapperContained.add(vec.wrapperContained,deltaX,deltaY,deltaZ)); }
public boolean isWithinRangeOf(yarnwrap.util.math.Vec3d vec,double horizontalRange,double verticalRange) { return wrapperContained.isWithinRangeOf(vec.wrapperContained,horizontalRange,verticalRange); }

}