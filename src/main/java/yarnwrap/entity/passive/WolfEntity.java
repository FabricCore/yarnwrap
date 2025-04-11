package yarnwrap.entity.passive;
public class WolfEntity { public net.minecraft.entity.passive.WolfEntity wrapperContained; public WolfEntity(net.minecraft.entity.passive.WolfEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate FOLLOW_TAMED_PREDICATE() { return wrapperContained.FOLLOW_TAMED_PREDICATE; }
// public void FOLLOW_TAMED_PREDICATE(java.util.function.Predicate value) { wrapperContained.FOLLOW_TAMED_PREDICATE = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public yarnwrap.entity.data.TrackedData ANGER_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGER_TIME); }
// public void ANGER_TIME(yarnwrap.entity.data.TrackedData value) { wrapperContained.ANGER_TIME = value.wrapperContained; }
// public float WILD_MAX_HEALTH() { return wrapperContained.WILD_MAX_HEALTH; }
// public void WILD_MAX_HEALTH(float value) { wrapperContained.WILD_MAX_HEALTH = value; }
// public float TAMED_MAX_HEALTH() { return wrapperContained.TAMED_MAX_HEALTH; }
// public void TAMED_MAX_HEALTH(float value) { wrapperContained.TAMED_MAX_HEALTH = value; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public boolean furWet() { return wrapperContained.furWet; }
// public void furWet(boolean value) { wrapperContained.furWet = value; }
// public float lastShakeProgress() { return wrapperContained.lastShakeProgress; }
// public void lastShakeProgress(float value) { wrapperContained.lastShakeProgress = value; }
// public yarnwrap.entity.data.TrackedData BEGGING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEGGING); }
// public void BEGGING(yarnwrap.entity.data.TrackedData value) { wrapperContained.BEGGING = value.wrapperContained; }
// public float shakeProgress() { return wrapperContained.shakeProgress; }
// public void shakeProgress(float value) { wrapperContained.shakeProgress = value; }
// public float lastBegAnimationProgress() { return wrapperContained.lastBegAnimationProgress; }
// public void lastBegAnimationProgress(float value) { wrapperContained.lastBegAnimationProgress = value; }
// public yarnwrap.entity.data.TrackedData COLLAR_COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLLAR_COLOR); }
// public void COLLAR_COLOR(yarnwrap.entity.data.TrackedData value) { wrapperContained.COLLAR_COLOR = value.wrapperContained; }
// public boolean canShakeWaterOff() { return wrapperContained.canShakeWaterOff; }
// public void canShakeWaterOff(boolean value) { wrapperContained.canShakeWaterOff = value; }
// public float begAnimationProgress() { return wrapperContained.begAnimationProgress; }
// public void begAnimationProgress(float value) { wrapperContained.begAnimationProgress = value; }
public Object createWolfAttributes() { return wrapperContained.createWolfAttributes(); }
// public void resetShake() { wrapperContained.resetShake(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean hasArmor() { return wrapperContained.hasArmor(); }
// public boolean shouldArmorAbsorbDamage(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.shouldArmorAbsorbDamage(source.wrapperContained); }
public yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTextureId()); }
// public void tryTame(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.tryTame(player.wrapperContained); }
public float getFurWetBrightnessMultiplier(float tickDelta) { return wrapperContained.getFurWetBrightnessMultiplier(tickDelta); }
// public void setCollarColor(yarnwrap.util.DyeColor color) { wrapperContained.setCollarColor(color.wrapperContained); }
public boolean isBegging() { return wrapperContained.isBegging(); }
public boolean isFurWet() { return wrapperContained.isFurWet(); }
public void setBegging(boolean begging) { wrapperContained.setBegging(begging); }
public yarnwrap.util.DyeColor getCollarColor() { return new yarnwrap.util.DyeColor(wrapperContained.getCollarColor()); }
public float getTailAngle() { return wrapperContained.getTailAngle(); }
// public float getShakeAnimationProgress(float tickDelta) { return wrapperContained.getShakeAnimationProgress(tickDelta); }
public float getBegAnimationProgress(float tickDelta) { return wrapperContained.getBegAnimationProgress(tickDelta); }

}