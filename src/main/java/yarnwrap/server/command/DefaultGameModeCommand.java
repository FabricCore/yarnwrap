package yarnwrap.server.command;
public class DefaultGameModeCommand { public net.minecraft.server.command.DefaultGameModeCommand wrapperContained; public DefaultGameModeCommand(net.minecraft.server.command.DefaultGameModeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.DefaultGameModeCommand.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.world.GameMode defaultGameMode) { return wrapperContained.execute(source.wrapperContained,defaultGameMode.wrapperContained); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.world.GameMode defaultGameMode, ) { return net.minecraft.server.command.DefaultGameModeCommand.execute(source.wrapperContained,defaultGameMode.wrapperContained); }

}