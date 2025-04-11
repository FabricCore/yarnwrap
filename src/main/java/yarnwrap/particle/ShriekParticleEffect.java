package yarnwrap.particle;
public class ShriekParticleEffect { public net.minecraft.particle.ShriekParticleEffect wrapperContained; public ShriekParticleEffect(net.minecraft.particle.ShriekParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int delay() { return wrapperContained.delay; }
// public void delay(int value) { wrapperContained.delay = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public int getDelay() { return wrapperContained.getDelay(); }

}