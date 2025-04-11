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
// public int clearEvent(yarnwrap.server.command.ServerCommandSource source,java.lang.String eventName) { return wrapperContained.clearEvent(source.wrapperContained,eventName); }

}