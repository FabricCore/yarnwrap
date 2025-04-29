package yarnwrap.server.command;
public class ChaseCommand { public net.minecraft.server.command.ChaseCommand wrapperContained; public ChaseCommand(net.minecraft.server.command.ChaseCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.BiMap DIMENSIONS() { return wrapperContained.DIMENSIONS; }
// public void DIMENSIONS(com.google.common.collect.BiMap value) { wrapperContained.DIMENSIONS = value; }
public static com.google.common.collect.BiMap DIMENSIONS() { return net.minecraft.server.command.ChaseCommand.DIMENSIONS; }
// public static void DIMENSIONS(com.google.common.collect.BiMap value, ) { net.minecraft.server.command.ChaseCommand.DIMENSIONS = value; }

// public java.lang.String LOCALHOST() { return wrapperContained.LOCALHOST; }
// public void LOCALHOST(java.lang.String value) { wrapperContained.LOCALHOST = value; }
// public static java.lang.String LOCALHOST() { return net.minecraft.server.command.ChaseCommand.LOCALHOST; }
// public static void LOCALHOST(java.lang.String value, ) { net.minecraft.server.command.ChaseCommand.LOCALHOST = value; }

// public java.lang.String BIND_ALL() { return wrapperContained.BIND_ALL; }
// public void BIND_ALL(java.lang.String value) { wrapperContained.BIND_ALL = value; }
// public static java.lang.String BIND_ALL() { return net.minecraft.server.command.ChaseCommand.BIND_ALL; }
// public static void BIND_ALL(java.lang.String value, ) { net.minecraft.server.command.ChaseCommand.BIND_ALL = value; }

// public int DEFAULT_PORT() { return wrapperContained.DEFAULT_PORT; }
// public void DEFAULT_PORT(int value) { wrapperContained.DEFAULT_PORT = value; }
// public static int DEFAULT_PORT() { return net.minecraft.server.command.ChaseCommand.DEFAULT_PORT; }
// public static void DEFAULT_PORT(int value, ) { net.minecraft.server.command.ChaseCommand.DEFAULT_PORT = value; }

// public int INTERVAL() { return wrapperContained.INTERVAL; }
// public void INTERVAL(int value) { wrapperContained.INTERVAL = value; }
// public static int INTERVAL() { return net.minecraft.server.command.ChaseCommand.INTERVAL; }
// public static void INTERVAL(int value, ) { net.minecraft.server.command.ChaseCommand.INTERVAL = value; }

// public yarnwrap.server.chase.ChaseServer server() { return new yarnwrap.server.chase.ChaseServer(wrapperContained.server); }
// public void server(yarnwrap.server.chase.ChaseServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.chase.ChaseServer server() { return new yarnwrap.server.chase.ChaseServer(net.minecraft.server.command.ChaseCommand.server); }
// public static void server(yarnwrap.server.chase.ChaseServer value, ) { net.minecraft.server.command.ChaseCommand.server = value.wrapperContained; }

// public yarnwrap.server.chase.ChaseClient client() { return new yarnwrap.server.chase.ChaseClient(wrapperContained.client); }
// public void client(yarnwrap.server.chase.ChaseClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.server.chase.ChaseClient client() { return new yarnwrap.server.chase.ChaseClient(net.minecraft.server.command.ChaseCommand.client); }
// public static void client(yarnwrap.server.chase.ChaseClient value, ) { net.minecraft.server.command.ChaseCommand.client = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.command.ChaseCommand.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.command.ChaseCommand.LOGGER = value; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.ChaseCommand.register(dispatcher); }
// public int method_38771(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38771(context); }
// public static int method_38771(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ChaseCommand.method_38771(context); }
// public int stop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.stop(source.wrapperContained); }
// public static int stop(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.ChaseCommand.stop(source.wrapperContained); }
// public int startServer(yarnwrap.server.command.ServerCommandSource source,java.lang.String ip,int port) { return wrapperContained.startServer(source.wrapperContained,ip,port); }
// public static int startServer(yarnwrap.server.command.ServerCommandSource source,java.lang.String ip,int port, ) { return net.minecraft.server.command.ChaseCommand.startServer(source.wrapperContained,ip,port); }
// public int method_38774(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38774(context); }
// public static int method_38774(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ChaseCommand.method_38774(context); }
// public boolean isRunning(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.isRunning(source.wrapperContained); }
// public static boolean isRunning(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.ChaseCommand.isRunning(source.wrapperContained); }
// public int startClient(yarnwrap.server.command.ServerCommandSource source,java.lang.String ip,int port) { return wrapperContained.startClient(source.wrapperContained,ip,port); }
// public static int startClient(yarnwrap.server.command.ServerCommandSource source,java.lang.String ip,int port, ) { return net.minecraft.server.command.ChaseCommand.startClient(source.wrapperContained,ip,port); }
// public int method_38777(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38777(context); }
// public static int method_38777(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ChaseCommand.method_38777(context); }
// public int method_38778(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38778(context); }
// public static int method_38778(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ChaseCommand.method_38778(context); }
// public int method_38779(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38779(context); }
// public static int method_38779(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ChaseCommand.method_38779(context); }
// public int method_38780(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38780(context); }
// public static int method_38780(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ChaseCommand.method_38780(context); }
// public int method_38781(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_38781(context); }
// public static int method_38781(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.ChaseCommand.method_38781(context); }

}