package yarnwrap.entity.ai;
public class TargetPredicate { public net.minecraft.entity.ai.TargetPredicate wrapperContained; public TargetPredicate(net.minecraft.entity.ai.TargetPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate DEFAULT() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.entity.ai.TargetPredicate DEFAULT() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.TargetPredicate.DEFAULT); }
// public static void DEFAULT(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.TargetPredicate.DEFAULT = value.wrapperContained; }

// public double baseMaxDistance() { return wrapperContained.baseMaxDistance; }
// public void baseMaxDistance(double value) { wrapperContained.baseMaxDistance = value; }
// public static double baseMaxDistance() { return net.minecraft.entity.ai.TargetPredicate.baseMaxDistance; }
// public static void baseMaxDistance(double value, ) { net.minecraft.entity.ai.TargetPredicate.baseMaxDistance = value; }

// public boolean useDistanceScalingFactor() { return wrapperContained.useDistanceScalingFactor; }
// public void useDistanceScalingFactor(boolean value) { wrapperContained.useDistanceScalingFactor = value; }
// public static boolean useDistanceScalingFactor() { return net.minecraft.entity.ai.TargetPredicate.useDistanceScalingFactor; }
// public static void useDistanceScalingFactor(boolean value, ) { net.minecraft.entity.ai.TargetPredicate.useDistanceScalingFactor = value; }

// public java.util.function.Predicate predicate() { return wrapperContained.predicate; }
// public void predicate(java.util.function.Predicate value) { wrapperContained.predicate = value; }
// public static java.util.function.Predicate predicate() { return net.minecraft.entity.ai.TargetPredicate.predicate; }
// public static void predicate(java.util.function.Predicate value, ) { net.minecraft.entity.ai.TargetPredicate.predicate = value; }

// public double MIN_DISTANCE() { return wrapperContained.MIN_DISTANCE; }
// public void MIN_DISTANCE(double value) { wrapperContained.MIN_DISTANCE = value; }
// public static double MIN_DISTANCE() { return net.minecraft.entity.ai.TargetPredicate.MIN_DISTANCE; }
// public static void MIN_DISTANCE(double value, ) { net.minecraft.entity.ai.TargetPredicate.MIN_DISTANCE = value; }

// public boolean attackable() { return wrapperContained.attackable; }
// public void attackable(boolean value) { wrapperContained.attackable = value; }
// public static boolean attackable() { return net.minecraft.entity.ai.TargetPredicate.attackable; }
// public static void attackable(boolean value, ) { net.minecraft.entity.ai.TargetPredicate.attackable = value; }

// public boolean respectsVisibility() { return wrapperContained.respectsVisibility; }
// public void respectsVisibility(boolean value) { wrapperContained.respectsVisibility = value; }
// public static boolean respectsVisibility() { return net.minecraft.entity.ai.TargetPredicate.respectsVisibility; }
// public static void respectsVisibility(boolean value, ) { net.minecraft.entity.ai.TargetPredicate.respectsVisibility = value; }

// public TargetPredicate(boolean attackable) { this.wrapperContained = new net.minecraft.entity.ai.TargetPredicate(attackable); }
public yarnwrap.entity.ai.TargetPredicate setBaseMaxDistance(double baseMaxDistance) { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.setBaseMaxDistance(baseMaxDistance)); }
// public static yarnwrap.entity.ai.TargetPredicate setBaseMaxDistance(double baseMaxDistance, ) { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.TargetPredicate.setBaseMaxDistance(baseMaxDistance)); }
public boolean test(yarnwrap.entity.LivingEntity baseEntity,yarnwrap.entity.LivingEntity targetEntity) { return wrapperContained.test(baseEntity.wrapperContained,targetEntity.wrapperContained); }
// public static boolean test(yarnwrap.entity.LivingEntity baseEntity,yarnwrap.entity.LivingEntity targetEntity, ) { return net.minecraft.entity.ai.TargetPredicate.test(baseEntity.wrapperContained,targetEntity.wrapperContained); }
public yarnwrap.entity.ai.TargetPredicate setPredicate(java.util.function.Predicate predicate) { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.setPredicate(predicate)); }
// public static yarnwrap.entity.ai.TargetPredicate setPredicate(java.util.function.Predicate predicate, ) { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.TargetPredicate.setPredicate(predicate)); }
public yarnwrap.entity.ai.TargetPredicate ignoreDistanceScalingFactor() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ignoreDistanceScalingFactor()); }
// public static yarnwrap.entity.ai.TargetPredicate ignoreDistanceScalingFactor() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.TargetPredicate.ignoreDistanceScalingFactor()); }
public yarnwrap.entity.ai.TargetPredicate copy() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.copy()); }
// public static yarnwrap.entity.ai.TargetPredicate copy() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.TargetPredicate.copy()); }
// public yarnwrap.entity.ai.TargetPredicate createAttackable() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.createAttackable()); }
public static yarnwrap.entity.ai.TargetPredicate createAttackable() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.TargetPredicate.createAttackable()); }
// public yarnwrap.entity.ai.TargetPredicate createNonAttackable() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.createNonAttackable()); }
public static yarnwrap.entity.ai.TargetPredicate createNonAttackable() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.TargetPredicate.createNonAttackable()); }
public yarnwrap.entity.ai.TargetPredicate ignoreVisibility() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ignoreVisibility()); }
// public static yarnwrap.entity.ai.TargetPredicate ignoreVisibility() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.TargetPredicate.ignoreVisibility()); }

}