package yarnwrap.entity.passive;
public class SquidEntity { public net.minecraft.entity.passive.SquidEntity wrapperContained; public SquidEntity(net.minecraft.entity.passive.SquidEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float lastTentacleAngle() { return wrapperContained.lastTentacleAngle; }
public void lastTentacleAngle(float value) { wrapperContained.lastTentacleAngle = value; }
// public static float lastTentacleAngle() { return net.minecraft.entity.passive.SquidEntity.lastTentacleAngle; }
// public static void lastTentacleAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.lastTentacleAngle = value; }

// public float swimVelocityScale() { return wrapperContained.swimVelocityScale; }
// public void swimVelocityScale(float value) { wrapperContained.swimVelocityScale = value; }
// public static float swimVelocityScale() { return net.minecraft.entity.passive.SquidEntity.swimVelocityScale; }
// public static void swimVelocityScale(float value, ) { net.minecraft.entity.passive.SquidEntity.swimVelocityScale = value; }

public float lastThrustTimer() { return wrapperContained.lastThrustTimer; }
public void lastThrustTimer(float value) { wrapperContained.lastThrustTimer = value; }
// public static float lastThrustTimer() { return net.minecraft.entity.passive.SquidEntity.lastThrustTimer; }
// public static void lastThrustTimer(float value, ) { net.minecraft.entity.passive.SquidEntity.lastThrustTimer = value; }

public float rollAngle() { return wrapperContained.rollAngle; }
public void rollAngle(float value) { wrapperContained.rollAngle = value; }
// public static float rollAngle() { return net.minecraft.entity.passive.SquidEntity.rollAngle; }
// public static void rollAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.rollAngle = value; }

public float tentacleAngle() { return wrapperContained.tentacleAngle; }
public void tentacleAngle(float value) { wrapperContained.tentacleAngle = value; }
// public static float tentacleAngle() { return net.minecraft.entity.passive.SquidEntity.tentacleAngle; }
// public static void tentacleAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.tentacleAngle = value; }

public float lastTiltAngle() { return wrapperContained.lastTiltAngle; }
public void lastTiltAngle(float value) { wrapperContained.lastTiltAngle = value; }
// public static float lastTiltAngle() { return net.minecraft.entity.passive.SquidEntity.lastTiltAngle; }
// public static void lastTiltAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.lastTiltAngle = value; }

public float lastRollAngle() { return wrapperContained.lastRollAngle; }
public void lastRollAngle(float value) { wrapperContained.lastRollAngle = value; }
// public static float lastRollAngle() { return net.minecraft.entity.passive.SquidEntity.lastRollAngle; }
// public static void lastRollAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.lastRollAngle = value; }

public float tiltAngle() { return wrapperContained.tiltAngle; }
public void tiltAngle(float value) { wrapperContained.tiltAngle = value; }
// public static float tiltAngle() { return net.minecraft.entity.passive.SquidEntity.tiltAngle; }
// public static void tiltAngle(float value, ) { net.minecraft.entity.passive.SquidEntity.tiltAngle = value; }

public float thrustTimer() { return wrapperContained.thrustTimer; }
public void thrustTimer(float value) { wrapperContained.thrustTimer = value; }
// public static float thrustTimer() { return net.minecraft.entity.passive.SquidEntity.thrustTimer; }
// public static void thrustTimer(float value, ) { net.minecraft.entity.passive.SquidEntity.thrustTimer = value; }

// public float thrustTimerSpeed() { return wrapperContained.thrustTimerSpeed; }
// public void thrustTimerSpeed(float value) { wrapperContained.thrustTimerSpeed = value; }
// public static float thrustTimerSpeed() { return net.minecraft.entity.passive.SquidEntity.thrustTimerSpeed; }
// public static void thrustTimerSpeed(float value, ) { net.minecraft.entity.passive.SquidEntity.thrustTimerSpeed = value; }

// public float turningSpeed() { return wrapperContained.turningSpeed; }
// public void turningSpeed(float value) { wrapperContained.turningSpeed = value; }
// public static float turningSpeed() { return net.minecraft.entity.passive.SquidEntity.turningSpeed; }
// public static void turningSpeed(float value, ) { net.minecraft.entity.passive.SquidEntity.turningSpeed = value; }

// public yarnwrap.util.math.Vec3d swimVec() { return new yarnwrap.util.math.Vec3d(wrapperContained.swimVec); }
// public void swimVec(yarnwrap.util.math.Vec3d value) { wrapperContained.swimVec = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d swimVec() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.passive.SquidEntity.swimVec); }
// public static void swimVec(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.passive.SquidEntity.swimVec = value.wrapperContained; }

// public void squirt() { wrapperContained.squirt(); }
// public static void squirt() { net.minecraft.entity.passive.SquidEntity.squirt(); }
// public yarnwrap.util.math.Vec3d applyBodyRotations(yarnwrap.util.math.Vec3d shootVector) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyBodyRotations(shootVector.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d applyBodyRotations(yarnwrap.util.math.Vec3d shootVector, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.passive.SquidEntity.applyBodyRotations(shootVector.wrapperContained)); }
public boolean hasSwimmingVector() { return wrapperContained.hasSwimmingVector(); }
// public static boolean hasSwimmingVector() { return net.minecraft.entity.passive.SquidEntity.hasSwimmingVector(); }
// public Object createSquidAttributes() { return wrapperContained.createSquidAttributes(); }
public static Object createSquidAttributes() { return net.minecraft.entity.passive.SquidEntity.createSquidAttributes(); }
// public yarnwrap.particle.ParticleEffect getInkParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getInkParticle()); }
// public static yarnwrap.particle.ParticleEffect getInkParticle() { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.passive.SquidEntity.getInkParticle()); }
// public yarnwrap.sound.SoundEvent getSquirtSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSquirtSound()); }
// public static yarnwrap.sound.SoundEvent getSquirtSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.passive.SquidEntity.getSquirtSound()); }

}