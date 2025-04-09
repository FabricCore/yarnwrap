package yarnwrap.entity.ai.brain.task;
public class HuntFinishTask { public net.minecraft.entity.ai.brain.task.HuntFinishTask wrapperContained; public HuntFinishTask(net.minecraft.entity.ai.brain.task.HuntFinishTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}