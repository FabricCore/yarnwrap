package yarnwrap.server.dedicated.command;
public class StopCommand { public net.minecraft.server.dedicated.command.StopCommand wrapperContained; public StopCommand(net.minecraft.server.dedicated.command.StopCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13676(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13676(context); }
// public boolean method_13677(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13677(source.wrapperContained); }

}