package yarnwrap.server.dedicated.command;
public class StopCommand { public net.minecraft.server.dedicated.command.StopCommand wrapperContained; public StopCommand(net.minecraft.server.dedicated.command.StopCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.dedicated.command.StopCommand.register(dispatcher); }
// public int method_13676(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13676(context); }
// public static int method_13676(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.dedicated.command.StopCommand.method_13676(context); }

}