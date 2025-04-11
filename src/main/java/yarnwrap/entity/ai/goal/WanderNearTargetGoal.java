package yarnwrap.entity.ai.goal;
public class WanderNearTargetGoal { public net.minecraft.entity.ai.goal.WanderNearTargetGoal wrapperContained; public WanderNearTargetGoal(net.minecraft.entity.ai.goal.WanderNearTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public float maxDistance() { return wrapperContained.maxDistance; }
// public void maxDistance(float value) { wrapperContained.maxDistance = value; }
public WanderNearTargetGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,float maxDistance) { this.wrapperContained = new net.minecraft.entity.ai.goal.WanderNearTargetGoal(mob.wrapperContained,speed,maxDistance); }

}