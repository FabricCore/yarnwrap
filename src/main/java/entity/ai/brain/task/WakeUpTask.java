package yarnwrap.entity.ai.brain.task;
public class WakeUpTask { public net.minecraft.entity.ai.brain.task.WakeUpTask wrapperContained; public WakeUpTask(net.minecraft.entity.ai.brain.task.WakeUpTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}