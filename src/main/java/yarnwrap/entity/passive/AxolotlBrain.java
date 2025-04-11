package yarnwrap.entity.passive;
public class AxolotlBrain { public net.minecraft.entity.passive.AxolotlBrain wrapperContained; public AxolotlBrain(net.minecraft.entity.passive.AxolotlBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider WALK_TOWARD_ADULT_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.WALK_TOWARD_ADULT_RANGE); }
// public void WALK_TOWARD_ADULT_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.WALK_TOWARD_ADULT_RANGE = value.wrapperContained; }
// public float BREEDING_SPEED() { return wrapperContained.BREEDING_SPEED; }
// public void BREEDING_SPEED(float value) { wrapperContained.BREEDING_SPEED = value; }
// public float ON_LAND_SPEED() { return wrapperContained.ON_LAND_SPEED; }
// public void ON_LAND_SPEED(float value) { wrapperContained.ON_LAND_SPEED = value; }
// public float IDLE_SPEED() { return wrapperContained.IDLE_SPEED; }
// public void IDLE_SPEED(float value) { wrapperContained.IDLE_SPEED = value; }
// public float TARGET_APPROACHING_SPEED() { return wrapperContained.TARGET_APPROACHING_SPEED; }
// public void TARGET_APPROACHING_SPEED(float value) { wrapperContained.TARGET_APPROACHING_SPEED = value; }
// public float ADULT_FOLLOWING_SPEED() { return wrapperContained.ADULT_FOLLOWING_SPEED; }
// public void ADULT_FOLLOWING_SPEED(float value) { wrapperContained.ADULT_FOLLOWING_SPEED = value; }
public java.util.function.Predicate getTemptItemPredicate() { return wrapperContained.getTemptItemPredicate(); }
// public float getTargetApproachingSpeed(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getTargetApproachingSpeed(entity.wrapperContained); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
public void updateActivities(yarnwrap.entity.passive.AxolotlEntity axolotl) { wrapperContained.updateActivities(axolotl.wrapperContained); }
// public float getAdultFollowingSpeed(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getAdultFollowingSpeed(entity.wrapperContained); }
// public void addPlayDeadActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addPlayDeadActivities(brain.wrapperContained); }
// public java.util.Optional getAttackTarget(yarnwrap.entity.passive.AxolotlEntity axolotl) { return wrapperContained.getAttackTarget(axolotl.wrapperContained); }
// public float getTemptedSpeed(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getTemptedSpeed(entity.wrapperContained); }
// public void addFightActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addFightActivities(brain.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
// public boolean canGoToLookTarget(yarnwrap.entity.LivingEntity entity) { return wrapperContained.canGoToLookTarget(entity.wrapperContained); }

}