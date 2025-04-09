package yarnwrap.entity.ai.brain.task;
public class MultiTickTask { public net.minecraft.entity.ai.brain.task.MultiTickTask wrapperContained; public MultiTickTask(net.minecraft.entity.ai.brain.task.MultiTickTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object status() { return wrapperContained.status; }
// public long endTime() { return wrapperContained.endTime; }
// public int minRunTime() { return wrapperContained.minRunTime; }
// public int maxRunTime() { return wrapperContained.maxRunTime; }
// public java.util.Map requiredMemoryStates() { return wrapperContained.requiredMemoryStates; }
public int DEFAULT_RUN_TIME() { return wrapperContained.DEFAULT_RUN_TIME; }
// public boolean isTimeLimitExceeded(long time) { return wrapperContained.isTimeLimitExceeded(time); }
// public boolean shouldRun(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { return wrapperContained.shouldRun(world.wrapperContained,entity.wrapperContained); }
// public void run(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { wrapperContained.run(world.wrapperContained,entity.wrapperContained,time); }
// public void keepRunning(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { wrapperContained.keepRunning(world.wrapperContained,entity.wrapperContained,time); }
// public void finishRunning(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { wrapperContained.finishRunning(world.wrapperContained,entity.wrapperContained,time); }
// public boolean shouldKeepRunning(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.shouldKeepRunning(world.wrapperContained,entity.wrapperContained,time); }
// public boolean hasRequiredMemoryState(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasRequiredMemoryState(entity.wrapperContained); }

}