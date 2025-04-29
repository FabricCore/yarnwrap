package yarnwrap.entity.ai.goal;
public class BowAttackGoal { public net.minecraft.entity.ai.goal.BowAttackGoal wrapperContained; public BowAttackGoal(net.minecraft.entity.ai.goal.BowAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int combatTicks() { return wrapperContained.combatTicks; }
// public void combatTicks(int value) { wrapperContained.combatTicks = value; }
// public static int combatTicks() { return net.minecraft.entity.ai.goal.BowAttackGoal.combatTicks; }
// public static void combatTicks(int value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.combatTicks = value; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.BowAttackGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.speed = value; }

// public float squaredRange() { return wrapperContained.squaredRange; }
// public void squaredRange(float value) { wrapperContained.squaredRange = value; }
// public static float squaredRange() { return net.minecraft.entity.ai.goal.BowAttackGoal.squaredRange; }
// public static void squaredRange(float value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.squaredRange = value; }

// public boolean backward() { return wrapperContained.backward; }
// public void backward(boolean value) { wrapperContained.backward = value; }
// public static boolean backward() { return net.minecraft.entity.ai.goal.BowAttackGoal.backward; }
// public static void backward(boolean value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.backward = value; }

// public int targetSeeingTicker() { return wrapperContained.targetSeeingTicker; }
// public void targetSeeingTicker(int value) { wrapperContained.targetSeeingTicker = value; }
// public static int targetSeeingTicker() { return net.minecraft.entity.ai.goal.BowAttackGoal.targetSeeingTicker; }
// public static void targetSeeingTicker(int value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.targetSeeingTicker = value; }

// public boolean movingToLeft() { return wrapperContained.movingToLeft; }
// public void movingToLeft(boolean value) { wrapperContained.movingToLeft = value; }
// public static boolean movingToLeft() { return net.minecraft.entity.ai.goal.BowAttackGoal.movingToLeft; }
// public static void movingToLeft(boolean value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.movingToLeft = value; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public static int cooldown() { return net.minecraft.entity.ai.goal.BowAttackGoal.cooldown; }
// public static void cooldown(int value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.cooldown = value; }

// public int attackInterval() { return wrapperContained.attackInterval; }
// public void attackInterval(int value) { wrapperContained.attackInterval = value; }
// public static int attackInterval() { return net.minecraft.entity.ai.goal.BowAttackGoal.attackInterval; }
// public static void attackInterval(int value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.attackInterval = value; }

// public yarnwrap.entity.mob.HostileEntity actor() { return new yarnwrap.entity.mob.HostileEntity(wrapperContained.actor); }
// public void actor(yarnwrap.entity.mob.HostileEntity value) { wrapperContained.actor = value.wrapperContained; }
// public static yarnwrap.entity.mob.HostileEntity actor() { return new yarnwrap.entity.mob.HostileEntity(net.minecraft.entity.ai.goal.BowAttackGoal.actor); }
// public static void actor(yarnwrap.entity.mob.HostileEntity value, ) { net.minecraft.entity.ai.goal.BowAttackGoal.actor = value.wrapperContained; }

public BowAttackGoal(yarnwrap.entity.mob.HostileEntity actor,double speed,int attackInterval,float range) { this.wrapperContained = new net.minecraft.entity.ai.goal.BowAttackGoal(actor.wrapperContained,speed,attackInterval,range); }
public void setAttackInterval(int attackInterval) { wrapperContained.setAttackInterval(attackInterval); }
// public static void setAttackInterval(int attackInterval, ) { net.minecraft.entity.ai.goal.BowAttackGoal.setAttackInterval(attackInterval); }
// public boolean isHoldingBow() { return wrapperContained.isHoldingBow(); }
// public static boolean isHoldingBow() { return net.minecraft.entity.ai.goal.BowAttackGoal.isHoldingBow(); }

}