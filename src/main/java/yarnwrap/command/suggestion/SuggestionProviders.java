package yarnwrap.command.suggestion;
public class SuggestionProviders { public net.minecraft.command.suggestion.SuggestionProviders wrapperContained; public SuggestionProviders(net.minecraft.command.suggestion.SuggestionProviders wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map REGISTRY() { return wrapperContained.REGISTRY; }
// public void REGISTRY(java.util.Map value) { wrapperContained.REGISTRY = value; }
// public static java.util.Map REGISTRY() { return net.minecraft.command.suggestion.SuggestionProviders.REGISTRY; }
// public static void REGISTRY(java.util.Map value, ) { net.minecraft.command.suggestion.SuggestionProviders.REGISTRY = value; }

// public com.mojang.brigadier.suggestion.SuggestionProvider ASK_SERVER() { return wrapperContained.ASK_SERVER; }
// public void ASK_SERVER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.ASK_SERVER = value; }
public static com.mojang.brigadier.suggestion.SuggestionProvider ASK_SERVER() { return net.minecraft.command.suggestion.SuggestionProviders.ASK_SERVER; }
// public static void ASK_SERVER(com.mojang.brigadier.suggestion.SuggestionProvider value, ) { net.minecraft.command.suggestion.SuggestionProviders.ASK_SERVER = value; }

// public com.mojang.brigadier.suggestion.SuggestionProvider AVAILABLE_SOUNDS() { return wrapperContained.AVAILABLE_SOUNDS; }
// public void AVAILABLE_SOUNDS(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.AVAILABLE_SOUNDS = value; }
public static com.mojang.brigadier.suggestion.SuggestionProvider AVAILABLE_SOUNDS() { return net.minecraft.command.suggestion.SuggestionProviders.AVAILABLE_SOUNDS; }
// public static void AVAILABLE_SOUNDS(com.mojang.brigadier.suggestion.SuggestionProvider value, ) { net.minecraft.command.suggestion.SuggestionProviders.AVAILABLE_SOUNDS = value; }

// public com.mojang.brigadier.suggestion.SuggestionProvider SUMMONABLE_ENTITIES() { return wrapperContained.SUMMONABLE_ENTITIES; }
// public void SUMMONABLE_ENTITIES(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUMMONABLE_ENTITIES = value; }
public static com.mojang.brigadier.suggestion.SuggestionProvider SUMMONABLE_ENTITIES() { return net.minecraft.command.suggestion.SuggestionProviders.SUMMONABLE_ENTITIES; }
// public static void SUMMONABLE_ENTITIES(com.mojang.brigadier.suggestion.SuggestionProvider value, ) { net.minecraft.command.suggestion.SuggestionProviders.SUMMONABLE_ENTITIES = value; }

// public yarnwrap.util.Identifier ASK_SERVER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ASK_SERVER_ID); }
// public void ASK_SERVER_ID(yarnwrap.util.Identifier value) { wrapperContained.ASK_SERVER_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier ASK_SERVER_ID() { return new yarnwrap.util.Identifier(net.minecraft.command.suggestion.SuggestionProviders.ASK_SERVER_ID); }
// public static void ASK_SERVER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.command.suggestion.SuggestionProviders.ASK_SERVER_ID = value.wrapperContained; }

// public com.mojang.brigadier.suggestion.SuggestionProvider register(yarnwrap.util.Identifier id,com.mojang.brigadier.suggestion.SuggestionProvider provider) { return wrapperContained.register(id.wrapperContained,provider); }
// public static com.mojang.brigadier.suggestion.SuggestionProvider register(yarnwrap.util.Identifier id,com.mojang.brigadier.suggestion.SuggestionProvider provider, ) { return net.minecraft.command.suggestion.SuggestionProviders.register(id.wrapperContained,provider); }
// public com.mojang.brigadier.suggestion.SuggestionProvider byId(yarnwrap.util.Identifier id) { return wrapperContained.byId(id.wrapperContained); }
// public static com.mojang.brigadier.suggestion.SuggestionProvider byId(yarnwrap.util.Identifier id, ) { return net.minecraft.command.suggestion.SuggestionProviders.byId(id.wrapperContained); }
// public yarnwrap.util.Identifier computeId(com.mojang.brigadier.suggestion.SuggestionProvider provider) { return new yarnwrap.util.Identifier(wrapperContained.computeId(provider)); }
// public static yarnwrap.util.Identifier computeId(com.mojang.brigadier.suggestion.SuggestionProvider provider, ) { return new yarnwrap.util.Identifier(net.minecraft.command.suggestion.SuggestionProviders.computeId(provider)); }
// public java.util.concurrent.CompletableFuture method_10028(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_10028(context,builder); }
// public static java.util.concurrent.CompletableFuture method_10028(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.suggestion.SuggestionProviders.method_10028(context,builder); }
// public java.util.concurrent.CompletableFuture method_10029(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_10029(context,builder); }
// public static java.util.concurrent.CompletableFuture method_10029(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.suggestion.SuggestionProviders.method_10029(context,builder); }
// public boolean method_45916(com.mojang.brigadier.context.CommandContext entityType) { return wrapperContained.method_45916(entityType); }
// public static boolean method_45916(com.mojang.brigadier.context.CommandContext entityType, ) { return net.minecraft.command.suggestion.SuggestionProviders.method_45916(entityType); }
// public java.util.concurrent.CompletableFuture method_64921(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_64921(context,builder); }
// public static java.util.concurrent.CompletableFuture method_64921(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.suggestion.SuggestionProviders.method_64921(context,builder); }
// public com.mojang.brigadier.suggestion.SuggestionProvider cast(com.mojang.brigadier.suggestion.SuggestionProvider suggestionProvider) { return wrapperContained.cast(suggestionProvider); }
// public static com.mojang.brigadier.suggestion.SuggestionProvider cast(com.mojang.brigadier.suggestion.SuggestionProvider suggestionProvider, ) { return net.minecraft.command.suggestion.SuggestionProviders.cast(suggestionProvider); }

}