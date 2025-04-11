package yarnwrap.entity.ai.brain.task;
public class VillagerWalkTowardsTask { public net.minecraft.entity.ai.brain.task.VillagerWalkTowardsTask wrapperContained; public VillagerWalkTowardsTask(net.minecraft.entity.ai.brain.task.VillagerWalkTowardsTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.entity.ai.brain.MemoryModuleType destination,float speed,int completionRange,int maxDistance,int maxRunTime) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(destination.wrapperContained,speed,completionRange,maxDistance,maxRunTime)); }

}