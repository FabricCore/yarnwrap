package yarnwrap.server.command;
public class ScheduleCommand { public net.minecraft.server.command.ScheduleCommand wrapperContained; public ScheduleCommand(net.minecraft.server.command.ScheduleCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SAME_TICK_EXCEPTION() { return wrapperContained.SAME_TICK_EXCEPTION; }
// public void SAME_TICK_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SAME_TICK_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType CLEARED_FAILURE_EXCEPTION() { return wrapperContained.CLEARED_FAILURE_EXCEPTION; }
// public void CLEARED_FAILURE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.CLEARED_FAILURE_EXCEPTION = value; }
// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
// public int execute(yarnwrap.server.command.ServerCommandSource source,com.mojang.datafixers.util.Pair function,int time,boolean replace) { return wrapperContained.execute(source.wrapperContained,function,time,replace); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13568(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13568(context); }
// public boolean method_13569(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13569(source.wrapperContained); }
// public void method_13570(yarnwrap.util.Identifier functions) { wrapperContained.method_13570(functions.wrapperContained); }
// public void method_13571(yarnwrap.util.Identifier function2) { wrapperContained.method_13571(function2.wrapperContained); }
// public int clearEvent(yarnwrap.server.command.ServerCommandSource source,java.lang.String eventName) { return wrapperContained.clearEvent(source.wrapperContained,eventName); }
// public int method_22834(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22834(context); }
// public java.util.concurrent.CompletableFuture method_22835(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_22835(context,builder); }
// public com.mojang.brigadier.Message method_22836(java.lang.Object eventName) { return wrapperContained.method_22836(eventName); }
// public int method_22837(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22837(context); }
// public int method_22838(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22838(context); }

}