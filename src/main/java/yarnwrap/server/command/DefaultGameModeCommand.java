package yarnwrap.server.command;
public class DefaultGameModeCommand { public net.minecraft.server.command.DefaultGameModeCommand wrapperContained; public DefaultGameModeCommand(net.minecraft.server.command.DefaultGameModeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.world.GameMode defaultGameMode) { return wrapperContained.execute(source.wrapperContained,defaultGameMode.wrapperContained); }
// public boolean method_13168(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13168(source.wrapperContained); }

}