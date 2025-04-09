package yarnwrap.server.command;
public class ClearCommand { public net.minecraft.server.command.ClearCommand wrapperContained; public ClearCommand(net.minecraft.server.command.ClearCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_SINGLE_EXCEPTION() { return wrapperContained.FAILED_SINGLE_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_MULTIPLE_EXCEPTION() { return wrapperContained.FAILED_MULTIPLE_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.util.function.Predicate item,int maxCount) { return wrapperContained.execute(source.wrapperContained,targets,item,maxCount); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.util.function.Predicate item) { return wrapperContained.execute(source.wrapperContained,targets,item); }

}