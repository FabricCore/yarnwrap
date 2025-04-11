package yarnwrap.entity.ai.brain.task;
public class GoToNearbyPositionTask { public net.minecraft.entity.ai.brain.task.GoToNearbyPositionTask wrapperContained; public GoToNearbyPositionTask(net.minecraft.entity.ai.brain.task.GoToNearbyPositionTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.ai.brain.MemoryModuleType posModule,float walkSpeed,int completionRange,int maxDistance) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(posModule.wrapperContained,walkSpeed,completionRange,maxDistance)); }

}