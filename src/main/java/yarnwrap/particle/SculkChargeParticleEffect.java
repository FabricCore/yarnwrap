package yarnwrap.particle;
public class SculkChargeParticleEffect { public net.minecraft.particle.SculkChargeParticleEffect wrapperContained; public SculkChargeParticleEffect(net.minecraft.particle.SculkChargeParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.particle.SculkChargeParticleEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.particle.SculkChargeParticleEffect.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.particle.SculkChargeParticleEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.particle.SculkChargeParticleEffect.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_42024(Object instance) { return wrapperContained.method_42024(instance); }
// public static com.mojang.datafixers.kinds.App method_42024(Object instance, ) { return net.minecraft.particle.SculkChargeParticleEffect.method_42024(instance); }
// public java.lang.Float method_42025(yarnwrap.particle.SculkChargeParticleEffect particleEffect) { return wrapperContained.method_42025(particleEffect.wrapperContained); }
// public static java.lang.Float method_42025(yarnwrap.particle.SculkChargeParticleEffect particleEffect, ) { return net.minecraft.particle.SculkChargeParticleEffect.method_42025(particleEffect.wrapperContained); }
// public java.lang.Float method_56185(yarnwrap.particle.SculkChargeParticleEffect effect) { return wrapperContained.method_56185(effect.wrapperContained); }
// public static java.lang.Float method_56185(yarnwrap.particle.SculkChargeParticleEffect effect, ) { return net.minecraft.particle.SculkChargeParticleEffect.method_56185(effect.wrapperContained); }

}