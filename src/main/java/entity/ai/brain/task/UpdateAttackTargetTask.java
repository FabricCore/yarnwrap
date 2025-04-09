package yarnwrap.entity.ai.brain.task;
public class UpdateAttackTargetTask { public net.minecraft.entity.ai.brain.task.UpdateAttackTargetTask wrapperContained; public UpdateAttackTargetTask(net.minecraft.entity.ai.brain.task.UpdateAttackTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Function targetGetter) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(targetGetter)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate startCondition,java.util.function.Function targetGetter) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(startCondition,targetGetter)); }

}