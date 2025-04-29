package yarnwrap.network.packet.c2s.common;
public class KeepAliveC2SPacket { public net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket wrapperContained; public KeepAliveC2SPacket(net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public long id() { return wrapperContained.id; }
// public void id(long value) { wrapperContained.id = value; }
// public static long id() { return net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket.id; }
// public static void id(long value, ) { net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket.id = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket.CODEC = value.wrapperContained; }

public KeepAliveC2SPacket(long id) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket(id); }
// public KeepAliveC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket(buf.wrapperContained); }
public long getId() { return wrapperContained.getId(); }
// public static long getId() { return net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket.getId(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket.write(buf.wrapperContained); }

}