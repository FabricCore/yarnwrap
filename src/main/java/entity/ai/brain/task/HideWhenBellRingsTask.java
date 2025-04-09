package yarnwrap.entity.ai.brain.task;
public class HideWhenBellRingsTask { public net.minecraft.entity.ai.brain.task.HideWhenBellRingsTask wrapperContained; public HideWhenBellRingsTask(net.minecraft.entity.ai.brain.task.HideWhenBellRingsTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}