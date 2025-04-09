package yarnwrap.util.math;
public class Vec3i { public net.minecraft.util.math.Vec3i wrapperContained; public Vec3i(net.minecraft.util.math.Vec3i wrapperContained) { this.wrapperContained = wrapperContained; }

// public int z() { return wrapperContained.z; }
// public int y() { return wrapperContained.y; }
// public int x() { return wrapperContained.x; }
public yarnwrap.util.math.Vec3i ZERO() { return new yarnwrap.util.math.Vec3i(wrapperContained.ZERO); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.Vec3i setY(int y) { return new yarnwrap.util.math.Vec3i(wrapperContained.setY(y)); }
public yarnwrap.util.math.Vec3i crossProduct(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3i(wrapperContained.crossProduct(vec.wrapperContained)); }
public int getZ() { return wrapperContained.getZ(); }
public double getSquaredDistance(yarnwrap.util.math.Vec3i vec) { return wrapperContained.getSquaredDistance(vec.wrapperContained); }
public int getX() { return wrapperContained.getX(); }
public int getY() { return wrapperContained.getY(); }
public double getSquaredDistanceFromCenter(double x,double y,double z) { return wrapperContained.getSquaredDistanceFromCenter(x,y,z); }
public int getManhattanDistance(yarnwrap.util.math.Vec3i vec) { return wrapperContained.getManhattanDistance(vec.wrapperContained); }
public boolean isWithinDistance(yarnwrap.util.math.Position pos,double distance) { return wrapperContained.isWithinDistance(pos.wrapperContained,distance); }
public double getSquaredDistance(yarnwrap.util.math.Position pos) { return wrapperContained.getSquaredDistance(pos.wrapperContained); }
public boolean isWithinDistance(yarnwrap.util.math.Vec3i vec,double distance) { return wrapperContained.isWithinDistance(vec.wrapperContained,distance); }
// public yarnwrap.util.math.Vec3i setX(int x) { return new yarnwrap.util.math.Vec3i(wrapperContained.setX(x)); }
// public yarnwrap.util.math.Vec3i setZ(int z) { return new yarnwrap.util.math.Vec3i(wrapperContained.setZ(z)); }
public yarnwrap.util.math.Vec3i offset(yarnwrap.util.math.Direction direction,int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.offset(direction.wrapperContained,distance)); }
public yarnwrap.util.math.Vec3i down(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.down(distance)); }
public yarnwrap.util.math.Vec3i down() { return new yarnwrap.util.math.Vec3i(wrapperContained.down()); }
public java.lang.String toShortString() { return wrapperContained.toShortString(); }
// public int getComponentAlongAxis(Object axis) { return wrapperContained.getComponentAlongAxis(axis); }
public yarnwrap.util.math.Vec3i up(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.up(distance)); }
public yarnwrap.util.math.Vec3i up() { return new yarnwrap.util.math.Vec3i(wrapperContained.up()); }
public yarnwrap.util.math.Vec3i add(int x,int y,int z) { return new yarnwrap.util.math.Vec3i(wrapperContained.add(x,y,z)); }
// public yarnwrap.util.math.Vec3i offset(Object axis,int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.offset(axis,distance)); }
public yarnwrap.util.math.Vec3i offset(yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Vec3i(wrapperContained.offset(direction.wrapperContained)); }
public yarnwrap.util.math.Vec3i subtract(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3i(wrapperContained.subtract(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3i add(yarnwrap.util.math.Vec3i vec) { return new yarnwrap.util.math.Vec3i(wrapperContained.add(vec.wrapperContained)); }
public yarnwrap.util.math.Vec3i east(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.east(distance)); }
public yarnwrap.util.math.Vec3i east() { return new yarnwrap.util.math.Vec3i(wrapperContained.east()); }
public yarnwrap.util.math.Vec3i west(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.west(distance)); }
public yarnwrap.util.math.Vec3i west() { return new yarnwrap.util.math.Vec3i(wrapperContained.west()); }
public yarnwrap.util.math.Vec3i south(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.south(distance)); }
public yarnwrap.util.math.Vec3i south() { return new yarnwrap.util.math.Vec3i(wrapperContained.south()); }
public yarnwrap.util.math.Vec3i north(int distance) { return new yarnwrap.util.math.Vec3i(wrapperContained.north(distance)); }
public yarnwrap.util.math.Vec3i north() { return new yarnwrap.util.math.Vec3i(wrapperContained.north()); }
public yarnwrap.util.math.Vec3i multiply(int scale) { return new yarnwrap.util.math.Vec3i(wrapperContained.multiply(scale)); }
public com.mojang.serialization.Codec createOffsetCodec(int maxAbsValue) { return wrapperContained.createOffsetCodec(maxAbsValue); }
public double getSquaredDistance(double x,double y,double z) { return wrapperContained.getSquaredDistance(x,y,z); }

}