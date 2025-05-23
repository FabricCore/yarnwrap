package yarnwrap.particle;
public class TrailParticleEffect { public net.minecraft.particle.TrailParticleEffect wrapperContained; public TrailParticleEffect(net.minecraft.particle.TrailParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.particle.TrailParticleEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.particle.TrailParticleEffect.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.particle.TrailParticleEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.particle.TrailParticleEffect.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_64928(Object instance) { return wrapperContained.method_64928(instance); }
// public static com.mojang.datafixers.kinds.App method_64928(Object instance, ) { return net.minecraft.particle.TrailParticleEffect.method_64928(instance); }

}