package yarnwrap.network.packet.s2c.login;
public class LoginHelloS2CPacket { public net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket wrapperContained; public LoginHelloS2CPacket(net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String serverId() { return wrapperContained.serverId; }
// public byte[] nonce() { return wrapperContained.nonce; }
// public byte[] publicKey() { return wrapperContained.publicKey; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public boolean needsAuthentication() { return wrapperContained.needsAuthentication; }
public java.lang.String getServerId() { return wrapperContained.getServerId(); }
// public java.security.PublicKey getPublicKey() { return wrapperContained.getPublicKey(); }
public byte[] getNonce() { return wrapperContained.getNonce(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public boolean needsAuthentication() { return wrapperContained.needsAuthentication(); }

}