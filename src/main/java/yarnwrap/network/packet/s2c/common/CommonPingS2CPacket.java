package yarnwrap.network.packet.s2c.common;
public class CommonPingS2CPacket { public net.minecraft.network.packet.s2c.common.CommonPingS2CPacket wrapperContained; public CommonPingS2CPacket(net.minecraft.network.packet.s2c.common.CommonPingS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int parameter() { return wrapperContained.parameter; }
// public void parameter(int value) { wrapperContained.parameter = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public CommonPingS2CPacket(int parameter) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.CommonPingS2CPacket(parameter); }
// public CommonPingS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.CommonPingS2CPacket(buf.wrapperContained); }
public int getParameter() { return wrapperContained.getParameter(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}