package yarnwrap.network.listener;
public class ClientCookieRequestPacketListener { public net.minecraft.network.listener.ClientCookieRequestPacketListener wrapperContained; public ClientCookieRequestPacketListener(net.minecraft.network.listener.ClientCookieRequestPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onCookieRequest(yarnwrap.network.packet.s2c.common.CookieRequestS2CPacket packet) { wrapperContained.onCookieRequest(packet.wrapperContained); }

}