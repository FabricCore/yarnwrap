package yarnwrap.entity.ai.brain.task;
public class PacifyTask { public net.minecraft.entity.ai.brain.task.PacifyTask wrapperContained; public PacifyTask(net.minecraft.entity.ai.brain.task.PacifyTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.entity.ai.brain.MemoryModuleType requiredMemory,int duration) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(requiredMemory.wrapperContained,duration)); }

}