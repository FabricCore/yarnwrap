package yarnwrap.entity.ai.goal;
public class WanderNearTargetGoal { public net.minecraft.entity.ai.goal.WanderNearTargetGoal wrapperContained; public WanderNearTargetGoal(net.minecraft.entity.ai.goal.WanderNearTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.entity.ai.goal.WanderNearTargetGoal.y; }
// public static void y(double value, ) { net.minecraft.entity.ai.goal.WanderNearTargetGoal.y = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.entity.ai.goal.WanderNearTargetGoal.x; }
// public static void x(double value, ) { net.minecraft.entity.ai.goal.WanderNearTargetGoal.x = value; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.WanderNearTargetGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.WanderNearTargetGoal.mob = value.wrapperContained; }

// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.WanderNearTargetGoal.target); }
// public static void target(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.WanderNearTargetGoal.target = value.wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.WanderNearTargetGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.WanderNearTargetGoal.speed = value; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.entity.ai.goal.WanderNearTargetGoal.z; }
// public static void z(double value, ) { net.minecraft.entity.ai.goal.WanderNearTargetGoal.z = value; }

// public float maxDistance() { return wrapperContained.maxDistance; }
// public void maxDistance(float value) { wrapperContained.maxDistance = value; }
// public static float maxDistance() { return net.minecraft.entity.ai.goal.WanderNearTargetGoal.maxDistance; }
// public static void maxDistance(float value, ) { net.minecraft.entity.ai.goal.WanderNearTargetGoal.maxDistance = value; }

public WanderNearTargetGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,float maxDistance) { this.wrapperContained = new net.minecraft.entity.ai.goal.WanderNearTargetGoal(mob.wrapperContained,speed,maxDistance); }

}