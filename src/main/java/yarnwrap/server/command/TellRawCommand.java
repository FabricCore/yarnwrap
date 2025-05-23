package yarnwrap.server.command;
public class TellRawCommand { public net.minecraft.server.command.TellRawCommand wrapperContained; public TellRawCommand(net.minecraft.server.command.TellRawCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess, ) { net.minecraft.server.command.TellRawCommand.register(dispatcher,registryAccess.wrapperContained); }
// public int method_13777(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13777(context); }
// public static int method_13777(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.TellRawCommand.method_13777(context); }

}