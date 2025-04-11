package yarnwrap.network.packet.s2c.login;
public class LoginQueryRequestPayload { public net.minecraft.network.packet.s2c.login.LoginQueryRequestPayload wrapperContained; public LoginQueryRequestPayload(net.minecraft.network.packet.s2c.login.LoginQueryRequestPayload wrapperContained) { this.wrapperContained = wrapperContained; }

public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}