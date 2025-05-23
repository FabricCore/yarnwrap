package yarnwrap.network;
public class ClientConnection { public net.minecraft.network.ClientConnection wrapperContained; public ClientConnection(net.minecraft.network.ClientConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Marker NETWORK_PACKETS_MARKER() { return wrapperContained.NETWORK_PACKETS_MARKER; }
// public void NETWORK_PACKETS_MARKER(org.slf4j.Marker value) { wrapperContained.NETWORK_PACKETS_MARKER = value; }
public static org.slf4j.Marker NETWORK_PACKETS_MARKER() { return net.minecraft.network.ClientConnection.NETWORK_PACKETS_MARKER; }
// public static void NETWORK_PACKETS_MARKER(org.slf4j.Marker value, ) { net.minecraft.network.ClientConnection.NETWORK_PACKETS_MARKER = value; }

// public boolean errored() { return wrapperContained.errored; }
// public void errored(boolean value) { wrapperContained.errored = value; }
// public static boolean errored() { return net.minecraft.network.ClientConnection.errored; }
// public static void errored(boolean value, ) { net.minecraft.network.ClientConnection.errored = value; }

// public org.slf4j.Marker NETWORK_MARKER() { return wrapperContained.NETWORK_MARKER; }
// public void NETWORK_MARKER(org.slf4j.Marker value) { wrapperContained.NETWORK_MARKER = value; }
public static org.slf4j.Marker NETWORK_MARKER() { return net.minecraft.network.ClientConnection.NETWORK_MARKER; }
// public static void NETWORK_MARKER(org.slf4j.Marker value, ) { net.minecraft.network.ClientConnection.NETWORK_MARKER = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.network.ClientConnection.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.ClientConnection.LOGGER = value; }

// public yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(wrapperContained.side); }
// public void side(yarnwrap.network.NetworkSide value) { wrapperContained.side = value.wrapperContained; }
// public static yarnwrap.network.NetworkSide side() { return new yarnwrap.network.NetworkSide(net.minecraft.network.ClientConnection.side); }
// public static void side(yarnwrap.network.NetworkSide value, ) { net.minecraft.network.ClientConnection.side = value.wrapperContained; }

// public java.net.SocketAddress address() { return wrapperContained.address; }
// public void address(java.net.SocketAddress value) { wrapperContained.address = value; }
// public static java.net.SocketAddress address() { return net.minecraft.network.ClientConnection.address; }
// public static void address(java.net.SocketAddress value, ) { net.minecraft.network.ClientConnection.address = value; }

// public boolean disconnected() { return wrapperContained.disconnected; }
// public void disconnected(boolean value) { wrapperContained.disconnected = value; }
// public static boolean disconnected() { return net.minecraft.network.ClientConnection.disconnected; }
// public static void disconnected(boolean value, ) { net.minecraft.network.ClientConnection.disconnected = value; }

// public boolean encrypted() { return wrapperContained.encrypted; }
// public void encrypted(boolean value) { wrapperContained.encrypted = value; }
// public static boolean encrypted() { return net.minecraft.network.ClientConnection.encrypted; }
// public static void encrypted(boolean value, ) { net.minecraft.network.ClientConnection.encrypted = value; }

// public java.util.function.Supplier LOCAL_CLIENT_IO_GROUP() { return wrapperContained.LOCAL_CLIENT_IO_GROUP; }
// public void LOCAL_CLIENT_IO_GROUP(java.util.function.Supplier value) { wrapperContained.LOCAL_CLIENT_IO_GROUP = value; }
public static java.util.function.Supplier LOCAL_CLIENT_IO_GROUP() { return net.minecraft.network.ClientConnection.LOCAL_CLIENT_IO_GROUP; }
// public static void LOCAL_CLIENT_IO_GROUP(java.util.function.Supplier value, ) { net.minecraft.network.ClientConnection.LOCAL_CLIENT_IO_GROUP = value; }

// public java.util.function.Supplier CLIENT_IO_GROUP() { return wrapperContained.CLIENT_IO_GROUP; }
// public void CLIENT_IO_GROUP(java.util.function.Supplier value) { wrapperContained.CLIENT_IO_GROUP = value; }
public static java.util.function.Supplier CLIENT_IO_GROUP() { return net.minecraft.network.ClientConnection.CLIENT_IO_GROUP; }
// public static void CLIENT_IO_GROUP(java.util.function.Supplier value, ) { net.minecraft.network.ClientConnection.CLIENT_IO_GROUP = value; }

// public io.netty.channel.Channel channel() { return wrapperContained.channel; }
// public void channel(io.netty.channel.Channel value) { wrapperContained.channel = value; }
// public static io.netty.channel.Channel channel() { return net.minecraft.network.ClientConnection.channel; }
// public static void channel(io.netty.channel.Channel value, ) { net.minecraft.network.ClientConnection.channel = value; }

// public yarnwrap.network.listener.PacketListener packetListener() { return new yarnwrap.network.listener.PacketListener(wrapperContained.packetListener); }
// public void packetListener(yarnwrap.network.listener.PacketListener value) { wrapperContained.packetListener = value.wrapperContained; }
// public static yarnwrap.network.listener.PacketListener packetListener() { return new yarnwrap.network.listener.PacketListener(net.minecraft.network.ClientConnection.packetListener); }
// public static void packetListener(yarnwrap.network.listener.PacketListener value, ) { net.minecraft.network.ClientConnection.packetListener = value.wrapperContained; }

// public float averagePacketsSent() { return wrapperContained.averagePacketsSent; }
// public void averagePacketsSent(float value) { wrapperContained.averagePacketsSent = value; }
// public static float averagePacketsSent() { return net.minecraft.network.ClientConnection.averagePacketsSent; }
// public static void averagePacketsSent(float value, ) { net.minecraft.network.ClientConnection.averagePacketsSent = value; }

// public float averagePacketsReceived() { return wrapperContained.averagePacketsReceived; }
// public void averagePacketsReceived(float value) { wrapperContained.averagePacketsReceived = value; }
// public static float averagePacketsReceived() { return net.minecraft.network.ClientConnection.averagePacketsReceived; }
// public static void averagePacketsReceived(float value, ) { net.minecraft.network.ClientConnection.averagePacketsReceived = value; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.network.ClientConnection.ticks; }
// public static void ticks(int value, ) { net.minecraft.network.ClientConnection.ticks = value; }

// public int packetsSentCounter() { return wrapperContained.packetsSentCounter; }
// public void packetsSentCounter(int value) { wrapperContained.packetsSentCounter = value; }
// public static int packetsSentCounter() { return net.minecraft.network.ClientConnection.packetsSentCounter; }
// public static void packetsSentCounter(int value, ) { net.minecraft.network.ClientConnection.packetsSentCounter = value; }

// public java.util.function.Supplier EPOLL_CLIENT_IO_GROUP() { return wrapperContained.EPOLL_CLIENT_IO_GROUP; }
// public void EPOLL_CLIENT_IO_GROUP(java.util.function.Supplier value) { wrapperContained.EPOLL_CLIENT_IO_GROUP = value; }
public static java.util.function.Supplier EPOLL_CLIENT_IO_GROUP() { return net.minecraft.network.ClientConnection.EPOLL_CLIENT_IO_GROUP; }
// public static void EPOLL_CLIENT_IO_GROUP(java.util.function.Supplier value, ) { net.minecraft.network.ClientConnection.EPOLL_CLIENT_IO_GROUP = value; }

// public int packetsReceivedCounter() { return wrapperContained.packetsReceivedCounter; }
// public void packetsReceivedCounter(int value) { wrapperContained.packetsReceivedCounter = value; }
// public static int packetsReceivedCounter() { return net.minecraft.network.ClientConnection.packetsReceivedCounter; }
// public static void packetsReceivedCounter(int value, ) { net.minecraft.network.ClientConnection.packetsReceivedCounter = value; }

// public float CURRENT_PACKET_COUNTER_WEIGHT() { return wrapperContained.CURRENT_PACKET_COUNTER_WEIGHT; }
// public void CURRENT_PACKET_COUNTER_WEIGHT(float value) { wrapperContained.CURRENT_PACKET_COUNTER_WEIGHT = value; }
// public static float CURRENT_PACKET_COUNTER_WEIGHT() { return net.minecraft.network.ClientConnection.CURRENT_PACKET_COUNTER_WEIGHT; }
// public static void CURRENT_PACKET_COUNTER_WEIGHT(float value, ) { net.minecraft.network.ClientConnection.CURRENT_PACKET_COUNTER_WEIGHT = value; }

// public org.slf4j.Marker PACKET_RECEIVED_MARKER() { return wrapperContained.PACKET_RECEIVED_MARKER; }
// public void PACKET_RECEIVED_MARKER(org.slf4j.Marker value) { wrapperContained.PACKET_RECEIVED_MARKER = value; }
public static org.slf4j.Marker PACKET_RECEIVED_MARKER() { return net.minecraft.network.ClientConnection.PACKET_RECEIVED_MARKER; }
// public static void PACKET_RECEIVED_MARKER(org.slf4j.Marker value, ) { net.minecraft.network.ClientConnection.PACKET_RECEIVED_MARKER = value; }

// public org.slf4j.Marker PACKET_SENT_MARKER() { return wrapperContained.PACKET_SENT_MARKER; }
// public void PACKET_SENT_MARKER(org.slf4j.Marker value) { wrapperContained.PACKET_SENT_MARKER = value; }
public static org.slf4j.Marker PACKET_SENT_MARKER() { return net.minecraft.network.ClientConnection.PACKET_SENT_MARKER; }
// public static void PACKET_SENT_MARKER(org.slf4j.Marker value, ) { net.minecraft.network.ClientConnection.PACKET_SENT_MARKER = value; }

// public yarnwrap.network.DisconnectionInfo pendingDisconnectionInfo() { return new yarnwrap.network.DisconnectionInfo(wrapperContained.pendingDisconnectionInfo); }
// public void pendingDisconnectionInfo(yarnwrap.network.DisconnectionInfo value) { wrapperContained.pendingDisconnectionInfo = value.wrapperContained; }
// public static yarnwrap.network.DisconnectionInfo pendingDisconnectionInfo() { return new yarnwrap.network.DisconnectionInfo(net.minecraft.network.ClientConnection.pendingDisconnectionInfo); }
// public static void pendingDisconnectionInfo(yarnwrap.network.DisconnectionInfo value, ) { net.minecraft.network.ClientConnection.pendingDisconnectionInfo = value.wrapperContained; }

// public java.util.Queue queuedTasks() { return wrapperContained.queuedTasks; }
// public void queuedTasks(java.util.Queue value) { wrapperContained.queuedTasks = value; }
// public static java.util.Queue queuedTasks() { return net.minecraft.network.ClientConnection.queuedTasks; }
// public static void queuedTasks(java.util.Queue value, ) { net.minecraft.network.ClientConnection.queuedTasks = value; }

// public yarnwrap.network.listener.PacketListener prePlayStateListener() { return new yarnwrap.network.listener.PacketListener(wrapperContained.prePlayStateListener); }
// public void prePlayStateListener(yarnwrap.network.listener.PacketListener value) { wrapperContained.prePlayStateListener = value.wrapperContained; }
// public static yarnwrap.network.listener.PacketListener prePlayStateListener() { return new yarnwrap.network.listener.PacketListener(net.minecraft.network.ClientConnection.prePlayStateListener); }
// public static void prePlayStateListener(yarnwrap.network.listener.PacketListener value, ) { net.minecraft.network.ClientConnection.prePlayStateListener = value.wrapperContained; }

// public yarnwrap.network.handler.PacketSizeLogger packetSizeLogger() { return new yarnwrap.network.handler.PacketSizeLogger(wrapperContained.packetSizeLogger); }
// public void packetSizeLogger(yarnwrap.network.handler.PacketSizeLogger value) { wrapperContained.packetSizeLogger = value.wrapperContained; }
// public static yarnwrap.network.handler.PacketSizeLogger packetSizeLogger() { return new yarnwrap.network.handler.PacketSizeLogger(net.minecraft.network.ClientConnection.packetSizeLogger); }
// public static void packetSizeLogger(yarnwrap.network.handler.PacketSizeLogger value, ) { net.minecraft.network.ClientConnection.packetSizeLogger = value.wrapperContained; }

// public yarnwrap.network.state.NetworkState C2S_HANDSHAKE_STATE() { return new yarnwrap.network.state.NetworkState(wrapperContained.C2S_HANDSHAKE_STATE); }
// public void C2S_HANDSHAKE_STATE(yarnwrap.network.state.NetworkState value) { wrapperContained.C2S_HANDSHAKE_STATE = value.wrapperContained; }
// public static yarnwrap.network.state.NetworkState C2S_HANDSHAKE_STATE() { return new yarnwrap.network.state.NetworkState(net.minecraft.network.ClientConnection.C2S_HANDSHAKE_STATE); }
// public static void C2S_HANDSHAKE_STATE(yarnwrap.network.state.NetworkState value, ) { net.minecraft.network.ClientConnection.C2S_HANDSHAKE_STATE = value.wrapperContained; }

// public boolean duringLogin() { return wrapperContained.duringLogin; }
// public void duringLogin(boolean value) { wrapperContained.duringLogin = value; }
// public static boolean duringLogin() { return net.minecraft.network.ClientConnection.duringLogin; }
// public static void duringLogin(boolean value, ) { net.minecraft.network.ClientConnection.duringLogin = value; }

// public yarnwrap.network.DisconnectionInfo disconnectionInfo() { return new yarnwrap.network.DisconnectionInfo(wrapperContained.disconnectionInfo); }
// public void disconnectionInfo(yarnwrap.network.DisconnectionInfo value) { wrapperContained.disconnectionInfo = value.wrapperContained; }
// public static yarnwrap.network.DisconnectionInfo disconnectionInfo() { return new yarnwrap.network.DisconnectionInfo(net.minecraft.network.ClientConnection.disconnectionInfo); }
// public static void disconnectionInfo(yarnwrap.network.DisconnectionInfo value, ) { net.minecraft.network.ClientConnection.disconnectionInfo = value.wrapperContained; }

public ClientConnection(yarnwrap.network.NetworkSide side) { this.wrapperContained = new net.minecraft.network.ClientConnection(side.wrapperContained); }
// public void channelActive(io.netty.channel.ChannelHandlerContext context) { wrapperContained.channelActive(context); }
// public static void channelActive(io.netty.channel.ChannelHandlerContext context, ) { net.minecraft.network.ClientConnection.channelActive(context); }
public void channelInactive(io.netty.channel.ChannelHandlerContext context) { wrapperContained.channelInactive(context); }
// public static void channelInactive(io.netty.channel.ChannelHandlerContext context, ) { net.minecraft.network.ClientConnection.channelInactive(context); }
// public void channelRead0(io.netty.channel.ChannelHandlerContext context,java.lang.Object packet) { wrapperContained.channelRead0(context,packet); }
// public static void channelRead0(io.netty.channel.ChannelHandlerContext context,java.lang.Object packet, ) { net.minecraft.network.ClientConnection.channelRead0(context,packet); }
public void exceptionCaught(io.netty.channel.ChannelHandlerContext context,java.lang.Throwable ex) { wrapperContained.exceptionCaught(context,ex); }
// public static void exceptionCaught(io.netty.channel.ChannelHandlerContext context,java.lang.Throwable ex, ) { net.minecraft.network.ClientConnection.exceptionCaught(context,ex); }
public void send(yarnwrap.network.packet.Packet packet) { wrapperContained.send(packet.wrapperContained); }
// public static void send(yarnwrap.network.packet.Packet packet, ) { net.minecraft.network.ClientConnection.send(packet.wrapperContained); }
public yarnwrap.network.listener.PacketListener getPacketListener() { return new yarnwrap.network.listener.PacketListener(wrapperContained.getPacketListener()); }
// public static yarnwrap.network.listener.PacketListener getPacketListener() { return new yarnwrap.network.listener.PacketListener(net.minecraft.network.ClientConnection.getPacketListener()); }
public float getAveragePacketsSent() { return wrapperContained.getAveragePacketsSent(); }
// public static float getAveragePacketsSent() { return net.minecraft.network.ClientConnection.getAveragePacketsSent(); }
public void setupEncryption(javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher) { wrapperContained.setupEncryption(decryptionCipher,encryptionCipher); }
// public static void setupEncryption(javax.crypto.Cipher decryptionCipher,javax.crypto.Cipher encryptionCipher, ) { net.minecraft.network.ClientConnection.setupEncryption(decryptionCipher,encryptionCipher); }
public void disconnect(yarnwrap.text.Text disconnectReason) { wrapperContained.disconnect(disconnectReason.wrapperContained); }
// public static void disconnect(yarnwrap.text.Text disconnectReason, ) { net.minecraft.network.ClientConnection.disconnect(disconnectReason.wrapperContained); }
// public void handleQueuedTasks() { wrapperContained.handleQueuedTasks(); }
// public static void handleQueuedTasks() { net.minecraft.network.ClientConnection.handleQueuedTasks(); }
public void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks) { wrapperContained.send(packet.wrapperContained,callbacks.wrapperContained); }
// public static void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks, ) { net.minecraft.network.ClientConnection.send(packet.wrapperContained,callbacks.wrapperContained); }
// public yarnwrap.network.ClientConnection connect(java.net.InetSocketAddress address,boolean useEpoll,yarnwrap.util.profiler.MultiValueDebugSampleLogImpl packetSizeLog) { return new yarnwrap.network.ClientConnection(wrapperContained.connect(address,useEpoll,packetSizeLog.wrapperContained)); }
// public static yarnwrap.network.ClientConnection connect(java.net.InetSocketAddress address,boolean useEpoll,yarnwrap.util.profiler.MultiValueDebugSampleLogImpl packetSizeLog, ) { return new yarnwrap.network.ClientConnection(net.minecraft.network.ClientConnection.connect(address,useEpoll,packetSizeLog.wrapperContained)); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.network.ClientConnection.tick(); }
public java.net.SocketAddress getAddress() { return wrapperContained.getAddress(); }
// public static java.net.SocketAddress getAddress() { return net.minecraft.network.ClientConnection.getAddress(); }
public boolean isLocal() { return wrapperContained.isLocal(); }
// public static boolean isLocal() { return net.minecraft.network.ClientConnection.isLocal(); }
public void tryDisableAutoRead() { wrapperContained.tryDisableAutoRead(); }
// public static void tryDisableAutoRead() { net.minecraft.network.ClientConnection.tryDisableAutoRead(); }
public boolean isOpen() { return wrapperContained.isOpen(); }
// public static boolean isOpen() { return net.minecraft.network.ClientConnection.isOpen(); }
// public void handlePacket(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener) { wrapperContained.handlePacket(packet.wrapperContained,listener.wrapperContained); }
// public static void handlePacket(yarnwrap.network.packet.Packet packet,yarnwrap.network.listener.PacketListener listener, ) { net.minecraft.network.ClientConnection.handlePacket(packet.wrapperContained,listener.wrapperContained); }
public void setCompressionThreshold(int compressionThreshold,boolean rejectsBadPackets) { wrapperContained.setCompressionThreshold(compressionThreshold,rejectsBadPackets); }
// public static void setCompressionThreshold(int compressionThreshold,boolean rejectsBadPackets, ) { net.minecraft.network.ClientConnection.setCompressionThreshold(compressionThreshold,rejectsBadPackets); }
public float getAveragePacketsReceived() { return wrapperContained.getAveragePacketsReceived(); }
// public static float getAveragePacketsReceived() { return net.minecraft.network.ClientConnection.getAveragePacketsReceived(); }
// public void sendImmediately(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush) { wrapperContained.sendImmediately(packet.wrapperContained,callbacks.wrapperContained,flush); }
// public static void sendImmediately(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush, ) { net.minecraft.network.ClientConnection.sendImmediately(packet.wrapperContained,callbacks.wrapperContained,flush); }
public void handleDisconnection() { wrapperContained.handleDisconnection(); }
// public static void handleDisconnection() { net.minecraft.network.ClientConnection.handleDisconnection(); }
// public yarnwrap.network.ClientConnection connectLocal(java.net.SocketAddress address) { return new yarnwrap.network.ClientConnection(wrapperContained.connectLocal(address)); }
// public static yarnwrap.network.ClientConnection connectLocal(java.net.SocketAddress address, ) { return new yarnwrap.network.ClientConnection(net.minecraft.network.ClientConnection.connectLocal(address)); }
public boolean isEncrypted() { return wrapperContained.isEncrypted(); }
// public static boolean isEncrypted() { return net.minecraft.network.ClientConnection.isEncrypted(); }
public boolean isChannelAbsent() { return wrapperContained.isChannelAbsent(); }
// public static boolean isChannelAbsent() { return net.minecraft.network.ClientConnection.isChannelAbsent(); }
// public void updateStats() { wrapperContained.updateStats(); }
// public static void updateStats() { net.minecraft.network.ClientConnection.updateStats(); }
public yarnwrap.network.NetworkSide getSide() { return new yarnwrap.network.NetworkSide(wrapperContained.getSide()); }
// public static yarnwrap.network.NetworkSide getSide() { return new yarnwrap.network.NetworkSide(net.minecraft.network.ClientConnection.getSide()); }
public yarnwrap.network.NetworkSide getOppositeSide() { return new yarnwrap.network.NetworkSide(wrapperContained.getOppositeSide()); }
// public static yarnwrap.network.NetworkSide getOppositeSide() { return new yarnwrap.network.NetworkSide(net.minecraft.network.ClientConnection.getOppositeSide()); }
// public void sendInternal(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush) { wrapperContained.sendInternal(packet.wrapperContained,callbacks.wrapperContained,flush); }
// public static void sendInternal(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush, ) { net.minecraft.network.ClientConnection.sendInternal(packet.wrapperContained,callbacks.wrapperContained,flush); }
// public void method_40062(org.slf4j.Marker marker) { wrapperContained.method_40062(marker); }
// public static void method_40062(org.slf4j.Marker marker, ) { net.minecraft.network.ClientConnection.method_40062(marker); }
// public void method_40063(org.slf4j.Marker marker) { wrapperContained.method_40063(marker); }
// public static void method_40063(org.slf4j.Marker marker, ) { net.minecraft.network.ClientConnection.method_40063(marker); }
// public void method_40064(org.slf4j.Marker marker) { wrapperContained.method_40064(marker); }
// public static void method_40064(org.slf4j.Marker marker, ) { net.minecraft.network.ClientConnection.method_40064(marker); }
// public void method_45082(yarnwrap.network.PacketCallbacks future) { wrapperContained.method_45082(future.wrapperContained); }
// public static void method_45082(yarnwrap.network.PacketCallbacks future, ) { net.minecraft.network.ClientConnection.method_45082(future.wrapperContained); }
// public void addHandlers(io.netty.channel.ChannelPipeline pipeline,yarnwrap.network.NetworkSide side,boolean local,yarnwrap.network.handler.PacketSizeLogger packetSizeLogger) { wrapperContained.addHandlers(pipeline,side.wrapperContained,local,packetSizeLogger.wrapperContained); }
// public static void addHandlers(io.netty.channel.ChannelPipeline pipeline,yarnwrap.network.NetworkSide side,boolean local,yarnwrap.network.handler.PacketSizeLogger packetSizeLogger, ) { net.minecraft.network.ClientConnection.addHandlers(pipeline,side.wrapperContained,local,packetSizeLogger.wrapperContained); }
// public io.netty.channel.ChannelFuture connect(java.net.InetSocketAddress address,boolean useEpoll,yarnwrap.network.ClientConnection connection) { return wrapperContained.connect(address,useEpoll,connection.wrapperContained); }
// public static io.netty.channel.ChannelFuture connect(java.net.InetSocketAddress address,boolean useEpoll,yarnwrap.network.ClientConnection connection, ) { return net.minecraft.network.ClientConnection.connect(address,useEpoll,connection.wrapperContained); }
// public void method_52900(yarnwrap.network.state.NetworkState connection) { wrapperContained.method_52900(connection.wrapperContained); }
// public static void method_52900(yarnwrap.network.state.NetworkState connection, ) { net.minecraft.network.ClientConnection.method_52900(connection.wrapperContained); }
public void connect(java.lang.String address,int port,yarnwrap.network.listener.ClientLoginPacketListener listener) { wrapperContained.connect(address,port,listener.wrapperContained); }
// public static void connect(java.lang.String address,int port,yarnwrap.network.listener.ClientLoginPacketListener listener, ) { net.minecraft.network.ClientConnection.connect(address,port,listener.wrapperContained); }
public void connect(java.lang.String address,int port,yarnwrap.network.listener.ClientQueryPacketListener listener) { wrapperContained.connect(address,port,listener.wrapperContained); }
// public static void connect(java.lang.String address,int port,yarnwrap.network.listener.ClientQueryPacketListener listener, ) { net.minecraft.network.ClientConnection.connect(address,port,listener.wrapperContained); }
// public void connect(java.lang.String address,int port,yarnwrap.network.state.NetworkState outboundState,yarnwrap.network.state.NetworkState inboundState,yarnwrap.network.listener.ClientPacketListener prePlayStateListener,yarnwrap.network.packet.c2s.handshake.ConnectionIntent intent) { wrapperContained.connect(address,port,outboundState.wrapperContained,inboundState.wrapperContained,prePlayStateListener.wrapperContained,intent.wrapperContained); }
// public static void connect(java.lang.String address,int port,yarnwrap.network.state.NetworkState outboundState,yarnwrap.network.state.NetworkState inboundState,yarnwrap.network.listener.ClientPacketListener prePlayStateListener,yarnwrap.network.packet.c2s.handshake.ConnectionIntent intent, ) { net.minecraft.network.ClientConnection.connect(address,port,outboundState.wrapperContained,inboundState.wrapperContained,prePlayStateListener.wrapperContained,intent.wrapperContained); }
public void submit(java.util.function.Consumer task) { wrapperContained.submit(task); }
// public static void submit(java.util.function.Consumer task, ) { net.minecraft.network.ClientConnection.submit(task); }
public void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush) { wrapperContained.send(packet.wrapperContained,callbacks.wrapperContained,flush); }
// public static void send(yarnwrap.network.packet.Packet packet,yarnwrap.network.PacketCallbacks callbacks,boolean flush, ) { net.minecraft.network.ClientConnection.send(packet.wrapperContained,callbacks.wrapperContained,flush); }
// public void method_52907(yarnwrap.network.packet.Packet connection) { wrapperContained.method_52907(connection.wrapperContained); }
// public static void method_52907(yarnwrap.network.packet.Packet connection, ) { net.minecraft.network.ClientConnection.method_52907(connection.wrapperContained); }
public java.lang.String getAddressAsString(boolean logIps) { return wrapperContained.getAddressAsString(logIps); }
// public static java.lang.String getAddressAsString(boolean logIps, ) { return net.minecraft.network.ClientConnection.getAddressAsString(logIps); }
// public void addLocalValidator(io.netty.channel.ChannelPipeline pipeline,yarnwrap.network.NetworkSide side) { wrapperContained.addLocalValidator(pipeline,side.wrapperContained); }
// public static void addLocalValidator(io.netty.channel.ChannelPipeline pipeline,yarnwrap.network.NetworkSide side, ) { net.minecraft.network.ClientConnection.addLocalValidator(pipeline,side.wrapperContained); }
public void setInitialPacketListener(yarnwrap.network.listener.PacketListener packetListener) { wrapperContained.setInitialPacketListener(packetListener.wrapperContained); }
// public static void setInitialPacketListener(yarnwrap.network.listener.PacketListener packetListener, ) { net.minecraft.network.ClientConnection.setInitialPacketListener(packetListener.wrapperContained); }
public void flush() { wrapperContained.flush(); }
// public static void flush() { net.minecraft.network.ClientConnection.flush(); }
// public void flushInternal() { wrapperContained.flushInternal(); }
// public static void flushInternal() { net.minecraft.network.ClientConnection.flushInternal(); }
public void resetPacketSizeLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log) { wrapperContained.resetPacketSizeLog(log.wrapperContained); }
// public static void resetPacketSizeLog(yarnwrap.util.profiler.MultiValueDebugSampleLogImpl log, ) { net.minecraft.network.ClientConnection.resetPacketSizeLog(log.wrapperContained); }
public void addFlowControlHandler(io.netty.channel.ChannelPipeline pipeline) { wrapperContained.addFlowControlHandler(pipeline); }
// public static void addFlowControlHandler(io.netty.channel.ChannelPipeline pipeline, ) { net.minecraft.network.ClientConnection.addFlowControlHandler(pipeline); }
public void connect(java.lang.String address,int port,yarnwrap.network.state.NetworkState outboundState,yarnwrap.network.state.NetworkState inboundState,yarnwrap.network.listener.ClientPacketListener prePlayStateListener,boolean transfer) { wrapperContained.connect(address,port,outboundState.wrapperContained,inboundState.wrapperContained,prePlayStateListener.wrapperContained,transfer); }
// public static void connect(java.lang.String address,int port,yarnwrap.network.state.NetworkState outboundState,yarnwrap.network.state.NetworkState inboundState,yarnwrap.network.listener.ClientPacketListener prePlayStateListener,boolean transfer, ) { net.minecraft.network.ClientConnection.connect(address,port,outboundState.wrapperContained,inboundState.wrapperContained,prePlayStateListener.wrapperContained,transfer); }
// public void method_56327(yarnwrap.network.handler.PacketBundler context) { wrapperContained.method_56327(context.wrapperContained); }
// public static void method_56327(yarnwrap.network.handler.PacketBundler context, ) { net.minecraft.network.ClientConnection.method_56327(context.wrapperContained); }
// public void method_56328(yarnwrap.network.handler.PacketUnbundler context) { wrapperContained.method_56328(context.wrapperContained); }
// public static void method_56328(yarnwrap.network.handler.PacketUnbundler context, ) { net.minecraft.network.ClientConnection.method_56328(context.wrapperContained); }
public void transitionOutbound(yarnwrap.network.state.NetworkState newState) { wrapperContained.transitionOutbound(newState.wrapperContained); }
// public static void transitionOutbound(yarnwrap.network.state.NetworkState newState, ) { net.minecraft.network.ClientConnection.transitionOutbound(newState.wrapperContained); }
public void transitionInbound(yarnwrap.network.state.NetworkState state,yarnwrap.network.listener.PacketListener packetListener) { wrapperContained.transitionInbound(state.wrapperContained,packetListener.wrapperContained); }
// public static void transitionInbound(yarnwrap.network.state.NetworkState state,yarnwrap.network.listener.PacketListener packetListener, ) { net.minecraft.network.ClientConnection.transitionInbound(state.wrapperContained,packetListener.wrapperContained); }
// public void method_56331(boolean context) { wrapperContained.method_56331(context); }
// public static void method_56331(boolean context, ) { net.minecraft.network.ClientConnection.method_56331(context); }
// public void setPacketListener(yarnwrap.network.state.NetworkState state,yarnwrap.network.listener.PacketListener listener) { wrapperContained.setPacketListener(state.wrapperContained,listener.wrapperContained); }
// public static void setPacketListener(yarnwrap.network.state.NetworkState state,yarnwrap.network.listener.PacketListener listener, ) { net.minecraft.network.ClientConnection.setPacketListener(state.wrapperContained,listener.wrapperContained); }
// public java.lang.String getOutboundHandlerName(boolean sendingSide) { return wrapperContained.getOutboundHandlerName(sendingSide); }
// public static java.lang.String getOutboundHandlerName(boolean sendingSide, ) { return net.minecraft.network.ClientConnection.getOutboundHandlerName(sendingSide); }
// public java.lang.String getInboundHandlerName(boolean receivingSide) { return wrapperContained.getInboundHandlerName(receivingSide); }
// public static java.lang.String getInboundHandlerName(boolean receivingSide, ) { return net.minecraft.network.ClientConnection.getInboundHandlerName(receivingSide); }
// public void syncUninterruptibly(io.netty.channel.ChannelFuture future) { wrapperContained.syncUninterruptibly(future); }
// public static void syncUninterruptibly(io.netty.channel.ChannelFuture future, ) { net.minecraft.network.ClientConnection.syncUninterruptibly(future); }
// public io.netty.channel.ChannelInboundHandler getSplitter(yarnwrap.network.handler.PacketSizeLogger packetSizeLogger,boolean local) { return wrapperContained.getSplitter(packetSizeLogger.wrapperContained,local); }
// public static io.netty.channel.ChannelInboundHandler getSplitter(yarnwrap.network.handler.PacketSizeLogger packetSizeLogger,boolean local, ) { return net.minecraft.network.ClientConnection.getSplitter(packetSizeLogger.wrapperContained,local); }
// public io.netty.channel.ChannelOutboundHandler getPrepender(boolean local) { return wrapperContained.getPrepender(local); }
// public static io.netty.channel.ChannelOutboundHandler getPrepender(boolean local, ) { return net.minecraft.network.ClientConnection.getPrepender(local); }
public void disconnect(yarnwrap.network.DisconnectionInfo disconnectionInfo) { wrapperContained.disconnect(disconnectionInfo.wrapperContained); }
// public static void disconnect(yarnwrap.network.DisconnectionInfo disconnectionInfo, ) { net.minecraft.network.ClientConnection.disconnect(disconnectionInfo.wrapperContained); }
public yarnwrap.network.DisconnectionInfo getDisconnectionInfo() { return new yarnwrap.network.DisconnectionInfo(wrapperContained.getDisconnectionInfo()); }
// public static yarnwrap.network.DisconnectionInfo getDisconnectionInfo() { return new yarnwrap.network.DisconnectionInfo(net.minecraft.network.ClientConnection.getDisconnectionInfo()); }

}