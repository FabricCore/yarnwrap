package yarnwrap.server.command;
public class DebugConfigCommand { public net.minecraft.server.command.DebugConfigCommand wrapperContained; public DebugConfigCommand(net.minecraft.server.command.DebugConfigCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeConfig(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player) { return wrapperContained.executeConfig(source.wrapperContained,player.wrapperContained); }
// public int executeUnconfig(yarnwrap.server.command.ServerCommandSource source,java.util.UUID uuid) { return wrapperContained.executeUnconfig(source.wrapperContained,uuid); }
// public java.lang.Iterable collectConfiguringPlayers(yarnwrap.server.MinecraftServer server) { return wrapperContained.collectConfiguringPlayers(server.wrapperContained); }

}