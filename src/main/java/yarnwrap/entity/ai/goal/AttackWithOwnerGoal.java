package yarnwrap.entity.ai.goal;
public class AttackWithOwnerGoal { public net.minecraft.entity.ai.goal.AttackWithOwnerGoal wrapperContained; public AttackWithOwnerGoal(net.minecraft.entity.ai.goal.AttackWithOwnerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lastAttackTime() { return wrapperContained.lastAttackTime; }
// public void lastAttackTime(int value) { wrapperContained.lastAttackTime = value; }
// public static int lastAttackTime() { return net.minecraft.entity.ai.goal.AttackWithOwnerGoal.lastAttackTime; }
// public static void lastAttackTime(int value, ) { net.minecraft.entity.ai.goal.AttackWithOwnerGoal.lastAttackTime = value; }

// public yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(wrapperContained.tameable); }
// public void tameable(yarnwrap.entity.passive.TameableEntity value) { wrapperContained.tameable = value.wrapperContained; }
// public static yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(net.minecraft.entity.ai.goal.AttackWithOwnerGoal.tameable); }
// public static void tameable(yarnwrap.entity.passive.TameableEntity value, ) { net.minecraft.entity.ai.goal.AttackWithOwnerGoal.tameable = value.wrapperContained; }

// public yarnwrap.entity.LivingEntity attacking() { return new yarnwrap.entity.LivingEntity(wrapperContained.attacking); }
// public void attacking(yarnwrap.entity.LivingEntity value) { wrapperContained.attacking = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity attacking() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.AttackWithOwnerGoal.attacking); }
// public static void attacking(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.AttackWithOwnerGoal.attacking = value.wrapperContained; }

public AttackWithOwnerGoal(yarnwrap.entity.passive.TameableEntity tameable) { this.wrapperContained = new net.minecraft.entity.ai.goal.AttackWithOwnerGoal(tameable.wrapperContained); }

}