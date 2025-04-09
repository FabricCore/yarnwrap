package yarnwrap.entity.ai.goal;
public class FleeEntityGoal { public net.minecraft.entity.ai.goal.FleeEntityGoal wrapperContained; public FleeEntityGoal(net.minecraft.entity.ai.goal.FleeEntityGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate withinRangePredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.withinRangePredicate); }
// public double slowSpeed() { return wrapperContained.slowSpeed; }
// public float fleeDistance() { return wrapperContained.fleeDistance; }
// public yarnwrap.entity.ai.pathing.Path fleePath() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.fleePath); }
// public java.util.function.Predicate inclusionSelector() { return wrapperContained.inclusionSelector; }
// public yarnwrap.entity.LivingEntity targetEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.targetEntity); }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public java.lang.Class classToFleeFrom() { return wrapperContained.classToFleeFrom; }
// public java.util.function.Predicate extraInclusionSelector() { return wrapperContained.extraInclusionSelector; }
// public yarnwrap.entity.ai.pathing.EntityNavigation fleeingEntityNavigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.fleeingEntityNavigation); }
// public double fastSpeed() { return wrapperContained.fastSpeed; }

}