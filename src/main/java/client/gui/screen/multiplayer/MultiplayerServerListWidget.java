package yarnwrap.client.gui.screen.multiplayer;
public class MultiplayerServerListWidget { public net.minecraft.client.gui.screen.multiplayer.MultiplayerServerListWidget wrapperContained; public MultiplayerServerListWidget(net.minecraft.client.gui.screen.multiplayer.MultiplayerServerListWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.concurrent.ThreadPoolExecutor SERVER_PINGER_THREAD_POOL() { return wrapperContained.SERVER_PINGER_THREAD_POOL; }
// public yarnwrap.client.gui.screen.multiplayer.MultiplayerScreen screen() { return new yarnwrap.client.gui.screen.multiplayer.MultiplayerScreen(wrapperContained.screen); }
// public java.util.List servers() { return wrapperContained.servers; }
// public Object scanningEntry() { return wrapperContained.scanningEntry; }
// public java.util.List lanServers() { return wrapperContained.lanServers; }
// public yarnwrap.text.Text LAN_SCANNING_TEXT() { return new yarnwrap.text.Text(wrapperContained.LAN_SCANNING_TEXT); }
// public yarnwrap.text.Text CANNOT_RESOLVE_TEXT() { return new yarnwrap.text.Text(wrapperContained.CANNOT_RESOLVE_TEXT); }
// public yarnwrap.text.Text CANNOT_CONNECT_TEXT() { return new yarnwrap.text.Text(wrapperContained.CANNOT_CONNECT_TEXT); }
// public yarnwrap.text.Text INCOMPATIBLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.INCOMPATIBLE_TEXT); }
// public yarnwrap.text.Text NO_CONNECTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.NO_CONNECTION_TEXT); }
// public yarnwrap.text.Text PINGING_TEXT() { return new yarnwrap.text.Text(wrapperContained.PINGING_TEXT); }
// public yarnwrap.text.Text ONLINE_TEXT() { return new yarnwrap.text.Text(wrapperContained.ONLINE_TEXT); }
// public yarnwrap.util.Identifier MOVE_UP_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MOVE_UP_TEXTURE); }
// public yarnwrap.util.Identifier MOVE_DOWN_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MOVE_DOWN_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier MOVE_DOWN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MOVE_DOWN_TEXTURE); }
// public yarnwrap.util.Identifier INCOMPATIBLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.INCOMPATIBLE_TEXTURE); }
// public yarnwrap.util.Identifier UNREACHABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.UNREACHABLE_TEXTURE); }
// public yarnwrap.util.Identifier PING_1_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_1_TEXTURE); }
// public yarnwrap.util.Identifier PING_2_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_2_TEXTURE); }
// public yarnwrap.util.Identifier PING_3_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_3_TEXTURE); }
// public yarnwrap.util.Identifier PING_4_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_4_TEXTURE); }
// public yarnwrap.util.Identifier PING_5_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PING_5_TEXTURE); }
// public yarnwrap.util.Identifier PINGING_1_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PINGING_1_TEXTURE); }
// public yarnwrap.util.Identifier PINGING_2_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PINGING_2_TEXTURE); }
// public yarnwrap.util.Identifier PINGING_3_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PINGING_3_TEXTURE); }
// public yarnwrap.util.Identifier PINGING_4_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PINGING_4_TEXTURE); }
// public yarnwrap.util.Identifier PINGING_5_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.PINGING_5_TEXTURE); }
// public yarnwrap.util.Identifier JOIN_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JOIN_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier JOIN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.JOIN_TEXTURE); }
// public yarnwrap.util.Identifier MOVE_UP_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MOVE_UP_HIGHLIGHTED_TEXTURE); }
public void setServers(yarnwrap.client.option.ServerList servers) { wrapperContained.setServers(servers.wrapperContained); }
public void setLanServers(java.util.List lanServers) { wrapperContained.setLanServers(lanServers); }
// public void updateEntries() { wrapperContained.updateEntries(); }
public void onRemoved() { wrapperContained.onRemoved(); }

}