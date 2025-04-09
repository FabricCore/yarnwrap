package yarnwrap.entity.passive;
public class FoxEntity { public net.minecraft.entity.passive.FoxEntity wrapperContained; public FoxEntity(net.minecraft.entity.passive.FoxEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TYPE); }
// public yarnwrap.entity.data.TrackedData FOX_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FOX_FLAGS); }
// public yarnwrap.entity.data.TrackedData OWNER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.OWNER); }
// public yarnwrap.entity.data.TrackedData OTHER_TRUSTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.OTHER_TRUSTED); }
// public java.util.function.Predicate PICKABLE_DROP_FILTER() { return wrapperContained.PICKABLE_DROP_FILTER; }
// public java.util.function.Predicate JUST_ATTACKED_SOMETHING_FILTER() { return wrapperContained.JUST_ATTACKED_SOMETHING_FILTER; }
// public java.util.function.Predicate CHICKEN_AND_RABBIT_FILTER() { return wrapperContained.CHICKEN_AND_RABBIT_FILTER; }
// public java.util.function.Predicate NOTICEABLE_PLAYER_FILTER() { return wrapperContained.NOTICEABLE_PLAYER_FILTER; }
// public yarnwrap.entity.ai.goal.Goal followChickenAndRabbitGoal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.followChickenAndRabbitGoal); }
// public yarnwrap.entity.ai.goal.Goal followBabyTurtleGoal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.followBabyTurtleGoal); }
// public yarnwrap.entity.ai.goal.Goal followFishGoal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.followFishGoal); }
// public float headRollProgress() { return wrapperContained.headRollProgress; }
// public float lastHeadRollProgress() { return wrapperContained.lastHeadRollProgress; }
// public float extraRollingHeight() { return wrapperContained.extraRollingHeight; }
// public float lastExtraRollingHeight() { return wrapperContained.lastExtraRollingHeight; }
// public int eatingTime() { return wrapperContained.eatingTime; }
public int CROUCHING_FLAG() { return wrapperContained.CROUCHING_FLAG; }
public int ROLLING_HEAD_FLAG() { return wrapperContained.ROLLING_HEAD_FLAG; }
public int CHASING_FLAG() { return wrapperContained.CHASING_FLAG; }
// public int SITTING_FLAG() { return wrapperContained.SITTING_FLAG; }
// public int SLEEPING_FLAG() { return wrapperContained.SLEEPING_FLAG; }
// public int WALKING_FLAG() { return wrapperContained.WALKING_FLAG; }
// public int AGGRESSIVE_FLAG() { return wrapperContained.AGGRESSIVE_FLAG; }
// public int EATING_DURATION() { return wrapperContained.EATING_DURATION; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
public boolean canJumpChase(yarnwrap.entity.passive.FoxEntity fox,yarnwrap.entity.LivingEntity chasedEntity) { return wrapperContained.canJumpChase(fox.wrapperContained,chasedEntity.wrapperContained); }
// public void addTrustedUuid(java.util.UUID uuid) { wrapperContained.addTrustedUuid(uuid); }
// public void setFoxFlag(int mask,boolean value) { wrapperContained.setFoxFlag(mask,value); }
public boolean isSitting() { return wrapperContained.isSitting(); }
public boolean isWalking() { return wrapperContained.isWalking(); }
public boolean isChasing() { return wrapperContained.isChasing(); }
public boolean isFullyCrouched() { return wrapperContained.isFullyCrouched(); }
public boolean isRollingHead() { return wrapperContained.isRollingHead(); }
// public void addTypeSpecificGoals() { wrapperContained.addTypeSpecificGoals(); }
// public java.util.List getTrustedUuids() { return wrapperContained.getTrustedUuids(); }
// public boolean isAggressive() { return wrapperContained.isAggressive(); }
// public void stopSleeping() { wrapperContained.stopSleeping(); }
// public void stopActions() { wrapperContained.stopActions(); }
// public boolean wantsToPickupItem() { return wrapperContained.wantsToPickupItem(); }
// public void spit(yarnwrap.item.ItemStack stack) { wrapperContained.spit(stack.wrapperContained); }
// public void dropItem(yarnwrap.item.ItemStack stack) { wrapperContained.dropItem(stack.wrapperContained); }
// public boolean getFoxFlag(int bitmask) { return wrapperContained.getFoxFlag(bitmask); }
public void setSitting(boolean sitting) { wrapperContained.setSitting(sitting); }
// public void setWalking(boolean walking) { wrapperContained.setWalking(walking); }
public void setChasing(boolean chasing) { wrapperContained.setChasing(chasing); }
public void setCrouching(boolean crouching) { wrapperContained.setCrouching(crouching); }
public float getHeadRoll(float tickDelta) { return wrapperContained.getHeadRoll(tickDelta); }
public void setRollingHead(boolean rollingHead) { wrapperContained.setRollingHead(rollingHead); }
public float getBodyRotationHeightOffset(float tickDelta) { return wrapperContained.getBodyRotationHeightOffset(tickDelta); }
// public void setAggressive(boolean aggressive) { wrapperContained.setAggressive(aggressive); }
// public void setSleeping(boolean sleeping) { wrapperContained.setSleeping(sleeping); }
// public boolean canTrust(java.util.UUID uuid) { return wrapperContained.canTrust(uuid); }
// public boolean canEat(yarnwrap.item.ItemStack stack) { return wrapperContained.canEat(stack.wrapperContained); }
public Object createFoxAttributes() { return wrapperContained.createFoxAttributes(); }
public boolean isJumping() { return wrapperContained.isJumping(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}