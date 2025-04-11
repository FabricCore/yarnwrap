package yarnwrap.server.dedicated.command;
public class PerfCommand { public net.minecraft.server.dedicated.command.PerfCommand wrapperContained; public PerfCommand(net.minecraft.server.dedicated.command.PerfCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_RUNNING_EXCEPTION() { return wrapperContained.NOT_RUNNING_EXCEPTION; }
// public void NOT_RUNNING_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NOT_RUNNING_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_RUNNING_EXCEPTION() { return wrapperContained.ALREADY_RUNNING_EXCEPTION; }
// public void ALREADY_RUNNING_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_RUNNING_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_37332(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_37332(context); }
// public int executeStart(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStart(source.wrapperContained); }
// public void sendProfilingStoppedMessage(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.profiler.ProfileResult result) { wrapperContained.sendProfilingStoppedMessage(source.wrapperContained,result.wrapperContained); }
// public void saveReport(yarnwrap.server.command.ServerCommandSource source,java.nio.file.Path tempProfilingDirectory,yarnwrap.server.MinecraftServer server) { wrapperContained.saveReport(source.wrapperContained,tempProfilingDirectory,server.wrapperContained); }
// public void method_37336(yarnwrap.server.command.ServerCommandSource dumpDirectory) { wrapperContained.method_37336(dumpDirectory.wrapperContained); }
// public int method_37337(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_37337(context); }
// public int executeStop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStop(source.wrapperContained); }
// public void method_37339(yarnwrap.server.command.ServerCommandSource result) { wrapperContained.method_37339(result.wrapperContained); }
// public boolean method_37340(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_37340(source.wrapperContained); }

}