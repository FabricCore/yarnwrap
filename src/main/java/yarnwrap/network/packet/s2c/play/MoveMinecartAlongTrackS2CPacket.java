package yarnwrap.network.packet.s2c.play;
public class MoveMinecartAlongTrackS2CPacket { public net.minecraft.network.packet.s2c.play.MoveMinecartAlongTrackS2CPacket wrapperContained; public MoveMinecartAlongTrackS2CPacket(net.minecraft.network.packet.s2c.play.MoveMinecartAlongTrackS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.MoveMinecartAlongTrackS2CPacket.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.MoveMinecartAlongTrackS2CPacket.PACKET_CODEC = value.wrapperContained; }

public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
// public static yarnwrap.entity.Entity getEntity(yarnwrap.world.World world, ) { return new yarnwrap.entity.Entity(net.minecraft.network.packet.s2c.play.MoveMinecartAlongTrackS2CPacket.getEntity(world.wrapperContained)); }

}