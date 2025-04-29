package yarnwrap.entity.mob;
public class DrownedEntity { public net.minecraft.entity.mob.DrownedEntity wrapperContained; public DrownedEntity(net.minecraft.entity.mob.DrownedEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.pathing.MobNavigation landNavigation() { return new yarnwrap.entity.ai.pathing.MobNavigation(wrapperContained.landNavigation); }
// public void landNavigation(yarnwrap.entity.ai.pathing.MobNavigation value) { wrapperContained.landNavigation = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.MobNavigation landNavigation() { return new yarnwrap.entity.ai.pathing.MobNavigation(net.minecraft.entity.mob.DrownedEntity.landNavigation); }
// public static void landNavigation(yarnwrap.entity.ai.pathing.MobNavigation value, ) { net.minecraft.entity.mob.DrownedEntity.landNavigation = value.wrapperContained; }

// public boolean targetingUnderwater() { return wrapperContained.targetingUnderwater; }
// public void targetingUnderwater(boolean value) { wrapperContained.targetingUnderwater = value; }
// public static boolean targetingUnderwater() { return net.minecraft.entity.mob.DrownedEntity.targetingUnderwater; }
// public static void targetingUnderwater(boolean value, ) { net.minecraft.entity.mob.DrownedEntity.targetingUnderwater = value; }

// public yarnwrap.entity.ai.pathing.SwimNavigation waterNavigation() { return new yarnwrap.entity.ai.pathing.SwimNavigation(wrapperContained.waterNavigation); }
// public void waterNavigation(yarnwrap.entity.ai.pathing.SwimNavigation value) { wrapperContained.waterNavigation = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.SwimNavigation waterNavigation() { return new yarnwrap.entity.ai.pathing.SwimNavigation(net.minecraft.entity.mob.DrownedEntity.waterNavigation); }
// public static void waterNavigation(yarnwrap.entity.ai.pathing.SwimNavigation value, ) { net.minecraft.entity.mob.DrownedEntity.waterNavigation = value.wrapperContained; }

// public boolean isValidSpawnDepth(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValidSpawnDepth(world.wrapperContained,pos.wrapperContained); }
// public static boolean isValidSpawnDepth(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.mob.DrownedEntity.isValidSpawnDepth(world.wrapperContained,pos.wrapperContained); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.DrownedEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createDrownedAttributes() { return wrapperContained.createDrownedAttributes(); }
public static Object createDrownedAttributes() { return net.minecraft.entity.mob.DrownedEntity.createDrownedAttributes(); }
public boolean canDrownedAttackTarget(yarnwrap.entity.LivingEntity target) { return wrapperContained.canDrownedAttackTarget(target.wrapperContained); }
// public static boolean canDrownedAttackTarget(yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.mob.DrownedEntity.canDrownedAttackTarget(target.wrapperContained); }
public void setTargetingUnderwater(boolean targetingUnderwater) { wrapperContained.setTargetingUnderwater(targetingUnderwater); }
// public static void setTargetingUnderwater(boolean targetingUnderwater, ) { net.minecraft.entity.mob.DrownedEntity.setTargetingUnderwater(targetingUnderwater); }
// public boolean hasFinishedCurrentPath() { return wrapperContained.hasFinishedCurrentPath(); }
// public static boolean hasFinishedCurrentPath() { return net.minecraft.entity.mob.DrownedEntity.hasFinishedCurrentPath(); }
// public boolean isTargetingUnderwater() { return wrapperContained.isTargetingUnderwater(); }
// public static boolean isTargetingUnderwater() { return net.minecraft.entity.mob.DrownedEntity.isTargetingUnderwater(); }

}