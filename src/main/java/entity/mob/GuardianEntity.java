package yarnwrap.entity.mob;
public class GuardianEntity { public net.minecraft.entity.mob.GuardianEntity wrapperContained; public GuardianEntity(net.minecraft.entity.mob.GuardianEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int WARMUP_TIME() { return wrapperContained.WARMUP_TIME; }
// public yarnwrap.entity.data.TrackedData SPIKES_RETRACTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SPIKES_RETRACTED); }
// public float spikesExtensionRate() { return wrapperContained.spikesExtensionRate; }
// public int beamTicks() { return wrapperContained.beamTicks; }
// public boolean flopping() { return wrapperContained.flopping; }
// public float prevTailAngle() { return wrapperContained.prevTailAngle; }
// public float spikesExtension() { return wrapperContained.spikesExtension; }
// public float tailAngle() { return wrapperContained.tailAngle; }
// public float prevSpikesExtension() { return wrapperContained.prevSpikesExtension; }
// public yarnwrap.entity.LivingEntity cachedBeamTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.cachedBeamTarget); }
// public yarnwrap.entity.ai.goal.WanderAroundGoal wanderGoal() { return new yarnwrap.entity.ai.goal.WanderAroundGoal(wrapperContained.wanderGoal); }
// public yarnwrap.entity.data.TrackedData BEAM_TARGET_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEAM_TARGET_ID); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createGuardianAttributes() { return wrapperContained.createGuardianAttributes(); }
public float getBeamTicks() { return wrapperContained.getBeamTicks(); }
public yarnwrap.entity.LivingEntity getBeamTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.getBeamTarget()); }
public float getSpikesExtension(float tickDelta) { return wrapperContained.getSpikesExtension(tickDelta); }
// public void setSpikesRetracted(boolean retracted) { wrapperContained.setSpikesRetracted(retracted); }
public int getWarmupTime() { return wrapperContained.getWarmupTime(); }
public float getTailAngle(float tickDelta) { return wrapperContained.getTailAngle(tickDelta); }
public boolean areSpikesRetracted() { return wrapperContained.areSpikesRetracted(); }
// public void setBeamTarget(int entityId) { wrapperContained.setBeamTarget(entityId); }
public float getBeamProgress(float tickDelta) { return wrapperContained.getBeamProgress(tickDelta); }
// public yarnwrap.sound.SoundEvent getFlopSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getFlopSound()); }
public boolean hasBeamTarget() { return wrapperContained.hasBeamTarget(); }

}