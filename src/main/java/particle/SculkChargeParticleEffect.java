package yarnwrap.particle;
public class SculkChargeParticleEffect { public net.minecraft.particle.SculkChargeParticleEffect wrapperContained; public SculkChargeParticleEffect(net.minecraft.particle.SculkChargeParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }

}