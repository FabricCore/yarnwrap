package yarnwrap.entity.ai.brain.task;
public class RidingTask { public net.minecraft.entity.ai.brain.task.RidingTask wrapperContained; public RidingTask(net.minecraft.entity.ai.brain.task.RidingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canRideTarget(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.Entity vehicle,int range) { return wrapperContained.canRideTarget(entity.wrapperContained,vehicle.wrapperContained,range); }
public yarnwrap.entity.ai.brain.task.Task create(int range,java.util.function.BiPredicate alternativeRideCondition) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range,alternativeRideCondition)); }
// public com.mojang.datafixers.kinds.App method_46916(int context) { return wrapperContained.method_46916(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46917(Object rideTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46917(rideTarget)); }
// public boolean method_46918(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,int time) { return wrapperContained.method_46918(world,entity.wrapperContained,time); }

}