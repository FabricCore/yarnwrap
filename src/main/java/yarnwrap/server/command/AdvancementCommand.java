package yarnwrap.server.command;
public class AdvancementCommand { public net.minecraft.server.command.AdvancementCommand wrapperContained; public AdvancementCommand(net.minecraft.server.command.AdvancementCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType GENERIC_EXCEPTION() { return wrapperContained.GENERIC_EXCEPTION; }
// public void GENERIC_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.GENERIC_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType CRITERION_NOT_FOUND_EXCEPTION() { return wrapperContained.CRITERION_NOT_FOUND_EXCEPTION; }
// public void CRITERION_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.CRITERION_NOT_FOUND_EXCEPTION = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeCriterion(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,Object operation,yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterion) { return wrapperContained.executeCriterion(source.wrapperContained,targets,operation,advancement.wrapperContained,criterion); }
// public int executeAdvancement(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,Object operation,java.util.Collection selection) { return wrapperContained.executeAdvancement(source.wrapperContained,targets,operation,selection); }
// public void addChildrenRecursivelyToList(yarnwrap.advancement.PlacedAdvancement parent,java.util.List childList) { wrapperContained.addChildrenRecursivelyToList(parent.wrapperContained,childList); }
// public java.util.List select(com.mojang.brigadier.context.CommandContext context,yarnwrap.advancement.AdvancementEntry advancement,Object selection) { return wrapperContained.select(context,advancement.wrapperContained,selection); }

}