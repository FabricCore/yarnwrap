package yarnwrap.particle;
public class DustParticleEffect { public net.minecraft.particle.DustParticleEffect wrapperContained; public DustParticleEffect(net.minecraft.particle.DustParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.particle.DustParticleEffect DEFAULT() { return new yarnwrap.particle.DustParticleEffect(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.particle.DustParticleEffect value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public org.joml.Vector3f RED() { return wrapperContained.RED; }
// public void RED(org.joml.Vector3f value) { wrapperContained.RED = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public org.joml.Vector3f color() { return wrapperContained.color; }
// public void color(org.joml.Vector3f value) { wrapperContained.color = value; }
public DustParticleEffect(org.joml.Vector3f color,float scale) { this.wrapperContained = new net.minecraft.particle.DustParticleEffect(color,scale); }
// public com.mojang.datafixers.kinds.App method_33115(Object instance) { return wrapperContained.method_33115(instance); }
// public org.joml.Vector3f method_33117(yarnwrap.particle.DustParticleEffect effect) { return wrapperContained.method_33117(effect.wrapperContained); }
// public org.joml.Vector3f method_56175(yarnwrap.particle.DustParticleEffect effect) { return wrapperContained.method_56175(effect.wrapperContained); }
public org.joml.Vector3f getColor() { return wrapperContained.getColor(); }

}