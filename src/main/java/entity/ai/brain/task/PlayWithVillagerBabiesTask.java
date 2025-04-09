package yarnwrap.entity.ai.brain.task;
public class PlayWithVillagerBabiesTask { public net.minecraft.entity.ai.brain.task.PlayWithVillagerBabiesTask wrapperContained; public PlayWithVillagerBabiesTask(net.minecraft.entity.ai.brain.task.PlayWithVillagerBabiesTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public int VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }
// public float WALK_SPEED() { return wrapperContained.WALK_SPEED; }
// public float PLAYING_WALK_SPEED() { return wrapperContained.PLAYING_WALK_SPEED; }
// public int MAX_BABY_INTERACTION_COUNT() { return wrapperContained.MAX_BABY_INTERACTION_COUNT; }
// public int RUN_CHANCE() { return wrapperContained.RUN_CHANCE; }
// public yarnwrap.entity.LivingEntity getInteractionTarget(yarnwrap.entity.LivingEntity baby) { return new yarnwrap.entity.LivingEntity(wrapperContained.getInteractionTarget(baby.wrapperContained)); }
// public boolean isInteractionTargetOf(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity baby) { return wrapperContained.isInteractionTargetOf(entity.wrapperContained,baby.wrapperContained); }
// public void setPlayTarget(yarnwrap.entity.ai.brain.MemoryQueryResult interactionTarget,yarnwrap.entity.ai.brain.MemoryQueryResult lookTarget,yarnwrap.entity.ai.brain.MemoryQueryResult walkTarget,yarnwrap.entity.LivingEntity baby) { wrapperContained.setPlayTarget(interactionTarget.wrapperContained,lookTarget.wrapperContained,walkTarget.wrapperContained,baby.wrapperContained); }
// public java.util.Optional getLeastPopularBabyInteractionTarget(java.util.List babies) { return wrapperContained.getLeastPopularBabyInteractionTarget(babies); }
// public java.util.Map getBabyInteractionTargetCounts(java.util.List babies) { return wrapperContained.getBabyInteractionTargetCounts(babies); }
// public boolean hasInteractionTarget(yarnwrap.entity.LivingEntity baby) { return wrapperContained.hasInteractionTarget(baby.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }

}