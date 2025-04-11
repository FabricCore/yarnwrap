package yarnwrap.entity.ai.brain.task;
public class RandomTask { public net.minecraft.entity.ai.brain.task.RandomTask wrapperContained; public RandomTask(net.minecraft.entity.ai.brain.task.RandomTask wrapperContained) { this.wrapperContained = wrapperContained; }

public RandomTask(java.util.List tasks) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.RandomTask(tasks); }
public RandomTask(java.util.Map requiredMemoryState,java.util.List tasks) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.RandomTask(requiredMemoryState,tasks); }

}