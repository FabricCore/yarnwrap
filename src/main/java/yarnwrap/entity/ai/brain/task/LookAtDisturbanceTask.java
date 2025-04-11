package yarnwrap.entity.ai.brain.task;
public class LookAtDisturbanceTask { public net.minecraft.entity.ai.brain.task.LookAtDisturbanceTask wrapperContained; public LookAtDisturbanceTask(net.minecraft.entity.ai.brain.task.LookAtDisturbanceTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}