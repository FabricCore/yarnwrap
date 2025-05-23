package yarnwrap.entity;
public class LivingEntity { public net.minecraft.entity.LivingEntity wrapperContained; public LivingEntity(net.minecraft.entity.LivingEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float sidewaysSpeed() { return wrapperContained.sidewaysSpeed; }
public void sidewaysSpeed(float value) { wrapperContained.sidewaysSpeed = value; }
// public static float sidewaysSpeed() { return net.minecraft.entity.LivingEntity.sidewaysSpeed; }
// public static void sidewaysSpeed(float value, ) { net.minecraft.entity.LivingEntity.sidewaysSpeed = value; }

public int deathTime() { return wrapperContained.deathTime; }
public void deathTime(int value) { wrapperContained.deathTime = value; }
// public static int deathTime() { return net.minecraft.entity.LivingEntity.deathTime; }
// public static void deathTime(int value, ) { net.minecraft.entity.LivingEntity.deathTime = value; }

// public yarnwrap.entity.data.TrackedData POTION_SWIRLS_AMBIENT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.POTION_SWIRLS_AMBIENT); }
// public void POTION_SWIRLS_AMBIENT(yarnwrap.entity.data.TrackedData value) { wrapperContained.POTION_SWIRLS_AMBIENT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData POTION_SWIRLS_AMBIENT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.LivingEntity.POTION_SWIRLS_AMBIENT); }
// public static void POTION_SWIRLS_AMBIENT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.LivingEntity.POTION_SWIRLS_AMBIENT = value.wrapperContained; }

public int stuckArrowTimer() { return wrapperContained.stuckArrowTimer; }
public void stuckArrowTimer(int value) { wrapperContained.stuckArrowTimer = value; }
// public static int stuckArrowTimer() { return net.minecraft.entity.LivingEntity.stuckArrowTimer; }
// public static void stuckArrowTimer(int value, ) { net.minecraft.entity.LivingEntity.stuckArrowTimer = value; }

// public yarnwrap.entity.data.TrackedData STUCK_ARROW_COUNT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STUCK_ARROW_COUNT); }
// public void STUCK_ARROW_COUNT(yarnwrap.entity.data.TrackedData value) { wrapperContained.STUCK_ARROW_COUNT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData STUCK_ARROW_COUNT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.LivingEntity.STUCK_ARROW_COUNT); }
// public static void STUCK_ARROW_COUNT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.LivingEntity.STUCK_ARROW_COUNT = value.wrapperContained; }

public float lastBodyYaw() { return wrapperContained.lastBodyYaw; }
public void lastBodyYaw(float value) { wrapperContained.lastBodyYaw = value; }
// public static float lastBodyYaw() { return net.minecraft.entity.LivingEntity.lastBodyYaw; }
// public static void lastBodyYaw(float value, ) { net.minecraft.entity.LivingEntity.lastBodyYaw = value; }

// public int itemUseTimeLeft() { return wrapperContained.itemUseTimeLeft; }
// public void itemUseTimeLeft(int value) { wrapperContained.itemUseTimeLeft = value; }
// public static int itemUseTimeLeft() { return net.minecraft.entity.LivingEntity.itemUseTimeLeft; }
// public static void itemUseTimeLeft(int value, ) { net.minecraft.entity.LivingEntity.itemUseTimeLeft = value; }

// public long lastDamageTime() { return wrapperContained.lastDamageTime; }
// public void lastDamageTime(long value) { wrapperContained.lastDamageTime = value; }
// public static long lastDamageTime() { return net.minecraft.entity.LivingEntity.lastDamageTime; }
// public static void lastDamageTime(long value, ) { net.minecraft.entity.LivingEntity.lastDamageTime = value; }

public float upwardSpeed() { return wrapperContained.upwardSpeed; }
public void upwardSpeed(float value) { wrapperContained.upwardSpeed = value; }
// public static float upwardSpeed() { return net.minecraft.entity.LivingEntity.upwardSpeed; }
// public static void upwardSpeed(float value, ) { net.minecraft.entity.LivingEntity.upwardSpeed = value; }

// public int jumpingCooldown() { return wrapperContained.jumpingCooldown; }
// public void jumpingCooldown(int value) { wrapperContained.jumpingCooldown = value; }
// public static int jumpingCooldown() { return net.minecraft.entity.LivingEntity.jumpingCooldown; }
// public static void jumpingCooldown(int value, ) { net.minecraft.entity.LivingEntity.jumpingCooldown = value; }

public float lastHandSwingProgress() { return wrapperContained.lastHandSwingProgress; }
public void lastHandSwingProgress(float value) { wrapperContained.lastHandSwingProgress = value; }
// public static float lastHandSwingProgress() { return net.minecraft.entity.LivingEntity.lastHandSwingProgress; }
// public static void lastHandSwingProgress(float value, ) { net.minecraft.entity.LivingEntity.lastHandSwingProgress = value; }

// public int lastAttackedTime() { return wrapperContained.lastAttackedTime; }
// public void lastAttackedTime(int value) { wrapperContained.lastAttackedTime = value; }
// public static int lastAttackedTime() { return net.minecraft.entity.LivingEntity.lastAttackedTime; }
// public static void lastAttackedTime(int value, ) { net.minecraft.entity.LivingEntity.lastAttackedTime = value; }

// public yarnwrap.entity.attribute.EntityAttributeModifier SPRINTING_SPEED_BOOST() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.SPRINTING_SPEED_BOOST); }
// public void SPRINTING_SPEED_BOOST(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.SPRINTING_SPEED_BOOST = value.wrapperContained; }
// public static yarnwrap.entity.attribute.EntityAttributeModifier SPRINTING_SPEED_BOOST() { return new yarnwrap.entity.attribute.EntityAttributeModifier(net.minecraft.entity.LivingEntity.SPRINTING_SPEED_BOOST); }
// public static void SPRINTING_SPEED_BOOST(yarnwrap.entity.attribute.EntityAttributeModifier value, ) { net.minecraft.entity.LivingEntity.SPRINTING_SPEED_BOOST = value.wrapperContained; }

public int hurtTime() { return wrapperContained.hurtTime; }
public void hurtTime(int value) { wrapperContained.hurtTime = value; }
// public static int hurtTime() { return net.minecraft.entity.LivingEntity.hurtTime; }
// public static void hurtTime(int value, ) { net.minecraft.entity.LivingEntity.hurtTime = value; }

// public yarnwrap.entity.LivingEntity attacking() { return new yarnwrap.entity.LivingEntity(wrapperContained.attacking); }
// public void attacking(yarnwrap.entity.LivingEntity value) { wrapperContained.attacking = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity attacking() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.LivingEntity.attacking); }
// public static void attacking(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.LivingEntity.attacking = value.wrapperContained; }

// public int playerHitTimer() { return wrapperContained.playerHitTimer; }
// public void playerHitTimer(int value) { wrapperContained.playerHitTimer = value; }
// public static int playerHitTimer() { return net.minecraft.entity.LivingEntity.playerHitTimer; }
// public static void playerHitTimer(int value, ) { net.minecraft.entity.LivingEntity.playerHitTimer = value; }

// public int glidingTicks() { return wrapperContained.glidingTicks; }
// public void glidingTicks(int value) { wrapperContained.glidingTicks = value; }
// public static int glidingTicks() { return net.minecraft.entity.LivingEntity.glidingTicks; }
// public static void glidingTicks(int value, ) { net.minecraft.entity.LivingEntity.glidingTicks = value; }

public float headYaw() { return wrapperContained.headYaw; }
public void headYaw(float value) { wrapperContained.headYaw = value; }
// public static float headYaw() { return net.minecraft.entity.LivingEntity.headYaw; }
// public static void headYaw(float value, ) { net.minecraft.entity.LivingEntity.headYaw = value; }

// public float leaningPitch() { return wrapperContained.leaningPitch; }
// public void leaningPitch(float value) { wrapperContained.leaningPitch = value; }
// public static float leaningPitch() { return net.minecraft.entity.LivingEntity.leaningPitch; }
// public static void leaningPitch(float value, ) { net.minecraft.entity.LivingEntity.leaningPitch = value; }

// public float absorptionAmount() { return wrapperContained.absorptionAmount; }
// public void absorptionAmount(float value) { wrapperContained.absorptionAmount = value; }
// public static float absorptionAmount() { return net.minecraft.entity.LivingEntity.absorptionAmount; }
// public static void absorptionAmount(float value, ) { net.minecraft.entity.LivingEntity.absorptionAmount = value; }

// public yarnwrap.entity.data.TrackedData HEALTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HEALTH); }
// public void HEALTH(yarnwrap.entity.data.TrackedData value) { wrapperContained.HEALTH = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HEALTH() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.LivingEntity.HEALTH); }
// public static void HEALTH(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.LivingEntity.HEALTH = value.wrapperContained; }

public float forwardSpeed() { return wrapperContained.forwardSpeed; }
public void forwardSpeed(float value) { wrapperContained.forwardSpeed = value; }
// public static float forwardSpeed() { return net.minecraft.entity.LivingEntity.forwardSpeed; }
// public static void forwardSpeed(float value, ) { net.minecraft.entity.LivingEntity.forwardSpeed = value; }

public float handSwingProgress() { return wrapperContained.handSwingProgress; }
public void handSwingProgress(float value) { wrapperContained.handSwingProgress = value; }
// public static float handSwingProgress() { return net.minecraft.entity.LivingEntity.handSwingProgress; }
// public static void handSwingProgress(float value, ) { net.minecraft.entity.LivingEntity.handSwingProgress = value; }

public boolean handSwinging() { return wrapperContained.handSwinging; }
public void handSwinging(boolean value) { wrapperContained.handSwinging = value; }
// public static boolean handSwinging() { return net.minecraft.entity.LivingEntity.handSwinging; }
// public static void handSwinging(boolean value, ) { net.minecraft.entity.LivingEntity.handSwinging = value; }

// public float lastDamageTaken() { return wrapperContained.lastDamageTaken; }
// public void lastDamageTaken(float value) { wrapperContained.lastDamageTaken = value; }
// public static float lastDamageTaken() { return net.minecraft.entity.LivingEntity.lastDamageTaken; }
// public static void lastDamageTaken(float value, ) { net.minecraft.entity.LivingEntity.lastDamageTaken = value; }

public int maxHurtTime() { return wrapperContained.maxHurtTime; }
public void maxHurtTime(int value) { wrapperContained.maxHurtTime = value; }
// public static int maxHurtTime() { return net.minecraft.entity.LivingEntity.maxHurtTime; }
// public static void maxHurtTime(int value, ) { net.minecraft.entity.LivingEntity.maxHurtTime = value; }

// public yarnwrap.entity.damage.DamageTracker damageTracker() { return new yarnwrap.entity.damage.DamageTracker(wrapperContained.damageTracker); }
// public void damageTracker(yarnwrap.entity.damage.DamageTracker value) { wrapperContained.damageTracker = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageTracker damageTracker() { return new yarnwrap.entity.damage.DamageTracker(net.minecraft.entity.LivingEntity.damageTracker); }
// public static void damageTracker(yarnwrap.entity.damage.DamageTracker value, ) { net.minecraft.entity.LivingEntity.damageTracker = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData LIVING_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LIVING_FLAGS); }
// public void LIVING_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.LIVING_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData LIVING_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.LivingEntity.LIVING_FLAGS); }
// public static void LIVING_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.LivingEntity.LIVING_FLAGS = value.wrapperContained; }

// public yarnwrap.entity.LazyEntityReference attackingPlayer() { return new yarnwrap.entity.LazyEntityReference(wrapperContained.attackingPlayer); }
// public void attackingPlayer(yarnwrap.entity.LazyEntityReference value) { wrapperContained.attackingPlayer = value.wrapperContained; }
// public static yarnwrap.entity.LazyEntityReference attackingPlayer() { return new yarnwrap.entity.LazyEntityReference(net.minecraft.entity.LivingEntity.attackingPlayer); }
// public static void attackingPlayer(yarnwrap.entity.LazyEntityReference value, ) { net.minecraft.entity.LivingEntity.attackingPlayer = value.wrapperContained; }

public float lastHeadYaw() { return wrapperContained.lastHeadYaw; }
public void lastHeadYaw(float value) { wrapperContained.lastHeadYaw = value; }
// public static float lastHeadYaw() { return net.minecraft.entity.LivingEntity.lastHeadYaw; }
// public static void lastHeadYaw(float value, ) { net.minecraft.entity.LivingEntity.lastHeadYaw = value; }

// public yarnwrap.entity.attribute.AttributeContainer attributes() { return new yarnwrap.entity.attribute.AttributeContainer(wrapperContained.attributes); }
// public void attributes(yarnwrap.entity.attribute.AttributeContainer value) { wrapperContained.attributes = value.wrapperContained; }
// public static yarnwrap.entity.attribute.AttributeContainer attributes() { return new yarnwrap.entity.attribute.AttributeContainer(net.minecraft.entity.LivingEntity.attributes); }
// public static void attributes(yarnwrap.entity.attribute.AttributeContainer value, ) { net.minecraft.entity.LivingEntity.attributes = value.wrapperContained; }

// public int riptideTicks() { return wrapperContained.riptideTicks; }
// public void riptideTicks(int value) { wrapperContained.riptideTicks = value; }
// public static int riptideTicks() { return net.minecraft.entity.LivingEntity.riptideTicks; }
// public static void riptideTicks(int value, ) { net.minecraft.entity.LivingEntity.riptideTicks = value; }

// public float lastLeaningPitch() { return wrapperContained.lastLeaningPitch; }
// public void lastLeaningPitch(float value) { wrapperContained.lastLeaningPitch = value; }
// public static float lastLeaningPitch() { return net.minecraft.entity.LivingEntity.lastLeaningPitch; }
// public static void lastLeaningPitch(float value, ) { net.minecraft.entity.LivingEntity.lastLeaningPitch = value; }

// public int headTrackingIncrements() { return wrapperContained.headTrackingIncrements; }
// public void headTrackingIncrements(int value) { wrapperContained.headTrackingIncrements = value; }
// public static int headTrackingIncrements() { return net.minecraft.entity.LivingEntity.headTrackingIncrements; }
// public static void headTrackingIncrements(int value, ) { net.minecraft.entity.LivingEntity.headTrackingIncrements = value; }

public yarnwrap.util.Hand preferredHand() { return new yarnwrap.util.Hand(wrapperContained.preferredHand); }
public void preferredHand(yarnwrap.util.Hand value) { wrapperContained.preferredHand = value.wrapperContained; }
// public static yarnwrap.util.Hand preferredHand() { return new yarnwrap.util.Hand(net.minecraft.entity.LivingEntity.preferredHand); }
// public static void preferredHand(yarnwrap.util.Hand value, ) { net.minecraft.entity.LivingEntity.preferredHand = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos lastBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.lastBlockPos); }
// public void lastBlockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.lastBlockPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos lastBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.LivingEntity.lastBlockPos); }
// public static void lastBlockPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.LivingEntity.lastBlockPos = value.wrapperContained; }

public int defaultMaxHealth() { return wrapperContained.defaultMaxHealth; }
// public void defaultMaxHealth(int value) { wrapperContained.defaultMaxHealth = value; }
// public static int defaultMaxHealth() { return net.minecraft.entity.LivingEntity.defaultMaxHealth; }
// public static void defaultMaxHealth(int value, ) { net.minecraft.entity.LivingEntity.defaultMaxHealth = value; }

// public int lastAttackTime() { return wrapperContained.lastAttackTime; }
// public void lastAttackTime(int value) { wrapperContained.lastAttackTime = value; }
// public static int lastAttackTime() { return net.minecraft.entity.LivingEntity.lastAttackTime; }
// public static void lastAttackTime(int value, ) { net.minecraft.entity.LivingEntity.lastAttackTime = value; }

// public boolean dead() { return wrapperContained.dead; }
// public void dead(boolean value) { wrapperContained.dead = value; }
// public static boolean dead() { return net.minecraft.entity.LivingEntity.dead; }
// public static void dead(boolean value, ) { net.minecraft.entity.LivingEntity.dead = value; }

// public int lastAttackedTicks() { return wrapperContained.lastAttackedTicks; }
// public void lastAttackedTicks(int value) { wrapperContained.lastAttackedTicks = value; }
// public static int lastAttackedTicks() { return net.minecraft.entity.LivingEntity.lastAttackedTicks; }
// public static void lastAttackedTicks(int value, ) { net.minecraft.entity.LivingEntity.lastAttackedTicks = value; }

// public yarnwrap.entity.damage.DamageSource lastDamageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.lastDamageSource); }
// public void lastDamageSource(yarnwrap.entity.damage.DamageSource value) { wrapperContained.lastDamageSource = value.wrapperContained; }
// public static yarnwrap.entity.damage.DamageSource lastDamageSource() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.LivingEntity.lastDamageSource); }
// public static void lastDamageSource(yarnwrap.entity.damage.DamageSource value, ) { net.minecraft.entity.LivingEntity.lastDamageSource = value.wrapperContained; }

// public yarnwrap.item.ItemStack activeItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.activeItemStack); }
// public void activeItemStack(yarnwrap.item.ItemStack value) { wrapperContained.activeItemStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack activeItemStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.activeItemStack); }
// public static void activeItemStack(yarnwrap.item.ItemStack value, ) { net.minecraft.entity.LivingEntity.activeItemStack = value.wrapperContained; }

// public int despawnCounter() { return wrapperContained.despawnCounter; }
// public void despawnCounter(int value) { wrapperContained.despawnCounter = value; }
// public static int despawnCounter() { return net.minecraft.entity.LivingEntity.despawnCounter; }
// public static void despawnCounter(int value, ) { net.minecraft.entity.LivingEntity.despawnCounter = value; }

public int handSwingTicks() { return wrapperContained.handSwingTicks; }
public void handSwingTicks(int value) { wrapperContained.handSwingTicks = value; }
// public static int handSwingTicks() { return net.minecraft.entity.LivingEntity.handSwingTicks; }
// public static void handSwingTicks(int value, ) { net.minecraft.entity.LivingEntity.handSwingTicks = value; }

// public java.util.Map activeStatusEffects() { return wrapperContained.activeStatusEffects; }
// public void activeStatusEffects(java.util.Map value) { wrapperContained.activeStatusEffects = value; }
// public static java.util.Map activeStatusEffects() { return net.minecraft.entity.LivingEntity.activeStatusEffects; }
// public static void activeStatusEffects(java.util.Map value, ) { net.minecraft.entity.LivingEntity.activeStatusEffects = value; }

// public boolean jumping() { return wrapperContained.jumping; }
// public void jumping(boolean value) { wrapperContained.jumping = value; }
// public static boolean jumping() { return net.minecraft.entity.LivingEntity.jumping; }
// public static void jumping(boolean value, ) { net.minecraft.entity.LivingEntity.jumping = value; }

public float bodyYaw() { return wrapperContained.bodyYaw; }
public void bodyYaw(float value) { wrapperContained.bodyYaw = value; }
// public static float bodyYaw() { return net.minecraft.entity.LivingEntity.bodyYaw; }
// public static void bodyYaw(float value, ) { net.minecraft.entity.LivingEntity.bodyYaw = value; }

// public boolean effectsChanged() { return wrapperContained.effectsChanged; }
// public void effectsChanged(boolean value) { wrapperContained.effectsChanged = value; }
// public static boolean effectsChanged() { return net.minecraft.entity.LivingEntity.effectsChanged; }
// public static void effectsChanged(boolean value, ) { net.minecraft.entity.LivingEntity.effectsChanged = value; }

// public float movementSpeed() { return wrapperContained.movementSpeed; }
// public void movementSpeed(float value) { wrapperContained.movementSpeed = value; }
// public static float movementSpeed() { return net.minecraft.entity.LivingEntity.movementSpeed; }
// public static void movementSpeed(float value, ) { net.minecraft.entity.LivingEntity.movementSpeed = value; }

// public yarnwrap.entity.EntityDimensions SLEEPING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.SLEEPING_DIMENSIONS); }
// public void SLEEPING_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.SLEEPING_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions SLEEPING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.LivingEntity.SLEEPING_DIMENSIONS); }
// public static void SLEEPING_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.LivingEntity.SLEEPING_DIMENSIONS = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData SLEEPING_POSITION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SLEEPING_POSITION); }
// public void SLEEPING_POSITION(yarnwrap.entity.data.TrackedData value) { wrapperContained.SLEEPING_POSITION = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SLEEPING_POSITION() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.LivingEntity.SLEEPING_POSITION); }
// public static void SLEEPING_POSITION(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.LivingEntity.SLEEPING_POSITION = value.wrapperContained; }

// public yarnwrap.entity.ai.brain.Brain brain() { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.brain); }
// public void brain(yarnwrap.entity.ai.brain.Brain value) { wrapperContained.brain = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.Brain brain() { return new yarnwrap.entity.ai.brain.Brain(net.minecraft.entity.LivingEntity.brain); }
// public static void brain(yarnwrap.entity.ai.brain.Brain value, ) { net.minecraft.entity.LivingEntity.brain = value.wrapperContained; }

public int stuckStingerTimer() { return wrapperContained.stuckStingerTimer; }
public void stuckStingerTimer(int value) { wrapperContained.stuckStingerTimer = value; }
// public static int stuckStingerTimer() { return net.minecraft.entity.LivingEntity.stuckStingerTimer; }
// public static void stuckStingerTimer(int value, ) { net.minecraft.entity.LivingEntity.stuckStingerTimer = value; }

// public yarnwrap.entity.data.TrackedData STINGER_COUNT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STINGER_COUNT); }
// public void STINGER_COUNT(yarnwrap.entity.data.TrackedData value) { wrapperContained.STINGER_COUNT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData STINGER_COUNT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.LivingEntity.STINGER_COUNT); }
// public static void STINGER_COUNT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.LivingEntity.STINGER_COUNT = value.wrapperContained; }

// public java.util.Optional climbingPos() { return wrapperContained.climbingPos; }
// public void climbingPos(java.util.Optional value) { wrapperContained.climbingPos = value; }
// public static java.util.Optional climbingPos() { return net.minecraft.entity.LivingEntity.climbingPos; }
// public static void climbingPos(java.util.Optional value, ) { net.minecraft.entity.LivingEntity.climbingPos = value; }

// public yarnwrap.util.Identifier POWDER_SNOW_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.POWDER_SNOW_SPEED_MODIFIER_ID); }
// public void POWDER_SNOW_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.POWDER_SNOW_SPEED_MODIFIER_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier POWDER_SNOW_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(net.minecraft.entity.LivingEntity.POWDER_SNOW_SPEED_MODIFIER_ID); }
// public static void POWDER_SNOW_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.entity.LivingEntity.POWDER_SNOW_SPEED_MODIFIER_ID = value.wrapperContained; }

// public int USING_ITEM_FLAG() { return wrapperContained.USING_ITEM_FLAG; }
// public void USING_ITEM_FLAG(int value) { wrapperContained.USING_ITEM_FLAG = value; }
// public static int USING_ITEM_FLAG() { return net.minecraft.entity.LivingEntity.USING_ITEM_FLAG; }
// public static void USING_ITEM_FLAG(int value, ) { net.minecraft.entity.LivingEntity.USING_ITEM_FLAG = value; }

// public int OFF_HAND_ACTIVE_FLAG() { return wrapperContained.OFF_HAND_ACTIVE_FLAG; }
// public void OFF_HAND_ACTIVE_FLAG(int value) { wrapperContained.OFF_HAND_ACTIVE_FLAG = value; }
// public static int OFF_HAND_ACTIVE_FLAG() { return net.minecraft.entity.LivingEntity.OFF_HAND_ACTIVE_FLAG; }
// public static void OFF_HAND_ACTIVE_FLAG(int value, ) { net.minecraft.entity.LivingEntity.OFF_HAND_ACTIVE_FLAG = value; }

// public int USING_RIPTIDE_FLAG() { return wrapperContained.USING_RIPTIDE_FLAG; }
// public void USING_RIPTIDE_FLAG(int value) { wrapperContained.USING_RIPTIDE_FLAG = value; }
// public static int USING_RIPTIDE_FLAG() { return net.minecraft.entity.LivingEntity.USING_RIPTIDE_FLAG; }
// public static void USING_RIPTIDE_FLAG(int value, ) { net.minecraft.entity.LivingEntity.USING_RIPTIDE_FLAG = value; }

// public float BABY_SCALE_FACTOR() { return wrapperContained.BABY_SCALE_FACTOR; }
// public void BABY_SCALE_FACTOR(float value) { wrapperContained.BABY_SCALE_FACTOR = value; }
public static float BABY_SCALE_FACTOR() { return net.minecraft.entity.LivingEntity.BABY_SCALE_FACTOR; }
// public static void BABY_SCALE_FACTOR(float value, ) { net.minecraft.entity.LivingEntity.BABY_SCALE_FACTOR = value; }

// public int EQUIPMENT_SLOT_ID() { return wrapperContained.EQUIPMENT_SLOT_ID; }
// public void EQUIPMENT_SLOT_ID(int value) { wrapperContained.EQUIPMENT_SLOT_ID = value; }
public static int EQUIPMENT_SLOT_ID() { return net.minecraft.entity.LivingEntity.EQUIPMENT_SLOT_ID; }
// public static void EQUIPMENT_SLOT_ID(int value, ) { net.minecraft.entity.LivingEntity.EQUIPMENT_SLOT_ID = value; }

// public int GLOWING_FLAG() { return wrapperContained.GLOWING_FLAG; }
// public void GLOWING_FLAG(int value) { wrapperContained.GLOWING_FLAG = value; }
public static int GLOWING_FLAG() { return net.minecraft.entity.LivingEntity.GLOWING_FLAG; }
// public static void GLOWING_FLAG(int value, ) { net.minecraft.entity.LivingEntity.GLOWING_FLAG = value; }

// public double GRAVITY() { return wrapperContained.GRAVITY; }
// public void GRAVITY(double value) { wrapperContained.GRAVITY = value; }
public static double GRAVITY() { return net.minecraft.entity.LivingEntity.GRAVITY; }
// public static void GRAVITY(double value, ) { net.minecraft.entity.LivingEntity.GRAVITY = value; }

// public int DEATH_TICKS() { return wrapperContained.DEATH_TICKS; }
// public void DEATH_TICKS(int value) { wrapperContained.DEATH_TICKS = value; }
public static int DEATH_TICKS() { return net.minecraft.entity.LivingEntity.DEATH_TICKS; }
// public static void DEATH_TICKS(int value, ) { net.minecraft.entity.LivingEntity.DEATH_TICKS = value; }

// public boolean noDrag() { return wrapperContained.noDrag; }
// public void noDrag(boolean value) { wrapperContained.noDrag = value; }
// public static boolean noDrag() { return net.minecraft.entity.LivingEntity.noDrag; }
// public static void noDrag(boolean value, ) { net.minecraft.entity.LivingEntity.noDrag = value; }

// public double MAX_ENTITY_VIEWING_DISTANCE() { return wrapperContained.MAX_ENTITY_VIEWING_DISTANCE; }
// public void MAX_ENTITY_VIEWING_DISTANCE(double value) { wrapperContained.MAX_ENTITY_VIEWING_DISTANCE = value; }
// public static double MAX_ENTITY_VIEWING_DISTANCE() { return net.minecraft.entity.LivingEntity.MAX_ENTITY_VIEWING_DISTANCE; }
// public static void MAX_ENTITY_VIEWING_DISTANCE(double value, ) { net.minecraft.entity.LivingEntity.MAX_ENTITY_VIEWING_DISTANCE = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.LivingEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.LivingEntity.LOGGER = value; }

// public boolean experienceDroppingDisabled() { return wrapperContained.experienceDroppingDisabled; }
// public void experienceDroppingDisabled(boolean value) { wrapperContained.experienceDroppingDisabled = value; }
// public static boolean experienceDroppingDisabled() { return net.minecraft.entity.LivingEntity.experienceDroppingDisabled; }
// public static void experienceDroppingDisabled(boolean value, ) { net.minecraft.entity.LivingEntity.experienceDroppingDisabled = value; }

public yarnwrap.entity.LimbAnimator limbAnimator() { return new yarnwrap.entity.LimbAnimator(wrapperContained.limbAnimator); }
// public void limbAnimator(yarnwrap.entity.LimbAnimator value) { wrapperContained.limbAnimator = value.wrapperContained; }
// public static yarnwrap.entity.LimbAnimator limbAnimator() { return new yarnwrap.entity.LimbAnimator(net.minecraft.entity.LivingEntity.limbAnimator); }
// public static void limbAnimator(yarnwrap.entity.LimbAnimator value, ) { net.minecraft.entity.LivingEntity.limbAnimator = value.wrapperContained; }

// public double serverHeadYaw() { return wrapperContained.serverHeadYaw; }
// public void serverHeadYaw(double value) { wrapperContained.serverHeadYaw = value; }
// public static double serverHeadYaw() { return net.minecraft.entity.LivingEntity.serverHeadYaw; }
// public static void serverHeadYaw(double value, ) { net.minecraft.entity.LivingEntity.serverHeadYaw = value; }

// public java.lang.String ACTIVE_EFFECTS_KEY() { return wrapperContained.ACTIVE_EFFECTS_KEY; }
// public void ACTIVE_EFFECTS_KEY(java.lang.String value) { wrapperContained.ACTIVE_EFFECTS_KEY = value; }
// public static java.lang.String ACTIVE_EFFECTS_KEY() { return net.minecraft.entity.LivingEntity.ACTIVE_EFFECTS_KEY; }
// public static void ACTIVE_EFFECTS_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.ACTIVE_EFFECTS_KEY = value; }

// public yarnwrap.entity.data.TrackedData POTION_SWIRLS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.POTION_SWIRLS); }
// public void POTION_SWIRLS(yarnwrap.entity.data.TrackedData value) { wrapperContained.POTION_SWIRLS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData POTION_SWIRLS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.LivingEntity.POTION_SWIRLS); }
// public static void POTION_SWIRLS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.LivingEntity.POTION_SWIRLS = value.wrapperContained; }

// public float riptideAttackDamage() { return wrapperContained.riptideAttackDamage; }
// public void riptideAttackDamage(float value) { wrapperContained.riptideAttackDamage = value; }
// public static float riptideAttackDamage() { return net.minecraft.entity.LivingEntity.riptideAttackDamage; }
// public static void riptideAttackDamage(float value, ) { net.minecraft.entity.LivingEntity.riptideAttackDamage = value; }

// public yarnwrap.item.ItemStack riptideStack() { return new yarnwrap.item.ItemStack(wrapperContained.riptideStack); }
// public void riptideStack(yarnwrap.item.ItemStack value) { wrapperContained.riptideStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack riptideStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.riptideStack); }
// public static void riptideStack(yarnwrap.item.ItemStack value, ) { net.minecraft.entity.LivingEntity.riptideStack = value.wrapperContained; }

// public java.util.EnumMap locationBasedEnchantmentEffects() { return wrapperContained.locationBasedEnchantmentEffects; }
// public void locationBasedEnchantmentEffects(java.util.EnumMap value) { wrapperContained.locationBasedEnchantmentEffects = value; }
// public static java.util.EnumMap locationBasedEnchantmentEffects() { return net.minecraft.entity.LivingEntity.locationBasedEnchantmentEffects; }
// public static void locationBasedEnchantmentEffects(java.util.EnumMap value, ) { net.minecraft.entity.LivingEntity.locationBasedEnchantmentEffects = value; }

// public java.lang.String ATTRIBUTES_KEY() { return wrapperContained.ATTRIBUTES_KEY; }
// public void ATTRIBUTES_KEY(java.lang.String value) { wrapperContained.ATTRIBUTES_KEY = value; }
// public static java.lang.String ATTRIBUTES_KEY() { return net.minecraft.entity.LivingEntity.ATTRIBUTES_KEY; }
// public static void ATTRIBUTES_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.ATTRIBUTES_KEY = value; }

// public yarnwrap.util.Identifier SPRINTING_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.SPRINTING_SPEED_MODIFIER_ID); }
// public void SPRINTING_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.SPRINTING_SPEED_MODIFIER_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier SPRINTING_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(net.minecraft.entity.LivingEntity.SPRINTING_SPEED_MODIFIER_ID); }
// public static void SPRINTING_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.entity.LivingEntity.SPRINTING_SPEED_MODIFIER_ID = value.wrapperContained; }

public yarnwrap.entity.mob.ElytraFlightController elytraFlightController() { return new yarnwrap.entity.mob.ElytraFlightController(wrapperContained.elytraFlightController); }
// public void elytraFlightController(yarnwrap.entity.mob.ElytraFlightController value) { wrapperContained.elytraFlightController = value.wrapperContained; }
// public static yarnwrap.entity.mob.ElytraFlightController elytraFlightController() { return new yarnwrap.entity.mob.ElytraFlightController(net.minecraft.entity.LivingEntity.elytraFlightController); }
// public static void elytraFlightController(yarnwrap.entity.mob.ElytraFlightController value, ) { net.minecraft.entity.LivingEntity.elytraFlightController = value.wrapperContained; }

// public java.util.function.Predicate NOT_WEARING_GAZE_DISGUISE_PREDICATE() { return wrapperContained.NOT_WEARING_GAZE_DISGUISE_PREDICATE; }
// public void NOT_WEARING_GAZE_DISGUISE_PREDICATE(java.util.function.Predicate value) { wrapperContained.NOT_WEARING_GAZE_DISGUISE_PREDICATE = value; }
public static java.util.function.Predicate NOT_WEARING_GAZE_DISGUISE_PREDICATE() { return net.minecraft.entity.LivingEntity.NOT_WEARING_GAZE_DISGUISE_PREDICATE; }
// public static void NOT_WEARING_GAZE_DISGUISE_PREDICATE(java.util.function.Predicate value, ) { net.minecraft.entity.LivingEntity.NOT_WEARING_GAZE_DISGUISE_PREDICATE = value; }

// public yarnwrap.entity.LazyEntityReference attackerReference() { return new yarnwrap.entity.LazyEntityReference(wrapperContained.attackerReference); }
// public void attackerReference(yarnwrap.entity.LazyEntityReference value) { wrapperContained.attackerReference = value.wrapperContained; }
// public static yarnwrap.entity.LazyEntityReference attackerReference() { return new yarnwrap.entity.LazyEntityReference(net.minecraft.entity.LivingEntity.attackerReference); }
// public static void attackerReference(yarnwrap.entity.LazyEntityReference value, ) { net.minecraft.entity.LivingEntity.attackerReference = value.wrapperContained; }

// public yarnwrap.entity.PositionInterpolator interpolator() { return new yarnwrap.entity.PositionInterpolator(wrapperContained.interpolator); }
// public void interpolator(yarnwrap.entity.PositionInterpolator value) { wrapperContained.interpolator = value.wrapperContained; }
// public static yarnwrap.entity.PositionInterpolator interpolator() { return new yarnwrap.entity.PositionInterpolator(net.minecraft.entity.LivingEntity.interpolator); }
// public static void interpolator(yarnwrap.entity.PositionInterpolator value, ) { net.minecraft.entity.LivingEntity.interpolator = value.wrapperContained; }

// public java.util.Map lastEquipmentStacks() { return wrapperContained.lastEquipmentStacks; }
// public void lastEquipmentStacks(java.util.Map value) { wrapperContained.lastEquipmentStacks = value; }
// public static java.util.Map lastEquipmentStacks() { return net.minecraft.entity.LivingEntity.lastEquipmentStacks; }
// public static void lastEquipmentStacks(java.util.Map value, ) { net.minecraft.entity.LivingEntity.lastEquipmentStacks = value; }

// public yarnwrap.entity.EntityEquipment equipment() { return new yarnwrap.entity.EntityEquipment(wrapperContained.equipment); }
// public void equipment(yarnwrap.entity.EntityEquipment value) { wrapperContained.equipment = value.wrapperContained; }
// public static yarnwrap.entity.EntityEquipment equipment() { return new yarnwrap.entity.EntityEquipment(net.minecraft.entity.LivingEntity.equipment); }
// public static void equipment(yarnwrap.entity.EntityEquipment value, ) { net.minecraft.entity.LivingEntity.equipment = value.wrapperContained; }

// public Object waypointConfig() { return wrapperContained.waypointConfig; }
// public void waypointConfig(Object value) { wrapperContained.waypointConfig = value; }
// // public static Object waypointConfig() { return net.minecraft.entity.LivingEntity.waypointConfig; }
// public static void waypointConfig(Object value, ) { net.minecraft.entity.LivingEntity.waypointConfig = value; }

// public com.mojang.serialization.Dynamic BRAIN() { return wrapperContained.BRAIN; }
// public void BRAIN(com.mojang.serialization.Dynamic value) { wrapperContained.BRAIN = value; }
// public static com.mojang.serialization.Dynamic BRAIN() { return net.minecraft.entity.LivingEntity.BRAIN; }
// public static void BRAIN(com.mojang.serialization.Dynamic value, ) { net.minecraft.entity.LivingEntity.BRAIN = value; }

// public java.lang.String SLEEPING_POS_KEY() { return wrapperContained.SLEEPING_POS_KEY; }
// public void SLEEPING_POS_KEY(java.lang.String value) { wrapperContained.SLEEPING_POS_KEY = value; }
// public static java.lang.String SLEEPING_POS_KEY() { return net.minecraft.entity.LivingEntity.SLEEPING_POS_KEY; }
// public static void SLEEPING_POS_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.SLEEPING_POS_KEY = value; }

// public java.lang.String EQUIPMENT_KEY() { return wrapperContained.EQUIPMENT_KEY; }
// public void EQUIPMENT_KEY(java.lang.String value) { wrapperContained.EQUIPMENT_KEY = value; }
// public static java.lang.String EQUIPMENT_KEY() { return net.minecraft.entity.LivingEntity.EQUIPMENT_KEY; }
// public static void EQUIPMENT_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.EQUIPMENT_KEY = value; }

// public java.lang.String BRAIN_KEY() { return wrapperContained.BRAIN_KEY; }
// public void BRAIN_KEY(java.lang.String value) { wrapperContained.BRAIN_KEY = value; }
// public static java.lang.String BRAIN_KEY() { return net.minecraft.entity.LivingEntity.BRAIN_KEY; }
// public static void BRAIN_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.BRAIN_KEY = value; }

// public java.lang.String FALL_FLYING_KEY() { return wrapperContained.FALL_FLYING_KEY; }
// public void FALL_FLYING_KEY(java.lang.String value) { wrapperContained.FALL_FLYING_KEY = value; }
// public static java.lang.String FALL_FLYING_KEY() { return net.minecraft.entity.LivingEntity.FALL_FLYING_KEY; }
// public static void FALL_FLYING_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.FALL_FLYING_KEY = value; }

// public java.lang.String HURT_TIME_KEY() { return wrapperContained.HURT_TIME_KEY; }
// public void HURT_TIME_KEY(java.lang.String value) { wrapperContained.HURT_TIME_KEY = value; }
// public static java.lang.String HURT_TIME_KEY() { return net.minecraft.entity.LivingEntity.HURT_TIME_KEY; }
// public static void HURT_TIME_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.HURT_TIME_KEY = value; }

// public java.lang.String DEATH_TIME_KEY() { return wrapperContained.DEATH_TIME_KEY; }
// public void DEATH_TIME_KEY(java.lang.String value) { wrapperContained.DEATH_TIME_KEY = value; }
// public static java.lang.String DEATH_TIME_KEY() { return net.minecraft.entity.LivingEntity.DEATH_TIME_KEY; }
// public static void DEATH_TIME_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.DEATH_TIME_KEY = value; }

// public java.lang.String HURT_BY_TIMESTAMP_KEY() { return wrapperContained.HURT_BY_TIMESTAMP_KEY; }
// public void HURT_BY_TIMESTAMP_KEY(java.lang.String value) { wrapperContained.HURT_BY_TIMESTAMP_KEY = value; }
// public static java.lang.String HURT_BY_TIMESTAMP_KEY() { return net.minecraft.entity.LivingEntity.HURT_BY_TIMESTAMP_KEY; }
// public static void HURT_BY_TIMESTAMP_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.HURT_BY_TIMESTAMP_KEY = value; }

// public java.lang.String HEALTH_KEY() { return wrapperContained.HEALTH_KEY; }
// public void HEALTH_KEY(java.lang.String value) { wrapperContained.HEALTH_KEY = value; }
// public static java.lang.String HEALTH_KEY() { return net.minecraft.entity.LivingEntity.HEALTH_KEY; }
// public static void HEALTH_KEY(java.lang.String value, ) { net.minecraft.entity.LivingEntity.HEALTH_KEY = value; }

public void equipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { wrapperContained.equipStack(slot.wrapperContained,stack.wrapperContained); }
// public static void equipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.LivingEntity.equipStack(slot.wrapperContained,stack.wrapperContained); }
public boolean isInvulnerableTo(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source) { return wrapperContained.isInvulnerableTo(world.wrapperContained,source.wrapperContained); }
// public static boolean isInvulnerableTo(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.entity.LivingEntity.isInvulnerableTo(world.wrapperContained,source.wrapperContained); }
public boolean canPickUpLoot() { return wrapperContained.canPickUpLoot(); }
// public static boolean canPickUpLoot() { return net.minecraft.entity.LivingEntity.canPickUpLoot(); }
public boolean canTarget(yarnwrap.entity.EntityType type) { return wrapperContained.canTarget(type.wrapperContained); }
// public static boolean canTarget(yarnwrap.entity.EntityType type, ) { return net.minecraft.entity.LivingEntity.canTarget(type.wrapperContained); }
public yarnwrap.entity.attribute.EntityAttributeInstance getAttributeInstance(yarnwrap.registry.entry.RegistryEntry attribute) { return new yarnwrap.entity.attribute.EntityAttributeInstance(wrapperContained.getAttributeInstance(attribute.wrapperContained)); }
// public static yarnwrap.entity.attribute.EntityAttributeInstance getAttributeInstance(yarnwrap.registry.entry.RegistryEntry attribute, ) { return new yarnwrap.entity.attribute.EntityAttributeInstance(net.minecraft.entity.LivingEntity.getAttributeInstance(attribute.wrapperContained)); }
// public void attackLivingEntity(yarnwrap.entity.LivingEntity target) { wrapperContained.attackLivingEntity(target.wrapperContained); }
// public static void attackLivingEntity(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.LivingEntity.attackLivingEntity(target.wrapperContained); }
public yarnwrap.item.ItemStack getStackInHand(yarnwrap.util.Hand hand) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInHand(hand.wrapperContained)); }
// public static yarnwrap.item.ItemStack getStackInHand(yarnwrap.util.Hand hand, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.getStackInHand(hand.wrapperContained)); }
public boolean hasInvertedHealingAndHarm() { return wrapperContained.hasInvertedHealingAndHarm(); }
// public static boolean hasInvertedHealingAndHarm() { return net.minecraft.entity.LivingEntity.hasInvertedHealingAndHarm(); }
public void enterCombat() { wrapperContained.enterCombat(); }
// public static void enterCombat() { net.minecraft.entity.LivingEntity.enterCombat(); }
// public yarnwrap.sound.SoundEvent getDeathSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getDeathSound()); }
// public static yarnwrap.sound.SoundEvent getDeathSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.LivingEntity.getDeathSound()); }
public int getGlidingTicks() { return wrapperContained.getGlidingTicks(); }
// public static int getGlidingTicks() { return net.minecraft.entity.LivingEntity.getGlidingTicks(); }
public void takeKnockback(double strength,double x,double z) { wrapperContained.takeKnockback(strength,x,z); }
// public static void takeKnockback(double strength,double x,double z, ) { net.minecraft.entity.LivingEntity.takeKnockback(strength,x,z); }
public void setNearbySongPlaying(yarnwrap.util.math.BlockPos songPosition,boolean playing) { wrapperContained.setNearbySongPlaying(songPosition.wrapperContained,playing); }
// public static void setNearbySongPlaying(yarnwrap.util.math.BlockPos songPosition,boolean playing, ) { net.minecraft.entity.LivingEntity.setNearbySongPlaying(songPosition.wrapperContained,playing); }
public void tickMovement() { wrapperContained.tickMovement(); }
// public static void tickMovement() { net.minecraft.entity.LivingEntity.tickMovement(); }
// public void markEffectsDirty() { wrapperContained.markEffectsDirty(); }
// public static void markEffectsDirty() { net.minecraft.entity.LivingEntity.markEffectsDirty(); }
// public void onStatusEffectUpgraded(yarnwrap.entity.effect.StatusEffectInstance effect,boolean reapplyEffect,yarnwrap.entity.Entity source) { wrapperContained.onStatusEffectUpgraded(effect.wrapperContained,reapplyEffect,source.wrapperContained); }
// public static void onStatusEffectUpgraded(yarnwrap.entity.effect.StatusEffectInstance effect,boolean reapplyEffect,yarnwrap.entity.Entity source, ) { net.minecraft.entity.LivingEntity.onStatusEffectUpgraded(effect.wrapperContained,reapplyEffect,source.wrapperContained); }
// public void swimUpward(yarnwrap.registry.tag.TagKey fluid) { wrapperContained.swimUpward(fluid.wrapperContained); }
// public static void swimUpward(yarnwrap.registry.tag.TagKey fluid, ) { net.minecraft.entity.LivingEntity.swimUpward(fluid.wrapperContained); }
// public yarnwrap.sound.SoundEvent getHurtSound(yarnwrap.entity.damage.DamageSource source) { return new yarnwrap.sound.SoundEvent(wrapperContained.getHurtSound(source.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent getHurtSound(yarnwrap.entity.damage.DamageSource source, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.LivingEntity.getHurtSound(source.wrapperContained)); }
public boolean clearStatusEffects() { return wrapperContained.clearStatusEffects(); }
// public static boolean clearStatusEffects() { return net.minecraft.entity.LivingEntity.clearStatusEffects(); }
// public void playHurtSound(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.playHurtSound(damageSource.wrapperContained); }
// public static void playHurtSound(yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.LivingEntity.playHurtSound(damageSource.wrapperContained); }
public int getItemUseTimeLeft() { return wrapperContained.getItemUseTimeLeft(); }
// public static int getItemUseTimeLeft() { return net.minecraft.entity.LivingEntity.getItemUseTimeLeft(); }
public void setAttacker(yarnwrap.entity.LivingEntity attacker) { wrapperContained.setAttacker(attacker.wrapperContained); }
// public static void setAttacker(yarnwrap.entity.LivingEntity attacker, ) { net.minecraft.entity.LivingEntity.setAttacker(attacker.wrapperContained); }
public boolean removeStatusEffect(yarnwrap.registry.entry.RegistryEntry effect) { return wrapperContained.removeStatusEffect(effect.wrapperContained); }
// public static boolean removeStatusEffect(yarnwrap.registry.entry.RegistryEntry effect, ) { return net.minecraft.entity.LivingEntity.removeStatusEffect(effect.wrapperContained); }
public float getSoundPitch() { return wrapperContained.getSoundPitch(); }
// public static float getSoundPitch() { return net.minecraft.entity.LivingEntity.getSoundPitch(); }
public void setCurrentHand(yarnwrap.util.Hand hand) { wrapperContained.setCurrentHand(hand.wrapperContained); }
// public static void setCurrentHand(yarnwrap.util.Hand hand, ) { net.minecraft.entity.LivingEntity.setCurrentHand(hand.wrapperContained); }
// public void onStatusEffectApplied(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source) { wrapperContained.onStatusEffectApplied(effect.wrapperContained,source.wrapperContained); }
// public static void onStatusEffectApplied(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source, ) { net.minecraft.entity.LivingEntity.onStatusEffectApplied(effect.wrapperContained,source.wrapperContained); }
public void clearActiveItem() { wrapperContained.clearActiveItem(); }
// public static void clearActiveItem() { net.minecraft.entity.LivingEntity.clearActiveItem(); }
public int getStuckArrowCount() { return wrapperContained.getStuckArrowCount(); }
// public static int getStuckArrowCount() { return net.minecraft.entity.LivingEntity.getStuckArrowCount(); }
// public void tickNewAi() { wrapperContained.tickNewAi(); }
// public static void tickNewAi() { net.minecraft.entity.LivingEntity.tickNewAi(); }
public float getLeaningPitch(float tickProgress) { return wrapperContained.getLeaningPitch(tickProgress); }
// public static float getLeaningPitch(float tickProgress, ) { return net.minecraft.entity.LivingEntity.getLeaningPitch(tickProgress); }
public void heal(float amount) { wrapperContained.heal(amount); }
// public static void heal(float amount, ) { net.minecraft.entity.LivingEntity.heal(amount); }
public java.util.Collection getStatusEffects() { return wrapperContained.getStatusEffects(); }
// public static java.util.Collection getStatusEffects() { return net.minecraft.entity.LivingEntity.getStatusEffects(); }
// public void updatePotionVisibility() { wrapperContained.updatePotionVisibility(); }
// public static void updatePotionVisibility() { net.minecraft.entity.LivingEntity.updatePotionVisibility(); }
// public int getHandSwingDuration() { return wrapperContained.getHandSwingDuration(); }
// public static int getHandSwingDuration() { return net.minecraft.entity.LivingEntity.getHandSwingDuration(); }
public float getMovementSpeed() { return wrapperContained.getMovementSpeed(); }
// public static float getMovementSpeed() { return net.minecraft.entity.LivingEntity.getMovementSpeed(); }
public yarnwrap.item.ItemStack getActiveItem() { return new yarnwrap.item.ItemStack(wrapperContained.getActiveItem()); }
// public static yarnwrap.item.ItemStack getActiveItem() { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.getActiveItem()); }
// public void turnHead(float bodyRotation) { wrapperContained.turnHead(bodyRotation); }
// public static void turnHead(float bodyRotation, ) { net.minecraft.entity.LivingEntity.turnHead(bodyRotation); }
public float getHealth() { return wrapperContained.getHealth(); }
// public static float getHealth() { return net.minecraft.entity.LivingEntity.getHealth(); }
public void setHealth(float health) { wrapperContained.setHealth(health); }
// public static void setHealth(float health, ) { net.minecraft.entity.LivingEntity.setHealth(health); }
// public void tickRiptide(yarnwrap.util.math.Box a,yarnwrap.util.math.Box b) { wrapperContained.tickRiptide(a.wrapperContained,b.wrapperContained); }
// public static void tickRiptide(yarnwrap.util.math.Box a,yarnwrap.util.math.Box b, ) { net.minecraft.entity.LivingEntity.tickRiptide(a.wrapperContained,b.wrapperContained); }
// public float modifyAppliedDamage(yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.modifyAppliedDamage(source.wrapperContained,amount); }
// public static float modifyAppliedDamage(yarnwrap.entity.damage.DamageSource source,float amount, ) { return net.minecraft.entity.LivingEntity.modifyAppliedDamage(source.wrapperContained,amount); }
public void spawnItemParticles(yarnwrap.item.ItemStack stack,int count) { wrapperContained.spawnItemParticles(stack.wrapperContained,count); }
// public static void spawnItemParticles(yarnwrap.item.ItemStack stack,int count, ) { net.minecraft.entity.LivingEntity.spawnItemParticles(stack.wrapperContained,count); }
// public void onDismounted(yarnwrap.entity.Entity vehicle) { wrapperContained.onDismounted(vehicle.wrapperContained); }
// public static void onDismounted(yarnwrap.entity.Entity vehicle, ) { net.minecraft.entity.LivingEntity.onDismounted(vehicle.wrapperContained); }
public boolean isBlocking() { return wrapperContained.isBlocking(); }
// public static boolean isBlocking() { return net.minecraft.entity.LivingEntity.isBlocking(); }
// public void consumeItem() { wrapperContained.consumeItem(); }
// public static void consumeItem() { net.minecraft.entity.LivingEntity.consumeItem(); }
// public yarnwrap.sound.SoundEvent getFallSound(int distance) { return new yarnwrap.sound.SoundEvent(wrapperContained.getFallSound(distance)); }
// public static yarnwrap.sound.SoundEvent getFallSound(int distance, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.LivingEntity.getFallSound(distance)); }
public void jump() { wrapperContained.jump(); }
// public static void jump() { net.minecraft.entity.LivingEntity.jump(); }
public void endCombat() { wrapperContained.endCombat(); }
// public static void endCombat() { net.minecraft.entity.LivingEntity.endCombat(); }
// public void playEquipmentBreakEffects(yarnwrap.item.ItemStack stack) { wrapperContained.playEquipmentBreakEffects(stack.wrapperContained); }
// public static void playEquipmentBreakEffects(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.LivingEntity.playEquipmentBreakEffects(stack.wrapperContained); }
public yarnwrap.item.ItemStack getMainHandStack() { return new yarnwrap.item.ItemStack(wrapperContained.getMainHandStack()); }
// public static yarnwrap.item.ItemStack getMainHandStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.getMainHandStack()); }
public int getItemUseTime() { return wrapperContained.getItemUseTime(); }
// public static int getItemUseTime() { return net.minecraft.entity.LivingEntity.getItemUseTime(); }
public boolean canHaveStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { return wrapperContained.canHaveStatusEffect(effect.wrapperContained); }
// public static boolean canHaveStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect, ) { return net.minecraft.entity.LivingEntity.canHaveStatusEffect(effect.wrapperContained); }
// public void tickStatusEffects() { wrapperContained.tickStatusEffects(); }
// public static void tickStatusEffects() { net.minecraft.entity.LivingEntity.tickStatusEffects(); }
public yarnwrap.entity.LivingEntity getAttacking() { return new yarnwrap.entity.LivingEntity(wrapperContained.getAttacking()); }
// public static yarnwrap.entity.LivingEntity getAttacking() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.LivingEntity.getAttacking()); }
// public void tickGliding() { wrapperContained.tickGliding(); }
// public static void tickGliding() { net.minecraft.entity.LivingEntity.tickGliding(); }
public boolean shouldDropExperience() { return wrapperContained.shouldDropExperience(); }
// public static boolean shouldDropExperience() { return net.minecraft.entity.LivingEntity.shouldDropExperience(); }
public float getHandSwingProgress(float tickProgress) { return wrapperContained.getHandSwingProgress(tickProgress); }
// public static float getHandSwingProgress(float tickProgress, ) { return net.minecraft.entity.LivingEntity.getHandSwingProgress(tickProgress); }
public boolean canSee(yarnwrap.entity.Entity entity) { return wrapperContained.canSee(entity.wrapperContained); }
// public static boolean canSee(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.LivingEntity.canSee(entity.wrapperContained); }
public yarnwrap.util.Hand getActiveHand() { return new yarnwrap.util.Hand(wrapperContained.getActiveHand()); }
// public static yarnwrap.util.Hand getActiveHand() { return new yarnwrap.util.Hand(net.minecraft.entity.LivingEntity.getActiveHand()); }
public boolean hasStatusEffect(yarnwrap.registry.entry.RegistryEntry effect) { return wrapperContained.hasStatusEffect(effect.wrapperContained); }
// public static boolean hasStatusEffect(yarnwrap.registry.entry.RegistryEntry effect, ) { return net.minecraft.entity.LivingEntity.hasStatusEffect(effect.wrapperContained); }
// public void knockback(yarnwrap.entity.LivingEntity target) { wrapperContained.knockback(target.wrapperContained); }
// public static void knockback(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.LivingEntity.knockback(target.wrapperContained); }
// public boolean isImmobile() { return wrapperContained.isImmobile(); }
// public static boolean isImmobile() { return net.minecraft.entity.LivingEntity.isImmobile(); }
public float getMaxHealth() { return wrapperContained.getMaxHealth(); }
// public static float getMaxHealth() { return net.minecraft.entity.LivingEntity.getMaxHealth(); }
// public int getNextAirOnLand(int air) { return wrapperContained.getNextAirOnLand(air); }
// public static int getNextAirOnLand(int air, ) { return net.minecraft.entity.LivingEntity.getNextAirOnLand(air); }
public yarnwrap.entity.LivingEntity getAttacker() { return new yarnwrap.entity.LivingEntity(wrapperContained.getAttacker()); }
// public static yarnwrap.entity.LivingEntity getAttacker() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.LivingEntity.getAttacker()); }
public yarnwrap.entity.damage.DamageTracker getDamageTracker() { return new yarnwrap.entity.damage.DamageTracker(wrapperContained.getDamageTracker()); }
// public static yarnwrap.entity.damage.DamageTracker getDamageTracker() { return new yarnwrap.entity.damage.DamageTracker(net.minecraft.entity.LivingEntity.getDamageTracker()); }
public float getAbsorptionAmount() { return wrapperContained.getAbsorptionAmount(); }
// public static float getAbsorptionAmount() { return net.minecraft.entity.LivingEntity.getAbsorptionAmount(); }
public yarnwrap.util.Arm getMainArm() { return new yarnwrap.util.Arm(wrapperContained.getMainArm()); }
// public static yarnwrap.util.Arm getMainArm() { return new yarnwrap.util.Arm(net.minecraft.entity.LivingEntity.getMainArm()); }
// public void clearPotionSwirls() { wrapperContained.clearPotionSwirls(); }
// public static void clearPotionSwirls() { net.minecraft.entity.LivingEntity.clearPotionSwirls(); }
// public void tickCramming() { wrapperContained.tickCramming(); }
// public static void tickCramming() { net.minecraft.entity.LivingEntity.tickCramming(); }
// public boolean shouldAlwaysDropExperience() { return wrapperContained.shouldAlwaysDropExperience(); }
// public static boolean shouldAlwaysDropExperience() { return net.minecraft.entity.LivingEntity.shouldAlwaysDropExperience(); }
// public void updateLeaningPitch() { wrapperContained.updateLeaningPitch(); }
// public static void updateLeaningPitch() { net.minecraft.entity.LivingEntity.updateLeaningPitch(); }
public void setAbsorptionAmount(float absorptionAmount) { wrapperContained.setAbsorptionAmount(absorptionAmount); }
// public static void setAbsorptionAmount(float absorptionAmount, ) { net.minecraft.entity.LivingEntity.setAbsorptionAmount(absorptionAmount); }
// public void applyDamage(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.applyDamage(world.wrapperContained,source.wrapperContained,amount); }
// public static void applyDamage(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,float amount, ) { net.minecraft.entity.LivingEntity.applyDamage(world.wrapperContained,source.wrapperContained,amount); }
public void stopUsingItem() { wrapperContained.stopUsingItem(); }
// public static void stopUsingItem() { net.minecraft.entity.LivingEntity.stopUsingItem(); }
// public void tickActiveItemStack() { wrapperContained.tickActiveItemStack(); }
// public static void tickActiveItemStack() { net.minecraft.entity.LivingEntity.tickActiveItemStack(); }
// public boolean canEnterTrapdoor(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canEnterTrapdoor(pos.wrapperContained,state.wrapperContained); }
// public static boolean canEnterTrapdoor(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.entity.LivingEntity.canEnterTrapdoor(pos.wrapperContained,state.wrapperContained); }
public void onDeath(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.onDeath(damageSource.wrapperContained); }
// public static void onDeath(yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.LivingEntity.onDeath(damageSource.wrapperContained); }
public yarnwrap.item.ItemStack getOffHandStack() { return new yarnwrap.item.ItemStack(wrapperContained.getOffHandStack()); }
// public static yarnwrap.item.ItemStack getOffHandStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.getOffHandStack()); }
public yarnwrap.entity.damage.DamageSource getRecentDamageSource() { return new yarnwrap.entity.damage.DamageSource(wrapperContained.getRecentDamageSource()); }
// public static yarnwrap.entity.damage.DamageSource getRecentDamageSource() { return new yarnwrap.entity.damage.DamageSource(net.minecraft.entity.LivingEntity.getRecentDamageSource()); }
public boolean teleport(double x,double y,double z,boolean particleEffects) { return wrapperContained.teleport(x,y,z,particleEffects); }
// public static boolean teleport(double x,double y,double z,boolean particleEffects, ) { return net.minecraft.entity.LivingEntity.teleport(x,y,z,particleEffects); }
public int getLastAttackTime() { return wrapperContained.getLastAttackTime(); }
// public static int getLastAttackTime() { return net.minecraft.entity.LivingEntity.getLastAttackTime(); }
public boolean hasStackEquipped(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.hasStackEquipped(slot.wrapperContained); }
// public static boolean hasStackEquipped(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.hasStackEquipped(slot.wrapperContained); }
// public void setLivingFlag(int mask,boolean value) { wrapperContained.setLivingFlag(mask,value); }
// public static void setLivingFlag(int mask,boolean value, ) { net.minecraft.entity.LivingEntity.setLivingFlag(mask,value); }
public boolean isAffectedBySplashPotions() { return wrapperContained.isAffectedBySplashPotions(); }
// public static boolean isAffectedBySplashPotions() { return net.minecraft.entity.LivingEntity.isAffectedBySplashPotions(); }
// public void pushAway(yarnwrap.entity.Entity entity) { wrapperContained.pushAway(entity.wrapperContained); }
// public static void pushAway(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.LivingEntity.pushAway(entity.wrapperContained); }
public java.util.Map getActiveStatusEffects() { return wrapperContained.getActiveStatusEffects(); }
// public static java.util.Map getActiveStatusEffects() { return net.minecraft.entity.LivingEntity.getActiveStatusEffects(); }
// public boolean containsOnlyAmbientEffects(java.util.Collection effects) { return wrapperContained.containsOnlyAmbientEffects(effects); }
// public static boolean containsOnlyAmbientEffects(java.util.Collection effects, ) { return net.minecraft.entity.LivingEntity.containsOnlyAmbientEffects(effects); }
// public void takeShieldHit(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity attacker) { wrapperContained.takeShieldHit(world.wrapperContained,attacker.wrapperContained); }
// public static void takeShieldHit(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity attacker, ) { net.minecraft.entity.LivingEntity.takeShieldHit(world.wrapperContained,attacker.wrapperContained); }
public void travel(yarnwrap.util.math.Vec3d movementInput) { wrapperContained.travel(movementInput.wrapperContained); }
// public static void travel(yarnwrap.util.math.Vec3d movementInput, ) { net.minecraft.entity.LivingEntity.travel(movementInput.wrapperContained); }
public boolean addStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect) { return wrapperContained.addStatusEffect(effect.wrapperContained); }
// public static boolean addStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect, ) { return net.minecraft.entity.LivingEntity.addStatusEffect(effect.wrapperContained); }
// public void knockDownwards() { wrapperContained.knockDownwards(); }
// public static void knockDownwards() { net.minecraft.entity.LivingEntity.knockDownwards(); }
public boolean canBreatheInWater() { return wrapperContained.canBreatheInWater(); }
// public static boolean canBreatheInWater() { return net.minecraft.entity.LivingEntity.canBreatheInWater(); }
// public boolean tryUseDeathProtector(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.tryUseDeathProtector(source.wrapperContained); }
// public static boolean tryUseDeathProtector(yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.entity.LivingEntity.tryUseDeathProtector(source.wrapperContained); }
public int getArmor() { return wrapperContained.getArmor(); }
// public static int getArmor() { return net.minecraft.entity.LivingEntity.getArmor(); }
public void setStuckArrowCount(int stuckArrowCount) { wrapperContained.setStuckArrowCount(stuckArrowCount); }
// public static void setStuckArrowCount(int stuckArrowCount, ) { net.minecraft.entity.LivingEntity.setStuckArrowCount(stuckArrowCount); }
// public void dropEquipment(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,boolean causedByPlayer) { wrapperContained.dropEquipment(world.wrapperContained,source.wrapperContained,causedByPlayer); }
// public static void dropEquipment(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,boolean causedByPlayer, ) { net.minecraft.entity.LivingEntity.dropEquipment(world.wrapperContained,source.wrapperContained,causedByPlayer); }
public void setJumping(boolean jumping) { wrapperContained.setJumping(jumping); }
// public static void setJumping(boolean jumping, ) { net.minecraft.entity.LivingEntity.setJumping(jumping); }
public boolean isClimbing() { return wrapperContained.isClimbing(); }
// public static boolean isClimbing() { return net.minecraft.entity.LivingEntity.isClimbing(); }
public boolean isMobOrPlayer() { return wrapperContained.isMobOrPlayer(); }
// public static boolean isMobOrPlayer() { return net.minecraft.entity.LivingEntity.isMobOrPlayer(); }
public void sendPickup(yarnwrap.entity.Entity item,int count) { wrapperContained.sendPickup(item.wrapperContained,count); }
// public static void sendPickup(yarnwrap.entity.Entity item,int count, ) { net.minecraft.entity.LivingEntity.sendPickup(item.wrapperContained,count); }
public void swingHand(yarnwrap.util.Hand hand) { wrapperContained.swingHand(hand.wrapperContained); }
// public static void swingHand(yarnwrap.util.Hand hand, ) { net.minecraft.entity.LivingEntity.swingHand(hand.wrapperContained); }
public void damageArmor(yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.damageArmor(source.wrapperContained,amount); }
// public static void damageArmor(yarnwrap.entity.damage.DamageSource source,float amount, ) { net.minecraft.entity.LivingEntity.damageArmor(source.wrapperContained,amount); }
// public float getJumpVelocity() { return wrapperContained.getJumpVelocity(); }
// public static float getJumpVelocity() { return net.minecraft.entity.LivingEntity.getJumpVelocity(); }
// public float getSoundVolume() { return wrapperContained.getSoundVolume(); }
// public static float getSoundVolume() { return net.minecraft.entity.LivingEntity.getSoundVolume(); }
// public void updatePostDeath() { wrapperContained.updatePostDeath(); }
// public static void updatePostDeath() { net.minecraft.entity.LivingEntity.updatePostDeath(); }
public boolean isBaby() { return wrapperContained.isBaby(); }
// public static boolean isBaby() { return net.minecraft.entity.LivingEntity.isBaby(); }
// public int getExperienceToDrop(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getExperienceToDrop(world.wrapperContained); }
// public static int getExperienceToDrop(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.entity.LivingEntity.getExperienceToDrop(world.wrapperContained); }
public yarnwrap.entity.effect.StatusEffectInstance removeStatusEffectInternal(yarnwrap.registry.entry.RegistryEntry effect) { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.removeStatusEffectInternal(effect.wrapperContained)); }
// public static yarnwrap.entity.effect.StatusEffectInstance removeStatusEffectInternal(yarnwrap.registry.entry.RegistryEntry effect, ) { return new yarnwrap.entity.effect.StatusEffectInstance(net.minecraft.entity.LivingEntity.removeStatusEffectInternal(effect.wrapperContained)); }
public yarnwrap.entity.effect.StatusEffectInstance getStatusEffect(yarnwrap.registry.entry.RegistryEntry effect) { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.getStatusEffect(effect.wrapperContained)); }
// public static yarnwrap.entity.effect.StatusEffectInstance getStatusEffect(yarnwrap.registry.entry.RegistryEntry effect, ) { return new yarnwrap.entity.effect.StatusEffectInstance(net.minecraft.entity.LivingEntity.getStatusEffect(effect.wrapperContained)); }
public boolean isSleeping() { return wrapperContained.isSleeping(); }
// public static boolean isSleeping() { return net.minecraft.entity.LivingEntity.isSleeping(); }
public void onAttacking(yarnwrap.entity.Entity target) { wrapperContained.onAttacking(target.wrapperContained); }
// public static void onAttacking(yarnwrap.entity.Entity target, ) { net.minecraft.entity.LivingEntity.onAttacking(target.wrapperContained); }
public boolean isUsingItem() { return wrapperContained.isUsingItem(); }
// public static boolean isUsingItem() { return net.minecraft.entity.LivingEntity.isUsingItem(); }
public void onEquipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack oldStack,yarnwrap.item.ItemStack newStack) { wrapperContained.onEquipStack(slot.wrapperContained,oldStack.wrapperContained,newStack.wrapperContained); }
// public static void onEquipStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack oldStack,yarnwrap.item.ItemStack newStack, ) { net.minecraft.entity.LivingEntity.onEquipStack(slot.wrapperContained,oldStack.wrapperContained,newStack.wrapperContained); }
public int getLastAttackedTime() { return wrapperContained.getLastAttackedTime(); }
// public static int getLastAttackedTime() { return net.minecraft.entity.LivingEntity.getLastAttackedTime(); }
public yarnwrap.item.ItemStack getEquippedStack(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.getEquippedStack(slot.wrapperContained)); }
// public static yarnwrap.item.ItemStack getEquippedStack(yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.getEquippedStack(slot.wrapperContained)); }
// public void tickHandSwing() { wrapperContained.tickHandSwing(); }
// public static void tickHandSwing() { net.minecraft.entity.LivingEntity.tickHandSwing(); }
// public float getBaseWaterMovementSpeedMultiplier() { return wrapperContained.getBaseWaterMovementSpeedMultiplier(); }
// public static float getBaseWaterMovementSpeedMultiplier() { return net.minecraft.entity.LivingEntity.getBaseWaterMovementSpeedMultiplier(); }
public boolean tryAttack(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity target) { return wrapperContained.tryAttack(world.wrapperContained,target.wrapperContained); }
// public static boolean tryAttack(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity target, ) { return net.minecraft.entity.LivingEntity.tryAttack(world.wrapperContained,target.wrapperContained); }
public void setStackInHand(yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack) { wrapperContained.setStackInHand(hand.wrapperContained,stack.wrapperContained); }
// public static void setStackInHand(yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.LivingEntity.setStackInHand(hand.wrapperContained,stack.wrapperContained); }
public boolean isUsingRiptide() { return wrapperContained.isUsingRiptide(); }
// public static boolean isUsingRiptide() { return net.minecraft.entity.LivingEntity.isUsingRiptide(); }
public yarnwrap.entity.LivingEntity getPrimeAdversary() { return new yarnwrap.entity.LivingEntity(wrapperContained.getPrimeAdversary()); }
// public static yarnwrap.entity.LivingEntity getPrimeAdversary() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.LivingEntity.getPrimeAdversary()); }
public void setMovementSpeed(float movementSpeed) { wrapperContained.setMovementSpeed(movementSpeed); }
// public static void setMovementSpeed(float movementSpeed, ) { net.minecraft.entity.LivingEntity.setMovementSpeed(movementSpeed); }
// public void applyMovementEffects(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.applyMovementEffects(world.wrapperContained,pos.wrapperContained); }
// public static void applyMovementEffects(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.LivingEntity.applyMovementEffects(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.entity.attribute.AttributeContainer getAttributes() { return new yarnwrap.entity.attribute.AttributeContainer(wrapperContained.getAttributes()); }
// public static yarnwrap.entity.attribute.AttributeContainer getAttributes() { return new yarnwrap.entity.attribute.AttributeContainer(net.minecraft.entity.LivingEntity.getAttributes()); }
public boolean isGliding() { return wrapperContained.isGliding(); }
// public static boolean isGliding() { return net.minecraft.entity.LivingEntity.isGliding(); }
// public void onStatusEffectsRemoved(java.util.Collection effects) { wrapperContained.onStatusEffectsRemoved(effects); }
// public static void onStatusEffectsRemoved(java.util.Collection effects, ) { net.minecraft.entity.LivingEntity.onStatusEffectsRemoved(effects); }
// public int getNextAirUnderwater(int air) { return wrapperContained.getNextAirUnderwater(air); }
// public static int getNextAirUnderwater(int air, ) { return net.minecraft.entity.LivingEntity.getNextAirUnderwater(air); }
public int getDespawnCounter() { return wrapperContained.getDespawnCounter(); }
// public static int getDespawnCounter() { return net.minecraft.entity.LivingEntity.getDespawnCounter(); }
// public float applyArmorToDamage(yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.applyArmorToDamage(source.wrapperContained,amount); }
// public static float applyArmorToDamage(yarnwrap.entity.damage.DamageSource source,float amount, ) { return net.minecraft.entity.LivingEntity.applyArmorToDamage(source.wrapperContained,amount); }
public float getLuck() { return wrapperContained.getLuck(); }
// public static float getLuck() { return net.minecraft.entity.LivingEntity.getLuck(); }
public yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemStack stack,boolean dropAtSelf,boolean retainOwnership) { return new yarnwrap.entity.ItemEntity(wrapperContained.dropItem(stack.wrapperContained,dropAtSelf,retainOwnership)); }
// public static yarnwrap.entity.ItemEntity dropItem(yarnwrap.item.ItemStack stack,boolean dropAtSelf,boolean retainOwnership, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.LivingEntity.dropItem(stack.wrapperContained,dropAtSelf,retainOwnership)); }
// public void dropLoot(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource,boolean causedByPlayer) { wrapperContained.dropLoot(world.wrapperContained,damageSource.wrapperContained,causedByPlayer); }
// public static void dropLoot(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource,boolean causedByPlayer, ) { net.minecraft.entity.LivingEntity.dropLoot(world.wrapperContained,damageSource.wrapperContained,causedByPlayer); }
// public void dropInventory(yarnwrap.server.world.ServerWorld world) { wrapperContained.dropInventory(world.wrapperContained); }
// public static void dropInventory(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.LivingEntity.dropInventory(world.wrapperContained); }
// public void drop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.drop(world.wrapperContained,damageSource.wrapperContained); }
// public static void drop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.LivingEntity.drop(world.wrapperContained,damageSource.wrapperContained); }
public void setDespawnCounter(int despawnCounter) { wrapperContained.setDespawnCounter(despawnCounter); }
// public static void setDespawnCounter(int despawnCounter, ) { net.minecraft.entity.LivingEntity.setDespawnCounter(despawnCounter); }
public float getScaleFactor() { return wrapperContained.getScaleFactor(); }
// public static float getScaleFactor() { return net.minecraft.entity.LivingEntity.getScaleFactor(); }
public double getAttackDistanceScalingFactor(yarnwrap.entity.Entity entity) { return wrapperContained.getAttackDistanceScalingFactor(entity.wrapperContained); }
// public static double getAttackDistanceScalingFactor(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.LivingEntity.getAttackDistanceScalingFactor(entity.wrapperContained); }
// public void setPositionInBed(yarnwrap.util.math.BlockPos pos) { wrapperContained.setPositionInBed(pos.wrapperContained); }
// public static void setPositionInBed(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.LivingEntity.setPositionInBed(pos.wrapperContained); }
public boolean canTarget(yarnwrap.entity.LivingEntity target) { return wrapperContained.canTarget(target.wrapperContained); }
// public static boolean canTarget(yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.LivingEntity.canTarget(target.wrapperContained); }
public float getArmorVisibility() { return wrapperContained.getArmorVisibility(); }
// public static float getArmorVisibility() { return net.minecraft.entity.LivingEntity.getArmorVisibility(); }
public java.util.Optional getSleepingPosition() { return wrapperContained.getSleepingPosition(); }
// public static java.util.Optional getSleepingPosition() { return net.minecraft.entity.LivingEntity.getSleepingPosition(); }
public void clearSleepingPosition() { wrapperContained.clearSleepingPosition(); }
// public static void clearSleepingPosition() { net.minecraft.entity.LivingEntity.clearSleepingPosition(); }
public void wakeUp() { wrapperContained.wakeUp(); }
// public static void wakeUp() { net.minecraft.entity.LivingEntity.wakeUp(); }
public yarnwrap.util.math.Direction getSleepingDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getSleepingDirection()); }
// public static yarnwrap.util.math.Direction getSleepingDirection() { return new yarnwrap.util.math.Direction(net.minecraft.entity.LivingEntity.getSleepingDirection()); }
public void setSleepingPosition(yarnwrap.util.math.BlockPos pos) { wrapperContained.setSleepingPosition(pos.wrapperContained); }
// public static void setSleepingPosition(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.LivingEntity.setSleepingPosition(pos.wrapperContained); }
public void sleep(yarnwrap.util.math.BlockPos pos) { wrapperContained.sleep(pos.wrapperContained); }
// public static void sleep(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.LivingEntity.sleep(pos.wrapperContained); }
// public void method_18404(yarnwrap.util.math.BlockPos pos) { wrapperContained.method_18404(pos.wrapperContained); }
// public static void method_18404(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.LivingEntity.method_18404(pos.wrapperContained); }
// public java.lang.Boolean method_18405(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_18405(pos.wrapperContained); }
// public static java.lang.Boolean method_18405(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.LivingEntity.method_18405(pos.wrapperContained); }
// public boolean isSleepingInBed() { return wrapperContained.isSleepingInBed(); }
// public static boolean isSleepingInBed() { return net.minecraft.entity.LivingEntity.isSleepingInBed(); }
// public yarnwrap.util.math.Vec3d applyClimbingSpeed(yarnwrap.util.math.Vec3d motion) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyClimbingSpeed(motion.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d applyClimbingSpeed(yarnwrap.util.math.Vec3d motion, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.LivingEntity.applyClimbingSpeed(motion.wrapperContained)); }
// public float getMovementSpeed(float slipperiness) { return wrapperContained.getMovementSpeed(slipperiness); }
// public static float getMovementSpeed(float slipperiness, ) { return net.minecraft.entity.LivingEntity.getMovementSpeed(slipperiness); }
public yarnwrap.item.ItemStack getProjectileType(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.getProjectileType(stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack getProjectileType(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.getProjectileType(stack.wrapperContained)); }
// public yarnwrap.entity.ai.brain.Brain deserializeBrain(com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.deserializeBrain(dynamic)); }
// public static yarnwrap.entity.ai.brain.Brain deserializeBrain(com.mojang.serialization.Dynamic dynamic, ) { return new yarnwrap.entity.ai.brain.Brain(net.minecraft.entity.LivingEntity.deserializeBrain(dynamic)); }
public yarnwrap.entity.ai.brain.Brain getBrain() { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.getBrain()); }
// public static yarnwrap.entity.ai.brain.Brain getBrain() { return new yarnwrap.entity.ai.brain.Brain(net.minecraft.entity.LivingEntity.getBrain()); }
public void sendEquipmentBreakStatus(yarnwrap.item.Item item,yarnwrap.entity.EquipmentSlot slot) { wrapperContained.sendEquipmentBreakStatus(item.wrapperContained,slot.wrapperContained); }
// public static void sendEquipmentBreakStatus(yarnwrap.item.Item item,yarnwrap.entity.EquipmentSlot slot, ) { net.minecraft.entity.LivingEntity.sendEquipmentBreakStatus(item.wrapperContained,slot.wrapperContained); }
// public byte getEquipmentBreakStatus(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.getEquipmentBreakStatus(slot.wrapperContained); }
// public static byte getEquipmentBreakStatus(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.getEquipmentBreakStatus(slot.wrapperContained); }
public int getStingerCount() { return wrapperContained.getStingerCount(); }
// public static int getStingerCount() { return net.minecraft.entity.LivingEntity.getStingerCount(); }
public boolean isHoldingOntoLadder() { return wrapperContained.isHoldingOntoLadder(); }
// public static boolean isHoldingOntoLadder() { return net.minecraft.entity.LivingEntity.isHoldingOntoLadder(); }
public void setStingerCount(int stingerCount) { wrapperContained.setStingerCount(stingerCount); }
// public static void setStingerCount(int stingerCount, ) { net.minecraft.entity.LivingEntity.setStingerCount(stingerCount); }
// public void playBlockFallSound() { wrapperContained.playBlockFallSound(); }
// public static void playBlockFallSound() { net.minecraft.entity.LivingEntity.playBlockFallSound(); }
// public int computeFallDamage(double fallDistance,float damagePerDistance) { return wrapperContained.computeFallDamage(fallDistance,damagePerDistance); }
// public static int computeFallDamage(double fallDistance,float damagePerDistance, ) { return net.minecraft.entity.LivingEntity.computeFallDamage(fallDistance,damagePerDistance); }
public void swingHand(yarnwrap.util.Hand hand,boolean fromServerPlayer) { wrapperContained.swingHand(hand.wrapperContained,fromServerPlayer); }
// public static void swingHand(yarnwrap.util.Hand hand,boolean fromServerPlayer, ) { net.minecraft.entity.LivingEntity.swingHand(hand.wrapperContained,fromServerPlayer); }
// public void onKilledBy(yarnwrap.entity.LivingEntity adversary) { wrapperContained.onKilledBy(adversary.wrapperContained); }
// public static void onKilledBy(yarnwrap.entity.LivingEntity adversary, ) { net.minecraft.entity.LivingEntity.onKilledBy(adversary.wrapperContained); }
// public void dropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity attacker) { wrapperContained.dropExperience(world.wrapperContained,attacker.wrapperContained); }
// public static void dropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity attacker, ) { net.minecraft.entity.LivingEntity.dropExperience(world.wrapperContained,attacker.wrapperContained); }
public boolean isHolding(yarnwrap.item.Item item) { return wrapperContained.isHolding(item.wrapperContained); }
// public static boolean isHolding(yarnwrap.item.Item item, ) { return net.minecraft.entity.LivingEntity.isHolding(item.wrapperContained); }
// public boolean method_24519(yarnwrap.item.Item stack) { return wrapperContained.method_24519(stack.wrapperContained); }
// public static boolean method_24519(yarnwrap.item.Item stack, ) { return net.minecraft.entity.LivingEntity.method_24519(stack.wrapperContained); }
public boolean isHolding(java.util.function.Predicate predicate) { return wrapperContained.isHolding(predicate); }
// public static boolean isHolding(java.util.function.Predicate predicate, ) { return net.minecraft.entity.LivingEntity.isHolding(predicate); }
public com.google.common.collect.ImmutableList getPoses() { return wrapperContained.getPoses(); }
// public static com.google.common.collect.ImmutableList getPoses() { return net.minecraft.entity.LivingEntity.getPoses(); }
public java.util.Optional getClimbingPos() { return wrapperContained.getClimbingPos(); }
// public static java.util.Optional getClimbingPos() { return net.minecraft.entity.LivingEntity.getClimbingPos(); }
public yarnwrap.util.math.Box getBoundingBox(yarnwrap.entity.EntityPose pose) { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox(pose.wrapperContained)); }
// public static yarnwrap.util.math.Box getBoundingBox(yarnwrap.entity.EntityPose pose, ) { return new yarnwrap.util.math.Box(net.minecraft.entity.LivingEntity.getBoundingBox(pose.wrapperContained)); }
public void setStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source) { wrapperContained.setStatusEffect(effect.wrapperContained,source.wrapperContained); }
// public static void setStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source, ) { net.minecraft.entity.LivingEntity.setStatusEffect(effect.wrapperContained,source.wrapperContained); }
public yarnwrap.util.math.Vec3d applyFluidMovingSpeed(double gravity,boolean falling,yarnwrap.util.math.Vec3d motion) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyFluidMovingSpeed(gravity,falling,motion.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d applyFluidMovingSpeed(double gravity,boolean falling,yarnwrap.util.math.Vec3d motion, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.LivingEntity.applyFluidMovingSpeed(gravity,falling,motion.wrapperContained)); }
// public yarnwrap.util.math.Vec3d applyMovementInput(yarnwrap.util.math.Vec3d movementInput,float slipperiness) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyMovementInput(movementInput.wrapperContained,slipperiness)); }
// public static yarnwrap.util.math.Vec3d applyMovementInput(yarnwrap.util.math.Vec3d movementInput,float slipperiness, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.LivingEntity.applyMovementInput(movementInput.wrapperContained,slipperiness)); }
public boolean canWalkOnFluid(yarnwrap.fluid.FluidState state) { return wrapperContained.canWalkOnFluid(state.wrapperContained); }
// public static boolean canWalkOnFluid(yarnwrap.fluid.FluidState state, ) { return net.minecraft.entity.LivingEntity.canWalkOnFluid(state.wrapperContained); }
// public Object createLivingAttributes() { return wrapperContained.createLivingAttributes(); }
public static Object createLivingAttributes() { return net.minecraft.entity.LivingEntity.createLivingAttributes(); }
// public boolean shouldDropLoot() { return wrapperContained.shouldDropLoot(); }
// public static boolean shouldDropLoot() { return net.minecraft.entity.LivingEntity.shouldDropLoot(); }
// public Object createBrainProfile() { return wrapperContained.createBrainProfile(); }
// public static Object createBrainProfile() { return net.minecraft.entity.LivingEntity.createBrainProfile(); }
public void updateLimbs(boolean flutter) { wrapperContained.updateLimbs(flutter); }
// public static void updateLimbs(boolean flutter, ) { net.minecraft.entity.LivingEntity.updateLimbs(flutter); }
public void triggerItemPickedUpByEntityCriteria(yarnwrap.entity.ItemEntity item) { wrapperContained.triggerItemPickedUpByEntityCriteria(item.wrapperContained); }
// public static void triggerItemPickedUpByEntityCriteria(yarnwrap.entity.ItemEntity item, ) { net.minecraft.entity.LivingEntity.triggerItemPickedUpByEntityCriteria(item.wrapperContained); }
public boolean hurtByWater() { return wrapperContained.hurtByWater(); }
// public static boolean hurtByWater() { return net.minecraft.entity.LivingEntity.hurtByWater(); }
public boolean isDead() { return wrapperContained.isDead(); }
// public static boolean isDead() { return net.minecraft.entity.LivingEntity.isDead(); }
// public void setAttacking(yarnwrap.entity.LazyEntityReference attackingPlayer,int playerHitTimer) { wrapperContained.setAttacking(attackingPlayer.wrapperContained,playerHitTimer); }
// public static void setAttacking(yarnwrap.entity.LazyEntityReference attackingPlayer,int playerHitTimer, ) { net.minecraft.entity.LivingEntity.setAttacking(attackingPlayer.wrapperContained,playerHitTimer); }
public boolean shouldSwimInFluids() { return wrapperContained.shouldSwimInFluids(); }
// public static boolean shouldSwimInFluids() { return net.minecraft.entity.LivingEntity.shouldSwimInFluids(); }
// public void checkHandStackSwap(java.util.Map equipmentChanges) { wrapperContained.checkHandStackSwap(equipmentChanges); }
// public static void checkHandStackSwap(java.util.Map equipmentChanges, ) { net.minecraft.entity.LivingEntity.checkHandStackSwap(equipmentChanges); }
// public void sendEquipmentChanges(java.util.Map equipmentChanges) { wrapperContained.sendEquipmentChanges(equipmentChanges); }
// public static void sendEquipmentChanges(java.util.Map equipmentChanges, ) { net.minecraft.entity.LivingEntity.sendEquipmentChanges(equipmentChanges); }
// public void swapHandStacks() { wrapperContained.swapHandStacks(); }
// public static void swapHandStacks() { net.minecraft.entity.LivingEntity.swapHandStacks(); }
// public void sendEquipmentChanges() { wrapperContained.sendEquipmentChanges(); }
// public static void sendEquipmentChanges() { net.minecraft.entity.LivingEntity.sendEquipmentChanges(); }
// public java.util.Map getEquipmentChanges() { return wrapperContained.getEquipmentChanges(); }
// public static java.util.Map getEquipmentChanges() { return net.minecraft.entity.LivingEntity.getEquipmentChanges(); }
// public yarnwrap.util.math.Vec3d positionInPortal(yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.positionInPortal(pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d positionInPortal(yarnwrap.util.math.Vec3d pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.LivingEntity.positionInPortal(pos.wrapperContained)); }
// public yarnwrap.inventory.StackReference getStackReference(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.inventory.StackReference(wrapperContained.getStackReference(entity.wrapperContained,slot.wrapperContained)); }
// public static yarnwrap.inventory.StackReference getStackReference(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.inventory.StackReference(net.minecraft.entity.LivingEntity.getStackReference(entity.wrapperContained,slot.wrapperContained)); }
// public yarnwrap.entity.EquipmentSlot getEquipmentSlot(int slotId) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getEquipmentSlot(slotId)); }
// public static yarnwrap.entity.EquipmentSlot getEquipmentSlot(int slotId, ) { return new yarnwrap.entity.EquipmentSlot(net.minecraft.entity.LivingEntity.getEquipmentSlot(slotId)); }
// public boolean method_32323(yarnwrap.entity.LivingEntity stack) { return wrapperContained.method_32323(stack.wrapperContained); }
// public static boolean method_32323(yarnwrap.entity.LivingEntity stack, ) { return net.minecraft.entity.LivingEntity.method_32323(stack.wrapperContained); }
// public void removePowderSnowSlow() { wrapperContained.removePowderSnowSlow(); }
// public static void removePowderSnowSlow() { net.minecraft.entity.LivingEntity.removePowderSnowSlow(); }
// public void addPowderSnowSlowIfNeeded() { wrapperContained.addPowderSnowSlowIfNeeded(); }
// public static void addPowderSnowSlowIfNeeded() { net.minecraft.entity.LivingEntity.addPowderSnowSlowIfNeeded(); }
public yarnwrap.entity.EquipmentSlot getPreferredEquipmentSlot(yarnwrap.item.ItemStack stack) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getPreferredEquipmentSlot(stack.wrapperContained)); }
// public static yarnwrap.entity.EquipmentSlot getPreferredEquipmentSlot(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.entity.EquipmentSlot(net.minecraft.entity.LivingEntity.getPreferredEquipmentSlot(stack.wrapperContained)); }
public boolean canTakeDamage() { return wrapperContained.canTakeDamage(); }
// public static boolean canTakeDamage() { return net.minecraft.entity.LivingEntity.canTakeDamage(); }
public boolean hasNoDrag() { return wrapperContained.hasNoDrag(); }
// public static boolean hasNoDrag() { return net.minecraft.entity.LivingEntity.hasNoDrag(); }
public void setNoDrag(boolean noDrag) { wrapperContained.setNoDrag(noDrag); }
// public static void setNoDrag(boolean noDrag, ) { net.minecraft.entity.LivingEntity.setNoDrag(noDrag); }
// public void updateGlowing() { wrapperContained.updateGlowing(); }
// public static void updateGlowing() { net.minecraft.entity.LivingEntity.updateGlowing(); }
public void addDeathParticles() { wrapperContained.addDeathParticles(); }
// public static void addDeathParticles() { net.minecraft.entity.LivingEntity.addDeathParticles(); }
public boolean isPartOfGame() { return wrapperContained.isPartOfGame(); }
// public static boolean isPartOfGame() { return net.minecraft.entity.LivingEntity.isPartOfGame(); }
public void damageHelmet(yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.damageHelmet(source.wrapperContained,amount); }
// public static void damageHelmet(yarnwrap.entity.damage.DamageSource source,float amount, ) { net.minecraft.entity.LivingEntity.damageHelmet(source.wrapperContained,amount); }
// public void tickItemStackUsage(yarnwrap.item.ItemStack stack) { wrapperContained.tickItemStackUsage(stack.wrapperContained); }
// public static void tickItemStackUsage(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.LivingEntity.tickItemStackUsage(stack.wrapperContained); }
public boolean addStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source) { return wrapperContained.addStatusEffect(effect.wrapperContained,source.wrapperContained); }
// public static boolean addStatusEffect(yarnwrap.entity.effect.StatusEffectInstance effect,yarnwrap.entity.Entity source, ) { return net.minecraft.entity.LivingEntity.addStatusEffect(effect.wrapperContained,source.wrapperContained); }
public float getJumpBoostVelocityModifier() { return wrapperContained.getJumpBoostVelocityModifier(); }
// public static float getJumpBoostVelocityModifier() { return net.minecraft.entity.LivingEntity.getJumpBoostVelocityModifier(); }
public Object getFallSounds() { return wrapperContained.getFallSounds(); }
// public static Object getFallSounds() { return net.minecraft.entity.LivingEntity.getFallSounds(); }
public void disableExperienceDropping() { wrapperContained.disableExperienceDropping(); }
// public static void disableExperienceDropping() { net.minecraft.entity.LivingEntity.disableExperienceDropping(); }
public boolean isExperienceDroppingDisabled() { return wrapperContained.isExperienceDroppingDisabled(); }
// public static boolean isExperienceDroppingDisabled() { return net.minecraft.entity.LivingEntity.isExperienceDroppingDisabled(); }
// public boolean isArmorSlot(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.isArmorSlot(slot.wrapperContained); }
// public static boolean isArmorSlot(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.isArmorSlot(slot.wrapperContained); }
public boolean areItemsDifferent(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack stack2) { return wrapperContained.areItemsDifferent(stack.wrapperContained,stack2.wrapperContained); }
// public static boolean areItemsDifferent(yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack stack2, ) { return net.minecraft.entity.LivingEntity.areItemsDifferent(stack.wrapperContained,stack2.wrapperContained); }
public double getAttributeValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getAttributeValue(attribute.wrapperContained); }
// public static double getAttributeValue(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.LivingEntity.getAttributeValue(attribute.wrapperContained); }
public double getAttributeBaseValue(yarnwrap.registry.entry.RegistryEntry attribute) { return wrapperContained.getAttributeBaseValue(attribute.wrapperContained); }
// public static double getAttributeBaseValue(yarnwrap.registry.entry.RegistryEntry attribute, ) { return net.minecraft.entity.LivingEntity.getAttributeBaseValue(attribute.wrapperContained); }
public float getDamageTiltYaw() { return wrapperContained.getDamageTiltYaw(); }
// public static float getDamageTiltYaw() { return net.minecraft.entity.LivingEntity.getDamageTiltYaw(); }
// public void updateLimbs(float posDelta) { wrapperContained.updateLimbs(posDelta); }
// public static void updateLimbs(float posDelta, ) { net.minecraft.entity.LivingEntity.updateLimbs(posDelta); }
public void tiltScreen(double deltaX,double deltaZ) { wrapperContained.tiltScreen(deltaX,deltaZ); }
// public static void tiltScreen(double deltaX,double deltaZ, ) { net.minecraft.entity.LivingEntity.tiltScreen(deltaX,deltaZ); }
// public void tickControlled(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput) { wrapperContained.tickControlled(controllingPlayer.wrapperContained,movementInput.wrapperContained); }
// public static void tickControlled(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput, ) { net.minecraft.entity.LivingEntity.tickControlled(controllingPlayer.wrapperContained,movementInput.wrapperContained); }
// public yarnwrap.util.math.Vec3d getControlledMovementInput(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput) { return new yarnwrap.util.math.Vec3d(wrapperContained.getControlledMovementInput(controllingPlayer.wrapperContained,movementInput.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getControlledMovementInput(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.LivingEntity.getControlledMovementInput(controllingPlayer.wrapperContained,movementInput.wrapperContained)); }
// public void travelControlled(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput) { wrapperContained.travelControlled(controllingPlayer.wrapperContained,movementInput.wrapperContained); }
// public static void travelControlled(yarnwrap.entity.player.PlayerEntity controllingPlayer,yarnwrap.util.math.Vec3d movementInput, ) { net.minecraft.entity.LivingEntity.travelControlled(controllingPlayer.wrapperContained,movementInput.wrapperContained); }
// public float getOffGroundSpeed() { return wrapperContained.getOffGroundSpeed(); }
// public static float getOffGroundSpeed() { return net.minecraft.entity.LivingEntity.getOffGroundSpeed(); }
// public float getSaddledSpeed(yarnwrap.entity.player.PlayerEntity controllingPlayer) { return wrapperContained.getSaddledSpeed(controllingPlayer.wrapperContained); }
// public static float getSaddledSpeed(yarnwrap.entity.player.PlayerEntity controllingPlayer, ) { return net.minecraft.entity.LivingEntity.getSaddledSpeed(controllingPlayer.wrapperContained); }
public long getLootTableSeed() { return wrapperContained.getLootTableSeed(); }
// public static long getLootTableSeed() { return net.minecraft.entity.LivingEntity.getLootTableSeed(); }
public void sendEffectToControllingPlayer(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.sendEffectToControllingPlayer(effect.wrapperContained); }
// public static void sendEffectToControllingPlayer(yarnwrap.entity.effect.StatusEffectInstance effect, ) { net.minecraft.entity.LivingEntity.sendEffectToControllingPlayer(effect.wrapperContained); }
// public void lerpHeadYaw(int headTrackingIncrements,double serverHeadYaw) { wrapperContained.lerpHeadYaw(headTrackingIncrements,serverHeadYaw); }
// public static void lerpHeadYaw(int headTrackingIncrements,double serverHeadYaw, ) { net.minecraft.entity.LivingEntity.lerpHeadYaw(headTrackingIncrements,serverHeadYaw); }
// public void updateAttribute(yarnwrap.registry.entry.RegistryEntry attribute) { wrapperContained.updateAttribute(attribute.wrapperContained); }
// public static void updateAttribute(yarnwrap.registry.entry.RegistryEntry attribute, ) { net.minecraft.entity.LivingEntity.updateAttribute(attribute.wrapperContained); }
public float getMaxAbsorption() { return wrapperContained.getMaxAbsorption(); }
// public static float getMaxAbsorption() { return net.minecraft.entity.LivingEntity.getMaxAbsorption(); }
// public boolean wouldNotSuffocateInPose(yarnwrap.entity.EntityPose pose) { return wrapperContained.wouldNotSuffocateInPose(pose.wrapperContained); }
// public static boolean wouldNotSuffocateInPose(yarnwrap.entity.EntityPose pose, ) { return net.minecraft.entity.LivingEntity.wouldNotSuffocateInPose(pose.wrapperContained); }
// public void updateAttributes() { wrapperContained.updateAttributes(); }
// public static void updateAttributes() { net.minecraft.entity.LivingEntity.updateAttributes(); }
// public void setAbsorptionAmountUnclamped(float absorptionAmount) { wrapperContained.setAbsorptionAmountUnclamped(absorptionAmount); }
// public static void setAbsorptionAmountUnclamped(float absorptionAmount, ) { net.minecraft.entity.LivingEntity.setAbsorptionAmountUnclamped(absorptionAmount); }
// public yarnwrap.util.math.Box getHitbox() { return new yarnwrap.util.math.Box(wrapperContained.getHitbox()); }
// public static yarnwrap.util.math.Box getHitbox() { return new yarnwrap.util.math.Box(net.minecraft.entity.LivingEntity.getHitbox()); }
// public float getMaxRelativeHeadRotation() { return wrapperContained.getMaxRelativeHeadRotation(); }
// public static float getMaxRelativeHeadRotation() { return net.minecraft.entity.LivingEntity.getMaxRelativeHeadRotation(); }
public float getScale() { return wrapperContained.getScale(); }
// public static float getScale() { return net.minecraft.entity.LivingEntity.getScale(); }
// public yarnwrap.entity.EntityDimensions getBaseDimensions(yarnwrap.entity.EntityPose pose) { return new yarnwrap.entity.EntityDimensions(wrapperContained.getBaseDimensions(pose.wrapperContained)); }
// public static yarnwrap.entity.EntityDimensions getBaseDimensions(yarnwrap.entity.EntityPose pose, ) { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.LivingEntity.getBaseDimensions(pose.wrapperContained)); }
// public float clampScale(float scale) { return wrapperContained.clampScale(scale); }
// public static float clampScale(float scale, ) { return net.minecraft.entity.LivingEntity.clampScale(scale); }
public void playSound(yarnwrap.sound.SoundEvent sound) { wrapperContained.playSound(sound.wrapperContained); }
// public static void playSound(yarnwrap.sound.SoundEvent sound, ) { net.minecraft.entity.LivingEntity.playSound(sound.wrapperContained); }
// public yarnwrap.entity.EquipmentSlot getSlotForHand(yarnwrap.util.Hand hand) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getSlotForHand(hand.wrapperContained)); }
// public static yarnwrap.entity.EquipmentSlot getSlotForHand(yarnwrap.util.Hand hand, ) { return new yarnwrap.entity.EquipmentSlot(net.minecraft.entity.LivingEntity.getSlotForHand(hand.wrapperContained)); }
public boolean canUseSlot(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.canUseSlot(slot.wrapperContained); }
// public static boolean canUseSlot(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.canUseSlot(slot.wrapperContained); }
public boolean isInCreativeMode() { return wrapperContained.isInCreativeMode(); }
// public static boolean isInCreativeMode() { return net.minecraft.entity.LivingEntity.isInCreativeMode(); }
// public int getSafeFallDistance(float health) { return wrapperContained.getSafeFallDistance(health); }
// public static int getSafeFallDistance(float health, ) { return net.minecraft.entity.LivingEntity.getSafeFallDistance(health); }
// public float getJumpVelocity(float strength) { return wrapperContained.getJumpVelocity(strength); }
// public static float getJumpVelocity(float strength, ) { return net.minecraft.entity.LivingEntity.getJumpVelocity(strength); }
// public void damageEquipment(yarnwrap.entity.damage.DamageSource source,float amount,net.minecraft.entity.EquipmentSlot[] slots) { wrapperContained.damageEquipment(source.wrapperContained,amount,slots); }
// public static void damageEquipment(yarnwrap.entity.damage.DamageSource source,float amount,net.minecraft.entity.EquipmentSlot[] slots, ) { net.minecraft.entity.LivingEntity.damageEquipment(source.wrapperContained,amount,slots); }
// public void updatePotionSwirls() { wrapperContained.updatePotionSwirls(); }
// public static void updatePotionSwirls() { net.minecraft.entity.LivingEntity.updatePotionSwirls(); }
public int getExperienceToDrop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity attacker) { return wrapperContained.getExperienceToDrop(world.wrapperContained,attacker.wrapperContained); }
// public static int getExperienceToDrop(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity attacker, ) { return net.minecraft.entity.LivingEntity.getExperienceToDrop(world.wrapperContained,attacker.wrapperContained); }
// public float getAttackKnockbackAgainst(yarnwrap.entity.Entity target,yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.getAttackKnockbackAgainst(target.wrapperContained,damageSource.wrapperContained); }
// public static float getAttackKnockbackAgainst(yarnwrap.entity.Entity target,yarnwrap.entity.damage.DamageSource damageSource, ) { return net.minecraft.entity.LivingEntity.getAttackKnockbackAgainst(target.wrapperContained,damageSource.wrapperContained); }
public boolean hasLandedInFluid() { return wrapperContained.hasLandedInFluid(); }
// public static boolean hasLandedInFluid() { return net.minecraft.entity.LivingEntity.hasLandedInFluid(); }
public java.util.Map getLocationBasedEnchantmentEffects(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.getLocationBasedEnchantmentEffects(slot.wrapperContained); }
// public static java.util.Map getLocationBasedEnchantmentEffects(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.getLocationBasedEnchantmentEffects(slot.wrapperContained); }
// public void onRemoval(yarnwrap.server.world.ServerWorld world,Object reason) { wrapperContained.onRemoval(world.wrapperContained,reason); }
// public static void onRemoval(yarnwrap.server.world.ServerWorld world,Object reason, ) { net.minecraft.entity.LivingEntity.onRemoval(world.wrapperContained,reason); }
// public void travelGliding(yarnwrap.util.math.Vec3d movementInput) { wrapperContained.travelGliding(movementInput.wrapperContained); }
// public static void travelGliding(yarnwrap.util.math.Vec3d movementInput, ) { net.minecraft.entity.LivingEntity.travelGliding(movementInput.wrapperContained); }
// public yarnwrap.util.math.Vec3d method_61418(double pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_61418(pos)); }
// public static yarnwrap.util.math.Vec3d method_61418(double pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.LivingEntity.method_61418(pos)); }
// public void forEachShearedItem(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey lootTableKey,yarnwrap.item.ItemStack tool,java.util.function.BiConsumer lootConsumer) { wrapperContained.forEachShearedItem(world.wrapperContained,lootTableKey.wrapperContained,tool.wrapperContained,lootConsumer); }
// public static void forEachShearedItem(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey lootTableKey,yarnwrap.item.ItemStack tool,java.util.function.BiConsumer lootConsumer, ) { net.minecraft.entity.LivingEntity.forEachShearedItem(world.wrapperContained,lootTableKey.wrapperContained,tool.wrapperContained,lootConsumer); }
public yarnwrap.item.ItemStack getStackInArm(yarnwrap.util.Arm arm) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInArm(arm.wrapperContained)); }
// public static yarnwrap.item.ItemStack getStackInArm(yarnwrap.util.Arm arm, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.getStackInArm(arm.wrapperContained)); }
// public void method_61421(yarnwrap.entity.attribute.AttributeContainer attribute,yarnwrap.registry.entry.RegistryEntry modifier) { wrapperContained.method_61421(attribute.wrapperContained,modifier.wrapperContained); }
// public static void method_61421(yarnwrap.entity.attribute.AttributeContainer attribute,yarnwrap.registry.entry.RegistryEntry modifier, ) { net.minecraft.entity.LivingEntity.method_61421(attribute.wrapperContained,modifier.wrapperContained); }
// public void onEquipmentRemoved(yarnwrap.item.ItemStack removedEquipment,yarnwrap.entity.EquipmentSlot slot,yarnwrap.entity.attribute.AttributeContainer container) { wrapperContained.onEquipmentRemoved(removedEquipment.wrapperContained,slot.wrapperContained,container.wrapperContained); }
// public static void onEquipmentRemoved(yarnwrap.item.ItemStack removedEquipment,yarnwrap.entity.EquipmentSlot slot,yarnwrap.entity.attribute.AttributeContainer container, ) { net.minecraft.entity.LivingEntity.onEquipmentRemoved(removedEquipment.wrapperContained,slot.wrapperContained,container.wrapperContained); }
// public void method_61423(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier) { wrapperContained.method_61423(attribute.wrapperContained,modifier.wrapperContained); }
// public static void method_61423(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.entity.attribute.EntityAttributeModifier modifier, ) { net.minecraft.entity.LivingEntity.method_61423(attribute.wrapperContained,modifier.wrapperContained); }
// public void checkGlidingCollision(double oldSpeed,double newSpeed) { wrapperContained.checkGlidingCollision(oldSpeed,newSpeed); }
// public static void checkGlidingCollision(double oldSpeed,double newSpeed, ) { net.minecraft.entity.LivingEntity.checkGlidingCollision(oldSpeed,newSpeed); }
// public double getEffectiveGravity() { return wrapperContained.getEffectiveGravity(); }
// public static double getEffectiveGravity() { return net.minecraft.entity.LivingEntity.getEffectiveGravity(); }
// public void travelMidAir(yarnwrap.util.math.Vec3d movementInput) { wrapperContained.travelMidAir(movementInput.wrapperContained); }
// public static void travelMidAir(yarnwrap.util.math.Vec3d movementInput, ) { net.minecraft.entity.LivingEntity.travelMidAir(movementInput.wrapperContained); }
// public void travelInFluid(yarnwrap.util.math.Vec3d movementInput) { wrapperContained.travelInFluid(movementInput.wrapperContained); }
// public static void travelInFluid(yarnwrap.util.math.Vec3d movementInput, ) { net.minecraft.entity.LivingEntity.travelInFluid(movementInput.wrapperContained); }
// public yarnwrap.util.math.Vec3d calcGlidingVelocity(yarnwrap.util.math.Vec3d oldVelocity) { return new yarnwrap.util.math.Vec3d(wrapperContained.calcGlidingVelocity(oldVelocity.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d calcGlidingVelocity(yarnwrap.util.math.Vec3d oldVelocity, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.LivingEntity.calcGlidingVelocity(oldVelocity.wrapperContained)); }
public yarnwrap.item.ItemStack getBlockingItem() { return new yarnwrap.item.ItemStack(wrapperContained.getBlockingItem()); }
// public static yarnwrap.item.ItemStack getBlockingItem() { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.getBlockingItem()); }
public boolean canEquip(yarnwrap.item.ItemStack stack,yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.canEquip(stack.wrapperContained,slot.wrapperContained); }
// public static boolean canEquip(yarnwrap.item.ItemStack stack,yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.canEquip(stack.wrapperContained,slot.wrapperContained); }
// public boolean canGlideWith(yarnwrap.item.ItemStack stack,yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.canGlideWith(stack.wrapperContained,slot.wrapperContained); }
// public static boolean canGlideWith(yarnwrap.item.ItemStack stack,yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.canGlideWith(stack.wrapperContained,slot.wrapperContained); }
public boolean canEquipFromDispenser(yarnwrap.item.ItemStack stack) { return wrapperContained.canEquipFromDispenser(stack.wrapperContained); }
// public static boolean canEquipFromDispenser(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.LivingEntity.canEquipFromDispenser(stack.wrapperContained); }
// public boolean canDispenserEquipSlot(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.canDispenserEquipSlot(slot.wrapperContained); }
// public static boolean canDispenserEquipSlot(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.canDispenserEquipSlot(slot.wrapperContained); }
public int getPlayerHitTimer() { return wrapperContained.getPlayerHitTimer(); }
// public static int getPlayerHitTimer() { return net.minecraft.entity.LivingEntity.getPlayerHitTimer(); }
// public boolean canGlide() { return wrapperContained.canGlide(); }
// public static boolean canGlide() { return net.minecraft.entity.LivingEntity.canGlide(); }
// public boolean method_63629(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.method_63629(slot.wrapperContained); }
// public static boolean method_63629(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.LivingEntity.method_63629(slot.wrapperContained); }
public boolean forEachGiftedItem(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey lootTableKey,java.util.function.BiConsumer lootConsumer) { return wrapperContained.forEachGiftedItem(world.wrapperContained,lootTableKey.wrapperContained,lootConsumer); }
// public static boolean forEachGiftedItem(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey lootTableKey,java.util.function.BiConsumer lootConsumer, ) { return net.minecraft.entity.LivingEntity.forEachGiftedItem(world.wrapperContained,lootTableKey.wrapperContained,lootConsumer); }
// public boolean forEachGeneratedItem(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey lootTableKey,java.util.function.Function lootContextParametersFactory,java.util.function.BiConsumer lootConsumer) { return wrapperContained.forEachGeneratedItem(world.wrapperContained,lootTableKey.wrapperContained,lootContextParametersFactory,lootConsumer); }
// public static boolean forEachGeneratedItem(yarnwrap.server.world.ServerWorld world,yarnwrap.registry.RegistryKey lootTableKey,java.util.function.Function lootContextParametersFactory,java.util.function.BiConsumer lootConsumer, ) { return net.minecraft.entity.LivingEntity.forEachGeneratedItem(world.wrapperContained,lootTableKey.wrapperContained,lootContextParametersFactory,lootConsumer); }
// public yarnwrap.loot.context.LootWorldContext method_64171(yarnwrap.item.ItemStack parameterSetBuilder) { return new yarnwrap.loot.context.LootWorldContext(wrapperContained.method_64171(parameterSetBuilder.wrapperContained)); }
// public static yarnwrap.loot.context.LootWorldContext method_64171(yarnwrap.item.ItemStack parameterSetBuilder, ) { return new yarnwrap.loot.context.LootWorldContext(net.minecraft.entity.LivingEntity.method_64171(parameterSetBuilder.wrapperContained)); }
// public yarnwrap.loot.context.LootWorldContext method_64172(Object parameterSetBuilder) { return new yarnwrap.loot.context.LootWorldContext(wrapperContained.method_64172(parameterSetBuilder)); }
// public static yarnwrap.loot.context.LootWorldContext method_64172(Object parameterSetBuilder, ) { return new yarnwrap.loot.context.LootWorldContext(net.minecraft.entity.LivingEntity.method_64172(parameterSetBuilder)); }
public void giveOrDropStack(yarnwrap.item.ItemStack stack) { wrapperContained.giveOrDropStack(stack.wrapperContained); }
// public static void giveOrDropStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.LivingEntity.giveOrDropStack(stack.wrapperContained); }
// public void method_64448(java.util.function.BiConsumer stack) { wrapperContained.method_64448(stack); }
// public static void method_64448(java.util.function.BiConsumer stack, ) { net.minecraft.entity.LivingEntity.method_64448(stack); }
// public void method_64449(yarnwrap.server.world.ServerWorld stack) { wrapperContained.method_64449(stack.wrapperContained); }
// public static void method_64449(yarnwrap.server.world.ServerWorld stack, ) { net.minecraft.entity.LivingEntity.method_64449(stack.wrapperContained); }
// public boolean canSee(yarnwrap.entity.Entity entity,Object shapeType,Object fluidHandling,double entityY) { return wrapperContained.canSee(entity.wrapperContained,shapeType,fluidHandling,entityY); }
// public static boolean canSee(yarnwrap.entity.Entity entity,Object shapeType,Object fluidHandling,double entityY, ) { return net.minecraft.entity.LivingEntity.canSee(entity.wrapperContained,shapeType,fluidHandling,entityY); }
// public boolean isEntityLookingAtMe(yarnwrap.entity.LivingEntity entity,double visualShape,boolean checkedYs) { return wrapperContained.isEntityLookingAtMe(entity.wrapperContained,visualShape,checkedYs); }
// public static boolean isEntityLookingAtMe(yarnwrap.entity.LivingEntity entity,double visualShape,boolean checkedYs, ) { return net.minecraft.entity.LivingEntity.isEntityLookingAtMe(entity.wrapperContained,visualShape,checkedYs); }
// public boolean method_64620(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_64620(entity.wrapperContained); }
// public static boolean method_64620(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.LivingEntity.method_64620(entity.wrapperContained); }
// public yarnwrap.entity.player.PlayerEntity setAttackingPlayer(yarnwrap.entity.damage.DamageSource damageSource) { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.setAttackingPlayer(damageSource.wrapperContained)); }
// public static yarnwrap.entity.player.PlayerEntity setAttackingPlayer(yarnwrap.entity.damage.DamageSource damageSource, ) { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.LivingEntity.setAttackingPlayer(damageSource.wrapperContained)); }
// public void becomeAngry(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.becomeAngry(damageSource.wrapperContained); }
// public static void becomeAngry(yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.LivingEntity.becomeAngry(damageSource.wrapperContained); }
// public void addBubbleParticles() { wrapperContained.addBubbleParticles(); }
// public static void addBubbleParticles() { net.minecraft.entity.LivingEntity.addBubbleParticles(); }
public void setAttacking(yarnwrap.entity.player.PlayerEntity attackingPlayer,int playerHitTimer) { wrapperContained.setAttacking(attackingPlayer.wrapperContained,playerHitTimer); }
// public static void setAttacking(yarnwrap.entity.player.PlayerEntity attackingPlayer,int playerHitTimer, ) { net.minecraft.entity.LivingEntity.setAttacking(attackingPlayer.wrapperContained,playerHitTimer); }
public void setAttacking(java.util.UUID attackingPlayer,int playerHitTimer) { wrapperContained.setAttacking(attackingPlayer,playerHitTimer); }
// public static void setAttacking(java.util.UUID attackingPlayer,int playerHitTimer, ) { net.minecraft.entity.LivingEntity.setAttacking(attackingPlayer,playerHitTimer); }
public float getEffectFadeFactor(yarnwrap.registry.entry.RegistryEntry effect,float tickProgress) { return wrapperContained.getEffectFadeFactor(effect.wrapperContained,tickProgress); }
// public static float getEffectFadeFactor(yarnwrap.registry.entry.RegistryEntry effect,float tickProgress, ) { return net.minecraft.entity.LivingEntity.getEffectFadeFactor(effect.wrapperContained,tickProgress); }
public yarnwrap.entity.player.PlayerEntity getAttackingPlayer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getAttackingPlayer()); }
// public static yarnwrap.entity.player.PlayerEntity getAttackingPlayer() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.LivingEntity.getAttackingPlayer()); }
public void stopGliding() { wrapperContained.stopGliding(); }
// public static void stopGliding() { net.minecraft.entity.LivingEntity.stopGliding(); }
// public void tickMovementInput() { wrapperContained.tickMovementInput(); }
// public static void tickMovementInput() { net.minecraft.entity.LivingEntity.tickMovementInput(); }
// public void playThornsSound(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.playThornsSound(damageSource.wrapperContained); }
// public static void playThornsSound(yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.LivingEntity.playThornsSound(damageSource.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry getEquipSound(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack,yarnwrap.component.type.EquippableComponent equippableComponent) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEquipSound(slot.wrapperContained,stack.wrapperContained,equippableComponent.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry getEquipSound(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack,yarnwrap.component.type.EquippableComponent equippableComponent, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.LivingEntity.getEquipSound(slot.wrapperContained,stack.wrapperContained,equippableComponent.wrapperContained)); }
// public void method_66668(java.util.List slot,yarnwrap.entity.EquipmentSlot stack) { wrapperContained.method_66668(slot,stack.wrapperContained); }
// public static void method_66668(java.util.List slot,yarnwrap.entity.EquipmentSlot stack, ) { net.minecraft.entity.LivingEntity.method_66668(slot,stack.wrapperContained); }
// public double getUnsafeFallDistance(double fallDistance) { return wrapperContained.getUnsafeFallDistance(fallDistance); }
// public static double getUnsafeFallDistance(double fallDistance, ) { return net.minecraft.entity.LivingEntity.getUnsafeFallDistance(fallDistance); }
// public yarnwrap.item.ItemStack method_66670(yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.item.ItemStack(wrapperContained.method_66670(slot.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_66670(yarnwrap.entity.EquipmentSlot slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.LivingEntity.method_66670(slot.wrapperContained)); }
public float getWeaponDisableBlockingForSeconds() { return wrapperContained.getWeaponDisableBlockingForSeconds(); }
// public static float getWeaponDisableBlockingForSeconds() { return net.minecraft.entity.LivingEntity.getWeaponDisableBlockingForSeconds(); }
public float getDamageBlockedAmount(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.getDamageBlockedAmount(world.wrapperContained,source.wrapperContained,amount); }
// public static float getDamageBlockedAmount(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource source,float amount, ) { return net.minecraft.entity.LivingEntity.getDamageBlockedAmount(world.wrapperContained,source.wrapperContained,amount); }
// public yarnwrap.entity.ItemEntity createItemEntity(yarnwrap.item.ItemStack stack,boolean atSelf,boolean retainOwnership) { return new yarnwrap.entity.ItemEntity(wrapperContained.createItemEntity(stack.wrapperContained,atSelf,retainOwnership)); }
// public static yarnwrap.entity.ItemEntity createItemEntity(yarnwrap.item.ItemStack stack,boolean atSelf,boolean retainOwnership, ) { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.LivingEntity.createItemEntity(stack.wrapperContained,atSelf,retainOwnership)); }
// public yarnwrap.entity.EntityEquipment createEquipment() { return new yarnwrap.entity.EntityEquipment(wrapperContained.createEquipment()); }
// public static yarnwrap.entity.EntityEquipment createEquipment() { return new yarnwrap.entity.EntityEquipment(net.minecraft.entity.LivingEntity.createEquipment()); }
// public void method_67650(yarnwrap.util.math.BlockPos pos) { wrapperContained.method_67650(pos.wrapperContained); }
// public static void method_67650(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.LivingEntity.method_67650(pos.wrapperContained); }
// public void method_68264(java.lang.String team) { wrapperContained.method_68264(team); }
// public static void method_68264(java.lang.String team, ) { net.minecraft.entity.LivingEntity.method_68264(team); }
// public void travelFlying(yarnwrap.util.math.Vec3d movementInput,float speed) { wrapperContained.travelFlying(movementInput.wrapperContained,speed); }
// public static void travelFlying(yarnwrap.util.math.Vec3d movementInput,float speed, ) { net.minecraft.entity.LivingEntity.travelFlying(movementInput.wrapperContained,speed); }
// public void travelFlying(yarnwrap.util.math.Vec3d movementInput,float inWaterSpeed,float inLavaSpeed,float regularSpeed) { wrapperContained.travelFlying(movementInput.wrapperContained,inWaterSpeed,inLavaSpeed,regularSpeed); }
// public static void travelFlying(yarnwrap.util.math.Vec3d movementInput,float inWaterSpeed,float inLavaSpeed,float regularSpeed, ) { net.minecraft.entity.LivingEntity.travelFlying(movementInput.wrapperContained,inWaterSpeed,inLavaSpeed,regularSpeed); }
// public boolean isJumping() { return wrapperContained.isJumping(); }
// public static boolean isJumping() { return net.minecraft.entity.LivingEntity.isJumping(); }
// public void method_71374(yarnwrap.storage.WriteView brain) { wrapperContained.method_71374(brain.wrapperContained); }
// public static void method_71374(yarnwrap.storage.WriteView brain, ) { net.minecraft.entity.LivingEntity.method_71374(brain.wrapperContained); }
// public void method_71375(yarnwrap.storage.WriteView pos) { wrapperContained.method_71375(pos.wrapperContained); }
// public static void method_71375(yarnwrap.storage.WriteView pos, ) { net.minecraft.entity.LivingEntity.method_71375(pos.wrapperContained); }
// public void method_71377(com.mojang.serialization.Dynamic brain) { wrapperContained.method_71377(brain); }
// public static void method_71377(com.mojang.serialization.Dynamic brain, ) { net.minecraft.entity.LivingEntity.method_71377(brain); }

}