package yarnwrap.entity.ai.brain.task;
public class GoTowardsLookTargetTask { public net.minecraft.entity.ai.brain.task.GoTowardsLookTargetTask wrapperContained; public GoTowardsLookTargetTask(net.minecraft.entity.ai.brain.task.GoTowardsLookTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed,int completionRange) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed,completionRange)); }
// public java.lang.Float method_47105(float entity) { return wrapperContained.method_47105(entity); }
// public boolean method_47106(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_47106(entity.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47107(java.util.function.Predicate walkTarget,Object lookTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47107(walkTarget,lookTarget)); }
// public boolean method_47108(java.util.function.Predicate world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,Object time) { return wrapperContained.method_47108(world,entity.wrapperContained,time); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(java.util.function.Predicate predicate,java.util.function.Function speed,int completionRange) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(predicate,speed,completionRange)); }
// public com.mojang.datafixers.kinds.App method_47110(java.util.function.Predicate context) { return wrapperContained.method_47110(context); }

}