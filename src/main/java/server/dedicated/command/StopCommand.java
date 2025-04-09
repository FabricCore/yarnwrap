package yarnwrap.server.dedicated.command;
public class StopCommand { public net.minecraft.server.dedicated.command.StopCommand wrapperContained; public StopCommand(net.minecraft.server.dedicated.command.StopCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}