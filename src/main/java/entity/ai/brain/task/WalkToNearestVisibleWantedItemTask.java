package yarnwrap.entity.ai.brain.task;
public class WalkToNearestVisibleWantedItemTask { public net.minecraft.entity.ai.brain.task.WalkToNearestVisibleWantedItemTask wrapperContained; public WalkToNearestVisibleWantedItemTask(net.minecraft.entity.ai.brain.task.WalkToNearestVisibleWantedItemTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(float speed,boolean requiresWalkTarget,int radius) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed,requiresWalkTarget,radius)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate startCondition,float speed,boolean requiresWalkTarget,int radius) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(startCondition,speed,requiresWalkTarget,radius)); }

}