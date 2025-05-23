package yarnwrap.network.packet.s2c.play;
public class CraftFailedResponseS2CPacket { public net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket wrapperContained; public CraftFailedResponseS2CPacket(net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.syncId = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.CODEC = value.wrapperContained; }

// public int syncId() { return wrapperContained.syncId(); }
// // public static int syncId() { return net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket.syncId(); }

}