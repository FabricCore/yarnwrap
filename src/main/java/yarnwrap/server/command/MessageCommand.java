package yarnwrap.server.command;
public class MessageCommand { public net.minecraft.server.command.MessageCommand wrapperContained; public MessageCommand(net.minecraft.server.command.MessageCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public static void register(com.mojang.brigadier.CommandDispatcher dispatcher, ) { net.minecraft.server.command.MessageCommand.register(dispatcher); }
// public void execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.network.message.SignedMessage message) { wrapperContained.execute(source.wrapperContained,targets,message.wrapperContained); }
// public static void execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.network.message.SignedMessage message, ) { net.minecraft.server.command.MessageCommand.execute(source.wrapperContained,targets,message.wrapperContained); }
// public int method_13463(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13463(context); }
// public static int method_13463(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.server.command.MessageCommand.method_13463(context); }
// public void method_45153(com.mojang.brigadier.context.CommandContext message) { wrapperContained.method_45153(message); }
// public static void method_45153(com.mojang.brigadier.context.CommandContext message, ) { net.minecraft.server.command.MessageCommand.method_45153(message); }

}