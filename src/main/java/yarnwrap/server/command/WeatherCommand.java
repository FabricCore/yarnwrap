package yarnwrap.server.command;
public class WeatherCommand { public net.minecraft.server.command.WeatherCommand wrapperContained; public WeatherCommand(net.minecraft.server.command.WeatherCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_DURATION() { return wrapperContained.DEFAULT_DURATION; }
// public void DEFAULT_DURATION(int value) { wrapperContained.DEFAULT_DURATION = value; }
// public int executeClear(yarnwrap.server.command.ServerCommandSource source,int duration) { return wrapperContained.executeClear(source.wrapperContained,duration); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeRain(yarnwrap.server.command.ServerCommandSource source,int duration) { return wrapperContained.executeRain(source.wrapperContained,duration); }
// public int executeThunder(yarnwrap.server.command.ServerCommandSource source,int duration) { return wrapperContained.executeThunder(source.wrapperContained,duration); }
// public int processDuration(yarnwrap.server.command.ServerCommandSource source,int duration,yarnwrap.util.math.intprovider.IntProvider provider) { return wrapperContained.processDuration(source.wrapperContained,duration,provider.wrapperContained); }

}