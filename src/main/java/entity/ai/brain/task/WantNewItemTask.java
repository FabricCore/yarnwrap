package yarnwrap.entity.ai.brain.task;
public class WantNewItemTask { public net.minecraft.entity.ai.brain.task.WantNewItemTask wrapperContained; public WantNewItemTask(net.minecraft.entity.ai.brain.task.WantNewItemTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int range) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range)); }

}