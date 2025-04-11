package yarnwrap.entity.ai.goal;
public class BowAttackGoal { public net.minecraft.entity.ai.goal.BowAttackGoal wrapperContained; public BowAttackGoal(net.minecraft.entity.ai.goal.BowAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int combatTicks() { return wrapperContained.combatTicks; }
// public void combatTicks(int value) { wrapperContained.combatTicks = value; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public float squaredRange() { return wrapperContained.squaredRange; }
// public void squaredRange(float value) { wrapperContained.squaredRange = value; }
// public boolean backward() { return wrapperContained.backward; }
// public void backward(boolean value) { wrapperContained.backward = value; }
// public int targetSeeingTicker() { return wrapperContained.targetSeeingTicker; }
// public void targetSeeingTicker(int value) { wrapperContained.targetSeeingTicker = value; }
// public boolean movingToLeft() { return wrapperContained.movingToLeft; }
// public void movingToLeft(boolean value) { wrapperContained.movingToLeft = value; }
// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public int attackInterval() { return wrapperContained.attackInterval; }
// public void attackInterval(int value) { wrapperContained.attackInterval = value; }
// public yarnwrap.entity.mob.HostileEntity actor() { return new yarnwrap.entity.mob.HostileEntity(wrapperContained.actor); }
// public void actor(yarnwrap.entity.mob.HostileEntity value) { wrapperContained.actor = value.wrapperContained; }
public BowAttackGoal(yarnwrap.entity.mob.HostileEntity actor,double speed,int attackInterval,float range) { this.wrapperContained = new net.minecraft.entity.ai.goal.BowAttackGoal(actor.wrapperContained,speed,attackInterval,range); }
public void setAttackInterval(int attackInterval) { wrapperContained.setAttackInterval(attackInterval); }
// public boolean isHoldingBow() { return wrapperContained.isHoldingBow(); }

}