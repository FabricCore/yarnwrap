package yarnwrap.client.particle;
public class EmitterParticle { public net.minecraft.client.particle.EmitterParticle wrapperContained; public EmitterParticle(net.minecraft.client.particle.EmitterParticle wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.ParticleEffect parameters() { return new yarnwrap.particle.ParticleEffect(wrapperContained.parameters); }
// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public int maxEmitterAge() { return wrapperContained.maxEmitterAge; }
// public int emitterAge() { return wrapperContained.emitterAge; }

}