package yarnwrap.entity.mob;
public class BreezeEntity { public net.minecraft.entity.mob.BreezeEntity wrapperContained; public BreezeEntity(net.minecraft.entity.mob.BreezeEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState slidingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.slidingAnimationState); }
public void slidingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.slidingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState slidingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.BreezeEntity.slidingAnimationState); }
// public static void slidingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.BreezeEntity.slidingAnimationState = value.wrapperContained; }

// public int longJumpingParticleAddCount() { return wrapperContained.longJumpingParticleAddCount; }
// public void longJumpingParticleAddCount(int value) { wrapperContained.longJumpingParticleAddCount = value; }
// public static int longJumpingParticleAddCount() { return net.minecraft.entity.mob.BreezeEntity.longJumpingParticleAddCount; }
// public static void longJumpingParticleAddCount(int value, ) { net.minecraft.entity.mob.BreezeEntity.longJumpingParticleAddCount = value; }

public yarnwrap.entity.AnimationState inhalingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.inhalingAnimationState); }
public void inhalingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.inhalingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState inhalingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.BreezeEntity.inhalingAnimationState); }
// public static void inhalingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.BreezeEntity.inhalingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState shootingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.shootingAnimationState); }
public void shootingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.shootingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState shootingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.BreezeEntity.shootingAnimationState); }
// public static void shootingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.BreezeEntity.shootingAnimationState = value.wrapperContained; }

// public int ticksUntilWhirlSound() { return wrapperContained.ticksUntilWhirlSound; }
// public void ticksUntilWhirlSound(int value) { wrapperContained.ticksUntilWhirlSound = value; }
// public static int ticksUntilWhirlSound() { return net.minecraft.entity.mob.BreezeEntity.ticksUntilWhirlSound; }
// public static void ticksUntilWhirlSound(int value, ) { net.minecraft.entity.mob.BreezeEntity.ticksUntilWhirlSound = value; }

// public yarnwrap.entity.ProjectileDeflection PROJECTILE_DEFLECTOR() { return new yarnwrap.entity.ProjectileDeflection(wrapperContained.PROJECTILE_DEFLECTOR); }
// public void PROJECTILE_DEFLECTOR(yarnwrap.entity.ProjectileDeflection value) { wrapperContained.PROJECTILE_DEFLECTOR = value.wrapperContained; }
// public static yarnwrap.entity.ProjectileDeflection PROJECTILE_DEFLECTOR() { return new yarnwrap.entity.ProjectileDeflection(net.minecraft.entity.mob.BreezeEntity.PROJECTILE_DEFLECTOR); }
// public static void PROJECTILE_DEFLECTOR(yarnwrap.entity.ProjectileDeflection value, ) { net.minecraft.entity.mob.BreezeEntity.PROJECTILE_DEFLECTOR = value.wrapperContained; }

public void addBlockParticles(int count) { wrapperContained.addBlockParticles(count); }
// public static void addBlockParticles(int count, ) { net.minecraft.entity.mob.BreezeEntity.addBlockParticles(count); }
public void addLongJumpingParticles() { wrapperContained.addLongJumpingParticles(); }
// public static void addLongJumpingParticles() { net.minecraft.entity.mob.BreezeEntity.addLongJumpingParticles(); }
public double getChargeY() { return wrapperContained.getChargeY(); }
// public static double getChargeY() { return net.minecraft.entity.mob.BreezeEntity.getChargeY(); }
// public void stopAnimations() { wrapperContained.stopAnimations(); }
// public static void stopAnimations() { net.minecraft.entity.mob.BreezeEntity.stopAnimations(); }
public boolean isWithinShortRange(yarnwrap.util.math.Vec3d pos) { return wrapperContained.isWithinShortRange(pos.wrapperContained); }
// public static boolean isWithinShortRange(yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.entity.mob.BreezeEntity.isWithinShortRange(pos.wrapperContained); }
// public Object createBreezeAttributes() { return wrapperContained.createBreezeAttributes(); }
public static Object createBreezeAttributes() { return net.minecraft.entity.mob.BreezeEntity.createBreezeAttributes(); }
public yarnwrap.entity.mob.BreezeEntity resetLongJumpingParticleAddCount() { return new yarnwrap.entity.mob.BreezeEntity(wrapperContained.resetLongJumpingParticleAddCount()); }
// public static yarnwrap.entity.mob.BreezeEntity resetLongJumpingParticleAddCount() { return new yarnwrap.entity.mob.BreezeEntity(net.minecraft.entity.mob.BreezeEntity.resetLongJumpingParticleAddCount()); }
public void playWhirlSound() { wrapperContained.playWhirlSound(); }
// public static void playWhirlSound() { net.minecraft.entity.mob.BreezeEntity.playWhirlSound(); }
// public void method_56087(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random) { wrapperContained.method_56087(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public static void method_56087(yarnwrap.entity.projectile.ProjectileEntity projectile,yarnwrap.entity.Entity hitEntity,yarnwrap.util.math.random.Random random, ) { net.minecraft.entity.mob.BreezeEntity.method_56087(projectile.wrapperContained,hitEntity.wrapperContained,random.wrapperContained); }
// public yarnwrap.entity.LivingEntity method_56560(yarnwrap.entity.Entity livingAttacker) { return new yarnwrap.entity.LivingEntity(wrapperContained.method_56560(livingAttacker.wrapperContained)); }
// public static yarnwrap.entity.LivingEntity method_56560(yarnwrap.entity.Entity livingAttacker, ) { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.BreezeEntity.method_56560(livingAttacker.wrapperContained)); }
// public boolean method_56561(yarnwrap.entity.Entity attacker) { return wrapperContained.method_56561(attacker.wrapperContained); }
// public static boolean method_56561(yarnwrap.entity.Entity attacker, ) { return net.minecraft.entity.mob.BreezeEntity.method_56561(attacker.wrapperContained); }
public java.util.Optional getHurtBy() { return wrapperContained.getHurtBy(); }
// public static java.util.Optional getHurtBy() { return net.minecraft.entity.mob.BreezeEntity.getHurtBy(); }

}