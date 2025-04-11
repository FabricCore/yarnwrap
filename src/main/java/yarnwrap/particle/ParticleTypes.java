package yarnwrap.particle;
public class ParticleTypes { public net.minecraft.particle.ParticleTypes wrapperContained; public ParticleTypes(net.minecraft.particle.ParticleTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public yarnwrap.particle.SimpleParticleType register(java.lang.String name,boolean alwaysShow) { return new yarnwrap.particle.SimpleParticleType(wrapperContained.register(name,alwaysShow)); }
// public com.mojang.serialization.MapCodec method_29139(yarnwrap.particle.ParticleType type) { return wrapperContained.method_29139(type.wrapperContained); }
// public com.mojang.serialization.MapCodec method_33121(yarnwrap.particle.ParticleType type) { return wrapperContained.method_33121(type.wrapperContained); }
// public com.mojang.serialization.MapCodec method_33122(yarnwrap.particle.ParticleType type) { return wrapperContained.method_33122(type.wrapperContained); }
// public yarnwrap.particle.ParticleType register(java.lang.String name,boolean alwaysShow,java.util.function.Function codecGetter,java.util.function.Function packetCodecGetter) { return new yarnwrap.particle.ParticleType(wrapperContained.register(name,alwaysShow,codecGetter,packetCodecGetter)); }
// public com.mojang.serialization.MapCodec method_42023(yarnwrap.particle.ParticleType type) { return wrapperContained.method_42023(type.wrapperContained); }
// public com.mojang.serialization.MapCodec method_42616(yarnwrap.particle.ParticleType type) { return wrapperContained.method_42616(type.wrapperContained); }
// public yarnwrap.network.codec.PacketCodec method_56180(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56180(type.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec method_56181(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56181(type.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec method_56182(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56182(type.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec method_56183(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56183(type.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec method_56184(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56184(type.wrapperContained)); }

}