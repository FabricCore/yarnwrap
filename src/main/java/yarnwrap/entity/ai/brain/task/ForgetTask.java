package yarnwrap.entity.ai.brain.task;
public class ForgetTask { public net.minecraft.entity.ai.brain.task.ForgetTask wrapperContained; public ForgetTask(net.minecraft.entity.ai.brain.task.ForgetTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate condition,yarnwrap.entity.ai.brain.MemoryModuleType memory) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(condition,memory.wrapperContained)); }

}