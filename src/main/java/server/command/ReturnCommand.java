package yarnwrap.server.command;
public class ReturnCommand { public net.minecraft.server.command.ReturnCommand wrapperContained; public ReturnCommand(net.minecraft.server.command.ReturnCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}