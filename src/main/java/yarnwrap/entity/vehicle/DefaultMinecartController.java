package yarnwrap.entity.vehicle;
public class DefaultMinecartController { public net.minecraft.entity.vehicle.DefaultMinecartController wrapperContained; public DefaultMinecartController(net.minecraft.entity.vehicle.DefaultMinecartController wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.velocity); }
// public void velocity(yarnwrap.util.math.Vec3d value) { wrapperContained.velocity = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d velocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.DefaultMinecartController.velocity); }
// public static void velocity(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.vehicle.DefaultMinecartController.velocity = value.wrapperContained; }

// public yarnwrap.entity.PositionInterpolator interpolator() { return new yarnwrap.entity.PositionInterpolator(wrapperContained.interpolator); }
// public void interpolator(yarnwrap.entity.PositionInterpolator value) { wrapperContained.interpolator = value.wrapperContained; }
// public static yarnwrap.entity.PositionInterpolator interpolator() { return new yarnwrap.entity.PositionInterpolator(net.minecraft.entity.vehicle.DefaultMinecartController.interpolator); }
// public static void interpolator(yarnwrap.entity.PositionInterpolator value, ) { net.minecraft.entity.vehicle.DefaultMinecartController.interpolator = value.wrapperContained; }

public yarnwrap.util.math.Vec3d simulateMovement(double x,double y,double z,double movement) { return new yarnwrap.util.math.Vec3d(wrapperContained.simulateMovement(x,y,z,movement)); }
// public static yarnwrap.util.math.Vec3d simulateMovement(double x,double y,double z,double movement, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.DefaultMinecartController.simulateMovement(x,y,z,movement)); }
public yarnwrap.util.math.Vec3d snapPositionToRail(double x,double y,double z) { return new yarnwrap.util.math.Vec3d(wrapperContained.snapPositionToRail(x,y,z)); }
// public static yarnwrap.util.math.Vec3d snapPositionToRail(double x,double y,double z, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.DefaultMinecartController.snapPositionToRail(x,y,z)); }
public void onLerp(yarnwrap.entity.PositionInterpolator interpolator) { wrapperContained.onLerp(interpolator.wrapperContained); }
// public static void onLerp(yarnwrap.entity.PositionInterpolator interpolator, ) { net.minecraft.entity.vehicle.DefaultMinecartController.onLerp(interpolator.wrapperContained); }

}