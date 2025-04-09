package yarnwrap.network.packet.s2c.login;
public class LoginCompressionS2CPacket { public net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket wrapperContained; public LoginCompressionS2CPacket(net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int compressionThreshold() { return wrapperContained.compressionThreshold; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getCompressionThreshold() { return wrapperContained.getCompressionThreshold(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}