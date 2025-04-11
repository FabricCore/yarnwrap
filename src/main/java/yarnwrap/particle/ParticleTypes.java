package yarnwrap.particle;
public class ParticleTypes { public net.minecraft.particle.ParticleTypes wrapperContained; public ParticleTypes(net.minecraft.particle.ParticleTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public yarnwrap.particle.SimpleParticleType register(java.lang.String name,boolean alwaysShow) { return new yarnwrap.particle.SimpleParticleType(wrapperContained.register(name,alwaysShow)); }
// public yarnwrap.particle.ParticleType register(java.lang.String name,boolean alwaysShow,java.util.function.Function codecGetter,java.util.function.Function packetCodecGetter) { return new yarnwrap.particle.ParticleType(wrapperContained.register(name,alwaysShow,codecGetter,packetCodecGetter)); }

}