package yarnwrap.server.command;
public class RandomCommand { public net.minecraft.server.command.RandomCommand wrapperContained; public RandomCommand(net.minecraft.server.command.RandomCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType RANGE_TOO_LARGE_EXCEPTION() { return wrapperContained.RANGE_TOO_LARGE_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType RANGE_TOO_SMALL_EXCEPTION() { return wrapperContained.RANGE_TOO_SMALL_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public java.util.concurrent.CompletableFuture suggestSequences(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.suggestSequences(context,suggestionsBuilder); }
// public int executeReset(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeReset(source.wrapperContained); }
// public int executeReset(yarnwrap.server.command.ServerCommandSource source,int salt,boolean includeWorldSeed,boolean includeSequenceId) { return wrapperContained.executeReset(source.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
// public int executeReset(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier sequenceId) { return wrapperContained.executeReset(source.wrapperContained,sequenceId.wrapperContained); }
// public int executeReset(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier sequenceId,int salt,boolean includeWorldSeed,boolean includeSequenceId) { return wrapperContained.executeReset(source.wrapperContained,sequenceId.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,Object range,yarnwrap.util.Identifier sequenceId,boolean roll) { return wrapperContained.execute(source.wrapperContained,range,sequenceId.wrapperContained,roll); }
// public com.mojang.brigadier.builder.LiteralArgumentBuilder random(java.lang.String argumentName,boolean roll) { return wrapperContained.random(argumentName,roll); }

}