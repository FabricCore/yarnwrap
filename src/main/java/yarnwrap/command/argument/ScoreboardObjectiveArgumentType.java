package yarnwrap.command.argument;
public class ScoreboardObjectiveArgumentType { public net.minecraft.command.argument.ScoreboardObjectiveArgumentType wrapperContained; public ScoreboardObjectiveArgumentType(net.minecraft.command.argument.ScoreboardObjectiveArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType READONLY_OBJECTIVE_EXCEPTION() { return wrapperContained.READONLY_OBJECTIVE_EXCEPTION; }
// public void READONLY_OBJECTIVE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.READONLY_OBJECTIVE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_OBJECTIVE_EXCEPTION() { return wrapperContained.UNKNOWN_OBJECTIVE_EXCEPTION; }
// public void UNKNOWN_OBJECTIVE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_OBJECTIVE_EXCEPTION = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
public yarnwrap.command.argument.ScoreboardObjectiveArgumentType scoreboardObjective() { return new yarnwrap.command.argument.ScoreboardObjectiveArgumentType(wrapperContained.scoreboardObjective()); }
// public com.mojang.brigadier.Message method_9392(java.lang.Object name) { return wrapperContained.method_9392(name); }
// public yarnwrap.scoreboard.ScoreboardObjective getWritableObjective(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.getWritableObjective(context,name)); }
// public yarnwrap.scoreboard.ScoreboardObjective getObjective(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardObjective(wrapperContained.getObjective(context,name)); }
// public com.mojang.brigadier.Message method_9397(java.lang.Object name) { return wrapperContained.method_9397(name); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}