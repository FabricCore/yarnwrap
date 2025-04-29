package yarnwrap.network.packet.s2c.common;
public class CookieRequestS2CPacket { public net.minecraft.network.packet.s2c.common.CookieRequestS2CPacket wrapperContained; public CookieRequestS2CPacket(net.minecraft.network.packet.s2c.common.CookieRequestS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.common.CookieRequestS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.common.CookieRequestS2CPacket.CODEC = value.wrapperContained; }

// public CookieRequestS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.CookieRequestS2CPacket(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.common.CookieRequestS2CPacket.write(buf.wrapperContained); }

}