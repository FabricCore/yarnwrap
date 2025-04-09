package yarnwrap.entity.ai.brain.task;
public class StartSniffingTask { public net.minecraft.entity.ai.brain.task.StartSniffingTask wrapperContained; public StartSniffingTask(net.minecraft.entity.ai.brain.task.StartSniffingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider COOLDOWN() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.COOLDOWN); }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}