package yarnwrap.entity.ai.brain.task;
public class MemoryTransferTask { public net.minecraft.entity.ai.brain.task.MemoryTransferTask wrapperContained; public MemoryTransferTask(net.minecraft.entity.ai.brain.task.MemoryTransferTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.datafixers.kinds.App method_46911(yarnwrap.entity.ai.brain.MemoryModuleType context) { return wrapperContained.method_46911(context.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46912(java.util.function.Predicate source,Object target) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46912(source,target)); }
// public boolean method_46913(java.util.function.Predicate world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,Object time) { return wrapperContained.method_46913(world,entity.wrapperContained,time); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate runPredicate,yarnwrap.entity.ai.brain.MemoryModuleType sourceType,yarnwrap.entity.ai.brain.MemoryModuleType targetType,yarnwrap.util.math.intprovider.UniformIntProvider expiry) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(runPredicate,sourceType.wrapperContained,targetType.wrapperContained,expiry.wrapperContained)); }

}