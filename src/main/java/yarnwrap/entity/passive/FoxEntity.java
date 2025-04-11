package yarnwrap.entity.passive;
public class FoxEntity { public net.minecraft.entity.passive.FoxEntity wrapperContained; public FoxEntity(net.minecraft.entity.passive.FoxEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.entity.data.TrackedData value) { wrapperContained.TYPE = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData FOX_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FOX_FLAGS); }
// public void FOX_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.FOX_FLAGS = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData OWNER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.OWNER); }
// public void OWNER(yarnwrap.entity.data.TrackedData value) { wrapperContained.OWNER = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData OTHER_TRUSTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.OTHER_TRUSTED); }
// public void OTHER_TRUSTED(yarnwrap.entity.data.TrackedData value) { wrapperContained.OTHER_TRUSTED = value.wrapperContained; }
// public java.util.function.Predicate PICKABLE_DROP_FILTER() { return wrapperContained.PICKABLE_DROP_FILTER; }
// public void PICKABLE_DROP_FILTER(java.util.function.Predicate value) { wrapperContained.PICKABLE_DROP_FILTER = value; }
// public java.util.function.Predicate JUST_ATTACKED_SOMETHING_FILTER() { return wrapperContained.JUST_ATTACKED_SOMETHING_FILTER; }
// public void JUST_ATTACKED_SOMETHING_FILTER(java.util.function.Predicate value) { wrapperContained.JUST_ATTACKED_SOMETHING_FILTER = value; }
// public java.util.function.Predicate CHICKEN_AND_RABBIT_FILTER() { return wrapperContained.CHICKEN_AND_RABBIT_FILTER; }
// public void CHICKEN_AND_RABBIT_FILTER(java.util.function.Predicate value) { wrapperContained.CHICKEN_AND_RABBIT_FILTER = value; }
// public java.util.function.Predicate NOTICEABLE_PLAYER_FILTER() { return wrapperContained.NOTICEABLE_PLAYER_FILTER; }
// public void NOTICEABLE_PLAYER_FILTER(java.util.function.Predicate value) { wrapperContained.NOTICEABLE_PLAYER_FILTER = value; }
// public yarnwrap.entity.ai.goal.Goal followChickenAndRabbitGoal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.followChickenAndRabbitGoal); }
// public void followChickenAndRabbitGoal(yarnwrap.entity.ai.goal.Goal value) { wrapperContained.followChickenAndRabbitGoal = value.wrapperContained; }
// public yarnwrap.entity.ai.goal.Goal followBabyTurtleGoal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.followBabyTurtleGoal); }
// public void followBabyTurtleGoal(yarnwrap.entity.ai.goal.Goal value) { wrapperContained.followBabyTurtleGoal = value.wrapperContained; }
// public yarnwrap.entity.ai.goal.Goal followFishGoal() { return new yarnwrap.entity.ai.goal.Goal(wrapperContained.followFishGoal); }
// public void followFishGoal(yarnwrap.entity.ai.goal.Goal value) { wrapperContained.followFishGoal = value.wrapperContained; }
// public float headRollProgress() { return wrapperContained.headRollProgress; }
// public void headRollProgress(float value) { wrapperContained.headRollProgress = value; }
// public float lastHeadRollProgress() { return wrapperContained.lastHeadRollProgress; }
// public void lastHeadRollProgress(float value) { wrapperContained.lastHeadRollProgress = value; }
// public float extraRollingHeight() { return wrapperContained.extraRollingHeight; }
// public void extraRollingHeight(float value) { wrapperContained.extraRollingHeight = value; }
// public float lastExtraRollingHeight() { return wrapperContained.lastExtraRollingHeight; }
// public void lastExtraRollingHeight(float value) { wrapperContained.lastExtraRollingHeight = value; }
// public int eatingTime() { return wrapperContained.eatingTime; }
// public void eatingTime(int value) { wrapperContained.eatingTime = value; }
public int CROUCHING_FLAG() { return wrapperContained.CROUCHING_FLAG; }
// public void CROUCHING_FLAG(int value) { wrapperContained.CROUCHING_FLAG = value; }
public int ROLLING_HEAD_FLAG() { return wrapperContained.ROLLING_HEAD_FLAG; }
// public void ROLLING_HEAD_FLAG(int value) { wrapperContained.ROLLING_HEAD_FLAG = value; }
public int CHASING_FLAG() { return wrapperContained.CHASING_FLAG; }
// public void CHASING_FLAG(int value) { wrapperContained.CHASING_FLAG = value; }
// public int SITTING_FLAG() { return wrapperContained.SITTING_FLAG; }
// public void SITTING_FLAG(int value) { wrapperContained.SITTING_FLAG = value; }
// public int SLEEPING_FLAG() { return wrapperContained.SLEEPING_FLAG; }
// public void SLEEPING_FLAG(int value) { wrapperContained.SLEEPING_FLAG = value; }
// public int WALKING_FLAG() { return wrapperContained.WALKING_FLAG; }
// public void WALKING_FLAG(int value) { wrapperContained.WALKING_FLAG = value; }
// public int AGGRESSIVE_FLAG() { return wrapperContained.AGGRESSIVE_FLAG; }
// public void AGGRESSIVE_FLAG(int value) { wrapperContained.AGGRESSIVE_FLAG = value; }
// public int EATING_DURATION() { return wrapperContained.EATING_DURATION; }
// public void EATING_DURATION(int value) { wrapperContained.EATING_DURATION = value; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public boolean method_18253(yarnwrap.entity.Entity entity) { return wrapperContained.method_18253(entity.wrapperContained); }
// public boolean method_18254(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18254(entity.wrapperContained); }
public boolean canJumpChase(yarnwrap.entity.passive.FoxEntity fox,yarnwrap.entity.LivingEntity chasedEntity) { return wrapperContained.canJumpChase(fox.wrapperContained,chasedEntity.wrapperContained); }
// public boolean method_18261(yarnwrap.entity.Entity entity) { return wrapperContained.method_18261(entity.wrapperContained); }
// public boolean method_18262(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18262(entity.wrapperContained); }
// public boolean method_18265(yarnwrap.entity.ItemEntity item) { return wrapperContained.method_18265(item.wrapperContained); }
// public void addTrustedUuid(java.util.UUID uuid) { wrapperContained.addTrustedUuid(uuid); }
// public boolean method_18267(yarnwrap.entity.Entity entity) { return wrapperContained.method_18267(entity.wrapperContained); }
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
// public boolean method_18429(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18429(entity.wrapperContained); }
// public boolean canEat(yarnwrap.item.ItemStack stack) { return wrapperContained.canEat(stack.wrapperContained); }
// public boolean method_18431(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18431(entity.wrapperContained); }
// public boolean method_20451(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_20451(entity.wrapperContained); }
// public boolean method_24347(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_24347(entity.wrapperContained); }
public Object createFoxAttributes() { return wrapperContained.createFoxAttributes(); }
public boolean isJumping() { return wrapperContained.isJumping(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}