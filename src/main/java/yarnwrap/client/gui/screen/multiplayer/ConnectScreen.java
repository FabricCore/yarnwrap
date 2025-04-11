package yarnwrap.client.gui.screen.multiplayer;
public class ConnectScreen { public net.minecraft.client.gui.screen.multiplayer.ConnectScreen wrapperContained; public ConnectScreen(net.minecraft.client.gui.screen.multiplayer.ConnectScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastNarrationTime() { return wrapperContained.lastNarrationTime; }
// public void lastNarrationTime(long value) { wrapperContained.lastNarrationTime = value; }
// public java.util.concurrent.atomic.AtomicInteger CONNECTOR_THREADS_COUNT() { return wrapperContained.CONNECTOR_THREADS_COUNT; }
// public void CONNECTOR_THREADS_COUNT(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.CONNECTOR_THREADS_COUNT = value; }
// public boolean connectingCancelled() { return wrapperContained.connectingCancelled; }
// public void connectingCancelled(boolean value) { wrapperContained.connectingCancelled = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.text.Text status() { return new yarnwrap.text.Text(wrapperContained.status); }
// public void status(yarnwrap.text.Text value) { wrapperContained.status = value.wrapperContained; }
// public long NARRATOR_INTERVAL() { return wrapperContained.NARRATOR_INTERVAL; }
// public void NARRATOR_INTERVAL(long value) { wrapperContained.NARRATOR_INTERVAL = value; }
public yarnwrap.text.Text UNKNOWN_HOST_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNKNOWN_HOST_TEXT); }
// public void UNKNOWN_HOST_TEXT(yarnwrap.text.Text value) { wrapperContained.UNKNOWN_HOST_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text failureErrorMessage() { return new yarnwrap.text.Text(wrapperContained.failureErrorMessage); }
// public void failureErrorMessage(yarnwrap.text.Text value) { wrapperContained.failureErrorMessage = value.wrapperContained; }
public yarnwrap.text.Text ABORTED_TEXT() { return new yarnwrap.text.Text(wrapperContained.ABORTED_TEXT); }
// public void ABORTED_TEXT(yarnwrap.text.Text value) { wrapperContained.ABORTED_TEXT = value.wrapperContained; }
// public io.netty.channel.ChannelFuture future() { return wrapperContained.future; }
// public void future(io.netty.channel.ChannelFuture value) { wrapperContained.future = value; }
// public ConnectScreen(yarnwrap.client.gui.screen.Screen parent,yarnwrap.text.Text failureErrorMessage) { this.wrapperContained = new net.minecraft.client.gui.screen.multiplayer.ConnectScreen(parent.wrapperContained,failureErrorMessage.wrapperContained); }
// public void method_19800(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19800(button.wrapperContained); }
// public void connect(yarnwrap.client.MinecraftClient client,yarnwrap.client.network.ServerAddress address,yarnwrap.client.network.ServerInfo info,yarnwrap.client.network.CookieStorage cookieStorage) { wrapperContained.connect(client.wrapperContained,address.wrapperContained,info.wrapperContained,cookieStorage.wrapperContained); }
// public void setStatus(yarnwrap.text.Text status) { wrapperContained.setStatus(status.wrapperContained); }
public void connect(yarnwrap.client.gui.screen.Screen screen,yarnwrap.client.MinecraftClient client,yarnwrap.client.network.ServerAddress address,yarnwrap.client.network.ServerInfo info,boolean quickPlay,yarnwrap.client.network.CookieStorage cookieStorage) { wrapperContained.connect(screen.wrapperContained,client.wrapperContained,address.wrapperContained,info.wrapperContained,quickPlay,cookieStorage.wrapperContained); }

}