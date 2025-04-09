package yarnwrap.entity.ai.brain.task;
public class GoToSecondaryPositionTask { public net.minecraft.entity.ai.brain.task.GoToSecondaryPositionTask wrapperContained; public GoToSecondaryPositionTask(net.minecraft.entity.ai.brain.task.GoToSecondaryPositionTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.ai.brain.MemoryModuleType secondaryPositions,float speed,int completionRange,int primaryPositionActivationDistance,yarnwrap.entity.ai.brain.MemoryModuleType primaryPosition) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(secondaryPositions.wrapperContained,speed,completionRange,primaryPositionActivationDistance,primaryPosition.wrapperContained)); }

}