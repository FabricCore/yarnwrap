package yarnwrap.server.dedicated;
public class DedicatedServer { public net.minecraft.server.dedicated.DedicatedServer wrapperContained; public DedicatedServer(net.minecraft.server.dedicated.DedicatedServer wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getPlugins() { return wrapperContained.getPlugins(); }
public int getPort() { return wrapperContained.getPort(); }
public java.lang.String getHostname() { return wrapperContained.getHostname(); }
public java.lang.String getMotd() { return wrapperContained.getMotd(); }
public java.lang.String executeRconCommand(java.lang.String command) { return wrapperContained.executeRconCommand(command); }
public yarnwrap.server.dedicated.ServerPropertiesHandler getProperties() { return new yarnwrap.server.dedicated.ServerPropertiesHandler(wrapperContained.getProperties()); }
public java.lang.String[] getPlayerNames() { return wrapperContained.getPlayerNames(); }
public java.lang.String getLevelName() { return wrapperContained.getLevelName(); }

}