package yarnwrap.server;
public class ServerNetworkIo { public net.minecraft.server.ServerNetworkIo wrapperContained; public ServerNetworkIo(net.minecraft.server.ServerNetworkIo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier EPOLL_CHANNEL() { return wrapperContained.EPOLL_CHANNEL; }
// public void EPOLL_CHANNEL(java.util.function.Supplier value) { wrapperContained.EPOLL_CHANNEL = value; }
public static java.util.function.Supplier EPOLL_CHANNEL() { return net.minecraft.server.ServerNetworkIo.EPOLL_CHANNEL; }
// public static void EPOLL_CHANNEL(java.util.function.Supplier value, ) { net.minecraft.server.ServerNetworkIo.EPOLL_CHANNEL = value; }

// public java.util.List channels() { return wrapperContained.channels; }
// public void channels(java.util.List value) { wrapperContained.channels = value; }
// public static java.util.List channels() { return net.minecraft.server.ServerNetworkIo.channels; }
// public static void channels(java.util.List value, ) { net.minecraft.server.ServerNetworkIo.channels = value; }

// public java.util.List connections() { return wrapperContained.connections; }
// public void connections(java.util.List value) { wrapperContained.connections = value; }
// public static java.util.List connections() { return net.minecraft.server.ServerNetworkIo.connections; }
// public static void connections(java.util.List value, ) { net.minecraft.server.ServerNetworkIo.connections = value; }

public boolean active() { return wrapperContained.active; }
public void active(boolean value) { wrapperContained.active = value; }
// public static boolean active() { return net.minecraft.server.ServerNetworkIo.active; }
// public static void active(boolean value, ) { net.minecraft.server.ServerNetworkIo.active = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.ServerNetworkIo.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.ServerNetworkIo.server = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.ServerNetworkIo.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.ServerNetworkIo.LOGGER = value; }

// public java.util.function.Supplier DEFAULT_CHANNEL() { return wrapperContained.DEFAULT_CHANNEL; }
// public void DEFAULT_CHANNEL(java.util.function.Supplier value) { wrapperContained.DEFAULT_CHANNEL = value; }
public static java.util.function.Supplier DEFAULT_CHANNEL() { return net.minecraft.server.ServerNetworkIo.DEFAULT_CHANNEL; }
// public static void DEFAULT_CHANNEL(java.util.function.Supplier value, ) { net.minecraft.server.ServerNetworkIo.DEFAULT_CHANNEL = value; }

public ServerNetworkIo(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.ServerNetworkIo(server.wrapperContained); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
// public static yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.ServerNetworkIo.getServer()); }
public java.net.SocketAddress bindLocal() { return wrapperContained.bindLocal(); }
// public static java.net.SocketAddress bindLocal() { return net.minecraft.server.ServerNetworkIo.bindLocal(); }
// public void bind(java.net.InetAddress address,int port) { wrapperContained.bind(address,port); }
// public static void bind(java.net.InetAddress address,int port, ) { net.minecraft.server.ServerNetworkIo.bind(address,port); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.server.ServerNetworkIo.stop(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.server.ServerNetworkIo.tick(); }
public java.util.List getConnections() { return wrapperContained.getConnections(); }
// public static java.util.List getConnections() { return net.minecraft.server.ServerNetworkIo.getConnections(); }

}