package yarnwrap.entity.ai.brain.task;
public class ScheduleActivityTask { public net.minecraft.entity.ai.brain.task.ScheduleActivityTask wrapperContained; public ScheduleActivityTask(net.minecraft.entity.ai.brain.task.ScheduleActivityTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.ScheduleActivityTask.create()); }
// public boolean method_47185(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.method_47185(world.wrapperContained,entity.wrapperContained,time); }
// public static boolean method_47185(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time, ) { return net.minecraft.entity.ai.brain.task.ScheduleActivityTask.method_47185(world.wrapperContained,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47186(Object context) { return wrapperContained.method_47186(context); }
// public static com.mojang.datafixers.kinds.App method_47186(Object context, ) { return net.minecraft.entity.ai.brain.task.ScheduleActivityTask.method_47186(context); }

}