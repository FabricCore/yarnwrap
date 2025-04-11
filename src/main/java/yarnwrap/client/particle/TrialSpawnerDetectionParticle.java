package yarnwrap.client.particle;
public class TrialSpawnerDetectionParticle { public net.minecraft.client.particle.TrialSpawnerDetectionParticle wrapperContained; public TrialSpawnerDetectionParticle(net.minecraft.client.particle.TrialSpawnerDetectionParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.particle.SpriteProvider spriteProvider() { return new yarnwrap.client.particle.SpriteProvider(wrapperContained.spriteProvider); }
// public void spriteProvider(yarnwrap.client.particle.SpriteProvider value) { wrapperContained.spriteProvider = value.wrapperContained; }
// public TrialSpawnerDetectionParticle(yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ,float scale,yarnwrap.client.particle.SpriteProvider spriteProvider) { this.wrapperContained = new net.minecraft.client.particle.TrialSpawnerDetectionParticle(world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ,scale,spriteProvider.wrapperContained); }

}