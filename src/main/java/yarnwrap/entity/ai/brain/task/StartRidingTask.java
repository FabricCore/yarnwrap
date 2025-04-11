package yarnwrap.entity.ai.brain.task;
public class StartRidingTask { public net.minecraft.entity.ai.brain.task.StartRidingTask wrapperContained; public StartRidingTask(net.minecraft.entity.ai.brain.task.StartRidingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int COMPLETION_RANGE() { return wrapperContained.COMPLETION_RANGE; }
// public void COMPLETION_RANGE(int value) { wrapperContained.COMPLETION_RANGE = value; }
public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }

}