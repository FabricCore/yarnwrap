package yarnwrap.server.command;
public class AbstractServerCommandSource { public net.minecraft.server.command.AbstractServerCommandSource wrapperContained; public AbstractServerCommandSource(net.minecraft.server.command.AbstractServerCommandSource wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.server.command.AbstractServerCommandSource withReturnValueConsumer(yarnwrap.command.ReturnValueConsumer returnValueConsumer) { return new yarnwrap.server.command.AbstractServerCommandSource(wrapperContained.withReturnValueConsumer(returnValueConsumer.wrapperContained)); }
public com.mojang.brigadier.CommandDispatcher getDispatcher() { return wrapperContained.getDispatcher(); }
public yarnwrap.server.command.AbstractServerCommandSource withDummyReturnValueConsumer() { return new yarnwrap.server.command.AbstractServerCommandSource(wrapperContained.withDummyReturnValueConsumer()); }
// public com.mojang.brigadier.ResultConsumer asResultConsumer() { return wrapperContained.asResultConsumer(); }
public void handleException(com.mojang.brigadier.exceptions.CommandExceptionType type,com.mojang.brigadier.Message message,boolean silent,yarnwrap.server.function.Tracer tracer) { wrapperContained.handleException(type,message,silent,tracer.wrapperContained); }
public void handleException(com.mojang.brigadier.exceptions.CommandSyntaxException exception,boolean silent,yarnwrap.server.function.Tracer tracer) { wrapperContained.handleException(exception,silent,tracer.wrapperContained); }
public yarnwrap.command.ReturnValueConsumer getReturnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.getReturnValueConsumer()); }
public boolean isSilent() { return wrapperContained.isSilent(); }
public boolean hasPermissionLevel(int level) { return wrapperContained.hasPermissionLevel(level); }

}