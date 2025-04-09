package yarnwrap.server.command;
public class ListCommand { public net.minecraft.server.command.ListCommand wrapperContained; public ListCommand(net.minecraft.server.command.ListCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.function.Function nameProvider) { return wrapperContained.execute(source.wrapperContained,nameProvider); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeUuids(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeUuids(source.wrapperContained); }
// public int executeNames(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeNames(source.wrapperContained); }

}