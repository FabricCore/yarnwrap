package yarnwrap.server.command;
public class ClearCommand { public net.minecraft.server.command.ClearCommand wrapperContained; public ClearCommand(net.minecraft.server.command.ClearCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_SINGLE_EXCEPTION() { return wrapperContained.FAILED_SINGLE_EXCEPTION; }
// public void FAILED_SINGLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILED_SINGLE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType FAILED_MULTIPLE_EXCEPTION() { return wrapperContained.FAILED_MULTIPLE_EXCEPTION; }
// public void FAILED_MULTIPLE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.FAILED_MULTIPLE_EXCEPTION = value; }
// public int method_13073(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13073(context); }
// public int method_13074(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13074(context); }
// public com.mojang.brigadier.Message method_13075(java.lang.Object playerName) { return wrapperContained.method_13075(playerName); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { wrapperContained.register(dispatcher,commandRegistryAccess.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.util.function.Predicate item,int maxCount) { return wrapperContained.execute(source.wrapperContained,targets,item,maxCount); }
// public int method_13078(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13078(context); }
// public com.mojang.brigadier.Message method_13079(java.lang.Object playerCount) { return wrapperContained.method_13079(playerCount); }
// public int method_13080(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13080(context); }
// public boolean method_13081(yarnwrap.item.ItemStack stack) { return wrapperContained.method_13081(stack.wrapperContained); }
// public boolean method_13082(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13082(source.wrapperContained); }
// public boolean method_13083(yarnwrap.item.ItemStack stack) { return wrapperContained.method_13083(stack.wrapperContained); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,java.util.function.Predicate item) { return wrapperContained.execute(source.wrapperContained,targets,item); }

}