package yarnwrap.entity.mob;
public class GuardianEntity { public net.minecraft.entity.mob.GuardianEntity wrapperContained; public GuardianEntity(net.minecraft.entity.mob.GuardianEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData SPIKES_RETRACTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SPIKES_RETRACTED); }
// public void SPIKES_RETRACTED(yarnwrap.entity.data.TrackedData value) { wrapperContained.SPIKES_RETRACTED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SPIKES_RETRACTED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.GuardianEntity.SPIKES_RETRACTED); }
// public static void SPIKES_RETRACTED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.GuardianEntity.SPIKES_RETRACTED = value.wrapperContained; }

// public float spikesExtensionRate() { return wrapperContained.spikesExtensionRate; }
// public void spikesExtensionRate(float value) { wrapperContained.spikesExtensionRate = value; }
// public static float spikesExtensionRate() { return net.minecraft.entity.mob.GuardianEntity.spikesExtensionRate; }
// public static void spikesExtensionRate(float value, ) { net.minecraft.entity.mob.GuardianEntity.spikesExtensionRate = value; }

// public int beamTicks() { return wrapperContained.beamTicks; }
// public void beamTicks(int value) { wrapperContained.beamTicks = value; }
// public static int beamTicks() { return net.minecraft.entity.mob.GuardianEntity.beamTicks; }
// public static void beamTicks(int value, ) { net.minecraft.entity.mob.GuardianEntity.beamTicks = value; }

// public boolean flopping() { return wrapperContained.flopping; }
// public void flopping(boolean value) { wrapperContained.flopping = value; }
// public static boolean flopping() { return net.minecraft.entity.mob.GuardianEntity.flopping; }
// public static void flopping(boolean value, ) { net.minecraft.entity.mob.GuardianEntity.flopping = value; }

// public float lastTailAngle() { return wrapperContained.lastTailAngle; }
// public void lastTailAngle(float value) { wrapperContained.lastTailAngle = value; }
// public static float lastTailAngle() { return net.minecraft.entity.mob.GuardianEntity.lastTailAngle; }
// public static void lastTailAngle(float value, ) { net.minecraft.entity.mob.GuardianEntity.lastTailAngle = value; }

// public float spikesExtension() { return wrapperContained.spikesExtension; }
// public void spikesExtension(float value) { wrapperContained.spikesExtension = value; }
// public static float spikesExtension() { return net.minecraft.entity.mob.GuardianEntity.spikesExtension; }
// public static void spikesExtension(float value, ) { net.minecraft.entity.mob.GuardianEntity.spikesExtension = value; }

// public float tailAngle() { return wrapperContained.tailAngle; }
// public void tailAngle(float value) { wrapperContained.tailAngle = value; }
// public static float tailAngle() { return net.minecraft.entity.mob.GuardianEntity.tailAngle; }
// public static void tailAngle(float value, ) { net.minecraft.entity.mob.GuardianEntity.tailAngle = value; }

// public float lastSpikesExtension() { return wrapperContained.lastSpikesExtension; }
// public void lastSpikesExtension(float value) { wrapperContained.lastSpikesExtension = value; }
// public static float lastSpikesExtension() { return net.minecraft.entity.mob.GuardianEntity.lastSpikesExtension; }
// public static void lastSpikesExtension(float value, ) { net.minecraft.entity.mob.GuardianEntity.lastSpikesExtension = value; }

// public yarnwrap.entity.LivingEntity cachedBeamTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.cachedBeamTarget); }
// public void cachedBeamTarget(yarnwrap.entity.LivingEntity value) { wrapperContained.cachedBeamTarget = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity cachedBeamTarget() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.GuardianEntity.cachedBeamTarget); }
// public static void cachedBeamTarget(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.mob.GuardianEntity.cachedBeamTarget = value.wrapperContained; }

