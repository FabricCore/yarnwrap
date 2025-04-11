package yarnwrap.particle;
public class ParticleType { public net.minecraft.particle.ParticleType wrapperContained; public ParticleType(net.minecraft.particle.ParticleType wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean alwaysShow() { return wrapperContained.alwaysShow; }
// public void alwaysShow(boolean value) { wrapperContained.alwaysShow = value; }
// public ParticleType(boolean alwaysShow) { this.wrapperContained = new net.minecraft.particle.ParticleType(alwaysShow); }
public boolean shouldAlwaysSpawn() { return wrapperContained.shouldAlwaysSpawn(); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }

}