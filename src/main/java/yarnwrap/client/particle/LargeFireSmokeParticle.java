package yarnwrap.client.particle;
public class LargeFireSmokeParticle { public net.minecraft.client.particle.LargeFireSmokeParticle wrapperContained; public LargeFireSmokeParticle(net.minecraft.client.particle.LargeFireSmokeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public LargeFireSmokeParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.LargeFireSmokeParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,spriteProvider.wrapperContained); }

}