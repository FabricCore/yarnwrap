package yarnwrap.server.command;
public class CommandManager { public net.minecraft.server.command.CommandManager wrapperContained; public CommandManager(net.minecraft.server.command.CommandManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.ThreadLocal CURRENT_CONTEXT() { return wrapperContained.CURRENT_CONTEXT; }
// public void CURRENT_CONTEXT(java.lang.ThreadLocal value) { wrapperContained.CURRENT_CONTEXT = value; }
// public com.mojang.brigadier.CommandDispatcher dispatcher() { return wrapperContained.dispatcher; }
// public void dispatcher(com.mojang.brigadier.CommandDispatcher value) { wrapperContained.dispatcher = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public CommandManager(Object environment,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { this.wrapperContained = new net.minecraft.server.command.CommandManager(environment,commandRegistryAccess.wrapperContained); }
public com.mojang.brigadier.exceptions.CommandSyntaxException getException(com.mojang.brigadier.ParseResults parse) { return wrapperContained.getException(parse); }
// public java.lang.String method_30851(com.mojang.brigadier.arguments.ArgumentType type) { return wrapperContained.method_30851(type); }
public void checkMissing() { wrapperContained.checkMissing(); }
// public boolean method_30853(com.mojang.brigadier.arguments.ArgumentType type) { return wrapperContained.method_30853(type); }
// public void method_41710(com.mojang.brigadier.CommandDispatcher parent,com.mojang.brigadier.tree.CommandNode child,com.mojang.brigadier.tree.CommandNode sibling,com.mojang.brigadier.tree.CommandNode inputs) { wrapperContained.method_41710(parent,child,sibling,inputs); }
public void executeWithPrefix(yarnwrap.server.command.ServerCommandSource source,java.lang.String command) { wrapperContained.executeWithPrefix(source.wrapperContained,command); }
public com.mojang.brigadier.ParseResults withCommandSource(com.mojang.brigadier.ParseResults parseResults,java.util.function.UnaryOperator sourceMapper) { return wrapperContained.withCommandSource(parseResults,sourceMapper); }
// public yarnwrap.command.CommandRegistryAccess createRegistryAccess(Object registryLookup) { return new yarnwrap.command.CommandRegistryAccess(wrapperContained.createRegistryAccess(registryLookup)); }
// public void throwException(com.mojang.brigadier.ParseResults parse) { wrapperContained.throwException(parse); }
public void callWithContext(yarnwrap.server.command.ServerCommandSource commandSource,java.util.function.Consumer callback) { wrapperContained.callWithContext(commandSource.wrapperContained,callback); }
// public void method_54314(java.lang.String context) { wrapperContained.method_54314(context); }
// public com.mojang.brigadier.context.ContextChain checkCommand(com.mojang.brigadier.ParseResults parseResults,java.lang.String command,yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.checkCommand(parseResults,command,source.wrapperContained); }
// public yarnwrap.text.Style method_54493(java.lang.String style) { return new yarnwrap.text.Style(wrapperContained.method_54493(style)); }
public com.mojang.brigadier.CommandDispatcher getDispatcher() { return wrapperContained.getDispatcher(); }
// public java.util.function.Predicate getCommandValidator(Object parser) { return wrapperContained.getCommandValidator(parser); }
// public void makeTreeForSource(com.mojang.brigadier.tree.CommandNode tree,com.mojang.brigadier.tree.CommandNode result,yarnwrap.server.command.ServerCommandSource source,java.util.Map resultNodes) { wrapperContained.makeTreeForSource(tree,result,source.wrapperContained,resultNodes); }
// public boolean method_9240(Object string) { return wrapperContained.method_9240(string); }
public void sendCommandTree(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.sendCommandTree(player.wrapperContained); }
// public yarnwrap.text.Style method_9242(yarnwrap.text.MutableText style) { return new yarnwrap.text.Style(wrapperContained.method_9242(style.wrapperContained)); }
public com.mojang.brigadier.builder.RequiredArgumentBuilder argument(java.lang.String name,com.mojang.brigadier.arguments.ArgumentType type) { return wrapperContained.argument(name,type); }
// public boolean method_9245(yarnwrap.command.CommandSource sourcex) { return wrapperContained.method_9245(sourcex.wrapperContained); }
// public int method_9246(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_9246(context); }
public com.mojang.brigadier.builder.LiteralArgumentBuilder literal(java.lang.String literal) { return wrapperContained.literal(literal); }
public void execute(com.mojang.brigadier.ParseResults parseResults,java.lang.String command) { wrapperContained.execute(parseResults,command); }

}