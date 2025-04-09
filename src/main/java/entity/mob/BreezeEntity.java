package yarnwrap.entity.mob;
public class BreezeEntity { public net.minecraft.entity.mob.BreezeEntity wrapperContained; public BreezeEntity(net.minecraft.entity.mob.BreezeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState slidingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.slidingAnimationState); }
// public int longJumpingParticleAddCount() { return wrapperContained.longJumpingParticleAddCount; }
public yarnwrap.entity.AnimationState inhalingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.inhalingAnimationState); }
public yarnwrap.entity.AnimationState shootingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.shootingAnimationState); }
// public int ticksUntilWhirlSound() { return wrapperContained.ticksUntilWhirlSound; }
// public yarnwrap.entity.ProjectileDeflection PROJECTILE_DEFLECTOR() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.PROJECTILE_DEFLECTOR); }
public void addBlockParticles(int count) { wrapperContained.addBlockParticles(count); }
public void addLongJumpingParticles() { wrapperContained.addLongJumpingParticles(); }
public double getChargeY() { return wrapperContained.getChargeY(); }
// public void stopAnimations() { wrapperContained.stopAnimations(); }
public boolean isWithinShortRange(yarnwrap.util.math.Vec3d pos) { return wrapperContained.isWithinShortRange(pos.wrapperContained); }
public Object createBreezeAttributes() { return wrapperContained.createBreezeAttributes(); }
public yarnwrap.entity.mob.BreezeEntity resetLongJumpingParticleAddCount() { return new yarnwrap.entity.mob.BreezeEntity(wrapperContained.resetLongJumpingParticleAddCount()); }
public void playWhirlSound() { wrapperContained.playWhirlSound(); }
public java.util.Optional getHurtBy() { return wrapperContained.getHurtBy(); }

}