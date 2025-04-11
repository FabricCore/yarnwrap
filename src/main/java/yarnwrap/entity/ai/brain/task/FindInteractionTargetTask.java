package yarnwrap.entity.ai.brain.task;
public class FindInteractionTargetTask { public net.minecraft.entity.ai.brain.task.FindInteractionTargetTask wrapperContained; public FindInteractionTargetTask(net.minecraft.entity.ai.brain.task.FindInteractionTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.EntityType type,int maxDistance) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(type.wrapperContained,maxDistance)); }

}