package yarnwrap.client.particle;
public class TotemParticle { public net.minecraft.client.particle.TotemParticle wrapperContained; public TotemParticle(net.minecraft.client.particle.TotemParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public TotemParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.TotemParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,spriteProvider.wrapperContained); }

}