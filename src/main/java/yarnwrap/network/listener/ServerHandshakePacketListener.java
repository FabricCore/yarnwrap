package yarnwrap.network.listener;
public class ServerHandshakePacketListener { public net.minecraft.network.listener.ServerHandshakePacketListener wrapperContained; public ServerHandshakePacketListener(net.minecraft.network.listener.ServerHandshakePacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onHandshake(yarnwrap.network.packet.c2s.handshake.HandshakeC2SPacket packet) { wrapperContained.onHandshake(packet.wrapperContained); }
// public static void onHandshake(yarnwrap.network.packet.c2s.handshake.HandshakeC2SPacket packet, ) { net.minecraft.network.listener.ServerHandshakePacketListener.onHandshake(packet.wrapperContained); }

}