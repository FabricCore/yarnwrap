package yarnwrap.network;
public class QueryableServer { public net.minecraft.network.QueryableServer wrapperContained; public QueryableServer(net.minecraft.network.QueryableServer wrapperContained) { this.wrapperContained = wrapperContained; }

public int getCurrentPlayerCount() { return wrapperContained.getCurrentPlayerCount(); }
// public static int getCurrentPlayerCount() { return net.minecraft.network.QueryableServer.getCurrentPlayerCount(); }
public int getMaxPlayerCount() { return wrapperContained.getMaxPlayerCount(); }
// public static int getMaxPlayerCount() { return net.minecraft.network.QueryableServer.getMaxPlayerCount(); }
public java.lang.String getServerMotd() { return wrapperContained.getServerMotd(); }
// public static java.lang.String getServerMotd() { return net.minecraft.network.QueryableServer.getServerMotd(); }
public java.lang.String getVersion() { return wrapperContained.getVersion(); }
// public static java.lang.String getVersion() { return net.minecraft.network.QueryableServer.getVersion(); }

}