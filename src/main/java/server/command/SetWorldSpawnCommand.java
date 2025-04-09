package yarnwrap.server.command;
public class SetWorldSpawnCommand { public net.minecraft.server.command.SetWorldSpawnCommand wrapperContained; public SetWorldSpawnCommand(net.minecraft.server.command.SetWorldSpawnCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,float angle) { return wrapperContained.execute(source.wrapperContained,pos.wrapperContained,angle); }

}