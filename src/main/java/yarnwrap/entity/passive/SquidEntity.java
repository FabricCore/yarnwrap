package yarnwrap.entity.passive;
public class SquidEntity { public net.minecraft.entity.passive.SquidEntity wrapperContained; public SquidEntity(net.minecraft.entity.passive.SquidEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float prevTentacleAngle() { return wrapperContained.prevTentacleAngle; }
public void prevTentacleAngle(float value) { wrapperContained.prevTentacleAngle = value; }
// public static float prevTentacleAngle() { return net.minecraft.entity.passive.SquidEntity.prevTentacleAngle; }
// public static void prevTentacleAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.prevTentacleAngle = value; }

// public float swimVelocityScale() { return wrapperContained.swimVelocityScale; }
// public void swimVelocityScale(float value) { wrapperContained.swimVelocityScale = value; }
// public static float swimVelocityScale() { return net.minecraft.entity.passive.SquidEntity.swimVelocityScale; }
// public static void swimVelocityScale(float value, ) { net.minecraft.entity.passive.SquidEntity.swimVelocityScale = value; }

public float prevThrustTimer() { return wrapperContained.prevThrustTimer; }
public void prevThrustTimer(float value) { wrapperContained.prevThrustTimer = value; }
// public static float prevThrustTimer() { return net.minecraft.entity.passive.SquidEntity.prevThrustTimer; }
// public static void prevThrustTimer(float value, ) { net.minecraft.entity.passive.SquidEntity.prevThrustTimer = value; }

public float rollAngle() { return wrapperContained.rollAngle; }
public void rollAngle(float value) { wrapperContained.rollAngle = value; }
// public static float rollAngle() { return net.minecraft.entity.passive.SquidEntity.rollAngle; }
// public static void rollAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.rollAngle = value; }

public float tentacleAngle() { return wrapperContained.tentacleAngle; }
public void tentacleAngle(float value) { wrapperContained.tentacleAngle = value; }
// public static float tentacleAngle() { return net.minecraft.entity.passive.SquidEntity.tentacleAngle; }
// public static void tentacleAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.tentacleAngle = value; }

public float prevTiltAngle() { return wrapperContained.prevTiltAngle; }
public void prevTiltAngle(float value) { wrapperContained.prevTiltAngle = value; }
// public static float prevTiltAngle() { return net.minecraft.entity.passive.SquidEntity.prevTiltAngle; }
// public static void prevTiltAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.prevTiltAngle = value; }

public float prevRollAngle() { return wrapperContained.prevRollAngle; }
public void prevRollAngle(float value) { wrapperContained.prevRollAngle = value; }
// public static float prevRollAngle() { return net.minecraft.entity.passive.SquidEntity.prevRollAngle; }
// public static void prevRollAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.prevRollAngle = value; }

public float tiltAngle() { return wrapperContained.tiltAngle; }
public void tiltAngle(float value) { wrapperContained.tiltAngle = value; }
// public static float tiltAngle() { return net.minecraft.entity.passive.SquidEntity.tiltAngle; }
// public static void tiltAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.tiltAngle = value; }

public float thrustTimer() { return wrapperContained.thrustTimer; }
public void thrustTimer(float value) { wrapperContained.thrustTimer = value; }
// public static float thrustTimer() { return net.minecraft.entity.passive.SquidEntity.thrustTimer; }
// public static void thrustTimer(float value, ) { net.minecraft.entity.passive.SquidEntity.thrustTimer = value; }

// public float swimZ() { return wrapperContained.swimZ; }
// public void swimZ(float value) { wrapperContained.swimZ = value; }
// public static float swimZ() { return net.minecraft.entity.passive.SquidEntity.swimZ; }
// public static void swimZ(float value, ) { net.minecraft.entity.passive.SquidEntity.swimZ = value; }

// public float swimX() { return wrapperContained.swimX; }
// public void swimX(float value) { wrapperContained.swimX = value; }
// public static float swimX() { return net.minecraft.entity.passive.SquidEntity.swimX; }
// public static void swimX(float value, ) { net.minecraft.entity.passive.SquidEntity.swimX = value; }

// public float swimY() { return wrapperContained.swimY; }
// public void swimY(float value) { wrapperContained.swimY = value; }
// public static float swimY() { return net.minecraft.entity.passive.SquidEntity.swimY; }
// public static void swimY(float value, ) { net.minecraft.entity.passive.SquidEntity.swimY = value; }

// public float thrustTimerSpeed() { return wrapperContained.thrustTimerSpeed; }
// public void thrustTimerSpeed(float value) { wrapperContained.thrustTimerSpeed = value; }
// public static float thrustTimerSpeed() { return net.minecraft.entity.passive.SquidEntity.thrustTimerSpeed; }
// public static void thrustTimerSpeed(float value, ) { net.minecraft.entity.passive.SquidEntity.thrustTimerSpeed = value; }

// public float turningSpeed() { return wrapperContained.turningSpeed; }
// public void turningSpeed(float value) { wrapperContained.turningSpeed = value; }
// public static float turningSpeed() { return net.minecraft.entity.passive.SquidEntity.turningSpeed; }
// public static void turningSpeed(float value, ) { net.minecraft.entity.passive.SquidEntity.turningSpeed = value; }

// public Object createSquidAttributes() { return wrapperContained.createSquidAttributes(); }
public static Object createSquidAttributes() { return net.minecraft.entity.passive.SquidEntity.createSquidAttributes(); }
// public yarnwrap.particle.ParticleEffect getInkParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getInkParticle()); }
// public static yarnwrap.particle.ParticleEffect getInkParticle() { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.passive.SquidEntity.getInkParticle()); }
// public yarnwrap.sound.SoundEvent getSquirtSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSquirtSound()); }
// public static yarnwrap.sound.SoundEvent getSquirtSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.SquidEntity.getSquirtSound()); }
// public void squirt() { wrapperContained.squirt(); }
// public static void squirt() { net.minecraft.entity.passive.SquidEntity.squirt(); }
public void setSwimmingVector(float x,float y,float z) { wrapperContained.setSwimmingVector(x,y,z); }
// public static void setSwimmingVector(float x,float y,float z, ) { net.minecraft.entity.passive.SquidEntity.setSwimmingVector(x,y,z); }
// public yarnwrap.util.math.Vec3d applyBodyRotations(yarnwrap.util.math.Vec3d shootVector) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyBodyRotations(shootVector.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d applyBodyRotations(yarnwrap.util.math.Vec3d shootVector, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.passive.SquidEntity.applyBodyRotations(shootVector.wrapperContained)); }
public boolean hasSwimmingVector() { return wrapperContained.hasSwimmingVector(); }
// public static boolean hasSwimmingVector() { return net.minecraft.entity.passive.SquidEntity.hasSwimmingVector(); }

}