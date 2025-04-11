package yarnwrap.entity.ai.goal;
public class MeleeAttackGoal { public net.minecraft.entity.ai.goal.MeleeAttackGoal wrapperContained; public MeleeAttackGoal(net.minecraft.entity.ai.goal.MeleeAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastUpdateTime() { return wrapperContained.lastUpdateTime; }
// public void lastUpdateTime(long value) { wrapperContained.lastUpdateTime = value; }
// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public long MAX_ATTACK_TIME() { return wrapperContained.MAX_ATTACK_TIME; }
// public void MAX_ATTACK_TIME(long value) { wrapperContained.MAX_ATTACK_TIME = value; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public int updateCountdownTicks() { return wrapperContained.updateCountdownTicks; }
// public void updateCountdownTicks(int value) { wrapperContained.updateCountdownTicks = value; }
// public boolean pauseWhenMobIdle() { return wrapperContained.pauseWhenMobIdle; }
// public void pauseWhenMobIdle(boolean value) { wrapperContained.pauseWhenMobIdle = value; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public int attackIntervalTicks() { return wrapperContained.attackIntervalTicks; }
// public void attackIntervalTicks(int value) { wrapperContained.attackIntervalTicks = value; }
// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public yarnwrap.entity.ai.pathing.Path path() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.path); }
// public void path(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.path = value.wrapperContained; }
public MeleeAttackGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,boolean pauseWhenMobIdle) { this.wrapperContained = new net.minecraft.entity.ai.goal.MeleeAttackGoal(mob.wrapperContained,speed,pauseWhenMobIdle); }
// public void resetCooldown() { wrapperContained.resetCooldown(); }
// public boolean isCooledDown() { return wrapperContained.isCooledDown(); }
// public int getCooldown() { return wrapperContained.getCooldown(); }
// public int getMaxCooldown() { return wrapperContained.getMaxCooldown(); }
// public boolean canAttack(yarnwrap.entity.LivingEntity target) { return wrapperContained.canAttack(target.wrapperContained); }
// public void attack(yarnwrap.entity.LivingEntity target) { wrapperContained.attack(target.wrapperContained); }

}