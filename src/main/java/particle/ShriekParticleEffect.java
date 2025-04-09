package yarnwrap.particle;
public class ShriekParticleEffect { public net.minecraft.particle.ShriekParticleEffect wrapperContained; public ShriekParticleEffect(net.minecraft.particle.ShriekParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public int delay() { return wrapperContained.delay; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public int getDelay() { return wrapperContained.getDelay(); }

}