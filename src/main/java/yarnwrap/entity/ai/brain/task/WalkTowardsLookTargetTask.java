package yarnwrap.entity.ai.brain.task;
public class WalkTowardsLookTargetTask { public net.minecraft.entity.ai.brain.task.WalkTowardsLookTargetTask wrapperContained; public WalkTowardsLookTargetTask(net.minecraft.entity.ai.brain.task.WalkTowardsLookTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.datafixers.kinds.App method_47128(java.util.function.Function context) { return wrapperContained.method_47128(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47129(java.util.function.Function lookTarget,java.util.function.Predicate walkTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47129(lookTarget,walkTarget)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Function lookTargetFunction,java.util.function.Predicate predicate,int completionRange,int searchRange,float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(lookTargetFunction,predicate,completionRange,searchRange,speed)); }
// public boolean method_47131(java.util.function.Function world,java.util.function.Predicate entity,int time) { return wrapperContained.method_47131(world,entity,time); }

}