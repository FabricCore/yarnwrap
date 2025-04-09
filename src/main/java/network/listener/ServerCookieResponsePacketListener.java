package yarnwrap.network.listener;
public class ServerCookieResponsePacketListener { public net.minecraft.network.listener.ServerCookieResponsePacketListener wrapperContained; public ServerCookieResponsePacketListener(net.minecraft.network.listener.ServerCookieResponsePacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onCookieResponse(yarnwrap.network.packet.c2s.common.CookieResponseC2SPacket packet) { wrapperContained.onCookieResponse(packet.wrapperContained); }

}