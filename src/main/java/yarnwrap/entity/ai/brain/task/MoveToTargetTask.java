package yarnwrap.entity.ai.brain.task;
public class MoveToTargetTask { public net.minecraft.entity.ai.brain.task.MoveToTargetTask wrapperContained; public MoveToTargetTask(net.minecraft.entity.ai.brain.task.MoveToTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.pathing.Path path() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.path); }
// public void path(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.path = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.Path path() { return new yarnwrap.entity.ai.pathing.Path(net.minecraft.entity.ai.brain.task.MoveToTargetTask.path); }
// public static void path(yarnwrap.entity.ai.pathing.Path value, ) { net.minecraft.entity.ai.brain.task.MoveToTargetTask.path = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos lookTargetPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.lookTargetPos); }
// public void lookTargetPos(yarnwrap.util.math.BlockPos value) { wrapperContained.lookTargetPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos lookTargetPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.brain.task.MoveToTargetTask.lookTargetPos); }
// public static void lookTargetPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.ai.brain.task.MoveToTargetTask.lookTargetPos = value.wrapperContained; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.ai.brain.task.MoveToTargetTask.speed; }
// public static void speed(float value, ) { net.minecraft.entity.ai.brain.task.MoveToTargetTask.speed = value; }

// public int pathUpdateCountdownTicks() { return wrapperContained.pathUpdateCountdownTicks; }
// public void pathUpdateCountdownTicks(int value) { wrapperContained.pathUpdateCountdownTicks = value; }
// public static int pathUpdateCountdownTicks() { return net.minecraft.entity.ai.brain.task.MoveToTargetTask.pathUpdateCountdownTicks; }
// public static void pathUpdateCountdownTicks(int value, ) { net.minecraft.entity.ai.brain.task.MoveToTargetTask.pathUpdateCountdownTicks = value; }

// public int MAX_UPDATE_COUNTDOWN() { return wrapperContained.MAX_UPDATE_COUNTDOWN; }
// public void MAX_UPDATE_COUNTDOWN(int value) { wrapperContained.MAX_UPDATE_COUNTDOWN = value; }
// public static int MAX_UPDATE_COUNTDOWN() { return net.minecraft.entity.ai.brain.task.MoveToTargetTask.MAX_UPDATE_COUNTDOWN; }
// public static void MAX_UPDATE_COUNTDOWN(int value, ) { net.minecraft.entity.ai.brain.task.MoveToTargetTask.MAX_UPDATE_COUNTDOWN = value; }

public MoveToTargetTask(int minRunTime,int maxRunTime) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.MoveToTargetTask(minRunTime,maxRunTime); }
// public boolean hasFinishedPath(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.ai.brain.WalkTarget walkTarget,long time) { return wrapperContained.hasFinishedPath(entity.wrapperContained,walkTarget.wrapperContained,time); }
// public static boolean hasFinishedPath(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.ai.brain.WalkTarget walkTarget,long time, ) { return net.minecraft.entity.ai.brain.task.MoveToTargetTask.hasFinishedPath(entity.wrapperContained,walkTarget.wrapperContained,time); }
// public boolean hasReached(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.ai.brain.WalkTarget walkTarget) { return wrapperContained.hasReached(entity.wrapperContained,walkTarget.wrapperContained); }
// public static boolean hasReached(yarnwrap.entity.mob.MobEntity entity,yarnwrap.entity.ai.brain.WalkTarget walkTarget, ) { return net.minecraft.entity.ai.brain.task.MoveToTargetTask.hasReached(entity.wrapperContained,walkTarget.wrapperContained); }
// public boolean isTargetSpectator(yarnwrap.entity.ai.brain.WalkTarget target) { return wrapperContained.isTargetSpectator(target.wrapperContained); }
// public static boolean isTargetSpectator(yarnwrap.entity.ai.brain.WalkTarget target, ) { return net.minecraft.entity.ai.brain.task.MoveToTargetTask.isTargetSpectator(target.wrapperContained); }

}