package yarnwrap.client.realms;
public class RealmsConnection { public net.minecraft.client.realms.RealmsConnection wrapperContained; public RealmsConnection(net.minecraft.client.realms.RealmsConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.RealmsConnection.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.RealmsConnection.LOGGER = value; }

// public yarnwrap.client.gui.screen.Screen onlineScreen() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.onlineScreen); }
// public void onlineScreen(yarnwrap.client.gui.screen.Screen value) { wrapperContained.onlineScreen = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.Screen onlineScreen() { return new yarnwrap.client.gui.screen.Screen(net.minecraft.client.realms.RealmsConnection.onlineScreen); }
// public static void onlineScreen(yarnwrap.client.gui.screen.Screen value, ) { net.minecraft.client.realms.RealmsConnection.onlineScreen = value.wrapperContained; }

// public boolean aborted() { return wrapperContained.aborted; }
// public void aborted(boolean value) { wrapperContained.aborted = value; }
// public static boolean aborted() { return net.minecraft.client.realms.RealmsConnection.aborted; }
// public static void aborted(boolean value, ) { net.minecraft.client.realms.RealmsConnection.aborted = value; }

// public yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(wrapperContained.connection); }
// public void connection(yarnwrap.network.ClientConnection value) { wrapperContained.connection = value.wrapperContained; }
// public static yarnwrap.network.ClientConnection connection() { return new yarnwrap.network.ClientConnection(net.minecraft.client.realms.RealmsConnection.connection); }
// public static void connection(yarnwrap.network.ClientConnection value, ) { net.minecraft.client.realms.RealmsConnection.connection = value.wrapperContained; }

public RealmsConnection(yarnwrap.client.gui.screen.Screen onlineScreen) { this.wrapperContained = new net.minecraft.client.realms.RealmsConnection(onlineScreen.wrapperContained); }
public void abort() { wrapperContained.abort(); }
// public static void abort() { net.minecraft.client.realms.RealmsConnection.abort(); }
public void connect(yarnwrap.client.realms.dto.RealmsServer server,yarnwrap.client.network.ServerAddress address) { wrapperContained.connect(server.wrapperContained,address.wrapperContained); }
// public static void connect(yarnwrap.client.realms.dto.RealmsServer server,yarnwrap.client.network.ServerAddress address, ) { net.minecraft.client.realms.RealmsConnection.connect(server.wrapperContained,address.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.realms.RealmsConnection.tick(); }

}