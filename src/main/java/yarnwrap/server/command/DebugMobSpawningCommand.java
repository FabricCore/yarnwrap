package yarnwrap.server.command;
public class DebugMobSpawningCommand { public net.minecraft.server.command.DebugMobSpawningCommand wrapperContained; public DebugMobSpawningCommand(net.minecraft.server.command.DebugMobSpawningCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.SpawnGroup group,yarnwrap.util.math.BlockPos pos) { return wrapperContained.execute(source.wrapperContained,group.wrapperContained,pos.wrapperContained); }

}