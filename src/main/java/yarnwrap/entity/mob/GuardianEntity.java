package yarnwrap.entity.mob;
public class GuardianEntity { public net.minecraft.entity.mob.GuardianEntity wrapperContained; public GuardianEntity(net.minecraft.entity.mob.GuardianEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int WARMUP_TIME() { return wrapperContained.WARMUP_TIME; }
// public void WARMUP_TIME(int value) { wrapperContained.WARMUP_TIME = value; }
// public yarnwrap.entity.data.TrackedData SPIKES_RETRACTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SPIKES_RETRACTED); }
// public void SPIKES_RETRACTED(yarnwrap.entity.data.TrackedData value) { wrapperContained.SPIKES_RETRACTED = value.wrapperContained; }
// public float spikesExtensionRate() { return wrapperContained.spikesExtensionRate; }
// public void spikesExtensionRate(float value) { wrapperContained.spikesExtensionRate = value; }
// public int beamTicks() { return wrapperContained.beamTicks; }
// public void beamTicks(int value) { wrapperContained.beamTicks = value; }
// public boolean flopping() { return wrapperContained.flopping; }
// public void flopping(boolean value) { wrapperContained.flopping = value; }
// public float prevTailAngle() { return wrapperContained.prevTailAngle; }
// public void prevTailAngle(float value) { wrapperContained.prevTailAngle = value; }
// public float spikesExtension() { return wrapperContained.spikesExtension; }
// public void spikesExtension(float value) { wrapperContained.spikesExtension = value; }
// public float tailAngle() { return wrapperContained.tailAngle; }
// public void tailAngle(float value) { wrapperContained.tailAngle = value; }
// public float prevSpikesExtension() { return wrapperContained.prevSpikesExtension; }
// public void prevSpikesExtension(float value) { wrapperContained.prevSpikesExtension = value; }
// public yarnwrap.entity.LivingEntity cachedBeamTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.cachedBeamTarget); }
// public void cachedBeamTarget(yarnwrap.entity.LivingEntity value) { wrapperContained.cachedBeamTarget = value.wrapperContained; }
// public yarnwrap.entity.ai.goal.WanderAroundGoal wanderGoal() { return new yarnwrap.entity.ai.goal.WanderAroundGoal(wrapperContained.wanderGoal); }
// public void wanderGoal(yarnwrap.entity.ai.goal.WanderAroundGoal value) { wrapperContained.wanderGoal = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData BEAM_TARGET_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEAM_TARGET_ID); }
// public void BEAM_TARGET_ID(yarnwrap.entity.data.TrackedData value) { wrapperContained.BEAM_TARGET_ID = value.wrapperContained; }
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