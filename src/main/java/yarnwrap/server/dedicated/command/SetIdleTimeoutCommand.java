package yarnwrap.server.dedicated.command;
public class SetIdleTimeoutCommand { public net.minecraft.server.dedicated.command.SetIdleTimeoutCommand wrapperContained; public SetIdleTimeoutCommand(net.minecraft.server.dedicated.command.SetIdleTimeoutCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public int execute(yarnwrap.server.command.ServerCommandSource source,int minutes) { return wrapperContained.execute(source.wrapperContained,minutes); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,int minutes, ) { return net.minecraft.server.dedicated.command.SetIdleTimeoutCommand.execute(source.wrapperContained,minutes); }
// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.dedicated.command.SetIdleTimeoutCommand.register(dispatcher); }
// public int method_13632(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13632(context); }
// public static int method_13632(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.dedicated.command.SetIdleTimeoutCommand.method_13632(context); }

}