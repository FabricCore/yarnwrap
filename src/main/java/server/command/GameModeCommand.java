package yarnwrap.server.command;
public class GameModeCommand { public net.minecraft.server.command.GameModeCommand wrapperContained; public GameModeCommand(net.minecraft.server.command.GameModeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public int REQUIRED_PERMISSION_LEVEL() { return wrapperContained.REQUIRED_PERMISSION_LEVEL; }
// public int execute(com.mojang.brigadier.context.CommandContext context,java.util.Collection targets,yarnwrap.world.GameMode gameMode) { return wrapperContained.execute(context,targets,gameMode.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public void sendFeedback(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.GameMode gameMode) { wrapperContained.sendFeedback(source.wrapperContained,player.wrapperContained,gameMode.wrapperContained); }

}