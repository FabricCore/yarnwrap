package yarnwrap.client.network;
public class MultiplayerServerListPinger { public net.minecraft.client.network.MultiplayerServerListPinger wrapperContained; public MultiplayerServerListPinger(net.minecraft.client.network.MultiplayerServerListPinger wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List clientConnections() { return wrapperContained.clientConnections; }
// public void clientConnections(java.util.List value) { wrapperContained.clientConnections = value; }
// public static java.util.List clientConnections() { return net.minecraft.client.network.MultiplayerServerListPinger.clientConnections; }
// public static void clientConnections(java.util.List value, ) { net.minecraft.client.network.MultiplayerServerListPinger.clientConnections = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.network.MultiplayerServerListPinger.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.network.MultiplayerServerListPinger.LOGGER = value; }

// public yarnwrap.text.Text CANNOT_CONNECT_TEXT() { return new yarnwrap.text.Text(wrapperContained.CANNOT_CONNECT_TEXT); }
// public void CANNOT_CONNECT_TEXT(yarnwrap.text.Text value) { wrapperContained.CANNOT_CONNECT_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text CANNOT_CONNECT_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.network.MultiplayerServerListPinger.CANNOT_CONNECT_TEXT); }
// public static void CANNOT_CONNECT_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.network.MultiplayerServerListPinger.CANNOT_CONNECT_TEXT = value.wrapperContained; }

public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.network.MultiplayerServerListPinger.tick(); }
// public void ping(java.net.InetSocketAddress socketAddress,yarnwrap.client.network.ServerAddress address,yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.ping(socketAddress,address.wrapperContained,serverInfo.wrapperContained); }
// public static void ping(java.net.InetSocketAddress socketAddress,yarnwrap.client.network.ServerAddress address,yarnwrap.client.network.ServerInfo serverInfo, ) { net.minecraft.client.network.MultiplayerServerListPinger.ping(socketAddress,address.wrapperContained,serverInfo.wrapperContained); }
// public void add(yarnwrap.client.network.ServerInfo entry,java.lang.Runnable saver,java.lang.Runnable pingCallback) { wrapperContained.add(entry.wrapperContained,saver,pingCallback); }
// public static void add(yarnwrap.client.network.ServerInfo entry,java.lang.Runnable saver,java.lang.Runnable pingCallback, ) { net.minecraft.client.network.MultiplayerServerListPinger.add(entry.wrapperContained,saver,pingCallback); }
public void cancel() { wrapperContained.cancel(); }
// public static void cancel() { net.minecraft.client.network.MultiplayerServerListPinger.cancel(); }
// public yarnwrap.text.Text createPlayerCountText(int current,int max) { return new yarnwrap.text.Text(wrapperContained.createPlayerCountText(current,max)); }
// public static yarnwrap.text.Text createPlayerCountText(int current,int max, ) { return new yarnwrap.text.Text(net.minecraft.client.network.MultiplayerServerListPinger.createPlayerCountText(current,max)); }
// public void showError(yarnwrap.text.Text error,yarnwrap.client.network.ServerInfo info) { wrapperContained.showError(error.wrapperContained,info.wrapperContained); }
// public static void showError(yarnwrap.text.Text error,yarnwrap.client.network.ServerInfo info, ) { net.minecraft.client.network.MultiplayerServerListPinger.showError(error.wrapperContained,info.wrapperContained); }

}