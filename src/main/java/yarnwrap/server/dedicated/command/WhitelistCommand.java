package yarnwrap.server.dedicated.command;
public class WhitelistCommand { public net.minecraft.server.dedicated.command.WhitelistCommand wrapperContained; public WhitelistCommand(net.minecraft.server.dedicated.command.WhitelistCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_ON_EXCEPTION() { return wrapperContained.ALREADY_ON_EXCEPTION; }
// public void ALREADY_ON_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_ON_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ADD_FAILED_EXCEPTION() { return wrapperContained.ADD_FAILED_EXCEPTION; }
// public void ADD_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ADD_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REMOVE_FAILED_EXCEPTION() { return wrapperContained.REMOVE_FAILED_EXCEPTION; }
// public void REMOVE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.REMOVE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_OFF_EXCEPTION() { return wrapperContained.ALREADY_OFF_EXCEPTION; }
// public void ALREADY_OFF_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_OFF_EXCEPTION = value; }
// public int method_13834(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13834(context); }
// public int method_13835(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13835(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeOff(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeOff(source.wrapperContained); }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeAdd(source.wrapperContained,targets); }
// public int executeOn(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeOn(source.wrapperContained); }
// public int executeList(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeList(source.wrapperContained); }
// public boolean method_13841(yarnwrap.server.PlayerManager player) { return wrapperContained.method_13841(player.wrapperContained); }
// public int method_13842(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13842(context); }
// public int method_13843(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13843(context); }
// public java.lang.String method_13844(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.method_13844(player.wrapperContained); }
// public int executeRemove(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeRemove(source.wrapperContained,targets); }
// public int method_13846(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13846(context); }
// public boolean method_13847(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13847(source.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_13848(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13848(context,builder); }
// public java.util.concurrent.CompletableFuture method_13849(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13849(context,builder); }
// public int executeReload(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeReload(source.wrapperContained); }
// public int method_13851(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13851(context); }

}