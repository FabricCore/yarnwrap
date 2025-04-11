package yarnwrap.command.argument;
public class TimeArgumentType { public net.minecraft.command.argument.TimeArgumentType wrapperContained; public TimeArgumentType(net.minecraft.command.argument.TimeArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType TICK_COUNT_TOO_LOW_EXCEPTION() { return wrapperContained.TICK_COUNT_TOO_LOW_EXCEPTION; }
// public void TICK_COUNT_TOO_LOW_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.TICK_COUNT_TOO_LOW_EXCEPTION = value; }
// public int minimum() { return wrapperContained.minimum; }
// public void minimum(int value) { wrapperContained.minimum = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_UNIT_EXCEPTION() { return wrapperContained.INVALID_UNIT_EXCEPTION; }
// public void INVALID_UNIT_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_UNIT_EXCEPTION = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap UNITS() { return wrapperContained.UNITS; }
// public void UNITS(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.UNITS = value; }
// public TimeArgumentType(int minimum) { this.wrapperContained = new net.minecraft.command.argument.TimeArgumentType(minimum); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
public yarnwrap.command.argument.TimeArgumentType time(int minimum) { return new yarnwrap.command.argument.TimeArgumentType(wrapperContained.time(minimum)); }
public yarnwrap.command.argument.TimeArgumentType time() { return new yarnwrap.command.argument.TimeArgumentType(wrapperContained.time()); }
// public com.mojang.brigadier.Message method_9491(java.lang.Object value,java.lang.Object minimum) { return wrapperContained.method_9491(value,minimum); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}