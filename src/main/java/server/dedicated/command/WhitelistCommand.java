package yarnwrap.server.dedicated.command;
public class WhitelistCommand { public net.minecraft.server.dedicated.command.WhitelistCommand wrapperContained; public WhitelistCommand(net.minecraft.server.dedicated.command.WhitelistCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_ON_EXCEPTION() { return wrapperContained.ALREADY_ON_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ADD_FAILED_EXCEPTION() { return wrapperContained.ADD_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REMOVE_FAILED_EXCEPTION() { return wrapperContained.REMOVE_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_OFF_EXCEPTION() { return wrapperContained.ALREADY_OFF_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeOff(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeOff(source.wrapperContained); }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeAdd(source.wrapperContained,targets); }
// public int executeOn(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeOn(source.wrapperContained); }
// public int executeList(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeList(source.wrapperContained); }
// public int executeRemove(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeRemove(source.wrapperContained,targets); }
// public int executeReload(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeReload(source.wrapperContained); }

}