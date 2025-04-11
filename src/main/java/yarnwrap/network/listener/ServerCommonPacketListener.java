package yarnwrap.network.listener;
public class ServerCommonPacketListener { public net.minecraft.network.listener.ServerCommonPacketListener wrapperContained; public ServerCommonPacketListener(net.minecraft.network.listener.ServerCommonPacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onClientOptions(yarnwrap.network.packet.c2s.common.ClientOptionsC2SPacket packet) { wrapperContained.onClientOptions(packet.wrapperContained); }
public void onCustomPayload(yarnwrap.network.packet.c2s.common.CustomPayloadC2SPacket packet) { wrapperContained.onCustomPayload(packet.wrapperContained); }
public void onKeepAlive(yarnwrap.network.packet.c2s.common.KeepAliveC2SPacket packet) { wrapperContained.onKeepAlive(packet.wrapperContained); }
public void onPong(yarnwrap.network.packet.c2s.common.CommonPongC2SPacket packet) { wrapperContained.onPong(packet.wrapperContained); }
public void onResourcePackStatus(yarnwrap.network.packet.c2s.common.ResourcePackStatusC2SPacket packet) { wrapperContained.onResourcePackStatus(packet.wrapperContained); }

}