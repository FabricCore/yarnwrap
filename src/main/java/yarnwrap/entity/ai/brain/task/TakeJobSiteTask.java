package yarnwrap.entity.ai.brain.task;
public class TakeJobSiteTask { public net.minecraft.entity.ai.brain.task.TakeJobSiteTask wrapperContained; public TakeJobSiteTask(net.minecraft.entity.ai.brain.task.TakeJobSiteTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canUseJobSite(yarnwrap.registry.entry.RegistryEntry poiType,yarnwrap.entity.passive.VillagerEntity villager,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canUseJobSite(poiType.wrapperContained,villager.wrapperContained,pos.wrapperContained); }
// public boolean canReachJobSite(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos pos,yarnwrap.world.poi.PointOfInterestType poiType) { return wrapperContained.canReachJobSite(entity.wrapperContained,pos.wrapperContained,poiType.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create(float speed) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(speed)); }
// public com.mojang.datafixers.kinds.App method_47208(float context) { return wrapperContained.method_47208(context); }
// public yarnwrap.entity.passive.VillagerEntity method_47209(yarnwrap.entity.LivingEntity villager) { return new yarnwrap.entity.passive.VillagerEntity(wrapperContained.method_47209(villager.wrapperContained)); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47210(Object potentialJobSite,float jobSite,yarnwrap.entity.ai.brain.MemoryQueryResult mobs,yarnwrap.entity.ai.brain.MemoryQueryResult walkTarget,yarnwrap.entity.ai.brain.MemoryQueryResult lookTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47210(potentialJobSite,jobSite,mobs.wrapperContained,walkTarget.wrapperContained,lookTarget.wrapperContained)); }
// public boolean method_47211(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47211(world,entity.wrapperContained,time.wrapperContained); }
// public void method_47212(yarnwrap.entity.ai.brain.MemoryQueryResult villager) { wrapperContained.method_47212(villager.wrapperContained); }
// public boolean method_47213(yarnwrap.entity.passive.VillagerEntity mob) { return wrapperContained.method_47213(mob.wrapperContained); }
// public boolean method_47214(java.util.Optional villager) { return wrapperContained.method_47214(villager); }

}