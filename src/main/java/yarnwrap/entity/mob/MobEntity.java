package yarnwrap.entity.mob;
public class MobEntity { public net.minecraft.entity.mob.MobEntity wrapperContained; public MobEntity(net.minecraft.entity.mob.MobEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos positionTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.positionTarget); }
// public void positionTarget(yarnwrap.util.math.BlockPos value) { wrapperContained.positionTarget = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos positionTarget() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.mob.MobEntity.positionTarget); }
// public static void positionTarget(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.mob.MobEntity.positionTarget = value.wrapperContained; }

// public float positionTargetRange() { return wrapperContained.positionTargetRange; }
// public void positionTargetRange(float value) { wrapperContained.positionTargetRange = value; }
// public static float positionTargetRange() { return net.minecraft.entity.mob.MobEntity.positionTargetRange; }
// public static void positionTargetRange(float value, ) { net.minecraft.entity.mob.MobEntity.positionTargetRange = value; }

// public float DEFAULT_CAN_PICKUP_LOOT_CHANCE() { return wrapperContained.DEFAULT_CAN_PICKUP_LOOT_CHANCE; }
// public void DEFAULT_CAN_PICKUP_LOOT_CHANCE(float value) { wrapperContained.DEFAULT_CAN_PICKUP_LOOT_CHANCE = value; }
public static float DEFAULT_CAN_PICKUP_LOOT_CHANCE() { return net.minecraft.entity.mob.MobEntity.DEFAULT_CAN_PICKUP_LOOT_CHANCE; }
// public static void DEFAULT_CAN_PICKUP_LOOT_CHANCE(float value, ) { net.minecraft.entity.mob.MobEntity.DEFAULT_CAN_PICKUP_LOOT_CHANCE = value; }

// public float BASE_ENCHANTED_ARMOR_CHANCE() { return wrapperContained.BASE_ENCHANTED_ARMOR_CHANCE; }
// public void BASE_ENCHANTED_ARMOR_CHANCE(float value) { wrapperContained.BASE_ENCHANTED_ARMOR_CHANCE = value; }
public static float BASE_ENCHANTED_ARMOR_CHANCE() { return net.minecraft.entity.mob.MobEntity.BASE_ENCHANTED_ARMOR_CHANCE; }
// public static void BASE_ENCHANTED_ARMOR_CHANCE(float value, ) { net.minecraft.entity.mob.MobEntity.BASE_ENCHANTED_ARMOR_CHANCE = value; }

// public float BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE() { return wrapperContained.BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE; }
// public void BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE(float value) { wrapperContained.BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE = value; }
public static float BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE() { return net.minecraft.entity.mob.MobEntity.BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE; }
// public static void BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE(float value, ) { net.minecraft.entity.mob.MobEntity.BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE = value; }

// public int MINIMUM_DROPPED_XP_PER_EQUIPMENT() { return wrapperContained.MINIMUM_DROPPED_XP_PER_EQUIPMENT; }
// public void MINIMUM_DROPPED_XP_PER_EQUIPMENT(int value) { wrapperContained.MINIMUM_DROPPED_XP_PER_EQUIPMENT = value; }
// public static int MINIMUM_DROPPED_XP_PER_EQUIPMENT() { return net.minecraft.entity.mob.MobEntity.MINIMUM_DROPPED_XP_PER_EQUIPMENT; }
// public static void MINIMUM_DROPPED_XP_PER_EQUIPMENT(int value, ) { net.minecraft.entity.mob.MobEntity.MINIMUM_DROPPED_XP_PER_EQUIPMENT = value; }

// public int AI_DISABLED_FLAG() { return wrapperContained.AI_DISABLED_FLAG; }
// public void AI_DISABLED_FLAG(int value) { wrapperContained.AI_DISABLED_FLAG = value; }
// public static int AI_DISABLED_FLAG() { return net.minecraft.entity.mob.MobEntity.AI_DISABLED_FLAG; }
// public static void AI_DISABLED_FLAG(int value, ) { net.minecraft.entity.mob.MobEntity.AI_DISABLED_FLAG = value; }

// public int LEFT_HANDED_FLAG() { return wrapperContained.LEFT_HANDED_FLAG; }
// public void LEFT_HANDED_FLAG(int value) { wrapperContained.LEFT_HANDED_FLAG = value; }
// public static int LEFT_HANDED_FLAG() { return net.minecraft.entity.mob.MobEntity.LEFT_HANDED_FLAG; }
// public static void LEFT_HANDED_FLAG(int value, ) { net.minecraft.entity.mob.MobEntity.LEFT_HANDED_FLAG = value; }

// public int ATTACKING_FLAG() { return wrapperContained.ATTACKING_FLAG; }
// public void ATTACKING_FLAG(int value) { wrapperContained.ATTACKING_FLAG = value; }
// public static int ATTACKING_FLAG() { return net.minecraft.entity.mob.MobEntity.ATTACKING_FLAG; }
// public static void ATTACKING_FLAG(int value, ) { net.minecraft.entity.mob.MobEntity.ATTACKING_FLAG = value; }

// public float BASE_SPAWN_EQUIPMENT_CHANCE() { return wrapperContained.BASE_SPAWN_EQUIPMENT_CHANCE; }
// public void BASE_SPAWN_EQUIPMENT_CHANCE(float value) { wrapperContained.BASE_SPAWN_EQUIPMENT_CHANCE = value; }
public static float BASE_SPAWN_EQUIPMENT_CHANCE() { return net.minecraft.entity.mob.MobEntity.BASE_SPAWN_EQUIPMENT_CHANCE; }
// public static void BASE_SPAWN_EQUIPMENT_CHANCE(float value, ) { net.minecraft.entity.mob.MobEntity.BASE_SPAWN_EQUIPMENT_CHANCE = value; }

// public float DEFAULT_DROP_CHANCE() { return wrapperContained.DEFAULT_DROP_CHANCE; }
// public void DEFAULT_DROP_CHANCE(float value) { wrapperContained.DEFAULT_DROP_CHANCE = value; }
public static float DEFAULT_DROP_CHANCE() { return net.minecraft.entity.mob.MobEntity.DEFAULT_DROP_CHANCE; }
// public static void DEFAULT_DROP_CHANCE(float value, ) { net.minecraft.entity.mob.MobEntity.DEFAULT_DROP_CHANCE = value; }

