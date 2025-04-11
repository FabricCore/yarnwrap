package yarnwrap.server.command;
public class DebugConfigCommand { public net.minecraft.server.command.DebugConfigCommand wrapperContained; public DebugConfigCommand(net.minecraft.server.command.DebugConfigCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_52300(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52300(context); }
// public java.util.concurrent.CompletableFuture method_52301(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.method_52301(context,suggestionsBuilder); }
// public boolean method_52302(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_52302(source.wrapperContained); }
// public int executeConfig(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.executeConfig(source.wrapperContained,player.wrapperContained); }
// public int executeUnconfig(yarnwrap.server.command.ServerCommandSource source,java.util.UUID uuid) { return wrapperContained.executeUnconfig(source.wrapperContained,uuid); }
// public java.lang.Iterable collectConfiguringPlayers(yarnwrap.server.MinecraftServer server) { return wrapperContained.collectConfiguringPlayers(server.wrapperContained); }
// public int method_52306(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52306(context); }

}