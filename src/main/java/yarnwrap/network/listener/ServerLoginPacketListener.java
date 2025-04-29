package yarnwrap.network.listener;
public class ServerLoginPacketListener { public net.minecraft.network.listener.ServerLoginPacketListener wrapperContained; public ServerLoginPacketListener(net.minecraft.network.listener.ServerLoginPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onQueryResponse(yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket packet) { wrapperContained.onQueryResponse(packet.wrapperContained); }
// public static void onQueryResponse(yarnwrap.network.packet.c2s.login.LoginQueryResponseC2SPacket packet, ) { net.minecraft.network.listener.ServerLoginPacketListener.onQueryResponse(packet.wrapperContained); }
public void onHello(yarnwrap.network.packet.c2s.login.LoginHelloC2SPacket packet) { wrapperContained.onHello(packet.wrapperContained); }
// public static void onHello(yarnwrap.network.packet.c2s.login.LoginHelloC2SPacket packet, ) { net.minecraft.network.listener.ServerLoginPacketListener.onHello(packet.wrapperContained); }
public void onKey(yarnwrap.network.packet.c2s.login.LoginKeyC2SPacket packet) { wrapperContained.onKey(packet.wrapperContained); }
// public static void onKey(yarnwrap.network.packet.c2s.login.LoginKeyC2SPacket packet, ) { net.minecraft.network.listener.ServerLoginPacketListener.onKey(packet.wrapperContained); }
public void onEnterConfiguration(yarnwrap.network.packet.c2s.login.EnterConfigurationC2SPacket packet) { wrapperContained.onEnterConfiguration(packet.wrapperContained); }
// public static void onEnterConfiguration(yarnwrap.network.packet.c2s.login.EnterConfigurationC2SPacket packet, ) { net.minecraft.network.listener.ServerLoginPacketListener.onEnterConfiguration(packet.wrapperContained); }

}