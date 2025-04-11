package yarnwrap.entity.ai.brain.task;
public class GoToPointOfInterestTask { public net.minecraft.entity.ai.brain.task.GoToPointOfInterestTask wrapperContained; public GoToPointOfInterestTask(net.minecraft.entity.ai.brain.task.GoToPointOfInterestTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(float speed,int completionRange) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed,completionRange)); }

}