package yarnwrap.particle;
public class ShriekParticleEffect { public net.minecraft.particle.ShriekParticleEffect wrapperContained; public ShriekParticleEffect(net.minecraft.particle.ShriekParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.particle.ShriekParticleEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.particle.ShriekParticleEffect.CODEC = value; }

// public int delay() { return wrapperContained.delay; }
// public void delay(int value) { wrapperContained.delay = value; }
// public static int delay() { return net.minecraft.particle.ShriekParticleEffect.delay; }
// public static void delay(int value, ) { net.minecraft.particle.ShriekParticleEffect.delay = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.particle.ShriekParticleEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.particle.ShriekParticleEffect.PACKET_CODEC = value.wrapperContained; }

public ShriekParticleEffect(int delay) { this.wrapperContained = new net.minecraft.particle.ShriekParticleEffect(delay); }
// public com.mojang.datafixers.kinds.App method_42617(Object instance) { return wrapperContained.method_42617(instance); }
// public static com.mojang.datafixers.kinds.App method_42617(Object instance, ) { return net.minecraft.particle.ShriekParticleEffect.method_42617(instance); }
// public java.lang.Integer method_42618(yarnwrap.particle.ShriekParticleEffect particleEffect) { return wrapperContained.method_42618(particleEffect.wrapperContained); }
// public static java.lang.Integer method_42618(yarnwrap.particle.ShriekParticleEffect particleEffect, ) { return net.minecraft.particle.ShriekParticleEffect.method_42618(particleEffect.wrapperContained); }
public int getDelay() { return wrapperContained.getDelay(); }
// public static int getDelay() { return net.minecraft.particle.ShriekParticleEffect.getDelay(); }
// public java.lang.Integer method_56186(yarnwrap.particle.ShriekParticleEffect effect) { return wrapperContained.method_56186(effect.wrapperContained); }
// public static java.lang.Integer method_56186(yarnwrap.particle.ShriekParticleEffect effect, ) { return net.minecraft.particle.ShriekParticleEffect.method_56186(effect.wrapperContained); }

}