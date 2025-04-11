package yarnwrap.entity.ai.brain.task;
public class DigTask { public net.minecraft.entity.ai.brain.task.DigTask wrapperContained; public DigTask(net.minecraft.entity.ai.brain.task.DigTask wrapperContained) { this.wrapperContained = wrapperContained; }

public DigTask(int duration) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.DigTask(duration); }

}