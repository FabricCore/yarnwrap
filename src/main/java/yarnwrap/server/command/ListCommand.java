package yarnwrap.server.command;
public class ListCommand { public net.minecraft.server.command.ListCommand wrapperContained; public ListCommand(net.minecraft.server.command.ListCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int method_13433(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13433(context); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.function.Function nameProvider) { return wrapperContained.execute(source.wrapperContained,nameProvider); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeUuids(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeUuids(source.wrapperContained); }
// public int executeNames(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeNames(source.wrapperContained); }
// public int method_13438(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13438(context); }
// public yarnwrap.text.Text method_30310(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.text.Text(wrapperContained.method_30310(player.wrapperContained)); }

}