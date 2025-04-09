package yarnwrap.util.hit;
public class HitResult { public net.minecraft.util.hit.HitResult wrapperContained; public HitResult(net.minecraft.util.hit.HitResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
public Object getType() { return wrapperContained.getType(); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
public double squaredDistanceTo(yarnwrap.entity.Entity entity) { return wrapperContained.squaredDistanceTo(entity.wrapperContained); }

}