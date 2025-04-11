package yarnwrap.server.command;
public class AdvancementCommand { public net.minecraft.server.command.AdvancementCommand wrapperContained; public AdvancementCommand(net.minecraft.server.command.AdvancementCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType GENERIC_EXCEPTION() { return wrapperContained.GENERIC_EXCEPTION; }
// public void GENERIC_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.GENERIC_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType CRITERION_NOT_FOUND_EXCEPTION() { return wrapperContained.CRITERION_NOT_FOUND_EXCEPTION; }
// public void CRITERION_NOT_FOUND_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.CRITERION_NOT_FOUND_EXCEPTION = value; }
// public int method_12978(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12978(context); }
// public int method_12979(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12979(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeCriterion(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,Object operation,yarnwrap.advancement.AdvancementEntry advancement,java.lang.String criterion) { return wrapperContained.executeCriterion(source.wrapperContained,targets,operation,advancement.wrapperContained,criterion); }
// public int method_12982(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12982(context); }
// public int method_12983(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12983(context); }
// public boolean method_12984(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_12984(source.wrapperContained); }
// public int method_12985(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12985(context); }
// public int method_12986(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12986(context); }
// public java.util.concurrent.CompletableFuture method_12987(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_12987(context,builder); }
// public int executeAdvancement(yarnwrap.server.command.ServerCommandSource source,java.util.Collection targets,Object operation,java.util.Collection selection) { return wrapperContained.executeAdvancement(source.wrapperContained,targets,operation,selection); }
// public int method_12989(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12989(context); }
// public void addChildrenRecursivelyToList(yarnwrap.advancement.PlacedAdvancement parent,java.util.List childList) { wrapperContained.addChildrenRecursivelyToList(parent.wrapperContained,childList); }
// public java.util.concurrent.CompletableFuture method_12991(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_12991(context,builder); }
// public java.util.concurrent.CompletableFuture method_12992(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_12992(context,builder); }
// public int method_12993(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12993(context); }
// public int method_12994(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12994(context); }
// public int method_12995(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12995(context); }
// public java.util.List select(com.mojang.brigadier.context.CommandContext context,yarnwrap.advancement.AdvancementEntry advancement,Object selection) { return wrapperContained.select(context,advancement.wrapperContained,selection); }
// public int method_12997(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12997(context); }
// public int method_12998(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_12998(context); }
// public com.mojang.brigadier.Message method_54923(java.lang.Object message) { return wrapperContained.method_54923(message); }
// public com.mojang.brigadier.Message method_54924(java.lang.Object advancement,java.lang.Object criterion) { return wrapperContained.method_54924(advancement,criterion); }

}