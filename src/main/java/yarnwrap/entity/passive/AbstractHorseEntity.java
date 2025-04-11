package yarnwrap.entity.passive;
public class AbstractHorseEntity { public net.minecraft.entity.passive.AbstractHorseEntity wrapperContained; public AbstractHorseEntity(net.minecraft.entity.passive.AbstractHorseEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate PARENT_HORSE_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.PARENT_HORSE_PREDICATE); }
// public void PARENT_HORSE_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.PARENT_HORSE_PREDICATE = value.wrapperContained; }
// public int TAMED_FLAG() { return wrapperContained.TAMED_FLAG; }
// public void TAMED_FLAG(int value) { wrapperContained.TAMED_FLAG = value; }
// public int SADDLED_FLAG() { return wrapperContained.SADDLED_FLAG; }
// public void SADDLED_FLAG(int value) { wrapperContained.SADDLED_FLAG = value; }
// public int BRED_FLAG() { return wrapperContained.BRED_FLAG; }
// public void BRED_FLAG(int value) { wrapperContained.BRED_FLAG = value; }
// public int EATING_GRASS_FLAG() { return wrapperContained.EATING_GRASS_FLAG; }
// public void EATING_GRASS_FLAG(int value) { wrapperContained.EATING_GRASS_FLAG = value; }
// public int ANGRY_FLAG() { return wrapperContained.ANGRY_FLAG; }
// public void ANGRY_FLAG(int value) { wrapperContained.ANGRY_FLAG = value; }
// public int EATING_FLAG() { return wrapperContained.EATING_FLAG; }
// public void EATING_FLAG(int value) { wrapperContained.EATING_FLAG = value; }
// public java.util.UUID ownerUuid() { return wrapperContained.ownerUuid; }
// public void ownerUuid(java.util.UUID value) { wrapperContained.ownerUuid = value; }
// public float MIN_MOVEMENT_SPEED_BONUS() { return wrapperContained.MIN_MOVEMENT_SPEED_BONUS; }
// public void MIN_MOVEMENT_SPEED_BONUS(float value) { wrapperContained.MIN_MOVEMENT_SPEED_BONUS = value; }
// public float MAX_MOVEMENT_SPEED_BONUS() { return wrapperContained.MAX_MOVEMENT_SPEED_BONUS; }
// public void MAX_MOVEMENT_SPEED_BONUS(float value) { wrapperContained.MAX_MOVEMENT_SPEED_BONUS = value; }
// public float MIN_JUMP_STRENGTH_BONUS() { return wrapperContained.MIN_JUMP_STRENGTH_BONUS; }
// public void MIN_JUMP_STRENGTH_BONUS(float value) { wrapperContained.MIN_JUMP_STRENGTH_BONUS = value; }
// public float MAX_JUMP_STRENGTH_BONUS() { return wrapperContained.MAX_JUMP_STRENGTH_BONUS; }
// public void MAX_JUMP_STRENGTH_BONUS(float value) { wrapperContained.MAX_JUMP_STRENGTH_BONUS = value; }
// public float MIN_HEALTH_BONUS() { return wrapperContained.MIN_HEALTH_BONUS; }
// public void MIN_HEALTH_BONUS(float value) { wrapperContained.MIN_HEALTH_BONUS = value; }
// public float MAX_HEALTH_BONUS() { return wrapperContained.MAX_HEALTH_BONUS; }
// public void MAX_HEALTH_BONUS(float value) { wrapperContained.MAX_HEALTH_BONUS = value; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public int temper() { return wrapperContained.temper; }
// public void temper(int value) { wrapperContained.temper = value; }
// public java.util.function.Predicate IS_BRED_HORSE() { return wrapperContained.IS_BRED_HORSE; }
// public void IS_BRED_HORSE(java.util.function.Predicate value) { wrapperContained.IS_BRED_HORSE = value; }
public int tailWagTicks() { return wrapperContained.tailWagTicks; }
public void tailWagTicks(int value) { wrapperContained.tailWagTicks = value; }
// public yarnwrap.entity.data.TrackedData HORSE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HORSE_FLAGS); }
// public void HORSE_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.HORSE_FLAGS = value.wrapperContained; }
// public boolean jumping() { return wrapperContained.jumping; }
// public void jumping(boolean value) { wrapperContained.jumping = value; }
// public float lastEatingAnimationProgress() { return wrapperContained.lastEatingAnimationProgress; }
// public void lastEatingAnimationProgress(float value) { wrapperContained.lastEatingAnimationProgress = value; }
// public yarnwrap.inventory.SimpleInventory items() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.items); }
// public void items(yarnwrap.inventory.SimpleInventory value) { wrapperContained.items = value.wrapperContained; }
// public float lastAngryAnimationProgress() { return wrapperContained.lastAngryAnimationProgress; }
// public void lastAngryAnimationProgress(float value) { wrapperContained.lastAngryAnimationProgress = value; }
// public boolean playExtraHorseSounds() { return wrapperContained.playExtraHorseSounds; }
// public void playExtraHorseSounds(boolean value) { wrapperContained.playExtraHorseSounds = value; }
// public float eatingAnimationProgress() { return wrapperContained.eatingAnimationProgress; }
// public void eatingAnimationProgress(float value) { wrapperContained.eatingAnimationProgress = value; }
// public float lastEatingGrassAnimationProgress() { return wrapperContained.lastEatingGrassAnimationProgress; }
// public void lastEatingGrassAnimationProgress(float value) { wrapperContained.lastEatingGrassAnimationProgress = value; }
// public float angryAnimationProgress() { return wrapperContained.angryAnimationProgress; }
// public void angryAnimationProgress(float value) { wrapperContained.angryAnimationProgress = value; }
// public boolean inAir() { return wrapperContained.inAir; }
// public void inAir(boolean value) { wrapperContained.inAir = value; }
// public float eatingGrassAnimationProgress() { return wrapperContained.eatingGrassAnimationProgress; }
// public void eatingGrassAnimationProgress(float value) { wrapperContained.eatingGrassAnimationProgress = value; }
// public int angryTicks() { return wrapperContained.angryTicks; }
// public void angryTicks(int value) { wrapperContained.angryTicks = value; }
// public int eatingGrassTicks() { return wrapperContained.eatingGrassTicks; }
// public void eatingGrassTicks(int value) { wrapperContained.eatingGrassTicks = value; }
// public int eatingTicks() { return wrapperContained.eatingTicks; }
// public void eatingTicks(int value) { wrapperContained.eatingTicks = value; }
// public int soundTicks() { return wrapperContained.soundTicks; }
// public void soundTicks(int value) { wrapperContained.soundTicks = value; }
// public float jumpStrength() { return wrapperContained.jumpStrength; }
// public void jumpStrength(float value) { wrapperContained.jumpStrength = value; }
public Object createBaseHorseAttributes() { return wrapperContained.createBaseHorseAttributes(); }
// public yarnwrap.util.math.Vec3d locateSafeDismountingPos(yarnwrap.util.math.Vec3d offset,yarnwrap.entity.LivingEntity passenger) { return new yarnwrap.util.math.Vec3d(wrapperContained.locateSafeDismountingPos(offset.wrapperContained,passenger.wrapperContained)); }
// public yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getEatSound()); }
public yarnwrap.util.ActionResult interactHorse(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { return new yarnwrap.util.ActionResult(wrapperContained.interactHorse(player.wrapperContained,stack.wrapperContained)); }
public boolean areInventoriesDifferent(yarnwrap.inventory.Inventory inventory) { return wrapperContained.areInventoriesDifferent(inventory.wrapperContained); }
// public void jump(float strength,yarnwrap.util.math.Vec3d movementInput) { wrapperContained.jump(strength,movementInput.wrapperContained); }
// public boolean shouldAmbientStand() { return wrapperContained.shouldAmbientStand(); }
public void equipHorseArmor(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.equipHorseArmor(player.wrapperContained,stack.wrapperContained); }
public yarnwrap.sound.SoundEvent getAmbientStandSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getAmbientStandSound()); }
public int getMinAmbientStandDelay() { return wrapperContained.getMinAmbientStandDelay(); }
// public double calculateAttributeBaseValue(double parentBase,double otherParentBase,double min,double max,yarnwrap.util.math.random.Random random) { return wrapperContained.calculateAttributeBaseValue(parentBase,otherParentBase,min,max,random.wrapperContained); }
// public void setChildAttribute(yarnwrap.entity.passive.PassiveEntity other,yarnwrap.entity.passive.AbstractHorseEntity child,yarnwrap.registry.entry.RegistryEntry attribute,double min,double max) { wrapperContained.setChildAttribute(other.wrapperContained,child.wrapperContained,attribute.wrapperContained,min,max); }
// public int method_49129(int max) { return wrapperContained.method_49129(max); }
// public int method_49130(int max) { return wrapperContained.method_49130(max); }
// public yarnwrap.util.math.Vec2f getControlledRotation(yarnwrap.entity.LivingEntity controllingPassenger) { return new yarnwrap.util.math.Vec2f(wrapperContained.getControlledRotation(controllingPassenger.wrapperContained)); }
// public boolean isWooden(yarnwrap.sound.BlockSoundGroup soundGroup) { return wrapperContained.isWooden(soundGroup.wrapperContained); }
// public void updateSaddledFlag() { wrapperContained.updateSaddledFlag(); }
public yarnwrap.inventory.Inventory getInventory() { return new yarnwrap.inventory.Inventory(wrapperContained.getInventory()); }
// public boolean method_58392(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58392(stack.wrapperContained); }
// public void initAttributes(yarnwrap.util.math.random.Random random) { wrapperContained.initAttributes(random.wrapperContained); }
public int getInventorySize(int columns) { return wrapperContained.getInventorySize(columns); }
public int getInventoryColumns() { return wrapperContained.getInventoryColumns(); }
// public void onChestedStatusChanged() { wrapperContained.onChestedStatusChanged(); }
// public void playJumpSound() { wrapperContained.playJumpSound(); }
public boolean isEatingGrass() { return wrapperContained.isEatingGrass(); }
// public void putPlayerOnBack(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.putPlayerOnBack(player.wrapperContained); }
public boolean isTame() { return wrapperContained.isTame(); }
// public double getChildMovementSpeedBonus(java.util.function.DoubleSupplier randomDoubleGetter) { return wrapperContained.getChildMovementSpeedBonus(randomDoubleGetter); }
public int getTemper() { return wrapperContained.getTemper(); }
// public boolean getHorseFlag(int bitmask) { return wrapperContained.getHorseFlag(bitmask); }
public void setOwnerUuid(java.util.UUID ownerUuid) { wrapperContained.setOwnerUuid(ownerUuid); }
// public void playEatingAnimation() { wrapperContained.playEatingAnimation(); }
// public boolean canBreed() { return wrapperContained.canBreed(); }
public boolean isAngry() { return wrapperContained.isAngry(); }
public void setAngry(boolean angry) { wrapperContained.setAngry(angry); }
// public void setEating() { wrapperContained.setEating(); }
public float getEatingGrassAnimationProgress(float tickDelta) { return wrapperContained.getEatingGrassAnimationProgress(tickDelta); }
public void setEatingGrass(boolean eatingGrass) { wrapperContained.setEatingGrass(eatingGrass); }
// public boolean method_6741(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_6741(entity.wrapperContained); }
// public boolean receiveFood(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack item) { return wrapperContained.receiveFood(player.wrapperContained,item.wrapperContained); }
// public void setChildAttributes(yarnwrap.entity.passive.PassiveEntity other,yarnwrap.entity.passive.AbstractHorseEntity child) { wrapperContained.setChildAttributes(other.wrapperContained,child.wrapperContained); }
public boolean isBred() { return wrapperContained.isBred(); }
public int addTemper(int difference) { return wrapperContained.addTemper(difference); }
// public void walkToParent() { wrapperContained.walkToParent(); }
// public yarnwrap.sound.SoundEvent getAngrySound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getAngrySound()); }
public void updateAnger() { wrapperContained.updateAnger(); }
public void setTemper(int temper) { wrapperContained.setTemper(temper); }
public int getInventorySize() { return wrapperContained.getInventorySize(); }
public void setBred(boolean bred) { wrapperContained.setBred(bred); }
public boolean bondWithPlayer(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.bondWithPlayer(player.wrapperContained); }
// public float getChildHealthBonus(java.util.function.IntUnaryOperator randomIntGetter) { return wrapperContained.getChildHealthBonus(randomIntGetter); }
public int getMaxTemper() { return wrapperContained.getMaxTemper(); }
public void playAngrySound() { wrapperContained.playAngrySound(); }
public void setInAir(boolean inAir) { wrapperContained.setInAir(inAir); }
// public void wagTail() { wrapperContained.wagTail(); }
// public void spawnPlayerReactionParticles(boolean positive) { wrapperContained.spawnPlayerReactionParticles(positive); }
// public void playWalkSound(yarnwrap.sound.BlockSoundGroup group) { wrapperContained.playWalkSound(group.wrapperContained); }
public boolean eatsGrass() { return wrapperContained.eatsGrass(); }
public boolean isInAir() { return wrapperContained.isInAir(); }
// public void initCustomGoals() { wrapperContained.initCustomGoals(); }
public void setTame(boolean tame) { wrapperContained.setTame(tame); }
public float getAngryAnimationProgress(float tickDelta) { return wrapperContained.getAngryAnimationProgress(tickDelta); }
// public void setHorseFlag(int bitmask,boolean flag) { wrapperContained.setHorseFlag(bitmask,flag); }
public float getEatingAnimationProgress(float tickDelta) { return wrapperContained.getEatingAnimationProgress(tickDelta); }
// public double getChildJumpStrengthBonus(java.util.function.DoubleSupplier randomDoubleGetter) { return wrapperContained.getChildJumpStrengthBonus(randomDoubleGetter); }

}