package yarnwrap.entity.ai.goal;
public class AttackWithOwnerGoal { public net.minecraft.entity.ai.goal.AttackWithOwnerGoal wrapperContained; public AttackWithOwnerGoal(net.minecraft.entity.ai.goal.AttackWithOwnerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lastAttackTime() { return wrapperContained.lastAttackTime; }
// public void lastAttackTime(int value) { wrapperContained.lastAttackTime = value; }
// public yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(wrapperContained.tameable); }
// public void tameable(yarnwrap.entity.passive.TameableEntity value) { wrapperContained.tameable = value.wrapperContained; }
// public yarnwrap.entity.LivingEntity attacking() { return new yarnwrap.entity.LivingEntity(wrapperContained.attacking); }
// public void attacking(yarnwrap.entity.LivingEntity value) { wrapperContained.attacking = value.wrapperContained; }
public AttackWithOwnerGoal(yarnwrap.entity.passive.TameableEntity tameable) { this.wrapperContained = new net.minecraft.entity.ai.goal.AttackWithOwnerGoal(tameable.wrapperContained); }

}