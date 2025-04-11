package yarnwrap.network.packet.c2s.login;
public class LoginQueryResponsePayload { public net.minecraft.network.packet.c2s.login.LoginQueryResponsePayload wrapperContained; public LoginQueryResponsePayload(net.minecraft.network.packet.c2s.login.LoginQueryResponsePayload wrapperContained) { this.wrapperContained = wrapperContained; }

public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}