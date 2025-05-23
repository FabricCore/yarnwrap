package yarnwrap.server.command;
public class GameRuleCommand { public net.minecraft.server.command.GameRuleCommand wrapperContained; public GameRuleCommand(net.minecraft.server.command.GameRuleCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess, ) { net.minecraft.server.command.GameRuleCommand.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int executeSet(com.mojang.brigadier.context.CommandContext context,Object key) { return wrapperContained.executeSet(context,key); }
// public static int executeSet(com.mojang.brigadier.context.CommandContext context,Object key, ) { return net.minecraft.server.command.GameRuleCommand.executeSet(context,key); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source,Object key) { return wrapperContained.executeQuery(source.wrapperContained,key); }
// public static int executeQuery(yarnwrap.server.command.ServerCommandSource source,Object key, ) { return net.minecraft.server.command.GameRuleCommand.executeQuery(source.wrapperContained,key); }

}