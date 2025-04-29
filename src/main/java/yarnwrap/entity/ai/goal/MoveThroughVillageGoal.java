package yarnwrap.entity.ai.goal;
public class MoveThroughVillageGoal { public net.minecraft.entity.ai.goal.MoveThroughVillageGoal wrapperContained; public MoveThroughVillageGoal(net.minecraft.entity.ai.goal.MoveThroughVillageGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos target() { return new yarnwrap.util.math.BlockPos(wrapperContained.target); }
// public void target(yarnwrap.util.math.BlockPos value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos target() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.goal.MoveThroughVillageGoal.target); }
// public static void target(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.target = value.wrapperContained; }

// public java.util.List visitedTargets() { return wrapperContained.visitedTargets; }
// public void visitedTargets(java.util.List value) { wrapperContained.visitedTargets = value; }
// public static java.util.List visitedTargets() { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.visitedTargets; }
// public static void visitedTargets(java.util.List value, ) { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.visitedTargets = value; }

// public int distance() { return wrapperContained.distance; }
// public void distance(int value) { wrapperContained.distance = value; }
// public static int distance() { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.distance; }
// public static void distance(int value, ) { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.distance = value; }

// public java.util.function.BooleanSupplier doorPassingThroughGetter() { return wrapperContained.doorPassingThroughGetter; }
// public void doorPassingThroughGetter(java.util.function.BooleanSupplier value) { wrapperContained.doorPassingThroughGetter = value; }
// public static java.util.function.BooleanSupplier doorPassingThroughGetter() { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.doorPassingThroughGetter; }
// public static void doorPassingThroughGetter(java.util.function.BooleanSupplier value, ) { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.doorPassingThroughGetter = value; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.speed = value; }

// public yarnwrap.entity.ai.pathing.Path targetPath() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.targetPath); }
// public void targetPath(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.targetPath = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.Path targetPath() { return new yarnwrap.entity.ai.pathing.Path(net.minecraft.entity.ai.goal.MoveThroughVillageGoal.targetPath); }
// public static void targetPath(yarnwrap.entity.ai.pathing.Path value, ) { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.targetPath = value.wrapperContained; }

// public boolean requiresNighttime() { return wrapperContained.requiresNighttime; }
// public void requiresNighttime(boolean value) { wrapperContained.requiresNighttime = value; }
// public static boolean requiresNighttime() { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.requiresNighttime; }
// public static void requiresNighttime(boolean value, ) { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.requiresNighttime = value; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.MoveThroughVillageGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.mob = value.wrapperContained; }

public MoveThroughVillageGoal(yarnwrap.entity.mob.PathAwareEntity entity,double speed,boolean requiresNighttime,int distance,java.util.function.BooleanSupplier doorPassingThroughGetter) { this.wrapperContained = new net.minecraft.entity.ai.goal.MoveThroughVillageGoal(entity.wrapperContained,speed,requiresNighttime,distance,doorPassingThroughGetter); }
// public boolean shouldVisit(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldVisit(pos.wrapperContained); }
// public static boolean shouldVisit(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.shouldVisit(pos.wrapperContained); }
// public double method_19053(yarnwrap.server.world.ServerWorld pos) { return wrapperContained.method_19053(pos.wrapperContained); }
// public static double method_19053(yarnwrap.server.world.ServerWorld pos, ) { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.method_19053(pos.wrapperContained); }
// public boolean method_43975(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_43975(poiType.wrapperContained); }
// public static boolean method_43975(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.method_43975(poiType.wrapperContained); }
// public boolean method_43976(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_43976(poiType.wrapperContained); }
// public static boolean method_43976(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.entity.ai.goal.MoveThroughVillageGoal.method_43976(poiType.wrapperContained); }
// public void forgetOldTarget() { wrapperContained.forgetOldTarget(); }
// public static void forgetOldTarget() { net.minecraft.entity.ai.goal.MoveThroughVillageGoal.forgetOldTarget(); }

}