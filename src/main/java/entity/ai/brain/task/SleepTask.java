package yarnwrap.entity.ai.brain.task;
public class SleepTask { public net.minecraft.entity.ai.brain.task.SleepTask wrapperContained; public SleepTask(net.minecraft.entity.ai.brain.task.SleepTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public long startTime() { return wrapperContained.startTime; }
public int RUN_TIME() { return wrapperContained.RUN_TIME; }

}