package yarnwrap.network.packet.s2c.login;
public class LoginSuccessS2CPacket { public net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket wrapperContained; public LoginSuccessS2CPacket(net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile(); }

}