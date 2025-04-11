package yarnwrap.entity.mob;
public class MobEntity { public net.minecraft.entity.mob.MobEntity wrapperContained; public MobEntity(net.minecraft.entity.mob.MobEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos positionTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.positionTarget); }
// public void positionTarget(yarnwrap.util.math.BlockPos value) { wrapperContained.positionTarget = value.wrapperContained; }
// public float positionTargetRange() { return wrapperContained.positionTargetRange; }
// public void positionTargetRange(float value) { wrapperContained.positionTargetRange = value; }
public float DEFAULT_CAN_PICKUP_LOOT_CHANCE() { return wrapperContained.DEFAULT_CAN_PICKUP_LOOT_CHANCE; }
// public void DEFAULT_CAN_PICKUP_LOOT_CHANCE(float value) { wrapperContained.DEFAULT_CAN_PICKUP_LOOT_CHANCE = value; }
public float BASE_ENCHANTED_ARMOR_CHANCE() { return wrapperContained.BASE_ENCHANTED_ARMOR_CHANCE; }
// public void BASE_ENCHANTED_ARMOR_CHANCE(float value) { wrapperContained.BASE_ENCHANTED_ARMOR_CHANCE = value; }
public float BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE() { return wrapperContained.BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE; }
// public void BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE(float value) { wrapperContained.BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE = value; }
// public int MINIMUM_DROPPED_XP_PER_EQUIPMENT() { return wrapperContained.MINIMUM_DROPPED_XP_PER_EQUIPMENT; }
// public void MINIMUM_DROPPED_XP_PER_EQUIPMENT(int value) { wrapperContained.MINIMUM_DROPPED_XP_PER_EQUIPMENT = value; }
// public int AI_DISABLED_FLAG() { return wrapperContained.AI_DISABLED_FLAG; }
// public void AI_DISABLED_FLAG(int value) { wrapperContained.AI_DISABLED_FLAG = value; }
// public int LEFT_HANDED_FLAG() { return wrapperContained.LEFT_HANDED_FLAG; }
// public void LEFT_HANDED_FLAG(int value) { wrapperContained.LEFT_HANDED_FLAG = value; }
// public int ATTACKING_FLAG() { return wrapperContained.ATTACKING_FLAG; }
// public void ATTACKING_FLAG(int value) { wrapperContained.ATTACKING_FLAG = value; }
public float BASE_SPAWN_EQUIPMENT_CHANCE() { return wrapperContained.BASE_SPAWN_EQUIPMENT_CHANCE; }
// public void BASE_SPAWN_EQUIPMENT_CHANCE(float value) { wrapperContained.BASE_SPAWN_EQUIPMENT_CHANCE = value; }
public float DEFAULT_DROP_CHANCE() { return wrapperContained.DEFAULT_DROP_CHANCE; }
// public void DEFAULT_DROP_CHANCE(float value) { wrapperContained.DEFAULT_DROP_CHANCE = value; }
// public yarnwrap.util.math.Vec3i ITEM_PICK_UP_RANGE_EXPANDER() { return new yarnwrap.util.math.Vec3i(wrapperContained.ITEM_PICK_UP_RANGE_EXPANDER); }
// public void ITEM_PICK_UP_RANGE_EXPANDER(yarnwrap.util.math.Vec3i value) { wrapperContained.ITEM_PICK_UP_RANGE_EXPANDER = value.wrapperContained; }
// public double ATTACK_RANGE() { return wrapperContained.ATTACK_RANGE; }
// public void ATTACK_RANGE(double value) { wrapperContained.ATTACK_RANGE = value; }
// public float bodyArmorDropChance() { return wrapperContained.bodyArmorDropChance; }
// public void bodyArmorDropChance(float value) { wrapperContained.bodyArmorDropChance = value; }
// public yarnwrap.item.ItemStack bodyArmor() { return new yarnwrap.item.ItemStack(wrapperContained.bodyArmor); }
// public void bodyArmor(yarnwrap.item.ItemStack value) { wrapperContained.bodyArmor = value.wrapperContained; }
// public yarnwrap.util.Identifier RANDOM_SPAWN_BONUS_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.RANDOM_SPAWN_BONUS_MODIFIER_ID); }
// public void RANDOM_SPAWN_BONUS_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.RANDOM_SPAWN_BONUS_MODIFIER_ID = value.wrapperContained; }
// public Object leashData() { return wrapperContained.leashData; }
// // public void leashData(Object value) { wrapperContained.leashData = value; }
// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public void lootTableSeed(long value) { wrapperContained.lootTableSeed = value; }
// public yarnwrap.entity.ai.goal.GoalSelector targetSelector() { return new yarnwrap.entity.ai.goal.GoalSelector(wrapperContained.targetSelector); }
// public void targetSelector(yarnwrap.entity.ai.goal.GoalSelector value) { wrapperContained.targetSelector = value.wrapperContained; }
// public float[] armorDropChances() { return wrapperContained.armorDropChances; }
// public void armorDropChances(float[] value) { wrapperContained.armorDropChances = value; }
// public float[] handDropChances() { return wrapperContained.handDropChances; }
// public void handDropChances(float[] value) { wrapperContained.handDropChances = value; }
// public yarnwrap.entity.ai.control.BodyControl bodyControl() { return new yarnwrap.entity.ai.control.BodyControl(wrapperContained.bodyControl); }
// public void bodyControl(yarnwrap.entity.ai.control.BodyControl value) { wrapperContained.bodyControl = value.wrapperContained; }
// public yarnwrap.entity.ai.pathing.EntityNavigation navigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.navigation); }
// public void navigation(yarnwrap.entity.ai.pathing.EntityNavigation value) { wrapperContained.navigation = value.wrapperContained; }
// public yarnwrap.entity.mob.MobVisibilityCache visibilityCache() { return new yarnwrap.entity.mob.MobVisibilityCache(wrapperContained.visibilityCache); }
// public void visibilityCache(yarnwrap.entity.mob.MobVisibilityCache value) { wrapperContained.visibilityCache = value.wrapperContained; }
public int ambientSoundChance() { return wrapperContained.ambientSoundChance; }
public void ambientSoundChance(int value) { wrapperContained.ambientSoundChance = value; }
// public yarnwrap.entity.data.TrackedData MOB_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MOB_FLAGS); }
// public void MOB_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.MOB_FLAGS = value.wrapperContained; }
// public int experiencePoints() { return wrapperContained.experiencePoints; }
// public void experiencePoints(int value) { wrapperContained.experiencePoints = value; }
// public yarnwrap.util.collection.DefaultedList handItems() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.handItems); }
// public void handItems(yarnwrap.util.collection.DefaultedList value) { wrapperContained.handItems = value.wrapperContained; }
// public java.util.Map pathfindingPenalties() { return wrapperContained.pathfindingPenalties; }
// public void pathfindingPenalties(java.util.Map value) { wrapperContained.pathfindingPenalties = value; }
// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public boolean persistent() { return wrapperContained.persistent; }
// public void persistent(boolean value) { wrapperContained.persistent = value; }
// public yarnwrap.entity.ai.goal.GoalSelector goalSelector() { return new yarnwrap.entity.ai.goal.GoalSelector(wrapperContained.goalSelector); }
// public void goalSelector(yarnwrap.entity.ai.goal.GoalSelector value) { wrapperContained.goalSelector = value.wrapperContained; }
// public boolean canPickUpLoot() { return wrapperContained.canPickUpLoot; }
// public void canPickUpLoot(boolean value) { wrapperContained.canPickUpLoot = value; }
// public yarnwrap.entity.ai.control.JumpControl jumpControl() { return new yarnwrap.entity.ai.control.JumpControl(wrapperContained.jumpControl); }
// public void jumpControl(yarnwrap.entity.ai.control.JumpControl value) { wrapperContained.jumpControl = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList armorItems() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.armorItems); }
// public void armorItems(yarnwrap.util.collection.DefaultedList value) { wrapperContained.armorItems = value.wrapperContained; }
// public yarnwrap.entity.ai.control.LookControl lookControl() { return new yarnwrap.entity.ai.control.LookControl(wrapperContained.lookControl); }
// public void lookControl(yarnwrap.entity.ai.control.LookControl value) { wrapperContained.lookControl = value.wrapperContained; }
// public yarnwrap.entity.ai.control.MoveControl moveControl() { return new yarnwrap.entity.ai.control.MoveControl(wrapperContained.moveControl); }
// public void moveControl(yarnwrap.entity.ai.control.MoveControl value) { wrapperContained.moveControl = value.wrapperContained; }
public boolean cannotDespawn() { return wrapperContained.cannotDespawn(); }
// public void onPlayerSpawnedChild(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.mob.MobEntity child) { wrapperContained.onPlayerSpawnedChild(player.wrapperContained,child.wrapperContained); }
public boolean isInWalkTargetRange(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInWalkTargetRange(pos.wrapperContained); }
public void setPositionTarget(yarnwrap.util.math.BlockPos target,int range) { wrapperContained.setPositionTarget(target.wrapperContained,range); }
// public void sendAiDebugData() { wrapperContained.sendAiDebugData(); }
public boolean hasPositionTarget() { return wrapperContained.hasPositionTarget(); }
public boolean isInWalkTargetRange() { return wrapperContained.isInWalkTargetRange(); }
public yarnwrap.util.math.BlockPos getPositionTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPositionTarget()); }
public float getPositionTargetRange() { return wrapperContained.getPositionTargetRange(); }
public void setAttacking(boolean attacking) { wrapperContained.setAttacking(attacking); }
public int getMaxLookYawChange() { return wrapperContained.getMaxLookYawChange(); }
// public void updateGoalControls() { wrapperContained.updateGoalControls(); }
public boolean canMobSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canMobSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean canGather(yarnwrap.item.ItemStack stack) { return wrapperContained.canGather(stack.wrapperContained); }
// public boolean isDisallowedInPeaceful() { return wrapperContained.isDisallowedInPeaceful(); }
public yarnwrap.item.ItemStack tryEquip(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.tryEquip(stack.wrapperContained)); }
// public void equipLootStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { wrapperContained.equipLootStack(slot.wrapperContained,stack.wrapperContained); }
public boolean canUseRangedWeapon(yarnwrap.item.RangedWeaponItem weapon) { return wrapperContained.canUseRangedWeapon(weapon.wrapperContained); }
public void updateDropChances(yarnwrap.entity.EquipmentSlot slot) { wrapperContained.updateDropChances(slot.wrapperContained); }
public boolean prefersNewDamageableItem(yarnwrap.item.ItemStack newStack,yarnwrap.item.ItemStack oldStack) { return wrapperContained.prefersNewDamageableItem(newStack.wrapperContained,oldStack.wrapperContained); }
// public boolean movesIndependently() { return wrapperContained.movesIndependently(); }
public Object createMobAttributes() { return wrapperContained.createMobAttributes(); }
public yarnwrap.entity.mob.MobEntity convertTo(yarnwrap.entity.EntityType entityType,boolean keepEquipment) { return new yarnwrap.entity.mob.MobEntity(wrapperContained.convertTo(entityType.wrapperContained,keepEquipment)); }
// public yarnwrap.util.ActionResult interactWithItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactWithItem(player.wrapperContained,hand.wrapperContained)); }
// public void enchantEquipment(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.entity.EquipmentSlot slot,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.enchantEquipment(world.wrapperContained,random.wrapperContained,slot.wrapperContained,localDifficulty.wrapperContained); }
// public void enchantMainHandItem(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.enchantMainHandItem(world.wrapperContained,random.wrapperContained,localDifficulty.wrapperContained); }
public void clearPositionTarget() { wrapperContained.clearPositionTarget(); }
public void clearGoalsAndTasks() { wrapperContained.clearGoalsAndTasks(); }
public boolean isInAttackRange(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isInAttackRange(entity.wrapperContained); }
// public yarnwrap.util.math.Vec3i getItemPickUpRangeExpander() { return new yarnwrap.util.math.Vec3i(wrapperContained.getItemPickUpRangeExpander()); }
public void clearGoals(java.util.function.Predicate predicate) { wrapperContained.clearGoals(predicate); }
public void onFinishPathfinding() { wrapperContained.onFinishPathfinding(); }
public void onStartPathfinding() { wrapperContained.onStartPathfinding(); }
// public yarnwrap.util.math.Box getAttackBox() { return new yarnwrap.util.math.Box(wrapperContained.getAttackBox()); }
public void stopMovement() { wrapperContained.stopMovement(); }
// public void clampHeadYaw() { wrapperContained.clampHeadYaw(); }
public yarnwrap.item.ItemStack getBodyArmor() { return new yarnwrap.item.ItemStack(wrapperContained.getBodyArmor()); }
public boolean isWearingBodyArmor() { return wrapperContained.isWearingBodyArmor(); }
public void equipBodyArmor(yarnwrap.item.ItemStack stack) { wrapperContained.equipBodyArmor(stack.wrapperContained); }
// public double getAttackDamageWith(yarnwrap.item.ItemStack stack) { return wrapperContained.getAttackDamageWith(stack.wrapperContained); }
// public boolean hasComponentsOtherThanDamage(yarnwrap.item.ItemStack stack) { return wrapperContained.hasComponentsOtherThanDamage(stack.wrapperContained); }
public void setEquipmentFromTable(yarnwrap.entity.EquipmentTable equipmentTable) { wrapperContained.setEquipmentFromTable(equipmentTable.wrapperContained); }
// public yarnwrap.loot.context.LootContextParameterSet createEquipmentLootParameters(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.loot.context.LootContextParameterSet(wrapperContained.createEquipmentLootParameters(world.wrapperContained)); }
// public float getDropChance(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.getDropChance(slot.wrapperContained); }
public void setForwardSpeed(float forwardSpeed) { wrapperContained.setForwardSpeed(forwardSpeed); }
// public boolean canPickUpLoot() { return wrapperContained.canPickUpLoot(); }
public void setLeftHanded(boolean leftHanded) { wrapperContained.setLeftHanded(leftHanded); }
public void setSidewaysSpeed(float sidewaysSpeed) { wrapperContained.setSidewaysSpeed(sidewaysSpeed); }
public boolean canPickupItem(yarnwrap.item.ItemStack stack) { return wrapperContained.canPickupItem(stack.wrapperContained); }
public void setPathfindingPenalty(yarnwrap.entity.ai.pathing.PathNodeType nodeType,float penalty) { wrapperContained.setPathfindingPenalty(nodeType.wrapperContained,penalty); }
public yarnwrap.entity.ai.pathing.EntityNavigation getNavigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.getNavigation()); }
public yarnwrap.entity.EntityData initialize(yarnwrap.world.ServerWorldAccess world,yarnwrap.world.LocalDifficulty difficulty,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.entity.EntityData entityData) { return new yarnwrap.entity.EntityData(wrapperContained.initialize(world.wrapperContained,difficulty.wrapperContained,spawnReason.wrapperContained,entityData.wrapperContained)); }
public float getPathfindingPenalty(yarnwrap.entity.ai.pathing.PathNodeType nodeType) { return wrapperContained.getPathfindingPenalty(nodeType.wrapperContained); }
public int getLimitPerChunk() { return wrapperContained.getLimitPerChunk(); }
public boolean isPersistent() { return wrapperContained.isPersistent(); }
public yarnwrap.item.Item getEquipmentForSlot(yarnwrap.entity.EquipmentSlot equipmentSlot,int equipmentLevel) { return new yarnwrap.item.Item(wrapperContained.getEquipmentForSlot(equipmentSlot.wrapperContained,equipmentLevel)); }
// public void loot(yarnwrap.entity.ItemEntity item) { wrapperContained.loot(item.wrapperContained); }
public void lookAtEntity(yarnwrap.entity.Entity targetEntity,float maxYawChange,float maxPitchChange) { wrapperContained.lookAtEntity(targetEntity.wrapperContained,maxYawChange,maxPitchChange); }
public void setCanPickUpLoot(boolean canPickUpLoot) { wrapperContained.setCanPickUpLoot(canPickUpLoot); }
// public boolean prefersNewEquipment(yarnwrap.item.ItemStack newStack,yarnwrap.item.ItemStack oldStack) { return wrapperContained.prefersNewEquipment(newStack.wrapperContained,oldStack.wrapperContained); }
public boolean canSpawn(yarnwrap.world.WorldView world) { return wrapperContained.canSpawn(world.wrapperContained); }
// public void mobTick() { wrapperContained.mobTick(); }
// public void initGoals() { wrapperContained.initGoals(); }
// public float changeAngle(float from,float to,float max) { return wrapperContained.changeAngle(from,to,max); }
public boolean isLeftHanded() { return wrapperContained.isLeftHanded(); }
public yarnwrap.entity.ai.control.MoveControl getMoveControl() { return new yarnwrap.entity.ai.control.MoveControl(wrapperContained.getMoveControl()); }
// public yarnwrap.entity.ai.control.BodyControl createBodyControl() { return new yarnwrap.entity.ai.control.BodyControl(wrapperContained.createBodyControl()); }
// public void initEquipment(yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.initEquipment(random.wrapperContained,localDifficulty.wrapperContained); }
// public yarnwrap.entity.ai.pathing.EntityNavigation createNavigation(yarnwrap.world.World world) { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.createNavigation(world.wrapperContained)); }
public void playAmbientSound() { wrapperContained.playAmbientSound(); }
// public yarnwrap.entity.LivingEntity getTargetInBrain() { return new yarnwrap.entity.LivingEntity(wrapperContained.getTargetInBrain()); }
public void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,java.util.Map slotDropChances) { wrapperContained.setEquipmentFromTable(lootTable.wrapperContained,slotDropChances); }
public boolean spawnsTooManyForEachTry(int count) { return wrapperContained.spawnsTooManyForEachTry(count); }
public int getMinAmbientSoundDelay() { return wrapperContained.getMinAmbientSoundDelay(); }
public void setPersistent() { wrapperContained.setPersistent(); }
// public boolean isAffectedByDaylight() { return wrapperContained.isAffectedByDaylight(); }
public boolean canImmediatelyDespawn(double distanceSquared) { return wrapperContained.canImmediatelyDespawn(distanceSquared); }
// public void resetSoundDelay() { wrapperContained.resetSoundDelay(); }
public void setUpwardSpeed(float upwardSpeed) { wrapperContained.setUpwardSpeed(upwardSpeed); }
public void setAiDisabled(boolean aiDisabled) { wrapperContained.setAiDisabled(aiDisabled); }
public int getMaxLookPitchChange() { return wrapperContained.getMaxLookPitchChange(); }
public boolean canSpawn(yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason) { return wrapperContained.canSpawn(world.wrapperContained,spawnReason.wrapperContained); }
public void setTarget(yarnwrap.entity.LivingEntity target) { wrapperContained.setTarget(target.wrapperContained); }
public void onEatingGrass() { wrapperContained.onEatingGrass(); }
// public void updateEnchantments(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.updateEnchantments(world.wrapperContained,random.wrapperContained,localDifficulty.wrapperContained); }
public yarnwrap.entity.mob.MobVisibilityCache getVisibilityCache() { return new yarnwrap.entity.mob.MobVisibilityCache(wrapperContained.getVisibilityCache()); }
public int getMaxHeadRotation() { return wrapperContained.getMaxHeadRotation(); }
public boolean isAiDisabled() { return wrapperContained.isAiDisabled(); }
public yarnwrap.entity.ai.control.LookControl getLookControl() { return new yarnwrap.entity.ai.control.LookControl(wrapperContained.getLookControl()); }
public void playSpawnEffects() { wrapperContained.playSpawnEffects(); }
// public yarnwrap.registry.RegistryKey getLootTableId() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTableId()); }
// public yarnwrap.util.ActionResult interactMob(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactMob(player.wrapperContained,hand.wrapperContained)); }
// public void enchantEquipment(yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.EquipmentSlot slot,yarnwrap.util.math.random.Random random,float power,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.enchantEquipment(world.wrapperContained,slot.wrapperContained,random.wrapperContained,power,localDifficulty.wrapperContained); }
// public void playAttackSound() { wrapperContained.playAttackSound(); }
public yarnwrap.entity.ai.control.JumpControl getJumpControl() { return new yarnwrap.entity.ai.control.JumpControl(wrapperContained.getJumpControl()); }
// public yarnwrap.sound.SoundEvent getAmbientSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getAmbientSound()); }
public java.util.Set dropEquipment(java.util.function.Predicate dropPredicate) { return wrapperContained.dropEquipment(dropPredicate); }
public void dropAllEquipment() { wrapperContained.dropAllEquipment(); }
public boolean isAttacking() { return wrapperContained.isAttacking(); }
public boolean isHorseArmor(yarnwrap.item.ItemStack stack) { return wrapperContained.isHorseArmor(stack.wrapperContained); }
public void setBaby(boolean baby) { wrapperContained.setBaby(baby); }

}