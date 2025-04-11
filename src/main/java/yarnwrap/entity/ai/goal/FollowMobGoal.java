package yarnwrap.entity.ai.goal;
public class FollowMobGoal { public net.minecraft.entity.ai.goal.FollowMobGoal wrapperContained; public FollowMobGoal(net.minecraft.entity.ai.goal.FollowMobGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public int updateCountdownTicks() { return wrapperContained.updateCountdownTicks; }
// public void updateCountdownTicks(int value) { wrapperContained.updateCountdownTicks = value; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public yarnwrap.entity.mob.MobEntity target() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.mob.MobEntity value) { wrapperContained.target = value.wrapperContained; }
// public yarnwrap.entity.ai.pathing.EntityNavigation navigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.navigation); }
// public void navigation(yarnwrap.entity.ai.pathing.EntityNavigation value) { wrapperContained.navigation = value.wrapperContained; }
// public float maxDistance() { return wrapperContained.maxDistance; }
// public void maxDistance(float value) { wrapperContained.maxDistance = value; }
// public java.util.function.Predicate targetPredicate() { return wrapperContained.targetPredicate; }
// public void targetPredicate(java.util.function.Predicate value) { wrapperContained.targetPredicate = value; }
// public float oldWaterPathFindingPenalty() { return wrapperContained.oldWaterPathFindingPenalty; }
// public void oldWaterPathFindingPenalty(float value) { wrapperContained.oldWaterPathFindingPenalty = value; }
// public float minDistance() { return wrapperContained.minDistance; }
// public void minDistance(float value) { wrapperContained.minDistance = value; }
public FollowMobGoal(yarnwrap.entity.mob.MobEntity mob,double speed,float minDistance,float maxDistance) { this.wrapperContained = new net.minecraft.entity.ai.goal.FollowMobGoal(mob.wrapperContained,speed,minDistance,maxDistance); }
// public boolean method_6259(yarnwrap.entity.mob.MobEntity target) { return wrapperContained.method_6259(target.wrapperContained); }

}