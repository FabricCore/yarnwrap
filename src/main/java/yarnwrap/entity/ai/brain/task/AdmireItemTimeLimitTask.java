package yarnwrap.entity.ai.brain.task;
public class AdmireItemTimeLimitTask { public net.minecraft.entity.ai.brain.task.AdmireItemTimeLimitTask wrapperContained; public AdmireItemTimeLimitTask(net.minecraft.entity.ai.brain.task.AdmireItemTimeLimitTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int cooldown,int timeLimit) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(cooldown,timeLimit)); }
// public com.mojang.datafixers.kinds.App method_47295(int context) { return wrapperContained.method_47295(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47296(Object admiringItem,int nearestVisibleWantedItem,int timeTryingToReachAdmireItem,yarnwrap.entity.ai.brain.MemoryQueryResult disableWalkToAdmireItem) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47296(admiringItem,nearestVisibleWantedItem,timeTryingToReachAdmireItem,disableWalkToAdmireItem.wrapperContained)); }
// public boolean method_47297(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,int time) { return wrapperContained.method_47297(world,entity.wrapperContained,time); }

}