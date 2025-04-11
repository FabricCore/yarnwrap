package yarnwrap.entity.ai.brain.task;
public class GoTowardsLookTargetTask { public net.minecraft.entity.ai.brain.task.GoTowardsLookTargetTask wrapperContained; public GoTowardsLookTargetTask(net.minecraft.entity.ai.brain.task.GoTowardsLookTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(float speed,int completionRange) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(speed,completionRange)); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(java.util.function.Predicate predicate,java.util.function.Function speed,int completionRange) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(predicate,speed,completionRange)); }

}