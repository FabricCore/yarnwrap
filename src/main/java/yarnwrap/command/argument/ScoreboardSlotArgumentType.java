package yarnwrap.command.argument;
public class ScoreboardSlotArgumentType { public net.minecraft.command.argument.ScoreboardSlotArgumentType wrapperContained; public ScoreboardSlotArgumentType(net.minecraft.command.argument.ScoreboardSlotArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.ScoreboardSlotArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.ScoreboardSlotArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_SLOT_EXCEPTION() { return wrapperContained.INVALID_SLOT_EXCEPTION; }
// public void INVALID_SLOT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_SLOT_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_SLOT_EXCEPTION() { return net.minecraft.command.argument.ScoreboardSlotArgumentType.INVALID_SLOT_EXCEPTION; }
// public static void INVALID_SLOT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.ScoreboardSlotArgumentType.INVALID_SLOT_EXCEPTION = value; }

public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.ScoreboardSlotArgumentType.listSuggestions(context,builder); }
// public yarnwrap.scoreboard.ScoreboardDisplaySlot getScoreboardSlot(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.getScoreboardSlot(context,name)); }
// public static yarnwrap.scoreboard.ScoreboardDisplaySlot getScoreboardSlot(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(net.minecraft.command.argument.ScoreboardSlotArgumentType.getScoreboardSlot(context,name)); }
// public com.mojang.brigadier.Message method_9467(java.lang.Object name) { return wrapperContained.method_9467(name); }
// public static com.mojang.brigadier.Message method_9467(java.lang.Object name, ) { return net.minecraft.command.argument.ScoreboardSlotArgumentType.method_9467(name); }
// public yarnwrap.command.argument.ScoreboardSlotArgumentType scoreboardSlot() { return new yarnwrap.command.argument.ScoreboardSlotArgumentType(wrapperContained.scoreboardSlot()); }
public static yarnwrap.command.argument.ScoreboardSlotArgumentType scoreboardSlot() { return new yarnwrap.command.argument.ScoreboardSlotArgumentType(net.minecraft.command.argument.ScoreboardSlotArgumentType.scoreboardSlot()); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.ScoreboardSlotArgumentType.parse(reader); }

}