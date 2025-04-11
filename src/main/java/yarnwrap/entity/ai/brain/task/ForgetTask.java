package yarnwrap.entity.ai.brain.task;
public class ForgetTask { public net.minecraft.entity.ai.brain.task.ForgetTask wrapperContained; public ForgetTask(net.minecraft.entity.ai.brain.task.ForgetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.datafixers.kinds.App method_46919(yarnwrap.entity.ai.brain.MemoryModuleType context) { return wrapperContained.method_46919(context.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46920(java.util.function.Predicate queryResult) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46920(queryResult)); }
// public boolean method_46921(java.util.function.Predicate world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time) { return wrapperContained.method_46921(world,entity.wrapperContained,time.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate condition,yarnwrap.entity.ai.brain.MemoryModuleType memory) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(condition,memory.wrapperContained)); }

}