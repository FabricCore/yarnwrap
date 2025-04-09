package yarnwrap.network.packet.c2s.common;
public class ClientOptionsC2SPacket { public net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket wrapperContained; public ClientOptionsC2SPacket(net.minecraft.network.packet.c2s.common.ClientOptionsC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.c2s.common.SyncedClientOptions options() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.options); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public yarnwrap.network.packet.c2s.common.SyncedClientOptions options() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.options()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}