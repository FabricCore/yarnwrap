package yarnwrap.particle;
public class DustColorTransitionParticleEffect { public net.minecraft.particle.DustColorTransitionParticleEffect wrapperContained; public DustColorTransitionParticleEffect(net.minecraft.particle.DustColorTransitionParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public org.joml.Vector3f SCULK_BLUE() { return wrapperContained.SCULK_BLUE; }
public yarnwrap.particle.DustColorTransitionParticleEffect DEFAULT() { return new yarnwrap.particle.DustColorTransitionParticleEffect(wrapperContained.DEFAULT); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.joml.Vector3f toColor() { return wrapperContained.toColor; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public org.joml.Vector3f fromColor() { return wrapperContained.fromColor; }
public org.joml.Vector3f getFromColor() { return wrapperContained.getFromColor(); }
public org.joml.Vector3f getToColor() { return wrapperContained.getToColor(); }

}