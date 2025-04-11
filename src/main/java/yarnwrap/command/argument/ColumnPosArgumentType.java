package yarnwrap.command.argument;
public class ColumnPosArgumentType { public net.minecraft.command.argument.ColumnPosArgumentType wrapperContained; public ColumnPosArgumentType(net.minecraft.command.argument.ColumnPosArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_EXCEPTION() { return wrapperContained.INCOMPLETE_EXCEPTION; }
// public void INCOMPLETE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INCOMPLETE_EXCEPTION = value; }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
public yarnwrap.command.argument.ColumnPosArgumentType columnPos() { return new yarnwrap.command.argument.ColumnPosArgumentType(wrapperContained.columnPos()); }
public yarnwrap.util.math.ColumnPos getColumnPos(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.math.ColumnPos(wrapperContained.getColumnPos(context,name)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}