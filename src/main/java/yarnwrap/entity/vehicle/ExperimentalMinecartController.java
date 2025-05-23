package yarnwrap.entity.vehicle;
public class ExperimentalMinecartController { public net.minecraft.entity.vehicle.ExperimentalMinecartController wrapperContained; public ExperimentalMinecartController(net.minecraft.entity.vehicle.ExperimentalMinecartController wrapperContained) { this.wrapperContained = wrapperContained; }

// public int REFRESH_FREQUENCY() { return wrapperContained.REFRESH_FREQUENCY; }
// public void REFRESH_FREQUENCY(int value) { wrapperContained.REFRESH_FREQUENCY = value; }
public static int REFRESH_FREQUENCY() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.REFRESH_FREQUENCY; }
// public static void REFRESH_FREQUENCY(int value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.REFRESH_FREQUENCY = value; }

public java.util.List stagingLerpSteps() { return wrapperContained.stagingLerpSteps; }
// public void stagingLerpSteps(java.util.List value) { wrapperContained.stagingLerpSteps = value; }
// public static java.util.List stagingLerpSteps() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.stagingLerpSteps; }
// public static void stagingLerpSteps(java.util.List value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.stagingLerpSteps = value; }

public java.util.List currentLerpSteps() { return wrapperContained.currentLerpSteps; }
// public void currentLerpSteps(java.util.List value) { wrapperContained.currentLerpSteps = value; }
// public static java.util.List currentLerpSteps() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.currentLerpSteps; }
// public static void currentLerpSteps(java.util.List value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.currentLerpSteps = value; }

public double totalWeight() { return wrapperContained.totalWeight; }
public void totalWeight(double value) { wrapperContained.totalWeight = value; }
// public static double totalWeight() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.totalWeight; }
// public static void totalWeight(double value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.totalWeight = value; }

public Object initialStep() { return wrapperContained.initialStep; }
// public void initialStep(Object value) { wrapperContained.initialStep = value; }
// // public static Object initialStep() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.initialStep; }
// // public static void initialStep(Object value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.initialStep = value; }

// public Object lastReturnedInterpolatedStep() { return wrapperContained.lastReturnedInterpolatedStep; }
// // public void lastReturnedInterpolatedStep(Object value) { wrapperContained.lastReturnedInterpolatedStep = value; }
// // public static Object lastReturnedInterpolatedStep() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.lastReturnedInterpolatedStep; }
// // public static void lastReturnedInterpolatedStep(Object value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.lastReturnedInterpolatedStep = value; }

// public int lastQueriedTicksToNextRefresh() { return wrapperContained.lastQueriedTicksToNextRefresh; }
// public void lastQueriedTicksToNextRefresh(int value) { wrapperContained.lastQueriedTicksToNextRefresh = value; }
// public static int lastQueriedTicksToNextRefresh() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.lastQueriedTicksToNextRefresh; }
// public static void lastQueriedTicksToNextRefresh(int value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.lastQueriedTicksToNextRefresh = value; }

// public float lastQueriedTickProgress() { return wrapperContained.lastQueriedTickProgress; }
// public void lastQueriedTickProgress(float value) { wrapperContained.lastQueriedTickProgress = value; }
// public static float lastQueriedTickProgress() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.lastQueriedTickProgress; }
// public static void lastQueriedTickProgress(float value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.lastQueriedTickProgress = value; }

// public int ticksToNextRefresh() { return wrapperContained.ticksToNextRefresh; }
// public void ticksToNextRefresh(int value) { wrapperContained.ticksToNextRefresh = value; }
// public static int ticksToNextRefresh() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.ticksToNextRefresh; }
// public static void ticksToNextRefresh(int value, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.ticksToNextRefresh = value; }

