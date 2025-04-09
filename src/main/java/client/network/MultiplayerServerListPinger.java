package yarnwrap.client.network;
public class MultiplayerServerListPinger { public net.minecraft.client.network.MultiplayerServerListPinger wrapperContained; public MultiplayerServerListPinger(net.minecraft.client.network.MultiplayerServerListPinger wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text CANNOT_CONNECT_TEXT() { return new yarnwrap.text.Text(wrapperContained.CANNOT_CONNECT_TEXT); }
// public java.util.List clientConnections() { return wrapperContained.clientConnections; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.text.Text createPlayerCountText(int current,int max) { return new yarnwrap.text.Text(wrapperContained.createPlayerCountText(current,max)); }
public void tick() { wrapperContained.tick(); }
// public void ping(java.net.InetSocketAddress socketAddress,yarnwrap.client.network.ServerAddress address,yarnwrap.client.network.ServerInfo serverInfo) { wrapperContained.ping(socketAddress,address.wrapperContained,serverInfo.wrapperContained); }
// public void add(yarnwrap.client.network.ServerInfo entry,java.lang.Runnable saver,java.lang.Runnable pingCallback) { wrapperContained.add(entry.wrapperContained,saver,pingCallback); }
public void cancel() { wrapperContained.cancel(); }
// public void showError(yarnwrap.text.Text error,yarnwrap.client.network.ServerInfo info) { wrapperContained.showError(error.wrapperContained,info.wrapperContained); }

}