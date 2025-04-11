package yarnwrap.block;
public class TorchBlock { public net.minecraft.block.TorchBlock wrapperContained; public TorchBlock(net.minecraft.block.TorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.SimpleParticleType particle() { return new yarnwrap.particle.SimpleParticleType(wrapperContained.particle); }
// public void particle(yarnwrap.particle.SimpleParticleType value) { wrapperContained.particle = value.wrapperContained; }
// public com.mojang.serialization.MapCodec PARTICLE_TYPE_CODEC() { return wrapperContained.PARTICLE_TYPE_CODEC; }
// public void PARTICLE_TYPE_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.PARTICLE_TYPE_CODEC = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}