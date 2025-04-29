package yarnwrap.entity.ai.brain.task;
public class HuntFinishTask { public net.minecraft.entity.ai.brain.task.HuntFinishTask wrapperContained; public HuntFinishTask(net.minecraft.entity.ai.brain.task.HuntFinishTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.HuntFinishTask.create()); }
// public com.mojang.datafixers.kinds.App method_47276(Object context) { return wrapperContained.method_47276(context); }
// public static com.mojang.datafixers.kinds.App method_47276(Object context, ) { return net.minecraft.entity.ai.brain.task.HuntFinishTask.method_47276(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47277(Object attackTarget,yarnwrap.entity.ai.brain.MemoryQueryResult huntedRecently) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47277(attackTarget,huntedRecently.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47277(Object attackTarget,yarnwrap.entity.ai.brain.MemoryQueryResult huntedRecently, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.HuntFinishTask.method_47277(attackTarget,huntedRecently.wrapperContained)); }
// public boolean method_47278(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47278(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_47278(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time, ) { return net.minecraft.entity.ai.brain.task.HuntFinishTask.method_47278(world,entity.wrapperContained,time.wrapperContained); }

}