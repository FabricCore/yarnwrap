package yarnwrap.network.packet.s2c.common;
public class ServerTransferS2CPacket { public net.minecraft.network.packet.s2c.common.ServerTransferS2CPacket wrapperContained; public ServerTransferS2CPacket(net.minecraft.network.packet.s2c.common.ServerTransferS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}