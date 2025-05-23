package yarnwrap.particle;
public class DustParticleEffect { public net.minecraft.particle.DustParticleEffect wrapperContained; public DustParticleEffect(net.minecraft.particle.DustParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.particle.DustParticleEffect DEFAULT() { return new yarnwrap.particle.DustParticleEffect(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.particle.DustParticleEffect value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.particle.DustParticleEffect DEFAULT() { return new yarnwrap.particle.DustParticleEffect(net.minecraft.particle.DustParticleEffect.DEFAULT); }
// public static void DEFAULT(yarnwrap.particle.DustParticleEffect value, ) { net.minecraft.particle.DustParticleEffect.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.particle.DustParticleEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.particle.DustParticleEffect.CODEC = value; }

// public int RED() { return wrapperContained.RED; }
// public void RED(int value) { wrapperContained.RED = value; }
public static int RED() { return net.minecraft.particle.DustParticleEffect.RED; }
// public static void RED(int value, ) { net.minecraft.particle.DustParticleEffect.RED = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.particle.DustParticleEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.particle.DustParticleEffect.PACKET_CODEC = value.wrapperContained; }

// public int color() { return wrapperContained.color; }
// public void color(int value) { wrapperContained.color = value; }
// public static int color() { return net.minecraft.particle.DustParticleEffect.color; }
// public static void color(int value, ) { net.minecraft.particle.DustParticleEffect.color = value; }

public DustParticleEffect(int color,float scale) { this.wrapperContained = new net.minecraft.particle.DustParticleEffect(color,scale); }
// public com.mojang.datafixers.kinds.App method_33115(Object instance) { return wrapperContained.method_33115(instance); }
// public static com.mojang.datafixers.kinds.App method_33115(Object instance, ) { return net.minecraft.particle.DustParticleEffect.method_33115(instance); }
public org.joml.Vector3f getColor() { return wrapperContained.getColor(); }
// public static org.joml.Vector3f getColor() { return net.minecraft.particle.DustParticleEffect.getColor(); }
// public java.lang.Integer method_65034(yarnwrap.particle.DustParticleEffect particle) { return wrapperContained.method_65034(particle.wrapperContained); }
// public static java.lang.Integer method_65034(yarnwrap.particle.DustParticleEffect particle, ) { return net.minecraft.particle.DustParticleEffect.method_65034(particle.wrapperContained); }
// public java.lang.Integer method_65035(yarnwrap.particle.DustParticleEffect particle) { return wrapperContained.method_65035(particle.wrapperContained); }
// public static java.lang.Integer method_65035(yarnwrap.particle.DustParticleEffect particle, ) { return net.minecraft.particle.DustParticleEffect.method_65035(particle.wrapperContained); }

}