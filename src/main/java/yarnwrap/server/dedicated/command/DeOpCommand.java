package yarnwrap.server.dedicated.command;
public class DeOpCommand { public net.minecraft.server.dedicated.command.DeOpCommand wrapperContained; public DeOpCommand(net.minecraft.server.dedicated.command.DeOpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_DEOPPED_EXCEPTION() { return wrapperContained.ALREADY_DEOPPED_EXCEPTION; }
// public void ALREADY_DEOPPED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_DEOPPED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_DEOPPED_EXCEPTION() { return net.minecraft.server.dedicated.command.DeOpCommand.ALREADY_DEOPPED_EXCEPTION; }
// public static void ALREADY_DEOPPED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.dedicated.command.DeOpCommand.ALREADY_DEOPPED_EXCEPTION = value; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.dedicated.command.DeOpCommand.register(dispatcher); }
// public int deop(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.deop(source.wrapperContained,targets); }
// public static int deop(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets, ) { return net.minecraft.server.dedicated.command.DeOpCommand.deop(source.wrapperContained,targets); }
// public java.util.concurrent.CompletableFuture method_13145(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13145(context,builder); }
// public static java.util.concurrent.CompletableFuture method_13145(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.server.dedicated.command.DeOpCommand.method_13145(context,builder); }
// public int method_13146(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13146(context); }
// public static int method_13146(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.dedicated.command.DeOpCommand.method_13146(context); }
// public boolean method_13147(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13147(source.wrapperContained); }
// public static boolean method_13147(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.dedicated.command.DeOpCommand.method_13147(source.wrapperContained); }

}