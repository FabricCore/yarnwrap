package yarnwrap.server.command;
public class GameModeCommand { public net.minecraft.server.command.GameModeCommand wrapperContained; public GameModeCommand(net.minecraft.server.command.GameModeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int REQUIRED_PERMISSION_LEVEL() { return wrapperContained.REQUIRED_PERMISSION_LEVEL; }
// public void REQUIRED_PERMISSION_LEVEL(int value) { wrapperContained.REQUIRED_PERMISSION_LEVEL = value; }
public static int REQUIRED_PERMISSION_LEVEL() { return net.minecraft.server.command.GameModeCommand.REQUIRED_PERMISSION_LEVEL; }
// public static void REQUIRED_PERMISSION_LEVEL(int value, ) { net.minecraft.server.command.GameModeCommand.REQUIRED_PERMISSION_LEVEL = value; }

// public int execute(com.mojang.brigadier.context.CommandContext context,java.util.Collection targets,yarnwrap.world.GameMode gameMode) { return wrapperContained.execute(context,targets,gameMode.wrapperContained); }
// public static int execute(com.mojang.brigadier.context.CommandContext context,java.util.Collection targets,yarnwrap.world.GameMode gameMode, ) { return net.minecraft.server.command.GameModeCommand.execute(context,targets,gameMode.wrapperContained); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.GameModeCommand.register(dispatcher); }
// public boolean method_13389(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13389(source.wrapperContained); }
// public static boolean method_13389(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.GameModeCommand.method_13389(source.wrapperContained); }
// public void sendFeedback(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.GameMode gameMode) { wrapperContained.sendFeedback(source.wrapperContained,player.wrapperContained,gameMode.wrapperContained); }
// public static void sendFeedback(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.world.GameMode gameMode, ) { net.minecraft.server.command.GameModeCommand.sendFeedback(source.wrapperContained,player.wrapperContained,gameMode.wrapperContained); }

}