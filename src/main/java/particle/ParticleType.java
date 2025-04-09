package yarnwrap.particle;
public class ParticleType { public net.minecraft.particle.ParticleType wrapperContained; public ParticleType(net.minecraft.particle.ParticleType wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean alwaysShow() { return wrapperContained.alwaysShow; }
public boolean shouldAlwaysSpawn() { return wrapperContained.shouldAlwaysSpawn(); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }

}