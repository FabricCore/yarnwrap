package yarnwrap.network.packet.s2c.common;
public class StoreCookieS2CPacket { public net.minecraft.network.packet.s2c.common.StoreCookieS2CPacket wrapperContained; public StoreCookieS2CPacket(net.minecraft.network.packet.s2c.common.StoreCookieS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int MAX_COOKIE_LENGTH() { return wrapperContained.MAX_COOKIE_LENGTH; }
public yarnwrap.network.codec.PacketCodec COOKIE_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.COOKIE_PACKET_CODEC); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}