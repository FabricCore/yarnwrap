package yarnwrap.entity.ai;
public class TargetPredicate { public net.minecraft.entity.ai.TargetPredicate wrapperContained; public TargetPredicate(net.minecraft.entity.ai.TargetPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.TargetPredicate DEFAULT() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.DEFAULT = value.wrapperContained; }
// public double baseMaxDistance() { return wrapperContained.baseMaxDistance; }
// public void baseMaxDistance(double value) { wrapperContained.baseMaxDistance = value; }
// public boolean useDistanceScalingFactor() { return wrapperContained.useDistanceScalingFactor; }
// public void useDistanceScalingFactor(boolean value) { wrapperContained.useDistanceScalingFactor = value; }
// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public void predicate(java.util.function.Predicate value) { wrapperContained.predicate = value; }
// public double MIN_DISTANCE() { return wrapperContained.MIN_DISTANCE; }
// public void MIN_DISTANCE(double value) { wrapperContained.MIN_DISTANCE = value; }
// public boolean attackable() { return wrapperContained.attackable; }
// public void attackable(boolean value) { wrapperContained.attackable = value; }
// public boolean respectsVisibility() { return wrapperContained.respectsVisibility; }
// public void respectsVisibility(boolean value) { wrapperContained.respectsVisibility = value; }
public yarnwrap.entity.ai.TargetPredicate setBaseMaxDistance(double baseMaxDistance) { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.setBaseMaxDistance(baseMaxDistance)); }
public boolean test(yarnwrap.entity.LivingEntity baseEntity,yarnwrap.entity.LivingEntity targetEntity) { return wrapperContained.test(baseEntity.wrapperContained,targetEntity.wrapperContained); }
public yarnwrap.entity.ai.TargetPredicate setPredicate(java.util.function.Predicate predicate) { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.setPredicate(predicate)); }
public yarnwrap.entity.ai.TargetPredicate ignoreDistanceScalingFactor() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ignoreDistanceScalingFactor()); }
public yarnwrap.entity.ai.TargetPredicate copy() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.copy()); }
public yarnwrap.entity.ai.TargetPredicate createAttackable() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.createAttackable()); }
public yarnwrap.entity.ai.TargetPredicate createNonAttackable() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.createNonAttackable()); }
public yarnwrap.entity.ai.TargetPredicate ignoreVisibility() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ignoreVisibility()); }

}