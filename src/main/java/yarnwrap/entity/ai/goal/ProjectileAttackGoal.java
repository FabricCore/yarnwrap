package yarnwrap.entity.ai.goal;
public class ProjectileAttackGoal { public net.minecraft.entity.ai.goal.ProjectileAttackGoal wrapperContained; public ProjectileAttackGoal(net.minecraft.entity.ai.goal.ProjectileAttackGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxIntervalTicks() { return wrapperContained.maxIntervalTicks; }
// public void maxIntervalTicks(int value) { wrapperContained.maxIntervalTicks = value; }
// public int minIntervalTicks() { return wrapperContained.minIntervalTicks; }
// public void minIntervalTicks(int value) { wrapperContained.minIntervalTicks = value; }
// public int seenTargetTicks() { return wrapperContained.seenTargetTicks; }
// public void seenTargetTicks(int value) { wrapperContained.seenTargetTicks = value; }
// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public int updateCountdownTicks() { return wrapperContained.updateCountdownTicks; }
// public void updateCountdownTicks(int value) { wrapperContained.updateCountdownTicks = value; }
// public yarnwrap.entity.ai.RangedAttackMob owner() { return new yarnwrap.entity.ai.RangedAttackMob(wrapperContained.owner); }
// public void owner(yarnwrap.entity.ai.RangedAttackMob value) { wrapperContained.owner = value.wrapperContained; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public float squaredMaxShootRange() { return wrapperContained.squaredMaxShootRange; }
// public void squaredMaxShootRange(float value) { wrapperContained.squaredMaxShootRange = value; }
// public float maxShootRange() { return wrapperContained.maxShootRange; }
// public void maxShootRange(float value) { wrapperContained.maxShootRange = value; }
// public double mobSpeed() { return wrapperContained.mobSpeed; }
// public void mobSpeed(double value) { wrapperContained.mobSpeed = value; }
public ProjectileAttackGoal(yarnwrap.entity.ai.RangedAttackMob mob,double mobSpeed,int intervalTicks,float maxShootRange) { this.wrapperContained = new net.minecraft.entity.ai.goal.ProjectileAttackGoal(mob.wrapperContained,mobSpeed,intervalTicks,maxShootRange); }
public ProjectileAttackGoal(yarnwrap.entity.ai.RangedAttackMob mob,double mobSpeed,int minIntervalTicks,int maxIntervalTicks,float maxShootRange) { this.wrapperContained = new net.minecraft.entity.ai.goal.ProjectileAttackGoal(mob.wrapperContained,mobSpeed,minIntervalTicks,maxIntervalTicks,maxShootRange); }

}