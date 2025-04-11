package yarnwrap.server.command;
public class MessageCommand { public net.minecraft.server.command.MessageCommand wrapperContained; public MessageCommand(net.minecraft.server.command.MessageCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public void execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.network.message.SignedMessage message) { wrapperContained.execute(source.wrapperContained,targets,message.wrapperContained); }
// public int method_13463(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13463(context); }
// public void method_45153(com.mojang.brigadier.context.CommandContext message) { wrapperContained.method_45153(message); }

}