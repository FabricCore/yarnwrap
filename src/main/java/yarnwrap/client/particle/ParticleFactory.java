package yarnwrap.client.particle;
public class ParticleFactory { public net.minecraft.client.particle.ParticleFactory wrapperContained; public ParticleFactory(net.minecraft.client.particle.ParticleFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.particle.Particle createParticle(yarnwrap.particle.ParticleEffect parameters,yarnwrap.client.world.ClientWorld world,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.createParticle(parameters.wrapperContained,world.wrapperContained,x,y,z,velocityX,velocityY,velocityZ)); }

}