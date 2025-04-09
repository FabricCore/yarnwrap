package yarnwrap.entity.ai.brain.task;
public class StartRaidTask { public net.minecraft.entity.ai.brain.task.StartRaidTask wrapperContained; public StartRaidTask(net.minecraft.entity.ai.brain.task.StartRaidTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}