package yarnwrap.entity.mob;
public class DrownedEntity { public net.minecraft.entity.mob.DrownedEntity wrapperContained; public DrownedEntity(net.minecraft.entity.mob.DrownedEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.pathing.MobNavigation landNavigation() { return new yarnwrap.entity.ai.pathing.MobNavigation(wrapperContained.landNavigation); }
// public boolean targetingUnderwater() { return wrapperContained.targetingUnderwater; }
// public yarnwrap.entity.ai.pathing.SwimNavigation waterNavigation() { return new yarnwrap.entity.ai.pathing.SwimNavigation(wrapperContained.waterNavigation); }
// public boolean isValidSpawnDepth(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValidSpawnDepth(world.wrapperContained,pos.wrapperContained); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.ServerWorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createDrownedAttributes() { return wrapperContained.createDrownedAttributes(); }
public boolean canDrownedAttackTarget(yarnwrap.entity.LivingEntity target) { return wrapperContained.canDrownedAttackTarget(target.wrapperContained); }
public void setTargetingUnderwater(boolean targetingUnderwater) { wrapperContained.setTargetingUnderwater(targetingUnderwater); }
// public boolean hasFinishedCurrentPath() { return wrapperContained.hasFinishedCurrentPath(); }
// public boolean isTargetingUnderwater() { return wrapperContained.isTargetingUnderwater(); }

}