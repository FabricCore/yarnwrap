package yarnwrap.client.particle;
public class WaterSuspendParticle { public net.minecraft.client.particle.WaterSuspendParticle wrapperContained; public WaterSuspendParticle(net.minecraft.client.particle.WaterSuspendParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public WaterSuspendParticle(yarnwrap.client.world.ClientWorld world,yarnwrap.client.particle.SpriteProvider spriteProvider,double x,double y,double z) { this.wrapperContained = new net.minecraft.client.particle.WaterSuspendParticle(world.wrapperContained,spriteProvider.wrapperContained,x,y,z); }
// public WaterSuspendParticle(yarnwrap.client.world.ClientWorld world,yarnwrap.client.particle.SpriteProvider spriteProvider,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { this.wrapperContained = new net.minecraft.client.particle.WaterSuspendParticle(world.wrapperContained,spriteProvider.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }

}