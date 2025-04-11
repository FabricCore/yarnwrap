package yarnwrap.entity.mob;
public class BreezeEntity { public net.minecraft.entity.mob.BreezeEntity wrapperContained; public BreezeEntity(net.minecraft.entity.mob.BreezeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState slidingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.slidingAnimationState); }
public void slidingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.slidingAnimationState = value.wrapperContained; }
// public int longJumpingParticleAddCount() { return wrapperContained.longJumpingParticleAddCount; }
// public void longJumpingParticleAddCount(int value) { wrapperContained.longJumpingParticleAddCount = value; }
public yarnwrap.entity.AnimationState inhalingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.inhalingAnimationState); }
public void inhalingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.inhalingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState shootingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.shootingAnimationState); }
public void shootingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.shootingAnimationState = value.wrapperContained; }
// public int ticksUntilWhirlSound() { return wrapperContained.ticksUntilWhirlSound; }
// public void ticksUntilWhirlSound(int value) { wrapperContained.ticksUntilWhirlSound = value; }
// public yarnwrap.entity.ProjectileDeflection PROJECTILE_DEFLECTOR() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.PROJECTILE_DEFLECTOR); }
// public void PROJECTILE_DEFLECTOR(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.PROJECTILE_DEFLECTOR = value.wrapperContained; }
public void addBlockParticles(int count) { wrapperContained.addBlockParticles(count); }
public void addLongJumpingParticles() { wrapperContained.addLongJumpingParticles(); }
public double getChargeY() { return wrapperContained.getChargeY(); }
// public void stopAnimations() { wrapperContained.stopAnimations(); }
public boolean isWithinShortRange(yarnwrap.util.math.Vec3d pos) { return wrapperContained.isWithinShortRange(pos.wrapperContained); }
public Object createBreezeAttributes() { return wrapperContained.createBreezeAttributes(); }
public yarnwrap.entity.mob.BreezeEntity resetLongJumpingParticleAddCount() { return new yarnwrap.entity.mob.BreezeEntity(wrapperContained.resetLongJumpingParticleAddCount()); }
public void playWhirlSound() { wrapperContained.playWhirlSound(); }
// public void method_56087(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random) { wrapperContained.method_56087(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public yarnwrap.entity.LivingEntity method_56560(yarnwrap.entity.Entity livingAttacker) { return new yarnwrap.entity.LivingEntity(wrapperContained.method_56560(livingAttacker.wrapperContained)); }
// public boolean method_56561(yarnwrap.entity.Entity attacker) { return wrapperContained.method_56561(attacker.wrapperContained); }
public java.util.Optional getHurtBy() { return wrapperContained.getHurtBy(); }

}