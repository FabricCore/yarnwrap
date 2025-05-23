package yarnwrap.network.packet.s2c.play;
public class PlayerPositionLookS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket wrapperContained; public PlayerPositionLookS2CPacket(net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int teleportId() { return wrapperContained.teleportId; }
// public void teleportId(int value) { wrapperContained.teleportId = value; }
// public static int teleportId() { return net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket.teleportId; }
// public static void teleportId(int value, ) { net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket.teleportId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket.CODEC = value.wrapperContained; }

// public int teleportId() { return wrapperContained.teleportId(); }
// // public static int teleportId() { return net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket.teleportId(); }
// public yarnwrap.network.packet.s2c.play.PlayerPositionLookS2CPacket of(int teleportId,yarnwrap.entity.player.PlayerPosition pos,java.util.Set flags) { return new yarnwrap.network.packet.s2c.play.PlayerPositionLookS2CPacket(wrapperContained.of(teleportId,pos.wrapperContained,flags)); }
// public static yarnwrap.network.packet.s2c.play.PlayerPositionLookS2CPacket of(int teleportId,yarnwrap.entity.player.PlayerPosition pos,java.util.Set flags, ) { return new yarnwrap.network.packet.s2c.play.PlayerPositionLookS2CPacket(net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket.of(teleportId,pos.wrapperContained,flags)); }

}