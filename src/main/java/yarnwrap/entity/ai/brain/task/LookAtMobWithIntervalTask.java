package yarnwrap.entity.ai.brain.task;
public class LookAtMobWithIntervalTask { public net.minecraft.entity.ai.brain.task.LookAtMobWithIntervalTask wrapperContained; public LookAtMobWithIntervalTask(net.minecraft.entity.ai.brain.task.LookAtMobWithIntervalTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task follow(float maxDistance,yarnwrap.util.math.intprovider.UniformIntProvider interval) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.follow(maxDistance,interval.wrapperContained)); }
// public yarnwrap.entity.ai.brain.task.Task follow(float maxDistance,yarnwrap.util.math.intprovider.UniformIntProvider interval,java.util.function.Predicate predicate) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.follow(maxDistance,interval.wrapperContained,predicate)); }
public yarnwrap.entity.ai.brain.task.Task follow(yarnwrap.entity.EntityType type,float maxDistance,yarnwrap.util.math.intprovider.UniformIntProvider interval) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.follow(type.wrapperContained,maxDistance,interval.wrapperContained)); }

}