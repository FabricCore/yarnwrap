package yarnwrap.network.packet.s2c.login;
public class LoginCompressionS2CPacket { public net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket wrapperContained; public LoginCompressionS2CPacket(net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int compressionThreshold() { return wrapperContained.compressionThreshold; }
// public void compressionThreshold(int value) { wrapperContained.compressionThreshold = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public int getCompressionThreshold() { return wrapperContained.getCompressionThreshold(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}