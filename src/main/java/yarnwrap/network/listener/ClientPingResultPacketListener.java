package yarnwrap.network.listener;
public class ClientPingResultPacketListener { public net.minecraft.network.listener.ClientPingResultPacketListener wrapperContained; public ClientPingResultPacketListener(net.minecraft.network.listener.ClientPingResultPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onPingResult(yarnwrap.network.packet.s2c.query.PingResultS2CPacket packet) { wrapperContained.onPingResult(packet.wrapperContained); }
// public static void onPingResult(yarnwrap.network.packet.s2c.query.PingResultS2CPacket packet, ) { net.minecraft.network.listener.ClientPingResultPacketListener.onPingResult(packet.wrapperContained); }

}