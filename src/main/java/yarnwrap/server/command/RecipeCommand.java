package yarnwrap.server.command;
public class RecipeCommand { public net.minecraft.server.command.RecipeCommand wrapperContained; public RecipeCommand(net.minecraft.server.command.RecipeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType GIVE_FAILED_EXCEPTION() { return wrapperContained.GIVE_FAILED_EXCEPTION; }
// public void GIVE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.GIVE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TAKE_FAILED_EXCEPTION() { return wrapperContained.TAKE_FAILED_EXCEPTION; }
// public void TAKE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TAKE_FAILED_EXCEPTION = value; }
// public int method_13515(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13515(context); }
// public int method_13516(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13516(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeTake(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.util.Collection recipes) { return wrapperContained.executeTake(source.wrapperContained,targets,recipes); }
// public int method_13519(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13519(context); }
// public int executeGive(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.util.Collection recipes) { return wrapperContained.executeGive(source.wrapperContained,targets,recipes); }
// public int method_13521(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13521(context); }
// public boolean method_13522(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13522(source.wrapperContained); }

}