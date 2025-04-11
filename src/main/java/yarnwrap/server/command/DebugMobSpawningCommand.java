package yarnwrap.server.command;
public class DebugMobSpawningCommand { public net.minecraft.server.command.DebugMobSpawningCommand wrapperContained; public DebugMobSpawningCommand(net.minecraft.server.command.DebugMobSpawningCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int method_36183(yarnwrap.entity.SpawnGroup context) { return wrapperContained.method_36183(context.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public boolean method_36185(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_36185(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.SpawnGroup group,yarnwrap.util.math.BlockPos pos) { return wrapperContained.execute(source.wrapperContained,group.wrapperContained,pos.wrapperContained); }

}