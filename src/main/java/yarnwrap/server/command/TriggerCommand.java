package yarnwrap.server.command;
public class TriggerCommand { public net.minecraft.server.command.TriggerCommand wrapperContained; public TriggerCommand(net.minecraft.server.command.TriggerCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_UNPRIMED_EXCEPTION() { return wrapperContained.FAILED_UNPRIMED_EXCEPTION; }
// public void FAILED_UNPRIMED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_UNPRIMED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_UNPRIMED_EXCEPTION() { return net.minecraft.server.command.TriggerCommand.FAILED_UNPRIMED_EXCEPTION; }
// public static void FAILED_UNPRIMED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.TriggerCommand.FAILED_UNPRIMED_EXCEPTION = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_INVALID_EXCEPTION() { return wrapperContained.FAILED_INVALID_EXCEPTION; }
// public void FAILED_INVALID_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.FAILED_INVALID_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_INVALID_EXCEPTION() { return net.minecraft.server.command.TriggerCommand.FAILED_INVALID_EXCEPTION; }
// public static void FAILED_INVALID_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.server.command.TriggerCommand.FAILED_INVALID_EXCEPTION = value; }

// public int method_13812(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13812(context); }
// public static int method_13812(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TriggerCommand.method_13812(context); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.TriggerCommand.register(dispatcher); }
// public java.util.concurrent.CompletableFuture method_13814(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13814(context,builder); }
// public static java.util.concurrent.CompletableFuture method_13814(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.server.command.TriggerCommand.method_13814(context,builder); }
// public int method_13815(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13815(context); }
// public static int method_13815(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TriggerCommand.method_13815(context); }
// public int method_13816(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13816(context); }
// public static int method_13816(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TriggerCommand.method_13816(context); }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective,int amount) { return wrapperContained.executeAdd(source.wrapperContained,player.wrapperContained,objective.wrapperContained,amount); }
// public static int executeAdd(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective,int amount, ) { return net.minecraft.server.command.TriggerCommand.executeAdd(source.wrapperContained,player.wrapperContained,objective.wrapperContained,amount); }
// public int executeSimple(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.executeSimple(source.wrapperContained,player.wrapperContained,objective.wrapperContained); }
// public static int executeSimple(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective, ) { return net.minecraft.server.command.TriggerCommand.executeSimple(source.wrapperContained,player.wrapperContained,objective.wrapperContained); }
// public java.util.concurrent.CompletableFuture suggestObjectives(yarnwrap.server.command.ServerCommandSource source,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestObjectives(source.wrapperContained,builder); }
// public static java.util.concurrent.CompletableFuture suggestObjectives(yarnwrap.server.command.ServerCommandSource source,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.server.command.TriggerCommand.suggestObjectives(source.wrapperContained,builder); }
// public int executeSet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective,int value) { return wrapperContained.executeSet(source.wrapperContained,player.wrapperContained,objective.wrapperContained,value); }
// public static int executeSet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective,int value, ) { return net.minecraft.server.command.TriggerCommand.executeSet(source.wrapperContained,player.wrapperContained,objective.wrapperContained,value); }
// public yarnwrap.scoreboard.ScoreAccess getScore(yarnwrap.scoreboard.Scoreboard scoreboard,yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { return new yarnwrap.scoreboard.ScoreAccess(wrapperContained.getScore(scoreboard.wrapperContained,scoreHolder.wrapperContained,objective.wrapperContained)); }
// public static yarnwrap.scoreboard.ScoreAccess getScore(yarnwrap.scoreboard.Scoreboard scoreboard,yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective, ) { return new yarnwrap.scoreboard.ScoreAccess(net.minecraft.server.command.TriggerCommand.getScore(scoreboard.wrapperContained,scoreHolder.wrapperContained,objective.wrapperContained)); }

}