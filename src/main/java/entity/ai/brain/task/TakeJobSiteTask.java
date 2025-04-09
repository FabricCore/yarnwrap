package yarnwrap.entity.ai.brain.task;
public class TakeJobSiteTask { public net.minecraft.entity.ai.brain.task.TakeJobSiteTask wrapperContained; public TakeJobSiteTask(net.minecraft.entity.ai.brain.task.TakeJobSiteTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canUseJobSite(yarnwrap.registry.entry.RegistryEntry poiType,yarnwrap.entity.passive.VillagerEntity villager,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canUseJobSite(poiType.wrapperContained,villager.wrapperContained,pos.wrapperContained); }
// public boolean canReachJobSite(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos pos,yarnwrap.world.poi.PointOfInterestType poiType) { return wrapperContained.canReachJobSite(entity.wrapperContained,pos.wrapperContained,poiType.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }

}