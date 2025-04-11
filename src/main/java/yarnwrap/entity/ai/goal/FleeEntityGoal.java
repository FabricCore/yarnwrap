package yarnwrap.entity.ai.goal;
public class FleeEntityGoal { public net.minecraft.entity.ai.goal.FleeEntityGoal wrapperContained; public FleeEntityGoal(net.minecraft.entity.ai.goal.FleeEntityGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate withinRangePredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.withinRangePredicate); }
// public void withinRangePredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.withinRangePredicate = value.wrapperContained; }
// public double slowSpeed() { return wrapperContained.slowSpeed; }
// public void slowSpeed(double value) { wrapperContained.slowSpeed = value; }
// public float fleeDistance() { return wrapperContained.fleeDistance; }
// public void fleeDistance(float value) { wrapperContained.fleeDistance = value; }
// public yarnwrap.entity.ai.pathing.Path fleePath() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.fleePath); }
// public void fleePath(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.fleePath = value.wrapperContained; }
// public java.util.function.Predicate inclusionSelector() { return wrapperContained.inclusionSelector; }
// public void inclusionSelector(java.util.function.Predicate value) { wrapperContained.inclusionSelector = value; }
// public yarnwrap.entity.LivingEntity targetEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.targetEntity); }
// public void targetEntity(yarnwrap.entity.LivingEntity value) { wrapperContained.targetEntity = value.wrapperContained; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public java.lang.Class classToFleeFrom() { return wrapperContained.classToFleeFrom; }
// public void classToFleeFrom(java.lang.Class value) { wrapperContained.classToFleeFrom = value; }
// public java.util.function.Predicate extraInclusionSelector() { return wrapperContained.extraInclusionSelector; }
// public void extraInclusionSelector(java.util.function.Predicate value) { wrapperContained.extraInclusionSelector = value; }
// public yarnwrap.entity.ai.pathing.EntityNavigation fleeingEntityNavigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.fleeingEntityNavigation); }
// public void fleeingEntityNavigation(yarnwrap.entity.ai.pathing.EntityNavigation value) { wrapperContained.fleeingEntityNavigation = value.wrapperContained; }
// public double fastSpeed() { return wrapperContained.fastSpeed; }
// public void fastSpeed(double value) { wrapperContained.fastSpeed = value; }
public FleeEntityGoal(yarnwrap.entity.mob.PathAwareEntity mob,java.lang.Class fleeFromType,float distance,double slowSpeed,double fastSpeed) { this.wrapperContained = new net.minecraft.entity.ai.goal.FleeEntityGoal(mob.wrapperContained,fleeFromType,distance,slowSpeed,fastSpeed); }
public FleeEntityGoal(yarnwrap.entity.mob.PathAwareEntity fleeingEntity,java.lang.Class classToFleeFrom,float fleeDistance,double fleeSlowSpeed,double fleeFastSpeed,java.util.function.Predicate inclusionSelector) { this.wrapperContained = new net.minecraft.entity.ai.goal.FleeEntityGoal(fleeingEntity.wrapperContained,classToFleeFrom,fleeDistance,fleeSlowSpeed,fleeFastSpeed,inclusionSelector); }
public FleeEntityGoal(yarnwrap.entity.mob.PathAwareEntity mob,java.lang.Class fleeFromType,java.util.function.Predicate extraInclusionSelector,float distance,double slowSpeed,double fastSpeed,java.util.function.Predicate inclusionSelector) { this.wrapperContained = new net.minecraft.entity.ai.goal.FleeEntityGoal(mob.wrapperContained,fleeFromType,extraInclusionSelector,distance,slowSpeed,fastSpeed,inclusionSelector); }

}