package yarnwrap.entity.ai.goal;
public class FollowMobGoal { public net.minecraft.entity.ai.goal.FollowMobGoal wrapperContained; public FollowMobGoal(net.minecraft.entity.ai.goal.FollowMobGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.FollowMobGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.speed = value; }

// public int updateCountdownTicks() { return wrapperContained.updateCountdownTicks; }
// public void updateCountdownTicks(int value) { wrapperContained.updateCountdownTicks = value; }
// public static int updateCountdownTicks() { return net.minecraft.entity.ai.goal.FollowMobGoal.updateCountdownTicks; }
// public static void updateCountdownTicks(int value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.updateCountdownTicks = value; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.FollowMobGoal.mob); }
// public static void mob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.mob = value.wrapperContained; }

// public yarnwrap.entity.mob.MobEntity target() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.mob.MobEntity value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity target() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.FollowMobGoal.target); }
// public static void target(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.target = value.wrapperContained; }

// public yarnwrap.entity.ai.pathing.EntityNavigation navigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.navigation); }
// public void navigation(yarnwrap.entity.ai.pathing.EntityNavigation value) { wrapperContained.navigation = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.EntityNavigation navigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(net.minecraft.entity.ai.goal.FollowMobGoal.navigation); }
// public static void navigation(yarnwrap.entity.ai.pathing.EntityNavigation value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.navigation = value.wrapperContained; }

// public float maxDistance() { return wrapperContained.maxDistance; }
// public void maxDistance(float value) { wrapperContained.maxDistance = value; }
// public static float maxDistance() { return net.minecraft.entity.ai.goal.FollowMobGoal.maxDistance; }
// public static void maxDistance(float value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.maxDistance = value; }

// public java.util.function.Predicate targetPredicate() { return wrapperContained.targetPredicate; }
// public void targetPredicate(java.util.function.Predicate value) { wrapperContained.targetPredicate = value; }
// public static java.util.function.Predicate targetPredicate() { return net.minecraft.entity.ai.goal.FollowMobGoal.targetPredicate; }
// public static void targetPredicate(java.util.function.Predicate value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.targetPredicate = value; }

// public float oldWaterPathFindingPenalty() { return wrapperContained.oldWaterPathFindingPenalty; }
// public void oldWaterPathFindingPenalty(float value) { wrapperContained.oldWaterPathFindingPenalty = value; }
// public static float oldWaterPathFindingPenalty() { return net.minecraft.entity.ai.goal.FollowMobGoal.oldWaterPathFindingPenalty; }
// public static void oldWaterPathFindingPenalty(float value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.oldWaterPathFindingPenalty = value; }

// public float minDistance() { return wrapperContained.minDistance; }
// public void minDistance(float value) { wrapperContained.minDistance = value; }
// public static float minDistance() { return net.minecraft.entity.ai.goal.FollowMobGoal.minDistance; }
// public static void minDistance(float value, ) { net.minecraft.entity.ai.goal.FollowMobGoal.minDistance = value; }

public FollowMobGoal(yarnwrap.entity.mob.MobEntity mob,double speed,float minDistance,float maxDistance) { this.wrapperContained = new net.minecraft.entity.ai.goal.FollowMobGoal(mob.wrapperContained,speed,minDistance,maxDistance); }
// public boolean method_6259(yarnwrap.entity.mob.MobEntity target) { return wrapperContained.method_6259(target.wrapperContained); }
// public static boolean method_6259(yarnwrap.entity.mob.MobEntity target, ) { return net.minecraft.entity.ai.goal.FollowMobGoal.method_6259(target.wrapperContained); }

}