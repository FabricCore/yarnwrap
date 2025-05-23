package yarnwrap.network.packet.s2c.login;
public class LoginDisconnectS2CPacket { public net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket wrapperContained; public LoginDisconnectS2CPacket(net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text reason() { return new yarnwrap.text.Text(wrapperContained.reason); }
// public void reason(yarnwrap.text.Text value) { wrapperContained.reason = value.wrapperContained; }
// public static yarnwrap.text.Text reason() { return new yarnwrap.text.Text(net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket.reason); }
// public static void reason(yarnwrap.text.Text value, ) { net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket.reason = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket.CODEC = value.wrapperContained; }

// public yarnwrap.registry.RegistryOps OPS() { return new yarnwrap.registry.RegistryOps(wrapperContained.OPS); }
// public void OPS(yarnwrap.registry.RegistryOps value) { wrapperContained.OPS = value.wrapperContained; }
// public static yarnwrap.registry.RegistryOps OPS() { return new yarnwrap.registry.RegistryOps(net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket.OPS); }
// public static void OPS(yarnwrap.registry.RegistryOps value, ) { net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket.OPS = value.wrapperContained; }

// // public yarnwrap.text.Text reason() { return new yarnwrap.text.Text(wrapperContained.reason()); }
// // public static yarnwrap.text.Text reason() { return new yarnwrap.text.Text(net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket.reason()); }

}