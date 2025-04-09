package yarnwrap.entity.ai.brain.task;
public class StopPanickingTask { public net.minecraft.entity.ai.brain.task.StopPanickingTask wrapperContained; public StopPanickingTask(net.minecraft.entity.ai.brain.task.StopPanickingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}