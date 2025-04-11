package yarnwrap.entity.ai.brain.task;
public class FindRoarTargetTask { public net.minecraft.entity.ai.brain.task.FindRoarTargetTask wrapperContained; public FindRoarTargetTask(net.minecraft.entity.ai.brain.task.FindRoarTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Function targetFinder) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(targetFinder)); }

}