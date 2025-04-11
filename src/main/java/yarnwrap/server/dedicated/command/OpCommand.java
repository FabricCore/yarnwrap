package yarnwrap.server.dedicated.command;
public class OpCommand { public net.minecraft.server.dedicated.command.OpCommand wrapperContained; public OpCommand(net.minecraft.server.dedicated.command.OpCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ALREADY_OPPED_EXCEPTION() { return wrapperContained.ALREADY_OPPED_EXCEPTION; }
// public void ALREADY_OPPED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ALREADY_OPPED_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int op(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.op(source.wrapperContained,targets); }
// public boolean method_13466(yarnwrap.server.PlayerManager player) { return wrapperContained.method_13466(player.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_13467(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13467(context,builder); }
// public int method_13468(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13468(context); }
// public java.lang.String method_13469(yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.method_13469(player.wrapperContained); }
// public boolean method_13470(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13470(source.wrapperContained); }

}