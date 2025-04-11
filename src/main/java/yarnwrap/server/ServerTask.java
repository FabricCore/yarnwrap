package yarnwrap.server;
public class ServerTask { public net.minecraft.server.ServerTask wrapperContained; public ServerTask(net.minecraft.server.ServerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int creationTicks() { return wrapperContained.creationTicks; }
// public void creationTicks(int value) { wrapperContained.creationTicks = value; }
// public java.lang.Runnable runnable() { return wrapperContained.runnable; }
// public void runnable(java.lang.Runnable value) { wrapperContained.runnable = value; }
public ServerTask(int creationTicks,java.lang.Runnable runnable) { this.wrapperContained = new net.minecraft.server.ServerTask(creationTicks,runnable); }
public int getCreationTicks() { return wrapperContained.getCreationTicks(); }

}