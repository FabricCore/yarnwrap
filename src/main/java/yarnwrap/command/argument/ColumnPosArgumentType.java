package yarnwrap.command.argument;
public class ColumnPosArgumentType { public net.minecraft.command.argument.ColumnPosArgumentType wrapperContained; public ColumnPosArgumentType(net.minecraft.command.argument.ColumnPosArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.ColumnPosArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.ColumnPosArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_EXCEPTION() { return wrapperContained.INCOMPLETE_EXCEPTION; }
// public void INCOMPLETE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INCOMPLETE_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INCOMPLETE_EXCEPTION() { return net.minecraft.command.argument.ColumnPosArgumentType.INCOMPLETE_EXCEPTION; }
// public static void INCOMPLETE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.ColumnPosArgumentType.INCOMPLETE_EXCEPTION = value; }

public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.ColumnPosArgumentType.listSuggestions(context,builder); }
// public yarnwrap.command.argument.ColumnPosArgumentType columnPos() { return new yarnwrap.command.argument.ColumnPosArgumentType(wrapperContained.columnPos()); }
public static yarnwrap.command.argument.ColumnPosArgumentType columnPos() { return new yarnwrap.command.argument.ColumnPosArgumentType(net.minecraft.command.argument.ColumnPosArgumentType.columnPos()); }
// public yarnwrap.util.math.ColumnPos getColumnPos(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.math.ColumnPos(wrapperContained.getColumnPos(context,name)); }
// public static yarnwrap.util.math.ColumnPos getColumnPos(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.util.math.ColumnPos(net.minecraft.command.argument.ColumnPosArgumentType.getColumnPos(context,name)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.ColumnPosArgumentType.parse(reader); }

}