package yarnwrap.server.command;
public class ExperienceCommand { public net.minecraft.server.command.ExperienceCommand wrapperContained; public ExperienceCommand(net.minecraft.server.command.ExperienceCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_POINT_INVALID_EXCEPTION() { return wrapperContained.SET_POINT_INVALID_EXCEPTION; }
// public void SET_POINT_INVALID_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_POINT_INVALID_EXCEPTION = value; }
// public int executeAdd(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int amount,Object component) { return wrapperContained.executeAdd(source.wrapperContained,targets,amount,component); }
// public int method_13327(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13327(context); }
// public int executeQuery(yarnwrap.server.command.ServerCommandSource source,yarnwrap.server.network.ServerPlayerEntity player,Object component) { return wrapperContained.executeQuery(source.wrapperContained,player.wrapperContained,component); }
// public int method_13329(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13329(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int method_13331(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13331(context); }
// public int method_13332(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13332(context); }
// public int executeSet(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,int amount,Object component) { return wrapperContained.executeSet(source.wrapperContained,targets,amount,component); }
// public boolean method_13334(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13334(source.wrapperContained); }
// public boolean method_13335(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13335(source.wrapperContained); }
// public int method_13336(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13336(context); }
// public int method_13337(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13337(context); }
// public int method_13338(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13338(context); }
// public int method_13339(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13339(context); }

}