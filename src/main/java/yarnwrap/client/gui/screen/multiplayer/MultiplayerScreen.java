package yarnwrap.client.gui.screen.multiplayer;
public class MultiplayerScreen { public net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen wrapperContained; public MultiplayerScreen(net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.MultiplayerServerListPinger serverListPinger() { return new yarnwrap.client.network.MultiplayerServerListPinger(wrapperContained.serverListPinger); }
// public void serverListPinger(yarnwrap.client.network.MultiplayerServerListPinger value) { wrapperContained.serverListPinger = value.wrapperContained; }
// public yarnwrap.client.option.ServerList serverList() { return new yarnwrap.client.option.ServerList(wrapperContained.serverList); }
// public void serverList(yarnwrap.client.option.ServerList value) { wrapperContained.serverList = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget buttonEdit() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.buttonEdit); }
// public void buttonEdit(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.buttonEdit = value.wrapperContained; }
// public yarnwrap.client.gui.screen.multiplayer.MultiplayerServerListWidget serverListWidget() { return new yarnwrap.client.gui.screen.multiplayer.MultiplayerServerListWidget(wrapperContained.serverListWidget); }
// public void serverListWidget(yarnwrap.client.gui.screen.multiplayer.MultiplayerServerListWidget value) { wrapperContained.serverListWidget = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object lanServerDetector() { return wrapperContained.lanServerDetector; }
// // public void lanServerDetector(Object value) { wrapperContained.lanServerDetector = value; }
// public Object lanServers() { return wrapperContained.lanServers; }
// // public void lanServers(Object value) { wrapperContained.lanServers = value; }
// public yarnwrap.client.gui.widget.ButtonWidget buttonDelete() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.buttonDelete); }
// public void buttonDelete(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.buttonDelete = value.wrapperContained; }
// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ButtonWidget buttonJoin() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.buttonJoin); }
// public void buttonJoin(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.buttonJoin = value.wrapperContained; }
// public yarnwrap.client.network.ServerInfo selectedEntry() { return new yarnwrap.client.network.ServerInfo(wrapperContained.selectedEntry); }
// public void selectedEntry(yarnwrap.client.network.ServerInfo value) { wrapperContained.selectedEntry = value.wrapperContained; }
public MultiplayerScreen(yarnwrap.client.gui.screen.Screen parent) { this.wrapperContained = new net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen(parent.wrapperContained); }
// public void method_19912(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19912(button.wrapperContained); }
// public void method_19913(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19913(button.wrapperContained); }
// public void method_19914(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19914(button.wrapperContained); }
// public void method_19915(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19915(button.wrapperContained); }
// public void method_19916(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19916(button.wrapperContained); }
// public void method_19917(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19917(button.wrapperContained); }
// public void method_19918(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19918(button.wrapperContained); }
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