package yarnwrap.entity.ai.brain.task;
public class DefeatTargetTask { public net.minecraft.entity.ai.brain.task.DefeatTargetTask wrapperContained; public DefeatTargetTask(net.minecraft.entity.ai.brain.task.DefeatTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int celebrationDuration,java.util.function.BiPredicate predicate) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(celebrationDuration,predicate)); }

}