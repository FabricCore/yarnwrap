package yarnwrap.network.packet.s2c.login;
public class LoginDisconnectS2CPacket { public net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket wrapperContained; public LoginDisconnectS2CPacket(net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text reason() { return new yarnwrap.text.Text(wrapperContained.reason); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.text.Text getReason() { return new yarnwrap.text.Text(wrapperContained.getReason()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}