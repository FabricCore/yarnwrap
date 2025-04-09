package yarnwrap.server;
public class ServerTask { public net.minecraft.server.ServerTask wrapperContained; public ServerTask(net.minecraft.server.ServerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int creationTicks() { return wrapperContained.creationTicks; }
// public java.lang.Runnable runnable() { return wrapperContained.runnable; }
public int getCreationTicks() { return wrapperContained.getCreationTicks(); }

}