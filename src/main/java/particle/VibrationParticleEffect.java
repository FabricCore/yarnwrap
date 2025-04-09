package yarnwrap.particle;
public class VibrationParticleEffect { public net.minecraft.particle.VibrationParticleEffect wrapperContained; public VibrationParticleEffect(net.minecraft.particle.VibrationParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.world.event.PositionSource destination() { return new yarnwrap.world.event.PositionSource(wrapperContained.destination); }
// public int arrivalInTicks() { return wrapperContained.arrivalInTicks; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public com.mojang.serialization.Codec POSITION_SOURCE_CODEC() { return wrapperContained.POSITION_SOURCE_CODEC; }
public yarnwrap.world.event.PositionSource getVibration() { return new yarnwrap.world.event.PositionSource(wrapperContained.getVibration()); }
public int getArrivalInTicks() { return wrapperContained.getArrivalInTicks(); }

}