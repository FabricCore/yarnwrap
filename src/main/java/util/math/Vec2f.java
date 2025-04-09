package yarnwrap.util.math;
public class Vec2f { public net.minecraft.util.math.Vec2f wrapperContained; public Vec2f(net.minecraft.util.math.Vec2f wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.Vec2f SOUTH_EAST_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.SOUTH_EAST_UNIT); }
public yarnwrap.util.math.Vec2f SOUTH_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.SOUTH_UNIT); }
public yarnwrap.util.math.Vec2f MAX_SOUTH_EAST() { return new yarnwrap.util.math.Vec2f(wrapperContained.MAX_SOUTH_EAST); }
public yarnwrap.util.math.Vec2f WEST_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.WEST_UNIT); }
public yarnwrap.util.math.Vec2f MIN_SOUTH_EAST() { return new yarnwrap.util.math.Vec2f(wrapperContained.MIN_SOUTH_EAST); }
public yarnwrap.util.math.Vec2f ZERO() { return new yarnwrap.util.math.Vec2f(wrapperContained.ZERO); }
public yarnwrap.util.math.Vec2f EAST_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.EAST_UNIT); }
public float y() { return wrapperContained.y; }
public float x() { return wrapperContained.x; }
public yarnwrap.util.math.Vec2f NORTH_UNIT() { return new yarnwrap.util.math.Vec2f(wrapperContained.NORTH_UNIT); }
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