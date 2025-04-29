package yarnwrap.command;
public class CommandSource { public net.minecraft.command.CommandSource wrapperContained; public CommandSource(net.minecraft.command.CommandSource wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Collection getBlockPositionSuggestions() { return wrapperContained.getBlockPositionSuggestions(); }
// public static java.util.Collection getBlockPositionSuggestions() { return net.minecraft.command.CommandSource.getBlockPositionSuggestions(); }
public java.util.Collection getPositionSuggestions() { return wrapperContained.getPositionSuggestions(); }
// public static java.util.Collection getPositionSuggestions() { return net.minecraft.command.CommandSource.getPositionSuggestions(); }
// public boolean shouldSuggest(java.lang.String remaining,java.lang.String candidate) { return wrapperContained.shouldSuggest(remaining,candidate); }
// public static boolean shouldSuggest(java.lang.String remaining,java.lang.String candidate, ) { return net.minecraft.command.CommandSource.shouldSuggest(remaining,candidate); }
public java.util.Set getWorldKeys() { return wrapperContained.getWorldKeys(); }
// public static java.util.Set getWorldKeys() { return net.minecraft.command.CommandSource.getWorldKeys(); }
public yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(wrapperContained.getRegistryManager()); }
// public static yarnwrap.registry.DynamicRegistryManager getRegistryManager() { return new yarnwrap.registry.DynamicRegistryManager(net.minecraft.command.CommandSource.getRegistryManager()); }
// public java.util.concurrent.CompletableFuture suggestMatching(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Function suggestionText,java.util.function.Function tooltip) { return wrapperContained.suggestMatching(candidates,builder,suggestionText,tooltip); }
// public static java.util.concurrent.CompletableFuture suggestMatching(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Function suggestionText,java.util.function.Function tooltip, ) { return net.minecraft.command.CommandSource.suggestMatching(candidates,builder,suggestionText,tooltip); }
// public java.util.concurrent.CompletableFuture suggestIdentifiers(java.util.stream.Stream candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.lang.String prefix) { return wrapperContained.suggestIdentifiers(candidates,builder,prefix); }
// public static java.util.concurrent.CompletableFuture suggestIdentifiers(java.util.stream.Stream candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.lang.String prefix, ) { return net.minecraft.command.CommandSource.suggestIdentifiers(candidates,builder,prefix); }
// public java.util.concurrent.CompletableFuture listIdSuggestions(yarnwrap.registry.RegistryKey registryRef,Object suggestedIdType,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,com.mojang.brigadier.context.CommandContext context) { return wrapperContained.listIdSuggestions(registryRef.wrapperContained,suggestedIdType,builder,context); }
// public static java.util.concurrent.CompletableFuture listIdSuggestions(yarnwrap.registry.RegistryKey registryRef,Object suggestedIdType,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.command.CommandSource.listIdSuggestions(registryRef.wrapperContained,suggestedIdType,builder,context); }
// public void suggestIdentifiers(yarnwrap.registry.Registry registry,Object suggestedIdType,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { wrapperContained.suggestIdentifiers(registry.wrapperContained,suggestedIdType,builder); }
// public static void suggestIdentifiers(yarnwrap.registry.Registry registry,Object suggestedIdType,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { net.minecraft.command.CommandSource.suggestIdentifiers(registry.wrapperContained,suggestedIdType,builder); }
public java.util.Collection getChatSuggestions() { return wrapperContained.getChatSuggestions(); }
// public static java.util.Collection getChatSuggestions() { return net.minecraft.command.CommandSource.getChatSuggestions(); }
public yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getEnabledFeatures()); }
// public static yarnwrap.resource.featuretoggle.FeatureSet getEnabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.command.CommandSource.getEnabledFeatures()); }
// public void forEachMatching(java.lang.Iterable candidates,java.lang.String remaining,java.lang.String prefix,java.util.function.Function identifier,java.util.function.Consumer action) { wrapperContained.forEachMatching(candidates,remaining,prefix,identifier,action); }
// public static void forEachMatching(java.lang.Iterable candidates,java.lang.String remaining,java.lang.String prefix,java.util.function.Function identifier,java.util.function.Consumer action, ) { net.minecraft.command.CommandSource.forEachMatching(candidates,remaining,prefix,identifier,action); }
// public yarnwrap.util.Identifier method_9251(yarnwrap.util.Identifier id) { return new yarnwrap.util.Identifier(wrapperContained.method_9251(id.wrapperContained)); }
// public static yarnwrap.util.Identifier method_9251(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.Identifier(net.minecraft.command.CommandSource.method_9251(id.wrapperContained)); }
// public java.util.concurrent.CompletableFuture suggestColumnPositions(java.lang.String remaining,java.util.Collection candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Predicate predicate) { return wrapperContained.suggestColumnPositions(remaining,candidates,builder,predicate); }
// public static java.util.concurrent.CompletableFuture suggestColumnPositions(java.lang.String remaining,java.util.Collection candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Predicate predicate, ) { return net.minecraft.command.CommandSource.suggestColumnPositions(remaining,candidates,builder,predicate); }
// public java.util.concurrent.CompletableFuture suggestMatching(java.lang.String[] candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestMatching(candidates,builder); }
// public static java.util.concurrent.CompletableFuture suggestMatching(java.lang.String[] candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.CommandSource.suggestMatching(candidates,builder); }
public java.util.stream.Stream getSoundIds() { return wrapperContained.getSoundIds(); }
// public static java.util.stream.Stream getSoundIds() { return net.minecraft.command.CommandSource.getSoundIds(); }
// public java.util.concurrent.CompletableFuture suggestFromIdentifier(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Function identifier,java.util.function.Function tooltip) { return wrapperContained.suggestFromIdentifier(candidates,builder,identifier,tooltip); }
// public static java.util.concurrent.CompletableFuture suggestFromIdentifier(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Function identifier,java.util.function.Function tooltip, ) { return net.minecraft.command.CommandSource.suggestFromIdentifier(candidates,builder,identifier,tooltip); }
// public void method_9256(com.mojang.brigadier.suggestion.SuggestionsBuilder object) { wrapperContained.method_9256(object); }
// public static void method_9256(com.mojang.brigadier.suggestion.SuggestionsBuilder object, ) { net.minecraft.command.CommandSource.method_9256(object); }
// public java.util.concurrent.CompletableFuture suggestIdentifiers(java.util.stream.Stream candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestIdentifiers(candidates,builder); }
// public static java.util.concurrent.CompletableFuture suggestIdentifiers(java.util.stream.Stream candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.CommandSource.suggestIdentifiers(candidates,builder); }
// public java.util.concurrent.CompletableFuture suggestIdentifiers(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.lang.String prefix) { return wrapperContained.suggestIdentifiers(candidates,builder,prefix); }
// public static java.util.concurrent.CompletableFuture suggestIdentifiers(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.lang.String prefix, ) { return net.minecraft.command.CommandSource.suggestIdentifiers(candidates,builder,prefix); }
public boolean hasPermissionLevel(int level) { return wrapperContained.hasPermissionLevel(level); }
// public static boolean hasPermissionLevel(int level, ) { return net.minecraft.command.CommandSource.hasPermissionLevel(level); }
// public java.util.concurrent.CompletableFuture suggestPositions(java.lang.String remaining,java.util.Collection candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Predicate predicate) { return wrapperContained.suggestPositions(remaining,candidates,builder,predicate); }
// public static java.util.concurrent.CompletableFuture suggestPositions(java.lang.String remaining,java.util.Collection candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Predicate predicate, ) { return net.minecraft.command.CommandSource.suggestPositions(remaining,candidates,builder,predicate); }
public java.util.concurrent.CompletableFuture getCompletions(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.getCompletions(context); }
// public static java.util.concurrent.CompletableFuture getCompletions(com.mojang.brigadier.context.CommandContext context, ) { return net.minecraft.command.CommandSource.getCompletions(context); }
public java.util.Collection getPlayerNames() { return wrapperContained.getPlayerNames(); }
// public static java.util.Collection getPlayerNames() { return net.minecraft.command.CommandSource.getPlayerNames(); }
// public yarnwrap.util.Identifier method_9263(yarnwrap.util.Identifier id) { return new yarnwrap.util.Identifier(wrapperContained.method_9263(id.wrapperContained)); }
// public static yarnwrap.util.Identifier method_9263(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.Identifier(net.minecraft.command.CommandSource.method_9263(id.wrapperContained)); }
// public java.util.concurrent.CompletableFuture suggestMatching(java.util.stream.Stream candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestMatching(candidates,builder); }
// public static java.util.concurrent.CompletableFuture suggestMatching(java.util.stream.Stream candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.CommandSource.suggestMatching(candidates,builder); }
// public java.util.concurrent.CompletableFuture suggestMatching(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestMatching(candidates,builder); }
// public static java.util.concurrent.CompletableFuture suggestMatching(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.CommandSource.suggestMatching(candidates,builder); }
// public void method_9266(com.mojang.brigadier.suggestion.SuggestionsBuilder id) { wrapperContained.method_9266(id); }
// public static void method_9266(com.mojang.brigadier.suggestion.SuggestionsBuilder id, ) { net.minecraft.command.CommandSource.method_9266(id); }
public java.util.Collection getTeamNames() { return wrapperContained.getTeamNames(); }
// public static java.util.Collection getTeamNames() { return net.minecraft.command.CommandSource.getTeamNames(); }
// public void forEachMatching(java.lang.Iterable candidates,java.lang.String remaining,java.util.function.Function identifier,java.util.function.Consumer action) { wrapperContained.forEachMatching(candidates,remaining,identifier,action); }
// public static void forEachMatching(java.lang.Iterable candidates,java.lang.String remaining,java.util.function.Function identifier,java.util.function.Consumer action, ) { net.minecraft.command.CommandSource.forEachMatching(candidates,remaining,identifier,action); }
public java.util.Collection getEntitySuggestions() { return wrapperContained.getEntitySuggestions(); }
// public static java.util.Collection getEntitySuggestions() { return net.minecraft.command.CommandSource.getEntitySuggestions(); }
// public java.util.concurrent.CompletableFuture suggestIdentifiers(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestIdentifiers(candidates,builder); }
// public static java.util.concurrent.CompletableFuture suggestIdentifiers(java.lang.Iterable candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.CommandSource.suggestIdentifiers(candidates,builder); }
// public java.util.concurrent.CompletableFuture suggestFromIdentifier(java.util.stream.Stream candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Function identifier,java.util.function.Function tooltip) { return wrapperContained.suggestFromIdentifier(candidates,builder,identifier,tooltip); }
// public static java.util.concurrent.CompletableFuture suggestFromIdentifier(java.util.stream.Stream candidates,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.util.function.Function identifier,java.util.function.Function tooltip, ) { return net.minecraft.command.CommandSource.suggestFromIdentifier(candidates,builder,identifier,tooltip); }
// public boolean method_9272(java.lang.String candidate) { return wrapperContained.method_9272(candidate); }
// public static boolean method_9272(java.lang.String candidate, ) { return net.minecraft.command.CommandSource.method_9272(candidate); }
public java.util.stream.Stream getRecipeIds() { return wrapperContained.getRecipeIds(); }
// public static java.util.stream.Stream getRecipeIds() { return net.minecraft.command.CommandSource.getRecipeIds(); }
// public void method_9275(com.mojang.brigadier.suggestion.SuggestionsBuilder id) { wrapperContained.method_9275(id); }
// public static void method_9275(com.mojang.brigadier.suggestion.SuggestionsBuilder id, ) { net.minecraft.command.CommandSource.method_9275(id); }

}