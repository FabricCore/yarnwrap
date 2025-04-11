package yarnwrap.entity.ai.brain.task;
public class ForgetCompletedPointOfInterestTask { public net.minecraft.entity.ai.brain.task.ForgetCompletedPointOfInterestTask wrapperContained; public ForgetCompletedPointOfInterestTask(net.minecraft.entity.ai.brain.task.ForgetCompletedPointOfInterestTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_RANGE() { return wrapperContained.MAX_RANGE; }
// public void MAX_RANGE(int value) { wrapperContained.MAX_RANGE = value; }
// public boolean isBedOccupiedByOthers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity entity) { return wrapperContained.isBedOccupiedByOthers(world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate poiTypePredicate,yarnwrap.entity.ai.brain.MemoryModuleType poiPosModule) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(poiTypePredicate,poiPosModule.wrapperContained)); }

}