package yarnwrap.entity.ai.goal;
public class MeleeAttackGoal { public net.minecraft.entity.ai.goal.MeleeAttackGoal wrapperContained; public MeleeAttackGoal(net.minecraft.entity.ai.goal.MeleeAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.speed = value; }

// public int updateCountdownTicks() { return wrapperContained.updateCountdownTicks; }
// public void updateCountdownTicks(int value) { wrapperContained.updateCountdownTicks = value; }
// public static int updateCountdownTicks() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.updateCountdownTicks; }
// public static void updateCountdownTicks(int value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.updateCountdownTicks = value; }

// public boolean pauseWhenMobIdle() { return wrapperContained.pauseWhenMobIdle; }
// public void pauseWhenMobIdle(boolean value) { wrapperContained.pauseWhenMobIdle = value; }
// public static boolean pauseWhenMobIdle() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.pauseWhenMobIdle; }
// public static void pauseWhenMobIdle(boolean value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.pauseWhenMobIdle = value; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.MeleeAttackGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.mob = value.wrapperContained; }

// public int attackIntervalTicks() { return wrapperContained.attackIntervalTicks; }
// public void attackIntervalTicks(int value) { wrapperContained.attackIntervalTicks = value; }
// public static int attackIntervalTicks() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.attackIntervalTicks; }
// public static void attackIntervalTicks(int value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.attackIntervalTicks = value; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public static double targetZ() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.targetZ; }
// public static void targetZ(double value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.targetZ = value; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public static double targetY() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.targetY; }
// public static void targetY(double value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.targetY = value; }

// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public static double targetX() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.targetX; }
// public static void targetX(double value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.targetX = value; }

// public yarnwrap.entity.ai.pathing.Path path() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.path); }
// public void path(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.path = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.Path path() { return new yarnwrap.entity.ai.pathing.Path(net.minecraft.entity.ai.goal.MeleeAttackGoal.path); }
// public static void path(yarnwrap.entity.ai.pathing.Path value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.path = value.wrapperContained; }

// public long lastUpdateTime() { return wrapperContained.lastUpdateTime; }
// public void lastUpdateTime(long value) { wrapperContained.lastUpdateTime = value; }
// public static long lastUpdateTime() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.lastUpdateTime; }
// public static void lastUpdateTime(long value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.lastUpdateTime = value; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public static int cooldown() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.cooldown; }
// public static void cooldown(int value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.cooldown = value; }

// public long MAX_ATTACK_TIME() { return wrapperContained.MAX_ATTACK_TIME; }
// public void MAX_ATTACK_TIME(long value) { wrapperContained.MAX_ATTACK_TIME = value; }
// public static long MAX_ATTACK_TIME() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.MAX_ATTACK_TIME; }
// public static void MAX_ATTACK_TIME(long value, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.MAX_ATTACK_TIME = value; }

public MeleeAttackGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,boolean pauseWhenMobIdle) { this.wrapperContained = new net.minecraft.entity.ai.goal.MeleeAttackGoal(mob.wrapperContained,speed,pauseWhenMobIdle); }
// public void attack(yarnwrap.entity.LivingEntity target) { wrapperContained.attack(target.wrapperContained); }
// public static void attack(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.ai.goal.MeleeAttackGoal.attack(target.wrapperContained); }
// public void resetCooldown() { wrapperContained.resetCooldown(); }
// public static void resetCooldown() { net.minecraft.entity.ai.goal.MeleeAttackGoal.resetCooldown(); }
// public boolean isCooledDown() { return wrapperContained.isCooledDown(); }
// public static boolean isCooledDown() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.isCooledDown(); }
// public int getCooldown() { return wrapperContained.getCooldown(); }
// public static int getCooldown() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.getCooldown(); }
// public int getMaxCooldown() { return wrapperContained.getMaxCooldown(); }
// public static int getMaxCooldown() { return net.minecraft.entity.ai.goal.MeleeAttackGoal.getMaxCooldown(); }
// public boolean canAttack(yarnwrap.entity.LivingEntity target) { return wrapperContained.canAttack(target.wrapperContained); }
// public static boolean canAttack(yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.ai.goal.MeleeAttackGoal.canAttack(target.wrapperContained); }

}