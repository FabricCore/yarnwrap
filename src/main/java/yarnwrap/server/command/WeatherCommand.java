package yarnwrap.server.command;
public class WeatherCommand { public net.minecraft.server.command.WeatherCommand wrapperContained; public WeatherCommand(net.minecraft.server.command.WeatherCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_DURATION() { return wrapperContained.DEFAULT_DURATION; }
// public void DEFAULT_DURATION(int value) { wrapperContained.DEFAULT_DURATION = value; }
// public int method_13823(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13823(context); }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,int duration) { return wrapperContained.executeClear(source.wrapperContained,duration); }
// public int method_13825(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13825(context); }
// public int method_13826(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13826(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeRain(yarnwrap.server.command.ServerCommandSource source,int duration) { return wrapperContained.executeRain(source.wrapperContained,duration); }
// public int method_13829(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13829(context); }
// public int method_13830(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13830(context); }
// public int method_13831(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13831(context); }
// public boolean method_13832(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13832(source.wrapperContained); }
// public int executeThunder(yarnwrap.server.command.ServerCommandSource source,int duration) { return wrapperContained.executeThunder(source.wrapperContained,duration); }
// public int processDuration(yarnwrap.server.command.ServerCommandSource source,int duration,yarnwrap.util.math.intprovider.IntProvider provider) { return wrapperContained.processDuration(source.wrapperContained,duration,provider.wrapperContained); }

}