package yarnwrap.world.event;
public class PositionSourceType { public net.minecraft.world.event.PositionSourceType wrapperContained; public PositionSourceType(net.minecraft.world.event.PositionSourceType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public yarnwrap.world.event.PositionSourceType register(java.lang.String id,yarnwrap.world.event.PositionSourceType positionSourceType) { return new yarnwrap.world.event.PositionSourceType(wrapperContained.register(id,positionSourceType.wrapperContained)); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }

}