package yarnwrap.server.command;
public class KillCommand { public net.minecraft.server.command.KillCommand wrapperContained; public KillCommand(net.minecraft.server.command.KillCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.KillCommand.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.execute(source.wrapperContained,targets); }
// public static int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets, ) { return net.minecraft.server.command.KillCommand.execute(source.wrapperContained,targets); }
// public int method_13431(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13431(context); }
// public static int method_13431(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.KillCommand.method_13431(context); }
// public int method_22832(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_22832(context); }
// public static int method_22832(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.KillCommand.method_22832(context); }

}