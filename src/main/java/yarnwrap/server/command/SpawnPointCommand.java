package yarnwrap.server.command;
public class SpawnPointCommand { public net.minecraft.server.command.SpawnPointCommand wrapperContained; public SpawnPointCommand(net.minecraft.server.command.SpawnPointCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int method_13640(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13640(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13642(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13642(context); }
// public int method_13643(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13643(context); }
// public boolean method_13644(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13644(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.util.math.BlockPos pos,float angle) { return wrapperContained.execute(source.wrapperContained,targets,pos.wrapperContained,angle); }
// public int method_30733(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_30733(context); }

}