package yarnwrap.entity.ai.brain.task;
public class HideWhenBellRingsTask { public net.minecraft.entity.ai.brain.task.HideWhenBellRingsTask wrapperContained; public HideWhenBellRingsTask(net.minecraft.entity.ai.brain.task.HideWhenBellRingsTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.HideWhenBellRingsTask.create()); }
// public boolean method_47034(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time) { return wrapperContained.method_47034(world.wrapperContained,entity.wrapperContained,time); }
// public static boolean method_47034(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,long time, ) { return net.minecraft.entity.ai.brain.task.HideWhenBellRingsTask.method_47034(world.wrapperContained,entity.wrapperContained,time); }
// public com.mojang.datafixers.kinds.App method_47035(Object context) { return wrapperContained.method_47035(context); }
// public static com.mojang.datafixers.kinds.App method_47035(Object context, ) { return net.minecraft.entity.ai.brain.task.HideWhenBellRingsTask.method_47035(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47036(yarnwrap.entity.ai.brain.MemoryQueryResult heardBellTime) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47036(heardBellTime.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47036(yarnwrap.entity.ai.brain.MemoryQueryResult heardBellTime, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.HideWhenBellRingsTask.method_47036(heardBellTime.wrapperContained)); }

}