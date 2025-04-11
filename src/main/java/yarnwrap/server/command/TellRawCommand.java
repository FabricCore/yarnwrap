package yarnwrap.server.command;
public class TellRawCommand { public net.minecraft.server.command.TellRawCommand wrapperContained; public TellRawCommand(net.minecraft.server.command.TellRawCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }

}