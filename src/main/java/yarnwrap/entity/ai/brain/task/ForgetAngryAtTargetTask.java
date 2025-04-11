package yarnwrap.entity.ai.brain.task;
public class ForgetAngryAtTargetTask { public net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask wrapperContained; public ForgetAngryAtTargetTask(net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}