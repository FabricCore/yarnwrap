package yarnwrap.entity.passive;
public class WolfEntity { public net.minecraft.entity.passive.WolfEntity wrapperContained; public WolfEntity(net.minecraft.entity.passive.WolfEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Predicate FOLLOW_TAMED_PREDICATE() { return wrapperContained.FOLLOW_TAMED_PREDICATE; }
// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public yarnwrap.entity.data.TrackedData ANGER_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGER_TIME); }
// public float WILD_MAX_HEALTH() { return wrapperContained.WILD_MAX_HEALTH; }
// public float TAMED_MAX_HEALTH() { return wrapperContained.TAMED_MAX_HEALTH; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public boolean furWet() { return wrapperContained.furWet; }
// public float lastShakeProgress() { return wrapperContained.lastShakeProgress; }
// public yarnwrap.entity.data.TrackedData BEGGING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEGGING); }
// public float shakeProgress() { return wrapperContained.shakeProgress; }
// public float lastBegAnimationProgress() { return wrapperContained.lastBegAnimationProgress; }
// public yarnwrap.entity.data.TrackedData COLLAR_COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLLAR_COLOR); }
// public boolean canShakeWaterOff() { return wrapperContained.canShakeWaterOff; }
// public float begAnimationProgress() { return wrapperContained.begAnimationProgress; }
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