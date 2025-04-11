package yarnwrap.entity.passive;
public class SquidEntity { public net.minecraft.entity.passive.SquidEntity wrapperContained; public SquidEntity(net.minecraft.entity.passive.SquidEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float prevTentacleAngle() { return wrapperContained.prevTentacleAngle; }
public void prevTentacleAngle(float value) { wrapperContained.prevTentacleAngle = value; }
// public float swimVelocityScale() { return wrapperContained.swimVelocityScale; }
// public void swimVelocityScale(float value) { wrapperContained.swimVelocityScale = value; }
public float prevThrustTimer() { return wrapperContained.prevThrustTimer; }
public void prevThrustTimer(float value) { wrapperContained.prevThrustTimer = value; }
public float rollAngle() { return wrapperContained.rollAngle; }
public void rollAngle(float value) { wrapperContained.rollAngle = value; }
public float tentacleAngle() { return wrapperContained.tentacleAngle; }
public void tentacleAngle(float value) { wrapperContained.tentacleAngle = value; }
public float prevTiltAngle() { return wrapperContained.prevTiltAngle; }
public void prevTiltAngle(float value) { wrapperContained.prevTiltAngle = value; }
public float prevRollAngle() { return wrapperContained.prevRollAngle; }
public void prevRollAngle(float value) { wrapperContained.prevRollAngle = value; }
public float tiltAngle() { return wrapperContained.tiltAngle; }
public void tiltAngle(float value) { wrapperContained.tiltAngle = value; }
public float thrustTimer() { return wrapperContained.thrustTimer; }
public void thrustTimer(float value) { wrapperContained.thrustTimer = value; }
// public float swimZ() { return wrapperContained.swimZ; }
// public void swimZ(float value) { wrapperContained.swimZ = value; }
// public float swimX() { return wrapperContained.swimX; }
// public void swimX(float value) { wrapperContained.swimX = value; }
// public float swimY() { return wrapperContained.swimY; }
// public void swimY(float value) { wrapperContained.swimY = value; }
// public float thrustTimerSpeed() { return wrapperContained.thrustTimerSpeed; }
// public void thrustTimerSpeed(float value) { wrapperContained.thrustTimerSpeed = value; }
// public float turningSpeed() { return wrapperContained.turningSpeed; }
// public void turningSpeed(float value) { wrapperContained.turningSpeed = value; }
public Object createSquidAttributes() { return wrapperContained.createSquidAttributes(); }
// public yarnwrap.particle.ParticleEffect getInkParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getInkParticle()); }
// public yarnwrap.sound.SoundEvent getSquirtSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSquirtSound()); }
// public void squirt() { wrapperContained.squirt(); }
public void setSwimmingVector(float x,float y,float z) { wrapperContained.setSwimmingVector(x,y,z); }
// public yarnwrap.util.math.Vec3d applyBodyRotations(yarnwrap.util.math.Vec3d shootVector) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyBodyRotations(shootVector.wrapperContained)); }
public boolean hasSwimmingVector() { return wrapperContained.hasSwimmingVector(); }

}