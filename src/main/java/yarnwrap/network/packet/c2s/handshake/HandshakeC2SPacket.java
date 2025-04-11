package yarnwrap.network.packet.c2s.handshake;
public class HandshakeC2SPacket { public net.minecraft.network.packet.c2s.handshake.HandshakeC2SPacket wrapperContained; public HandshakeC2SPacket(net.minecraft.network.packet.c2s.handshake.HandshakeC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int protocolVersion() { return wrapperContained.protocolVersion; }
// public void protocolVersion(int value) { wrapperContained.protocolVersion = value; }
// public java.lang.String address() { return wrapperContained.address; }
// public void address(java.lang.String value) { wrapperContained.address = value; }
// public int port() { return wrapperContained.port; }
// public void port(int value) { wrapperContained.port = value; }
// public yarnwrap.network.packet.c2s.handshake.ConnectionIntent intendedState() { return new yarnwrap.network.packet.c2s.handshake.ConnectionIntent(wrapperContained.intendedState); }
// public void intendedState(yarnwrap.network.packet.c2s.handshake.ConnectionIntent value) { wrapperContained.intendedState = value.wrapperContained; }
// public int MAX_ADDRESS_LENGTH() { return wrapperContained.MAX_ADDRESS_LENGTH; }
// public void MAX_ADDRESS_LENGTH(int value) { wrapperContained.MAX_ADDRESS_LENGTH = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public HandshakeC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.handshake.HandshakeC2SPacket(buf.wrapperContained); }
// public int protocolVersion() { return wrapperContained.protocolVersion(); }
// public java.lang.String address() { return wrapperContained.address(); }
// public int port() { return wrapperContained.port(); }
// public yarnwrap.network.packet.c2s.handshake.ConnectionIntent intendedState() { return new yarnwrap.network.packet.c2s.handshake.ConnectionIntent(wrapperContained.intendedState()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}