package yarnwrap.entity.ai.goal;
public class MoveToTargetPosGoal { public net.minecraft.entity.ai.goal.MoveToTargetPosGoal wrapperContained; public MoveToTargetPosGoal(net.minecraft.entity.ai.goal.MoveToTargetPosGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_WAITING_TIME() { return wrapperContained.MIN_WAITING_TIME; }
// public int MAX_TRYING_TIME() { return wrapperContained.MAX_TRYING_TIME; }
// public int MIN_INTERVAL() { return wrapperContained.MIN_INTERVAL; }
// public int range() { return wrapperContained.range; }
// public int safeWaitingTime() { return wrapperContained.safeWaitingTime; }
// public yarnwrap.util.math.BlockPos targetPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.targetPos); }
// public boolean reached() { return wrapperContained.reached; }
public double speed() { return wrapperContained.speed; }
// public int lowestY() { return wrapperContained.lowestY; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public int tryingTime() { return wrapperContained.tryingTime; }
// public int cooldown() { return wrapperContained.cooldown; }
// public int maxYDifference() { return wrapperContained.maxYDifference; }
// public yarnwrap.util.math.BlockPos getTargetPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTargetPos()); }
// public void startMovingToTarget() { wrapperContained.startMovingToTarget(); }
public double getDesiredDistanceToTarget() { return wrapperContained.getDesiredDistanceToTarget(); }
// public boolean findTargetPos() { return wrapperContained.findTargetPos(); }
// public int getInterval(yarnwrap.entity.mob.PathAwareEntity mob) { return wrapperContained.getInterval(mob.wrapperContained); }
public boolean shouldResetPath() { return wrapperContained.shouldResetPath(); }
// public boolean hasReached() { return wrapperContained.hasReached(); }
// public boolean isTargetPos(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isTargetPos(world.wrapperContained,pos.wrapperContained); }

}