// public yarnwrap.util.math.Vec3i ITEM_PICK_UP_RANGE_EXPANDER() { return new yarnwrap.util.math.Vec3i(wrapperContained.ITEM_PICK_UP_RANGE_EXPANDER); }
// public void ITEM_PICK_UP_RANGE_EXPANDER(yarnwrap.util.math.Vec3i value) { wrapperContained.ITEM_PICK_UP_RANGE_EXPANDER = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3i ITEM_PICK_UP_RANGE_EXPANDER() { return new yarnwrap.util.math.Vec3i(net.minecraft.entity.mob.MobEntity.ITEM_PICK_UP_RANGE_EXPANDER); }
// public static void ITEM_PICK_UP_RANGE_EXPANDER(yarnwrap.util.math.Vec3i value, ) { net.minecraft.entity.mob.MobEntity.ITEM_PICK_UP_RANGE_EXPANDER = value.wrapperContained; }

// public double ATTACK_RANGE() { return wrapperContained.ATTACK_RANGE; }
// public void ATTACK_RANGE(double value) { wrapperContained.ATTACK_RANGE = value; }
// public static double ATTACK_RANGE() { return net.minecraft.entity.mob.MobEntity.ATTACK_RANGE; }
// public static void ATTACK_RANGE(double value, ) { net.minecraft.entity.mob.MobEntity.ATTACK_RANGE = value; }

// public float bodyArmorDropChance() { return wrapperContained.bodyArmorDropChance; }
// public void bodyArmorDropChance(float value) { wrapperContained.bodyArmorDropChance = value; }
// public static float bodyArmorDropChance() { return net.minecraft.entity.mob.MobEntity.bodyArmorDropChance; }
// public static void bodyArmorDropChance(float value, ) { net.minecraft.entity.mob.MobEntity.bodyArmorDropChance = value; }

// public yarnwrap.item.ItemStack bodyArmor() { return new yarnwrap.item.ItemStack(wrapperContained.bodyArmor); }
// public void bodyArmor(yarnwrap.item.ItemStack value) { wrapperContained.bodyArmor = value.wrapperContained; }
// public static yarnwrap.item.ItemStack bodyArmor() { return new yarnwrap.item.ItemStack(net.minecraft.entity.mob.MobEntity.bodyArmor); }
// public static void bodyArmor(yarnwrap.item.ItemStack value, ) { net.minecraft.entity.mob.MobEntity.bodyArmor = value.wrapperContained; }

// public yarnwrap.util.Identifier RANDOM_SPAWN_BONUS_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.RANDOM_SPAWN_BONUS_MODIFIER_ID); }
// public void RANDOM_SPAWN_BONUS_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.RANDOM_SPAWN_BONUS_MODIFIER_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier RANDOM_SPAWN_BONUS_MODIFIER_ID() { return new yarnwrap.util.Identifier(net.minecraft.entity.mob.MobEntity.RANDOM_SPAWN_BONUS_MODIFIER_ID); }
// public static void RANDOM_SPAWN_BONUS_MODIFIER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.entity.mob.MobEntity.RANDOM_SPAWN_BONUS_MODIFIER_ID = value.wrapperContained; }

// public Object leashData() { return wrapperContained.leashData; }
// // public void leashData(Object value) { wrapperContained.leashData = value; }
// // public static Object leashData() { return net.minecraft.entity.mob.MobEntity.leashData; }
// // public static void leashData(Object value, ) { net.minecraft.entity.mob.MobEntity.leashData = value; }

// public long lootTableSeed() { return wrapperContained.lootTableSeed; }
// public void lootTableSeed(long value) { wrapperContained.lootTableSeed = value; }
// public static long lootTableSeed() { return net.minecraft.entity.mob.MobEntity.lootTableSeed; }
// public static void lootTableSeed(long value, ) { net.minecraft.entity.mob.MobEntity.lootTableSeed = value; }

// public yarnwrap.entity.ai.goal.GoalSelector targetSelector() { return new yarnwrap.entity.ai.goal.GoalSelector(wrapperContained.targetSelector); }
// public void targetSelector(yarnwrap.entity.ai.goal.GoalSelector value) { wrapperContained.targetSelector = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.GoalSelector targetSelector() { return new yarnwrap.entity.ai.goal.GoalSelector(net.minecraft.entity.mob.MobEntity.targetSelector); }
// public static void targetSelector(yarnwrap.entity.ai.goal.GoalSelector value, ) { net.minecraft.entity.mob.MobEntity.targetSelector = value.wrapperContained; }

// public float[] armorDropChances() { return wrapperContained.armorDropChances; }
// public void armorDropChances(float[] value) { wrapperContained.armorDropChances = value; }
// public static float[] armorDropChances() { return net.minecraft.entity.mob.MobEntity.armorDropChances; }
// public static void armorDropChances(float[] value, ) { net.minecraft.entity.mob.MobEntity.armorDropChances = value; }

// public float[] handDropChances() { return wrapperContained.handDropChances; }
// public void handDropChances(float[] value) { wrapperContained.handDropChances = value; }
// public static float[] handDropChances() { return net.minecraft.entity.mob.MobEntity.handDropChances; }
// public static void handDropChances(float[] value, ) { net.minecraft.entity.mob.MobEntity.handDropChances = value; }

// public yarnwrap.entity.ai.control.BodyControl bodyControl() { return new yarnwrap.entity.ai.control.BodyControl(wrapperContained.bodyControl); }
// public void bodyControl(yarnwrap.entity.ai.control.BodyControl value) { wrapperContained.bodyControl = value.wrapperContained; }
// public static yarnwrap.entity.ai.control.BodyControl bodyControl() { return new yarnwrap.entity.ai.control.BodyControl(net.minecraft.entity.mob.MobEntity.bodyControl); }
// public static void bodyControl(yarnwrap.entity.ai.control.BodyControl value, ) { net.minecraft.entity.mob.MobEntity.bodyControl = value.wrapperContained; }

