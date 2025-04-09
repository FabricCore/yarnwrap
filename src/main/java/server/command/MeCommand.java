package yarnwrap.server.command;
public class MeCommand { public net.minecraft.server.command.MeCommand wrapperContained; public MeCommand(net.minecraft.server.command.MeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}