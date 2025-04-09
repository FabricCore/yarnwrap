package yarnwrap.entity.ai.brain.task;
public class WorkStationCompetitionTask { public net.minecraft.entity.ai.brain.task.WorkStationCompetitionTask wrapperContained; public WorkStationCompetitionTask(net.minecraft.entity.ai.brain.task.WorkStationCompetitionTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isCompletedWorkStation(yarnwrap.registry.entry.RegistryEntry poiType,yarnwrap.village.VillagerProfession profession) { return wrapperContained.isCompletedWorkStation(poiType.wrapperContained,profession.wrapperContained); }
// public yarnwrap.entity.passive.VillagerEntity keepJobSiteForMoreExperiencedVillager(yarnwrap.entity.passive.VillagerEntity first,yarnwrap.entity.passive.VillagerEntity second) { return new yarnwrap.entity.passive.VillagerEntity(wrapperContained.keepJobSiteForMoreExperiencedVillager(first.wrapperContained,second.wrapperContained)); }
// public boolean isUsingWorkStationAt(yarnwrap.util.math.GlobalPos pos,yarnwrap.registry.entry.RegistryEntry poiType,yarnwrap.entity.passive.VillagerEntity villager) { return wrapperContained.isUsingWorkStationAt(pos.wrapperContained,poiType.wrapperContained,villager.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}