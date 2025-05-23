package yarnwrap.entity.passive;
public class PolarBearEntity { public net.minecraft.entity.passive.PolarBearEntity wrapperContained; public PolarBearEntity(net.minecraft.entity.passive.PolarBearEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float warningAnimationProgress() { return wrapperContained.warningAnimationProgress; }
// public void warningAnimationProgress(float value) { wrapperContained.warningAnimationProgress = value; }
// public static float warningAnimationProgress() { return net.minecraft.entity.passive.PolarBearEntity.warningAnimationProgress; }
// public static void warningAnimationProgress(float value, ) { net.minecraft.entity.passive.PolarBearEntity.warningAnimationProgress = value; }

// public float lastWarningAnimationProgress() { return wrapperContained.lastWarningAnimationProgress; }
// public void lastWarningAnimationProgress(float value) { wrapperContained.lastWarningAnimationProgress = value; }
// public static float lastWarningAnimationProgress() { return net.minecraft.entity.passive.PolarBearEntity.lastWarningAnimationProgress; }
// public static void lastWarningAnimationProgress(float value, ) { net.minecraft.entity.passive.PolarBearEntity.lastWarningAnimationProgress = value; }

// public int warningSoundCooldown() { return wrapperContained.warningSoundCooldown; }
// public void warningSoundCooldown(int value) { wrapperContained.warningSoundCooldown = value; }
// public static int warningSoundCooldown() { return net.minecraft.entity.passive.PolarBearEntity.warningSoundCooldown; }
// public static void warningSoundCooldown(int value, ) { net.minecraft.entity.passive.PolarBearEntity.warningSoundCooldown = value; }

// public yarnwrap.entity.data.TrackedData WARNING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.WARNING); }
// public void WARNING(yarnwrap.entity.data.TrackedData value) { wrapperContained.WARNING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData WARNING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.PolarBearEntity.WARNING); }
// public static void WARNING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.PolarBearEntity.WARNING = value.wrapperContained; }

// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public static java.util.UUID angryAt() { return net.minecraft.entity.passive.PolarBearEntity.angryAt; }
// public static void angryAt(java.util.UUID value, ) { net.minecraft.entity.passive.PolarBearEntity.angryAt = value; }

// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.entity.passive.PolarBearEntity.ANGER_TIME_RANGE); }
// public static void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value, ) { net.minecraft.entity.passive.PolarBearEntity.ANGER_TIME_RANGE = value.wrapperContained; }

// public int angerTime() { return wrapperContained.angerTime; }
// public void angerTime(int value) { wrapperContained.angerTime = value; }
// public static int angerTime() { return net.minecraft.entity.passive.PolarBearEntity.angerTime; }
// public static void angerTime(int value, ) { net.minecraft.entity.passive.PolarBearEntity.angerTime = value; }

public boolean isWarning() { return wrapperContained.isWarning(); }
// public static boolean isWarning() { return net.minecraft.entity.passive.PolarBearEntity.isWarning(); }
public float getWarningAnimationProgress(float tickProgress) { return wrapperContained.getWarningAnimationProgress(tickProgress); }
// public static float getWarningAnimationProgress(float tickProgress, ) { return net.minecraft.entity.passive.PolarBearEntity.getWarningAnimationProgress(tickProgress); }
// public void playWarningSound() { wrapperContained.playWarningSound(); }
// public static void playWarningSound() { net.minecraft.entity.passive.PolarBearEntity.playWarningSound(); }
public void setWarning(boolean warning) { wrapperContained.setWarning(warning); }
// public static void setWarning(boolean warning, ) { net.minecraft.entity.passive.PolarBearEntity.setWarning(warning); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.PolarBearEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createPolarBearAttributes() { return wrapperContained.createPolarBearAttributes(); }
public static Object createPolarBearAttributes() { return net.minecraft.entity.passive.PolarBearEntity.createPolarBearAttributes(); }
// public yarnwrap.registry.tag.TagKey method_60725(yarnwrap.entity.mob.PathAwareEntity polarBear) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_60725(polarBear.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_60725(yarnwrap.entity.mob.PathAwareEntity polarBear, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.entity.passive.PolarBearEntity.method_60725(polarBear.wrapperContained)); }

}