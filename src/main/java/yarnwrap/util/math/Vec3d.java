package yarnwrap.util.math;
public class Vec3d { public net.minecraft.util.math.Vec3d wrapperContained; public Vec3d(net.minecraft.util.math.Vec3d wrapperContained) { this.wrapperContained = wrapperContained; }

public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.util.math.Vec3d.z; }
// public static void z(double value, ) { net.minecraft.util.math.Vec3d.z = value; }

public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.util.math.Vec3d.y; }
// public static void y(double value, ) { net.minecraft.util.math.Vec3d.y = value; }

public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.util.math.Vec3d.x; }
// public static void x(double value, ) { net.minecraft.util.math.Vec3d.x = value; }

// public yarnwrap.util.math.Vec3d ZERO() { return new yarnwrap.util.math.Vec3d(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.util.math.Vec3d value) { wrapperContained.ZERO = value.wrapperContained; }
public static yarnwrap.util.math.Vec3d ZERO() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.ZERO); }
// public static void ZERO(yarnwrap.util.math.Vec3d value, ) { net.minecraft.util.math.Vec3d.ZERO = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.math.Vec3d.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.Vec3d.CODEC = value; }

public Vec3d(double x,double y,double z) { this.wrapperContained = new net.minecraft.util.math.Vec3d(x,y,z); }
public Vec3d(org.joml.Vector3f vec) { this.wrapperContained = new net.minecraft.util.math.Vec3d(vec); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.math.Vec3d.equals(o); }
public yarnwrap.util.math.Vec3d add(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.add(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d add(yarnwrap.util.math.Vec3d vec, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.add(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d subtract(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.subtract(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d subtract(yarnwrap.util.math.Vec3d vec, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.subtract(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d multiply(double value) { return new yarnwrap.util.math.Vec3d(wrapperContained.multiply(value)); }
// public static yarnwrap.util.math.Vec3d multiply(double value, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.multiply(value)); }
public double distanceTo(yarnwrap.util.math.Vec3d vec) { return wrapperContained.distanceTo(vec.wrapperContained); }
// public static double distanceTo(yarnwrap.util.math.Vec3d vec, ) { return net.minecraft.util.math.Vec3d.distanceTo(vec.wrapperContained); }
public yarnwrap.util.math.Vec3d subtract(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.subtract(x,y,z)); }
// public static yarnwrap.util.math.Vec3d subtract(double x,double y,double z, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.subtract(x,y,z)); }
public yarnwrap.util.math.Vec3d rotateY(float angle) { return new yarnwrap.util.math.Vec3d(wrapperContained.rotateY(angle)); }
// public static yarnwrap.util.math.Vec3d rotateY(float angle, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.rotateY(angle)); }
public double squaredDistanceTo(yarnwrap.util.math.Vec3d vec) { return wrapperContained.squaredDistanceTo(vec.wrapperContained); }
// public static double squaredDistanceTo(yarnwrap.util.math.Vec3d vec, ) { return net.minecraft.util.math.Vec3d.squaredDistanceTo(vec.wrapperContained); }
public double dotProduct(yarnwrap.util.math.Vec3d vec) { return wrapperContained.dotProduct(vec.wrapperContained); }
// public static double dotProduct(yarnwrap.util.math.Vec3d vec, ) { return net.minecraft.util.math.Vec3d.dotProduct(vec.wrapperContained); }
public double lengthSquared() { return wrapperContained.lengthSquared(); }
// public static double lengthSquared() { return net.minecraft.util.math.Vec3d.lengthSquared(); }
public double squaredDistanceTo(double x,double y,double z) { return wrapperContained.squaredDistanceTo(x,y,z); }
// public static double squaredDistanceTo(double x,double y,double z, ) { return net.minecraft.util.math.Vec3d.squaredDistanceTo(x,y,z); }
public yarnwrap.util.math.Vec3d normalize() { return new yarnwrap.util.math.Vec3d(wrapperContained.normalize()); }
// public static yarnwrap.util.math.Vec3d normalize() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.normalize()); }
// public yarnwrap.util.math.Vec3d fromPolar(float pitch,float yaw) { return new yarnwrap.util.math.Vec3d(wrapperContained.fromPolar(pitch,yaw)); }
// public static yarnwrap.util.math.Vec3d fromPolar(float pitch,float yaw, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.fromPolar(pitch,yaw)); }
public yarnwrap.util.math.Vec3d add(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.add(x,y,z)); }
// public static yarnwrap.util.math.Vec3d add(double x,double y,double z, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.add(x,y,z)); }
public yarnwrap.util.math.Vec3d floorAlongAxes(java.util.EnumSet axes) { return new yarnwrap.util.math.Vec3d(wrapperContained.floorAlongAxes(axes)); }
// public static yarnwrap.util.math.Vec3d floorAlongAxes(java.util.EnumSet axes, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.floorAlongAxes(axes)); }
public double length() { return wrapperContained.length(); }
// public static double length() { return net.minecraft.util.math.Vec3d.length(); }
// public yarnwrap.util.math.Vec3d fromPolar(yarnwrap.util.math.Vec2f polar) { return new yarnwrap.util.math.Vec3d(wrapperContained.fromPolar(polar.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d fromPolar(yarnwrap.util.math.Vec2f polar, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.fromPolar(polar.wrapperContained)); }
public yarnwrap.util.math.Vec3d relativize(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.relativize(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d relativize(yarnwrap.util.math.Vec3d vec, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.relativize(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d crossProduct(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.crossProduct(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d crossProduct(yarnwrap.util.math.Vec3d vec, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.crossProduct(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d rotateX(float angle) { return new yarnwrap.util.math.Vec3d(wrapperContained.rotateX(angle)); }
// public static yarnwrap.util.math.Vec3d rotateX(float angle, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.rotateX(angle)); }
// public double getComponentAlongAxis(Object axis) { return wrapperContained.getComponentAlongAxis(axis); }
// public static double getComponentAlongAxis(Object axis, ) { return net.minecraft.util.math.Vec3d.getComponentAlongAxis(axis); }
public yarnwrap.util.math.Vec3d multiply(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.multiply(x,y,z)); }
// public static yarnwrap.util.math.Vec3d multiply(double x,double y,double z, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.multiply(x,y,z)); }
public yarnwrap.util.math.Vec3d multiply(yarnwrap.util.math.Vec3d vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.multiply(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d multiply(yarnwrap.util.math.Vec3d vec, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.multiply(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3d negate() { return new yarnwrap.util.math.Vec3d(wrapperContained.negate()); }
// public static yarnwrap.util.math.Vec3d negate() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.negate()); }
// public yarnwrap.util.math.Vec3d unpackRgb(int rgb) { return new yarnwrap.util.math.Vec3d(wrapperContained.unpackRgb(rgb)); }
// public static yarnwrap.util.math.Vec3d unpackRgb(int rgb, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.unpackRgb(rgb)); }
public boolean isInRange(yarnwrap.util.math.Position pos,double radius) { return wrapperContained.isInRange(pos.wrapperContained,radius); }
// public static boolean isInRange(yarnwrap.util.math.Position pos,double radius, ) { return net.minecraft.util.math.Vec3d.isInRange(pos.wrapperContained,radius); }
// public yarnwrap.util.math.Vec3d ofCenter(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.ofCenter(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d ofCenter(yarnwrap.util.math.Vec3i vec, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.ofCenter(vec.wrapperContained)); }
// public yarnwrap.util.math.Vec3d of(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.of(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d of(yarnwrap.util.math.Vec3i vec, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.of(vec.wrapperContained)); }
// public yarnwrap.util.math.Vec3d ofBottomCenter(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3d(wrapperContained.ofBottomCenter(vec.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d ofBottomCenter(yarnwrap.util.math.Vec3i vec, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.ofBottomCenter(vec.wrapperContained)); }
// public yarnwrap.util.math.Vec3d ofCenter(yarnwrap.util.math.Vec3i vec,double deltaY) { return new yarnwrap.util.math.Vec3d(wrapperContained.ofCenter(vec.wrapperContained,deltaY)); }
// public static yarnwrap.util.math.Vec3d ofCenter(yarnwrap.util.math.Vec3i vec,double deltaY, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.ofCenter(vec.wrapperContained,deltaY)); }
public yarnwrap.util.math.Vec3d rotateZ(float angle) { return new yarnwrap.util.math.Vec3d(wrapperContained.rotateZ(angle)); }
// public static yarnwrap.util.math.Vec3d rotateZ(float angle, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.rotateZ(angle)); }
public yarnwrap.util.math.Vec3d lerp(yarnwrap.util.math.Vec3d to,double delta) { return new yarnwrap.util.math.Vec3d(wrapperContained.lerp(to.wrapperContained,delta)); }
// public static yarnwrap.util.math.Vec3d lerp(yarnwrap.util.math.Vec3d to,double delta, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.lerp(to.wrapperContained,delta)); }
public double horizontalLength() { return wrapperContained.horizontalLength(); }
// public static double horizontalLength() { return net.minecraft.util.math.Vec3d.horizontalLength(); }
public double horizontalLengthSquared() { return wrapperContained.horizontalLengthSquared(); }
// public static double horizontalLengthSquared() { return net.minecraft.util.math.Vec3d.horizontalLengthSquared(); }
// public yarnwrap.util.math.Vec3d withAxis(Object axis,double value) { return new yarnwrap.util.math.Vec3d(wrapperContained.withAxis(axis,value)); }
// public static yarnwrap.util.math.Vec3d withAxis(Object axis,double value, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.withAxis(axis,value)); }
// public com.mojang.serialization.DataResult method_42394(java.util.List coordinates) { return wrapperContained.method_42394(coordinates); }
// public static com.mojang.serialization.DataResult method_42394(java.util.List coordinates, ) { return net.minecraft.util.math.Vec3d.method_42394(coordinates); }
// public yarnwrap.util.math.Vec3d method_42395(java.util.List coords) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_42395(coords)); }
// public static yarnwrap.util.math.Vec3d method_42395(java.util.List coords, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.method_42395(coords)); }
// public java.util.List method_42396(yarnwrap.util.math.Vec3d vec) { return wrapperContained.method_42396(vec.wrapperContained); }
// public static java.util.List method_42396(yarnwrap.util.math.Vec3d vec, ) { return net.minecraft.util.math.Vec3d.method_42396(vec.wrapperContained); }
public yarnwrap.util.math.Vec3d offset(yarnwrap.util.math.Direction direction,double value) { return new yarnwrap.util.math.Vec3d(wrapperContained.offset(direction.wrapperContained,value)); }
// public static yarnwrap.util.math.Vec3d offset(yarnwrap.util.math.Direction direction,double value, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.offset(direction.wrapperContained,value)); }
public org.joml.Vector3f toVector3f() { return wrapperContained.toVector3f(); }
// public static org.joml.Vector3f toVector3f() { return net.minecraft.util.math.Vec3d.toVector3f(); }
public yarnwrap.util.math.Vec3d addRandom(yarnwrap.util.math.random.Random random,float multiplier) { return new yarnwrap.util.math.Vec3d(wrapperContained.addRandom(random.wrapperContained,multiplier)); }
// public static yarnwrap.util.math.Vec3d addRandom(yarnwrap.util.math.random.Random random,float multiplier, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.addRandom(random.wrapperContained,multiplier)); }
// public yarnwrap.util.math.Vec3d add(yarnwrap.util.math.Vec3i vec,double deltaX,double deltaY,double deltaZ) { return new yarnwrap.util.math.Vec3d(wrapperContained.add(vec.wrapperContained,deltaX,deltaY,deltaZ)); }
// public static yarnwrap.util.math.Vec3d add(yarnwrap.util.math.Vec3i vec,double deltaX,double deltaY,double deltaZ, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.Vec3d.add(vec.wrapperContained,deltaX,deltaY,deltaZ)); }
public boolean isWithinRangeOf(yarnwrap.util.math.Vec3d vec,double horizontalRange,double verticalRange) { return wrapperContained.isWithinRangeOf(vec.wrapperContained,horizontalRange,verticalRange); }
// public static boolean isWithinRangeOf(yarnwrap.util.math.Vec3d vec,double horizontalRange,double verticalRange, ) { return net.minecraft.util.math.Vec3d.isWithinRangeOf(vec.wrapperContained,horizontalRange,verticalRange); }

}