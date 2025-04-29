package yarnwrap.entity.ai.goal;
public class GoToWalkTargetGoal { public net.minecraft.entity.ai.goal.GoToWalkTargetGoal wrapperContained; public GoToWalkTargetGoal(net.minecraft.entity.ai.goal.GoToWalkTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public static double z() { return net.minecraft.entity.ai.goal.GoToWalkTargetGoal.z; }
// public static void z(double value, ) { net.minecraft.entity.ai.goal.GoToWalkTargetGoal.z = value; }

// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public static double y() { return net.minecraft.entity.ai.goal.GoToWalkTargetGoal.y; }
// public static void y(double value, ) { net.minecraft.entity.ai.goal.GoToWalkTargetGoal.y = value; }

// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public static double x() { return net.minecraft.entity.ai.goal.GoToWalkTargetGoal.x; }
// public static void x(double value, ) { net.minecraft.entity.ai.goal.GoToWalkTargetGoal.x = value; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.GoToWalkTargetGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.GoToWalkTargetGoal.mob = value.wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.GoToWalkTargetGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.GoToWalkTargetGoal.speed = value; }

public GoToWalkTargetGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.GoToWalkTargetGoal(mob.wrapperContained,speed); }

}