// public yarnwrap.entity.ai.goal.WanderAroundGoal wanderGoal() { return new yarnwrap.entity.ai.goal.WanderAroundGoal(wrapperContained.wanderGoal); }
// public void wanderGoal(yarnwrap.entity.ai.goal.WanderAroundGoal value) { wrapperContained.wanderGoal = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.WanderAroundGoal wanderGoal() { return new yarnwrap.entity.ai.goal.WanderAroundGoal(net.minecraft.entity.mob.GuardianEntity.wanderGoal); }
// public static void wanderGoal(yarnwrap.entity.ai.goal.WanderAroundGoal value, ) { net.minecraft.entity.mob.GuardianEntity.wanderGoal = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData BEAM_TARGET_ID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BEAM_TARGET_ID); }
// public void BEAM_TARGET_ID(yarnwrap.entity.data.TrackedData value) { wrapperContained.BEAM_TARGET_ID = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BEAM_TARGET_ID() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.GuardianEntity.BEAM_TARGET_ID); }
// public static void BEAM_TARGET_ID(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.GuardianEntity.BEAM_TARGET_ID = value.wrapperContained; }

// public int WARMUP_TIME() { return wrapperContained.WARMUP_TIME; }
// public void WARMUP_TIME(int value) { wrapperContained.WARMUP_TIME = value; }
// public static int WARMUP_TIME() { return net.minecraft.entity.mob.GuardianEntity.WARMUP_TIME; }
// public static void WARMUP_TIME(int value, ) { net.minecraft.entity.mob.GuardianEntity.WARMUP_TIME = value; }

public yarnwrap.entity.LivingEntity getBeamTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.getBeamTarget()); }
// public static yarnwrap.entity.LivingEntity getBeamTarget() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.GuardianEntity.getBeamTarget()); }
public float getSpikesExtension(float tickProgress) { return wrapperContained.getSpikesExtension(tickProgress); }
// public static float getSpikesExtension(float tickProgress, ) { return net.minecraft.entity.mob.GuardianEntity.getSpikesExtension(tickProgress); }
// public void setSpikesRetracted(boolean retracted) { wrapperContained.setSpikesRetracted(retracted); }
// public static void setSpikesRetracted(boolean retracted, ) { net.minecraft.entity.mob.GuardianEntity.setSpikesRetracted(retracted); }
public int getWarmupTime() { return wrapperContained.getWarmupTime(); }
// public static int getWarmupTime() { return net.minecraft.entity.mob.GuardianEntity.getWarmupTime(); }
public float getTailAngle(float tickProgress) { return wrapperContained.getTailAngle(tickProgress); }
// public static float getTailAngle(float tickProgress, ) { return net.minecraft.entity.mob.GuardianEntity.getTailAngle(tickProgress); }
public boolean areSpikesRetracted() { return wrapperContained.areSpikesRetracted(); }
// public static boolean areSpikesRetracted() { return net.minecraft.entity.mob.GuardianEntity.areSpikesRetracted(); }
// public void setBeamTarget(int entityId) { wrapperContained.setBeamTarget(entityId); }
// public static void setBeamTarget(int entityId, ) { net.minecraft.entity.mob.GuardianEntity.setBeamTarget(entityId); }
public float getBeamProgress(float tickProgress) { return wrapperContained.getBeamProgress(tickProgress); }
// public static float getBeamProgress(float tickProgress, ) { return net.minecraft.entity.mob.GuardianEntity.getBeamProgress(tickProgress); }
// public yarnwrap.sound.SoundEvent getFlopSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getFlopSound()); }
// public static yarnwrap.sound.SoundEvent getFlopSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.mob.GuardianEntity.getFlopSound()); }
public boolean hasBeamTarget() { return wrapperContained.hasBeamTarget(); }
// public static boolean hasBeamTarget() { return net.minecraft.entity.mob.GuardianEntity.hasBeamTarget(); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.GuardianEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createGuardianAttributes() { return wrapperContained.createGuardianAttributes(); }
public static Object createGuardianAttributes() { return net.minecraft.entity.mob.GuardianEntity.createGuardianAttributes(); }
public float getBeamTicks() { return wrapperContained.getBeamTicks(); }
// public static float getBeamTicks() { return net.minecraft.entity.mob.GuardianEntity.getBeamTicks(); }

}