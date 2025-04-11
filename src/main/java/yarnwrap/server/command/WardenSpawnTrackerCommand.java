package yarnwrap.server.command;
public class WardenSpawnTrackerCommand { public net.minecraft.server.command.WardenSpawnTrackerCommand wrapperContained; public WardenSpawnTrackerCommand(net.minecraft.server.command.WardenSpawnTrackerCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_42101(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_42101(context); }
// public boolean method_42102(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_42102(source.wrapperContained); }
// public int clearTracker(yarnwrap.server.command.ServerCommandSource source,java.util.Collection players) { return wrapperContained.clearTracker(source.wrapperContained,players); }
// public int setWarningLevel(yarnwrap.server.command.ServerCommandSource source,java.util.Collection players,int warningCount) { return wrapperContained.setWarningLevel(source.wrapperContained,players,warningCount); }
// public int method_42105(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_42105(context); }
// public void method_45156(int warningManager) { wrapperContained.method_45156(warningManager); }

}