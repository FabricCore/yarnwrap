package yarnwrap.server.dedicated.command;
public class PardonCommand { public net.minecraft.server.dedicated.command.PardonCommand wrapperContained; public PardonCommand(net.minecraft.server.dedicated.command.PardonCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_UNBANNED_EXCEPTION() { return wrapperContained.ALREADY_UNBANNED_EXCEPTION; }
// public void ALREADY_UNBANNED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_UNBANNED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_UNBANNED_EXCEPTION() { return net.minecraft.server.dedicated.command.PardonCommand.ALREADY_UNBANNED_EXCEPTION; }
// public static void ALREADY_UNBANNED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.dedicated.command.PardonCommand.ALREADY_UNBANNED_EXCEPTION = value; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.dedicated.command.PardonCommand.register(dispatcher); }
// public int pardon(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.pardon(source.wrapperContained,targets); }
// public static int pardon(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets, ) { return net.minecraft.server.dedicated.command.PardonCommand.pardon(source.wrapperContained,targets); }
// public java.util.concurrent.CompletableFuture method_13474(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13474(context,builder); }
// public static java.util.concurrent.CompletableFuture method_13474(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.server.dedicated.command.PardonCommand.method_13474(context,builder); }
// public int method_13475(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13475(context); }
// public static int method_13475(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.dedicated.command.PardonCommand.method_13475(context); }

}