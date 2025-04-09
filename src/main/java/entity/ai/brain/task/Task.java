package yarnwrap.entity.ai.brain.task;
public class Task { public net.minecraft.entity.ai.brain.task.Task wrapperContained; public Task(net.minecraft.entity.ai.brain.task.Task wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getStatus() { return wrapperContained.getStatus(); }
public boolean tryStarting(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.tryStarting(world.wrapperContained,entity.wrapperContained,time); }
public void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { wrapperContained.tick(world.wrapperContained,entity.wrapperContained,time); }
public void stop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { wrapperContained.stop(world.wrapperContained,entity.wrapperContained,time); }
public java.lang.String getName() { return wrapperContained.getName(); }

}