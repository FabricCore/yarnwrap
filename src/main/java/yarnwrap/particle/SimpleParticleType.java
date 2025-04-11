package yarnwrap.particle;
public class SimpleParticleType { public net.minecraft.particle.SimpleParticleType wrapperContained; public SimpleParticleType(net.minecraft.particle.SimpleParticleType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public yarnwrap.network.codec.PacketCodec packetCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.packetCodec); }
// public void packetCodec(yarnwrap.network.codec.PacketCodec value) { wrapperContained.packetCodec = value.wrapperContained; }
// public SimpleParticleType(boolean alwaysShow) { this.wrapperContained = new net.minecraft.particle.SimpleParticleType(alwaysShow); }

}