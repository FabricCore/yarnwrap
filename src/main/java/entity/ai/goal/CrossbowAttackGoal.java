package yarnwrap.entity.ai.goal;
public class CrossbowAttackGoal { public net.minecraft.entity.ai.goal.CrossbowAttackGoal wrapperContained; public CrossbowAttackGoal(net.minecraft.entity.ai.goal.CrossbowAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object stage() { return wrapperContained.stage; }
// public int chargedTicksLeft() { return wrapperContained.chargedTicksLeft; }
public yarnwrap.util.math.intprovider.UniformIntProvider COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.COOLDOWN_RANGE); }
// public int cooldown() { return wrapperContained.cooldown; }
// public double speed() { return wrapperContained.speed; }
// public float squaredRange() { return wrapperContained.squaredRange; }
// public int seeingTargetTicker() { return wrapperContained.seeingTargetTicker; }
// public yarnwrap.entity.mob.HostileEntity actor() { return new yarnwrap.entity.mob.HostileEntity(wrapperContained.actor); }
// public boolean isUncharged() { return wrapperContained.isUncharged(); }
// public boolean hasAliveTarget() { return wrapperContained.hasAliveTarget(); }
// public boolean isEntityHoldingCrossbow() { return wrapperContained.isEntityHoldingCrossbow(); }

}