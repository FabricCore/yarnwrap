package yarnwrap.entity.ai.goal;
public class AttackGoal { public net.minecraft.entity.ai.goal.AttackGoal wrapperContained; public AttackGoal(net.minecraft.entity.ai.goal.AttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public int cooldown() { return wrapperContained.cooldown; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }

}