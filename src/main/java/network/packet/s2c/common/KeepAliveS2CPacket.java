package yarnwrap.network.packet.s2c.common;
public class KeepAliveS2CPacket { public net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket wrapperContained; public KeepAliveS2CPacket(net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long id() { return wrapperContained.id; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public long getId() { return wrapperContained.getId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}