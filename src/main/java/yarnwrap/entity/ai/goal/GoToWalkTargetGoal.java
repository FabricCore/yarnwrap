package yarnwrap.entity.ai.goal;
public class GoToWalkTargetGoal { public net.minecraft.entity.ai.goal.GoToWalkTargetGoal wrapperContained; public GoToWalkTargetGoal(net.minecraft.entity.ai.goal.GoToWalkTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
public GoToWalkTargetGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.GoToWalkTargetGoal(mob.wrapperContained,speed); }

}