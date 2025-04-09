package yarnwrap.entity.ai.brain.task;
public class SeekWaterTask { public net.minecraft.entity.ai.brain.task.SeekWaterTask wrapperContained; public SeekWaterTask(net.minecraft.entity.ai.brain.task.SeekWaterTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int range,float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range,speed)); }

}