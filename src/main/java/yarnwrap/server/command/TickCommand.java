package yarnwrap.server.command;
public class TickCommand { public net.minecraft.server.command.TickCommand wrapperContained; public TickCommand(net.minecraft.server.command.TickCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MAX_TICK_RATE() { return wrapperContained.MAX_TICK_RATE; }
// public void MAX_TICK_RATE(float value) { wrapperContained.MAX_TICK_RATE = value; }
// public static float MAX_TICK_RATE() { return net.minecraft.server.command.TickCommand.MAX_TICK_RATE; }
// public static void MAX_TICK_RATE(float value, ) { net.minecraft.server.command.TickCommand.MAX_TICK_RATE = value; }

// public java.lang.String DEFAULT_TICK_RATE_STRING() { return wrapperContained.DEFAULT_TICK_RATE_STRING; }
// public void DEFAULT_TICK_RATE_STRING(java.lang.String value) { wrapperContained.DEFAULT_TICK_RATE_STRING = value; }
// public static java.lang.String DEFAULT_TICK_RATE_STRING() { return net.minecraft.server.command.TickCommand.DEFAULT_TICK_RATE_STRING; }
// public static void DEFAULT_TICK_RATE_STRING(java.lang.String value, ) { net.minecraft.server.command.TickCommand.DEFAULT_TICK_RATE_STRING = value; }

// public java.lang.String format(long nanos) { return wrapperContained.format(nanos); }
// public static java.lang.String format(long nanos, ) { return net.minecraft.server.command.TickCommand.format(nanos); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.TickCommand.register(dispatcher); }
// public int method_54688(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54688(context); }
// public static int method_54688(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54688(context); }
// public java.util.concurrent.CompletableFuture method_54689(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.method_54689(context,suggestionsBuilder); }
// public static java.util.concurrent.CompletableFuture method_54689(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder, ) { return net.minecraft.server.command.TickCommand.method_54689(context,suggestionsBuilder); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeQuery(source.wrapperContained); }
// public static int executeQuery(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.TickCommand.executeQuery(source.wrapperContained); }
// public int executeRate(yarnwrap.server.command.ServerCommandSource source,float rate) { return wrapperContained.executeRate(source.wrapperContained,rate); }
// public static int executeRate(yarnwrap.server.command.ServerCommandSource source,float rate, ) { return net.minecraft.server.command.TickCommand.executeRate(source.wrapperContained,rate); }
// public int executeSprint(yarnwrap.server.command.ServerCommandSource source,int ticks) { return wrapperContained.executeSprint(source.wrapperContained,ticks); }
// public static int executeSprint(yarnwrap.server.command.ServerCommandSource source,int ticks, ) { return net.minecraft.server.command.TickCommand.executeSprint(source.wrapperContained,ticks); }
// public int executeFreeze(yarnwrap.server.command.ServerCommandSource source,boolean frozen) { return wrapperContained.executeFreeze(source.wrapperContained,frozen); }
// public static int executeFreeze(yarnwrap.server.command.ServerCommandSource source,boolean frozen, ) { return net.minecraft.server.command.TickCommand.executeFreeze(source.wrapperContained,frozen); }
// public int method_54699(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54699(context); }
// public static int method_54699(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54699(context); }
// public java.util.concurrent.CompletableFuture method_54700(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.method_54700(context,suggestionsBuilder); }
// public static java.util.concurrent.CompletableFuture method_54700(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder, ) { return net.minecraft.server.command.TickCommand.method_54700(context,suggestionsBuilder); }
// public int executeStopStep(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStopStep(source.wrapperContained); }
// public static int executeStopStep(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.TickCommand.executeStopStep(source.wrapperContained); }
// public int executeStep(yarnwrap.server.command.ServerCommandSource source,int steps) { return wrapperContained.executeStep(source.wrapperContained,steps); }
// public static int executeStep(yarnwrap.server.command.ServerCommandSource source,int steps, ) { return net.minecraft.server.command.TickCommand.executeStep(source.wrapperContained,steps); }
// public int method_54704(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54704(context); }
// public static int method_54704(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54704(context); }
// public java.util.concurrent.CompletableFuture method_54705(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder) { return wrapperContained.method_54705(context,suggestionsBuilder); }
// public static java.util.concurrent.CompletableFuture method_54705(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionsBuilder, ) { return net.minecraft.server.command.TickCommand.method_54705(context,suggestionsBuilder); }
// public int executeStopSprint(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStopSprint(source.wrapperContained); }
// public static int executeStopSprint(yarnwrap.server.command.ServerCommandSource source, ) { return net.minecraft.server.command.TickCommand.executeStopSprint(source.wrapperContained); }
// public int method_54708(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54708(context); }
// public static int method_54708(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54708(context); }
// public int method_54711(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54711(context); }
// public static int method_54711(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54711(context); }
// public int method_54713(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54713(context); }
// public static int method_54713(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54713(context); }
// public int method_54715(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54715(context); }
// public static int method_54715(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54715(context); }
// public int method_54717(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54717(context); }
// public static int method_54717(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54717(context); }
// public int method_54865(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_54865(context); }
// public static int method_54865(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TickCommand.method_54865(context); }

}