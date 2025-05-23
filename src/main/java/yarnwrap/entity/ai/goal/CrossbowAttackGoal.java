package yarnwrap.entity.ai.goal;
public class CrossbowAttackGoal { public net.minecraft.entity.ai.goal.CrossbowAttackGoal wrapperContained; public CrossbowAttackGoal(net.minecraft.entity.ai.goal.CrossbowAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.CrossbowAttackGoal.speed = value; }

// public float squaredRange() { return wrapperContained.squaredRange; }
// public void squaredRange(float value) { wrapperContained.squaredRange = value; }
// public static float squaredRange() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.squaredRange; }
// public static void squaredRange(float value, ) { net.minecraft.entity.ai.goal.CrossbowAttackGoal.squaredRange = value; }

// public int seeingTargetTicker() { return wrapperContained.seeingTargetTicker; }
// public void seeingTargetTicker(int value) { wrapperContained.seeingTargetTicker = value; }
// public static int seeingTargetTicker() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.seeingTargetTicker; }
// public static void seeingTargetTicker(int value, ) { net.minecraft.entity.ai.goal.CrossbowAttackGoal.seeingTargetTicker = value; }

// public yarnwrap.entity.mob.HostileEntity actor() { return new yarnwrap.entity.mob.HostileEntity(wrapperContained.actor); }
// public void actor(yarnwrap.entity.mob.HostileEntity value) { wrapperContained.actor = value.wrapperContained; }
// public static yarnwrap.entity.mob.HostileEntity actor() { return new yarnwrap.entity.mob.HostileEntity(net.minecraft.entity.ai.goal.CrossbowAttackGoal.actor); }
// public static void actor(yarnwrap.entity.mob.HostileEntity value, ) { net.minecraft.entity.ai.goal.CrossbowAttackGoal.actor = value.wrapperContained; }

// public Object stage() { return wrapperContained.stage; }
// // public void stage(Object value) { wrapperContained.stage = value; }
// // public static Object stage() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.stage; }
// // public static void stage(Object value, ) { net.minecraft.entity.ai.goal.CrossbowAttackGoal.stage = value; }

// public int chargedTicksLeft() { return wrapperContained.chargedTicksLeft; }
// public void chargedTicksLeft(int value) { wrapperContained.chargedTicksLeft = value; }
// public static int chargedTicksLeft() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.chargedTicksLeft; }
// public static void chargedTicksLeft(int value, ) { net.minecraft.entity.ai.goal.CrossbowAttackGoal.chargedTicksLeft = value; }

// public yarnwrap.util.math.intprovider.UniformIntProvider COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.COOLDOWN_RANGE); }
// public void COOLDOWN_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.COOLDOWN_RANGE = value.wrapperContained; }
public static yarnwrap.util.math.intprovider.UniformIntProvider COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.entity.ai.goal.CrossbowAttackGoal.COOLDOWN_RANGE); }
// public static void COOLDOWN_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value, ) { net.minecraft.entity.ai.goal.CrossbowAttackGoal.COOLDOWN_RANGE = value.wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public static int cooldown() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.cooldown; }
// public static void cooldown(int value, ) { net.minecraft.entity.ai.goal.CrossbowAttackGoal.cooldown = value; }

public CrossbowAttackGoal(yarnwrap.entity.mob.HostileEntity actor,double speed,float range) { this.wrapperContained = new net.minecraft.entity.ai.goal.CrossbowAttackGoal(actor.wrapperContained,speed,range); }
// public boolean isEntityHoldingCrossbow() { return wrapperContained.isEntityHoldingCrossbow(); }
// public static boolean isEntityHoldingCrossbow() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.isEntityHoldingCrossbow(); }
// public boolean isUncharged() { return wrapperContained.isUncharged(); }
// public static boolean isUncharged() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.isUncharged(); }
// public boolean hasAliveTarget() { return wrapperContained.hasAliveTarget(); }
// public static boolean hasAliveTarget() { return net.minecraft.entity.ai.goal.CrossbowAttackGoal.hasAliveTarget(); }

}