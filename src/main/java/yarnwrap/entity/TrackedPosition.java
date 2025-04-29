package yarnwrap.entity;
public class TrackedPosition { public net.minecraft.entity.TrackedPosition wrapperContained; public TrackedPosition(net.minecraft.entity.TrackedPosition wrapperContained) { this.wrapperContained = wrapperContained; }

// public double COORDINATE_SCALE() { return wrapperContained.COORDINATE_SCALE; }
// public void COORDINATE_SCALE(double value) { wrapperContained.COORDINATE_SCALE = value; }
// public static double COORDINATE_SCALE() { return net.minecraft.entity.TrackedPosition.COORDINATE_SCALE; }
// public static void COORDINATE_SCALE(double value, ) { net.minecraft.entity.TrackedPosition.COORDINATE_SCALE = value; }

// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.TrackedPosition.pos); }
// public static void pos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.TrackedPosition.pos = value.wrapperContained; }

// public long pack(double value) { return wrapperContained.pack(value); }
// public static long pack(double value, ) { return net.minecraft.entity.TrackedPosition.pack(value); }
// public double unpack(long value) { return wrapperContained.unpack(value); }
// public static double unpack(long value, ) { return net.minecraft.entity.TrackedPosition.unpack(value); }
public yarnwrap.util.math.Vec3d withDelta(long x,long y,long z) { return new yarnwrap.util.math.Vec3d(wrapperContained.withDelta(x,y,z)); }
// public static yarnwrap.util.math.Vec3d withDelta(long x,long y,long z, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.TrackedPosition.withDelta(x,y,z)); }
public long getDeltaX(yarnwrap.util.math.Vec3d pos) { return wrapperContained.getDeltaX(pos.wrapperContained); }
// public static long getDeltaX(yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.entity.TrackedPosition.getDeltaX(pos.wrapperContained); }
public long getDeltaY(yarnwrap.util.math.Vec3d pos) { return wrapperContained.getDeltaY(pos.wrapperContained); }
// public static long getDeltaY(yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.entity.TrackedPosition.getDeltaY(pos.wrapperContained); }
public long getDeltaZ(yarnwrap.util.math.Vec3d pos) { return wrapperContained.getDeltaZ(pos.wrapperContained); }
// public static long getDeltaZ(yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.entity.TrackedPosition.getDeltaZ(pos.wrapperContained); }
public yarnwrap.util.math.Vec3d subtract(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.subtract(pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d subtract(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.TrackedPosition.subtract(pos.wrapperContained)); }
public void setPos(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPos(pos.wrapperContained); }
// public static void setPos(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.TrackedPosition.setPos(pos.wrapperContained); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.TrackedPosition.getPos()); }

}