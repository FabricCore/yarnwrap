package yarnwrap.entity.projectile;
public class FishingBobberEntity { public net.minecraft.entity.projectile.FishingBobberEntity wrapperContained; public FishingBobberEntity(net.minecraft.entity.projectile.FishingBobberEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean inOpenWater() { return wrapperContained.inOpenWater; }
// public yarnwrap.util.math.random.Random velocityRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.velocityRandom); }
// public boolean caughtFish() { return wrapperContained.caughtFish; }
// public int outOfOpenWaterTicks() { return wrapperContained.outOfOpenWaterTicks; }
// public yarnwrap.entity.data.TrackedData CAUGHT_FISH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CAUGHT_FISH); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.entity.Entity hookedEntity() { return new yarnwrap.entity.Entity(wrapperContained.hookedEntity); }
// public int removalTimer() { return wrapperContained.removalTimer; }
// public int waitTimeReductionTicks() { return wrapperContained.waitTimeReductionTicks; }
// public float fishAngle() { return wrapperContained.fishAngle; }
// public yarnwrap.entity.data.TrackedData HOOK_ENTITY_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HOOK_ENTITY_ID); }
// public int luckBonus() { return wrapperContained.luckBonus; }
// public int fishTravelCountdown() { return wrapperContained.fishTravelCountdown; }
// public int hookCountdown() { return wrapperContained.hookCountdown; }
// public int waitCountdown() { return wrapperContained.waitCountdown; }
// public Object state() { return wrapperContained.state; }
// public boolean isOpenOrWaterAround(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isOpenOrWaterAround(pos.wrapperContained); }
public boolean isInOpenWater() { return wrapperContained.isInOpenWater(); }
// public Object getPositionType(yarnwrap.util.math.BlockPos start,yarnwrap.util.math.BlockPos end) { return wrapperContained.getPositionType(start.wrapperContained,end.wrapperContained); }
// public Object getPositionType(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPositionType(pos.wrapperContained); }
public yarnwrap.entity.Entity getHookedEntity() { return new yarnwrap.entity.Entity(wrapperContained.getHookedEntity()); }
// public void setPlayerFishHook(yarnwrap.entity.projectile.FishingBobberEntity fishingBobber) { wrapperContained.setPlayerFishHook(fishingBobber.wrapperContained); }
public yarnwrap.entity.player.PlayerEntity getPlayerOwner() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getPlayerOwner()); }
// public void tickFishingLogic(yarnwrap.util.math.BlockPos pos) { wrapperContained.tickFishingLogic(pos.wrapperContained); }
// public void updateHookedEntityId(yarnwrap.entity.Entity entity) { wrapperContained.updateHookedEntityId(entity.wrapperContained); }
// public void pullHookedEntity(yarnwrap.entity.Entity entity) { wrapperContained.pullHookedEntity(entity.wrapperContained); }
public int use(yarnwrap.item.ItemStack usedItem) { return wrapperContained.use(usedItem.wrapperContained); }
// public void checkForCollision() { wrapperContained.checkForCollision(); }
// public boolean removeIfInvalid(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.removeIfInvalid(player.wrapperContained); }

}