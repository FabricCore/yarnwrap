package yarnwrap.entity.vehicle;
public class MinecartController { public net.minecraft.entity.vehicle.MinecartController wrapperContained; public MinecartController(net.minecraft.entity.vehicle.MinecartController wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.vehicle.AbstractMinecartEntity minecart() { return new yarnwrap.entity.vehicle.AbstractMinecartEntity(wrapperContained.minecart); }
// public void minecart(yarnwrap.entity.vehicle.AbstractMinecartEntity value) { wrapperContained.minecart = value.wrapperContained; }
// public static yarnwrap.entity.vehicle.AbstractMinecartEntity minecart() { return new yarnwrap.entity.vehicle.AbstractMinecartEntity(net.minecraft.entity.vehicle.MinecartController.minecart); }
// public static void minecart(yarnwrap.entity.vehicle.AbstractMinecartEntity value, ) { net.minecraft.entity.vehicle.MinecartController.minecart = value.wrapperContained; }

// public MinecartController(yarnwrap.entity.vehicle.AbstractMinecartEntity minecart) { this.wrapperContained = new net.minecraft.entity.vehicle.MinecartController(minecart.wrapperContained); }
public void setLerpTargetVelocity(double x,double y,double z) { wrapperContained.setLerpTargetVelocity(x,y,z); }
// public static void setLerpTargetVelocity(double x,double y,double z, ) { net.minecraft.entity.vehicle.MinecartController.setLerpTargetVelocity(x,y,z); }
public void setPitch(float pitch) { wrapperContained.setPitch(pitch); }
// public static void setPitch(float pitch, ) { net.minecraft.entity.vehicle.MinecartController.setPitch(pitch); }
public void setVelocity(yarnwrap.util.math.Vec3d velocity) { wrapperContained.setVelocity(velocity.wrapperContained); }
// public static void setVelocity(yarnwrap.util.math.Vec3d velocity, ) { net.minecraft.entity.vehicle.MinecartController.setVelocity(velocity.wrapperContained); }
public double moveAlongTrack(yarnwrap.util.math.BlockPos blockPos,yarnwrap.block.enums.RailShape railShape,double remainingMovement) { return wrapperContained.moveAlongTrack(blockPos.wrapperContained,railShape.wrapperContained,remainingMovement); }
// public static double moveAlongTrack(yarnwrap.util.math.BlockPos blockPos,yarnwrap.block.enums.RailShape railShape,double remainingMovement, ) { return net.minecraft.entity.vehicle.MinecartController.moveAlongTrack(blockPos.wrapperContained,railShape.wrapperContained,remainingMovement); }
public void setVelocity(double x,double y,double z) { wrapperContained.setVelocity(x,y,z); }
// public static void setVelocity(double x,double y,double z, ) { net.minecraft.entity.vehicle.MinecartController.setVelocity(x,y,z); }
public void setYaw(float yaw) { wrapperContained.setYaw(yaw); }
// public static void setYaw(float yaw, ) { net.minecraft.entity.vehicle.MinecartController.setYaw(yaw); }
public void setPos(yarnwrap.util.math.Vec3d pos) { wrapperContained.setPos(pos.wrapperContained); }
// public static void setPos(yarnwrap.util.math.Vec3d pos, ) { net.minecraft.entity.vehicle.MinecartController.setPos(pos.wrapperContained); }
public void setPos(double x,double y,double z) { wrapperContained.setPos(x,y,z); }
// public static void setPos(double x,double y,double z, ) { net.minecraft.entity.vehicle.MinecartController.setPos(x,y,z); }
public yarnwrap.util.math.Vec3d limitSpeed(yarnwrap.util.math.Vec3d velocity) { return new yarnwrap.util.math.Vec3d(wrapperContained.limitSpeed(velocity.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d limitSpeed(yarnwrap.util.math.Vec3d velocity, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.MinecartController.limitSpeed(velocity.wrapperContained)); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.vehicle.MinecartController.tick(); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
// public static yarnwrap.world.World getWorld() { return new yarnwrap.world.World(net.minecraft.entity.vehicle.MinecartController.getWorld()); }
public void moveOnRail(yarnwrap.server.world.ServerWorld world) { wrapperContained.moveOnRail(world.wrapperContained); }
// public static void moveOnRail(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.vehicle.MinecartController.moveOnRail(world.wrapperContained); }
public yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity()); }
// public static yarnwrap.util.math.Vec3d getVelocity() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.MinecartController.getVelocity()); }
public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
// public static yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.MinecartController.getPos()); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.entity.vehicle.MinecartController.getX(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.entity.vehicle.MinecartController.getY(); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.entity.vehicle.MinecartController.getZ(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.entity.vehicle.MinecartController.getPitch(); }
public float getYaw() { return wrapperContained.getYaw(); }
// public static float getYaw() { return net.minecraft.entity.vehicle.MinecartController.getYaw(); }
public yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getHorizontalFacing()); }
// public static yarnwrap.util.math.Direction getHorizontalFacing() { return new yarnwrap.util.math.Direction(net.minecraft.entity.vehicle.MinecartController.getHorizontalFacing()); }
public double getMaxSpeed(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getMaxSpeed(world.wrapperContained); }
// public static double getMaxSpeed(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.entity.vehicle.MinecartController.getMaxSpeed(world.wrapperContained); }
public double getSpeedRetention() { return wrapperContained.getSpeedRetention(); }
// public static double getSpeedRetention() { return net.minecraft.entity.vehicle.MinecartController.getSpeedRetention(); }
public boolean handleCollision() { return wrapperContained.handleCollision(); }
// public static boolean handleCollision() { return net.minecraft.entity.vehicle.MinecartController.handleCollision(); }
public yarnwrap.entity.PositionInterpolator getInterpolator() { return new yarnwrap.entity.PositionInterpolator(wrapperContained.getInterpolator()); }
// public static yarnwrap.entity.PositionInterpolator getInterpolator() { return new yarnwrap.entity.PositionInterpolator(net.minecraft.entity.vehicle.MinecartController.getInterpolator()); }

}