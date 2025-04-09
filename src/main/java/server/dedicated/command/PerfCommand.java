package yarnwrap.server.dedicated.command;
public class PerfCommand { public net.minecraft.server.dedicated.command.PerfCommand wrapperContained; public PerfCommand(net.minecraft.server.dedicated.command.PerfCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_RUNNING_EXCEPTION() { return wrapperContained.NOT_RUNNING_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_RUNNING_EXCEPTION() { return wrapperContained.ALREADY_RUNNING_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeStart(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStart(source.wrapperContained); }
// public void sendProfilingStoppedMessage(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.profiler.ProfileResult result) { wrapperContained.sendProfilingStoppedMessage(source.wrapperContained,result.wrapperContained); }
// public void saveReport(yarnwrap.server.command.ServerCommandSource source,java.nio.file.Path tempProfilingDirectory,yarnwrap.server.MinecraftServer server) { wrapperContained.saveReport(source.wrapperContained,tempProfilingDirectory,server.wrapperContained); }
// public int executeStop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStop(source.wrapperContained); }

}