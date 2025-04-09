package yarnwrap.command.argument;
public class ScoreHolderArgumentType { public net.minecraft.command.argument.ScoreHolderArgumentType wrapperContained; public ScoreHolderArgumentType(net.minecraft.command.argument.ScoreHolderArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public boolean multiple() { return wrapperContained.multiple; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EMPTY_SCORE_HOLDER_EXCEPTION() { return wrapperContained.EMPTY_SCORE_HOLDER_EXCEPTION; }
public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
public yarnwrap.command.argument.ScoreHolderArgumentType scoreHolder() { return new yarnwrap.command.argument.ScoreHolderArgumentType(wrapperContained.scoreHolder()); }
// public java.util.Collection getScoreboardScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getScoreboardScoreHolders(context,name); }
// public java.util.Collection getScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name,java.util.function.Supplier players) { return wrapperContained.getScoreHolders(context,name,players); }
public yarnwrap.command.argument.ScoreHolderArgumentType scoreHolders() { return new yarnwrap.command.argument.ScoreHolderArgumentType(wrapperContained.scoreHolders()); }
// public yarnwrap.scoreboard.ScoreHolder getScoreHolder(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.getScoreHolder(context,name)); }
// public Object parse(com.mojang.brigadier.StringReader reader,boolean allowAtSelectors) { return wrapperContained.parse(reader,allowAtSelectors); }
// public java.util.Collection getScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getScoreHolders(context,name); }

}