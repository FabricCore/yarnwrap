package yarnwrap.server.command;
public class TickCommand { public net.minecraft.server.command.TickCommand wrapperContained; public TickCommand(net.minecraft.server.command.TickCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MAX_TICK_RATE() { return wrapperContained.MAX_TICK_RATE; }
// public java.lang.String DEFAULT_TICK_RATE_STRING() { return wrapperContained.DEFAULT_TICK_RATE_STRING; }
// public java.lang.String format(long nanos) { return wrapperContained.format(nanos); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeQuery(source.wrapperContained); }
// public int executeRate(yarnwrap.server.command.ServerCommandSource source,float rate) { return wrapperContained.executeRate(source.wrapperContained,rate); }
// public int executeSprint(yarnwrap.server.command.ServerCommandSource source,int ticks) { return wrapperContained.executeSprint(source.wrapperContained,ticks); }
// public int executeFreeze(yarnwrap.server.command.ServerCommandSource source,boolean frozen) { return wrapperContained.executeFreeze(source.wrapperContained,frozen); }
// public int executeStopStep(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStopStep(source.wrapperContained); }
// public int executeStep(yarnwrap.server.command.ServerCommandSource source,int steps) { return wrapperContained.executeStep(source.wrapperContained,steps); }
// public int executeStopSprint(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeStopSprint(source.wrapperContained); }

}