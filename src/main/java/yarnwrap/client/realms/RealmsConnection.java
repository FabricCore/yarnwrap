package yarnwrap.client.realms;
public class RealmsConnection { public net.minecraft.client.realms.RealmsConnection wrapperContained; public RealmsConnection(net.minecraft.client.realms.RealmsConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.gui.screen.Screen onlineScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.onlineScreen); }
// public void onlineScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.onlineScreen = value.wrapperContained; }
// public boolean aborted() { return wrapperContained.aborted; }
// public void aborted(boolean value) { wrapperContained.aborted = value; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
public RealmsConnection(yarnwrap.client.gui.screen.Screen onlineScreen) { this.wrapperContained = new net.minecraft.client.realms.RealmsConnection(onlineScreen.wrapperContained); }
public void abort() { wrapperContained.abort(); }
public void connect(yarnwrap.client.realms.dto.RealmsServer server,yarnwrap.client.network.ServerAddress address) { wrapperContained.connect(server.wrapperContained,address.wrapperContained); }
public void tick() { wrapperContained.tick(); }

}