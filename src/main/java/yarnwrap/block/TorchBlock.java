package yarnwrap.block;
public class TorchBlock { public net.minecraft.block.TorchBlock wrapperContained; public TorchBlock(net.minecraft.block.TorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.SimpleParticleType particle() { return new yarnwrap.particle.SimpleParticleType(wrapperContained.particle); }
// public void particle(yarnwrap.particle.SimpleParticleType value) { wrapperContained.particle = value.wrapperContained; }
// public com.mojang.serialization.MapCodec PARTICLE_TYPE_CODEC() { return wrapperContained.PARTICLE_TYPE_CODEC; }
// public void PARTICLE_TYPE_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.PARTICLE_TYPE_CODEC = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public TorchBlock(yarnwrap.particle.SimpleParticleType particle,Object settings) { this.wrapperContained = new net.minecraft.block.TorchBlock(particle.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54053(Object instance) { return wrapperContained.method_54053(instance); }
// public yarnwrap.particle.SimpleParticleType method_54054(yarnwrap.block.TorchBlock block) { return new yarnwrap.particle.SimpleParticleType(wrapperContained.method_54054(block.wrapperContained)); }
// public com.mojang.serialization.DataResult method_54055(yarnwrap.particle.ParticleType particleType) { return wrapperContained.method_54055(particleType.wrapperContained); }
// public yarnwrap.particle.ParticleType method_54056(yarnwrap.particle.SimpleParticleType particleType) { return new yarnwrap.particle.ParticleType(wrapperContained.method_54056(particleType.wrapperContained)); }

}