package yarnwrap.entity.passive;
public class PolarBearEntity { public net.minecraft.entity.passive.PolarBearEntity wrapperContained; public PolarBearEntity(net.minecraft.entity.passive.PolarBearEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public int angerTime() { return wrapperContained.angerTime; }
// public void angerTime(int value) { wrapperContained.angerTime = value; }
// public float warningAnimationProgress() { return wrapperContained.warningAnimationProgress; }
// public void warningAnimationProgress(float value) { wrapperContained.warningAnimationProgress = value; }
// public float lastWarningAnimationProgress() { return wrapperContained.lastWarningAnimationProgress; }
// public void lastWarningAnimationProgress(float value) { wrapperContained.lastWarningAnimationProgress = value; }
// public int warningSoundCooldown() { return wrapperContained.warningSoundCooldown; }
// public void warningSoundCooldown(int value) { wrapperContained.warningSoundCooldown = value; }
// public yarnwrap.entity.data.TrackedData WARNING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.WARNING); }
// public void WARNING(yarnwrap.entity.data.TrackedData value) { wrapperContained.WARNING = value.wrapperContained; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createPolarBearAttributes() { return wrapperContained.createPolarBearAttributes(); }
// public yarnwrap.registry.tag.TagKey method_60725(yarnwrap.entity.mob.PathAwareEntity polarBear) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_60725(polarBear.wrapperContained)); }
public boolean isWarning() { return wrapperContained.isWarning(); }
public float getWarningAnimationProgress(float tickDelta) { return wrapperContained.getWarningAnimationProgress(tickDelta); }
// public void playWarningSound() { wrapperContained.playWarningSound(); }
public void setWarning(boolean warning) { wrapperContained.setWarning(warning); }

}