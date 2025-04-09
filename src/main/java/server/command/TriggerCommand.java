package yarnwrap.server.command;
public class TriggerCommand { public net.minecraft.server.command.TriggerCommand wrapperContained; public TriggerCommand(net.minecraft.server.command.TriggerCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_UNPRIMED_EXCEPTION() { return wrapperContained.FAILED_UNPRIMED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType FAILED_INVALID_EXCEPTION() { return wrapperContained.FAILED_INVALID_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective,int amount) { return wrapperContained.executeAdd(source.wrapperContained,player.wrapperContained,objective.wrapperContained,amount); }
// public int executeSimple(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective) { return wrapperContained.executeSimple(source.wrapperContained,player.wrapperContained,objective.wrapperContained); }
public java.util.concurrent.CompletableFuture suggestObjectives(yarnwrap.server.command.ServerCommandSource source,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestObjectives(source.wrapperContained,builder); }
// public int executeSet(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.scoreboard.ScoreboardObjective objective,int value) { return wrapperContained.executeSet(source.wrapperContained,player.wrapperContained,objective.wrapperContained,value); }
// public yarnwrap.scoreboard.ScoreAccess getScore(yarnwrap.scoreboard.Scoreboard scoreboard,yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.scoreboard.ScoreboardObjective objective) { return new yarnwrap.scoreboard.ScoreAccess(wrapperContained.getScore(scoreboard.wrapperContained,scoreHolder.wrapperContained,objective.wrapperContained)); }

}