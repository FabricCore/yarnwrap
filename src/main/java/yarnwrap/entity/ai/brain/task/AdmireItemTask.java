package yarnwrap.entity.ai.brain.task;
public class AdmireItemTask { public net.minecraft.entity.ai.brain.task.AdmireItemTask wrapperContained; public AdmireItemTask(net.minecraft.entity.ai.brain.task.AdmireItemTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int duration) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(duration)); }

}