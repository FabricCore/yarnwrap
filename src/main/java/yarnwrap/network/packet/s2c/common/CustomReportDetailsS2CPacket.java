package yarnwrap.network.packet.s2c.common;
public class CustomReportDetailsS2CPacket { public net.minecraft.network.packet.s2c.common.CustomReportDetailsS2CPacket wrapperContained; public CustomReportDetailsS2CPacket(net.minecraft.network.packet.s2c.common.CustomReportDetailsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public int MAX_KEY_LENGTH() { return wrapperContained.MAX_KEY_LENGTH; }
// public void MAX_KEY_LENGTH(int value) { wrapperContained.MAX_KEY_LENGTH = value; }
// public int MAX_VALUE_LENGTH() { return wrapperContained.MAX_VALUE_LENGTH; }
// public void MAX_VALUE_LENGTH(int value) { wrapperContained.MAX_VALUE_LENGTH = value; }
// public int MAX_DETAILS_SIZE() { return wrapperContained.MAX_DETAILS_SIZE; }
// public void MAX_DETAILS_SIZE(int value) { wrapperContained.MAX_DETAILS_SIZE = value; }
// public yarnwrap.network.codec.PacketCodec DETAILS_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.DETAILS_CODEC); }
// public void DETAILS_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.DETAILS_CODEC = value.wrapperContained; }

}