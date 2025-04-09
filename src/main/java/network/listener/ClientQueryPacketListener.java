package yarnwrap.network.listener;
public class ClientQueryPacketListener { public net.minecraft.network.listener.ClientQueryPacketListener wrapperContained; public ClientQueryPacketListener(net.minecraft.network.listener.ClientQueryPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onResponse(yarnwrap.network.packet.s2c.query.QueryResponseS2CPacket packet) { wrapperContained.onResponse(packet.wrapperContained); }

}