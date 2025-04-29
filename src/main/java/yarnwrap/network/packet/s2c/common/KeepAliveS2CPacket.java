package yarnwrap.network.packet.s2c.common;
public class KeepAliveS2CPacket { public net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket wrapperContained; public KeepAliveS2CPacket(net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long id() { return wrapperContained.id; }
// public void id(long value) { wrapperContained.id = value; }
// public static long id() { return net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket.id; }
// public static void id(long value, ) { net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket.id = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket.CODEC = value.wrapperContained; }

public KeepAliveS2CPacket(long id) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket(id); }
// public KeepAliveS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket(buf.wrapperContained); }
public long getId() { return wrapperContained.getId(); }
// public static long getId() { return net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket.getId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket.write(buf.wrapperContained); }

}