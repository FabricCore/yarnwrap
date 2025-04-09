package yarnwrap.server.command;
public class ChaseCommand { public net.minecraft.server.command.ChaseCommand wrapperContained; public ChaseCommand(net.minecraft.server.command.ChaseCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public com.google.common.collect.BiMap DIMENSIONS() { return wrapperContained.DIMENSIONS; }
// public java.lang.String LOCALHOST() { return wrapperContained.LOCALHOST; }
// public java.lang.String BIND_ALL() { return wrapperContained.BIND_ALL; }
// public int DEFAULT_PORT() { return wrapperContained.DEFAULT_PORT; }
// public int INTERVAL() { return wrapperContained.INTERVAL; }
// public yarnwrap.server.chase.ChaseServer server() { return new yarnwrap.server.chase.ChaseServer(wrapperContained.server); }
// public yarnwrap.server.chase.ChaseClient client() { return new yarnwrap.server.chase.ChaseClient(wrapperContained.client); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int stop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.stop(source.wrapperContained); }
// public int startServer(yarnwrap.server.command.ServerCommandSource source,java.lang.String ip,int port) { return wrapperContained.startServer(source.wrapperContained,ip,port); }
// public boolean isRunning(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.isRunning(source.wrapperContained); }
// public int startClient(yarnwrap.server.command.ServerCommandSource source,java.lang.String ip,int port) { return wrapperContained.startClient(source.wrapperContained,ip,port); }

}