package yarnwrap.particle;
public class DustParticleEffect { public net.minecraft.particle.DustParticleEffect wrapperContained; public DustParticleEffect(net.minecraft.particle.DustParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.particle.DustParticleEffect DEFAULT() { return new yarnwrap.particle.DustParticleEffect(wrapperContained.DEFAULT); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public org.joml.Vector3f RED() { return wrapperContained.RED; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public org.joml.Vector3f color() { return wrapperContained.color; }
public org.joml.Vector3f getColor() { return wrapperContained.getColor(); }

}