// public yarnwrap.entity.ai.pathing.EntityNavigation navigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.navigation); }
// public void navigation(yarnwrap.entity.ai.pathing.EntityNavigation value) { wrapperContained.navigation = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.EntityNavigation navigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(net.minecraft.entity.mob.MobEntity.navigation); }
// public static void navigation(yarnwrap.entity.ai.pathing.EntityNavigation value, ) { net.minecraft.entity.mob.MobEntity.navigation = value.wrapperContained; }

// public yarnwrap.entity.mob.MobVisibilityCache visibilityCache() { return new yarnwrap.entity.mob.MobVisibilityCache(wrapperContained.visibilityCache); }
// public void visibilityCache(yarnwrap.entity.mob.MobVisibilityCache value) { wrapperContained.visibilityCache = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobVisibilityCache visibilityCache() { return new yarnwrap.entity.mob.MobVisibilityCache(net.minecraft.entity.mob.MobEntity.visibilityCache); }
// public static void visibilityCache(yarnwrap.entity.mob.MobVisibilityCache value, ) { net.minecraft.entity.mob.MobEntity.visibilityCache = value.wrapperContained; }

public int ambientSoundChance() { return wrapperContained.ambientSoundChance; }
public void ambientSoundChance(int value) { wrapperContained.ambientSoundChance = value; }
// public static int ambientSoundChance() { return net.minecraft.entity.mob.MobEntity.ambientSoundChance; }
// public static void ambientSoundChance(int value, ) { net.minecraft.entity.mob.MobEntity.ambientSoundChance = value; }

// public yarnwrap.entity.data.TrackedData MOB_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MOB_FLAGS); }
// public void MOB_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.MOB_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData MOB_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.MobEntity.MOB_FLAGS); }
// public static void MOB_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.MobEntity.MOB_FLAGS = value.wrapperContained; }

// public int experiencePoints() { return wrapperContained.experiencePoints; }
// public void experiencePoints(int value) { wrapperContained.experiencePoints = value; }
// public static int experiencePoints() { return net.minecraft.entity.mob.MobEntity.experiencePoints; }
// public static void experiencePoints(int value, ) { net.minecraft.entity.mob.MobEntity.experiencePoints = value; }

// public yarnwrap.util.collection.DefaultedList handItems() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.handItems); }
// public void handItems(yarnwrap.util.collection.DefaultedList value) { wrapperContained.handItems = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList handItems() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.entity.mob.MobEntity.handItems); }
// public static void handItems(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.entity.mob.MobEntity.handItems = value.wrapperContained; }

// public java.util.Map pathfindingPenalties() { return wrapperContained.pathfindingPenalties; }
// public void pathfindingPenalties(java.util.Map value) { wrapperContained.pathfindingPenalties = value; }
// public static java.util.Map pathfindingPenalties() { return net.minecraft.entity.mob.MobEntity.pathfindingPenalties; }
// public static void pathfindingPenalties(java.util.Map value, ) { net.minecraft.entity.mob.MobEntity.pathfindingPenalties = value; }

// public yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTable); }
// public void lootTable(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTable = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey lootTable() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.mob.MobEntity.lootTable); }
// public static void lootTable(yarnwrap.registry.RegistryKey value, ) { net.minecraft.entity.mob.MobEntity.lootTable = value.wrapperContained; }

// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.MobEntity.target); }
// public static void target(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.mob.MobEntity.target = value.wrapperContained; }

// public boolean persistent() { return wrapperContained.persistent; }
// public void persistent(boolean value) { wrapperContained.persistent = value; }
// public static boolean persistent() { return net.minecraft.entity.mob.MobEntity.persistent; }
// public static void persistent(boolean value, ) { net.minecraft.entity.mob.MobEntity.persistent = value; }

// public yarnwrap.entity.ai.goal.GoalSelector goalSelector() { return new yarnwrap.entity.ai.goal.GoalSelector(wrapperContained.goalSelector); }
// public void goalSelector(yarnwrap.entity.ai.goal.GoalSelector value) { wrapperContained.goalSelector = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.GoalSelector goalSelector() { return new yarnwrap.entity.ai.goal.GoalSelector(net.minecraft.entity.mob.MobEntity.goalSelector); }
// public static void goalSelector(yarnwrap.entity.ai.goal.GoalSelector value, ) { net.minecraft.entity.mob.MobEntity.goalSelector = value.wrapperContained; }

// public boolean canPickUpLoot() { return wrapperContained.canPickUpLoot; }
// public void canPickUpLoot(boolean value) { wrapperContained.canPickUpLoot = value; }
// public static boolean canPickUpLoot() { return net.minecraft.entity.mob.MobEntity.canPickUpLoot; }
// public static void canPickUpLoot(boolean value, ) { net.minecraft.entity.mob.MobEntity.canPickUpLoot = value; }

// public yarnwrap.entity.ai.control.JumpControl jumpControl() { return new yarnwrap.entity.ai.control.JumpControl(wrapperContained.jumpControl); }
// public void jumpControl(yarnwrap.entity.ai.control.JumpControl value) { wrapperContained.jumpControl = value.wrapperContained; }
// public static yarnwrap.entity.ai.control.JumpControl jumpControl() { return new yarnwrap.entity.ai.control.JumpControl(net.minecraft.entity.mob.MobEntity.jumpControl); }
// public static void jumpControl(yarnwrap.entity.ai.control.JumpControl value, ) { net.minecraft.entity.mob.MobEntity.jumpControl = value.wrapperContained; }

// public yarnwrap.util.collection.DefaultedList armorItems() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.armorItems); }
// public void armorItems(yarnwrap.util.collection.DefaultedList value) { wrapperContained.armorItems = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList armorItems() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.entity.mob.MobEntity.armorItems); }
// public static void armorItems(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.entity.mob.MobEntity.armorItems = value.wrapperContained; }

// public yarnwrap.entity.ai.control.LookControl lookControl() { return new yarnwrap.entity.ai.control.LookControl(wrapperContained.lookControl); }
// public void lookControl(yarnwrap.entity.ai.control.LookControl value) { wrapperContained.lookControl = value.wrapperContained; }
// public static yarnwrap.entity.ai.control.LookControl lookControl() { return new yarnwrap.entity.ai.control.LookControl(net.minecraft.entity.mob.MobEntity.lookControl); }
// public static void lookControl(yarnwrap.entity.ai.control.LookControl value, ) { net.minecraft.entity.mob.MobEntity.lookControl = value.wrapperContained; }

