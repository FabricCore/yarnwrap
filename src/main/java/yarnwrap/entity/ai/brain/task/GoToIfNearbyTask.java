package yarnwrap.entity.ai.brain.task;
public class GoToIfNearbyTask { public net.minecraft.entity.ai.brain.task.GoToIfNearbyTask wrapperContained; public GoToIfNearbyTask(net.minecraft.entity.ai.brain.task.GoToIfNearbyTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int UPDATE_INTERVAL() { return wrapperContained.UPDATE_INTERVAL; }
// public void UPDATE_INTERVAL(int value) { wrapperContained.UPDATE_INTERVAL = value; }
// public int HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public void HORIZONTAL_RANGE(int value) { wrapperContained.HORIZONTAL_RANGE = value; }
// public int VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }
// public void VERTICAL_RANGE(int value) { wrapperContained.VERTICAL_RANGE = value; }
// public yarnwrap.entity.ai.brain.WalkTarget method_47150(float targetPos) { return new yarnwrap.entity.ai.brain.WalkTarget(wrapperContained.method_47150(targetPos)); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47151(Object walkTarget,int pos) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47151(walkTarget,pos)); }
// public boolean method_47152(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,int time) { return wrapperContained.method_47152(world,entity.wrapperContained,time); }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.entity.ai.brain.MemoryModuleType posModule,float walkSpeed,int maxDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(posModule.wrapperContained,walkSpeed,maxDistance)); }
// public com.mojang.datafixers.kinds.App method_47154(yarnwrap.entity.ai.brain.MemoryModuleType context) { return wrapperContained.method_47154(context.wrapperContained); }

}