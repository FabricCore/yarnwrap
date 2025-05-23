package yarnwrap.command.argument;
public class ScoreHolderArgumentType { public net.minecraft.command.argument.ScoreHolderArgumentType wrapperContained; public ScoreHolderArgumentType(net.minecraft.command.argument.ScoreHolderArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.ScoreHolderArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.ScoreHolderArgumentType.EXAMPLES = value; }

// public boolean multiple() { return wrapperContained.multiple; }
// public void multiple(boolean value) { wrapperContained.multiple = value; }
// public static boolean multiple() { return net.minecraft.command.argument.ScoreHolderArgumentType.multiple; }
// public static void multiple(boolean value, ) { net.minecraft.command.argument.ScoreHolderArgumentType.multiple = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EMPTY_SCORE_HOLDER_EXCEPTION() { return wrapperContained.EMPTY_SCORE_HOLDER_EXCEPTION; }
// public void EMPTY_SCORE_HOLDER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.EMPTY_SCORE_HOLDER_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType EMPTY_SCORE_HOLDER_EXCEPTION() { return net.minecraft.command.argument.ScoreHolderArgumentType.EMPTY_SCORE_HOLDER_EXCEPTION; }
// public static void EMPTY_SCORE_HOLDER_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.ScoreHolderArgumentType.EMPTY_SCORE_HOLDER_EXCEPTION = value; }

// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
public static com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return net.minecraft.command.argument.ScoreHolderArgumentType.SUGGESTION_PROVIDER; }
// public static void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value, ) { net.minecraft.command.argument.ScoreHolderArgumentType.SUGGESTION_PROVIDER = value; }

public ScoreHolderArgumentType(boolean multiple) { this.wrapperContained = new net.minecraft.command.argument.ScoreHolderArgumentType(multiple); }
// public yarnwrap.command.argument.ScoreHolderArgumentType scoreHolder() { return new yarnwrap.command.argument.ScoreHolderArgumentType(wrapperContained.scoreHolder()); }
public static yarnwrap.command.argument.ScoreHolderArgumentType scoreHolder() { return new yarnwrap.command.argument.ScoreHolderArgumentType(net.minecraft.command.argument.ScoreHolderArgumentType.scoreHolder()); }
// public void method_9448(com.mojang.brigadier.context.CommandContext builderx) { wrapperContained.method_9448(builderx); }
// public static void method_9448(com.mojang.brigadier.context.CommandContext builderx, ) { net.minecraft.command.argument.ScoreHolderArgumentType.method_9448(builderx); }
// public java.util.Collection getScoreboardScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getScoreboardScoreHolders(context,name); }
// public static java.util.Collection getScoreboardScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.getScoreboardScoreHolders(context,name); }
// public java.util.Collection getScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name,java.util.function.Supplier players) { return wrapperContained.getScoreHolders(context,name,players); }
// public static java.util.Collection getScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name,java.util.function.Supplier players, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.getScoreHolders(context,name,players); }
// public yarnwrap.command.argument.ScoreHolderArgumentType scoreHolders() { return new yarnwrap.command.argument.ScoreHolderArgumentType(wrapperContained.scoreHolders()); }
public static yarnwrap.command.argument.ScoreHolderArgumentType scoreHolders() { return new yarnwrap.command.argument.ScoreHolderArgumentType(net.minecraft.command.argument.ScoreHolderArgumentType.scoreHolders()); }
// public yarnwrap.scoreboard.ScoreHolder getScoreHolder(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.getScoreHolder(context,name)); }
// public static yarnwrap.scoreboard.ScoreHolder getScoreHolder(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.scoreboard.ScoreHolder(net.minecraft.command.argument.ScoreHolderArgumentType.getScoreHolder(context,name)); }
// public Object parse(com.mojang.brigadier.StringReader reader,boolean allowAtSelectors) { return wrapperContained.parse(reader,allowAtSelectors); }
// public static Object parse(com.mojang.brigadier.StringReader reader,boolean allowAtSelectors, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.parse(reader,allowAtSelectors); }
// public java.util.concurrent.CompletableFuture method_9455(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_9455(context,builder); }
// public static java.util.concurrent.CompletableFuture method_9455(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.method_9455(context,builder); }
// public java.util.Collection method_9456(java.util.List source,yarnwrap.server.command.ServerCommandSource players) { return wrapperContained.method_9456(source,players.wrapperContained); }
// public static java.util.Collection method_9456(java.util.List source,yarnwrap.server.command.ServerCommandSource players, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.method_9456(source,players.wrapperContained); }
// public java.util.Collection method_9457(yarnwrap.server.command.ServerCommandSource source,java.util.function.Supplier players) { return wrapperContained.method_9457(source.wrapperContained,players); }
// public static java.util.Collection method_9457(yarnwrap.server.command.ServerCommandSource source,java.util.function.Supplier players, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.method_9457(source.wrapperContained,players); }
// public java.util.Collection getScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getScoreHolders(context,name); }
// public static java.util.Collection getScoreHolders(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.getScoreHolders(context,name); }
// public java.util.Collection method_55587(java.lang.String source,java.util.List holders) { return wrapperContained.method_55587(source,holders); }
// public static java.util.Collection method_55587(java.lang.String source,java.util.List holders, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.method_55587(source,holders); }
// public java.util.Collection method_55588(java.util.UUID source,java.util.List holders) { return wrapperContained.method_55588(source,holders); }
// public static java.util.Collection method_55588(java.util.UUID source,java.util.List holders, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.method_55588(source,holders); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.parse(reader); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader,java.lang.Object source) { return wrapperContained.parse(reader,source); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader,java.lang.Object source, ) { return net.minecraft.command.argument.ScoreHolderArgumentType.parse(reader,source); }

}