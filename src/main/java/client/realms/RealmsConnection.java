package yarnwrap.client.realms;
public class RealmsConnection { public net.minecraft.client.realms.RealmsConnection wrapperContained; public RealmsConnection(net.minecraft.client.realms.RealmsConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.gui.screen.Screen onlineScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.onlineScreen); }
// public boolean aborted() { return wrapperContained.aborted; }
// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
public void abort() { wrapperContained.abort(); }
public void connect(yarnwrap.client.realms.dto.RealmsServer server,yarnwrap.client.network.ServerAddress address) { wrapperContained.connect(server.wrapperContained,address.wrapperContained); }
public void tick() { wrapperContained.tick(); }

}