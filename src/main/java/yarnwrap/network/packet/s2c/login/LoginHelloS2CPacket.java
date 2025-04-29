package yarnwrap.network.packet.s2c.login;
public class LoginHelloS2CPacket { public net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket wrapperContained; public LoginHelloS2CPacket(net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String serverId() { return wrapperContained.serverId; }
// public void serverId(java.lang.String value) { wrapperContained.serverId = value; }
// public static java.lang.String serverId() { return net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.serverId; }
// public static void serverId(java.lang.String value, ) { net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.serverId = value; }

// public byte[] nonce() { return wrapperContained.nonce; }
// public void nonce(byte[] value) { wrapperContained.nonce = value; }
// public static byte[] nonce() { return net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.nonce; }
// public static void nonce(byte[] value, ) { net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.nonce = value; }

// public byte[] publicKey() { return wrapperContained.publicKey; }
// public void publicKey(byte[] value) { wrapperContained.publicKey = value; }
// public static byte[] publicKey() { return net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.publicKey; }
// public static void publicKey(byte[] value, ) { net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.publicKey = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.CODEC = value.wrapperContained; }

// public boolean needsAuthentication() { return wrapperContained.needsAuthentication; }
// public void needsAuthentication(boolean value) { wrapperContained.needsAuthentication = value; }
// public static boolean needsAuthentication() { return net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.needsAuthentication; }
// public static void needsAuthentication(boolean value, ) { net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.needsAuthentication = value; }

// public LoginHelloS2CPacket(java.lang.String serverId,byte publicKey,byte nonce,boolean needsAuthentication) { this.wrapperContained = new net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket(serverId,publicKey,nonce,needsAuthentication); }
// public LoginHelloS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket(buf.wrapperContained); }
public java.lang.String getServerId() { return wrapperContained.getServerId(); }
// public static java.lang.String getServerId() { return net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.getServerId(); }
// public java.security.PublicKey getPublicKey() { return wrapperContained.getPublicKey(); }
// public static java.security.PublicKey getPublicKey() { return net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.getPublicKey(); }
public byte[] getNonce() { return wrapperContained.getNonce(); }
// public static byte[] getNonce() { return net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.getNonce(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.write(buf.wrapperContained); }
// public boolean needsAuthentication() { return wrapperContained.needsAuthentication(); }
// // public static boolean needsAuthentication() { return net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket.needsAuthentication(); }

}