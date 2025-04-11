package yarnwrap.network.listener;
public class ServerQueryPacketListener { public net.minecraft.network.listener.ServerQueryPacketListener wrapperContained; public ServerQueryPacketListener(net.minecraft.network.listener.ServerQueryPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onRequest(yarnwrap.network.packet.c2s.query.QueryRequestC2SPacket packet) { wrapperContained.onRequest(packet.wrapperContained); }

}