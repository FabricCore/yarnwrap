package yarnwrap.server.command;
public class TellRawCommand { public net.minecraft.server.command.TellRawCommand wrapperContained; public TellRawCommand(net.minecraft.server.command.TellRawCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public int method_13777(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13777(context); }
// public boolean method_13778(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13778(source.wrapperContained); }

}