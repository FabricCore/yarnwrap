package yarnwrap.server.command;
public class MeCommand { public net.minecraft.server.command.MeCommand wrapperContained; public MeCommand(net.minecraft.server.command.MeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13238(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13238(context); }
// public void method_43645(com.mojang.brigadier.context.CommandContext message) { wrapperContained.method_43645(message); }

}