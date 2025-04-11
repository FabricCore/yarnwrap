package yarnwrap.client.particle;
public class ExplosionLargeParticle { public net.minecraft.client.particle.ExplosionLargeParticle wrapperContained; public ExplosionLargeParticle(net.minecraft.client.particle.ExplosionLargeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public ExplosionLargeParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.ExplosionLargeParticle(world.wrapperContained,x,y,z,spriteProvider); }

}