package yarnwrap.entity.passive;
public class BeeEntity { public net.minecraft.entity.passive.BeeEntity wrapperContained; public BeeEntity(net.minecraft.entity.passive.BeeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData BEE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEE_FLAGS); }
// public yarnwrap.entity.data.TrackedData ANGER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGER); }
// public float currentPitch() { return wrapperContained.currentPitch; }
// public float lastPitch() { return wrapperContained.lastPitch; }
// public int ticksSinceSting() { return wrapperContained.ticksSinceSting; }
// public int ticksSincePollination() { return wrapperContained.ticksSincePollination; }
// public int cannotEnterHiveTicks() { return wrapperContained.cannotEnterHiveTicks; }
// public int cropsGrownSincePollination() { return wrapperContained.cropsGrownSincePollination; }
// public yarnwrap.util.math.BlockPos flowerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.flowerPos); }
// public yarnwrap.util.math.BlockPos hivePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.hivePos); }
// public Object pollinateGoal() { return wrapperContained.pollinateGoal; }
// public int ticksInsideWater() { return wrapperContained.ticksInsideWater; }
// public int ticksLeftToFindHive() { return wrapperContained.ticksLeftToFindHive; }
// public int ticksUntilCanPollinate() { return wrapperContained.ticksUntilCanPollinate; }
// public Object moveToHiveGoal() { return wrapperContained.moveToHiveGoal; }
// public Object moveToFlowerGoal() { return wrapperContained.moveToFlowerGoal; }
// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
public java.lang.String CROPS_GROWN_SINCE_POLLINATION_KEY() { return wrapperContained.CROPS_GROWN_SINCE_POLLINATION_KEY; }
public java.lang.String CANNOT_ENTER_HIVE_TICKS_KEY() { return wrapperContained.CANNOT_ENTER_HIVE_TICKS_KEY; }
public java.lang.String TICKS_SINCE_POLLINATION_KEY() { return wrapperContained.TICKS_SINCE_POLLINATION_KEY; }
public java.lang.String HAS_STUNG_KEY() { return wrapperContained.HAS_STUNG_KEY; }
public java.lang.String HAS_NECTAR_KEY() { return wrapperContained.HAS_NECTAR_KEY; }
public java.lang.String FLOWER_POS_KEY() { return wrapperContained.FLOWER_POS_KEY; }
public java.lang.String HIVE_POS_KEY() { return wrapperContained.HIVE_POS_KEY; }
// public int NEAR_TARGET_FLAG() { return wrapperContained.NEAR_TARGET_FLAG; }
// public int HAS_STUNG_FLAG() { return wrapperContained.HAS_STUNG_FLAG; }
// public int HAS_NECTAR_FLAG() { return wrapperContained.HAS_NECTAR_FLAG; }
// public int MAX_LIFETIME_AFTER_STINGING() { return wrapperContained.MAX_LIFETIME_AFTER_STINGING; }
// public int FLOWER_NAVIGATION_START_TICKS() { return wrapperContained.FLOWER_NAVIGATION_START_TICKS; }
// public int POLLINATION_FAIL_TICKS() { return wrapperContained.POLLINATION_FAIL_TICKS; }
// public int MAX_POLLINATED_CROPS() { return wrapperContained.MAX_POLLINATED_CROPS; }
// public int NORMAL_DIFFICULTY_STING_POISON_DURATION() { return wrapperContained.NORMAL_DIFFICULTY_STING_POISON_DURATION; }
// public int HARD_DIFFICULTY_STING_POISON_DURATION() { return wrapperContained.HARD_DIFFICULTY_STING_POISON_DURATION; }
// public int TOO_FAR_DISTANCE() { return wrapperContained.TOO_FAR_DISTANCE; }
// public int MIN_HIVE_RETURN_DISTANCE() { return wrapperContained.MIN_HIVE_RETURN_DISTANCE; }
// public void addParticle(yarnwrap.world.World world,double lastX,double x,double lastZ,double z,double y,yarnwrap.particle.ParticleEffect effect) { wrapperContained.addParticle(world.wrapperContained,lastX,x,lastZ,z,y,effect.wrapperContained); }
// public void setBeeFlag(int bit,boolean value) { wrapperContained.setBeeFlag(bit,value); }
public yarnwrap.util.math.BlockPos getFlowerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getFlowerPos()); }
public boolean hasFlower() { return wrapperContained.hasFlower(); }
public void resetPollinationTicks() { wrapperContained.resetPollinationTicks(); }
// public void resetCropCounter() { wrapperContained.resetCropCounter(); }
public boolean hasNectar() { return wrapperContained.hasNectar(); }
public boolean hasStung() { return wrapperContained.hasStung(); }
// public boolean isNearTarget() { return wrapperContained.isNearTarget(); }
public void onHoneyDelivered() { wrapperContained.onHoneyDelivered(); }
// public boolean canEnterHive() { return wrapperContained.canEnterHive(); }
// public void updateBodyPitch() { wrapperContained.updateBodyPitch(); }
public boolean hasHive() { return wrapperContained.hasHive(); }
// public int getCropsGrownSincePollination() { return wrapperContained.getCropsGrownSincePollination(); }
// public void addCropCounter() { wrapperContained.addCropCounter(); }
// public boolean isHiveValid() { return wrapperContained.isHiveValid(); }
public void setFlowerPos(yarnwrap.util.math.BlockPos flowerPos) { wrapperContained.setFlowerPos(flowerPos.wrapperContained); }
// public void setHasNectar(boolean hasNectar) { wrapperContained.setHasNectar(hasNectar); }
// public void setHasStung(boolean hasStung) { wrapperContained.setHasStung(hasStung); }
public void setCannotEnterHiveTicks(int cannotEnterHiveTicks) { wrapperContained.setCannotEnterHiveTicks(cannotEnterHiveTicks); }
// public void setNearTarget(boolean nearTarget) { wrapperContained.setNearTarget(nearTarget); }
public float getBodyPitch(float tickDelta) { return wrapperContained.getBodyPitch(tickDelta); }
// public boolean getBeeFlag(int location) { return wrapperContained.getBeeFlag(location); }
public yarnwrap.util.math.BlockPos getHivePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getHivePos()); }
// public boolean isWithinDistance(yarnwrap.util.math.BlockPos pos,int distance) { return wrapperContained.isWithinDistance(pos.wrapperContained,distance); }
// public boolean failedPollinatingTooLong() { return wrapperContained.failedPollinatingTooLong(); }
// public boolean isHiveNearFire() { return wrapperContained.isHiveNearFire(); }
// public void startMovingTo(yarnwrap.util.math.BlockPos pos) { wrapperContained.startMovingTo(pos.wrapperContained); }
// public boolean doesHiveHaveSpace(yarnwrap.util.math.BlockPos pos) { return wrapperContained.doesHiveHaveSpace(pos.wrapperContained); }
// public boolean isTooFar(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isTooFar(pos.wrapperContained); }
// public boolean isFlowers(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isFlowers(pos.wrapperContained); }
public Object createBeeAttributes() { return wrapperContained.createBeeAttributes(); }
public int getMoveGoalTicks() { return wrapperContained.getMoveGoalTicks(); }
public java.util.List getPossibleHives() { return wrapperContained.getPossibleHives(); }
public yarnwrap.entity.ai.goal.GoalSelector getGoalSelector() { return new yarnwrap.entity.ai.goal.GoalSelector(wrapperContained.getGoalSelector()); }
public void setHivePos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setHivePos(pos.wrapperContained); }

}