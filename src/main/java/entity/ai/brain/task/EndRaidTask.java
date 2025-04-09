package yarnwrap.entity.ai.brain.task;
public class EndRaidTask { public net.minecraft.entity.ai.brain.task.EndRaidTask wrapperContained; public EndRaidTask(net.minecraft.entity.ai.brain.task.EndRaidTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}