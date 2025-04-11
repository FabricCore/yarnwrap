package yarnwrap.network.packet.c2s.common;
public class CookieResponseC2SPacket { public net.minecraft.network.packet.c2s.common.CookieResponseC2SPacket wrapperContained; public CookieResponseC2SPacket(net.minecraft.network.packet.c2s.common.CookieResponseC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public CookieResponseC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.CookieResponseC2SPacket(buf.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}