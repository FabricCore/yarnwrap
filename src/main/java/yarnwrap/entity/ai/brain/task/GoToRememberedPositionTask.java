package yarnwrap.entity.ai.brain.task;
public class GoToRememberedPositionTask { public net.minecraft.entity.ai.brain.task.GoToRememberedPositionTask wrapperContained; public GoToRememberedPositionTask(net.minecraft.entity.ai.brain.task.GoToRememberedPositionTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask createEntityBased(yarnwrap.entity.ai.brain.MemoryModuleType entityModule,float speed,int range,boolean requiresWalkTarget) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.createEntityBased(entityModule.wrapperContained,speed,range,requiresWalkTarget)); }
// public boolean method_47089(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,boolean time) { return wrapperContained.method_47089(world,entity.wrapperContained,time); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47090(Object walkTarget,boolean posSourcex) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47090(walkTarget,posSourcex)); }
public yarnwrap.entity.ai.brain.task.Task createPosBased(yarnwrap.entity.ai.brain.MemoryModuleType posModule,float speed,int range,boolean requiresWalkTarget) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.createPosBased(posModule.wrapperContained,speed,range,requiresWalkTarget)); }
// public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.entity.ai.brain.MemoryModuleType posSource,float speed,int range,boolean requiresWalkTarget,java.util.function.Function posGetter) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(posSource.wrapperContained,speed,range,requiresWalkTarget,posGetter)); }
// public com.mojang.datafixers.kinds.App method_47093(yarnwrap.entity.ai.brain.MemoryModuleType context) { return wrapperContained.method_47093(context.wrapperContained); }

}