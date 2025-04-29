package yarnwrap.network.packet.s2c.login;
public class LoginSuccessS2CPacket { public net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket wrapperContained; public LoginSuccessS2CPacket(net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
// public static com.mojang.authlib.GameProfile profile() { return net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket.profile; }
// public static void profile(com.mojang.authlib.GameProfile value, ) { net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket.profile = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket.CODEC = value.wrapperContained; }

// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile(); }
// // public static com.mojang.authlib.GameProfile profile() { return net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket.profile(); }

}