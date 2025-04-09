package yarnwrap.client.gui.screen.multiplayer;
public class MultiplayerScreen { public net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen wrapperContained; public MultiplayerScreen(net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.MultiplayerServerListPinger serverListPinger() { return new yarnwrap.client.network.MultiplayerServerListPinger(wrapperContained.serverListPinger); }
// public yarnwrap.client.option.ServerList serverList() { return new yarnwrap.client.option.ServerList(wrapperContained.serverList); }
// public yarnwrap.client.gui.widget.ButtonWidget buttonEdit() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.buttonEdit); }
// public yarnwrap.client.gui.screen.multiplayer.MultiplayerServerListWidget serverListWidget() { return new yarnwrap.client.gui.screen.multiplayer.MultiplayerServerListWidget(wrapperContained.serverListWidget); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public Object lanServerDetector() { return wrapperContained.lanServerDetector; }
// public Object lanServers() { return wrapperContained.lanServers; }
// public yarnwrap.client.gui.widget.ButtonWidget buttonDelete() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.buttonDelete); }
// public boolean initialized() { return wrapperContained.initialized; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public yarnwrap.client.gui.widget.ButtonWidget buttonJoin() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.buttonJoin); }
// public yarnwrap.client.network.ServerInfo selectedEntry() { return new yarnwrap.client.network.ServerInfo(wrapperContained.selectedEntry); }
// public void updateButtonActivationStates() { wrapperContained.updateButtonActivationStates(); }
// public void removeEntry(boolean confirmedAction) { wrapperContained.removeEntry(confirmedAction); }
// public void editEntry(boolean confirmedAction) { wrapperContained.editEntry(confirmedAction); }
// public void addEntry(boolean confirmedAction) { wrapperContained.addEntry(confirmedAction); }
// public void directConnect(boolean confirmedAction) { wrapperContained.directConnect(confirmedAction); }
public yarnwrap.client.option.ServerList getServerList() { return new yarnwrap.client.option.ServerList(wrapperContained.getServerList()); }
// public void select(Object entry) { wrapperContained.select(entry); }
// public void refresh() { wrapperContained.refresh(); }
public void connect() { wrapperContained.connect(); }
public yarnwrap.client.network.MultiplayerServerListPinger getServerListPinger() { return new yarnwrap.client.network.MultiplayerServerListPinger(wrapperContained.getServerListPinger()); }
// public void connect(yarnwrap.client.network.ServerInfo entry) { wrapperContained.connect(entry.wrapperContained); }

}