package yarnwrap.server.dedicated;
public class DedicatedServer { public net.minecraft.server.dedicated.DedicatedServer wrapperContained; public DedicatedServer(net.minecraft.server.dedicated.DedicatedServer wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String[] getPlayerNames() { return wrapperContained.getPlayerNames(); }
// public static java.lang.String[] getPlayerNames() { return net.minecraft.server.dedicated.DedicatedServer.getPlayerNames(); }
public java.lang.String getLevelName() { return wrapperContained.getLevelName(); }
// public static java.lang.String getLevelName() { return net.minecraft.server.dedicated.DedicatedServer.getLevelName(); }
public java.lang.String getPlugins() { return wrapperContained.getPlugins(); }
// public static java.lang.String getPlugins() { return net.minecraft.server.dedicated.DedicatedServer.getPlugins(); }
public int getPort() { return wrapperContained.getPort(); }
// public static int getPort() { return net.minecraft.server.dedicated.DedicatedServer.getPort(); }
public java.lang.String getHostname() { return wrapperContained.getHostname(); }
// public static java.lang.String getHostname() { return net.minecraft.server.dedicated.DedicatedServer.getHostname(); }
public java.lang.String getMotd() { return wrapperContained.getMotd(); }
// public static java.lang.String getMotd() { return net.minecraft.server.dedicated.DedicatedServer.getMotd(); }
public java.lang.String executeRconCommand(java.lang.String command) { return wrapperContained.executeRconCommand(command); }
// public static java.lang.String executeRconCommand(java.lang.String command, ) { return net.minecraft.server.dedicated.DedicatedServer.executeRconCommand(command); }
public yarnwrap.server.dedicated.ServerPropertiesHandler getProperties() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.getProperties()); }
// public static yarnwrap.server.dedicated.ServerPropertiesHandler getProperties() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(net.minecraft.server.dedicated.DedicatedServer.getProperties()); }

}