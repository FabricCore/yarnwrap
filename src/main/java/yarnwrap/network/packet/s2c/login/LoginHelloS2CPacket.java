package yarnwrap.network.packet.s2c.login;
public class LoginHelloS2CPacket { public net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket wrapperContained; public LoginHelloS2CPacket(net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String serverId() { return wrapperContained.serverId; }
// public void serverId(java.lang.String value) { wrapperContained.serverId = value; }
// public byte[] nonce() { return wrapperContained.nonce; }
// public void nonce(byte[] value) { wrapperContained.nonce = value; }
// public byte[] publicKey() { return wrapperContained.publicKey; }
// public void publicKey(byte[] value) { wrapperContained.publicKey = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public boolean needsAuthentication() { return wrapperContained.needsAuthentication; }
// public void needsAuthentication(boolean value) { wrapperContained.needsAuthentication = value; }
public java.lang.String getServerId() { return wrapperContained.getServerId(); }
// public java.security.PublicKey getPublicKey() { return wrapperContained.getPublicKey(); }
public byte[] getNonce() { return wrapperContained.getNonce(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public boolean needsAuthentication() { return wrapperContained.needsAuthentication(); }

}