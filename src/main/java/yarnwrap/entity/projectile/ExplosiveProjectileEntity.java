package yarnwrap.entity.projectile;
public class ExplosiveProjectileEntity { public net.minecraft.entity.projectile.ExplosiveProjectileEntity wrapperContained; public ExplosiveProjectileEntity(net.minecraft.entity.projectile.ExplosiveProjectileEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public double DEFAULT_ACCELERATION_POWER() { return wrapperContained.DEFAULT_ACCELERATION_POWER; }
// public void DEFAULT_ACCELERATION_POWER(double value) { wrapperContained.DEFAULT_ACCELERATION_POWER = value; }
public static double DEFAULT_ACCELERATION_POWER() { return net.minecraft.entity.projectile.ExplosiveProjectileEntity.DEFAULT_ACCELERATION_POWER; }
// public static void DEFAULT_ACCELERATION_POWER(double value, ) { net.minecraft.entity.projectile.ExplosiveProjectileEntity.DEFAULT_ACCELERATION_POWER = value; }

public double accelerationPower() { return wrapperContained.accelerationPower; }
public void accelerationPower(double value) { wrapperContained.accelerationPower = value; }
// public static double accelerationPower() { return net.minecraft.entity.projectile.ExplosiveProjectileEntity.accelerationPower; }
// public static void accelerationPower(double value, ) { net.minecraft.entity.projectile.ExplosiveProjectileEntity.accelerationPower = value; }

// public ExplosiveProjectileEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.util.math.Vec3d velocity,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.ExplosiveProjectileEntity(type.wrapperContained,x,y,z,velocity.wrapperContained,world.wrapperContained); }
// public ExplosiveProjectileEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.ExplosiveProjectileEntity(type.wrapperContained,x,y,z,world.wrapperContained); }
// public ExplosiveProjectileEntity(yarnwrap.entity.EntityType type,yarnwrap.entity.LivingEntity owner,yarnwrap.util.math.Vec3d velocity,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.ExplosiveProjectileEntity(type.wrapperContained,owner.wrapperContained,velocity.wrapperContained,world.wrapperContained); }
// public float getDrag() { return wrapperContained.getDrag(); }
// public static float getDrag() { return net.minecraft.entity.projectile.ExplosiveProjectileEntity.getDrag(); }
// public yarnwrap.particle.ParticleEffect getParticleType() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticleType()); }
// public static yarnwrap.particle.ParticleEffect getParticleType() { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.projectile.ExplosiveProjectileEntity.getParticleType()); }
// public boolean isBurning() { return wrapperContained.isBurning(); }
// public static boolean isBurning() { return net.minecraft.entity.projectile.ExplosiveProjectileEntity.isBurning(); }
// public Object getRaycastShapeType() { return wrapperContained.getRaycastShapeType(); }
// public static Object getRaycastShapeType() { return net.minecraft.entity.projectile.ExplosiveProjectileEntity.getRaycastShapeType(); }
// public float getDragInWater() { return wrapperContained.getDragInWater(); }
// public static float getDragInWater() { return net.minecraft.entity.projectile.ExplosiveProjectileEntity.getDragInWater(); }
// public void setVelocityWithAcceleration(yarnwrap.util.math.Vec3d velocity,double accelerationPower) { wrapperContained.setVelocityWithAcceleration(velocity.wrapperContained,accelerationPower); }
// public static void setVelocityWithAcceleration(yarnwrap.util.math.Vec3d velocity,double accelerationPower, ) { net.minecraft.entity.projectile.ExplosiveProjectileEntity.setVelocityWithAcceleration(velocity.wrapperContained,accelerationPower); }
// public void applyDrag() { wrapperContained.applyDrag(); }
// public static void applyDrag() { net.minecraft.entity.projectile.ExplosiveProjectileEntity.applyDrag(); }
// public void addParticles() { wrapperContained.addParticles(); }
// public static void addParticles() { net.minecraft.entity.projectile.ExplosiveProjectileEntity.addParticles(); }

}