package yarnwrap.entity;
public class TrackedPosition { public net.minecraft.entity.TrackedPosition wrapperContained; public TrackedPosition(net.minecraft.entity.TrackedPosition wrapperContained) { this.wrapperContained = wrapperContained; }

// public double COORDINATE_SCALE() { return wrapperContained.COORDINATE_SCALE; }
// public void COORDINATE_SCALE(double value) { wrapperContained.COORDINATE_SCALE = value; }
// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public long pack(double value) { return wrapperContained.pack(value); }
// public double unpack(long value) { return wrapperContained.unpack(value); }
public yarnwrap.util.math.Vec3d withDelta(long x,long y,long z) { return new yarnwrap.util.math.Vec3d(wrapperContained.withDelta(x,y,z)); }
public long getDeltaX(yarnwrap.util.math.Vec3d pos) { return wrapperContained.getDeltaX(pos.wrapperContained); }
public long getDeltaY(yarnwrap.util.math.Vec3d pos) { return wrapperContained.getDeltaY(pos.wrapperContained); }
public long getDeltaZ(yarnwrap.util.math.Vec3d pos) { return wrapperContained.getDeltaZ(pos.wrapperContained); }
public yarnwrap.util.math.Vec3d subtract(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.subtract(pos.wrapperContained)); }
public void setPos(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPos(pos.wrapperContained); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }

}