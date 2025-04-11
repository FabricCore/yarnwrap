package yarnwrap.entity.ai.brain.task;
public class RingBellTask { public net.minecraft.entity.ai.brain.task.RingBellTask wrapperContained; public RingBellTask(net.minecraft.entity.ai.brain.task.RingBellTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
// public float RUN_CHANCE() { return wrapperContained.RUN_CHANCE; }
// public void RUN_CHANCE(float value) { wrapperContained.RUN_CHANCE = value; }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}