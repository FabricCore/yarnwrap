package yarnwrap.server.command;
public class AbstractServerCommandSource { public net.minecraft.server.command.AbstractServerCommandSource wrapperContained; public AbstractServerCommandSource(net.minecraft.server.command.AbstractServerCommandSource wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.server.command.AbstractServerCommandSource withReturnValueConsumer(yarnwrap.command.ReturnValueConsumer returnValueConsumer) { return new yarnwrap.server.command.AbstractServerCommandSource(wrapperContained.withReturnValueConsumer(returnValueConsumer.wrapperContained)); }
// public static yarnwrap.server.command.AbstractServerCommandSource withReturnValueConsumer(yarnwrap.command.ReturnValueConsumer returnValueConsumer, ) { return new yarnwrap.server.command.AbstractServerCommandSource(net.minecraft.server.command.AbstractServerCommandSource.withReturnValueConsumer(returnValueConsumer.wrapperContained)); }
public com.mojang.brigadier.CommandDispatcher getDispatcher() { return wrapperContained.getDispatcher(); }
// public static com.mojang.brigadier.CommandDispatcher getDispatcher() { return net.minecraft.server.command.AbstractServerCommandSource.getDispatcher(); }
public yarnwrap.server.command.AbstractServerCommandSource withDummyReturnValueConsumer() { return new yarnwrap.server.command.AbstractServerCommandSource(wrapperContained.withDummyReturnValueConsumer()); }
// public static yarnwrap.server.command.AbstractServerCommandSource withDummyReturnValueConsumer() { return new yarnwrap.server.command.AbstractServerCommandSource(net.minecraft.server.command.AbstractServerCommandSource.withDummyReturnValueConsumer()); }
// public void method_54316(com.mojang.brigadier.context.CommandContext context,boolean success,int result) { wrapperContained.method_54316(context,success,result); }
// public static void method_54316(com.mojang.brigadier.context.CommandContext context,boolean success,int result, ) { net.minecraft.server.command.AbstractServerCommandSource.method_54316(context,success,result); }
// public com.mojang.brigadier.ResultConsumer asResultConsumer() { return wrapperContained.asResultConsumer(); }
public static com.mojang.brigadier.ResultConsumer asResultConsumer() { return net.minecraft.server.command.AbstractServerCommandSource.asResultConsumer(); }
public void handleException(com.mojang.brigadier.exceptions.CommandExceptionType type,com.mojang.brigadier.Message message,boolean silent,yarnwrap.server.function.Tracer tracer) { wrapperContained.handleException(type,message,silent,tracer.wrapperContained); }
// public static void handleException(com.mojang.brigadier.exceptions.CommandExceptionType type,com.mojang.brigadier.Message message,boolean silent,yarnwrap.server.function.Tracer tracer, ) { net.minecraft.server.command.AbstractServerCommandSource.handleException(type,message,silent,tracer.wrapperContained); }
public void handleException(com.mojang.brigadier.exceptions.CommandSyntaxException exception,boolean silent,yarnwrap.server.function.Tracer tracer) { wrapperContained.handleException(exception,silent,tracer.wrapperContained); }
// public static void handleException(com.mojang.brigadier.exceptions.CommandSyntaxException exception,boolean silent,yarnwrap.server.function.Tracer tracer, ) { net.minecraft.server.command.AbstractServerCommandSource.handleException(exception,silent,tracer.wrapperContained); }
public yarnwrap.command.ReturnValueConsumer getReturnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.getReturnValueConsumer()); }
// public static yarnwrap.command.ReturnValueConsumer getReturnValueConsumer() { return new yarnwrap.command.ReturnValueConsumer(net.minecraft.server.command.AbstractServerCommandSource.getReturnValueConsumer()); }
public boolean isSilent() { return wrapperContained.isSilent(); }
// public static boolean isSilent() { return net.minecraft.server.command.AbstractServerCommandSource.isSilent(); }

}