package yarnwrap.entity.ai.brain.task;
public class FindEntityTask { public net.minecraft.entity.ai.brain.task.FindEntityTask wrapperContained; public FindEntityTask(net.minecraft.entity.ai.brain.task.FindEntityTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.EntityType type,int maxDistance,yarnwrap.entity.ai.brain.MemoryModuleType targetModule,float speed,int completionRange) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(type.wrapperContained,maxDistance,targetModule.wrapperContained,speed,completionRange)); }
public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.EntityType type,int maxDistance,java.util.function.Predicate entityPredicate,java.util.function.Predicate targetPredicate,yarnwrap.entity.ai.brain.MemoryModuleType targetModule,float speed,int completionRange) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(type.wrapperContained,maxDistance,entityPredicate,targetPredicate,targetModule.wrapperContained,speed,completionRange)); }

}