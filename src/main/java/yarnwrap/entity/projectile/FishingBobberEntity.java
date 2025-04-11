package yarnwrap.entity.projectile;
public class FishingBobberEntity { public net.minecraft.entity.projectile.FishingBobberEntity wrapperContained; public FishingBobberEntity(net.minecraft.entity.projectile.FishingBobberEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean inOpenWater() { return wrapperContained.inOpenWater; }
// public void inOpenWater(boolean value) { wrapperContained.inOpenWater = value; }
// public yarnwrap.util.math.random.Random velocityRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.velocityRandom); }
// public void velocityRandom(yarnwrap.util.math.random.Random value) { wrapperContained.velocityRandom = value.wrapperContained; }
// public boolean caughtFish() { return wrapperContained.caughtFish; }
// public void caughtFish(boolean value) { wrapperContained.caughtFish = value; }
// public int outOfOpenWaterTicks() { return wrapperContained.outOfOpenWaterTicks; }
// public void outOfOpenWaterTicks(int value) { wrapperContained.outOfOpenWaterTicks = value; }
// public yarnwrap.entity.data.TrackedData CAUGHT_FISH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CAUGHT_FISH); }
// public void CAUGHT_FISH(yarnwrap.entity.data.TrackedData value) { wrapperContained.CAUGHT_FISH = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.entity.Entity hookedEntity() { return new yarnwrap.entity.Entity(wrapperContained.hookedEntity); }
// public void hookedEntity(yarnwrap.entity.Entity value) { wrapperContained.hookedEntity = value.wrapperContained; }
// public int removalTimer() { return wrapperContained.removalTimer; }
// public void removalTimer(int value) { wrapperContained.removalTimer = value; }
// public int waitTimeReductionTicks() { return wrapperContained.waitTimeReductionTicks; }
// public void waitTimeReductionTicks(int value) { wrapperContained.waitTimeReductionTicks = value; }
// public float fishAngle() { return wrapperContained.fishAngle; }
// public void fishAngle(float value) { wrapperContained.fishAngle = value; }
// public yarnwrap.entity.data.TrackedData HOOK_ENTITY_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HOOK_ENTITY_ID); }
// public void HOOK_ENTITY_ID(yarnwrap.entity.data.TrackedData value) { wrapperContained.HOOK_ENTITY_ID = value.wrapperContained; }
// public int luckBonus() { return wrapperContained.luckBonus; }
// public void luckBonus(int value) { wrapperContained.luckBonus = value; }
// public int fishTravelCountdown() { return wrapperContained.fishTravelCountdown; }
// public void fishTravelCountdown(int value) { wrapperContained.fishTravelCountdown = value; }
// public int hookCountdown() { return wrapperContained.hookCountdown; }
// public void hookCountdown(int value) { wrapperContained.hookCountdown = value; }
// public int waitCountdown() { return wrapperContained.waitCountdown; }
// public void waitCountdown(int value) { wrapperContained.waitCountdown = value; }
// public Object state() { return wrapperContained.state; }
// // public void state(Object value) { wrapperContained.state = value; }
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