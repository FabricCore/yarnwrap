package yarnwrap.entity.passive;
public class AllayBrain { public net.minecraft.entity.passive.AllayBrain wrapperContained; public AllayBrain(net.minecraft.entity.passive.AllayBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public float WALK_TO_ITEM_SPEED() { return wrapperContained.WALK_TO_ITEM_SPEED; }
// public void WALK_TO_ITEM_SPEED(float value) { wrapperContained.WALK_TO_ITEM_SPEED = value; }
// public int LIKED_NOTEBLOCK_COOLDOWN_TICKS_EXPIRY() { return wrapperContained.LIKED_NOTEBLOCK_COOLDOWN_TICKS_EXPIRY; }
// public void LIKED_NOTEBLOCK_COOLDOWN_TICKS_EXPIRY(int value) { wrapperContained.LIKED_NOTEBLOCK_COOLDOWN_TICKS_EXPIRY = value; }
// public int WALK_TO_ITEM_RADIUS() { return wrapperContained.WALK_TO_ITEM_RADIUS; }
// public void WALK_TO_ITEM_RADIUS(int value) { wrapperContained.WALK_TO_ITEM_RADIUS = value; }
// public float FLEE_SPEED() { return wrapperContained.FLEE_SPEED; }
// public void FLEE_SPEED(float value) { wrapperContained.FLEE_SPEED = value; }
// public int GIVE_INVENTORY_RUN_TIME() { return wrapperContained.GIVE_INVENTORY_RUN_TIME; }
// public void GIVE_INVENTORY_RUN_TIME(int value) { wrapperContained.GIVE_INVENTORY_RUN_TIME = value; }
// public java.util.Optional getLookTarget(yarnwrap.entity.LivingEntity allay) { return wrapperContained.getLookTarget(allay.wrapperContained); }
// public boolean shouldGoTowardsNoteBlock(yarnwrap.entity.LivingEntity allay,yarnwrap.entity.ai.brain.Brain brain,yarnwrap.util.math.GlobalPos pos) { return wrapperContained.shouldGoTowardsNoteBlock(allay.wrapperContained,brain.wrapperContained,pos.wrapperContained); }
public void rememberNoteBlock(yarnwrap.entity.LivingEntity allay,yarnwrap.util.math.BlockPos pos) { wrapperContained.rememberNoteBlock(allay.wrapperContained,pos.wrapperContained); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
public void updateActivities(yarnwrap.entity.passive.AllayEntity allay) { wrapperContained.updateActivities(allay.wrapperContained); }
// public java.util.Optional getLikedLookTarget(yarnwrap.entity.LivingEntity allay) { return wrapperContained.getLikedLookTarget(allay.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
public java.util.Optional getLikedPlayer(yarnwrap.entity.LivingEntity allay) { return wrapperContained.getLikedPlayer(allay.wrapperContained); }
// public boolean hasNearestVisibleWantedItem(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasNearestVisibleWantedItem(entity.wrapperContained); }

}