package yarnwrap.world.event;
public class PositionSourceType { public net.minecraft.world.event.PositionSourceType wrapperContained; public PositionSourceType(net.minecraft.world.event.PositionSourceType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.event.PositionSourceType.getCodec(); }
// public yarnwrap.world.event.PositionSourceType register(java.lang.String id,yarnwrap.world.event.PositionSourceType positionSourceType) { return new yarnwrap.world.event.PositionSourceType(wrapperContained.register(id,positionSourceType.wrapperContained)); }
// public static yarnwrap.world.event.PositionSourceType register(java.lang.String id,yarnwrap.world.event.PositionSourceType positionSourceType, ) { return new yarnwrap.world.event.PositionSourceType(net.minecraft.world.event.PositionSourceType.register(id,positionSourceType.wrapperContained)); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }
// public static yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.world.event.PositionSourceType.getPacketCodec()); }

}