package yarnwrap.command.argument;
public class MessageArgumentType { public net.minecraft.command.argument.MessageArgumentType wrapperContained; public MessageArgumentType(net.minecraft.command.argument.MessageArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MESSAGE_TOO_LONG_EXCEPTION() { return wrapperContained.MESSAGE_TOO_LONG_EXCEPTION; }
// public void MESSAGE_TOO_LONG_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.MESSAGE_TOO_LONG_EXCEPTION = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public void getSignedMessage(com.mojang.brigadier.context.CommandContext context,java.lang.String name,java.util.function.Consumer callback) { wrapperContained.getSignedMessage(context,name,callback); }
// public java.util.concurrent.CompletableFuture filterText(yarnwrap.server.command.ServerCommandSource source,yarnwrap.network.message.SignedMessage message) { return wrapperContained.filterText(source.wrapperContained,message.wrapperContained); }
// public void chain(java.util.function.Consumer callback,yarnwrap.server.command.ServerCommandSource source,yarnwrap.network.message.SignedMessage message) { wrapperContained.chain(callback,source.wrapperContained,message.wrapperContained); }
// public void chainUnsigned(java.util.function.Consumer callback,yarnwrap.server.command.ServerCommandSource source,yarnwrap.network.message.SignedMessage message) { wrapperContained.chainUnsigned(callback,source.wrapperContained,message.wrapperContained); }
// public yarnwrap.text.Text getMessage(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.text.Text(wrapperContained.getMessage(context,name)); }
public yarnwrap.command.argument.MessageArgumentType message() { return new yarnwrap.command.argument.MessageArgumentType(wrapperContained.message()); }

}