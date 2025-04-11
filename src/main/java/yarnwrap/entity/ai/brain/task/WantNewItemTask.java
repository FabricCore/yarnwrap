package yarnwrap.entity.ai.brain.task;
public class WantNewItemTask { public net.minecraft.entity.ai.brain.task.WantNewItemTask wrapperContained; public WantNewItemTask(net.minecraft.entity.ai.brain.task.WantNewItemTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int range) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range)); }
// public com.mojang.datafixers.kinds.App method_47291(int context) { return wrapperContained.method_47291(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47292(Object admiringItem,int nearestVisibleWantedItem) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47292(admiringItem,nearestVisibleWantedItem)); }
// public boolean method_47293(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,int time) { return wrapperContained.method_47293(world,entity.wrapperContained,time); }

}