package yarnwrap.entity.ai.brain.task;
public class ScheduleActivityTask { public net.minecraft.entity.ai.brain.task.ScheduleActivityTask wrapperContained; public ScheduleActivityTask(net.minecraft.entity.ai.brain.task.ScheduleActivityTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}