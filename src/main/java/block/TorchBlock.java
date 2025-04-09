package yarnwrap.block;
public class TorchBlock { public net.minecraft.block.TorchBlock wrapperContained; public TorchBlock(net.minecraft.block.TorchBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.SimpleParticleType particle() { return new yarnwrap.particle.SimpleParticleType(wrapperContained.particle); }
// public com.mojang.serialization.MapCodec PARTICLE_TYPE_CODEC() { return wrapperContained.PARTICLE_TYPE_CODEC; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}