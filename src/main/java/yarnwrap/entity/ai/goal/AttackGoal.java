package yarnwrap.entity.ai.goal;
public class AttackGoal { public net.minecraft.entity.ai.goal.AttackGoal wrapperContained; public AttackGoal(net.minecraft.entity.ai.goal.AttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
public AttackGoal(yarnwrap.entity.mob.MobEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.AttackGoal(mob.wrapperContained); }

}