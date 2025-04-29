package yarnwrap.entity.ai.brain.task;
public class Task { public net.minecraft.entity.ai.brain.task.Task wrapperContained; public Task(net.minecraft.entity.ai.brain.task.Task wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getStatus() { return wrapperContained.getStatus(); }
// public static Object getStatus() { return net.minecraft.entity.ai.brain.task.Task.getStatus(); }
public boolean tryStarting(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.tryStarting(world.wrapperContained,entity.wrapperContained,time); }
// public static boolean tryStarting(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time, ) { return net.minecraft.entity.ai.brain.task.Task.tryStarting(world.wrapperContained,entity.wrapperContained,time); }
public void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { wrapperContained.tick(world.wrapperContained,entity.wrapperContained,time); }
// public static void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time, ) { net.minecraft.entity.ai.brain.task.Task.tick(world.wrapperContained,entity.wrapperContained,time); }
public void stop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { wrapperContained.stop(world.wrapperContained,entity.wrapperContained,time); }
// public static void stop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time, ) { net.minecraft.entity.ai.brain.task.Task.stop(world.wrapperContained,entity.wrapperContained,time); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.entity.ai.brain.task.Task.getName(); }

}