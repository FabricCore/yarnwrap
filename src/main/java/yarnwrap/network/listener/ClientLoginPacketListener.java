package yarnwrap.network.listener;
public class ClientLoginPacketListener { public net.minecraft.network.listener.ClientLoginPacketListener wrapperContained; public ClientLoginPacketListener(net.minecraft.network.listener.ClientLoginPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onDisconnect(yarnwrap.network.packet.s2c.login.LoginDisconnectS2CPacket packet) { wrapperContained.onDisconnect(packet.wrapperContained); }
public void onCompression(yarnwrap.network.packet.s2c.login.LoginCompressionS2CPacket packet) { wrapperContained.onCompression(packet.wrapperContained); }
public void onQueryRequest(yarnwrap.network.packet.s2c.login.LoginQueryRequestS2CPacket packet) { wrapperContained.onQueryRequest(packet.wrapperContained); }
public void onHello(yarnwrap.network.packet.s2c.login.LoginHelloS2CPacket packet) { wrapperContained.onHello(packet.wrapperContained); }
public void onSuccess(yarnwrap.network.packet.s2c.login.LoginSuccessS2CPacket packet) { wrapperContained.onSuccess(packet.wrapperContained); }

}