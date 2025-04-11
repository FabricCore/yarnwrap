package yarnwrap.entity.ai.goal;
public class ZombieAttackGoal { public net.minecraft.entity.ai.goal.ZombieAttackGoal wrapperContained; public ZombieAttackGoal(net.minecraft.entity.ai.goal.ZombieAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public yarnwrap.entity.mob.ZombieEntity zombie() { return new yarnwrap.entity.mob.ZombieEntity(wrapperContained.zombie); }
// public void zombie(yarnwrap.entity.mob.ZombieEntity value) { wrapperContained.zombie = value.wrapperContained; }
public ZombieAttackGoal(yarnwrap.entity.mob.ZombieEntity zombie,double speed,boolean pauseWhenMobIdle) { this.wrapperContained = new net.minecraft.entity.ai.goal.ZombieAttackGoal(zombie.wrapperContained,speed,pauseWhenMobIdle); }

}