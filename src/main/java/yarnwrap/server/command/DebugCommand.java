package yarnwrap.server.command;
public class DebugCommand { public net.minecraft.server.command.DebugCommand wrapperContained; public DebugCommand(net.minecraft.server.command.DebugCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_RUNNING_EXCEPTION() { return wrapperContained.ALREADY_RUNNING_EXCEPTION; }
// public void ALREADY_RUNNING_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_RUNNING_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NOT_RUNNING_EXCEPTION() { return wrapperContained.NOT_RUNNING_EXCEPTION; }
// public void NOT_RUNNING_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NOT_RUNNING_EXCEPTION = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_RECURSION_EXCEPTION() { return wrapperContained.NO_RECURSION_EXCEPTION; }
// public void NO_RECURSION_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NO_RECURSION_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NO_RETURN_RUN_EXCEPTION() { return wrapperContained.NO_RETURN_RUN_EXCEPTION; }
// public void NO_RETURN_RUN_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NO_RETURN_RUN_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeStop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStop(source.wrapperContained); }
// public int executeStart(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStart(source.wrapperContained); }

}