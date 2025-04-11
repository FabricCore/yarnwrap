package yarnwrap.client.particle;
public class RedDustParticle { public net.minecraft.client.particle.RedDustParticle wrapperContained; public RedDustParticle(net.minecraft.client.particle.RedDustParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public RedDustParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.particle.DustParticleEffect parameters,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.RedDustParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,parameters.wrapperContained,spriteProvider.wrapperContained); }

}