// public yarnwrap.util.math.Vec3d calcNewHorizontalVelocity(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d horizontalVelocity,Object iteration,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState railState,yarnwrap.block.enums.RailShape railShape) { return new yarnwrap.util.math.Vec3d(wrapperContained.calcNewHorizontalVelocity(world.wrapperContained,horizontalVelocity.wrapperContained,iteration,pos.wrapperContained,railState.wrapperContained,railShape.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d calcNewHorizontalVelocity(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d horizontalVelocity,Object iteration,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState railState,yarnwrap.block.enums.RailShape railShape, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.ExperimentalMinecartController.calcNewHorizontalVelocity(world.wrapperContained,horizontalVelocity.wrapperContained,iteration,pos.wrapperContained,railState.wrapperContained,railShape.wrapperContained)); }
// public yarnwrap.util.math.Vec3d decelerateFromPoweredRail(yarnwrap.util.math.Vec3d velocity,yarnwrap.block.BlockState railState) { return new yarnwrap.util.math.Vec3d(wrapperContained.decelerateFromPoweredRail(velocity.wrapperContained,railState.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d decelerateFromPoweredRail(yarnwrap.util.math.Vec3d velocity,yarnwrap.block.BlockState railState, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.ExperimentalMinecartController.decelerateFromPoweredRail(velocity.wrapperContained,railState.wrapperContained)); }
// public yarnwrap.util.math.Vec3d applySlopeVelocity(yarnwrap.util.math.Vec3d horizontalVelocity,yarnwrap.block.enums.RailShape railShape) { return new yarnwrap.util.math.Vec3d(wrapperContained.applySlopeVelocity(horizontalVelocity.wrapperContained,railShape.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d applySlopeVelocity(yarnwrap.util.math.Vec3d horizontalVelocity,yarnwrap.block.enums.RailShape railShape, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.ExperimentalMinecartController.applySlopeVelocity(horizontalVelocity.wrapperContained,railShape.wrapperContained)); }
// public yarnwrap.util.math.Vec3d accelerateFromPoweredRail(yarnwrap.util.math.Vec3d velocity,yarnwrap.util.math.BlockPos railPos,yarnwrap.block.BlockState railState) { return new yarnwrap.util.math.Vec3d(wrapperContained.accelerateFromPoweredRail(velocity.wrapperContained,railPos.wrapperContained,railState.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d accelerateFromPoweredRail(yarnwrap.util.math.Vec3d velocity,yarnwrap.util.math.BlockPos railPos,yarnwrap.block.BlockState railState, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.ExperimentalMinecartController.accelerateFromPoweredRail(velocity.wrapperContained,railPos.wrapperContained,railState.wrapperContained)); }
public void adjustToRail(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,boolean ignoreWeight) { wrapperContained.adjustToRail(pos.wrapperContained,blockState.wrapperContained,ignoreWeight); }
// public static void adjustToRail(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,boolean ignoreWeight, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.adjustToRail(pos.wrapperContained,blockState.wrapperContained,ignoreWeight); }
// public boolean ascends(yarnwrap.util.math.Vec3d velocity,yarnwrap.block.enums.RailShape railShape) { return wrapperContained.ascends(velocity.wrapperContained,railShape.wrapperContained); }
// public static boolean ascends(yarnwrap.util.math.Vec3d velocity,yarnwrap.block.enums.RailShape railShape, ) { return net.minecraft.entity.vehicle.ExperimentalMinecartController.ascends(velocity.wrapperContained,railShape.wrapperContained); }
public float getLerpedPitch(float tickProgress) { return wrapperContained.getLerpedPitch(tickProgress); }
// public static float getLerpedPitch(float tickProgress, ) { return net.minecraft.entity.vehicle.ExperimentalMinecartController.getLerpedPitch(tickProgress); }
public float getLerpedYaw(float tickProgress) { return wrapperContained.getLerpedYaw(tickProgress); }
// public static float getLerpedYaw(float tickProgress, ) { return net.minecraft.entity.vehicle.ExperimentalMinecartController.getLerpedYaw(tickProgress); }
// public yarnwrap.util.math.Vec3d applyInitialVelocity(yarnwrap.util.math.Vec3d horizontalVelocity) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyInitialVelocity(horizontalVelocity.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d applyInitialVelocity(yarnwrap.util.math.Vec3d horizontalVelocity, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.ExperimentalMinecartController.applyInitialVelocity(horizontalVelocity.wrapperContained)); }
public yarnwrap.util.math.Vec3d getLerpedPosition(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLerpedPosition(tickProgress)); }
// public static yarnwrap.util.math.Vec3d getLerpedPosition(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.ExperimentalMinecartController.getLerpedPosition(tickProgress)); }
public yarnwrap.util.math.Vec3d getLerpedVelocity(float tickProgress) { return new yarnwrap.util.math.Vec3d(wrapperContained.getLerpedVelocity(tickProgress)); }
// public static yarnwrap.util.math.Vec3d getLerpedVelocity(float tickProgress, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.vehicle.ExperimentalMinecartController.getLerpedVelocity(tickProgress)); }
// public Object getLerpedStep(float tickProgress) { return wrapperContained.getLerpedStep(tickProgress); }
// public static Object getLerpedStep(float tickProgress, ) { return net.minecraft.entity.vehicle.ExperimentalMinecartController.getLerpedStep(tickProgress); }
public void setInitialStep() { wrapperContained.setInitialStep(); }
// public static void setInitialStep() { net.minecraft.entity.vehicle.ExperimentalMinecartController.setInitialStep(); }
public boolean hasCurrentLerpSteps() { return wrapperContained.hasCurrentLerpSteps(); }
// public static boolean hasCurrentLerpSteps() { return net.minecraft.entity.vehicle.ExperimentalMinecartController.hasCurrentLerpSteps(); }
// public void tickClient() { wrapperContained.tickClient(); }
// public static void tickClient() { net.minecraft.entity.vehicle.ExperimentalMinecartController.tickClient(); }
// public void setAngles(float yaw,float pitch) { wrapperContained.setAngles(yaw,pitch); }
// public static void setAngles(float yaw,float pitch, ) { net.minecraft.entity.vehicle.ExperimentalMinecartController.setAngles(yaw,pitch); }
// public boolean restOnVShapedTrack(yarnwrap.block.enums.RailShape currentRailShape,yarnwrap.block.enums.RailShape newRailShape) { return wrapperContained.restOnVShapedTrack(currentRailShape.wrapperContained,newRailShape.wrapperContained); }
// public static boolean restOnVShapedTrack(yarnwrap.block.enums.RailShape currentRailShape,yarnwrap.block.enums.RailShape newRailShape, ) { return net.minecraft.entity.vehicle.ExperimentalMinecartController.restOnVShapedTrack(currentRailShape.wrapperContained,newRailShape.wrapperContained); }
public boolean pickUpEntities(yarnwrap.util.math.Box box) { return wrapperContained.pickUpEntities(box.wrapperContained); }
// public static boolean pickUpEntities(yarnwrap.util.math.Box box, ) { return net.minecraft.entity.vehicle.ExperimentalMinecartController.pickUpEntities(box.wrapperContained); }
public boolean pushAwayFromEntities(yarnwrap.util.math.Box box) { return wrapperContained.pushAwayFromEntities(box.wrapperContained); }
// public static boolean pushAwayFromEntities(yarnwrap.util.math.Box box, ) { return net.minecraft.entity.vehicle.ExperimentalMinecartController.pushAwayFromEntities(box.wrapperContained); }

}