package yarnwrap.entity.projectile.thrown;
public class SnowballEntity { public net.minecraft.entity.projectile.thrown.SnowballEntity wrapperContained; public SnowballEntity(net.minecraft.entity.projectile.thrown.SnowballEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public SnowballEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.SnowballEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public SnowballEntity(yarnwrap.world.World world,yarnwrap.entity.LivingEntity owner,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.projectile.thrown.SnowballEntity(world.wrapperContained,owner.wrapperContained,stack.wrapperContained); }
// public yarnwrap.particle.ParticleEffect getParticleParameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticleParameters()); }
// public static yarnwrap.particle.ParticleEffect getParticleParameters() { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.projectile.thrown.SnowballEntity.getParticleParameters()); }

}