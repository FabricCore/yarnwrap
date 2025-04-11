package yarnwrap.entity.ai.brain.task;
public class RidingTask { public net.minecraft.entity.ai.brain.task.RidingTask wrapperContained; public RidingTask(net.minecraft.entity.ai.brain.task.RidingTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canRideTarget(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.Entity vehicle,int range) { return wrapperContained.canRideTarget(entity.wrapperContained,vehicle.wrapperContained,range); }
public yarnwrap.entity.ai.brain.task.Task create(int range,java.util.function.BiPredicate alternativeRideCondition) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(range,alternativeRideCondition)); }

}