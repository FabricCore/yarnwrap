package yarnwrap.server.command;
public class SpawnPointCommand { public net.minecraft.server.command.SpawnPointCommand wrapperContained; public SpawnPointCommand(net.minecraft.server.command.SpawnPointCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.util.math.BlockPos pos,float angle) { return wrapperContained.execute(source.wrapperContained,targets,pos.wrapperContained,angle); }

}