package yarnwrap.entity;
public class LivingEntity { public net.minecraft.entity.LivingEntity wrapperContained; public LivingEntity(net.minecraft.entity.LivingEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions SLEEPING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.SLEEPING_DIMENSIONS); }
// public void SLEEPING_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.SLEEPING_DIMENSIONS = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData SLEEPING_POSITION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SLEEPING_POSITION); }
// public void SLEEPING_POSITION(yarnwrap.entity.data.TrackedData value) { wrapperContained.SLEEPING_POSITION = value.wrapperContained; }
// public yarnwrap.entity.ai.brain.Brain brain() { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.brain); }
// public void brain(yarnwrap.entity.ai.brain.Brain value) { wrapperContained.brain = value.wrapperContained; }
public int stuckStingerTimer() { return wrapperContained.stuckStingerTimer; }
public void stuckStingerTimer(int value) { wrapperContained.stuckStingerTimer = value; }
// public yarnwrap.entity.data.TrackedData STINGER_COUNT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STINGER_COUNT); }
// public void STINGER_COUNT(yarnwrap.entity.data.TrackedData value) { wrapperContained.STINGER_COUNT = value.wrapperContained; }
// public java.util.Optional climbingPos() { return wrapperContained.climbingPos; }
// public void climbingPos(java.util.Optional value) { wrapperContained.climbingPos = value; }
// public yarnwrap.util.Identifier POWDER_SNOW_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.POWDER_SNOW_SPEED_MODIFIER_ID); }
// public void POWDER_SNOW_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.POWDER_SNOW_SPEED_MODIFIER_ID = value.wrapperContained; }
// public int USING_ITEM_FLAG() { return wrapperContained.USING_ITEM_FLAG; }
// public void USING_ITEM_FLAG(int value) { wrapperContained.USING_ITEM_FLAG = value; }
// public int OFF_HAND_ACTIVE_FLAG() { return wrapperContained.OFF_HAND_ACTIVE_FLAG; }
// public void OFF_HAND_ACTIVE_FLAG(int value) { wrapperContained.OFF_HAND_ACTIVE_FLAG = value; }
// public int USING_RIPTIDE_FLAG() { return wrapperContained.USING_RIPTIDE_FLAG; }
// public void USING_RIPTIDE_FLAG(int value) { wrapperContained.USING_RIPTIDE_FLAG = value; }
public float BABY_SCALE_FACTOR() { return wrapperContained.BABY_SCALE_FACTOR; }
// public void BABY_SCALE_FACTOR(float value) { wrapperContained.BABY_SCALE_FACTOR = value; }
public int EQUIPMENT_SLOT_ID() { return wrapperContained.EQUIPMENT_SLOT_ID; }
// public void EQUIPMENT_SLOT_ID(int value) { wrapperContained.EQUIPMENT_SLOT_ID = value; }
public int GLOWING_FLAG() { return wrapperContained.GLOWING_FLAG; }
// public void GLOWING_FLAG(int value) { wrapperContained.GLOWING_FLAG = value; }
public double GRAVITY() { return wrapperContained.GRAVITY; }
// public void GRAVITY(double value) { wrapperContained.GRAVITY = value; }
public int DEATH_TICKS() { return wrapperContained.DEATH_TICKS; }
// public void DEATH_TICKS(int value) { wrapperContained.DEATH_TICKS = value; }
// public boolean noDrag() { return wrapperContained.noDrag; }
// public void noDrag(boolean value) { wrapperContained.noDrag = value; }
// public double MAX_ENTITY_VIEWING_DISTANCE() { return wrapperContained.MAX_ENTITY_VIEWING_DISTANCE; }
// public void MAX_ENTITY_VIEWING_DISTANCE(double value) { wrapperContained.MAX_ENTITY_VIEWING_DISTANCE = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean experienceDroppingDisabled() { return wrapperContained.experienceDroppingDisabled; }
// public void experienceDroppingDisabled(boolean value) { wrapperContained.experienceDroppingDisabled = value; }
public yarnwrap.entity.LimbAnimator limbAnimator() { return new yarnwrap.entity.LimbAnimator(wrapperContained.limbAnimator); }
// public void limbAnimator(yarnwrap.entity.LimbAnimator value) { wrapperContained.limbAnimator = value.wrapperContained; }
// public double serverHeadYaw() { return wrapperContained.serverHeadYaw; }
// public void serverHeadYaw(double value) { wrapperContained.serverHeadYaw = value; }
// public java.lang.String ACTIVE_EFFECTS_NBT_KEY() { return wrapperContained.ACTIVE_EFFECTS_NBT_KEY; }
// public void ACTIVE_EFFECTS_NBT_KEY(java.lang.String value) { wrapperContained.ACTIVE_EFFECTS_NBT_KEY = value; }
// public float prevScale() { return wrapperContained.prevScale; }
// public void prevScale(float value) { wrapperContained.prevScale = value; }
// public yarnwrap.item.ItemStack syncedBodyArmorStack() { return new yarnwrap.item.ItemStack(wrapperContained.syncedBodyArmorStack); }
// public void syncedBodyArmorStack(yarnwrap.item.ItemStack value) { wrapperContained.syncedBodyArmorStack = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData POTION_SWIRLS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.POTION_SWIRLS); }
// public void POTION_SWIRLS(yarnwrap.entity.data.TrackedData value) { wrapperContained.POTION_SWIRLS = value.wrapperContained; }
// public float riptideAttackDamage() { return wrapperContained.riptideAttackDamage; }
// public void riptideAttackDamage(float value) { wrapperContained.riptideAttackDamage = value; }
// public yarnwrap.item.ItemStack riptideStack() { return new yarnwrap.item.ItemStack(wrapperContained.riptideStack); }
// public void riptideStack(yarnwrap.item.ItemStack value) { wrapperContained.riptideStack = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Reference2ObjectMap locationBasedEnchantmentEffects() { return wrapperContained.locationBasedEnchantmentEffects; }
// public void locationBasedEnchantmentEffects(it.unimi.dsi.fastutil.objects.Reference2ObjectMap value) { wrapperContained.locationBasedEnchantmentEffects = value; }
public java.lang.String ATTRIBUTES_NBT_KEY() { return wrapperContained.ATTRIBUTES_NBT_KEY; }
// public void ATTRIBUTES_NBT_KEY(java.lang.String value) { wrapperContained.ATTRIBUTES_NBT_KEY = value; }
// public yarnwrap.util.Identifier SPRINTING_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.SPRINTING_SPEED_MODIFIER_ID); }
// public void SPRINTING_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.SPRINTING_SPEED_MODIFIER_ID = value.wrapperContained; }
// public int bodyTrackingIncrements() { return wrapperContained.bodyTrackingIncrements; }
// public void bodyTrackingIncrements(int value) { wrapperContained.bodyTrackingIncrements = value; }
public float sidewaysSpeed() { return wrapperContained.sidewaysSpeed; }
public void sidewaysSpeed(float value) { wrapperContained.sidewaysSpeed = value; }
public int deathTime() { return wrapperContained.deathTime; }
public void deathTime(int value) { wrapperContained.deathTime = value; }
// public yarnwrap.entity.data.TrackedData POTION_SWIRLS_AMBIENT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.POTION_SWIRLS_AMBIENT); }
// public void POTION_SWIRLS_AMBIENT(yarnwrap.entity.data.TrackedData value) { wrapperContained.POTION_SWIRLS_AMBIENT = value.wrapperContained; }
// public float prevStepBobbingAmount() { return wrapperContained.prevStepBobbingAmount; }
// public void prevStepBobbingAmount(float value) { wrapperContained.prevStepBobbingAmount = value; }
public int stuckArrowTimer() { return wrapperContained.stuckArrowTimer; }
public void stuckArrowTimer(int value) { wrapperContained.stuckArrowTimer = value; }
// public yarnwrap.entity.data.TrackedData STUCK_ARROW_COUNT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STUCK_ARROW_COUNT); }
// public void STUCK_ARROW_COUNT(yarnwrap.entity.data.TrackedData value) { wrapperContained.STUCK_ARROW_COUNT = value.wrapperContained; }
public float prevBodyYaw() { return wrapperContained.prevBodyYaw; }
public void prevBodyYaw(float value) { wrapperContained.prevBodyYaw = value; }
// public double serverPitch() { return wrapperContained.serverPitch; }
// public void serverPitch(double value) { wrapperContained.serverPitch = value; }
// public int itemUseTimeLeft() { return wrapperContained.itemUseTimeLeft; }
// public void itemUseTimeLeft(int value) { wrapperContained.itemUseTimeLeft = value; }
// public double serverX() { return wrapperContained.serverX; }
// public void serverX(double value) { wrapperContained.serverX = value; }
// public long lastDamageTime() { return wrapperContained.lastDamageTime; }
// public void lastDamageTime(long value) { wrapperContained.lastDamageTime = value; }
public float upwardSpeed() { return wrapperContained.upwardSpeed; }
public void upwardSpeed(float value) { wrapperContained.upwardSpeed = value; }
// public int jumpingCooldown() { return wrapperContained.jumpingCooldown; }
// public void jumpingCooldown(int value) { wrapperContained.jumpingCooldown = value; }
public float lastHandSwingProgress() { return wrapperContained.lastHandSwingProgress; }
public void lastHandSwingProgress(float value) { wrapperContained.lastHandSwingProgress = value; }
// public int lastAttackedTime() { return wrapperContained.lastAttackedTime; }
// public void lastAttackedTime(int value) { wrapperContained.lastAttackedTime = value; }
// public yarnwrap.entity.attribute.EntityAttributeModifier SPRINTING_SPEED_BOOST() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.SPRINTING_SPEED_BOOST); }
// public void SPRINTING_SPEED_BOOST(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.SPRINTING_SPEED_BOOST = value.wrapperContained; }
// public int scoreAmount() { return wrapperContained.scoreAmount; }
// public void scoreAmount(int value) { wrapperContained.scoreAmount = value; }
// public float stepBobbingAmount() { return wrapperContained.stepBobbingAmount; }
// public void stepBobbingAmount(float value) { wrapperContained.stepBobbingAmount = value; }
// public yarnwrap.util.collection.DefaultedList syncedHandStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.syncedHandStacks); }
// public void syncedHandStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.syncedHandStacks = value.wrapperContained; }
public int hurtTime() { return wrapperContained.hurtTime; }
public void hurtTime(int value) { wrapperContained.hurtTime = value; }
// public yarnwrap.entity.LivingEntity attacking() { return new yarnwrap.entity.LivingEntity(wrapperContained.attacking); }
// public void attacking(yarnwrap.entity.LivingEntity value) { wrapperContained.attacking = value.wrapperContained; }
// public int playerHitTimer() { return wrapperContained.playerHitTimer; }
// public void playerHitTimer(int value) { wrapperContained.playerHitTimer = value; }
// public int fallFlyingTicks() { return wrapperContained.fallFlyingTicks; }
// public void fallFlyingTicks(int value) { wrapperContained.fallFlyingTicks = value; }
public float headYaw() { return wrapperContained.headYaw; }
public void headYaw(float value) { wrapperContained.headYaw = value; }
// public float leaningPitch() { return wrapperContained.leaningPitch; }
// public void leaningPitch(float value) { wrapperContained.leaningPitch = value; }
public float randomLargeSeed() { return wrapperContained.randomLargeSeed; }
// public void randomLargeSeed(float value) { wrapperContained.randomLargeSeed = value; }
// public double serverY() { return wrapperContained.serverY; }
// public void serverY(double value) { wrapperContained.serverY = value; }
// public float absorptionAmount() { return wrapperContained.absorptionAmount; }
// public void absorptionAmount(float value) { wrapperContained.absorptionAmount = value; }
// public yarnwrap.entity.data.TrackedData HEALTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HEALTH); }
// public void HEALTH(yarnwrap.entity.data.TrackedData value) { wrapperContained.HEALTH = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList syncedArmorStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.syncedArmorStacks); }
// public void syncedArmorStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.syncedArmorStacks = value.wrapperContained; }
public float forwardSpeed() { return wrapperContained.forwardSpeed; }
public void forwardSpeed(float value) { wrapperContained.forwardSpeed = value; }
public float handSwingProgress() { return wrapperContained.handSwingProgress; }
public void handSwingProgress(float value) { wrapperContained.handSwingProgress = value; }
public boolean handSwinging() { return wrapperContained.handSwinging; }
public void handSwinging(boolean value) { wrapperContained.handSwinging = value; }
// public float lastDamageTaken() { return wrapperContained.lastDamageTaken; }
// public void lastDamageTaken(float value) { wrapperContained.lastDamageTaken = value; }
public int maxHurtTime() { return wrapperContained.maxHurtTime; }
public void maxHurtTime(int value) { wrapperContained.maxHurtTime = value; }
// public float lookDirection() { return wrapperContained.lookDirection; }
// public void lookDirection(float value) { wrapperContained.lookDirection = value; }
// public yarnwrap.entity.damage.DamageTracker damageTracker() { return new yarnwrap.entity.damage.DamageTracker(wrapperContained.damageTracker); }
// public void damageTracker(yarnwrap.entity.damage.DamageTracker value) { wrapperContained.damageTracker = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData LIVING_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LIVING_FLAGS); }
// public void LIVING_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.LIVING_FLAGS = value.wrapperContained; }
// public yarnwrap.entity.player.PlayerEntity attackingPlayer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.attackingPlayer); }
// public void attackingPlayer(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.attackingPlayer = value.wrapperContained; }
public float prevHeadYaw() { return wrapperContained.prevHeadYaw; }
public void prevHeadYaw(float value) { wrapperContained.prevHeadYaw = value; }
// public yarnwrap.entity.attribute.AttributeContainer attributes() { return new yarnwrap.entity.attribute.AttributeContainer(wrapperContained.attributes); }
// public void attributes(yarnwrap.entity.attribute.AttributeContainer value) { wrapperContained.attributes = value.wrapperContained; }
// public int riptideTicks() { return wrapperContained.riptideTicks; }
// public void riptideTicks(int value) { wrapperContained.riptideTicks = value; }
public float randomSmallSeed() { return wrapperContained.randomSmallSeed; }
// public void randomSmallSeed(float value) { wrapperContained.randomSmallSeed = value; }
// public double serverZ() { return wrapperContained.serverZ; }
// public void serverZ(double value) { wrapperContained.serverZ = value; }
// public float lastLeaningPitch() { return wrapperContained.lastLeaningPitch; }
// public void lastLeaningPitch(float value) { wrapperContained.lastLeaningPitch = value; }
// public int headTrackingIncrements() { return wrapperContained.headTrackingIncrements; }
// public void headTrackingIncrements(int value) { wrapperContained.headTrackingIncrements = value; }
public yarnwrap.util.Hand preferredHand() { return new yarnwrap.util.Hand(wrapperContained.preferredHand); }
public void preferredHand(yarnwrap.util.Hand value) { wrapperContained.preferredHand = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos lastBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.lastBlockPos); }
// public void lastBlockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.lastBlockPos = value.wrapperContained; }
public int defaultMaxHealth() { return wrapperContained.defaultMaxHealth; }
// public void defaultMaxHealth(int value) { wrapperContained.defaultMaxHealth = value; }
// public int lastAttackTime() { return wrapperContained.lastAttackTime; }
// public void lastAttackTime(int value) { wrapperContained.lastAttackTime = value; }
// public boolean dead() { return wrapperContained.dead; }
// public void dead(boolean value) { wrapperContained.dead = value; }
// public int lastAttackedTicks() { return wrapperContained.lastAttackedTicks; }
// public void lastAttackedTicks(int value) { wrapperContained.lastAttackedTicks = value; }
// public yarnwrap.entity.LivingEntity attacker() { return new yarnwrap.entity.LivingEntity(wrapperContained.attacker); }
// public void attacker(yarnwrap.entity.LivingEntity value) { wrapperContained.attacker = value.wrapperContained; }
// public float prevLookDirection() { return wrapperContained.prevLookDirection; }
// public void prevLookDirection(float value) { wrapperContained.prevLookDirection = value; }
// public yarnwrap.entity.damage.DamageSource lastDamageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lastDamageSource); }
// public void lastDamageSource(yarnwrap.entity.damage.DamageSource value) { wrapperContained.lastDamageSource = value.wrapperContained; }
// public yarnwrap.item.ItemStack activeItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.activeItemStack); }
// public void activeItemStack(yarnwrap.item.ItemStack value) { wrapperContained.activeItemStack = value.wrapperContained; }
// public int despawnCounter() { return wrapperContained.despawnCounter; }
// public void despawnCounter(int value) { wrapperContained.despawnCounter = value; }
public int handSwingTicks() { return wrapperContained.handSwingTicks; }
public void handSwingTicks(int value) { wrapperContained.handSwingTicks = value; }
// public java.util.Map activeStatusEffects() { return wrapperContained.activeStatusEffects; }
// public void activeStatusEffects(java.util.Map value) { wrapperContained.activeStatusEffects = value; }
// public boolean jumping() { return wrapperContained.jumping; }
// public void jumping(boolean value) { wrapperContained.jumping = value; }
public float bodyYaw() { return wrapperContained.bodyYaw; }
public void bodyYaw(float value) { wrapperContained.bodyYaw = value; }
// public double serverYaw() { return wrapperContained.serverYaw; }
// public void serverYaw(double value) { wrapperContained.serverYaw = value; }
// public boolean effectsChanged() { return wrapperContained.effectsChanged; }
// public void effectsChanged(boolean value) { wrapperContained.effectsChanged = value; }
// public float movementSpeed() { return wrapperContained.movementSpeed; }
// public void movementSpeed(float value) { wrapperContained.movementSpeed = value; }
// public void dropLoot(yarnwrap.entity.damage.DamageSource damageSource,boolean causedByPlayer) { wrapperContained.dropLoot(damageSource.wrapperContained,causedByPlayer); }
// public void dropInventory() { wrapperContained.dropInventory(); }
// public void drop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.drop(world.wrapperContained,damageSource.wrapperContained); }
public void setDespawnCounter(int despawnCounter) { wrapperContained.setDespawnCounter(despawnCounter); }
public float getScaleFactor() { return wrapperContained.getScaleFactor(); }
public double getAttackDistanceScalingFactor(yarnwrap.entity.Entity entity) { return wrapperContained.getAttackDistanceScalingFactor(entity.wrapperContained); }
public boolean isTarget(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.ai.TargetPredicate predicate) { return wrapperContained.isTarget(entity.wrapperContained,predicate.wrapperContained); }
// public void setPositionInBed(yarnwrap.util.math.BlockPos pos) { wrapperContained.setPositionInBed(pos.wrapperContained); }
public boolean canTarget(yarnwrap.entity.LivingEntity target) { return wrapperContained.canTarget(target.wrapperContained); }
public float getArmorVisibility() { return wrapperContained.getArmorVisibility(); }
public boolean canEquip(yarnwrap.item.ItemStack stack) { return wrapperContained.canEquip(stack.wrapperContained); }
public java.util.Optional getSleepingPosition() { return wrapperContained.getSleepingPosition(); }
public void clearSleepingPosition() { wrapperContained.clearSleepingPosition(); }
public void wakeUp() { wrapperContained.wakeUp(); }
public yarnwrap.util.math.Direction getSleepingDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getSleepingDirection()); }
public void setSleepingPosition(yarnwrap.util.math.BlockPos pos) { wrapperContained.setSleepingPosition(pos.wrapperContained); }
public void sleep(yarnwrap.util.math.BlockPos pos) { wrapperContained.sleep(pos.wrapperContained); }
// public boolean isSleepingInBed() { return wrapperContained.isSleepingInBed(); }
// public yarnwrap.util.math.Vec3d applyClimbingSpeed(yarnwrap.util.math.Vec3d motion) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyClimbingSpeed(motion.wrapperContained)); }
// public float getMovementSpeed(float slipperiness) { return wrapperContained.getMovementSpeed(slipperiness); }
// public yarnwrap.sound.SoundEvent getDrinkSound(yarnwrap.item.ItemStack stack) { return new yarnwrap.sound.SoundEvent(wrapperContained.getDrinkSound(stack.wrapperContained)); }
public yarnwrap.item.ItemStack getProjectileType(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.getProjectileType(stack.wrapperContained)); }
// public void applyFoodEffects(yarnwrap.component.type.FoodComponent component) { wrapperContained.applyFoodEffects(component.wrapperContained); }
public yarnwrap.item.ItemStack eatFood(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.component.type.FoodComponent foodComponent) { return new yarnwrap.item.ItemStack(wrapperContained.eatFood(world.wrapperContained,stack.wrapperContained,foodComponent.wrapperContained)); }
// public yarnwrap.entity.ai.brain.Brain deserializeBrain(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.deserializeBrain(dynamic)); }
public yarnwrap.entity.ai.brain.Brain getBrain() { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.getBrain()); }
public yarnwrap.sound.SoundEvent getEatSound(yarnwrap.item.ItemStack stack) { return new yarnwrap.sound.SoundEvent(wrapperContained.getEatSound(stack.wrapperContained)); }
public void sendEquipmentBreakStatus(yarnwrap.item.Item item,yarnwrap.entity.EquipmentSlot slot) { wrapperContained.sendEquipmentBreakStatus(item.wrapperContained,slot.wrapperContained); }
// public byte getEquipmentBreakStatus(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.getEquipmentBreakStatus(slot.wrapperContained); }
public int getStingerCount() { return wrapperContained.getStingerCount(); }
public boolean isHoldingOntoLadder() { return wrapperContained.isHoldingOntoLadder(); }
public void setStingerCount(int stingerCount) { wrapperContained.setStingerCount(stingerCount); }
// public boolean shouldSpawnConsumptionEffects() { return wrapperContained.shouldSpawnConsumptionEffects(); }
// public void playBlockFallSound() { wrapperContained.playBlockFallSound(); }
// public int computeFallDamage(float fallDistance,float damageMultiplier) { return wrapperContained.computeFallDamage(fallDistance,damageMultiplier); }
public void swingHand(yarnwrap.util.Hand hand,boolean fromServerPlayer) { wrapperContained.swingHand(hand.wrapperContained,fromServerPlayer); }
// public void onKilledBy(yarnwrap.entity.LivingEntity adversary) { wrapperContained.onKilledBy(adversary.wrapperContained); }
// public void dropXp(yarnwrap.entity.Entity attacker) { wrapperContained.dropXp(attacker.wrapperContained); }
public boolean isHolding(yarnwrap.item.Item item) { return wrapperContained.isHolding(item.wrapperContained); }
public boolean isHolding(java.util.function.Predicate predicate) { return wrapperContained.isHolding(predicate); }
public com.google.common.collect.ImmutableList getPoses() { return wrapperContained.getPoses(); }
public java.util.Optional getClimbingPos() { return wrapperContained.getClimbingPos(); }
public yarnwrap.util.math.Box getBoundingBox(yarnwrap.entity.EntityPose pose) { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox(pose.wrapperContained)); }
public void setStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source) { wrapperContained.setStatusEffect(effect.wrapperContained,source.wrapperContained); }
public yarnwrap.util.math.Vec3d applyFluidMovingSpeed(double gravity,boolean falling,yarnwrap.util.math.Vec3d motion) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyFluidMovingSpeed(gravity,falling,motion.wrapperContained)); }
public yarnwrap.util.math.Vec3d applyMovementInput(yarnwrap.util.math.Vec3d movementInput,float slipperiness) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyMovementInput(movementInput.wrapperContained,slipperiness)); }
public boolean canWalkOnFluid(yarnwrap.fluid.FluidState state) { return wrapperContained.canWalkOnFluid(state.wrapperContained); }
public Object createLivingAttributes() { return wrapperContained.createLivingAttributes(); }
// public boolean shouldDropLoot() { return wrapperContained.shouldDropLoot(); }
// public Object createBrainProfile() { return wrapperContained.createBrainProfile(); }
public void updateLimbs(boolean flutter) { wrapperContained.updateLimbs(flutter); }
public void triggerItemPickedUpByEntityCriteria(yarnwrap.entity.ItemEntity item) { wrapperContained.triggerItemPickedUpByEntityCriteria(item.wrapperContained); }
public boolean hurtByWater() { return wrapperContained.hurtByWater(); }
public boolean isDead() { return wrapperContained.isDead(); }
public void setAttacking(yarnwrap.entity.player.PlayerEntity attacking) { wrapperContained.setAttacking(attacking.wrapperContained); }
// public boolean shouldSwimInFluids() { return wrapperContained.shouldSwimInFluids(); }
// public void checkHandStackSwap(java.util.Map equipmentChanges) { wrapperContained.checkHandStackSwap(equipmentChanges); }
// public void setSyncedArmorStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack armor) { wrapperContained.setSyncedArmorStack(slot.wrapperContained,armor.wrapperContained); }
// public void sendEquipmentChanges(java.util.Map equipmentChanges) { wrapperContained.sendEquipmentChanges(equipmentChanges); }
// public void setSyncedHandStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { wrapperContained.setSyncedHandStack(slot.wrapperContained,stack.wrapperContained); }
// public yarnwrap.item.ItemStack getSyncedArmorStack(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.getSyncedArmorStack(slot.wrapperContained)); }
// public yarnwrap.item.ItemStack getSyncedHandStack(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.getSyncedHandStack(slot.wrapperContained)); }
// public void swapHandStacks() { wrapperContained.swapHandStacks(); }
// public void sendEquipmentChanges() { wrapperContained.sendEquipmentChanges(); }
// public java.util.Map getEquipmentChanges() { return wrapperContained.getEquipmentChanges(); }
public yarnwrap.util.math.Vec3d positionInPortal(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.positionInPortal(pos.wrapperContained)); }
// public yarnwrap.inventory.StackReference getStackReference(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.inventory.StackReference(wrapperContained.getStackReference(entity.wrapperContained,slot.wrapperContained)); }
// public yarnwrap.entity.EquipmentSlot getEquipmentSlot(int slotId) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getEquipmentSlot(slotId)); }
// public void removePowderSnowSlow() { wrapperContained.removePowderSnowSlow(); }
// public void addPowderSnowSlowIfNeeded() { wrapperContained.addPowderSnowSlowIfNeeded(); }
public yarnwrap.entity.EquipmentSlot getPreferredEquipmentSlot(yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getPreferredEquipmentSlot(stack.wrapperContained)); }
public boolean canTakeDamage() { return wrapperContained.canTakeDamage(); }
public boolean hasNoDrag() { return wrapperContained.hasNoDrag(); }
public void setNoDrag(boolean noDrag) { wrapperContained.setNoDrag(noDrag); }
// public void updateGlowing() { wrapperContained.updateGlowing(); }
// public void addDeathParticles() { wrapperContained.addDeathParticles(); }
public boolean isPartOfGame() { return wrapperContained.isPartOfGame(); }
// public void damageHelmet(yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.damageHelmet(source.wrapperContained,amount); }
// public void tickItemStackUsage(yarnwrap.item.ItemStack stack) { wrapperContained.tickItemStackUsage(stack.wrapperContained); }
public boolean addStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source) { return wrapperContained.addStatusEffect(effect.wrapperContained,source.wrapperContained); }
// public void processEquippedStack(yarnwrap.item.ItemStack stack) { wrapperContained.processEquippedStack(stack.wrapperContained); }
public float getJumpBoostVelocityModifier() { return wrapperContained.getJumpBoostVelocityModifier(); }
public Object getFallSounds() { return wrapperContained.getFallSounds(); }
public void disableExperienceDropping() { wrapperContained.disableExperienceDropping(); }
public boolean isExperienceDroppingDisabled() { return wrapperContained.isExperienceDroppingDisabled(); }
public boolean disablesShield() { return wrapperContained.disablesShield(); }
// public boolean isArmorSlot(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.isArmorSlot(slot.wrapperContained); }
public boolean areItemsDifferent(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack stack2) { return wrapperContained.areItemsDifferent(stack.wrapperContained,stack2.wrapperContained); }
public double getAttributeValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getAttributeValue(attribute.wrapperContained); }
public double getAttributeBaseValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getAttributeBaseValue(attribute.wrapperContained); }
public float getDamageTiltYaw() { return wrapperContained.getDamageTiltYaw(); }
// public void updateLimbs(float posDelta) { wrapperContained.updateLimbs(posDelta); }
public void tiltScreen(double deltaX,double deltaZ) { wrapperContained.tiltScreen(deltaX,deltaZ); }
// public void tickControlled(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput) { wrapperContained.tickControlled(controllingPlayer.wrapperContained,movementInput.wrapperContained); }
// public yarnwrap.util.math.Vec3d getControlledMovementInput(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput) { return new yarnwrap.util.math.Vec3d(wrapperContained.getControlledMovementInput(controllingPlayer.wrapperContained,movementInput.wrapperContained)); }
// public void travelControlled(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput) { wrapperContained.travelControlled(controllingPlayer.wrapperContained,movementInput.wrapperContained); }
// public float getOffGroundSpeed() { return wrapperContained.getOffGroundSpeed(); }
// public float getSaddledSpeed(yarnwrap.entity.player.PlayerEntity controllingPlayer) { return wrapperContained.getSaddledSpeed(controllingPlayer.wrapperContained); }
public long getLootTableSeed() { return wrapperContained.getLootTableSeed(); }
public void sendEffectToControllingPlayer(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.sendEffectToControllingPlayer(effect.wrapperContained); }
// public void lerpHeadYaw(int headTrackingIncrements,double serverHeadYaw) { wrapperContained.lerpHeadYaw(headTrackingIncrements,serverHeadYaw); }
// public void updateAttribute(yarnwrap.registry.entry.RegistryEntry attribute) { wrapperContained.updateAttribute(attribute.wrapperContained); }
public float getMaxAbsorption() { return wrapperContained.getMaxAbsorption(); }
// public boolean wouldNotSuffocateInPose(yarnwrap.entity.EntityPose pose) { return wrapperContained.wouldNotSuffocateInPose(pose.wrapperContained); }
// public void updateAttributes() { wrapperContained.updateAttributes(); }
// public void setAbsorptionAmountUnclamped(float absorptionAmount) { wrapperContained.setAbsorptionAmountUnclamped(absorptionAmount); }
// public yarnwrap.util.math.Box getHitbox() { return new yarnwrap.util.math.Box(wrapperContained.getHitbox()); }
// public float getMaxRelativeHeadRotation() { return wrapperContained.getMaxRelativeHeadRotation(); }
public float getScale() { return wrapperContained.getScale(); }
// public yarnwrap.entity.EntityDimensions getBaseDimensions(yarnwrap.entity.EntityPose pose) { return new yarnwrap.entity.EntityDimensions(wrapperContained.getBaseDimensions(pose.wrapperContained)); }
// public float clampScale(float scale) { return wrapperContained.clampScale(scale); }
public void playSound(yarnwrap.sound.SoundEvent sound) { wrapperContained.playSound(sound.wrapperContained); }
public yarnwrap.entity.EquipmentSlot getSlotForHand(yarnwrap.util.Hand hand) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getSlotForHand(hand.wrapperContained)); }
public java.lang.Iterable getArmorItems() { return wrapperContained.getArmorItems(); }
public java.lang.Iterable getAllArmorItems() { return wrapperContained.getAllArmorItems(); }
public java.lang.Iterable getEquippedItems() { return wrapperContained.getEquippedItems(); }
public void equipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { wrapperContained.equipStack(slot.wrapperContained,stack.wrapperContained); }
public boolean canUseSlot(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.canUseSlot(slot.wrapperContained); }
public boolean isInCreativeMode() { return wrapperContained.isInCreativeMode(); }
// public int getSafeFallDistance(float health) { return wrapperContained.getSafeFallDistance(health); }
// public float getJumpVelocity(float strength) { return wrapperContained.getJumpVelocity(strength); }
// public void damageEquipment(yarnwrap.entity.damage.DamageSource source,float amount,net.minecraft.entity.EquipmentSlot[] slots) { wrapperContained.damageEquipment(source.wrapperContained,amount,slots); }
// public void updatePotionSwirls() { wrapperContained.updatePotionSwirls(); }
public java.lang.Iterable getHandItems() { return wrapperContained.getHandItems(); }
public boolean canTarget(yarnwrap.entity.EntityType type) { return wrapperContained.canTarget(type.wrapperContained); }
public yarnwrap.registry.RegistryKey getLootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTable()); }
public int getXpToDrop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity attacker) { return wrapperContained.getXpToDrop(world.wrapperContained,attacker.wrapperContained); }
// public float getKnockbackAgainst(yarnwrap.entity.Entity target,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.getKnockbackAgainst(target.wrapperContained,damageSource.wrapperContained); }
public boolean hasLandedInFluid() { return wrapperContained.hasLandedInFluid(); }
public java.util.Map getLocationBasedEnchantmentEffects() { return wrapperContained.getLocationBasedEnchantmentEffects(); }
public yarnwrap.entity.attribute.EntityAttributeInstance getAttributeInstance(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.getAttributeInstance(attribute.wrapperContained)); }
// public void attackLivingEntity(yarnwrap.entity.LivingEntity target) { wrapperContained.attackLivingEntity(target.wrapperContained); }
public yarnwrap.item.ItemStack getStackInHand(yarnwrap.util.Hand hand) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInHand(hand.wrapperContained)); }
public boolean hasInvertedHealingAndHarm() { return wrapperContained.hasInvertedHealingAndHarm(); }
public void enterCombat() { wrapperContained.enterCombat(); }
// public yarnwrap.sound.SoundEvent getDeathSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getDeathSound()); }
public int getFallFlyingTicks() { return wrapperContained.getFallFlyingTicks(); }
public void takeKnockback(double strength,double x,double z) { wrapperContained.takeKnockback(strength,x,z); }
public void setNearbySongPlaying(yarnwrap.util.math.BlockPos songPosition,boolean playing) { wrapperContained.setNearbySongPlaying(songPosition.wrapperContained,playing); }
public void tickMovement() { wrapperContained.tickMovement(); }
// public void markEffectsDirty() { wrapperContained.markEffectsDirty(); }
// public void onStatusEffectUpgraded(yarnwrap.entity.effect.StatusEffectInstance effect,boolean reapplyEffect,yarnwrap.entity.Entity source) { wrapperContained.onStatusEffectUpgraded(effect.wrapperContained,reapplyEffect,source.wrapperContained); }
// public void swimUpward(yarnwrap.registry.tag.TagKey fluid) { wrapperContained.swimUpward(fluid.wrapperContained); }
// public yarnwrap.sound.SoundEvent getHurtSound(yarnwrap.entity.damage.DamageSource source) { return new yarnwrap.sound.SoundEvent(wrapperContained.getHurtSound(source.wrapperContained)); }
public boolean clearStatusEffects() { return wrapperContained.clearStatusEffects(); }
// public void playHurtSound(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.playHurtSound(damageSource.wrapperContained); }
public int getItemUseTimeLeft() { return wrapperContained.getItemUseTimeLeft(); }
public void setAttacker(yarnwrap.entity.LivingEntity attacker) { wrapperContained.setAttacker(attacker.wrapperContained); }
public boolean removeStatusEffect(yarnwrap.registry.entry.RegistryEntry effect) { return wrapperContained.removeStatusEffect(effect.wrapperContained); }
public float getSoundPitch() { return wrapperContained.getSoundPitch(); }
public void setCurrentHand(yarnwrap.util.Hand hand) { wrapperContained.setCurrentHand(hand.wrapperContained); }
// public void onStatusEffectApplied(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source) { wrapperContained.onStatusEffectApplied(effect.wrapperContained,source.wrapperContained); }
public void clearActiveItem() { wrapperContained.clearActiveItem(); }
public int getStuckArrowCount() { return wrapperContained.getStuckArrowCount(); }
// public void tickNewAi() { wrapperContained.tickNewAi(); }
public float getLeaningPitch(float tickDelta) { return wrapperContained.getLeaningPitch(tickDelta); }
public void heal(float amount) { wrapperContained.heal(amount); }
public java.util.Collection getStatusEffects() { return wrapperContained.getStatusEffects(); }
// public void updatePotionVisibility() { wrapperContained.updatePotionVisibility(); }
// public int getHandSwingDuration() { return wrapperContained.getHandSwingDuration(); }
public float getMovementSpeed() { return wrapperContained.getMovementSpeed(); }
public yarnwrap.item.ItemStack getActiveItem() { return new yarnwrap.item.ItemStack(wrapperContained.getActiveItem()); }
// public float turnHead(float bodyRotation,float headRotation) { return wrapperContained.turnHead(bodyRotation,headRotation); }
public float getHealth() { return wrapperContained.getHealth(); }
public void setHealth(float health) { wrapperContained.setHealth(health); }
// public void tickRiptide(yarnwrap.util.math.Box a,yarnwrap.util.math.Box b) { wrapperContained.tickRiptide(a.wrapperContained,b.wrapperContained); }
// public float modifyAppliedDamage(yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.modifyAppliedDamage(source.wrapperContained,amount); }
// public void spawnItemParticles(yarnwrap.item.ItemStack stack,int count) { wrapperContained.spawnItemParticles(stack.wrapperContained,count); }
// public void onDismounted(yarnwrap.entity.Entity vehicle) { wrapperContained.onDismounted(vehicle.wrapperContained); }
public boolean isBlocking() { return wrapperContained.isBlocking(); }
// public void consumeItem() { wrapperContained.consumeItem(); }
// public yarnwrap.sound.SoundEvent getFallSound(int distance) { return new yarnwrap.sound.SoundEvent(wrapperContained.getFallSound(distance)); }
public void jump() { wrapperContained.jump(); }
public void endCombat() { wrapperContained.endCombat(); }
// public void playEquipmentBreakEffects(yarnwrap.item.ItemStack stack) { wrapperContained.playEquipmentBreakEffects(stack.wrapperContained); }
public yarnwrap.item.ItemStack getMainHandStack() { return new yarnwrap.item.ItemStack(wrapperContained.getMainHandStack()); }
public int getItemUseTime() { return wrapperContained.getItemUseTime(); }
public boolean canHaveStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { return wrapperContained.canHaveStatusEffect(effect.wrapperContained); }
public yarnwrap.item.ItemStack tryEatFood(yarnwrap.world.World world,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.tryEatFood(world.wrapperContained,stack.wrapperContained)); }
// public void tickStatusEffects() { wrapperContained.tickStatusEffects(); }
public yarnwrap.entity.LivingEntity getAttacking() { return new yarnwrap.entity.LivingEntity(wrapperContained.getAttacking()); }
// public void tickFallFlying() { wrapperContained.tickFallFlying(); }
public boolean shouldDropXp() { return wrapperContained.shouldDropXp(); }
public float getHandSwingProgress(float tickDelta) { return wrapperContained.getHandSwingProgress(tickDelta); }
// public void damageShield(float amount) { wrapperContained.damageShield(amount); }
public boolean canSee(yarnwrap.entity.Entity entity) { return wrapperContained.canSee(entity.wrapperContained); }
public yarnwrap.util.Hand getActiveHand() { return new yarnwrap.util.Hand(wrapperContained.getActiveHand()); }
public boolean hasStatusEffect(yarnwrap.registry.entry.RegistryEntry effect) { return wrapperContained.hasStatusEffect(effect.wrapperContained); }
// public void knockback(yarnwrap.entity.LivingEntity target) { wrapperContained.knockback(target.wrapperContained); }
public boolean blockedByShield(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.blockedByShield(source.wrapperContained); }
// public boolean isImmobile() { return wrapperContained.isImmobile(); }
public float getMaxHealth() { return wrapperContained.getMaxHealth(); }
// public int getNextAirOnLand(int air) { return wrapperContained.getNextAirOnLand(air); }
public yarnwrap.entity.LivingEntity getAttacker() { return new yarnwrap.entity.LivingEntity(wrapperContained.getAttacker()); }
public yarnwrap.entity.damage.DamageTracker getDamageTracker() { return new yarnwrap.entity.damage.DamageTracker(wrapperContained.getDamageTracker()); }
public float getAbsorptionAmount() { return wrapperContained.getAbsorptionAmount(); }
public yarnwrap.util.Arm getMainArm() { return new yarnwrap.util.Arm(wrapperContained.getMainArm()); }
// public void clearPotionSwirls() { wrapperContained.clearPotionSwirls(); }
// public void onRemoval(Object reason) { wrapperContained.onRemoval(reason); }
// public void tickCramming() { wrapperContained.tickCramming(); }
// public boolean shouldAlwaysDropXp() { return wrapperContained.shouldAlwaysDropXp(); }
// public void updateLeaningPitch() { wrapperContained.updateLeaningPitch(); }
public void setAbsorptionAmount(float absorptionAmount) { wrapperContained.setAbsorptionAmount(absorptionAmount); }
// public void applyDamage(yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.applyDamage(source.wrapperContained,amount); }
public void stopUsingItem() { wrapperContained.stopUsingItem(); }
// public void tickActiveItemStack() { wrapperContained.tickActiveItemStack(); }
// public boolean canEnterTrapdoor(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canEnterTrapdoor(pos.wrapperContained,state.wrapperContained); }
public void onDeath(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.onDeath(damageSource.wrapperContained); }
public yarnwrap.item.ItemStack getOffHandStack() { return new yarnwrap.item.ItemStack(wrapperContained.getOffHandStack()); }
public yarnwrap.entity.damage.DamageSource getRecentDamageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.getRecentDamageSource()); }
public boolean teleport(double x,double y,double z,boolean particleEffects) { return wrapperContained.teleport(x,y,z,particleEffects); }
public int getLastAttackTime() { return wrapperContained.getLastAttackTime(); }
public boolean hasStackEquipped(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.hasStackEquipped(slot.wrapperContained); }
// public void setLivingFlag(int mask,boolean value) { wrapperContained.setLivingFlag(mask,value); }
public boolean isAffectedBySplashPotions() { return wrapperContained.isAffectedBySplashPotions(); }
// public void pushAway(yarnwrap.entity.Entity entity) { wrapperContained.pushAway(entity.wrapperContained); }
public java.util.Map getActiveStatusEffects() { return wrapperContained.getActiveStatusEffects(); }
public boolean containsOnlyAmbientEffects(java.util.Collection effects) { return wrapperContained.containsOnlyAmbientEffects(effects); }
// public void takeShieldHit(yarnwrap.entity.LivingEntity attacker) { wrapperContained.takeShieldHit(attacker.wrapperContained); }
public void travel(yarnwrap.util.math.Vec3d movementInput) { wrapperContained.travel(movementInput.wrapperContained); }
public boolean addStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { return wrapperContained.addStatusEffect(effect.wrapperContained); }
// public void knockDownwards() { wrapperContained.knockDownwards(); }
public boolean canBreatheInWater() { return wrapperContained.canBreatheInWater(); }
// public boolean tryUseTotem(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.tryUseTotem(source.wrapperContained); }
public int getArmor() { return wrapperContained.getArmor(); }
public void setStuckArrowCount(int stuckArrowCount) { wrapperContained.setStuckArrowCount(stuckArrowCount); }
// public void spawnConsumptionEffects(yarnwrap.item.ItemStack stack,int particleCount) { wrapperContained.spawnConsumptionEffects(stack.wrapperContained,particleCount); }
// public void dropEquipment(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,boolean causedByPlayer) { wrapperContained.dropEquipment(world.wrapperContained,source.wrapperContained,causedByPlayer); }
public void setJumping(boolean jumping) { wrapperContained.setJumping(jumping); }
public boolean isClimbing() { return wrapperContained.isClimbing(); }
public boolean isMobOrPlayer() { return wrapperContained.isMobOrPlayer(); }
public void sendPickup(yarnwrap.entity.Entity item,int count) { wrapperContained.sendPickup(item.wrapperContained,count); }
public void swingHand(yarnwrap.util.Hand hand) { wrapperContained.swingHand(hand.wrapperContained); }
// public void damageArmor(yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.damageArmor(source.wrapperContained,amount); }
// public float getJumpVelocity() { return wrapperContained.getJumpVelocity(); }
// public float getSoundVolume() { return wrapperContained.getSoundVolume(); }
// public void updatePostDeath() { wrapperContained.updatePostDeath(); }
public boolean isBaby() { return wrapperContained.isBaby(); }
// public int getXpToDrop() { return wrapperContained.getXpToDrop(); }
public yarnwrap.entity.effect.StatusEffectInstance removeStatusEffectInternal(yarnwrap.registry.entry.RegistryEntry effect) { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.removeStatusEffectInternal(effect.wrapperContained)); }
public yarnwrap.entity.effect.StatusEffectInstance getStatusEffect(yarnwrap.registry.entry.RegistryEntry effect) { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.getStatusEffect(effect.wrapperContained)); }
public boolean isSleeping() { return wrapperContained.isSleeping(); }
public void onAttacking(yarnwrap.entity.Entity target) { wrapperContained.onAttacking(target.wrapperContained); }
public boolean isUsingItem() { return wrapperContained.isUsingItem(); }
public void onEquipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack oldStack,yarnwrap.item.ItemStack newStack) { wrapperContained.onEquipStack(slot.wrapperContained,oldStack.wrapperContained,newStack.wrapperContained); }
public int getLastAttackedTime() { return wrapperContained.getLastAttackedTime(); }
public yarnwrap.item.ItemStack getEquippedStack(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.getEquippedStack(slot.wrapperContained)); }
// public void tickHandSwing() { wrapperContained.tickHandSwing(); }
// public float getBaseMovementSpeedMultiplier() { return wrapperContained.getBaseMovementSpeedMultiplier(); }
public boolean tryAttack(yarnwrap.entity.Entity target) { return wrapperContained.tryAttack(target.wrapperContained); }
public void setStackInHand(yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack) { wrapperContained.setStackInHand(hand.wrapperContained,stack.wrapperContained); }
public boolean isUsingRiptide() { return wrapperContained.isUsingRiptide(); }
public yarnwrap.entity.LivingEntity getPrimeAdversary() { return new yarnwrap.entity.LivingEntity(wrapperContained.getPrimeAdversary()); }
public void setMovementSpeed(float movementSpeed) { wrapperContained.setMovementSpeed(movementSpeed); }
// public void applyMovementEffects(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.applyMovementEffects(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.entity.attribute.AttributeContainer getAttributes() { return new yarnwrap.entity.attribute.AttributeContainer(wrapperContained.getAttributes()); }
public boolean isFallFlying() { return wrapperContained.isFallFlying(); }
// public void onStatusEffectRemoved(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.onStatusEffectRemoved(effect.wrapperContained); }
// public int getNextAirUnderwater(int air) { return wrapperContained.getNextAirUnderwater(air); }
public int getDespawnCounter() { return wrapperContained.getDespawnCounter(); }
// public float applyArmorToDamage(yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.applyArmorToDamage(source.wrapperContained,amount); }

}