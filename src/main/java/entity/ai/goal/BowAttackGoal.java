package yarnwrap.entity.ai.goal;
public class BowAttackGoal { public net.minecraft.entity.ai.goal.BowAttackGoal wrapperContained; public BowAttackGoal(net.minecraft.entity.ai.goal.BowAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int combatTicks() { return wrapperContained.combatTicks; }
// public double speed() { return wrapperContained.speed; }
// public float squaredRange() { return wrapperContained.squaredRange; }
// public boolean backward() { return wrapperContained.backward; }
// public int targetSeeingTicker() { return wrapperContained.targetSeeingTicker; }
// public boolean movingToLeft() { return wrapperContained.movingToLeft; }
// public int cooldown() { return wrapperContained.cooldown; }
// public int attackInterval() { return wrapperContained.attackInterval; }
// public yarnwrap.entity.mob.HostileEntity actor() { return new yarnwrap.entity.mob.HostileEntity(wrapperContained.actor); }
public void setAttackInterval(int attackInterval) { wrapperContained.setAttackInterval(attackInterval); }
// public boolean isHoldingBow() { return wrapperContained.isHoldingBow(); }

}