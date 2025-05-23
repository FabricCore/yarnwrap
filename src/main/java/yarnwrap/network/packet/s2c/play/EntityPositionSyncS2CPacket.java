package yarnwrap.network.packet.s2c.play;
public class EntityPositionSyncS2CPacket { public net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket wrapperContained; public EntityPositionSyncS2CPacket(net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket.CODEC = value.wrapperContained; }

// public yarnwrap.network.packet.s2c.play.EntityPositionSyncS2CPacket create(yarnwrap.entity.Entity entity) { return new yarnwrap.network.packet.s2c.play.EntityPositionSyncS2CPacket(wrapperContained.create(entity.wrapperContained)); }
// public static yarnwrap.network.packet.s2c.play.EntityPositionSyncS2CPacket create(yarnwrap.entity.Entity entity, ) { return new yarnwrap.network.packet.s2c.play.EntityPositionSyncS2CPacket(net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket.create(entity.wrapperContained)); }

}