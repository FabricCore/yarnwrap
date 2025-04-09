package yarnwrap.particle;
public class SimpleParticleType { public net.minecraft.particle.SimpleParticleType wrapperContained; public SimpleParticleType(net.minecraft.particle.SimpleParticleType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }

}