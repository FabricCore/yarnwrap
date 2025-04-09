package yarnwrap.network.packet.s2c.common;
public class CustomReportDetailsS2CPacket { public net.minecraft.network.packet.s2c.common.CustomReportDetailsS2CPacket wrapperContained; public CustomReportDetailsS2CPacket(net.minecraft.network.packet.s2c.common.CustomReportDetailsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int MAX_KEY_LENGTH() { return wrapperContained.MAX_KEY_LENGTH; }
// public int MAX_VALUE_LENGTH() { return wrapperContained.MAX_VALUE_LENGTH; }
// public int MAX_DETAILS_SIZE() { return wrapperContained.MAX_DETAILS_SIZE; }
// public yarnwrap.network.codec.PacketCodec DETAILS_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.DETAILS_CODEC); }

}