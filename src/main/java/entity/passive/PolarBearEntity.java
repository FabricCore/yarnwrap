package yarnwrap.entity.passive;
public class PolarBearEntity { public net.minecraft.entity.passive.PolarBearEntity wrapperContained; public PolarBearEntity(net.minecraft.entity.passive.PolarBearEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public int angerTime() { return wrapperContained.angerTime; }
// public float warningAnimationProgress() { return wrapperContained.warningAnimationProgress; }
// public float lastWarningAnimationProgress() { return wrapperContained.lastWarningAnimationProgress; }
// public int warningSoundCooldown() { return wrapperContained.warningSoundCooldown; }
// public yarnwrap.entity.data.TrackedData WARNING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.WARNING); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createPolarBearAttributes() { return wrapperContained.createPolarBearAttributes(); }
public boolean isWarning() { return wrapperContained.isWarning(); }
public float getWarningAnimationProgress(float tickDelta) { return wrapperContained.getWarningAnimationProgress(tickDelta); }
// public void playWarningSound() { wrapperContained.playWarningSound(); }
public void setWarning(boolean warning) { wrapperContained.setWarning(warning); }

}