package yarnwrap.entity.ai.brain.task;
public class EmergeTask { public net.minecraft.entity.ai.brain.task.EmergeTask wrapperContained; public EmergeTask(net.minecraft.entity.ai.brain.task.EmergeTask wrapperContained) { this.wrapperContained = wrapperContained; }

public EmergeTask(int duration) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.EmergeTask(duration); }

}