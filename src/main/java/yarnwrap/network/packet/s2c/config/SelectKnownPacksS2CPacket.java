package yarnwrap.network.packet.s2c.config;
public class SelectKnownPacksS2CPacket { public net.minecraft.network.packet.s2c.config.SelectKnownPacksS2CPacket wrapperContained; public SelectKnownPacksS2CPacket(net.minecraft.network.packet.s2c.config.SelectKnownPacksS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.config.SelectKnownPacksS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.config.SelectKnownPacksS2CPacket.CODEC = value.wrapperContained; }


}