package yarnwrap.client.particle;
public class FireSmokeParticle { public net.minecraft.client.particle.FireSmokeParticle wrapperContained; public FireSmokeParticle(net.minecraft.client.particle.FireSmokeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public FireSmokeParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,float scaleMultiplier,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.FireSmokeParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,scaleMultiplier,spriteProvider.wrapperContained); }

}