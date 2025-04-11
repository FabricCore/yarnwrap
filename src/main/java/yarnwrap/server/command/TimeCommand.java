package yarnwrap.server.command;
public class TimeCommand { public net.minecraft.server.command.TimeCommand wrapperContained; public TimeCommand(net.minecraft.server.command.TimeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public int executeSet(yarnwrap.server.command.ServerCommandSource source,int time) { return wrapperContained.executeSet(source.wrapperContained,time); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int getDayTime(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getDayTime(world.wrapperContained); }
public int executeAdd(yarnwrap.server.command.ServerCommandSource source,int time) { return wrapperContained.executeAdd(source.wrapperContained,time); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source,int time) { return wrapperContained.executeQuery(source.wrapperContained,time); }

}