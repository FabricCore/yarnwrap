package yarnwrap.entity.passive;
public class AbstractHorseEntity { public net.minecraft.entity.passive.AbstractHorseEntity wrapperContained; public AbstractHorseEntity(net.minecraft.entity.passive.AbstractHorseEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int temper() { return wrapperContained.temper; }
// public void temper(int value) { wrapperContained.temper = value; }
// public static int temper() { return net.minecraft.entity.passive.AbstractHorseEntity.temper; }
// public static void temper(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.temper = value; }

// public Object IS_BRED_HORSE() { return wrapperContained.IS_BRED_HORSE; }
// // public void IS_BRED_HORSE(Object value) { wrapperContained.IS_BRED_HORSE = value; }
// // public static Object IS_BRED_HORSE() { return net.minecraft.entity.passive.AbstractHorseEntity.IS_BRED_HORSE; }
// // public static void IS_BRED_HORSE(Object value, ) { net.minecraft.entity.passive.AbstractHorseEntity.IS_BRED_HORSE = value; }

public int tailWagTicks() { return wrapperContained.tailWagTicks; }
public void tailWagTicks(int value) { wrapperContained.tailWagTicks = value; }
// public static int tailWagTicks() { return net.minecraft.entity.passive.AbstractHorseEntity.tailWagTicks; }
// public static void tailWagTicks(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.tailWagTicks = value; }

// public yarnwrap.entity.data.TrackedData HORSE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HORSE_FLAGS); }
// public void HORSE_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.HORSE_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HORSE_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.AbstractHorseEntity.HORSE_FLAGS); }
// public static void HORSE_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.AbstractHorseEntity.HORSE_FLAGS = value.wrapperContained; }

// public boolean jumping() { return wrapperContained.jumping; }
// public void jumping(boolean value) { wrapperContained.jumping = value; }
// public static boolean jumping() { return net.minecraft.entity.passive.AbstractHorseEntity.jumping; }
// public static void jumping(boolean value, ) { net.minecraft.entity.passive.AbstractHorseEntity.jumping = value; }

// public float lastEatingAnimationProgress() { return wrapperContained.lastEatingAnimationProgress; }
// public void lastEatingAnimationProgress(float value) { wrapperContained.lastEatingAnimationProgress = value; }
// public static float lastEatingAnimationProgress() { return net.minecraft.entity.passive.AbstractHorseEntity.lastEatingAnimationProgress; }
// public static void lastEatingAnimationProgress(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.lastEatingAnimationProgress = value; }

// public yarnwrap.inventory.SimpleInventory items() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.items); }
// public void items(yarnwrap.inventory.SimpleInventory value) { wrapperContained.items = value.wrapperContained; }
// public static yarnwrap.inventory.SimpleInventory items() { return new yarnwrap.inventory.SimpleInventory(net.minecraft.entity.passive.AbstractHorseEntity.items); }
// public static void items(yarnwrap.inventory.SimpleInventory value, ) { net.minecraft.entity.passive.AbstractHorseEntity.items = value.wrapperContained; }

// public float lastAngryAnimationProgress() { return wrapperContained.lastAngryAnimationProgress; }
// public void lastAngryAnimationProgress(float value) { wrapperContained.lastAngryAnimationProgress = value; }
// public static float lastAngryAnimationProgress() { return net.minecraft.entity.passive.AbstractHorseEntity.lastAngryAnimationProgress; }
// public static void lastAngryAnimationProgress(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.lastAngryAnimationProgress = value; }

// public boolean playExtraHorseSounds() { return wrapperContained.playExtraHorseSounds; }
// public void playExtraHorseSounds(boolean value) { wrapperContained.playExtraHorseSounds = value; }
// public static boolean playExtraHorseSounds() { return net.minecraft.entity.passive.AbstractHorseEntity.playExtraHorseSounds; }
// public static void playExtraHorseSounds(boolean value, ) { net.minecraft.entity.passive.AbstractHorseEntity.playExtraHorseSounds = value; }

// public float eatingAnimationProgress() { return wrapperContained.eatingAnimationProgress; }
// public void eatingAnimationProgress(float value) { wrapperContained.eatingAnimationProgress = value; }
// public static float eatingAnimationProgress() { return net.minecraft.entity.passive.AbstractHorseEntity.eatingAnimationProgress; }
// public static void eatingAnimationProgress(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.eatingAnimationProgress = value; }

// public float lastEatingGrassAnimationProgress() { return wrapperContained.lastEatingGrassAnimationProgress; }
// public void lastEatingGrassAnimationProgress(float value) { wrapperContained.lastEatingGrassAnimationProgress = value; }
// public static float lastEatingGrassAnimationProgress() { return net.minecraft.entity.passive.AbstractHorseEntity.lastEatingGrassAnimationProgress; }
// public static void lastEatingGrassAnimationProgress(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.lastEatingGrassAnimationProgress = value; }

// public float angryAnimationProgress() { return wrapperContained.angryAnimationProgress; }
// public void angryAnimationProgress(float value) { wrapperContained.angryAnimationProgress = value; }
// public static float angryAnimationProgress() { return net.minecraft.entity.passive.AbstractHorseEntity.angryAnimationProgress; }
// public static void angryAnimationProgress(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.angryAnimationProgress = value; }

// public float eatingGrassAnimationProgress() { return wrapperContained.eatingGrassAnimationProgress; }
// public void eatingGrassAnimationProgress(float value) { wrapperContained.eatingGrassAnimationProgress = value; }
// public static float eatingGrassAnimationProgress() { return net.minecraft.entity.passive.AbstractHorseEntity.eatingGrassAnimationProgress; }
// public static void eatingGrassAnimationProgress(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.eatingGrassAnimationProgress = value; }

// public int angryTicks() { return wrapperContained.angryTicks; }
// public void angryTicks(int value) { wrapperContained.angryTicks = value; }
// public static int angryTicks() { return net.minecraft.entity.passive.AbstractHorseEntity.angryTicks; }
// public static void angryTicks(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.angryTicks = value; }

// public int eatingGrassTicks() { return wrapperContained.eatingGrassTicks; }
// public void eatingGrassTicks(int value) { wrapperContained.eatingGrassTicks = value; }
// public static int eatingGrassTicks() { return net.minecraft.entity.passive.AbstractHorseEntity.eatingGrassTicks; }
// public static void eatingGrassTicks(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.eatingGrassTicks = value; }

// public int eatingTicks() { return wrapperContained.eatingTicks; }
// public void eatingTicks(int value) { wrapperContained.eatingTicks = value; }
// public static int eatingTicks() { return net.minecraft.entity.passive.AbstractHorseEntity.eatingTicks; }
// public static void eatingTicks(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.eatingTicks = value; }

// public int soundTicks() { return wrapperContained.soundTicks; }
// public void soundTicks(int value) { wrapperContained.soundTicks = value; }
// public static int soundTicks() { return net.minecraft.entity.passive.AbstractHorseEntity.soundTicks; }
// public static void soundTicks(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.soundTicks = value; }

// public float jumpStrength() { return wrapperContained.jumpStrength; }
// public void jumpStrength(float value) { wrapperContained.jumpStrength = value; }
// public static float jumpStrength() { return net.minecraft.entity.passive.AbstractHorseEntity.jumpStrength; }
// public static void jumpStrength(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.jumpStrength = value; }

// public yarnwrap.entity.ai.TargetPredicate PARENT_HORSE_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.PARENT_HORSE_PREDICATE); }
// public void PARENT_HORSE_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.PARENT_HORSE_PREDICATE = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate PARENT_HORSE_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.passive.AbstractHorseEntity.PARENT_HORSE_PREDICATE); }
// public static void PARENT_HORSE_PREDICATE(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.passive.AbstractHorseEntity.PARENT_HORSE_PREDICATE = value.wrapperContained; }

// public int TAMED_FLAG() { return wrapperContained.TAMED_FLAG; }
// public void TAMED_FLAG(int value) { wrapperContained.TAMED_FLAG = value; }
// public static int TAMED_FLAG() { return net.minecraft.entity.passive.AbstractHorseEntity.TAMED_FLAG; }
// public static void TAMED_FLAG(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.TAMED_FLAG = value; }

// public int BRED_FLAG() { return wrapperContained.BRED_FLAG; }
// public void BRED_FLAG(int value) { wrapperContained.BRED_FLAG = value; }
// public static int BRED_FLAG() { return net.minecraft.entity.passive.AbstractHorseEntity.BRED_FLAG; }
// public static void BRED_FLAG(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.BRED_FLAG = value; }

// public int EATING_GRASS_FLAG() { return wrapperContained.EATING_GRASS_FLAG; }
// public void EATING_GRASS_FLAG(int value) { wrapperContained.EATING_GRASS_FLAG = value; }
// public static int EATING_GRASS_FLAG() { return net.minecraft.entity.passive.AbstractHorseEntity.EATING_GRASS_FLAG; }
// public static void EATING_GRASS_FLAG(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.EATING_GRASS_FLAG = value; }

// public int ANGRY_FLAG() { return wrapperContained.ANGRY_FLAG; }
// public void ANGRY_FLAG(int value) { wrapperContained.ANGRY_FLAG = value; }
// public static int ANGRY_FLAG() { return net.minecraft.entity.passive.AbstractHorseEntity.ANGRY_FLAG; }
// public static void ANGRY_FLAG(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.ANGRY_FLAG = value; }

// public int EATING_FLAG() { return wrapperContained.EATING_FLAG; }
// public void EATING_FLAG(int value) { wrapperContained.EATING_FLAG = value; }
// public static int EATING_FLAG() { return net.minecraft.entity.passive.AbstractHorseEntity.EATING_FLAG; }
// public static void EATING_FLAG(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.EATING_FLAG = value; }

// public float MIN_MOVEMENT_SPEED_BONUS() { return wrapperContained.MIN_MOVEMENT_SPEED_BONUS; }
// public void MIN_MOVEMENT_SPEED_BONUS(float value) { wrapperContained.MIN_MOVEMENT_SPEED_BONUS = value; }
// public static float MIN_MOVEMENT_SPEED_BONUS() { return net.minecraft.entity.passive.AbstractHorseEntity.MIN_MOVEMENT_SPEED_BONUS; }
// public static void MIN_MOVEMENT_SPEED_BONUS(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.MIN_MOVEMENT_SPEED_BONUS = value; }

// public float MAX_MOVEMENT_SPEED_BONUS() { return wrapperContained.MAX_MOVEMENT_SPEED_BONUS; }
// public void MAX_MOVEMENT_SPEED_BONUS(float value) { wrapperContained.MAX_MOVEMENT_SPEED_BONUS = value; }
// public static float MAX_MOVEMENT_SPEED_BONUS() { return net.minecraft.entity.passive.AbstractHorseEntity.MAX_MOVEMENT_SPEED_BONUS; }
// public static void MAX_MOVEMENT_SPEED_BONUS(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.MAX_MOVEMENT_SPEED_BONUS = value; }

// public float MIN_JUMP_STRENGTH_BONUS() { return wrapperContained.MIN_JUMP_STRENGTH_BONUS; }
// public void MIN_JUMP_STRENGTH_BONUS(float value) { wrapperContained.MIN_JUMP_STRENGTH_BONUS = value; }
// public static float MIN_JUMP_STRENGTH_BONUS() { return net.minecraft.entity.passive.AbstractHorseEntity.MIN_JUMP_STRENGTH_BONUS; }
// public static void MIN_JUMP_STRENGTH_BONUS(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.MIN_JUMP_STRENGTH_BONUS = value; }

// public float MAX_JUMP_STRENGTH_BONUS() { return wrapperContained.MAX_JUMP_STRENGTH_BONUS; }
// public void MAX_JUMP_STRENGTH_BONUS(float value) { wrapperContained.MAX_JUMP_STRENGTH_BONUS = value; }
// public static float MAX_JUMP_STRENGTH_BONUS() { return net.minecraft.entity.passive.AbstractHorseEntity.MAX_JUMP_STRENGTH_BONUS; }
// public static void MAX_JUMP_STRENGTH_BONUS(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.MAX_JUMP_STRENGTH_BONUS = value; }

// public float MIN_HEALTH_BONUS() { return wrapperContained.MIN_HEALTH_BONUS; }
// public void MIN_HEALTH_BONUS(float value) { wrapperContained.MIN_HEALTH_BONUS = value; }
// public static float MIN_HEALTH_BONUS() { return net.minecraft.entity.passive.AbstractHorseEntity.MIN_HEALTH_BONUS; }
// public static void MIN_HEALTH_BONUS(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.MIN_HEALTH_BONUS = value; }

// public float MAX_HEALTH_BONUS() { return wrapperContained.MAX_HEALTH_BONUS; }
// public void MAX_HEALTH_BONUS(float value) { wrapperContained.MAX_HEALTH_BONUS = value; }
// public static float MAX_HEALTH_BONUS() { return net.minecraft.entity.passive.AbstractHorseEntity.MAX_HEALTH_BONUS; }
// public static void MAX_HEALTH_BONUS(float value, ) { net.minecraft.entity.passive.AbstractHorseEntity.MAX_HEALTH_BONUS = value; }

// public yarnwrap.entity.LazyEntityReference ownerReference() { return new yarnwrap.entity.LazyEntityReference(wrapperContained.ownerReference); }
// public void ownerReference(yarnwrap.entity.LazyEntityReference value) { wrapperContained.ownerReference = value.wrapperContained; }
// public static yarnwrap.entity.LazyEntityReference ownerReference() { return new yarnwrap.entity.LazyEntityReference(net.minecraft.entity.passive.AbstractHorseEntity.ownerReference); }
// public static void ownerReference(yarnwrap.entity.LazyEntityReference value, ) { net.minecraft.entity.passive.AbstractHorseEntity.ownerReference = value.wrapperContained; }

// public int DEFAULT_TEMPER() { return wrapperContained.DEFAULT_TEMPER; }
// public void DEFAULT_TEMPER(int value) { wrapperContained.DEFAULT_TEMPER = value; }
// public static int DEFAULT_TEMPER() { return net.minecraft.entity.passive.AbstractHorseEntity.DEFAULT_TEMPER; }
// public static void DEFAULT_TEMPER(int value, ) { net.minecraft.entity.passive.AbstractHorseEntity.DEFAULT_TEMPER = value; }

// public boolean DEFAULT_EATING_GRASS() { return wrapperContained.DEFAULT_EATING_GRASS; }
// public void DEFAULT_EATING_GRASS(boolean value) { wrapperContained.DEFAULT_EATING_GRASS = value; }
// public static boolean DEFAULT_EATING_GRASS() { return net.minecraft.entity.passive.AbstractHorseEntity.DEFAULT_EATING_GRASS; }
// public static void DEFAULT_EATING_GRASS(boolean value, ) { net.minecraft.entity.passive.AbstractHorseEntity.DEFAULT_EATING_GRASS = value; }

// public boolean DEFAULT_BRED() { return wrapperContained.DEFAULT_BRED; }
// public void DEFAULT_BRED(boolean value) { wrapperContained.DEFAULT_BRED = value; }
// public static boolean DEFAULT_BRED() { return net.minecraft.entity.passive.AbstractHorseEntity.DEFAULT_BRED; }
// public static void DEFAULT_BRED(boolean value, ) { net.minecraft.entity.passive.AbstractHorseEntity.DEFAULT_BRED = value; }

// public boolean DEFAULT_TAME() { return wrapperContained.DEFAULT_TAME; }
// public void DEFAULT_TAME(boolean value) { wrapperContained.DEFAULT_TAME = value; }
// public static boolean DEFAULT_TAME() { return net.minecraft.entity.passive.AbstractHorseEntity.DEFAULT_TAME; }
// public static void DEFAULT_TAME(boolean value, ) { net.minecraft.entity.passive.AbstractHorseEntity.DEFAULT_TAME = value; }

// public void initAttributes(yarnwrap.util.math.random.Random random) { wrapperContained.initAttributes(random.wrapperContained); }
// public static void initAttributes(yarnwrap.util.math.random.Random random, ) { net.minecraft.entity.passive.AbstractHorseEntity.initAttributes(random.wrapperContained); }
public int getInventoryColumns() { return wrapperContained.getInventoryColumns(); }
// public static int getInventoryColumns() { return net.minecraft.entity.passive.AbstractHorseEntity.getInventoryColumns(); }
// public void onChestedStatusChanged() { wrapperContained.onChestedStatusChanged(); }
// public static void onChestedStatusChanged() { net.minecraft.entity.passive.AbstractHorseEntity.onChestedStatusChanged(); }
// public void playJumpSound() { wrapperContained.playJumpSound(); }
// public static void playJumpSound() { net.minecraft.entity.passive.AbstractHorseEntity.playJumpSound(); }
public boolean isEatingGrass() { return wrapperContained.isEatingGrass(); }
// public static boolean isEatingGrass() { return net.minecraft.entity.passive.AbstractHorseEntity.isEatingGrass(); }
// public void putPlayerOnBack(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.putPlayerOnBack(player.wrapperContained); }
// public static void putPlayerOnBack(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.passive.AbstractHorseEntity.putPlayerOnBack(player.wrapperContained); }
public boolean isTame() { return wrapperContained.isTame(); }
// public static boolean isTame() { return net.minecraft.entity.passive.AbstractHorseEntity.isTame(); }
// public double getChildMovementSpeedBonus(java.util.function.DoubleSupplier randomDoubleGetter) { return wrapperContained.getChildMovementSpeedBonus(randomDoubleGetter); }
// public static double getChildMovementSpeedBonus(java.util.function.DoubleSupplier randomDoubleGetter, ) { return net.minecraft.entity.passive.AbstractHorseEntity.getChildMovementSpeedBonus(randomDoubleGetter); }
public int getTemper() { return wrapperContained.getTemper(); }
// public static int getTemper() { return net.minecraft.entity.passive.AbstractHorseEntity.getTemper(); }
// public boolean getHorseFlag(int bitmask) { return wrapperContained.getHorseFlag(bitmask); }
// public static boolean getHorseFlag(int bitmask, ) { return net.minecraft.entity.passive.AbstractHorseEntity.getHorseFlag(bitmask); }
// public void playEatingAnimation() { wrapperContained.playEatingAnimation(); }
// public static void playEatingAnimation() { net.minecraft.entity.passive.AbstractHorseEntity.playEatingAnimation(); }
// public boolean canBreed() { return wrapperContained.canBreed(); }
// public static boolean canBreed() { return net.minecraft.entity.passive.AbstractHorseEntity.canBreed(); }
public boolean isAngry() { return wrapperContained.isAngry(); }
// public static boolean isAngry() { return net.minecraft.entity.passive.AbstractHorseEntity.isAngry(); }
// public void setAngry(int ticks) { wrapperContained.setAngry(ticks); }
// public static void setAngry(int ticks, ) { net.minecraft.entity.passive.AbstractHorseEntity.setAngry(ticks); }
// public void setEating() { wrapperContained.setEating(); }
// public static void setEating() { net.minecraft.entity.passive.AbstractHorseEntity.setEating(); }
public float getEatingGrassAnimationProgress(float tickProgress) { return wrapperContained.getEatingGrassAnimationProgress(tickProgress); }
// public static float getEatingGrassAnimationProgress(float tickProgress, ) { return net.minecraft.entity.passive.AbstractHorseEntity.getEatingGrassAnimationProgress(tickProgress); }
public void setEatingGrass(boolean eatingGrass) { wrapperContained.setEatingGrass(eatingGrass); }
// public static void setEatingGrass(boolean eatingGrass, ) { net.minecraft.entity.passive.AbstractHorseEntity.setEatingGrass(eatingGrass); }
// public boolean method_6741(yarnwrap.entity.LivingEntity entity,yarnwrap.server.world.ServerWorld world) { return wrapperContained.method_6741(entity.wrapperContained,world.wrapperContained); }
// public static boolean method_6741(yarnwrap.entity.LivingEntity entity,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.entity.passive.AbstractHorseEntity.method_6741(entity.wrapperContained,world.wrapperContained); }
// public boolean receiveFood(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack item) { return wrapperContained.receiveFood(player.wrapperContained,item.wrapperContained); }
// public static boolean receiveFood(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack item, ) { return net.minecraft.entity.passive.AbstractHorseEntity.receiveFood(player.wrapperContained,item.wrapperContained); }
// public void setChildAttributes(yarnwrap.entity.passive.PassiveEntity other,yarnwrap.entity.passive.AbstractHorseEntity child) { wrapperContained.setChildAttributes(other.wrapperContained,child.wrapperContained); }
// public static void setChildAttributes(yarnwrap.entity.passive.PassiveEntity other,yarnwrap.entity.passive.AbstractHorseEntity child, ) { net.minecraft.entity.passive.AbstractHorseEntity.setChildAttributes(other.wrapperContained,child.wrapperContained); }
public boolean isBred() { return wrapperContained.isBred(); }
// public static boolean isBred() { return net.minecraft.entity.passive.AbstractHorseEntity.isBred(); }
public int addTemper(int difference) { return wrapperContained.addTemper(difference); }
// public static int addTemper(int difference, ) { return net.minecraft.entity.passive.AbstractHorseEntity.addTemper(difference); }
// public void walkToParent(yarnwrap.server.world.ServerWorld world) { wrapperContained.walkToParent(world.wrapperContained); }
// public static void walkToParent(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.passive.AbstractHorseEntity.walkToParent(world.wrapperContained); }
// public yarnwrap.sound.SoundEvent getAngrySound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getAngrySound()); }
// public static yarnwrap.sound.SoundEvent getAngrySound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.AbstractHorseEntity.getAngrySound()); }
public void updateAnger() { wrapperContained.updateAnger(); }
// public static void updateAnger() { net.minecraft.entity.passive.AbstractHorseEntity.updateAnger(); }
public void setTemper(int temper) { wrapperContained.setTemper(temper); }
// public static void setTemper(int temper, ) { net.minecraft.entity.passive.AbstractHorseEntity.setTemper(temper); }
public int getInventorySize() { return wrapperContained.getInventorySize(); }
// public static int getInventorySize() { return net.minecraft.entity.passive.AbstractHorseEntity.getInventorySize(); }
public void setBred(boolean bred) { wrapperContained.setBred(bred); }
// public static void setBred(boolean bred, ) { net.minecraft.entity.passive.AbstractHorseEntity.setBred(bred); }
public boolean bondWithPlayer(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.bondWithPlayer(player.wrapperContained); }
// public static boolean bondWithPlayer(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.passive.AbstractHorseEntity.bondWithPlayer(player.wrapperContained); }
// public float getChildHealthBonus(java.util.function.IntUnaryOperator randomIntGetter) { return wrapperContained.getChildHealthBonus(randomIntGetter); }
// public static float getChildHealthBonus(java.util.function.IntUnaryOperator randomIntGetter, ) { return net.minecraft.entity.passive.AbstractHorseEntity.getChildHealthBonus(randomIntGetter); }
public int getMaxTemper() { return wrapperContained.getMaxTemper(); }
// public static int getMaxTemper() { return net.minecraft.entity.passive.AbstractHorseEntity.getMaxTemper(); }
public void playAngrySound() { wrapperContained.playAngrySound(); }
// public static void playAngrySound() { net.minecraft.entity.passive.AbstractHorseEntity.playAngrySound(); }
// public void wagTail() { wrapperContained.wagTail(); }
// public static void wagTail() { net.minecraft.entity.passive.AbstractHorseEntity.wagTail(); }
// public void spawnPlayerReactionParticles(boolean positive) { wrapperContained.spawnPlayerReactionParticles(positive); }
// public static void spawnPlayerReactionParticles(boolean positive, ) { net.minecraft.entity.passive.AbstractHorseEntity.spawnPlayerReactionParticles(positive); }
// public void playWalkSound(yarnwrap.sound.BlockSoundGroup group) { wrapperContained.playWalkSound(group.wrapperContained); }
// public static void playWalkSound(yarnwrap.sound.BlockSoundGroup group, ) { net.minecraft.entity.passive.AbstractHorseEntity.playWalkSound(group.wrapperContained); }
public boolean eatsGrass() { return wrapperContained.eatsGrass(); }
// public static boolean eatsGrass() { return net.minecraft.entity.passive.AbstractHorseEntity.eatsGrass(); }
// public void initCustomGoals() { wrapperContained.initCustomGoals(); }
// public static void initCustomGoals() { net.minecraft.entity.passive.AbstractHorseEntity.initCustomGoals(); }
public void setTame(boolean tame) { wrapperContained.setTame(tame); }
// public static void setTame(boolean tame, ) { net.minecraft.entity.passive.AbstractHorseEntity.setTame(tame); }
public float getAngryAnimationProgress(float tickProgress) { return wrapperContained.getAngryAnimationProgress(tickProgress); }
// public static float getAngryAnimationProgress(float tickProgress, ) { return net.minecraft.entity.passive.AbstractHorseEntity.getAngryAnimationProgress(tickProgress); }
// public void setHorseFlag(int bitmask,boolean flag) { wrapperContained.setHorseFlag(bitmask,flag); }
// public static void setHorseFlag(int bitmask,boolean flag, ) { net.minecraft.entity.passive.AbstractHorseEntity.setHorseFlag(bitmask,flag); }
public float getEatingAnimationProgress(float tickProgress) { return wrapperContained.getEatingAnimationProgress(tickProgress); }
// public static float getEatingAnimationProgress(float tickProgress, ) { return net.minecraft.entity.passive.AbstractHorseEntity.getEatingAnimationProgress(tickProgress); }
// public double getChildJumpStrengthBonus(java.util.function.DoubleSupplier randomDoubleGetter) { return wrapperContained.getChildJumpStrengthBonus(randomDoubleGetter); }
// public static double getChildJumpStrengthBonus(java.util.function.DoubleSupplier randomDoubleGetter, ) { return net.minecraft.entity.passive.AbstractHorseEntity.getChildJumpStrengthBonus(randomDoubleGetter); }
// public Object createBaseHorseAttributes() { return wrapperContained.createBaseHorseAttributes(); }
public static Object createBaseHorseAttributes() { return net.minecraft.entity.passive.AbstractHorseEntity.createBaseHorseAttributes(); }
// public yarnwrap.util.math.Vec3d locateSafeDismountingPos(yarnwrap.util.math.Vec3d offset,yarnwrap.entity.LivingEntity passenger) { return new yarnwrap.util.math.Vec3d(wrapperContained.locateSafeDismountingPos(offset.wrapperContained,passenger.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d locateSafeDismountingPos(yarnwrap.util.math.Vec3d offset,yarnwrap.entity.LivingEntity passenger, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.passive.AbstractHorseEntity.locateSafeDismountingPos(offset.wrapperContained,passenger.wrapperContained)); }
// public yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getEatSound()); }
// public static yarnwrap.sound.SoundEvent getEatSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.AbstractHorseEntity.getEatSound()); }
public yarnwrap.util.ActionResult interactHorse(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { return new yarnwrap.util.ActionResult(wrapperContained.interactHorse(player.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactHorse(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.util.ActionResult(net.minecraft.entity.passive.AbstractHorseEntity.interactHorse(player.wrapperContained,stack.wrapperContained)); }
public boolean areInventoriesDifferent(yarnwrap.inventory.Inventory inventory) { return wrapperContained.areInventoriesDifferent(inventory.wrapperContained); }
// public static boolean areInventoriesDifferent(yarnwrap.inventory.Inventory inventory, ) { return net.minecraft.entity.passive.AbstractHorseEntity.areInventoriesDifferent(inventory.wrapperContained); }
// public void jump(float strength,yarnwrap.util.math.Vec3d movementInput) { wrapperContained.jump(strength,movementInput.wrapperContained); }
// public static void jump(float strength,yarnwrap.util.math.Vec3d movementInput, ) { net.minecraft.entity.passive.AbstractHorseEntity.jump(strength,movementInput.wrapperContained); }
// public boolean shouldAmbientStand() { return wrapperContained.shouldAmbientStand(); }
// public static boolean shouldAmbientStand() { return net.minecraft.entity.passive.AbstractHorseEntity.shouldAmbientStand(); }
public void equipHorseArmor(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.equipHorseArmor(player.wrapperContained,stack.wrapperContained); }
// public static void equipHorseArmor(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.passive.AbstractHorseEntity.equipHorseArmor(player.wrapperContained,stack.wrapperContained); }
public yarnwrap.sound.SoundEvent getAmbientStandSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getAmbientStandSound()); }
// public static yarnwrap.sound.SoundEvent getAmbientStandSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.AbstractHorseEntity.getAmbientStandSound()); }
public int getMinAmbientStandDelay() { return wrapperContained.getMinAmbientStandDelay(); }
// public static int getMinAmbientStandDelay() { return net.minecraft.entity.passive.AbstractHorseEntity.getMinAmbientStandDelay(); }
// public double calculateAttributeBaseValue(double parentBase,double otherParentBase,double min,double max,yarnwrap.util.math.random.Random random) { return wrapperContained.calculateAttributeBaseValue(parentBase,otherParentBase,min,max,random.wrapperContained); }
// public static double calculateAttributeBaseValue(double parentBase,double otherParentBase,double min,double max,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.AbstractHorseEntity.calculateAttributeBaseValue(parentBase,otherParentBase,min,max,random.wrapperContained); }
// public void setChildAttribute(yarnwrap.entity.passive.PassiveEntity other,yarnwrap.entity.passive.AbstractHorseEntity child,yarnwrap.registry.entry.RegistryEntry attribute,double min,double max) { wrapperContained.setChildAttribute(other.wrapperContained,child.wrapperContained,attribute.wrapperContained,min,max); }
// public static void setChildAttribute(yarnwrap.entity.passive.PassiveEntity other,yarnwrap.entity.passive.AbstractHorseEntity child,yarnwrap.registry.entry.RegistryEntry attribute,double min,double max, ) { net.minecraft.entity.passive.AbstractHorseEntity.setChildAttribute(other.wrapperContained,child.wrapperContained,attribute.wrapperContained,min,max); }
// public int method_49129(int max) { return wrapperContained.method_49129(max); }
// public static int method_49129(int max, ) { return net.minecraft.entity.passive.AbstractHorseEntity.method_49129(max); }
// public int method_49130(int max) { return wrapperContained.method_49130(max); }
// public static int method_49130(int max, ) { return net.minecraft.entity.passive.AbstractHorseEntity.method_49130(max); }
// public yarnwrap.util.math.Vec2f getControlledRotation(yarnwrap.entity.LivingEntity controllingPassenger) { return new yarnwrap.util.math.Vec2f(wrapperContained.getControlledRotation(controllingPassenger.wrapperContained)); }
// public static yarnwrap.util.math.Vec2f getControlledRotation(yarnwrap.entity.LivingEntity controllingPassenger, ) { return new yarnwrap.util.math.Vec2f(net.minecraft.entity.passive.AbstractHorseEntity.getControlledRotation(controllingPassenger.wrapperContained)); }
// public boolean isWooden(yarnwrap.sound.BlockSoundGroup soundGroup) { return wrapperContained.isWooden(soundGroup.wrapperContained); }
// public static boolean isWooden(yarnwrap.sound.BlockSoundGroup soundGroup, ) { return net.minecraft.entity.passive.AbstractHorseEntity.isWooden(soundGroup.wrapperContained); }
// public boolean method_58392(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58392(stack.wrapperContained); }
// public static boolean method_58392(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.AbstractHorseEntity.method_58392(stack.wrapperContained); }
// public int getInventorySize(int columns) { return wrapperContained.getInventorySize(columns); }
// public static int getInventorySize(int columns, ) { return net.minecraft.entity.passive.AbstractHorseEntity.getInventorySize(columns); }
public void setOwner(yarnwrap.entity.LivingEntity entity) { wrapperContained.setOwner(entity.wrapperContained); }
// public static void setOwner(yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.passive.AbstractHorseEntity.setOwner(entity.wrapperContained); }
// public void setNotAngry() { wrapperContained.setNotAngry(); }
// public static void setNotAngry() { net.minecraft.entity.passive.AbstractHorseEntity.setNotAngry(); }

}