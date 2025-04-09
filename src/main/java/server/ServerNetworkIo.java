package yarnwrap.server;
public class ServerNetworkIo { public net.minecraft.server.ServerNetworkIo wrapperContained; public ServerNetworkIo(net.minecraft.server.ServerNetworkIo wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Supplier EPOLL_CHANNEL() { return wrapperContained.EPOLL_CHANNEL; }
// public java.util.List channels() { return wrapperContained.channels; }
// public java.util.List connections() { return wrapperContained.connections; }
public boolean active() { return wrapperContained.active; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public java.util.function.Supplier DEFAULT_CHANNEL() { return wrapperContained.DEFAULT_CHANNEL; }
public yarnwrap.server.MinecraftServer getServer() { return new yarnwrap.server.MinecraftServer(wrapperContained.getServer()); }
public java.net.SocketAddress bindLocal() { return wrapperContained.bindLocal(); }
// public void bind(java.net.InetAddress address,int port) { wrapperContained.bind(address,port); }
public void stop() { wrapperContained.stop(); }
public void tick() { wrapperContained.tick(); }
public java.util.List getConnections() { return wrapperContained.getConnections(); }

}