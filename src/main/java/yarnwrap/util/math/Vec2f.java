package yarnwrap.util.math;
public class Vec2f { public net.minecraft.util.math.Vec2f wrapperContained; public Vec2f(net.minecraft.util.math.Vec2f wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec2f SOUTH_EAST_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.SOUTH_EAST_UNIT); }
// public void SOUTH_EAST_UNIT(yarnwrap.util.math.Vec2f value) { wrapperContained.SOUTH_EAST_UNIT = value.wrapperContained; }
public yarnwrap.util.math.Vec2f SOUTH_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.SOUTH_UNIT); }
// public void SOUTH_UNIT(yarnwrap.util.math.Vec2f value) { wrapperContained.SOUTH_UNIT = value.wrapperContained; }
public yarnwrap.util.math.Vec2f MAX_SOUTH_EAST() { return new yarnwrap.util.math.Vec2f(wrapperContained.MAX_SOUTH_EAST); }
// public void MAX_SOUTH_EAST(yarnwrap.util.math.Vec2f value) { wrapperContained.MAX_SOUTH_EAST = value.wrapperContained; }
public yarnwrap.util.math.Vec2f WEST_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.WEST_UNIT); }
// public void WEST_UNIT(yarnwrap.util.math.Vec2f value) { wrapperContained.WEST_UNIT = value.wrapperContained; }
public yarnwrap.util.math.Vec2f MIN_SOUTH_EAST() { return new yarnwrap.util.math.Vec2f(wrapperContained.MIN_SOUTH_EAST); }
// public void MIN_SOUTH_EAST(yarnwrap.util.math.Vec2f value) { wrapperContained.MIN_SOUTH_EAST = value.wrapperContained; }
public yarnwrap.util.math.Vec2f ZERO() { return new yarnwrap.util.math.Vec2f(wrapperContained.ZERO); }
// public void ZERO(yarnwrap.util.math.Vec2f value) { wrapperContained.ZERO = value.wrapperContained; }
public yarnwrap.util.math.Vec2f EAST_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.EAST_UNIT); }
// public void EAST_UNIT(yarnwrap.util.math.Vec2f value) { wrapperContained.EAST_UNIT = value.wrapperContained; }
public float y() { return wrapperContained.y; }
// public void y(float value) { wrapperContained.y = value; }
public float x() { return wrapperContained.x; }
// public void x(float value) { wrapperContained.x = value; }
public yarnwrap.util.math.Vec2f NORTH_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.NORTH_UNIT); }
// public void NORTH_UNIT(yarnwrap.util.math.Vec2f value) { wrapperContained.NORTH_UNIT = value.wrapperContained; }
public Vec2f(float x,float y) { this.wrapperContained = new net.minecraft.util.math.Vec2f(x,y); }
public boolean equals(yarnwrap.util.math.Vec2f other) { return wrapperContained.equals(other.wrapperContained); }
public yarnwrap.util.math.Vec2f normalize() { return new yarnwrap.util.math.Vec2f(wrapperContained.normalize()); }
public yarnwrap.util.math.Vec2f multiply(float value) { return new yarnwrap.util.math.Vec2f(wrapperContained.multiply(value)); }
public float dot(yarnwrap.util.math.Vec2f vec) { return wrapperContained.dot(vec.wrapperContained); }
public float length() { return wrapperContained.length(); }
public yarnwrap.util.math.Vec2f add(float value) { return new yarnwrap.util.math.Vec2f(wrapperContained.add(value)); }
public yarnwrap.util.math.Vec2f add(yarnwrap.util.math.Vec2f vec) { return new yarnwrap.util.math.Vec2f(wrapperContained.add(vec.wrapperContained)); }
public float lengthSquared() { return wrapperContained.lengthSquared(); }
public yarnwrap.util.math.Vec2f negate() { return new yarnwrap.util.math.Vec2f(wrapperContained.negate()); }
public float distanceSquared(yarnwrap.util.math.Vec2f vec) { return wrapperContained.distanceSquared(vec.wrapperContained); }

}