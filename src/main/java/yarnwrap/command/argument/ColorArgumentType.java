package yarnwrap.command.argument;
public class ColorArgumentType { public net.minecraft.command.argument.ColorArgumentType wrapperContained; public ColorArgumentType(net.minecraft.command.argument.ColorArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.ColorArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.ColorArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COLOR_EXCEPTION() { return wrapperContained.INVALID_COLOR_EXCEPTION; }
// public void INVALID_COLOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_COLOR_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_COLOR_EXCEPTION() { return net.minecraft.command.argument.ColorArgumentType.INVALID_COLOR_EXCEPTION; }
// public static void INVALID_COLOR_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.ColorArgumentType.INVALID_COLOR_EXCEPTION = value; }

public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.ColorArgumentType.listSuggestions(context,builder); }
// public yarnwrap.command.argument.ColorArgumentType color() { return new yarnwrap.command.argument.ColorArgumentType(wrapperContained.color()); }
public static yarnwrap.command.argument.ColorArgumentType color() { return new yarnwrap.command.argument.ColorArgumentType(net.minecraft.command.argument.ColorArgumentType.color()); }
// public yarnwrap.util.Formatting getColor(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.Formatting(wrapperContained.getColor(context,name)); }
// public static yarnwrap.util.Formatting getColor(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.util.Formatting(net.minecraft.command.argument.ColorArgumentType.getColor(context,name)); }
// public com.mojang.brigadier.Message method_9278(java.lang.Object color) { return wrapperContained.method_9278(color); }
// public static com.mojang.brigadier.Message method_9278(java.lang.Object color, ) { return net.minecraft.command.argument.ColorArgumentType.method_9278(color); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.ColorArgumentType.parse(reader); }

}