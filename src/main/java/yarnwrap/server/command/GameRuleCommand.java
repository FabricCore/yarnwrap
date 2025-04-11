package yarnwrap.server.command;
public class GameRuleCommand { public net.minecraft.server.command.GameRuleCommand wrapperContained; public GameRuleCommand(net.minecraft.server.command.GameRuleCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeSet(com.mojang.brigadier.context.CommandContext context,Object key) { return wrapperContained.executeSet(context,key); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source,Object key) { return wrapperContained.executeQuery(source.wrapperContained,key); }

}