package yarnwrap.server;
public class ServerNetworkIo { public net.minecraft.server.ServerNetworkIo wrapperContained; public ServerNetworkIo(net.minecraft.server.ServerNetworkIo wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Supplier EPOLL_CHANNEL() { return wrapperContained.EPOLL_CHANNEL; }
// public void EPOLL_CHANNEL(java.util.function.Supplier value) { wrapperContained.EPOLL_CHANNEL = value; }
// public java.util.List channels() { return wrapperContained.channels; }
// public void channels(java.util.List value) { wrapperContained.channels = value; }
// public java.util.List connections() { return wrapperContained.connections; }
// public void connections(java.util.List value) { wrapperContained.connections = value; }
public boolean active() { return wrapperContained.active; }
public void active(boolean value) { wrapperContained.active = value; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.util.function.Supplier DEFAULT_CHANNEL() { return wrapperContained.DEFAULT_CHANNEL; }
// public void DEFAULT_CHANNEL(java.util.function.Supplier value) { wrapperContained.DEFAULT_CHANNEL = value; }
public ServerNetworkIo(yarnwrap.server.MinecraftServer server) { this.wrapperContained = new net.minecraft.server.ServerNetworkIo(server.wrapperContained); }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
public java.net.SocketAddress bindLocal() { return wrapperContained.bindLocal(); }
// public void bind(java.net.InetAddress address,int port) { wrapperContained.bind(address,port); }
public void stop() { wrapperContained.stop(); }
public void tick() { wrapperContained.tick(); }
public java.util.List getConnections() { return wrapperContained.getConnections(); }

}