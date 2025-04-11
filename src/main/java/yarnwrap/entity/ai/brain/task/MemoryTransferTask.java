package yarnwrap.entity.ai.brain.task;
public class MemoryTransferTask { public net.minecraft.entity.ai.brain.task.MemoryTransferTask wrapperContained; public MemoryTransferTask(net.minecraft.entity.ai.brain.task.MemoryTransferTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate runPredicate,yarnwrap.entity.ai.brain.MemoryModuleType sourceType,yarnwrap.entity.ai.brain.MemoryModuleType targetType,yarnwrap.util.math.intprovider.UniformIntProvider expiry) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(runPredicate,sourceType.wrapperContained,targetType.wrapperContained,expiry.wrapperContained)); }

}