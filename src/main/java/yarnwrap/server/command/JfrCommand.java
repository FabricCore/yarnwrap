package yarnwrap.server.command;
public class JfrCommand { public net.minecraft.server.command.JfrCommand wrapperContained; public JfrCommand(net.minecraft.server.command.JfrCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType JFR_START_FAILED_EXCEPTION() { return wrapperContained.JFR_START_FAILED_EXCEPTION; }
// public void JFR_START_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.JFR_START_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType JFR_DUMP_FAILED_EXCEPTION() { return wrapperContained.JFR_DUMP_FAILED_EXCEPTION; }
// public void JFR_DUMP_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.JFR_DUMP_FAILED_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeStart(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStart(source.wrapperContained); }
// public int executeStop(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStop(source.wrapperContained); }

}