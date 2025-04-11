package yarnwrap.client.particle;
public class WhiteSmokeParticle { public net.minecraft.client.particle.WhiteSmokeParticle wrapperContained; public WhiteSmokeParticle(net.minecraft.client.particle.WhiteSmokeParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public WhiteSmokeParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,float scaleMultiplier,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.WhiteSmokeParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,scaleMultiplier,spriteProvider.wrapperContained); }

}