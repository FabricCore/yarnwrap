package yarnwrap.server.command;
public class TagCommand { public net.minecraft.server.command.TagCommand wrapperContained; public TagCommand(net.minecraft.server.command.TagCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType ADD_FAILED_EXCEPTION() { return wrapperContained.ADD_FAILED_EXCEPTION; }
// public void ADD_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.ADD_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType REMOVE_FAILED_EXCEPTION() { return wrapperContained.REMOVE_FAILED_EXCEPTION; }
// public void REMOVE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.REMOVE_FAILED_EXCEPTION = value; }
// public int method_13697(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13697(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeRemove(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.lang.String tag) { return wrapperContained.executeRemove(source.wrapperContained,targets,tag); }
// public int executeList(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets) { return wrapperContained.executeList(source.wrapperContained,targets); }
// public java.util.concurrent.CompletableFuture method_13701(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13701(context,builder); }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.lang.String tag) { return wrapperContained.executeAdd(source.wrapperContained,targets,tag); }
// public int method_13703(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13703(context); }
// public int method_13704(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13704(context); }
// public boolean method_13705(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13705(source.wrapperContained); }
// public java.util.Collection getTags(java.util.Collection entities) { return wrapperContained.getTags(entities); }

}