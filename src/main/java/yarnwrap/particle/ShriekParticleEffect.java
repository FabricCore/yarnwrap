package yarnwrap.particle;
public class ShriekParticleEffect { public net.minecraft.particle.ShriekParticleEffect wrapperContained; public ShriekParticleEffect(net.minecraft.particle.ShriekParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public int delay() { return wrapperContained.delay; }
// public void delay(int value) { wrapperContained.delay = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public ShriekParticleEffect(int delay) { this.wrapperContained = new net.minecraft.particle.ShriekParticleEffect(delay); }
// public com.mojang.datafixers.kinds.App method_42617(Object instance) { return wrapperContained.method_42617(instance); }
// public java.lang.Integer method_42618(yarnwrap.particle.ShriekParticleEffect particleEffect) { return wrapperContained.method_42618(particleEffect.wrapperContained); }
public int getDelay() { return wrapperContained.getDelay(); }
// public java.lang.Integer method_56186(yarnwrap.particle.ShriekParticleEffect effect) { return wrapperContained.method_56186(effect.wrapperContained); }

}