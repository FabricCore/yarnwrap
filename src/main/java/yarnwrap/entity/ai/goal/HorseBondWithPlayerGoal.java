package yarnwrap.entity.ai.goal;
public class HorseBondWithPlayerGoal { public net.minecraft.entity.ai.goal.HorseBondWithPlayerGoal wrapperContained; public HorseBondWithPlayerGoal(net.minecraft.entity.ai.goal.HorseBondWithPlayerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public yarnwrap.entity.passive.AbstractHorseEntity horse() { return new yarnwrap.entity.passive.AbstractHorseEntity(wrapperContained.horse); }
// public void horse(yarnwrap.entity.passive.AbstractHorseEntity value) { wrapperContained.horse = value.wrapperContained; }
// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
public HorseBondWithPlayerGoal(yarnwrap.entity.passive.AbstractHorseEntity horse,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.HorseBondWithPlayerGoal(horse.wrapperContained,speed); }

}