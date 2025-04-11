package yarnwrap.entity.ai.goal;
public class CrossbowAttackGoal { public net.minecraft.entity.ai.goal.CrossbowAttackGoal wrapperContained; public CrossbowAttackGoal(net.minecraft.entity.ai.goal.CrossbowAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object stage() { return wrapperContained.stage; }
// // public void stage(Object value) { wrapperContained.stage = value; }
// public int chargedTicksLeft() { return wrapperContained.chargedTicksLeft; }
// public void chargedTicksLeft(int value) { wrapperContained.chargedTicksLeft = value; }
public yarnwrap.util.math.intprovider.UniformIntProvider COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.COOLDOWN_RANGE); }
// public void COOLDOWN_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.COOLDOWN_RANGE = value.wrapperContained; }
// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public float squaredRange() { return wrapperContained.squaredRange; }
// public void squaredRange(float value) { wrapperContained.squaredRange = value; }
// public int seeingTargetTicker() { return wrapperContained.seeingTargetTicker; }
// public void seeingTargetTicker(int value) { wrapperContained.seeingTargetTicker = value; }
// public yarnwrap.entity.mob.HostileEntity actor() { return new yarnwrap.entity.mob.HostileEntity(wrapperContained.actor); }
// public void actor(yarnwrap.entity.mob.HostileEntity value) { wrapperContained.actor = value.wrapperContained; }
// public boolean isUncharged() { return wrapperContained.isUncharged(); }
// public boolean hasAliveTarget() { return wrapperContained.hasAliveTarget(); }
// public boolean isEntityHoldingCrossbow() { return wrapperContained.isEntityHoldingCrossbow(); }

}