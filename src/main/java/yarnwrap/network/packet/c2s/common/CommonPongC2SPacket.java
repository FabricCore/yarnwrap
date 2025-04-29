package yarnwrap.network.packet.c2s.common;
public class CommonPongC2SPacket { public net.minecraft.network.packet.c2s.common.CommonPongC2SPacket wrapperContained; public CommonPongC2SPacket(net.minecraft.network.packet.c2s.common.CommonPongC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int parameter() { return wrapperContained.parameter; }
// public void parameter(int value) { wrapperContained.parameter = value; }
// public static int parameter() { return net.minecraft.network.packet.c2s.common.CommonPongC2SPacket.parameter; }
// public static void parameter(int value, ) { net.minecraft.network.packet.c2s.common.CommonPongC2SPacket.parameter = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.common.CommonPongC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.common.CommonPongC2SPacket.CODEC = value.wrapperContained; }

public CommonPongC2SPacket(int parameter) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.CommonPongC2SPacket(parameter); }
// public CommonPongC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.CommonPongC2SPacket(buf.wrapperContained); }
public int getParameter() { return wrapperContained.getParameter(); }
// public static int getParameter() { return net.minecraft.network.packet.c2s.common.CommonPongC2SPacket.getParameter(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.common.CommonPongC2SPacket.write(buf.wrapperContained); }

}