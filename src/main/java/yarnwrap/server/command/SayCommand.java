package yarnwrap.server.command;
public class SayCommand { public net.minecraft.server.command.SayCommand wrapperContained; public SayCommand(net.minecraft.server.command.SayCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }

}