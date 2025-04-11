package yarnwrap.client.particle;
public class EndRodParticle { public net.minecraft.client.particle.EndRodParticle wrapperContained; public EndRodParticle(net.minecraft.client.particle.EndRodParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public EndRodParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.EndRodParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,spriteProvider.wrapperContained); }

}