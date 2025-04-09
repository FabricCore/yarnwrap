package yarnwrap.network;
public class ClientConnection { public net.minecraft.network.ClientConnection wrapperContained; public ClientConnection(net.minecraft.network.ClientConnection wrapperContained) { this.wrapperContained = wrapperContained; }

public org.slf4j.Marker NETWORK_PACKETS_MARKER() { return wrapperContained.NETWORK_PACKETS_MARKER; }
// public boolean errored() { return wrapperContained.errored; }
public org.slf4j.Marker NETWORK_MARKER() { return wrapperContained.NETWORK_MARKER; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side); }
// public java.net.SocketAddress address() { return wrapperContained.address; }
// public boolean disconnected() { return wrapperContained.disconnected; }
// public boolean encrypted() { return wrapperContained.encrypted; }
public java.util.function.Supplier LOCAL_CLIENT_IO_GROUP() { return wrapperContained.LOCAL_CLIENT_IO_GROUP; }
public java.util.function.Supplier CLIENT_IO_GROUP() { return wrapperContained.CLIENT_IO_GROUP; }
// public io.netty.channel.Channel channel() { return wrapperContained.channel; }
// public yarnwrap.network.listener.PacketListener packetListener() { return new yarnwrap.network.listener.PacketListener(wrapperContained.packetListener); }
// public float averagePacketsSent() { return wrapperContained.averagePacketsSent; }
// public float averagePacketsReceived() { return wrapperContained.averagePacketsReceived; }
// public int ticks() { return wrapperContained.ticks; }
// public int packetsSentCounter() { return wrapperContained.packetsSentCounter; }
public java.util.function.Supplier EPOLL_CLIENT_IO_GROUP() { return wrapperContained.EPOLL_CLIENT_IO_GROUP; }
// public int packetsReceivedCounter() { return wrapperContained.packetsReceivedCounter; }
// public float CURRENT_PACKET_COUNTER_WEIGHT() { return wrapperContained.CURRENT_PACKET_COUNTER_WEIGHT; }
public org.slf4j.Marker PACKET_RECEIVED_MARKER() { return wrapperContained.PACKET_RECEIVED_MARKER; }
public org.slf4j.Marker PACKET_SENT_MARKER() { return wrapperContained.PACKET_SENT_MARKER; }
// public yarnwrap.network.DisconnectionInfo pendingDisconnectionInfo() { return new yarnwrap.network.DisconnectionInfo(wrapperContained.pendingDisconnectionInfo); }
// public java.util.Queue queuedTasks() { return wrapperContained.queuedTasks; }
// public yarnwrap.network.listener.PacketListener prePlayStateListener() { return new yarnwrap.network.listener.PacketListener(wrapperContained.prePlayStateListener); }
// public yarnwrap.network.handler.PacketSizeLogger packetSizeLogger() { return new yarnwrap.network.handler.PacketSizeLogger(wrapperContained.packetSizeLogger); }
// public yarnwrap.network.NetworkState C2S_HANDSHAKE_STATE() { return new yarnwrap.network.NetworkState(wrapperContained.C2S_HANDSHAKE_STATE); }
// public boolean duringLogin() { return wrapperContained.duringLogin; }
// public yarnwrap.network.DisconnectionInfo disconnectionInfo() { return new yarnwrap.network.DisconnectionInfo(wrapperContained.disconnectionInfo); }
public void send(yarnwrap.network.packet.Packet packet) { wrapperContained.send(packet.wrapperContained); }
public yarnwrap.network.listener.PacketListener getPacketListener() { return new yarnwrap.network.listener.PacketListener(wrapperContained.getPacketListener()); }
public float getAveragePacketsSent() { return wrapperContained.getAveragePacketsSent(); }
public void setupEncryption(javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher) { wrapperContained.setupEncryption(decryptionCipher,encryptionCipher); }
public void disconnect(yarnwrap.text.Text disconnectReason) { wrapperContained.disconnect(disconnectReason.wrapperContained); }
// public void handleQueuedTasks() { wrapperContained.handleQueuedTasks(); }
public void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks) { wrapperContained.send(packet.wrapperContained,callbacks.wrapperContained); }
public yarnwrap.network.ClientConnection connect(java.net.InetSocketAddress address,boolean useEpoll,yarnwrap.util.profiler.MultiValueDebugSampleLogImpl packetSizeLog) { return new yarnwrap.network.ClientConnection(wrapperContained.connect(address,useEpoll,packetSizeLog.wrapperContained)); }
public void tick() { wrapperContained.tick(); }
public java.net.SocketAddress getAddress() { return wrapperContained.getAddress(); }
public boolean isLocal() { return wrapperContained.isLocal(); }
public void tryDisableAutoRead() { wrapperContained.tryDisableAutoRead(); }
public boolean isOpen() { return wrapperContained.isOpen(); }
// public void handlePacket(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener) { wrapperContained.handlePacket(packet.wrapperContained,listener.wrapperContained); }
public void setCompressionThreshold(int compressionThreshold,boolean rejectsBadPackets) { wrapperContained.setCompressionThreshold(compressionThreshold,rejectsBadPackets); }
public float getAveragePacketsReceived() { return wrapperContained.getAveragePacketsReceived(); }
// public void sendImmediately(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush) { wrapperContained.sendImmediately(packet.wrapperContained,callbacks.wrapperContained,flush); }
public void handleDisconnection() { wrapperContained.handleDisconnection(); }
public yarnwrap.network.ClientConnection connectLocal(java.net.SocketAddress address) { return new yarnwrap.network.ClientConnection(wrapperContained.connectLocal(address)); }
public boolean isEncrypted() { return wrapperContained.isEncrypted(); }
public boolean isChannelAbsent() { return wrapperContained.isChannelAbsent(); }
// public void updateStats() { wrapperContained.updateStats(); }
public yarnwrap.network.NetworkSide getSide() { return new yarnwrap.network.NetworkSide(wrapperContained.getSide()); }
public yarnwrap.network.NetworkSide getOppositeSide() { return new yarnwrap.network.NetworkSide(wrapperContained.getOppositeSide()); }
// public void sendInternal(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush) { wrapperContained.sendInternal(packet.wrapperContained,callbacks.wrapperContained,flush); }
public void addHandlers(io.netty.channel.ChannelPipeline pipeline,yarnwrap.network.NetworkSide side,boolean local,yarnwrap.network.handler.PacketSizeLogger packetSizeLogger) { wrapperContained.addHandlers(pipeline,side.wrapperContained,local,packetSizeLogger.wrapperContained); }
public io.netty.channel.ChannelFuture connect(java.net.InetSocketAddress address,boolean useEpoll,yarnwrap.network.ClientConnection connection) { return wrapperContained.connect(address,useEpoll,connection.wrapperContained); }
public void connect(java.lang.String address,int port,yarnwrap.network.listener.ClientLoginPacketListener listener) { wrapperContained.connect(address,port,listener.wrapperContained); }
public void connect(java.lang.String address,int port,yarnwrap.network.listener.ClientQueryPacketListener listener) { wrapperContained.connect(address,port,listener.wrapperContained); }
// public void connect(java.lang.String address,int port,yarnwrap.network.NetworkState outboundState,yarnwrap.network.NetworkState inboundState,yarnwrap.network.listener.ClientPacketListener prePlayStateListener,yarnwrap.network.packet.c2s.handshake.ConnectionIntent intent) { wrapperContained.connect(address,port,outboundState.wrapperContained,inboundState.wrapperContained,prePlayStateListener.wrapperContained,intent.wrapperContained); }
public void submit(java.util.function.Consumer task) { wrapperContained.submit(task); }
public void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush) { wrapperContained.send(packet.wrapperContained,callbacks.wrapperContained,flush); }
public java.lang.String getAddressAsString(boolean logIps) { return wrapperContained.getAddressAsString(logIps); }
public void addLocalValidator(io.netty.channel.ChannelPipeline pipeline,yarnwrap.network.NetworkSide side) { wrapperContained.addLocalValidator(pipeline,side.wrapperContained); }
public void setInitialPacketListener(yarnwrap.network.listener.PacketListener packetListener) { wrapperContained.setInitialPacketListener(packetListener.wrapperContained); }
public void flush() { wrapperContained.flush(); }
// public void flushInternal() { wrapperContained.flushInternal(); }
public void resetPacketSizeLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log) { wrapperContained.resetPacketSizeLog(log.wrapperContained); }
public void addFlowControlHandler(io.netty.channel.ChannelPipeline pipeline) { wrapperContained.addFlowControlHandler(pipeline); }
public void connect(java.lang.String address,int port,yarnwrap.network.NetworkState outboundState,yarnwrap.network.NetworkState inboundState,yarnwrap.network.listener.ClientPacketListener prePlayStateListener,boolean transfer) { wrapperContained.connect(address,port,outboundState.wrapperContained,inboundState.wrapperContained,prePlayStateListener.wrapperContained,transfer); }
public void transitionOutbound(yarnwrap.network.NetworkState newState) { wrapperContained.transitionOutbound(newState.wrapperContained); }
public void transitionInbound(yarnwrap.network.NetworkState state,yarnwrap.network.listener.PacketListener packetListener) { wrapperContained.transitionInbound(state.wrapperContained,packetListener.wrapperContained); }
// public void setPacketListener(yarnwrap.network.NetworkState state,yarnwrap.network.listener.PacketListener listener) { wrapperContained.setPacketListener(state.wrapperContained,listener.wrapperContained); }
// public java.lang.String getOutboundHandlerName(boolean sendingSide) { return wrapperContained.getOutboundHandlerName(sendingSide); }
// public java.lang.String getInboundHandlerName(boolean receivingSide) { return wrapperContained.getInboundHandlerName(receivingSide); }
// public void syncUninterruptibly(io.netty.channel.ChannelFuture future) { wrapperContained.syncUninterruptibly(future); }
// public io.netty.channel.ChannelInboundHandler getSplitter(yarnwrap.network.handler.PacketSizeLogger packetSizeLogger,boolean local) { return wrapperContained.getSplitter(packetSizeLogger.wrapperContained,local); }
// public io.netty.channel.ChannelOutboundHandler getPrepender(boolean local) { return wrapperContained.getPrepender(local); }
public void disconnect(yarnwrap.network.DisconnectionInfo disconnectionInfo) { wrapperContained.disconnect(disconnectionInfo.wrapperContained); }

}