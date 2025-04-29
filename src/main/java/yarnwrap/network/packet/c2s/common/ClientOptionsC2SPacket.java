package yarnwrap.network.packet.c2s.common;
public class ClientOptionsC2SPacket { public net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket wrapperContained; public ClientOptionsC2SPacket(net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.c2s.common.SyncedClientOptions options() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.options); }
// public void options(yarnwrap.network.packet.c2s.common.SyncedClientOptions value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.network.packet.c2s.common.SyncedClientOptions options() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket.options); }
// public static void options(yarnwrap.network.packet.c2s.common.SyncedClientOptions value, ) { net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket.options = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket.CODEC = value.wrapperContained; }

// public ClientOptionsC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket(buf.wrapperContained); }
// public yarnwrap.network.packet.c2s.common.SyncedClientOptions options() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.options()); }
// // public static yarnwrap.network.packet.c2s.common.SyncedClientOptions options() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket.options()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket.write(buf.wrapperContained); }

}