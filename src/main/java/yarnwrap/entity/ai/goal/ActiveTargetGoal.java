package yarnwrap.entity.ai.goal;
public class ActiveTargetGoal { public net.minecraft.entity.ai.goal.ActiveTargetGoal wrapperContained; public ActiveTargetGoal(net.minecraft.entity.ai.goal.ActiveTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int reciprocalChance() { return wrapperContained.reciprocalChance; }
// public void reciprocalChance(int value) { wrapperContained.reciprocalChance = value; }
// public static int reciprocalChance() { return net.minecraft.entity.ai.goal.ActiveTargetGoal.reciprocalChance; }
// public static void reciprocalChance(int value, ) { net.minecraft.entity.ai.goal.ActiveTargetGoal.reciprocalChance = value; }

// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public void targetPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.targetPredicate = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.goal.ActiveTargetGoal.targetPredicate); }
// public static void targetPredicate(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.ai.goal.ActiveTargetGoal.targetPredicate = value.wrapperContained; }

// public java.lang.Class targetClass() { return wrapperContained.targetClass; }
// public void targetClass(java.lang.Class value) { wrapperContained.targetClass = value; }
// public static java.lang.Class targetClass() { return net.minecraft.entity.ai.goal.ActiveTargetGoal.targetClass; }
// public static void targetClass(java.lang.Class value, ) { net.minecraft.entity.ai.goal.ActiveTargetGoal.targetClass = value; }

// public yarnwrap.entity.LivingEntity targetEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.targetEntity); }
// public void targetEntity(yarnwrap.entity.LivingEntity value) { wrapperContained.targetEntity = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity targetEntity() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.ActiveTargetGoal.targetEntity); }
// public static void targetEntity(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.ActiveTargetGoal.targetEntity = value.wrapperContained; }

// public int DEFAULT_RECIPROCAL_CHANCE() { return wrapperContained.DEFAULT_RECIPROCAL_CHANCE; }
// public void DEFAULT_RECIPROCAL_CHANCE(int value) { wrapperContained.DEFAULT_RECIPROCAL_CHANCE = value; }
// public static int DEFAULT_RECIPROCAL_CHANCE() { return net.minecraft.entity.ai.goal.ActiveTargetGoal.DEFAULT_RECIPROCAL_CHANCE; }
// public static void DEFAULT_RECIPROCAL_CHANCE(int value, ) { net.minecraft.entity.ai.goal.ActiveTargetGoal.DEFAULT_RECIPROCAL_CHANCE = value; }

// public ActiveTargetGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetClass,int reciprocalChance,boolean checkVisibility,boolean checkCanNavigate,Object targetPredicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.ActiveTargetGoal(mob.wrapperContained,targetClass,reciprocalChance,checkVisibility,checkCanNavigate,targetPredicate); }
public ActiveTargetGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetClass,boolean checkVisibility) { this.wrapperContained = new net.minecraft.entity.ai.goal.ActiveTargetGoal(mob.wrapperContained,targetClass,checkVisibility); }
// public ActiveTargetGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetClass,boolean checkVisibility,Object predicate) { this.wrapperContained = new net.minecraft.entity.ai.goal.ActiveTargetGoal(mob.wrapperContained,targetClass,checkVisibility,predicate); }
public ActiveTargetGoal(yarnwrap.entity.mob.MobEntity mob,java.lang.Class targetClass,boolean checkVisibility,boolean checkCanNavigate) { this.wrapperContained = new net.minecraft.entity.ai.goal.ActiveTargetGoal(mob.wrapperContained,targetClass,checkVisibility,checkCanNavigate); }
// public yarnwrap.util.math.Box getSearchBox(double distance) { return new yarnwrap.util.math.Box(wrapperContained.getSearchBox(distance)); }
// public static yarnwrap.util.math.Box getSearchBox(double distance, ) { return new yarnwrap.util.math.Box(net.minecraft.entity.ai.goal.ActiveTargetGoal.getSearchBox(distance)); }
// public void findClosestTarget() { wrapperContained.findClosestTarget(); }
// public static void findClosestTarget() { net.minecraft.entity.ai.goal.ActiveTargetGoal.findClosestTarget(); }
public void setTargetEntity(yarnwrap.entity.LivingEntity targetEntity) { wrapperContained.setTargetEntity(targetEntity.wrapperContained); }
// public static void setTargetEntity(yarnwrap.entity.LivingEntity targetEntity, ) { net.minecraft.entity.ai.goal.ActiveTargetGoal.setTargetEntity(targetEntity.wrapperContained); }
// public yarnwrap.entity.ai.TargetPredicate getAndUpdateTargetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.getAndUpdateTargetPredicate()); }
// public static yarnwrap.entity.ai.TargetPredicate getAndUpdateTargetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.ai.goal.ActiveTargetGoal.getAndUpdateTargetPredicate()); }

}