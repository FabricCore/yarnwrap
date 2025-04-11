package yarnwrap.client.particle;
public class AshParticle { public net.minecraft.client.particle.AshParticle wrapperContained; public AshParticle(net.minecraft.client.particle.AshParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public AshParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,float scaleMultiplier,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.AshParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,scaleMultiplier,spriteProvider.wrapperContained); }

}