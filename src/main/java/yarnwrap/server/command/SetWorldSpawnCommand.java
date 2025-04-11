package yarnwrap.server.command;
public class SetWorldSpawnCommand { public net.minecraft.server.command.SetWorldSpawnCommand wrapperContained; public SetWorldSpawnCommand(net.minecraft.server.command.SetWorldSpawnCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int method_13646(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13646(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13648(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13648(context); }
// public boolean method_13649(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13649(source.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.math.BlockPos pos,float angle) { return wrapperContained.execute(source.wrapperContained,pos.wrapperContained,angle); }
// public int method_30734(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_30734(context); }

}