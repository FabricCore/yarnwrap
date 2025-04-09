package yarnwrap.entity.ai.brain.task;
public class WalkTowardsLookTargetTask { public net.minecraft.entity.ai.brain.task.WalkTowardsLookTargetTask wrapperContained; public WalkTowardsLookTargetTask(net.minecraft.entity.ai.brain.task.WalkTowardsLookTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Function lookTargetFunction,java.util.function.Predicate predicate,int completionRange,int searchRange,float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(lookTargetFunction,predicate,completionRange,searchRange,speed)); }

}