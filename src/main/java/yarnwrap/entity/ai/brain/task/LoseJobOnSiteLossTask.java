package yarnwrap.entity.ai.brain.task;
public class LoseJobOnSiteLossTask { public net.minecraft.entity.ai.brain.task.LoseJobOnSiteLossTask wrapperContained; public LoseJobOnSiteLossTask(net.minecraft.entity.ai.brain.task.LoseJobOnSiteLossTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}