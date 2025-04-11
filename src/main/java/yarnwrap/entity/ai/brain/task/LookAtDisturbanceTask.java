package yarnwrap.entity.ai.brain.task;
public class LookAtDisturbanceTask { public net.minecraft.entity.ai.brain.task.LookAtDisturbanceTask wrapperContained; public LookAtDisturbanceTask(net.minecraft.entity.ai.brain.task.LookAtDisturbanceTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public com.mojang.datafixers.kinds.App method_47260(Object context) { return wrapperContained.method_47260(context); }
// public boolean method_47262(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47262(world,entity.wrapperContained,time.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47263(Object lookTarget,yarnwrap.entity.ai.brain.MemoryQueryResult disturbanceLocation,yarnwrap.entity.ai.brain.MemoryQueryResult roarTarget,yarnwrap.entity.ai.brain.MemoryQueryResult attackTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47263(lookTarget,disturbanceLocation.wrapperContained,roarTarget.wrapperContained,attackTarget.wrapperContained)); }

}