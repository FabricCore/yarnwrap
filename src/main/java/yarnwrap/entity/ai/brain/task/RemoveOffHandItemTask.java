package yarnwrap.entity.ai.brain.task;
public class RemoveOffHandItemTask { public net.minecraft.entity.ai.brain.task.RemoveOffHandItemTask wrapperContained; public RemoveOffHandItemTask(net.minecraft.entity.ai.brain.task.RemoveOffHandItemTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}