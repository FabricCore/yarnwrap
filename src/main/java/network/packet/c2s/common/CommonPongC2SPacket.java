package yarnwrap.network.packet.c2s.common;
public class CommonPongC2SPacket { public net.minecraft.network.packet.c2s.common.CommonPongC2SPacket wrapperContained; public CommonPongC2SPacket(net.minecraft.network.packet.c2s.common.CommonPongC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int parameter() { return wrapperContained.parameter; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getParameter() { return wrapperContained.getParameter(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}