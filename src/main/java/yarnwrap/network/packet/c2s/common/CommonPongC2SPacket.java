package yarnwrap.network.packet.c2s.common;
public class CommonPongC2SPacket { public net.minecraft.network.packet.c2s.common.CommonPongC2SPacket wrapperContained; public CommonPongC2SPacket(net.minecraft.network.packet.c2s.common.CommonPongC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int parameter() { return wrapperContained.parameter; }
// public void parameter(int value) { wrapperContained.parameter = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getParameter() { return wrapperContained.getParameter(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}