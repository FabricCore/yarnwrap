package yarnwrap.server.command;
public class DebugCommand { public net.minecraft.server.command.DebugCommand wrapperContained; public DebugCommand(net.minecraft.server.command.DebugCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_RUNNING_EXCEPTION() { return wrapperContained.ALREADY_RUNNING_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_RUNNING_EXCEPTION() { return wrapperContained.NOT_RUNNING_EXCEPTION; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_RECURSION_EXCEPTION() { return wrapperContained.NO_RECURSION_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_RETURN_RUN_EXCEPTION() { return wrapperContained.NO_RETURN_RUN_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeStop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStop(source.wrapperContained); }
// public int executeStart(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStart(source.wrapperContained); }

}