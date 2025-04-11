package yarnwrap.entity.ai.brain.task;
public class FindPointOfInterestTask { public net.minecraft.entity.ai.brain.task.FindPointOfInterestTask wrapperContained; public FindPointOfInterestTask(net.minecraft.entity.ai.brain.task.FindPointOfInterestTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int POI_SORTING_RADIUS() { return wrapperContained.POI_SORTING_RADIUS; }
// public void POI_SORTING_RADIUS(int value) { wrapperContained.POI_SORTING_RADIUS = value; }
public yarnwrap.entity.ai.pathing.Path findPathToPoi(yarnwrap.entity.mob.MobEntity entity,java.util.Set pois) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathToPoi(entity.wrapperContained,pois)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate poiPredicate,yarnwrap.entity.ai.brain.MemoryModuleType poiPosModule,yarnwrap.entity.ai.brain.MemoryModuleType potentialPoiPosModule,boolean onlyRunIfChild,java.util.Optional entityStatus) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(poiPredicate,poiPosModule.wrapperContained,potentialPoiPosModule.wrapperContained,onlyRunIfChild,entityStatus)); }
public yarnwrap.entity.ai.brain.task.Task create(java.util.function.Predicate poiPredicate,yarnwrap.entity.ai.brain.MemoryModuleType poiPosModule,boolean onlyRunIfChild,java.util.Optional entityStatus) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(poiPredicate,poiPosModule.wrapperContained,onlyRunIfChild,entityStatus)); }

}