package yarnwrap.server.command;
public class RandomCommand { public net.minecraft.server.command.RandomCommand wrapperContained; public RandomCommand(net.minecraft.server.command.RandomCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType RANGE_TOO_LARGE_EXCEPTION() { return wrapperContained.RANGE_TOO_LARGE_EXCEPTION; }
// public void RANGE_TOO_LARGE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.RANGE_TOO_LARGE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType RANGE_TOO_SMALL_EXCEPTION() { return wrapperContained.RANGE_TOO_SMALL_EXCEPTION; }
// public void RANGE_TOO_SMALL_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.RANGE_TOO_SMALL_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_52319(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52319(context); }
// public java.util.concurrent.CompletableFuture suggestSequences(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.suggestSequences(context,suggestionsBuilder); }
// public int executeReset(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeReset(source.wrapperContained); }
// public int executeReset(yarnwrap.server.command.ServerCommandSource source,int salt,boolean includeWorldSeed,boolean includeSequenceId) { return wrapperContained.executeReset(source.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
// public int executeReset(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier sequenceId) { return wrapperContained.executeReset(source.wrapperContained,sequenceId.wrapperContained); }
// public int executeReset(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier sequenceId,int salt,boolean includeWorldSeed,boolean includeSequenceId) { return wrapperContained.executeReset(source.wrapperContained,sequenceId.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,Object range,yarnwrap.util.Identifier sequenceId,boolean roll) { return wrapperContained.execute(source.wrapperContained,range,sequenceId.wrapperContained,roll); }
// public com.mojang.brigadier.builder.LiteralArgumentBuilder random(java.lang.String argumentName,boolean roll) { return wrapperContained.random(argumentName,roll); }
// public void method_52327(java.util.List id,yarnwrap.util.Identifier sequence) { wrapperContained.method_52327(id,sequence.wrapperContained); }
// public int method_52328(boolean context) { return wrapperContained.method_52328(context); }
// public int method_52331(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52331(context); }
// public boolean method_52332(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_52332(source.wrapperContained); }
// public int method_52333(boolean context) { return wrapperContained.method_52333(context); }
// public int method_52335(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52335(context); }
// public boolean method_52336(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_52336(source.wrapperContained); }
// public int method_52337(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52337(context); }
// public int method_52338(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52338(context); }
// public int method_52339(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52339(context); }
// public int method_52340(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52340(context); }
// public int method_52341(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_52341(context); }

}