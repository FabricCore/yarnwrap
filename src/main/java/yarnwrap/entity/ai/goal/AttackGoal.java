package yarnwrap.entity.ai.goal;
public class AttackGoal { public net.minecraft.entity.ai.goal.AttackGoal wrapperContained; public AttackGoal(net.minecraft.entity.ai.goal.AttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.AttackGoal.target); }
// public static void target(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.AttackGoal.target = value.wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public static int cooldown() { return net.minecraft.entity.ai.goal.AttackGoal.cooldown; }
// public static void cooldown(int value, ) { net.minecraft.entity.ai.goal.AttackGoal.cooldown = value; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.AttackGoal.mob); }
// public static void mob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.AttackGoal.mob = value.wrapperContained; }

public AttackGoal(yarnwrap.entity.mob.MobEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.AttackGoal(mob.wrapperContained); }

}