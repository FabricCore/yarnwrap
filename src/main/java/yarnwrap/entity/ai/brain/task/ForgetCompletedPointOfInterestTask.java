package yarnwrap.entity.ai.brain.task;
public class ForgetCompletedPointOfInterestTask { public net.minecraft.entity.ai.brain.task.ForgetCompletedPointOfInterestTask wrapperContained; public ForgetCompletedPointOfInterestTask(net.minecraft.entity.ai.brain.task.ForgetCompletedPointOfInterestTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_RANGE() { return wrapperContained.MAX_RANGE; }
// public void MAX_RANGE(int value) { wrapperContained.MAX_RANGE = value; }
// public boolean isBedOccupiedByOthers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity entity) { return wrapperContained.isBedOccupiedByOthers(world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
// public boolean method_47187(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,java.util.function.Predicate time) { return wrapperContained.method_47187(world,entity.wrapperContained,time); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47188(Object poiPos) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47188(poiPos)); }
// public com.mojang.datafixers.kinds.App method_47189(yarnwrap.entity.ai.brain.MemoryModuleType context) { return wrapperContained.method_47189(context.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate poiTypePredicate,yarnwrap.entity.ai.brain.MemoryModuleType poiPosModule) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(poiTypePredicate,poiPosModule.wrapperContained)); }

}