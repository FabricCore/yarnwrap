package yarnwrap.world.event;
public class PositionSource { public net.minecraft.world.event.PositionSource wrapperContained; public PositionSource(net.minecraft.world.event.PositionSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.world.event.PositionSourceType getType() { return new yarnwrap.world.event.PositionSourceType(wrapperContained.getType()); }
public java.util.Optional getPos(yarnwrap.world.World world) { return wrapperContained.getPos(world.wrapperContained); }

}