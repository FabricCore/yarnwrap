package yarnwrap.entity.ai.brain.task;
public class WanderIndoorsTask { public net.minecraft.entity.ai.brain.task.WanderIndoorsTask wrapperContained; public WanderIndoorsTask(net.minecraft.entity.ai.brain.task.WanderIndoorsTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }

}