// public yarnwrap.entity.ai.control.MoveControl moveControl() { return new yarnwrap.entity.ai.control.MoveControl(wrapperContained.moveControl); }
// public void moveControl(yarnwrap.entity.ai.control.MoveControl value) { wrapperContained.moveControl = value.wrapperContained; }
// public static yarnwrap.entity.ai.control.MoveControl moveControl() { return new yarnwrap.entity.ai.control.MoveControl(net.minecraft.entity.mob.MobEntity.moveControl); }
// public static void moveControl(yarnwrap.entity.ai.control.MoveControl value, ) { net.minecraft.entity.mob.MobEntity.moveControl = value.wrapperContained; }

public boolean cannotDespawn() { return wrapperContained.cannotDespawn(); }
// public static boolean cannotDespawn() { return net.minecraft.entity.mob.MobEntity.cannotDespawn(); }
// public void onPlayerSpawnedChild(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.mob.MobEntity child) { wrapperContained.onPlayerSpawnedChild(player.wrapperContained,child.wrapperContained); }
// public static void onPlayerSpawnedChild(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.mob.MobEntity child, ) { net.minecraft.entity.mob.MobEntity.onPlayerSpawnedChild(player.wrapperContained,child.wrapperContained); }
public boolean isInWalkTargetRange(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInWalkTargetRange(pos.wrapperContained); }
// public static boolean isInWalkTargetRange(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.mob.MobEntity.isInWalkTargetRange(pos.wrapperContained); }
public void setPositionTarget(yarnwrap.util.math.BlockPos target,int range) { wrapperContained.setPositionTarget(target.wrapperContained,range); }
// public static void setPositionTarget(yarnwrap.util.math.BlockPos target,int range, ) { net.minecraft.entity.mob.MobEntity.setPositionTarget(target.wrapperContained,range); }
// public void sendAiDebugData() { wrapperContained.sendAiDebugData(); }
// public static void sendAiDebugData() { net.minecraft.entity.mob.MobEntity.sendAiDebugData(); }
public boolean hasPositionTarget() { return wrapperContained.hasPositionTarget(); }
// public static boolean hasPositionTarget() { return net.minecraft.entity.mob.MobEntity.hasPositionTarget(); }
public boolean isInWalkTargetRange() { return wrapperContained.isInWalkTargetRange(); }
// public static boolean isInWalkTargetRange() { return net.minecraft.entity.mob.MobEntity.isInWalkTargetRange(); }
public yarnwrap.util.math.BlockPos getPositionTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPositionTarget()); }
// public static yarnwrap.util.math.BlockPos getPositionTarget() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.mob.MobEntity.getPositionTarget()); }
public float getPositionTargetRange() { return wrapperContained.getPositionTargetRange(); }
// public static float getPositionTargetRange() { return net.minecraft.entity.mob.MobEntity.getPositionTargetRange(); }
public void setAttacking(boolean attacking) { wrapperContained.setAttacking(attacking); }
// public static void setAttacking(boolean attacking, ) { net.minecraft.entity.mob.MobEntity.setAttacking(attacking); }
public int getMaxLookYawChange() { return wrapperContained.getMaxLookYawChange(); }
// public static int getMaxLookYawChange() { return net.minecraft.entity.mob.MobEntity.getMaxLookYawChange(); }
// public void updateGoalControls() { wrapperContained.updateGoalControls(); }
// public static void updateGoalControls() { net.minecraft.entity.mob.MobEntity.updateGoalControls(); }
// public boolean canMobSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canMobSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canMobSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.MobEntity.canMobSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean canGather(yarnwrap.item.ItemStack stack) { return wrapperContained.canGather(stack.wrapperContained); }
// public static boolean canGather(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.mob.MobEntity.canGather(stack.wrapperContained); }
// public boolean isDisallowedInPeaceful() { return wrapperContained.isDisallowedInPeaceful(); }
// public static boolean isDisallowedInPeaceful() { return net.minecraft.entity.mob.MobEntity.isDisallowedInPeaceful(); }
// public void method_24522(yarnwrap.entity.player.PlayerEntity entity) { wrapperContained.method_24522(entity.wrapperContained); }
// public static void method_24522(yarnwrap.entity.player.PlayerEntity entity, ) { net.minecraft.entity.mob.MobEntity.method_24522(entity.wrapperContained); }
public yarnwrap.item.ItemStack tryEquip(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.tryEquip(stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack tryEquip(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.mob.MobEntity.tryEquip(stack.wrapperContained)); }
// public void equipLootStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack) { wrapperContained.equipLootStack(slot.wrapperContained,stack.wrapperContained); }
// public static void equipLootStack(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.mob.MobEntity.equipLootStack(slot.wrapperContained,stack.wrapperContained); }
public boolean canUseRangedWeapon(yarnwrap.item.RangedWeaponItem weapon) { return wrapperContained.canUseRangedWeapon(weapon.wrapperContained); }
// public static boolean canUseRangedWeapon(yarnwrap.item.RangedWeaponItem weapon, ) { return net.minecraft.entity.mob.MobEntity.canUseRangedWeapon(weapon.wrapperContained); }
public void updateDropChances(yarnwrap.entity.EquipmentSlot slot) { wrapperContained.updateDropChances(slot.wrapperContained); }
// public static void updateDropChances(yarnwrap.entity.EquipmentSlot slot, ) { net.minecraft.entity.mob.MobEntity.updateDropChances(slot.wrapperContained); }
public boolean prefersNewDamageableItem(yarnwrap.item.ItemStack newStack,yarnwrap.item.ItemStack oldStack) { return wrapperContained.prefersNewDamageableItem(newStack.wrapperContained,oldStack.wrapperContained); }
// public static boolean prefersNewDamageableItem(yarnwrap.item.ItemStack newStack,yarnwrap.item.ItemStack oldStack, ) { return net.minecraft.entity.mob.MobEntity.prefersNewDamageableItem(newStack.wrapperContained,oldStack.wrapperContained); }
// public boolean movesIndependently() { return wrapperContained.movesIndependently(); }
// public static boolean movesIndependently() { return net.minecraft.entity.mob.MobEntity.movesIndependently(); }
// public Object createMobAttributes() { return wrapperContained.createMobAttributes(); }
public static Object createMobAttributes() { return net.minecraft.entity.mob.MobEntity.createMobAttributes(); }
public yarnwrap.entity.mob.MobEntity convertTo(yarnwrap.entity.EntityType entityType,boolean keepEquipment) { return new yarnwrap.entity.mob.MobEntity(wrapperContained.convertTo(entityType.wrapperContained,keepEquipment)); }
// public static yarnwrap.entity.mob.MobEntity convertTo(yarnwrap.entity.EntityType entityType,boolean keepEquipment, ) { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.mob.MobEntity.convertTo(entityType.wrapperContained,keepEquipment)); }
// public yarnwrap.util.ActionResult interactWithItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactWithItem(player.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactWithItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.entity.mob.MobEntity.interactWithItem(player.wrapperContained,hand.wrapperContained)); }
// public void enchantEquipment(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.entity.EquipmentSlot slot,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.enchantEquipment(world.wrapperContained,random.wrapperContained,slot.wrapperContained,localDifficulty.wrapperContained); }
// public static void enchantEquipment(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.entity.EquipmentSlot slot,yarnwrap.world.LocalDifficulty localDifficulty, ) { net.minecraft.entity.mob.MobEntity.enchantEquipment(world.wrapperContained,random.wrapperContained,slot.wrapperContained,localDifficulty.wrapperContained); }
// public void enchantMainHandItem(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.enchantMainHandItem(world.wrapperContained,random.wrapperContained,localDifficulty.wrapperContained); }
// public static void enchantMainHandItem(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty, ) { net.minecraft.entity.mob.MobEntity.enchantMainHandItem(world.wrapperContained,random.wrapperContained,localDifficulty.wrapperContained); }
public void clearPositionTarget() { wrapperContained.clearPositionTarget(); }
// public static void clearPositionTarget() { net.minecraft.entity.mob.MobEntity.clearPositionTarget(); }
public void clearGoalsAndTasks() { wrapperContained.clearGoalsAndTasks(); }
// public static void clearGoalsAndTasks() { net.minecraft.entity.mob.MobEntity.clearGoalsAndTasks(); }
// public void method_37341(yarnwrap.item.ItemStack stack) { wrapperContained.method_37341(stack.wrapperContained); }
// public static void method_37341(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.mob.MobEntity.method_37341(stack.wrapperContained); }
public boolean isInAttackRange(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isInAttackRange(entity.wrapperContained); }
// public static boolean isInAttackRange(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.mob.MobEntity.isInAttackRange(entity.wrapperContained); }
// public yarnwrap.util.math.Vec3i getItemPickUpRangeExpander() { return new yarnwrap.util.math.Vec3i(wrapperContained.getItemPickUpRangeExpander()); }
// public static yarnwrap.util.math.Vec3i getItemPickUpRangeExpander() { return new yarnwrap.util.math.Vec3i(net.minecraft.entity.mob.MobEntity.getItemPickUpRangeExpander()); }
// public boolean method_47824(yarnwrap.entity.ai.goal.Goal goal) { return wrapperContained.method_47824(goal.wrapperContained); }
// public static boolean method_47824(yarnwrap.entity.ai.goal.Goal goal, ) { return net.minecraft.entity.mob.MobEntity.method_47824(goal.wrapperContained); }
public void clearGoals(java.util.function.Predicate predicate) { wrapperContained.clearGoals(predicate); }
// public static void clearGoals(java.util.function.Predicate predicate, ) { net.minecraft.entity.mob.MobEntity.clearGoals(predicate); }
public void onFinishPathfinding() { wrapperContained.onFinishPathfinding(); }
// public static void onFinishPathfinding() { net.minecraft.entity.mob.MobEntity.onFinishPathfinding(); }
public void onStartPathfinding() { wrapperContained.onStartPathfinding(); }
// public static void onStartPathfinding() { net.minecraft.entity.mob.MobEntity.onStartPathfinding(); }
// public yarnwrap.util.math.Box getAttackBox() { return new yarnwrap.util.math.Box(wrapperContained.getAttackBox()); }
// public static yarnwrap.util.math.Box getAttackBox() { return new yarnwrap.util.math.Box(net.minecraft.entity.mob.MobEntity.getAttackBox()); }
public void stopMovement() { wrapperContained.stopMovement(); }
// public static void stopMovement() { net.minecraft.entity.mob.MobEntity.stopMovement(); }
// public void clampHeadYaw() { wrapperContained.clampHeadYaw(); }
// public static void clampHeadYaw() { net.minecraft.entity.mob.MobEntity.clampHeadYaw(); }
public yarnwrap.item.ItemStack getBodyArmor() { return new yarnwrap.item.ItemStack(wrapperContained.getBodyArmor()); }
// public static yarnwrap.item.ItemStack getBodyArmor() { return new yarnwrap.item.ItemStack(net.minecraft.entity.mob.MobEntity.getBodyArmor()); }
public boolean isWearingBodyArmor() { return wrapperContained.isWearingBodyArmor(); }
// public static boolean isWearingBodyArmor() { return net.minecraft.entity.mob.MobEntity.isWearingBodyArmor(); }
public void equipBodyArmor(yarnwrap.item.ItemStack stack) { wrapperContained.equipBodyArmor(stack.wrapperContained); }
// public static void equipBodyArmor(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.mob.MobEntity.equipBodyArmor(stack.wrapperContained); }
// public double getAttackDamageWith(yarnwrap.item.ItemStack stack) { return wrapperContained.getAttackDamageWith(stack.wrapperContained); }
// public static double getAttackDamageWith(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.mob.MobEntity.getAttackDamageWith(stack.wrapperContained); }
// public boolean hasComponentsOtherThanDamage(yarnwrap.item.ItemStack stack) { return wrapperContained.hasComponentsOtherThanDamage(stack.wrapperContained); }
// public static boolean hasComponentsOtherThanDamage(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.mob.MobEntity.hasComponentsOtherThanDamage(stack.wrapperContained); }
public void setEquipmentFromTable(yarnwrap.entity.EquipmentTable equipmentTable) { wrapperContained.setEquipmentFromTable(equipmentTable.wrapperContained); }
// public static void setEquipmentFromTable(yarnwrap.entity.EquipmentTable equipmentTable, ) { net.minecraft.entity.mob.MobEntity.setEquipmentFromTable(equipmentTable.wrapperContained); }
// public yarnwrap.loot.context.LootContextParameterSet createEquipmentLootParameters(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.loot.context.LootContextParameterSet(wrapperContained.createEquipmentLootParameters(world.wrapperContained)); }
// public static yarnwrap.loot.context.LootContextParameterSet createEquipmentLootParameters(yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.loot.context.LootContextParameterSet(net.minecraft.entity.mob.MobEntity.createEquipmentLootParameters(world.wrapperContained)); }
// public float getDropChance(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.getDropChance(slot.wrapperContained); }
// public static float getDropChance(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.entity.mob.MobEntity.getDropChance(slot.wrapperContained); }
public void setForwardSpeed(float forwardSpeed) { wrapperContained.setForwardSpeed(forwardSpeed); }
// public static void setForwardSpeed(float forwardSpeed, ) { net.minecraft.entity.mob.MobEntity.setForwardSpeed(forwardSpeed); }
// public void method_5932(boolean sendPacket,boolean dropItem) { wrapperContained.method_5932(sendPacket,dropItem); }
// public static void method_5932(boolean sendPacket,boolean dropItem, ) { net.minecraft.entity.mob.MobEntity.method_5932(sendPacket,dropItem); }
// public boolean canPickUpLoot() { return wrapperContained.canPickUpLoot(); }
// // public static boolean canPickUpLoot() { return net.minecraft.entity.mob.MobEntity.canPickUpLoot(); }
public void setLeftHanded(boolean leftHanded) { wrapperContained.setLeftHanded(leftHanded); }
// public static void setLeftHanded(boolean leftHanded, ) { net.minecraft.entity.mob.MobEntity.setLeftHanded(leftHanded); }
public void setSidewaysSpeed(float sidewaysSpeed) { wrapperContained.setSidewaysSpeed(sidewaysSpeed); }
// public static void setSidewaysSpeed(float sidewaysSpeed, ) { net.minecraft.entity.mob.MobEntity.setSidewaysSpeed(sidewaysSpeed); }
public boolean canPickupItem(yarnwrap.item.ItemStack stack) { return wrapperContained.canPickupItem(stack.wrapperContained); }
// public static boolean canPickupItem(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.mob.MobEntity.canPickupItem(stack.wrapperContained); }
public void setPathfindingPenalty(yarnwrap.entity.ai.pathing.PathNodeType nodeType,float penalty) { wrapperContained.setPathfindingPenalty(nodeType.wrapperContained,penalty); }
// public static void setPathfindingPenalty(yarnwrap.entity.ai.pathing.PathNodeType nodeType,float penalty, ) { net.minecraft.entity.mob.MobEntity.setPathfindingPenalty(nodeType.wrapperContained,penalty); }
public yarnwrap.entity.ai.pathing.EntityNavigation getNavigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.getNavigation()); }
// public static yarnwrap.entity.ai.pathing.EntityNavigation getNavigation() { return new yarnwrap.entity.ai.pathing.EntityNavigation(net.minecraft.entity.mob.MobEntity.getNavigation()); }
public yarnwrap.entity.EntityData initialize(yarnwrap.world.ServerWorldAccess world,yarnwrap.world.LocalDifficulty difficulty,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.entity.EntityData entityData) { return new yarnwrap.entity.EntityData(wrapperContained.initialize(world.wrapperContained,difficulty.wrapperContained,spawnReason.wrapperContained,entityData.wrapperContained)); }
// public static yarnwrap.entity.EntityData initialize(yarnwrap.world.ServerWorldAccess world,yarnwrap.world.LocalDifficulty difficulty,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.entity.EntityData entityData, ) { return new yarnwrap.entity.EntityData(net.minecraft.entity.mob.MobEntity.initialize(world.wrapperContained,difficulty.wrapperContained,spawnReason.wrapperContained,entityData.wrapperContained)); }
public float getPathfindingPenalty(yarnwrap.entity.ai.pathing.PathNodeType nodeType) { return wrapperContained.getPathfindingPenalty(nodeType.wrapperContained); }
// public static float getPathfindingPenalty(yarnwrap.entity.ai.pathing.PathNodeType nodeType, ) { return net.minecraft.entity.mob.MobEntity.getPathfindingPenalty(nodeType.wrapperContained); }
public int getLimitPerChunk() { return wrapperContained.getLimitPerChunk(); }
// public static int getLimitPerChunk() { return net.minecraft.entity.mob.MobEntity.getLimitPerChunk(); }
public boolean isPersistent() { return wrapperContained.isPersistent(); }
// public static boolean isPersistent() { return net.minecraft.entity.mob.MobEntity.isPersistent(); }
// public yarnwrap.item.Item getEquipmentForSlot(yarnwrap.entity.EquipmentSlot equipmentSlot,int equipmentLevel) { return new yarnwrap.item.Item(wrapperContained.getEquipmentForSlot(equipmentSlot.wrapperContained,equipmentLevel)); }
// public static yarnwrap.item.Item getEquipmentForSlot(yarnwrap.entity.EquipmentSlot equipmentSlot,int equipmentLevel, ) { return new yarnwrap.item.Item(net.minecraft.entity.mob.MobEntity.getEquipmentForSlot(equipmentSlot.wrapperContained,equipmentLevel)); }
// public void loot(yarnwrap.entity.ItemEntity item) { wrapperContained.loot(item.wrapperContained); }
// public static void loot(yarnwrap.entity.ItemEntity item, ) { net.minecraft.entity.mob.MobEntity.loot(item.wrapperContained); }
public void lookAtEntity(yarnwrap.entity.Entity targetEntity,float maxYawChange,float maxPitchChange) { wrapperContained.lookAtEntity(targetEntity.wrapperContained,maxYawChange,maxPitchChange); }
// public static void lookAtEntity(yarnwrap.entity.Entity targetEntity,float maxYawChange,float maxPitchChange, ) { net.minecraft.entity.mob.MobEntity.lookAtEntity(targetEntity.wrapperContained,maxYawChange,maxPitchChange); }
public void setCanPickUpLoot(boolean canPickUpLoot) { wrapperContained.setCanPickUpLoot(canPickUpLoot); }
// public static void setCanPickUpLoot(boolean canPickUpLoot, ) { net.minecraft.entity.mob.MobEntity.setCanPickUpLoot(canPickUpLoot); }
// public boolean prefersNewEquipment(yarnwrap.item.ItemStack newStack,yarnwrap.item.ItemStack oldStack) { return wrapperContained.prefersNewEquipment(newStack.wrapperContained,oldStack.wrapperContained); }
// public static boolean prefersNewEquipment(yarnwrap.item.ItemStack newStack,yarnwrap.item.ItemStack oldStack, ) { return net.minecraft.entity.mob.MobEntity.prefersNewEquipment(newStack.wrapperContained,oldStack.wrapperContained); }
public boolean canSpawn(yarnwrap.world.WorldView world) { return wrapperContained.canSpawn(world.wrapperContained); }
// public static boolean canSpawn(yarnwrap.world.WorldView world, ) { return net.minecraft.entity.mob.MobEntity.canSpawn(world.wrapperContained); }
// public void mobTick() { wrapperContained.mobTick(); }
// public static void mobTick() { net.minecraft.entity.mob.MobEntity.mobTick(); }
// public void initGoals() { wrapperContained.initGoals(); }
// public static void initGoals() { net.minecraft.entity.mob.MobEntity.initGoals(); }
// public float changeAngle(float from,float to,float max) { return wrapperContained.changeAngle(from,to,max); }
// public static float changeAngle(float from,float to,float max, ) { return net.minecraft.entity.mob.MobEntity.changeAngle(from,to,max); }
public boolean isLeftHanded() { return wrapperContained.isLeftHanded(); }
// public static boolean isLeftHanded() { return net.minecraft.entity.mob.MobEntity.isLeftHanded(); }
public yarnwrap.entity.ai.control.MoveControl getMoveControl() { return new yarnwrap.entity.ai.control.MoveControl(wrapperContained.getMoveControl()); }
// public static yarnwrap.entity.ai.control.MoveControl getMoveControl() { return new yarnwrap.entity.ai.control.MoveControl(net.minecraft.entity.mob.MobEntity.getMoveControl()); }
// public yarnwrap.entity.ai.control.BodyControl createBodyControl() { return new yarnwrap.entity.ai.control.BodyControl(wrapperContained.createBodyControl()); }
// public static yarnwrap.entity.ai.control.BodyControl createBodyControl() { return new yarnwrap.entity.ai.control.BodyControl(net.minecraft.entity.mob.MobEntity.createBodyControl()); }
// public void initEquipment(yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.initEquipment(random.wrapperContained,localDifficulty.wrapperContained); }
// public static void initEquipment(yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty, ) { net.minecraft.entity.mob.MobEntity.initEquipment(random.wrapperContained,localDifficulty.wrapperContained); }
// public yarnwrap.entity.ai.pathing.EntityNavigation createNavigation(yarnwrap.world.World world) { return new yarnwrap.entity.ai.pathing.EntityNavigation(wrapperContained.createNavigation(world.wrapperContained)); }
// public static yarnwrap.entity.ai.pathing.EntityNavigation createNavigation(yarnwrap.world.World world, ) { return new yarnwrap.entity.ai.pathing.EntityNavigation(net.minecraft.entity.mob.MobEntity.createNavigation(world.wrapperContained)); }
public void playAmbientSound() { wrapperContained.playAmbientSound(); }
// public static void playAmbientSound() { net.minecraft.entity.mob.MobEntity.playAmbientSound(); }
// public yarnwrap.entity.LivingEntity getTargetInBrain() { return new yarnwrap.entity.LivingEntity(wrapperContained.getTargetInBrain()); }
// public static yarnwrap.entity.LivingEntity getTargetInBrain() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.MobEntity.getTargetInBrain()); }
public void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,java.util.Map slotDropChances) { wrapperContained.setEquipmentFromTable(lootTable.wrapperContained,slotDropChances); }
// public static void setEquipmentFromTable(yarnwrap.registry.RegistryKey lootTable,java.util.Map slotDropChances, ) { net.minecraft.entity.mob.MobEntity.setEquipmentFromTable(lootTable.wrapperContained,slotDropChances); }
public boolean spawnsTooManyForEachTry(int count) { return wrapperContained.spawnsTooManyForEachTry(count); }
// public static boolean spawnsTooManyForEachTry(int count, ) { return net.minecraft.entity.mob.MobEntity.spawnsTooManyForEachTry(count); }
public int getMinAmbientSoundDelay() { return wrapperContained.getMinAmbientSoundDelay(); }
// public static int getMinAmbientSoundDelay() { return net.minecraft.entity.mob.MobEntity.getMinAmbientSoundDelay(); }
public void setPersistent() { wrapperContained.setPersistent(); }
// public static void setPersistent() { net.minecraft.entity.mob.MobEntity.setPersistent(); }
// public boolean isAffectedByDaylight() { return wrapperContained.isAffectedByDaylight(); }
// public static boolean isAffectedByDaylight() { return net.minecraft.entity.mob.MobEntity.isAffectedByDaylight(); }
public boolean canImmediatelyDespawn(double distanceSquared) { return wrapperContained.canImmediatelyDespawn(distanceSquared); }
// public static boolean canImmediatelyDespawn(double distanceSquared, ) { return net.minecraft.entity.mob.MobEntity.canImmediatelyDespawn(distanceSquared); }
// public void resetSoundDelay() { wrapperContained.resetSoundDelay(); }
// public static void resetSoundDelay() { net.minecraft.entity.mob.MobEntity.resetSoundDelay(); }
public void setUpwardSpeed(float upwardSpeed) { wrapperContained.setUpwardSpeed(upwardSpeed); }
// public static void setUpwardSpeed(float upwardSpeed, ) { net.minecraft.entity.mob.MobEntity.setUpwardSpeed(upwardSpeed); }
public void setAiDisabled(boolean aiDisabled) { wrapperContained.setAiDisabled(aiDisabled); }
// public static void setAiDisabled(boolean aiDisabled, ) { net.minecraft.entity.mob.MobEntity.setAiDisabled(aiDisabled); }
public int getMaxLookPitchChange() { return wrapperContained.getMaxLookPitchChange(); }
// public static int getMaxLookPitchChange() { return net.minecraft.entity.mob.MobEntity.getMaxLookPitchChange(); }
public boolean canSpawn(yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason) { return wrapperContained.canSpawn(world.wrapperContained,spawnReason.wrapperContained); }
// public static boolean canSpawn(yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason, ) { return net.minecraft.entity.mob.MobEntity.canSpawn(world.wrapperContained,spawnReason.wrapperContained); }
public void setTarget(yarnwrap.entity.LivingEntity target) { wrapperContained.setTarget(target.wrapperContained); }
// public static void setTarget(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.mob.MobEntity.setTarget(target.wrapperContained); }
public void onEatingGrass() { wrapperContained.onEatingGrass(); }
// public static void onEatingGrass() { net.minecraft.entity.mob.MobEntity.onEatingGrass(); }
// public void updateEnchantments(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.updateEnchantments(world.wrapperContained,random.wrapperContained,localDifficulty.wrapperContained); }
// public static void updateEnchantments(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty, ) { net.minecraft.entity.mob.MobEntity.updateEnchantments(world.wrapperContained,random.wrapperContained,localDifficulty.wrapperContained); }
public yarnwrap.entity.mob.MobVisibilityCache getVisibilityCache() { return new yarnwrap.entity.mob.MobVisibilityCache(wrapperContained.getVisibilityCache()); }
// public static yarnwrap.entity.mob.MobVisibilityCache getVisibilityCache() { return new yarnwrap.entity.mob.MobVisibilityCache(net.minecraft.entity.mob.MobEntity.getVisibilityCache()); }
public int getMaxHeadRotation() { return wrapperContained.getMaxHeadRotation(); }
// public static int getMaxHeadRotation() { return net.minecraft.entity.mob.MobEntity.getMaxHeadRotation(); }
public boolean isAiDisabled() { return wrapperContained.isAiDisabled(); }
// public static boolean isAiDisabled() { return net.minecraft.entity.mob.MobEntity.isAiDisabled(); }
public yarnwrap.entity.ai.control.LookControl getLookControl() { return new yarnwrap.entity.ai.control.LookControl(wrapperContained.getLookControl()); }
// public static yarnwrap.entity.ai.control.LookControl getLookControl() { return new yarnwrap.entity.ai.control.LookControl(net.minecraft.entity.mob.MobEntity.getLookControl()); }
public void playSpawnEffects() { wrapperContained.playSpawnEffects(); }
// public static void playSpawnEffects() { net.minecraft.entity.mob.MobEntity.playSpawnEffects(); }
// public yarnwrap.registry.RegistryKey getLootTableId() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTableId()); }
// public static yarnwrap.registry.RegistryKey getLootTableId() { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.mob.MobEntity.getLootTableId()); }
// public yarnwrap.util.ActionResult interactMob(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand) { return new yarnwrap.util.ActionResult(wrapperContained.interactMob(player.wrapperContained,hand.wrapperContained)); }
// public static yarnwrap.util.ActionResult interactMob(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand, ) { return new yarnwrap.util.ActionResult(net.minecraft.entity.mob.MobEntity.interactMob(player.wrapperContained,hand.wrapperContained)); }
// public void enchantEquipment(yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.EquipmentSlot slot,yarnwrap.util.math.random.Random random,float power,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.enchantEquipment(world.wrapperContained,slot.wrapperContained,random.wrapperContained,power,localDifficulty.wrapperContained); }
// public static void enchantEquipment(yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.EquipmentSlot slot,yarnwrap.util.math.random.Random random,float power,yarnwrap.world.LocalDifficulty localDifficulty, ) { net.minecraft.entity.mob.MobEntity.enchantEquipment(world.wrapperContained,slot.wrapperContained,random.wrapperContained,power,localDifficulty.wrapperContained); }
// public void playAttackSound() { wrapperContained.playAttackSound(); }
// public static void playAttackSound() { net.minecraft.entity.mob.MobEntity.playAttackSound(); }
public yarnwrap.entity.ai.control.JumpControl getJumpControl() { return new yarnwrap.entity.ai.control.JumpControl(wrapperContained.getJumpControl()); }
// public static yarnwrap.entity.ai.control.JumpControl getJumpControl() { return new yarnwrap.entity.ai.control.JumpControl(net.minecraft.entity.mob.MobEntity.getJumpControl()); }
// public yarnwrap.sound.SoundEvent getAmbientSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getAmbientSound()); }
// public static yarnwrap.sound.SoundEvent getAmbientSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.MobEntity.getAmbientSound()); }
public java.util.Set dropEquipment(java.util.function.Predicate dropPredicate) { return wrapperContained.dropEquipment(dropPredicate); }
// public static java.util.Set dropEquipment(java.util.function.Predicate dropPredicate, ) { return net.minecraft.entity.mob.MobEntity.dropEquipment(dropPredicate); }
public void dropAllEquipment() { wrapperContained.dropAllEquipment(); }
// public static void dropAllEquipment() { net.minecraft.entity.mob.MobEntity.dropAllEquipment(); }
// public boolean method_60974(yarnwrap.item.ItemStack stack) { return wrapperContained.method_60974(stack.wrapperContained); }
// public static boolean method_60974(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.mob.MobEntity.method_60974(stack.wrapperContained); }
public boolean isAttacking() { return wrapperContained.isAttacking(); }
// public static boolean isAttacking() { return net.minecraft.entity.mob.MobEntity.isAttacking(); }
public boolean isHorseArmor(yarnwrap.item.ItemStack stack) { return wrapperContained.isHorseArmor(stack.wrapperContained); }
// public static boolean isHorseArmor(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.mob.MobEntity.isHorseArmor(stack.wrapperContained); }
public void setBaby(boolean baby) { wrapperContained.setBaby(baby); }
// public static void setBaby(boolean baby, ) { net.minecraft.entity.mob.MobEntity.setBaby(baby); }

}