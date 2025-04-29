package yarnwrap.network.packet.s2c.login;
public class LoginCompressionS2CPacket { public net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket wrapperContained; public LoginCompressionS2CPacket(net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int compressionThreshold() { return wrapperContained.compressionThreshold; }
// public void compressionThreshold(int value) { wrapperContained.compressionThreshold = value; }
// public static int compressionThreshold() { return net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket.compressionThreshold; }
// public static void compressionThreshold(int value, ) { net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket.compressionThreshold = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket.CODEC = value.wrapperContained; }

public LoginCompressionS2CPacket(int compressionThreshold) { this.wrapperContained = new net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket(compressionThreshold); }
// public LoginCompressionS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket(buf.wrapperContained); }
public int getCompressionThreshold() { return wrapperContained.getCompressionThreshold(); }
// public static int getCompressionThreshold() { return net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket.getCompressionThreshold(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket.write(buf.wrapperContained); }

}