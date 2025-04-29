package yarnwrap.entity.passive;
public class WolfEntity { public net.minecraft.entity.passive.WolfEntity wrapperContained; public WolfEntity(net.minecraft.entity.passive.WolfEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate FOLLOW_TAMED_PREDICATE() { return wrapperContained.FOLLOW_TAMED_PREDICATE; }
// public void FOLLOW_TAMED_PREDICATE(java.util.function.Predicate value) { wrapperContained.FOLLOW_TAMED_PREDICATE = value; }
public static java.util.function.Predicate FOLLOW_TAMED_PREDICATE() { return net.minecraft.entity.passive.WolfEntity.FOLLOW_TAMED_PREDICATE; }
// public static void FOLLOW_TAMED_PREDICATE(java.util.function.Predicate value, ) { net.minecraft.entity.passive.WolfEntity.FOLLOW_TAMED_PREDICATE = value; }

// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.entity.passive.WolfEntity.ANGER_TIME_RANGE); }
// public static void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value, ) { net.minecraft.entity.passive.WolfEntity.ANGER_TIME_RANGE = value.wrapperContained; }

// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public static java.util.UUID angryAt() { return net.minecraft.entity.passive.WolfEntity.angryAt; }
// public static void angryAt(java.util.UUID value, ) { net.minecraft.entity.passive.WolfEntity.angryAt = value; }

// public yarnwrap.entity.data.TrackedData ANGER_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGER_TIME); }
// public void ANGER_TIME(yarnwrap.entity.data.TrackedData value) { wrapperContained.ANGER_TIME = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ANGER_TIME() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.WolfEntity.ANGER_TIME); }
// public static void ANGER_TIME(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.WolfEntity.ANGER_TIME = value.wrapperContained; }

// public float WILD_MAX_HEALTH() { return wrapperContained.WILD_MAX_HEALTH; }
// public void WILD_MAX_HEALTH(float value) { wrapperContained.WILD_MAX_HEALTH = value; }
// public static float WILD_MAX_HEALTH() { return net.minecraft.entity.passive.WolfEntity.WILD_MAX_HEALTH; }
// public static void WILD_MAX_HEALTH(float value, ) { net.minecraft.entity.passive.WolfEntity.WILD_MAX_HEALTH = value; }

// public float TAMED_MAX_HEALTH() { return wrapperContained.TAMED_MAX_HEALTH; }
// public void TAMED_MAX_HEALTH(float value) { wrapperContained.TAMED_MAX_HEALTH = value; }
// public static float TAMED_MAX_HEALTH() { return net.minecraft.entity.passive.WolfEntity.TAMED_MAX_HEALTH; }
// public static void TAMED_MAX_HEALTH(float value, ) { net.minecraft.entity.passive.WolfEntity.TAMED_MAX_HEALTH = value; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.WolfEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.WolfEntity.VARIANT = value.wrapperContained; }

// public boolean furWet() { return wrapperContained.furWet; }
// public void furWet(boolean value) { wrapperContained.furWet = value; }
// public static boolean furWet() { return net.minecraft.entity.passive.WolfEntity.furWet; }
// public static void furWet(boolean value, ) { net.minecraft.entity.passive.WolfEntity.furWet = value; }

// public float lastShakeProgress() { return wrapperContained.lastShakeProgress; }
// public void lastShakeProgress(float value) { wrapperContained.lastShakeProgress = value; }
// public static float lastShakeProgress() { return net.minecraft.entity.passive.WolfEntity.lastShakeProgress; }
// public static void lastShakeProgress(float value, ) { net.minecraft.entity.passive.WolfEntity.lastShakeProgress = value; }

// public yarnwrap.entity.data.TrackedData BEGGING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEGGING); }
// public void BEGGING(yarnwrap.entity.data.TrackedData value) { wrapperContained.BEGGING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BEGGING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.WolfEntity.BEGGING); }
// public static void BEGGING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.WolfEntity.BEGGING = value.wrapperContained; }

// public float shakeProgress() { return wrapperContained.shakeProgress; }
// public void shakeProgress(float value) { wrapperContained.shakeProgress = value; }
// public static float shakeProgress() { return net.minecraft.entity.passive.WolfEntity.shakeProgress; }
// public static void shakeProgress(float value, ) { net.minecraft.entity.passive.WolfEntity.shakeProgress = value; }

// public float lastBegAnimationProgress() { return wrapperContained.lastBegAnimationProgress; }
// public void lastBegAnimationProgress(float value) { wrapperContained.lastBegAnimationProgress = value; }
// public static float lastBegAnimationProgress() { return net.minecraft.entity.passive.WolfEntity.lastBegAnimationProgress; }
// public static void lastBegAnimationProgress(float value, ) { net.minecraft.entity.passive.WolfEntity.lastBegAnimationProgress = value; }

// public yarnwrap.entity.data.TrackedData COLLAR_COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLLAR_COLOR); }
// public void COLLAR_COLOR(yarnwrap.entity.data.TrackedData value) { wrapperContained.COLLAR_COLOR = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData COLLAR_COLOR() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.WolfEntity.COLLAR_COLOR); }
// public static void COLLAR_COLOR(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.WolfEntity.COLLAR_COLOR = value.wrapperContained; }

// public boolean canShakeWaterOff() { return wrapperContained.canShakeWaterOff; }
// public void canShakeWaterOff(boolean value) { wrapperContained.canShakeWaterOff = value; }
// public static boolean canShakeWaterOff() { return net.minecraft.entity.passive.WolfEntity.canShakeWaterOff; }
// public static void canShakeWaterOff(boolean value, ) { net.minecraft.entity.passive.WolfEntity.canShakeWaterOff = value; }

// public float begAnimationProgress() { return wrapperContained.begAnimationProgress; }
// public void begAnimationProgress(float value) { wrapperContained.begAnimationProgress = value; }
// public static float begAnimationProgress() { return net.minecraft.entity.passive.WolfEntity.begAnimationProgress; }
// public static void begAnimationProgress(float value, ) { net.minecraft.entity.passive.WolfEntity.begAnimationProgress = value; }

// public boolean method_18444(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18444(entity.wrapperContained); }
// public static boolean method_18444(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.passive.WolfEntity.method_18444(entity.wrapperContained); }
// public Object createWolfAttributes() { return wrapperContained.createWolfAttributes(); }
public static Object createWolfAttributes() { return net.minecraft.entity.passive.WolfEntity.createWolfAttributes(); }
// public void resetShake() { wrapperContained.resetShake(); }
// public static void resetShake() { net.minecraft.entity.passive.WolfEntity.resetShake(); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.WolfEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean hasArmor() { return wrapperContained.hasArmor(); }
// public static boolean hasArmor() { return net.minecraft.entity.passive.WolfEntity.hasArmor(); }
// public boolean shouldArmorAbsorbDamage(yarnwrap.entity.damage.DamageSource source) { return wrapperContained.shouldArmorAbsorbDamage(source.wrapperContained); }
// public static boolean shouldArmorAbsorbDamage(yarnwrap.entity.damage.DamageSource source, ) { return net.minecraft.entity.passive.WolfEntity.shouldArmorAbsorbDamage(source.wrapperContained); }
// public java.util.Optional method_58059(yarnwrap.registry.RegistryKey variantKey) { return wrapperContained.method_58059(variantKey.wrapperContained); }
// public static java.util.Optional method_58059(yarnwrap.registry.RegistryKey variantKey, ) { return net.minecraft.entity.passive.WolfEntity.method_58059(variantKey.wrapperContained); }
// public yarnwrap.registry.RegistryKey method_58060(yarnwrap.util.Identifier variantId) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_58060(variantId.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_58060(yarnwrap.util.Identifier variantId, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.entity.passive.WolfEntity.method_58060(variantId.wrapperContained)); }
public yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(wrapperContained.getTextureId()); }
// public static yarnwrap.util.Identifier getTextureId() { return new yarnwrap.util.Identifier(net.minecraft.entity.passive.WolfEntity.getTextureId()); }
// public void tryTame(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.tryTame(player.wrapperContained); }
// public static void tryTame(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.passive.WolfEntity.tryTame(player.wrapperContained); }
public float getFurWetBrightnessMultiplier(float tickDelta) { return wrapperContained.getFurWetBrightnessMultiplier(tickDelta); }
// public static float getFurWetBrightnessMultiplier(float tickDelta, ) { return net.minecraft.entity.passive.WolfEntity.getFurWetBrightnessMultiplier(tickDelta); }
// public void setCollarColor(yarnwrap.util.DyeColor color) { wrapperContained.setCollarColor(color.wrapperContained); }
// public static void setCollarColor(yarnwrap.util.DyeColor color, ) { net.minecraft.entity.passive.WolfEntity.setCollarColor(color.wrapperContained); }
public boolean isBegging() { return wrapperContained.isBegging(); }
// public static boolean isBegging() { return net.minecraft.entity.passive.WolfEntity.isBegging(); }
public boolean isFurWet() { return wrapperContained.isFurWet(); }
// public static boolean isFurWet() { return net.minecraft.entity.passive.WolfEntity.isFurWet(); }
public void setBegging(boolean begging) { wrapperContained.setBegging(begging); }
// public static void setBegging(boolean begging, ) { net.minecraft.entity.passive.WolfEntity.setBegging(begging); }
public yarnwrap.util.DyeColor getCollarColor() { return new yarnwrap.util.DyeColor(wrapperContained.getCollarColor()); }
// public static yarnwrap.util.DyeColor getCollarColor() { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.WolfEntity.getCollarColor()); }
public float getTailAngle() { return wrapperContained.getTailAngle(); }
// public static float getTailAngle() { return net.minecraft.entity.passive.WolfEntity.getTailAngle(); }
// public float getShakeAnimationProgress(float tickDelta) { return wrapperContained.getShakeAnimationProgress(tickDelta); }
// public static float getShakeAnimationProgress(float tickDelta, ) { return net.minecraft.entity.passive.WolfEntity.getShakeAnimationProgress(tickDelta); }
public float getBegAnimationProgress(float tickDelta) { return wrapperContained.getBegAnimationProgress(tickDelta); }
// public static float getBegAnimationProgress(float tickDelta, ) { return net.minecraft.entity.passive.WolfEntity.getBegAnimationProgress(tickDelta); }

}