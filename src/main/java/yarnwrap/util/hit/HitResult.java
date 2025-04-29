package yarnwrap.util.hit;
public class HitResult { public net.minecraft.util.hit.HitResult wrapperContained; public HitResult(net.minecraft.util.hit.HitResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.hit.HitResult.pos); }
// public static void pos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.util.hit.HitResult.pos = value.wrapperContained; }

// public HitResult(yarnwrap.util.math.Vec3d pos) { this.wrapperContained = new net.minecraft.util.hit.HitResult(pos.wrapperContained); }
public Object getType() { return wrapperContained.getType(); }
// public static Object getType() { return net.minecraft.util.hit.HitResult.getType(); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.hit.HitResult.getPos()); }
public double squaredDistanceTo(yarnwrap.entity.Entity entity) { return wrapperContained.squaredDistanceTo(entity.wrapperContained); }
// public static double squaredDistanceTo(yarnwrap.entity.Entity entity, ) { return net.minecraft.util.hit.HitResult.squaredDistanceTo(entity.wrapperContained); }

}