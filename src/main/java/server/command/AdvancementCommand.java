package yarnwrap.server.command;
public class AdvancementCommand { public net.minecraft.server.command.AdvancementCommand wrapperContained; public AdvancementCommand(net.minecraft.server.command.AdvancementCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType GENERIC_EXCEPTION() { return wrapperContained.GENERIC_EXCEPTION; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType CRITERION_NOT_FOUND_EXCEPTION() { return wrapperContained.CRITERION_NOT_FOUND_EXCEPTION; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeCriterion(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,Object operation,yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterion) { return wrapperContained.executeCriterion(source.wrapperContained,targets,operation,advancement.wrapperContained,criterion); }
// public int executeAdvancement(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,Object operation,java.util.Collection selection) { return wrapperContained.executeAdvancement(source.wrapperContained,targets,operation,selection); }
// public void addChildrenRecursivelyToList(yarnwrap.advancement.PlacedAdvancement parent,java.util.List childList) { wrapperContained.addChildrenRecursivelyToList(parent.wrapperContained,childList); }
// public java.util.List select(com.mojang.brigadier.context.CommandContext context,yarnwrap.advancement.AdvancementEntry advancement,Object selection) { return wrapperContained.select(context,advancement.wrapperContained,selection); }

}