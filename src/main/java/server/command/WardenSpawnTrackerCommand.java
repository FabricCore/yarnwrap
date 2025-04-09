package yarnwrap.server.command;
public class WardenSpawnTrackerCommand { public net.minecraft.server.command.WardenSpawnTrackerCommand wrapperContained; public WardenSpawnTrackerCommand(net.minecraft.server.command.WardenSpawnTrackerCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int clearTracker(yarnwrap.server.command.ServerCommandSource source,java.util.Collection players) { return wrapperContained.clearTracker(source.wrapperContained,players); }
// public int setWarningLevel(yarnwrap.server.command.ServerCommandSource source,java.util.Collection players,int warningCount) { return wrapperContained.setWarningLevel(source.wrapperContained,players,warningCount); }

}