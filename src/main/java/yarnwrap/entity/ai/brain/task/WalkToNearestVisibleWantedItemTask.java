package yarnwrap.entity.ai.brain.task;
public class WalkToNearestVisibleWantedItemTask { public net.minecraft.entity.ai.brain.task.WalkToNearestVisibleWantedItemTask wrapperContained; public WalkToNearestVisibleWantedItemTask(net.minecraft.entity.ai.brain.task.WalkToNearestVisibleWantedItemTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(float speed,boolean requiresWalkTarget,int radius) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed,requiresWalkTarget,radius)); }
// public boolean method_46944(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_46944(entity.wrapperContained); }
// public boolean method_46945(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_46945(world,entity.wrapperContained,time.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46946(Object lookTarget,java.util.function.Predicate walkTarget,int nearestVisibleWantedItem,float itemPickupCooldownTicks) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46946(lookTarget,walkTarget,nearestVisibleWantedItem,itemPickupCooldownTicks)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate startCondition,float speed,boolean requiresWalkTarget,int radius) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(startCondition,speed,requiresWalkTarget,radius)); }
// public com.mojang.datafixers.kinds.App method_46948(boolean context) { return wrapperContained.method_46948(context); }

}