package yarnwrap.entity.ai.brain.task;
public class GoToIfNearbyTask { public net.minecraft.entity.ai.brain.task.GoToIfNearbyTask wrapperContained; public GoToIfNearbyTask(net.minecraft.entity.ai.brain.task.GoToIfNearbyTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int UPDATE_INTERVAL() { return wrapperContained.UPDATE_INTERVAL; }
// public void UPDATE_INTERVAL(int value) { wrapperContained.UPDATE_INTERVAL = value; }
// public int HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public void HORIZONTAL_RANGE(int value) { wrapperContained.HORIZONTAL_RANGE = value; }
// public int VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }
// public void VERTICAL_RANGE(int value) { wrapperContained.VERTICAL_RANGE = value; }
public yarnwrap.entity.ai.brain.task.SingleTickTask create(yarnwrap.entity.ai.brain.MemoryModuleType posModule,float walkSpeed,int maxDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(posModule.wrapperContained,walkSpeed,maxDistance)); }

}