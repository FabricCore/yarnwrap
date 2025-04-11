package yarnwrap.entity.projectile.thrown;
public class SnowballEntity { public net.minecraft.entity.projectile.thrown.SnowballEntity wrapperContained; public SnowballEntity(net.minecraft.entity.projectile.thrown.SnowballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public SnowballEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.SnowballEntity(world.wrapperContained,x,y,z); }
public SnowballEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.SnowballEntity(world.wrapperContained,owner.wrapperContained); }
// public yarnwrap.particle.ParticleEffect getParticleParameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticleParameters()); }

}