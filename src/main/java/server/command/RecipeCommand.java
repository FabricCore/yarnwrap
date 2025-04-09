package yarnwrap.server.command;
public class RecipeCommand { public net.minecraft.server.command.RecipeCommand wrapperContained; public RecipeCommand(net.minecraft.server.command.RecipeCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType GIVE_FAILED_EXCEPTION() { return wrapperContained.GIVE_FAILED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TAKE_FAILED_EXCEPTION() { return wrapperContained.TAKE_FAILED_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeTake(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.util.Collection recipes) { return wrapperContained.executeTake(source.wrapperContained,targets,recipes); }
// public int executeGive(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.util.Collection recipes) { return wrapperContained.executeGive(source.wrapperContained,targets,recipes); }

}