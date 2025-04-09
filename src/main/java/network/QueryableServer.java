package yarnwrap.network;
public class QueryableServer { public net.minecraft.network.QueryableServer wrapperContained; public QueryableServer(net.minecraft.network.QueryableServer wrapperContained) { this.wrapperContained = wrapperContained; }

public int getCurrentPlayerCount() { return wrapperContained.getCurrentPlayerCount(); }
public int getMaxPlayerCount() { return wrapperContained.getMaxPlayerCount(); }
public java.lang.String getServerMotd() { return wrapperContained.getServerMotd(); }
public java.lang.String getVersion() { return wrapperContained.getVersion(); }

}