package yarnwrap.network.listener;
public class ServerQueryPingPacketListener { public net.minecraft.network.listener.ServerQueryPingPacketListener wrapperContained; public ServerQueryPingPacketListener(net.minecraft.network.listener.ServerQueryPingPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onQueryPing(yarnwrap.network.packet.c2s.query.QueryPingC2SPacket packet) { wrapperContained.onQueryPing(packet.wrapperContained); }

}