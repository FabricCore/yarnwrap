package yarnwrap.entity.ai.brain.task;
public class AdmireItemTask { public net.minecraft.entity.ai.brain.task.AdmireItemTask wrapperContained; public AdmireItemTask(net.minecraft.entity.ai.brain.task.AdmireItemTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(int duration) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(duration)); }
// public com.mojang.datafixers.kinds.App method_47280(int context) { return wrapperContained.method_47280(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47281(Object nearestVisibleWantedItem,int admiringItem,yarnwrap.entity.ai.brain.MemoryQueryResult admiringDisabled,yarnwrap.entity.ai.brain.MemoryQueryResult disableWalkToAdmireItem) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47281(nearestVisibleWantedItem,admiringItem,admiringDisabled.wrapperContained,disableWalkToAdmireItem.wrapperContained)); }
// public boolean method_47282(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47282(world,entity.wrapperContained,time.wrapperContained); }

}