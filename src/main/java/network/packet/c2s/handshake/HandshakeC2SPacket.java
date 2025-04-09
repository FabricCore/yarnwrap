package yarnwrap.network.packet.c2s.handshake;
public class HandshakeC2SPacket { public net.minecraft.network.packet.c2s.handshake.HandshakeC2SPacket wrapperContained; public HandshakeC2SPacket(net.minecraft.network.packet.c2s.handshake.HandshakeC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int protocolVersion() { return wrapperContained.protocolVersion; }
// public java.lang.String address() { return wrapperContained.address; }
// public int port() { return wrapperContained.port; }
// public yarnwrap.network.packet.c2s.handshake.ConnectionIntent intendedState() { return new yarnwrap.network.packet.c2s.handshake.ConnectionIntent(wrapperContained.intendedState); }
// public int MAX_ADDRESS_LENGTH() { return wrapperContained.MAX_ADDRESS_LENGTH; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public int protocolVersion() { return wrapperContained.protocolVersion(); }
// public java.lang.String address() { return wrapperContained.address(); }
// public int port() { return wrapperContained.port(); }
// public yarnwrap.network.packet.c2s.handshake.ConnectionIntent intendedState() { return new yarnwrap.network.packet.c2s.handshake.ConnectionIntent(wrapperContained.intendedState()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}