package yarnwrap.command.argument;
public class ScoreboardCriterionArgumentType { public net.minecraft.command.argument.ScoreboardCriterionArgumentType wrapperContained; public ScoreboardCriterionArgumentType(net.minecraft.command.argument.ScoreboardCriterionArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_CRITERION_EXCEPTION() { return wrapperContained.INVALID_CRITERION_EXCEPTION; }
// public void INVALID_CRITERION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_CRITERION_EXCEPTION = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
public yarnwrap.command.argument.ScoreboardCriterionArgumentType scoreboardCriterion() { return new yarnwrap.command.argument.ScoreboardCriterionArgumentType(wrapperContained.scoreboardCriterion()); }
public java.lang.String getStatName(yarnwrap.stat.StatType stat,java.lang.Object value) { return wrapperContained.getStatName(stat.wrapperContained,value); }
// public com.mojang.brigadier.Message method_9401(java.lang.Object name) { return wrapperContained.method_9401(name); }
public yarnwrap.scoreboard.ScoreboardCriterion getCriterion(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardCriterion(wrapperContained.getCriterion(context,name)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}