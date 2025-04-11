package yarnwrap.server.command;
public class ChaseCommand { public net.minecraft.server.command.ChaseCommand wrapperContained; public ChaseCommand(net.minecraft.server.command.ChaseCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public com.google.common.collect.BiMap DIMENSIONS() { return wrapperContained.DIMENSIONS; }
public void DIMENSIONS(com.google.common.collect.BiMap value) { wrapperContained.DIMENSIONS = value; }
// public java.lang.String LOCALHOST() { return wrapperContained.LOCALHOST; }
// public void LOCALHOST(java.lang.String value) { wrapperContained.LOCALHOST = value; }
// public java.lang.String BIND_ALL() { return wrapperContained.BIND_ALL; }
// public void BIND_ALL(java.lang.String value) { wrapperContained.BIND_ALL = value; }
// public int DEFAULT_PORT() { return wrapperContained.DEFAULT_PORT; }
// public void DEFAULT_PORT(int value) { wrapperContained.DEFAULT_PORT = value; }
// public int INTERVAL() { return wrapperContained.INTERVAL; }
// public void INTERVAL(int value) { wrapperContained.INTERVAL = value; }
// public yarnwrap.server.chase.ChaseServer server() { return new yarnwrap.server.chase.ChaseServer(wrapperContained.server); }
// public void server(yarnwrap.server.chase.ChaseServer value) { wrapperContained.server = value.wrapperContained; }
// public yarnwrap.server.chase.ChaseClient client() { return new yarnwrap.server.chase.ChaseClient(wrapperContained.client); }
// public void client(yarnwrap.server.chase.ChaseClient value) { wrapperContained.client = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int stop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.stop(source.wrapperContained); }
// public int startServer(yarnwrap.server.command.ServerCommandSource source,java.lang.String ip,int port) { return wrapperContained.startServer(source.wrapperContained,ip,port); }
// public boolean isRunning(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.isRunning(source.wrapperContained); }
// public int startClient(yarnwrap.server.command.ServerCommandSource source,java.lang.String ip,int port) { return wrapperContained.startClient(source.wrapperContained,ip,port); }

}