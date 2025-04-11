package yarnwrap.particle;
public class SculkChargeParticleEffect { public net.minecraft.particle.SculkChargeParticleEffect wrapperContained; public SculkChargeParticleEffect(net.minecraft.particle.SculkChargeParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public com.mojang.datafixers.kinds.App method_42024(Object instance) { return wrapperContained.method_42024(instance); }
// public java.lang.Float method_42025(yarnwrap.particle.SculkChargeParticleEffect particleEffect) { return wrapperContained.method_42025(particleEffect.wrapperContained); }
// public java.lang.Float method_56185(yarnwrap.particle.SculkChargeParticleEffect effect) { return wrapperContained.method_56185(effect.wrapperContained); }

}