package yarnwrap.entity.ai.brain.task;
public class StopPanickingTask { public net.minecraft.entity.ai.brain.task.StopPanickingTask wrapperContained; public StopPanickingTask(net.minecraft.entity.ai.brain.task.StopPanickingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
// public static int MAX_DISTANCE() { return net.minecraft.entity.ai.brain.task.StopPanickingTask.MAX_DISTANCE; }
// public static void MAX_DISTANCE(int value, ) { net.minecraft.entity.ai.brain.task.StopPanickingTask.MAX_DISTANCE = value; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.StopPanickingTask.create()); }
// public boolean method_47198(yarnwrap.entity.LivingEntity hurtByx) { return wrapperContained.method_47198(hurtByx.wrapperContained); }
// public static boolean method_47198(yarnwrap.entity.LivingEntity hurtByx, ) { return net.minecraft.entity.ai.brain.task.StopPanickingTask.method_47198(hurtByx.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_47199(Object context) { return wrapperContained.method_47199(context); }
// public static com.mojang.datafixers.kinds.App method_47199(Object context, ) { return net.minecraft.entity.ai.brain.task.StopPanickingTask.method_47199(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47200(Object hurtBy,yarnwrap.entity.ai.brain.MemoryQueryResult hurtByEntity,yarnwrap.entity.ai.brain.MemoryQueryResult nearestHostile) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47200(hurtBy,hurtByEntity.wrapperContained,nearestHostile.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47200(Object hurtBy,yarnwrap.entity.ai.brain.MemoryQueryResult hurtByEntity,yarnwrap.entity.ai.brain.MemoryQueryResult nearestHostile, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.StopPanickingTask.method_47200(hurtBy,hurtByEntity.wrapperContained,nearestHostile.wrapperContained)); }
// public boolean method_47201(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47201(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_47201(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time, ) { return net.minecraft.entity.ai.brain.task.StopPanickingTask.method_47201(world,entity.wrapperContained,time.wrapperContained); }

}