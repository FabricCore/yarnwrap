package yarnwrap.server.command;
public class MessageCommand { public net.minecraft.server.command.MessageCommand wrapperContained; public MessageCommand(net.minecraft.server.command.MessageCommand wrapperContained) { this.wrapperContained = wrapperContained; }

public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public void execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,yarnwrap.network.message.SignedMessage message) { wrapperContained.execute(source.wrapperContained,targets,message.wrapperContained); }

}