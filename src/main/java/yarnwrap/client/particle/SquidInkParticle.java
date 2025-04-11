package yarnwrap.client.particle;
public class SquidInkParticle { public net.minecraft.client.particle.SquidInkParticle wrapperContained; public SquidInkParticle(net.minecraft.client.particle.SquidInkParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public SquidInkParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,int color,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.SquidInkParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,color,spriteProvider.wrapperContained); }

}