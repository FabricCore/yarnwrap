package yarnwrap.entity.ai.brain.task;
public class GoToWorkTask { public net.minecraft.entity.ai.brain.task.GoToWorkTask wrapperContained; public GoToWorkTask(net.minecraft.entity.ai.brain.task.GoToWorkTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}