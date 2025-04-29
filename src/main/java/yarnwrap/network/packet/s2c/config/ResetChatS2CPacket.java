package yarnwrap.network.packet.s2c.config;
public class ResetChatS2CPacket { public net.minecraft.network.packet.s2c.config.ResetChatS2CPacket wrapperContained; public ResetChatS2CPacket(net.minecraft.network.packet.s2c.config.ResetChatS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.s2c.config.ResetChatS2CPacket INSTANCE() { return new yarnwrap.network.packet.s2c.config.ResetChatS2CPacket(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.network.packet.s2c.config.ResetChatS2CPacket value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.network.packet.s2c.config.ResetChatS2CPacket INSTANCE() { return new yarnwrap.network.packet.s2c.config.ResetChatS2CPacket(net.minecraft.network.packet.s2c.config.ResetChatS2CPacket.INSTANCE); }
// public static void INSTANCE(yarnwrap.network.packet.s2c.config.ResetChatS2CPacket value, ) { net.minecraft.network.packet.s2c.config.ResetChatS2CPacket.INSTANCE = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.config.ResetChatS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.config.ResetChatS2CPacket.CODEC = value.wrapperContained; }


}