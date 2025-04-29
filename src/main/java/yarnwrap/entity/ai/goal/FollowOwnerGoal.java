package yarnwrap.entity.ai.goal;
public class FollowOwnerGoal { public net.minecraft.entity.ai.goal.FollowOwnerGoal wrapperContained; public FollowOwnerGoal(net.minecraft.entity.ai.goal.FollowOwnerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.FollowOwnerGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.FollowOwnerGoal.speed = value; }

// public int updateCountdownTicks() { return wrapperContained.updateCountdownTicks; }
// public void updateCountdownTicks(int value) { wrapperContained.updateCountdownTicks = value; }
// public static int updateCountdownTicks() { return net.minecraft.entity.ai.goal.FollowOwnerGoal.updateCountdownTicks; }
// public static void updateCountdownTicks(int value, ) { net.minecraft.entity.ai.goal.FollowOwnerGoal.updateCountdownTicks = value; }

// public yarnwrap.entity.LivingEntity owner() { return new yarnwrap.entity.LivingEntity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.LivingEntity value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity owner() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.FollowOwnerGoal.owner); }
// public static void owner(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.FollowOwnerGoal.owner = value.wrapperContained; }

// public yarnwrap.entity.ai.pathing.EntityNavigation navigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.navigation); }
// public void navigation(yarnwrap.entity.ai.pathing.EntityNavigation value) { wrapperContained.navigation = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.EntityNavigation navigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(net.minecraft.entity.ai.goal.FollowOwnerGoal.navigation); }
// public static void navigation(yarnwrap.entity.ai.pathing.EntityNavigation value, ) { net.minecraft.entity.ai.goal.FollowOwnerGoal.navigation = value.wrapperContained; }

// public float oldWaterPathfindingPenalty() { return wrapperContained.oldWaterPathfindingPenalty; }
// public void oldWaterPathfindingPenalty(float value) { wrapperContained.oldWaterPathfindingPenalty = value; }
// public static float oldWaterPathfindingPenalty() { return net.minecraft.entity.ai.goal.FollowOwnerGoal.oldWaterPathfindingPenalty; }
// public static void oldWaterPathfindingPenalty(float value, ) { net.minecraft.entity.ai.goal.FollowOwnerGoal.oldWaterPathfindingPenalty = value; }

// public yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(wrapperContained.tameable); }
// public void tameable(yarnwrap.entity.passive.TameableEntity value) { wrapperContained.tameable = value.wrapperContained; }
// public static yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(net.minecraft.entity.ai.goal.FollowOwnerGoal.tameable); }
// public static void tameable(yarnwrap.entity.passive.TameableEntity value, ) { net.minecraft.entity.ai.goal.FollowOwnerGoal.tameable = value.wrapperContained; }

// public float minDistance() { return wrapperContained.minDistance; }
// public void minDistance(float value) { wrapperContained.minDistance = value; }
// public static float minDistance() { return net.minecraft.entity.ai.goal.FollowOwnerGoal.minDistance; }
// public static void minDistance(float value, ) { net.minecraft.entity.ai.goal.FollowOwnerGoal.minDistance = value; }

// public float maxDistance() { return wrapperContained.maxDistance; }
// public void maxDistance(float value) { wrapperContained.maxDistance = value; }
// public static float maxDistance() { return net.minecraft.entity.ai.goal.FollowOwnerGoal.maxDistance; }
// public static void maxDistance(float value, ) { net.minecraft.entity.ai.goal.FollowOwnerGoal.maxDistance = value; }

public FollowOwnerGoal(yarnwrap.entity.passive.TameableEntity tameable,double speed,float minDistance,float maxDistance) { this.wrapperContained = new net.minecraft.entity.ai.goal.FollowOwnerGoal(tameable.wrapperContained,speed,minDistance,maxDistance); }

}