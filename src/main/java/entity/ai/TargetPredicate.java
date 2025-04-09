package yarnwrap.entity.ai;
public class TargetPredicate { public net.minecraft.entity.ai.TargetPredicate wrapperContained; public TargetPredicate(net.minecraft.entity.ai.TargetPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.TargetPredicate DEFAULT() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.DEFAULT); }
// public double baseMaxDistance() { return wrapperContained.baseMaxDistance; }
// public boolean useDistanceScalingFactor() { return wrapperContained.useDistanceScalingFactor; }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public double MIN_DISTANCE() { return wrapperContained.MIN_DISTANCE; }
// public boolean attackable() { return wrapperContained.attackable; }
// public boolean respectsVisibility() { return wrapperContained.respectsVisibility; }
public yarnwrap.entity.ai.TargetPredicate setBaseMaxDistance(double baseMaxDistance) { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.setBaseMaxDistance(baseMaxDistance)); }
public boolean test(yarnwrap.entity.LivingEntity baseEntity,yarnwrap.entity.LivingEntity targetEntity) { return wrapperContained.test(baseEntity.wrapperContained,targetEntity.wrapperContained); }
public yarnwrap.entity.ai.TargetPredicate setPredicate(java.util.function.Predicate predicate) { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.setPredicate(predicate)); }
public yarnwrap.entity.ai.TargetPredicate ignoreDistanceScalingFactor() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ignoreDistanceScalingFactor()); }
public yarnwrap.entity.ai.TargetPredicate copy() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.copy()); }
public yarnwrap.entity.ai.TargetPredicate createAttackable() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.createAttackable()); }
public yarnwrap.entity.ai.TargetPredicate createNonAttackable() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.createNonAttackable()); }
public yarnwrap.entity.ai.TargetPredicate ignoreVisibility() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ignoreVisibility()); }

}