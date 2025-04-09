package yarnwrap.entity.ai.brain.task;
public class AdmireItemTimeLimitTask { public net.minecraft.entity.ai.brain.task.AdmireItemTimeLimitTask wrapperContained; public AdmireItemTimeLimitTask(net.minecraft.entity.ai.brain.task.AdmireItemTimeLimitTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int cooldown,int timeLimit) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(cooldown,timeLimit)); }

}