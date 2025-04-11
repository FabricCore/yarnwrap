package yarnwrap.entity.ai.brain.task;
public class TaskRunnable { public net.minecraft.entity.ai.brain.task.TaskRunnable wrapperContained; public TaskRunnable(net.minecraft.entity.ai.brain.task.TaskRunnable wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean trigger(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.trigger(world.wrapperContained,entity.wrapperContained,time); }

}