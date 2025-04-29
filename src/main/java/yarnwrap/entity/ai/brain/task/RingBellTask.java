package yarnwrap.entity.ai.brain.task;
public class RingBellTask { public net.minecraft.entity.ai.brain.task.RingBellTask wrapperContained; public RingBellTask(net.minecraft.entity.ai.brain.task.RingBellTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
public static int MAX_DISTANCE() { return net.minecraft.entity.ai.brain.task.RingBellTask.MAX_DISTANCE; }
// public static void MAX_DISTANCE(int value, ) { net.minecraft.entity.ai.brain.task.RingBellTask.MAX_DISTANCE = value; }

// public float RUN_CHANCE() { return wrapperContained.RUN_CHANCE; }
// public void RUN_CHANCE(float value) { wrapperContained.RUN_CHANCE = value; }
// public static float RUN_CHANCE() { return net.minecraft.entity.ai.brain.task.RingBellTask.RUN_CHANCE; }
// public static void RUN_CHANCE(float value, ) { net.minecraft.entity.ai.brain.task.RingBellTask.RUN_CHANCE = value; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.RingBellTask.create()); }
// public com.mojang.datafixers.kinds.App method_47045(Object context) { return wrapperContained.method_47045(context); }
// public static com.mojang.datafixers.kinds.App method_47045(Object context, ) { return net.minecraft.entity.ai.brain.task.RingBellTask.method_47045(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47046(Object meetingPoint) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47046(meetingPoint)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47046(Object meetingPoint, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.RingBellTask.method_47046(meetingPoint)); }
// public boolean method_47047(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time) { return wrapperContained.method_47047(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_47047(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time, ) { return net.minecraft.entity.ai.brain.task.RingBellTask.method_47047(world,entity.wrapperContained,time.wrapperContained); }

}