package yarnwrap.server.dedicated.command;
public class PardonCommand { public net.minecraft.server.dedicated.command.PardonCommand wrapperContained; public PardonCommand(net.minecraft.server.dedicated.command.PardonCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_UNBANNED_EXCEPTION() { return wrapperContained.ALREADY_UNBANNED_EXCEPTION; }
// public void ALREADY_UNBANNED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_UNBANNED_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int pardon(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.pardon(source.wrapperContained,targets); }
// public java.util.concurrent.CompletableFuture method_13474(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13474(context,builder); }
// public int method_13475(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13475(context); }
// public boolean method_13476(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13476(source.wrapperContained); }

}