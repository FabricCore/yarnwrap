package yarnwrap.client.gui.screen.multiplayer;
public class ConnectScreen { public net.minecraft.client.gui.screen.multiplayer.ConnectScreen wrapperContained; public ConnectScreen(net.minecraft.client.gui.screen.multiplayer.ConnectScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastNarrationTime() { return wrapperContained.lastNarrationTime; }
// public java.util.concurrent.atomic.AtomicInteger CONNECTOR_THREADS_COUNT() { return wrapperContained.CONNECTOR_THREADS_COUNT; }
// public boolean connectingCancelled() { return wrapperContained.connectingCancelled; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.text.Text status() { return new yarnwrap.text.Text(wrapperContained.status); }
// public long NARRATOR_INTERVAL() { return wrapperContained.NARRATOR_INTERVAL; }
public yarnwrap.text.Text UNKNOWN_HOST_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNKNOWN_HOST_TEXT); }
// public yarnwrap.text.Text failureErrorMessage() { return new yarnwrap.text.Text(wrapperContained.failureErrorMessage); }
public yarnwrap.text.Text ABORTED_TEXT() { return new yarnwrap.text.Text(wrapperContained.ABORTED_TEXT); }
// public io.netty.channel.ChannelFuture future() { return wrapperContained.future; }
// public void connect(yarnwrap.client.MinecraftClient client,yarnwrap.client.network.ServerAddress address,yarnwrap.client.network.ServerInfo info,yarnwrap.client.network.CookieStorage cookieStorage) { wrapperContained.connect(client.wrapperContained,address.wrapperContained,info.wrapperContained,cookieStorage.wrapperContained); }
// public void setStatus(yarnwrap.text.Text status) { wrapperContained.setStatus(status.wrapperContained); }
public void connect(yarnwrap.client.gui.screen.Screen screen,yarnwrap.client.MinecraftClient client,yarnwrap.client.network.ServerAddress address,yarnwrap.client.network.ServerInfo info,boolean quickPlay,yarnwrap.client.network.CookieStorage cookieStorage) { wrapperContained.connect(screen.wrapperContained,client.wrapperContained,address.wrapperContained,info.wrapperContained,quickPlay,cookieStorage.wrapperContained); }

}