package yarnwrap.particle;
public class VibrationParticleEffect { public net.minecraft.particle.VibrationParticleEffect wrapperContained; public VibrationParticleEffect(net.minecraft.particle.VibrationParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.world.event.PositionSource destination() { return new yarnwrap.world.event.PositionSource(wrapperContained.destination); }
// public void destination(yarnwrap.world.event.PositionSource value) { wrapperContained.destination = value.wrapperContained; }
// public int arrivalInTicks() { return wrapperContained.arrivalInTicks; }
// public void arrivalInTicks(int value) { wrapperContained.arrivalInTicks = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public com.mojang.serialization.Codec POSITION_SOURCE_CODEC() { return wrapperContained.POSITION_SOURCE_CODEC; }
// public void POSITION_SOURCE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.POSITION_SOURCE_CODEC = value; }
public yarnwrap.world.event.PositionSource getVibration() { return new yarnwrap.world.event.PositionSource(wrapperContained.getVibration()); }
public int getArrivalInTicks() { return wrapperContained.getArrivalInTicks(); }

}