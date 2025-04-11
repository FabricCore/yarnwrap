package yarnwrap.network.packet.s2c.common;
public class KeepAliveS2CPacket { public net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket wrapperContained; public KeepAliveS2CPacket(net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long id() { return wrapperContained.id; }
// public void id(long value) { wrapperContained.id = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public KeepAliveS2CPacket(long id) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket(id); }
// public KeepAliveS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket(buf.wrapperContained); }
public long getId() { return wrapperContained.getId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}