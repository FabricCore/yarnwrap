package yarnwrap.server.command;
public class DebugConfigCommand { public net.minecraft.server.command.DebugConfigCommand wrapperContained; public DebugConfigCommand(net.minecraft.server.command.DebugConfigCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.DebugConfigCommand.register(dispatcher); }
// public int method_52300(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52300(context); }
// public static int method_52300(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.DebugConfigCommand.method_52300(context); }
// public java.util.concurrent.CompletableFuture method_52301(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.method_52301(context,suggestionsBuilder); }
// public static java.util.concurrent.CompletableFuture method_52301(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder, ) { return net.minecraft.server.command.DebugConfigCommand.method_52301(context,suggestionsBuilder); }
// public boolean method_52302(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_52302(source.wrapperContained); }
// public static boolean method_52302(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.DebugConfigCommand.method_52302(source.wrapperContained); }
// public int executeConfig(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.executeConfig(source.wrapperContained,player.wrapperContained); }
// public static int executeConfig(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player, ) { return net.minecraft.server.command.DebugConfigCommand.executeConfig(source.wrapperContained,player.wrapperContained); }
// public int executeUnconfig(yarnwrap.server.command.ServerCommandSource source,java.util.UUID uuid) { return wrapperContained.executeUnconfig(source.wrapperContained,uuid); }
// public static int executeUnconfig(yarnwrap.server.command.ServerCommandSource source,java.util.UUID uuid, ) { return net.minecraft.server.command.DebugConfigCommand.executeUnconfig(source.wrapperContained,uuid); }
// public java.lang.Iterable collectConfiguringPlayers(yarnwrap.server.MinecraftServer server) { return wrapperContained.collectConfiguringPlayers(server.wrapperContained); }
// public static java.lang.Iterable collectConfiguringPlayers(yarnwrap.server.MinecraftServer server, ) { return net.minecraft.server.command.DebugConfigCommand.collectConfiguringPlayers(server.wrapperContained); }
// public int method_52306(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52306(context); }
// public static int method_52306(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.DebugConfigCommand.method_52306(context); }

}