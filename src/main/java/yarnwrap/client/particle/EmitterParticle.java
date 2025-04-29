package yarnwrap.client.particle;
public class EmitterParticle { public net.minecraft.client.particle.EmitterParticle wrapperContained; public EmitterParticle(net.minecraft.client.particle.EmitterParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.ParticleEffect parameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.parameters); }
// public void parameters(yarnwrap.particle.ParticleEffect value) { wrapperContained.parameters = value.wrapperContained; }
// public static yarnwrap.particle.ParticleEffect parameters() { return new yarnwrap.particle.ParticleEffect(net.minecraft.client.particle.EmitterParticle.parameters); }
// public static void parameters(yarnwrap.particle.ParticleEffect value, ) { net.minecraft.client.particle.EmitterParticle.parameters = value.wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.client.particle.EmitterParticle.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.client.particle.EmitterParticle.entity = value.wrapperContained; }

// public int maxEmitterAge() { return wrapperContained.maxEmitterAge; }
// public void maxEmitterAge(int value) { wrapperContained.maxEmitterAge = value; }
// public static int maxEmitterAge() { return net.minecraft.client.particle.EmitterParticle.maxEmitterAge; }
// public static void maxEmitterAge(int value, ) { net.minecraft.client.particle.EmitterParticle.maxEmitterAge = value; }

// public int emitterAge() { return wrapperContained.emitterAge; }
// public void emitterAge(int value) { wrapperContained.emitterAge = value; }
// public static int emitterAge() { return net.minecraft.client.particle.EmitterParticle.emitterAge; }
// public static void emitterAge(int value, ) { net.minecraft.client.particle.EmitterParticle.emitterAge = value; }

public EmitterParticle(yarnwrap.client.world.ClientWorld world,yarnwrap.entity.Entity entity,yarnwrap.particle.ParticleEffect parameters) { this.wrapperContained = new net.minecraft.client.particle.EmitterParticle(world.wrapperContained,entity.wrapperContained,parameters.wrapperContained); }
public EmitterParticle(yarnwrap.client.world.ClientWorld world,yarnwrap.entity.Entity entity,yarnwrap.particle.ParticleEffect parameters,int maxEmitterAge) { this.wrapperContained = new net.minecraft.client.particle.EmitterParticle(world.wrapperContained,entity.wrapperContained,parameters.wrapperContained,maxEmitterAge); }
// public EmitterParticle(yarnwrap.client.world.ClientWorld world,yarnwrap.entity.Entity entity,yarnwrap.particle.ParticleEffect parameters,int maxEmitterAge,yarnwrap.util.math.Vec3d velocity) { this.wrapperContained = new net.minecraft.client.particle.EmitterParticle(world.wrapperContained,entity.wrapperContained,parameters.wrapperContained,maxEmitterAge,velocity.wrapperContained); }

}