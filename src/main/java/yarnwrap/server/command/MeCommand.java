package yarnwrap.server.command;
public class MeCommand { public net.minecraft.server.command.MeCommand wrapperContained; public MeCommand(net.minecraft.server.command.MeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.MeCommand.register(dispatcher); }
// public int method_13238(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13238(context); }
// public static int method_13238(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.MeCommand.method_13238(context); }
// public void method_43645(com.mojang.brigadier.context.CommandContext message) { wrapperContained.method_43645(message); }
// public static void method_43645(com.mojang.brigadier.context.CommandContext message, ) { net.minecraft.server.command.MeCommand.method_43645(message); }

}