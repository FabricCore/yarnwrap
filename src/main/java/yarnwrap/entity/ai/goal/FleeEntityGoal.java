package yarnwrap.entity.ai.goal;
public class FleeEntityGoal { public net.minecraft.entity.ai.goal.FleeEntityGoal wrapperContained; public FleeEntityGoal(net.minecraft.entity.ai.goal.FleeEntityGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate withinRangePredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.withinRangePredicate); }
// public void withinRangePredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.withinRangePredicate = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate withinRangePredicate() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.goal.FleeEntityGoal.withinRangePredicate); }
// public static void withinRangePredicate(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.withinRangePredicate = value.wrapperContained; }

// public double slowSpeed() { return wrapperContained.slowSpeed; }
// public void slowSpeed(double value) { wrapperContained.slowSpeed = value; }
// public static double slowSpeed() { return net.minecraft.entity.ai.goal.FleeEntityGoal.slowSpeed; }
// public static void slowSpeed(double value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.slowSpeed = value; }

// public float fleeDistance() { return wrapperContained.fleeDistance; }
// public void fleeDistance(float value) { wrapperContained.fleeDistance = value; }
// public static float fleeDistance() { return net.minecraft.entity.ai.goal.FleeEntityGoal.fleeDistance; }
// public static void fleeDistance(float value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.fleeDistance = value; }

// public yarnwrap.entity.ai.pathing.Path fleePath() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.fleePath); }
// public void fleePath(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.fleePath = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.Path fleePath() { return new yarnwrap.entity.ai.pathing.Path(net.minecraft.entity.ai.goal.FleeEntityGoal.fleePath); }
// public static void fleePath(yarnwrap.entity.ai.pathing.Path value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.fleePath = value.wrapperContained; }

// public java.util.function.Predicate inclusionSelector() { return wrapperContained.inclusionSelector; }
// public void inclusionSelector(java.util.function.Predicate value) { wrapperContained.inclusionSelector = value; }
// public static java.util.function.Predicate inclusionSelector() { return net.minecraft.entity.ai.goal.FleeEntityGoal.inclusionSelector; }
// public static void inclusionSelector(java.util.function.Predicate value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.inclusionSelector = value; }

// public yarnwrap.entity.LivingEntity targetEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.targetEntity); }
// public void targetEntity(yarnwrap.entity.LivingEntity value) { wrapperContained.targetEntity = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity targetEntity() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.FleeEntityGoal.targetEntity); }
// public static void targetEntity(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.targetEntity = value.wrapperContained; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.FleeEntityGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.mob = value.wrapperContained; }

// public java.lang.Class classToFleeFrom() { return wrapperContained.classToFleeFrom; }
// public void classToFleeFrom(java.lang.Class value) { wrapperContained.classToFleeFrom = value; }
// public static java.lang.Class classToFleeFrom() { return net.minecraft.entity.ai.goal.FleeEntityGoal.classToFleeFrom; }
// public static void classToFleeFrom(java.lang.Class value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.classToFleeFrom = value; }

// public java.util.function.Predicate extraInclusionSelector() { return wrapperContained.extraInclusionSelector; }
// public void extraInclusionSelector(java.util.function.Predicate value) { wrapperContained.extraInclusionSelector = value; }
// public static java.util.function.Predicate extraInclusionSelector() { return net.minecraft.entity.ai.goal.FleeEntityGoal.extraInclusionSelector; }
// public static void extraInclusionSelector(java.util.function.Predicate value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.extraInclusionSelector = value; }

// public yarnwrap.entity.ai.pathing.EntityNavigation fleeingEntityNavigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.fleeingEntityNavigation); }
// public void fleeingEntityNavigation(yarnwrap.entity.ai.pathing.EntityNavigation value) { wrapperContained.fleeingEntityNavigation = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.EntityNavigation fleeingEntityNavigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(net.minecraft.entity.ai.goal.FleeEntityGoal.fleeingEntityNavigation); }
// public static void fleeingEntityNavigation(yarnwrap.entity.ai.pathing.EntityNavigation value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.fleeingEntityNavigation = value.wrapperContained; }

// public double fastSpeed() { return wrapperContained.fastSpeed; }
// public void fastSpeed(double value) { wrapperContained.fastSpeed = value; }
// public static double fastSpeed() { return net.minecraft.entity.ai.goal.FleeEntityGoal.fastSpeed; }
// public static void fastSpeed(double value, ) { net.minecraft.entity.ai.goal.FleeEntityGoal.fastSpeed = value; }

public FleeEntityGoal(yarnwrap.entity.mob.PathAwareEntity mob,java.lang.Class fleeFromType,float distance,double slowSpeed,double fastSpeed) { this.wrapperContained = new net.minecraft.entity.ai.goal.FleeEntityGoal(mob.wrapperContained,fleeFromType,distance,slowSpeed,fastSpeed); }
public FleeEntityGoal(yarnwrap.entity.mob.PathAwareEntity fleeingEntity,java.lang.Class classToFleeFrom,float fleeDistance,double fleeSlowSpeed,double fleeFastSpeed,java.util.function.Predicate inclusionSelector) { this.wrapperContained = new net.minecraft.entity.ai.goal.FleeEntityGoal(fleeingEntity.wrapperContained,classToFleeFrom,fleeDistance,fleeSlowSpeed,fleeFastSpeed,inclusionSelector); }
public FleeEntityGoal(yarnwrap.entity.mob.PathAwareEntity mob,java.lang.Class fleeFromType,java.util.function.Predicate extraInclusionSelector,float distance,double slowSpeed,double fastSpeed,java.util.function.Predicate inclusionSelector) { this.wrapperContained = new net.minecraft.entity.ai.goal.FleeEntityGoal(mob.wrapperContained,fleeFromType,extraInclusionSelector,distance,slowSpeed,fastSpeed,inclusionSelector); }

}