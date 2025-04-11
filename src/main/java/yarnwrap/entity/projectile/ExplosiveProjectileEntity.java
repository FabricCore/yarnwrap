package yarnwrap.entity.projectile;
public class ExplosiveProjectileEntity { public net.minecraft.entity.projectile.ExplosiveProjectileEntity wrapperContained; public ExplosiveProjectileEntity(net.minecraft.entity.projectile.ExplosiveProjectileEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public double accelerationPower() { return wrapperContained.accelerationPower; }
public void accelerationPower(double value) { wrapperContained.accelerationPower = value; }
// public ExplosiveProjectileEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.ExplosiveProjectileEntity(type.wrapperContained,x,y,z,world.wrapperContained); }
// public ExplosiveProjectileEntity(yarnwrap.entity.EntityType type,double x,double y,double z,yarnwrap.util.math.Vec3d velocity,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.ExplosiveProjectileEntity(type.wrapperContained,x,y,z,velocity.wrapperContained,world.wrapperContained); }
// public ExplosiveProjectileEntity(yarnwrap.entity.EntityType type,yarnwrap.entity.LivingEntity owner,yarnwrap.util.math.Vec3d velocity,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.projectile.ExplosiveProjectileEntity(type.wrapperContained,owner.wrapperContained,velocity.wrapperContained,world.wrapperContained); }
// public Object getRaycastShapeType() { return wrapperContained.getRaycastShapeType(); }
// public float getDragInWater() { return wrapperContained.getDragInWater(); }
// public void setVelocityWithAcceleration(yarnwrap.util.math.Vec3d velocity,double accelerationPower) { wrapperContained.setVelocityWithAcceleration(velocity.wrapperContained,accelerationPower); }
// public float getDrag() { return wrapperContained.getDrag(); }
// public yarnwrap.particle.ParticleEffect getParticleType() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticleType()); }
// public boolean isBurning() { return wrapperContained.isBurning(); }

}