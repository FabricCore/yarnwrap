package yarnwrap.entity.ai.goal;
public class MoveToTargetPosGoal { public net.minecraft.entity.ai.goal.MoveToTargetPosGoal wrapperContained; public MoveToTargetPosGoal(net.minecraft.entity.ai.goal.MoveToTargetPosGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_WAITING_TIME() { return wrapperContained.MIN_WAITING_TIME; }
// public void MIN_WAITING_TIME(int value) { wrapperContained.MIN_WAITING_TIME = value; }
// public int MAX_TRYING_TIME() { return wrapperContained.MAX_TRYING_TIME; }
// public void MAX_TRYING_TIME(int value) { wrapperContained.MAX_TRYING_TIME = value; }
// public int MIN_INTERVAL() { return wrapperContained.MIN_INTERVAL; }
// public void MIN_INTERVAL(int value) { wrapperContained.MIN_INTERVAL = value; }
// public int range() { return wrapperContained.range; }
// public void range(int value) { wrapperContained.range = value; }
// public int safeWaitingTime() { return wrapperContained.safeWaitingTime; }
// public void safeWaitingTime(int value) { wrapperContained.safeWaitingTime = value; }
// public yarnwrap.util.math.BlockPos targetPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.targetPos); }
// public void targetPos(yarnwrap.util.math.BlockPos value) { wrapperContained.targetPos = value.wrapperContained; }
// public boolean reached() { return wrapperContained.reached; }
// public void reached(boolean value) { wrapperContained.reached = value; }
public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public int lowestY() { return wrapperContained.lowestY; }
// public void lowestY(int value) { wrapperContained.lowestY = value; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public int tryingTime() { return wrapperContained.tryingTime; }
// public void tryingTime(int value) { wrapperContained.tryingTime = value; }
// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public int maxYDifference() { return wrapperContained.maxYDifference; }
// public void maxYDifference(int value) { wrapperContained.maxYDifference = value; }
// public MoveToTargetPosGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,int range) { this.wrapperContained = new net.minecraft.entity.ai.goal.MoveToTargetPosGoal(mob.wrapperContained,speed,range); }
// public MoveToTargetPosGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,int range,int maxYDifference) { this.wrapperContained = new net.minecraft.entity.ai.goal.MoveToTargetPosGoal(mob.wrapperContained,speed,range,maxYDifference); }
// public yarnwrap.util.math.BlockPos getTargetPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTargetPos()); }
// public void startMovingToTarget() { wrapperContained.startMovingToTarget(); }
public double getDesiredDistanceToTarget() { return wrapperContained.getDesiredDistanceToTarget(); }
// public boolean findTargetPos() { return wrapperContained.findTargetPos(); }
// public int getInterval(yarnwrap.entity.mob.PathAwareEntity mob) { return wrapperContained.getInterval(mob.wrapperContained); }
public boolean shouldResetPath() { return wrapperContained.shouldResetPath(); }
// public boolean hasReached() { return wrapperContained.hasReached(); }
// public boolean isTargetPos(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isTargetPos(world.wrapperContained,pos.wrapperContained); }

}