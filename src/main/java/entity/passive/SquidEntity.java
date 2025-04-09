package yarnwrap.entity.passive;
public class SquidEntity { public net.minecraft.entity.passive.SquidEntity wrapperContained; public SquidEntity(net.minecraft.entity.passive.SquidEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float prevTentacleAngle() { return wrapperContained.prevTentacleAngle; }
// public float swimVelocityScale() { return wrapperContained.swimVelocityScale; }
public float prevThrustTimer() { return wrapperContained.prevThrustTimer; }
public float rollAngle() { return wrapperContained.rollAngle; }
public float tentacleAngle() { return wrapperContained.tentacleAngle; }
public float prevTiltAngle() { return wrapperContained.prevTiltAngle; }
public float prevRollAngle() { return wrapperContained.prevRollAngle; }
public float tiltAngle() { return wrapperContained.tiltAngle; }
public float thrustTimer() { return wrapperContained.thrustTimer; }
// public float swimZ() { return wrapperContained.swimZ; }
// public float swimX() { return wrapperContained.swimX; }
// public float swimY() { return wrapperContained.swimY; }
// public float thrustTimerSpeed() { return wrapperContained.thrustTimerSpeed; }
// public float turningSpeed() { return wrapperContained.turningSpeed; }
public Object createSquidAttributes() { return wrapperContained.createSquidAttributes(); }
// public yarnwrap.particle.ParticleEffect getInkParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getInkParticle()); }
// public yarnwrap.sound.SoundEvent getSquirtSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSquirtSound()); }
// public void squirt() { wrapperContained.squirt(); }
public void setSwimmingVector(float x,float y,float z) { wrapperContained.setSwimmingVector(x,y,z); }
// public yarnwrap.util.math.Vec3d applyBodyRotations(yarnwrap.util.math.Vec3d shootVector) { return new yarnwrap.util.math.Vec3d(wrapperContained.applyBodyRotations(shootVector.wrapperContained)); }
public boolean hasSwimmingVector() { return wrapperContained.hasSwimmingVector(); }

}